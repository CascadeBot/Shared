package com.cascadebot.shared;

public final class ExitCodes {

    public static int STOP = 20;
    public static int FORCE_STOP = 21; // Not sure if this would be applicable, kill all threads and exit?
    public static int UPDATE = 22;
    public static int ERROR_STOP_NO_RESTART = 23; // Don't restart on stop (Config errors, multiple login failures etc)
    public static int ERROR_STOP_RESTART = 24; // Recoverable error (Restart after stop)

}
