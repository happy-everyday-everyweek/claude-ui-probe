package com.anthropic.claude.chat.bottomsheet;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public interface ResearchDetailsSheetDestination extends defpackage.qqr {

    public static final class Dismissed implements com.anthropic.claude.chat.bottomsheet.ResearchDetailsSheetDestination, com.anthropic.claude.core.logging.EmptyDestination {
        public static final com.anthropic.claude.chat.bottomsheet.ResearchDetailsSheetDestination.Dismissed b = new com.anthropic.claude.chat.bottomsheet.ResearchDetailsSheetDestination.Dismissed();

        @Override // defpackage.qqr
        public final /* bridge */ int a() {
            return 1;
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.anthropic.claude.chat.bottomsheet.ResearchDetailsSheetDestination.Dismissed);
        }

        public final int hashCode() {
            return -1379027998;
        }

        public final java.lang.String toString() {
            return "Dismissed";
        }
    }

    public static final class ResearchSources implements com.anthropic.claude.chat.bottomsheet.ResearchDetailsSheetDestination {
        public static final com.anthropic.claude.chat.bottomsheet.ResearchDetailsSheetDestination.ResearchSources b = new com.anthropic.claude.chat.bottomsheet.ResearchDetailsSheetDestination.ResearchSources();

        @Override // defpackage.qqr
        public final /* bridge */ int a() {
            return 1;
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.anthropic.claude.chat.bottomsheet.ResearchDetailsSheetDestination.ResearchSources);
        }

        public final int hashCode() {
            return -865411562;
        }

        public final java.lang.String toString() {
            return "ResearchSources";
        }
    }

    public static final class ResearchTimeline implements com.anthropic.claude.chat.bottomsheet.ResearchDetailsSheetDestination {
        public static final com.anthropic.claude.chat.bottomsheet.ResearchDetailsSheetDestination.ResearchTimeline b = new com.anthropic.claude.chat.bottomsheet.ResearchDetailsSheetDestination.ResearchTimeline();

        @Override // defpackage.qqr
        public final /* bridge */ int a() {
            return 1;
        }

        public final boolean equals(java.lang.Object obj) {
            return this == obj || (obj instanceof com.anthropic.claude.chat.bottomsheet.ResearchDetailsSheetDestination.ResearchTimeline);
        }

        public final int hashCode() {
            return -585966173;
        }

        public final java.lang.String toString() {
            return "ResearchTimeline";
        }
    }
}
