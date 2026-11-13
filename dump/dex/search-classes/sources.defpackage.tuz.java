package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface tuz {
    static java.lang.Object a(defpackage.tuz tuzVar, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str4, defpackage.ybe ybeVar, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        if ((i & com.anthropic.voiceclient.VoiceClient.LATE_TCP_LEFT_UNREAD) != 0) {
            str4 = null;
        }
        defpackage.qf1 qf1Var = ((defpackage.vuz) tuzVar).a;
        defpackage.lg1 lg1VarD = defpackage.kvw.d(1, "organizations/{organization_uuid}/projects_v2", "organization_uuid", str);
        lg1VarD.n("filter", str2);
        lg1VarD.l(num, "limit");
        lg1VarD.l(num2, "offset");
        lg1VarD.n("searchQuery", str3);
        lg1VarD.k(bool, "starred");
        lg1VarD.k(bool2, "is_archived");
        lg1VarD.n("order_by", str4);
        defpackage.mg1 mg1VarB = lg1VarD.b();
        defpackage.h4q[] h4qVarArr = defpackage.qjx.c;
        return qf1Var.b(mg1VarB, defpackage.pjx.a, ybeVar);
    }

    static java.lang.Object b(defpackage.tuz tuzVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.util.List list, java.util.ArrayList arrayList, defpackage.ybe ybeVar, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        defpackage.qf1 qf1Var = ((defpackage.vuz) tuzVar).a;
        defpackage.lg1 lg1VarD = defpackage.kvw.d(1, "organizations/{organization_uuid}/projects/{project_uuid}/recents", "organization_uuid", str);
        lg1VarD.j("project_uuid", str2);
        lg1VarD.n("cursor", str3);
        lg1VarD.l(num, "limit");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            lg1VarD.n("surfaces", ((defpackage.k620) it.next()).a);
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList.get(i2);
            i2++;
            lg1VarD.n("include", ((defpackage.k620) obj).a);
        }
        defpackage.mg1 mg1VarB = lg1VarD.b();
        defpackage.h4q[] h4qVarArr = defpackage.bl00.f;
        defpackage.q6l0.C();
        return qf1Var.b(mg1VarB, defpackage.al00.a, ybeVar);
    }
}
