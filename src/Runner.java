public class Runner
{
    public static void main(String[] args)
    {
        TimeInterval one = new TimeInterval(8,11);
        TimeInterval two = new TimeInterval(12,13);

        Appointment appt1 = new Appointment(one);
        Appointment appt2 = new Appointment(two);

        System.out.println(appt1.conflictsWith(appt2));

        DailySchedule Calendar = new DailySchedule();

        System.out.println(Calendar.addAppt(appt1,false));
        System.out.println(Calendar.addAppt(appt2,false));
    }
}
