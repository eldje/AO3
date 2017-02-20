package be.leerstad.AO3.models;

import java.sql.Time;

public class Visit {
    private String visitId;
    private Logfile logfile;
    private String ipaddress;
    private Time visitTime;
    private int totalTime;
    private int transferredBytes;
    private int numberOfRequests;
    private User user;
    private SiteApplication siteApplication;
    private String ipSchool;
}
