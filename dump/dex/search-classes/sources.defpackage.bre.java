package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bre implements defpackage.onl {
    public static final defpackage.bre a;
    private static final defpackage.ol70 descriptor;

    static {
        defpackage.bre breVar = new defpackage.bre();
        a = breVar;
        defpackage.w3z w3zVar = new defpackage.w3z("com.anthropic.claude.api.chat.ConversationSearchHit", breVar, 3);
        w3zVar.l("conversation", false);
        w3zVar.l("matched_snippet", true);
        w3zVar.l("title_matches", true);
        descriptor = w3zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.onl
    public final defpackage.obp[] childSerializers() {
        return new defpackage.obp[]{defpackage.fo8.a, defpackage.y71.K(defpackage.yks.a), defpackage.cre.d[2].getValue()};
    }

    @Override // defpackage.z6h
    public final java.lang.Object deserialize(defpackage.drg drgVar) {
        defpackage.ol70 ol70Var = descriptor;
        defpackage.gjd gjdVarB = drgVar.b(ol70Var);
        defpackage.h4q[] h4qVarArr = defpackage.cre.d;
        boolean z = true;
        int i = 0;
        defpackage.go8 go8Var = null;
        defpackage.bls blsVar = null;
        java.util.List list = null;
        while (z) {
            int iV = gjdVarB.v(ol70Var);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                go8Var = (defpackage.go8) gjdVarB.x(ol70Var, 0, defpackage.fo8.a, go8Var);
                i |= 1;
            } else if (iV == 1) {
                blsVar = (defpackage.bls) gjdVarB.l(ol70Var, 1, defpackage.yks.a, blsVar);
                i |= 2;
            } else {
                if (iV != 2) {
                    defpackage.z4d.e(iV);
                    return null;
                }
                list = (java.util.List) gjdVarB.x(ol70Var, 2, (defpackage.z6h) h4qVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        gjdVarB.i(ol70Var);
        return new defpackage.cre(i, go8Var, blsVar, list);
    }

    @Override // defpackage.fm70, defpackage.z6h
    public final defpackage.ol70 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.fm70
    public final void serialize(defpackage.pui puiVar, java.lang.Object obj) {
        defpackage.cre creVar = (defpackage.cre) obj;
        defpackage.ol70 ol70Var = descriptor;
        defpackage.hjd hjdVarB = puiVar.b(ol70Var);
        defpackage.h4q[] h4qVarArr = defpackage.cre.d;
        defpackage.fo8 fo8Var = defpackage.fo8.a;
        defpackage.go8 go8Var = creVar.a;
        java.util.List list = creVar.c;
        defpackage.bls blsVar = creVar.b;
        hjdVarB.p(ol70Var, 0, fo8Var, go8Var);
        if (hjdVarB.F() || blsVar != null) {
            hjdVarB.E(ol70Var, 1, defpackage.yks.a, blsVar);
        }
        if (hjdVarB.F() || !defpackage.jzo.T(list, defpackage.oti.a)) {
            hjdVarB.p(ol70Var, 2, (defpackage.fm70) h4qVarArr[2].getValue(), list);
        }
        hjdVarB.d();
    }
}
