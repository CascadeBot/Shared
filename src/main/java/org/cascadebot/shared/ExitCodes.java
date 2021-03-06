/*
 * Copyright (c) 2019 CascadeBot. All rights reserved.
 * Licensed under the MIT license.
 */

package org.cascadebot.shared;

public final class ExitCodes {

    public static final int STOP_WRAPPER = 19;
    public static final int STOP = 20;
    public static final int UPDATE = 21;
    public static final int RESTART = 22;
    public static final int ERROR_STOP_NO_RESTART = 23; // Don't restart on stop (Config errors, multiple login failures etc)
    public static final int ERROR_STOP_RESTART = 24; // Recoverable error (Restart after stop)
    public static final int STOPPED_BY_WRAPPER = 25;

}
