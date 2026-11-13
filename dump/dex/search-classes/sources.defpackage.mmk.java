package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mmk implements defpackage.hjl {
    public final /* synthetic */ byte a;

    public /* synthetic */ mmk(byte b) {
        this.a = b;
    }

    @Override // defpackage.hjl
    public final java.lang.Object invoke() {
        java.lang.Class<?> returnType;
        byte b = 0;
        switch (this.a) {
            case 0:
                return defpackage.ky0.F("com.anthropic.claude.analytics.events.ChatEvents.AnalyticsAttachmentUploadSource", defpackage.jp8.values(), new java.lang.String[]{"unspecified", "initial_upload", "tap_retry", "send_retry", "markup_replacement"}, new java.lang.annotation.Annotation[][]{null, null, null, null, null});
            case 1:
                return new defpackage.f02(defpackage.dwt.a, (byte) 1);
            case 2:
            case 3:
                return null;
            case 4:
                return new defpackage.fkw((byte) 2);
            case 5:
                return new defpackage.c6l(b);
            case 6:
                return defpackage.puf0.a;
            case 7:
                return new defpackage.ibl("font:anthropic_sans", defpackage.n290.d0(new defpackage.o840("composeResources/claude.theme.generated.resources/font/anthropic_sans.ttf")));
            case 8:
                return new defpackage.ibl("font:anthropic_sans_italic", defpackage.n290.d0(new defpackage.o840("composeResources/claude.theme.generated.resources/font/anthropic_sans_italic.ttf")));
            case 9:
                return new defpackage.ibl("font:anthropic_serif", defpackage.n290.d0(new defpackage.o840("composeResources/claude.theme.generated.resources/font/anthropic_serif.ttf")));
            case 10:
                return new defpackage.ibl("font:anthropic_serif_italic", defpackage.n290.d0(new defpackage.o840("composeResources/claude.theme.generated.resources/font/anthropic_serif_italic.ttf")));
            case 11:
                return new defpackage.ibl("font:jetbrains_mono", defpackage.n290.d0(new defpackage.o840("composeResources/claude.theme.generated.resources/font/jetbrains_mono.ttf")));
            case 12:
                return "Unable to attach JankStatsListener to window, decorView is null";
            case 13:
                return "Unable to attach JankStatsListener to window, decorView is not hardware accelerated";
            case 14:
                return "Unable to attach JankStatsListener to window";
            case 15:
                return "Unable to create JankStats";
            case 16:
                try {
                    java.lang.reflect.Method declaredMethod = android.database.sqlite.SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (java.lang.Throwable unused) {
                    return null;
                }
            case 17:
                try {
                    java.lang.reflect.Method method = (java.lang.reflect.Method) defpackage.jil.d.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    java.lang.Class cls = java.lang.Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, android.database.sqlite.SQLiteTransactionListener.class, cls, android.os.CancellationSignal.class);
                } catch (java.lang.Throwable unused2) {
                    return null;
                }
            case 18:
                return "A RumMonitor has already been registered for this SDK instance";
            case 19:
                return null;
            case 20:
                return defpackage.rw0.V(new defpackage.p6l((byte) 21), "go-to-panel");
            case com.anthropic.voiceclient.VoiceCapture.WAVE_CONFIDENCE /* 21 */:
                defpackage.h4q[] h4qVarArr = com.anthropic.claude.app.shell.GoToPanelOverlay.c;
                return defpackage.ky0.F("com.anthropic.claude.analytics.events.ChatListEvents.ConversationSearchEntryPoint", defpackage.la9.values(), new java.lang.String[]{"unspecified", "sidebar", "home", "drawer", "title_bar", "tab_strip", "share_destination"}, new java.lang.annotation.Annotation[][]{null, null, null, null, null, null, null});
            case 22:
                throw new java.lang.IllegalStateException("AnimatedWelcomeScreen was composed outside LoginApp's page and was given no googleSheetOffer. Pass one, or provide LocalGoogleSheetOffer.");
            case 23:
                return new defpackage.f02(defpackage.nam.a, (byte) 0);
            case com.anthropic.voiceclient.VoiceCapture.WAVE_MIC_DB /* 24 */:
                return new defpackage.f02(defpackage.lam.a, (byte) 0);
            case com.anthropic.voiceclient.VoiceCapture.WAVE_PLAYED_DB /* 25 */:
                return new defpackage.f02(defpackage.nam.a, (byte) 0);
            case com.anthropic.voiceclient.VoiceCapture.WAVE_READING /* 26 */:
                return new defpackage.ir20("/(settings|mobile)(/[A-Za-z0-9_-]+)+");
            case 27:
                return defpackage.rw0.V(new defpackage.b8m((byte) 14), "grove");
            case 28:
                return null;
            default:
                return new defpackage.f02(defpackage.yem.a, (byte) 0);
        }
    }
}
