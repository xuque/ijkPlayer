package tv.danmaku.ijk.media.example.log;


import android.util.Log;

import static tv.danmaku.ijk.media.example.log.IjkPlayerConstant.IjkPlayerLogLevel.*;

public class IjkPlayerLog {
    private static volatile IjkPlayerLog instance;
    private static Object syncLock = new Object();

    public static IjkPlayerLog instance() {
        if (instance == null) {
            synchronized (syncLock) {
                if (instance == null) {
                    instance = new IjkPlayerLog();
                }
            }
        }
        return instance;
    }

    public IjkPlayerLog() {

    }

    public static final class IjkLogModule {
        public static final int IJKLOG_MODULE_UNKNOWN = 0;
        public static final int IJKLOG_MODULE_PLATFORM = 100;
        public static final int IJKLOG_MODULE_AUDIO = 101;
        public static final int IJKLOG_MODULE_VIDEO = 102;
        public static final int IJKLOG_MODULE_TRANS = 103;
    }

    public static final String kLogTagVideoView = "videoView";


    private static int logLevel = IJKPLAYER_LOG_LEVEL_TRACE;

    public static void setLogLevel(int level) {
        logLevel = level;
    }

    public static void i(String tag, String text) {
        logM(IJKPLAYER_LOG_LEVEL_INFO, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, text);
    }

    public static void i(String tag, String format, Object... args) {
        logM(IJKPLAYER_LOG_LEVEL_INFO, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, format, args);
    }

    public static void e(String tag, String text) {
        logM(IJKPLAYER_LOG_LEVEL_ERROR, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, text);
    }

    public static void e(String tag, String format, Object... args) {
        logM(IJKPLAYER_LOG_LEVEL_ERROR, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, format, args);
    }


    public static void trace(String tag, String format, Object... args) {
        logM(IJKPLAYER_LOG_LEVEL_TRACE, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, format, args);
    }

    public static void trace(String tag, String text) {
        logM(IJKPLAYER_LOG_LEVEL_TRACE, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, text);
    }

    public static void debug(String tag, String format, Object... args) {
        logM(IJKPLAYER_LOG_LEVEL_DEBUG, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, format, args);
    }

    public static void debug(String tag, String text) {
        logM(IJKPLAYER_LOG_LEVEL_DEBUG, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, text);
    }

    public static void info(String tag, String format, Object... args) {
        logM(IJKPLAYER_LOG_LEVEL_INFO, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, format, args);
    }

    public static void info(String tag, String text) {
        logM(IJKPLAYER_LOG_LEVEL_INFO, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, text);
    }

    public static void warn(String tag, String format, Object... args) {
        logM(IJKPLAYER_LOG_LEVEL_WARN, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, format, args);
    }

    public static void warn(String tag, String text) {
        logM(IJKPLAYER_LOG_LEVEL_WARN, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, text);
    }

    public static void error(String tag, String format, Object... args) {
        logM(IJKPLAYER_LOG_LEVEL_ERROR, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, format, args);
    }

    public static void error(String tag, String text) {
        logM(IJKPLAYER_LOG_LEVEL_ERROR, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, text);
    }

    public static void release(String tag, String format, Object... args) {
        logM(IJKPLAYER_LOG_LEVEL_RELEASE, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, format, args);
    }

    public static void release(String tag, String text) {
        logM(IJKPLAYER_LOG_LEVEL_RELEASE, IjkLogModule.IJKLOG_MODULE_PLATFORM, tag, text);
    }

    public static void logM(int level, int module, String tag, String text) {
        // ThunderNative.logText(level, module, tag, text);
        // TODO:
        Log.i(tag, text);
    }

    public static void logM(int level, int module, String tag, String format, Object... args) {
        if (level >= logLevel) {
            String text = String.format(format, args);
            Log.i("[Hsu]" + tag, text);
        }
    }

    public static boolean isInfoValid() {
        return logLevel <= IJKPLAYER_LOG_LEVEL_INFO;
    }

    public static boolean isWarnValid() {
        return logLevel <= IJKPLAYER_LOG_LEVEL_WARN;
    }

    public static boolean isErrorValid() {
        return logLevel <= IJKPLAYER_LOG_LEVEL_ERROR;
    }

    public void enableConsoleLogger(boolean bEnable) {
        // TODO: 要实现
        Log.v("TLog", "enableConsoleLogger, bEnable " + bEnable);
    }
}

