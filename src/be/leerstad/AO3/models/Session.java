package be.leerstad.AO3.models;

public class Session {
    private String sessionId;
    private Logfile logFile;
    private IPAddress ipAddress;
    private Datetime sessiontTime;
    private int totalTime;
    private int transferredBytes;
    private int numberOfRequests;
    private User user;
    private Site site;

}
