package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dre implements defpackage.onl {
    public static final defpackage.dre a;
    private static final defpackage.ol70 descriptor;

    static {
        defpackage.dre dreVar = new defpackage.dre();
        a = dreVar;
        defpackage.w3z w3zVar = new defpackage.w3z("com.anthropic.claude.api.chat.ConversationSearchResponse", dreVar, 4);
        w3zVar.l("data", true);
        w3zVar.l("next_page_token", true);
        w3zVar.l("search_id", true);
        w3zVar.l("executed_mode", true);
        descriptor = w3zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.onl
    public final defpackage.obp[] childSerializers() {
        defpackage.j1c0 j1c0Var = defpackage.j1c0.a;
        return new defpackage.obp[]{defpackage.ere.e[0].getValue(), defpackage.y71.K(j1c0Var), defpackage.y71.K(j1c0Var), defpackage.y71.K(j1c0Var)};
    }

    @Override // defpackage.z6h
    public final java.lang.Object deserialize(defpackage.drg drgVar) {
        defpackage.ol70 ol70Var = descriptor;
        defpackage.gjd gjdVarB = drgVar.b(ol70Var);
        defpackage.h4q[] h4qVarArr = defpackage.ere.e;
        boolean z = true;
        int i = 0;
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        java.util.List list = null;
        while (z) {
            int iV = gjdVarB.v(ol70Var);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                list = (java.util.List) gjdVarB.x(ol70Var, 0, (defpackage.z6h) h4qVarArr[0].getValue(), list);
                i |= 1;
            } else if (iV == 1) {
                str = (java.lang.String) gjdVarB.l(ol70Var, 1, defpackage.j1c0.a, str);
                i |= 2;
            } else if (iV == 2) {
                str2 = (java.lang.String) gjdVarB.l(ol70Var, 2, defpackage.j1c0.a, str2);
                i |= 4;
            } else {
                if (iV != 3) {
                    defpackage.z4d.e(iV);
                    return null;
                }
                str3 = (java.lang.String) gjdVarB.l(ol70Var, 3, defpackage.j1c0.a, str3);
                i |= 8;
            }
        }
        gjdVarB.i(ol70Var);
        return new defpackage.ere(i, str, str2, str3, list);
    }

    @Override // defpackage.fm70, defpackage.z6h
    public final defpackage.ol70 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.fm70
    public final void serialize(defpackage.pui puiVar, java.lang.Object obj) {
        defpackage.ere ereVar = (defpackage.ere) obj;
        java.lang.String str = ereVar.d;
        java.lang.String str2 = ereVar.c;
        java.lang.String str3 = ereVar.b;
        java.util.List list = ereVar.a;
        defpackage.ol70 ol70Var = descriptor;
        defpackage.hjd hjdVarB = puiVar.b(ol70Var);
        defpackage.h4q[] h4qVarArr = defpackage.ere.e;
        if (hjdVarB.F() || !defpackage.jzo.T(list, defpackage.oti.a)) {
            hjdVarB.p(ol70Var, 0, (defpackage.fm70) h4qVarArr[0].getValue(), list);
        }
        if (hjdVarB.F() || str3 != null) {
            hjdVarB.E(ol70Var, 1, defpackage.j1c0.a, str3);
        }
        if (hjdVarB.F() || str2 != null) {
            hjdVarB.E(ol70Var, 2, defpackage.j1c0.a, str2);
        }
        if (hjdVarB.F() || str != null) {
            hjdVarB.E(ol70Var, 3, defpackage.j1c0.a, str);
        }
        hjdVarB.d();
    }
}
