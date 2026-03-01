import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class Event {
    String name;
    LocalDate date;

    Event(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}

class EventDateProcessing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String dateStr = sc.next();
            LocalDate date = LocalDate.parse(dateStr);
            events.add(new Event(name, date));
        }

        int month = sc.nextInt();
        List<Event> sortedEvents = events.stream()
                .sorted(Comparator.comparing(Event::getDate))
                .collect(Collectors.toList());

        sortedEvents.forEach(e -> System.out.print(e.getName() + " "));
        System.out.println();
        Event earliest = sortedEvents.stream()
                .min(Comparator.comparing(Event::getDate))
                .get();
        System.out.println(earliest.getName());
        Event latest = sortedEvents.stream()
                .max(Comparator.comparing(Event::getDate))
                .get();
        System.out.println(latest.getName());
        events.stream()
                .filter(e -> e.getDate().getMonthValue() == month)
                .forEach(e -> System.out.print(e.getName() + " "));

        sc.close();
    }
}
