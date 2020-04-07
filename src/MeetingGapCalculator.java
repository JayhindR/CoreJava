import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class MeetingGapCalculator {
	private static final String HYPHEN = "-";
	private static final String COLON = ":";
	private static final String SPACE = " ";

	private static BiFunction<String, String[], Meeting> createMeeting = (day, times) -> {
		LocalDate date = getLocalDate(day);
		LocalDateTime startTime = calculateLocaDateTime(times, date, 0);
		LocalDateTime endTime = calculateLocaDateTime(times, date, 1);
		return new Meeting(day, startTime, endTime);
	};

	private static BiFunction<LocalDateTime, LocalDateTime, Long> timeGap = (end, start) -> {
		LocalDateTime from = LocalDateTime.from(end);
		long minutes = from.until(start, ChronoUnit.MINUTES);
		return minutes;
	};

	private static BiFunction<Meeting, Meeting, Long> meetingTimeGap = (previous, next) -> {
		return timeGap.apply(previous.getEnd(), next.getStart());
	};

	public static List<Meeting> parseStringToMeeting(String str) {
		List<Meeting> list = new ArrayList<Meeting>();
		if (null != str && !"".equals(str)) {
			String[] meetingStr = str.split("\\n");
			for (String meeting : meetingStr) {
				String[] meetingStr1 = meeting.split(SPACE);
				String day = meetingStr1[0];
				String times[] = meetingStr1[1].split(HYPHEN);
				list.add(createMeeting.apply(day, times));
			}
			System.out.println("Meeting size : " + list.size());
		}

		list = list.stream().sorted((m1, m2) -> {
			return m1.getStart().compareTo(m2.getStart());
		}).collect(Collectors.toList());
		System.out.println("Meetings : " + list);
		return list;

	}

	private static LocalDateTime calculateLocaDateTime(String[] times, LocalDate date, int index) {
		int endTimeHour = Integer.parseInt(times[index].split(COLON)[0]);
		int endTimeMinute = Integer.parseInt(times[index].split(COLON)[1]);
		LocalTime endTime = LocalTime.of(endTimeHour, endTimeMinute);
		LocalDateTime end = LocalDateTime.of(date, endTime);
		return end;
	}

	public static void printMeetingGapsTiming(List<Meeting> meetings) {
		int index = 1;
		long maxTimeGap = 0;
		int requiredIndex = -1;
		for (; index < meetings.size(); index++) {
			Meeting m1 = meetings.get(index - 1);
			Meeting m2 = meetings.get(index);
			long timeGap = meetingTimeGap.apply(m1, m2);
			if (timeGap > maxTimeGap) {
				maxTimeGap = timeGap;
				requiredIndex = index;
			}
		}

		System.out.println("Max Gap between meetings (" + meetings.get(requiredIndex - 1) + " and "
				+ meetings.get(requiredIndex) + ") is: " + maxTimeGap);
	}

	public static LocalDate getLocalDate(String day) {
		LocalDate now = LocalDate.now();
		String lowerCase = day.toLowerCase();

		if (lowerCase.endsWith("sun")) {
			now = now.with(DayOfWeek.SUNDAY);
		} else if (lowerCase.endsWith("mon")) {
			now = now.with(DayOfWeek.MONDAY);
		} else if (lowerCase.endsWith("tue")) {
			now = now.with(DayOfWeek.TUESDAY);
		} else if (lowerCase.endsWith("wed")) {
			now = now.with(DayOfWeek.WEDNESDAY);
		} else if (lowerCase.endsWith("thu")) {
			now = now.with(DayOfWeek.THURSDAY);
		} else if (lowerCase.endsWith("fri")) {
			now = now.with(DayOfWeek.FRIDAY);
		} else if (lowerCase.endsWith("sat")) {
			now = now.with(DayOfWeek.SATURDAY);
		}
		return now;
	}
	
	public static void main(String[] args) {
		String str = "Sun 10:00-20:00\nFri 05:00-10:00\nTue 16:30-23:50\nTue 10:15-13:55\nThu 08:25-11:20";
		List<Meeting> meetings = parseStringToMeeting(str);
		printMeetingGapsTiming(meetings);
	}
}

class Meeting {
	private String day;
	private LocalDateTime start;
	private LocalDateTime end;

	public Meeting(String day, LocalDateTime start, LocalDateTime end) {
		this.start = start;
		this.end = end;
		this.day = day;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Meeting [day=" + day + ", start=" + start + ", end=" + end + "]";
	}
}
