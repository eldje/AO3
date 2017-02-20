package be.leerstad.AO3.models;

import java.sql.Time;

public class Session {
    private String sessionId;
    private Logfile logFile;
    private String ipAddress;
    private Time sessiontTime;
    private int totalTime;
    private int transferredBytes;
    private int numberOfRequests;
    private User user;
    private Site site;

}
