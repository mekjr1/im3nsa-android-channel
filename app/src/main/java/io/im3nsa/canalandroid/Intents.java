/*
 * RapidPro Android Channel - Relay SMS messages where MNO connections aren't practical.
 * Copyright (C) 2014 Nyaruka, UNICEF
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.im3nsa.canalandroid;

public interface Intents {
    public static final String START_SYNC = "io.im3nsa.canalandroid.StartSync";

    public static final String SHOW_SETTINGS = "io.im3nsa.canalandroid.ShowSettings";
    public static final String RUN_LOCAL_COMMANDS = "io.im3nsa.canalandroid.RunLocalCommands";
    public static final String PING_FCM = "io.im3nsa.canalandroid..PingFCM";

    public static final String UPDATE_COUNTS = "io.im3nsa.canalandroid.UpdateCounts";
    public static final String UPDATE_STATUS = "io.im3nsa.canalandroid.UpdateStatus";
    public static final String UPDATE_RELAYER_STATE = "io.im3nsa.canalandroid.UpdateRelayerState";
    public static final String CLAIM_CODE_EXTRA = "claimCode";
    public static final String STATUS_EXTRA = "status";
    public static final String CLAIMED_EXTRA = "claimed";

    public static final String SHOW_MESSAGES = "io.im3nsa.canalandroid.ShowMessages";
    public static final String STATUS_ID_EXTRA = "statusId";

    public static final String SENT_EXTRA = "sent";
    public static final String CAPACITY_EXTRA = "capacity";
    public static final String OUTGOING_EXTRA = "outgoing";
    public static final String INCOMING_EXTRA = "incoming";
    public static final String RETRY_EXTRA = "retry";
    public static final String SYNC_EXTRA = "sync";
    public static final String FORCE_EXTRA = "force";
    public static final String TICKLE_AIRPLANE = "airplane";
    public static final String CONNECTION_UP_EXTRA = "connectionUp";
    public static final String LAST_SMS_SENT = "lastSmsSent";
    public static final String LAST_SMS_RECEIVED = "lastSmsReceived";
    public static final String SYNC_TIME = "syncTime";
    public static final String IS_PAUSED = "rapidproApplicationPaused";
}
