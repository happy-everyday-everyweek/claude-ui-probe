package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h1m {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.lang.Object[] objArr = 0;
        java.lang.String str = "Settings";
        int i = 8;
        defpackage.bx0.Q(new defpackage.o0m(new defpackage.qzl(1, "New chat", null), new defpackage.pli0(180388626432L, false)), new defpackage.o0m(new defpackage.qzl(2, "New incognito chat", null), new defpackage.pli0(158913789952L, true)), new defpackage.o0m(new defpackage.qzl(3, "Hide sidebar", null), new defpackage.pli0(128849018880L, false)), new defpackage.o0m(new defpackage.qzl(4, "Search chats", null), new defpackage.pli0(146028888064L, false)), new defpackage.o0m(new defpackage.qzl(5, "Next chat", null), new defpackage.pli0(309237645312L, true)), new defpackage.o0m(new defpackage.qzl(6, "Previous chat", null), new defpackage.pli0(304942678016L, true)), new defpackage.o0m(new defpackage.qzl(7, "Settings", null), new defpackage.pli0(236223201280L, true)), new defpackage.o0m(new defpackage.qzl(8, "Help", null), null));
        defpackage.no7 no7Var = defpackage.oo7.d;
        java.lang.String str2 = "Projects";
        java.util.List<defpackage.akx> listQ = defpackage.bx0.Q(new defpackage.akx("Chats", no7Var.f0), new defpackage.akx("Projects", no7Var.T2), new defpackage.akx("Code", no7Var.u0), new defpackage.akx("Cowork", no7Var.G3));
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.mwc.r0(listQ, 10));
        for (defpackage.akx akxVar : listQ) {
            java.lang.String str3 = (java.lang.String) akxVar.a;
            arrayList.add(new defpackage.f2m(new defpackage.m2m(new defpackage.p2m(str3), str3, null, false, 12), (defpackage.oo7) akxVar.b, (java.lang.String) (objArr == true ? 1 : 0), 12));
        }
        defpackage.no7 no7Var2 = defpackage.oo7.d;
        java.util.List<defpackage.akx> listQ2 = defpackage.bx0.Q(new defpackage.akx("Billing", no7Var2.R0), new defpackage.akx("Capabilities", no7Var2.s6), new defpackage.akx("Claude Code", no7Var2.v0), new defpackage.akx("Connectors", no7Var2.H0));
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.mwc.r0(listQ2, 10));
        for (defpackage.akx akxVar2 : listQ2) {
            java.lang.String str4 = (java.lang.String) akxVar2.a;
            arrayList2.add(new defpackage.f2m(new defpackage.m2m(new defpackage.q2m(str4), str4, "Settings", false, 8), (defpackage.oo7) akxVar2.b, str, i));
        }
        java.util.ArrayList arrayListL1 = defpackage.lwc.l1(arrayList, arrayList2);
        defpackage.m2m m2mVar = new defpackage.m2m(new defpackage.o2m("chan_1"), "Checkout rewrite", null, false, 12);
        defpackage.no7 no7Var3 = defpackage.oo7.d;
        java.util.ArrayList arrayListM1 = defpackage.lwc.m1(arrayListL1, new defpackage.f2m(m2mVar, no7Var3.u0, str2, i));
        java.lang.String str5 = defpackage.u2s.a.f("0b0e6a84-27bd-4df1-9fd9-24b578a1c6f5") ? "0b0e6a84-27bd-4df1-9fd9-24b578a1c6f5" : null;
        defpackage.eeb eebVar = str5 != null ? new defpackage.eeb(str5) : null;
        if (eebVar == null) {
            defpackage.nu.p("Required value was null.");
            return;
        }
        defpackage.lwc.m1(arrayListM1, new defpackage.f2m(new defpackage.m2m(new defpackage.n2m(eebVar.a), "Cost dashboard", null, false, 12), no7Var3.x, "Artifacts", i));
        defpackage.tof tofVar = defpackage.pfi.b;
        a = defpackage.ky0.A0(100, defpackage.ufi.MILLISECONDS);
    }

    public static final void a(defpackage.d2m d2mVar, defpackage.c3m c3mVar, java.lang.String str, java.lang.String str2, defpackage.m0m m0mVar, java.lang.Integer num, defpackage.gll gllVar, int i) {
        boolean z;
        gllVar.o0(-693073094);
        int i2 = i | (gllVar.i(d2mVar) ? 4 : 2) | (gllVar.i(c3mVar) ? 32 : 16) | (gllVar.i(str) ? com.anthropic.voiceclient.VoiceClient.EVENT_FIRST_AUDIO : com.anthropic.voiceclient.VoiceClient.LATE_TCP_LEFT_UNREAD) | (gllVar.i(str2) ? 2048 : 1024) | (gllVar.i(m0mVar) ? 16384 : 8192) | (gllVar.i(num) ? 131072 : 65536);
        if (gllVar.b0(i2 & 1, (74899 & i2) != 74898)) {
            defpackage.n01 n01VarC0 = defpackage.gyo.c0(gllVar);
            defpackage.kiq lifecycle = ((defpackage.xiq) gllVar.m(defpackage.wnr.a)).getLifecycle();
            defpackage.kzm kzmVar = (defpackage.kzm) d2mVar.l.getValue();
            java.util.Collection collectionValues = d2mVar.c().values();
            if (!(collectionValues instanceof java.util.Collection) || !collectionValues.isEmpty()) {
                java.util.Iterator it = collectionValues.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (((defpackage.i8i) it.next()).a()) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            defpackage.npu npuVarD0 = defpackage.gyo.d0(c3mVar, gllVar);
            defpackage.npu npuVarD1 = defpackage.gyo.d0(str, gllVar);
            defpackage.npu npuVarD2 = defpackage.gyo.d0(m0mVar, gllVar);
            java.lang.Object[] objArr = {kzmVar, str2, num, java.lang.Boolean.valueOf(z), lifecycle};
            boolean z2 = z;
            boolean zJ = gllVar.j(z) | gllVar.k(lifecycle) | gllVar.k(kzmVar) | ((i2 & 14) == 4) | gllVar.i(npuVarD0) | gllVar.i(npuVarD1) | ((i2 & 7168) == 2048) | gllVar.i(npuVarD2) | gllVar.i(n01VarC0);
            java.lang.Object objW = gllVar.W();
            if (zJ || objW == defpackage.r9d.a) {
                java.lang.Object v59Var = new defpackage.v59(z2, lifecycle, kzmVar, d2mVar, str2, n01VarC0, npuVarD0, npuVarD1, npuVarD2, (defpackage.wbe) null);
                gllVar.w0(v59Var);
                objW = v59Var;
            }
            defpackage.fhj0.n(objArr, (defpackage.mjl) objW, gllVar);
        } else {
            gllVar.e0();
        }
        defpackage.ua20 ua20VarZ = gllVar.z();
        if (ua20VarZ != null) {
            ua20VarZ.d = new defpackage.ov80(d2mVar, c3mVar, str, str2, m0mVar, num, i);
        }
    }

    public static final void b(defpackage.d2m d2mVar, defpackage.x2m x2mVar, defpackage.wq30 wq30Var, boolean z, defpackage.jjl jjlVar, defpackage.jjl jjlVar2, defpackage.jjl jjlVar3, defpackage.mjl mjlVar, defpackage.w6l w6lVar, defpackage.hjl hjlVar, defpackage.jjl jjlVar4, defpackage.jjl jjlVar5, defpackage.hjl hjlVar2, defpackage.xeu xeuVar, defpackage.sdx sdxVar, defpackage.mjl mjlVar2, defpackage.a18 a18Var, defpackage.gll gllVar, int i) {
        defpackage.gll gllVar2;
        gllVar.o0(736296167);
        int i2 = i | (gllVar.i(d2mVar) ? 4 : 2) | (gllVar.i(x2mVar) ? 32 : 16) | (gllVar.i(wq30Var) ? com.anthropic.voiceclient.VoiceClient.EVENT_FIRST_AUDIO : com.anthropic.voiceclient.VoiceClient.LATE_TCP_LEFT_UNREAD) | (gllVar.j(z) ? 2048 : 1024) | (gllVar.k(jjlVar2) ? 131072 : 65536) | (gllVar.k(jjlVar3) ? 1048576 : 524288) | (gllVar.k(mjlVar) ? 8388608 : 4194304) | (gllVar.i(w6lVar) ? 67108864 : 33554432) | (gllVar.k(hjlVar) ? 536870912 : 268435456);
        boolean z2 = false;
        if (gllVar.b0(i2 & 1, ((i2 & 306783379) == 306783378 && (599187 & (((((((gllVar.k(jjlVar4) ? (char) 4 : (char) 2) | (gllVar.k(jjlVar5) ? ' ' : (char) 16)) | (gllVar.k(hjlVar2) ? com.anthropic.voiceclient.VoiceClient.EVENT_FIRST_AUDIO : com.anthropic.voiceclient.VoiceClient.LATE_TCP_LEFT_UNREAD)) | (gllVar.i(xeuVar) ? (char) 2048 : (char) 1024)) | (gllVar.i(sdxVar) ? 16384 : 8192)) | (gllVar.k(mjlVar2) ? (char) 0 : (char) 0)) | (gllVar.i(a18Var) ? (char) 0 : (char) 0))) == 599186) ? false : true)) {
            defpackage.b510 b510VarA = defpackage.l8i.a.a(java.lang.Boolean.TRUE);
            defpackage.yfi yfiVar = defpackage.l8i.b;
            if (z && d2mVar.a()) {
                z2 = true;
            }
            defpackage.b510[] b510VarArr = {b510VarA, yfiVar.a(java.lang.Boolean.valueOf(z2))};
            gllVar2 = gllVar;
            defpackage.ky0.k(b510VarArr, defpackage.s11.q0(-2046496345, new defpackage.q0m(d2mVar, z, xeuVar, hjlVar, sdxVar, w6lVar, x2mVar, wq30Var, jjlVar, jjlVar2, jjlVar3, mjlVar, jjlVar4, mjlVar2, a18Var, jjlVar5, hjlVar2), gllVar2), gllVar2, 48);
        } else {
            gllVar2 = gllVar;
            gllVar2.e0();
        }
        defpackage.ua20 ua20VarZ = gllVar2.z();
        if (ua20VarZ != null) {
            ua20VarZ.d = new defpackage.q0m(d2mVar, x2mVar, wq30Var, z, jjlVar, jjlVar2, jjlVar3, mjlVar, w6lVar, hjlVar, jjlVar4, jjlVar5, hjlVar2, xeuVar, sdxVar, mjlVar2, a18Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:234:0x0476  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r2v67, types: [gll] */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r34v1, types: [gll] */
    /* JADX WARN: Type inference failed for: r6v21, types: [gll] */
    /* JADX WARN: Type inference failed for: r6v22, types: [gll] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r7v18, types: [gll] */
    /* JADX WARN: Type inference failed for: r7v20, types: [gll] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [gll] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r8v0, types: [gll] */
    /* JADX WARN: Type inference failed for: r8v1, types: [gll] */
    /* JADX WARN: Type inference failed for: r8v18, types: [gll] */
    /* JADX WARN: Type inference failed for: r8v20, types: [gll] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v48, types: [gll] */
    /* JADX WARN: Type inference failed for: r8v49, types: [gll] */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v6, types: [gll] */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v68 */
    public static final void c(defpackage.w2m w2mVar, java.lang.String str, boolean z, boolean z2, java.util.List list, defpackage.x2m x2mVar, defpackage.wq30 wq30Var, defpackage.jjl jjlVar, defpackage.jjl jjlVar2, defpackage.jjl jjlVar3, defpackage.mjl mjlVar, java.util.Map map, defpackage.i8i i8iVar, int i, defpackage.hjl hjlVar, defpackage.mjl mjlVar2, defpackage.a18 a18Var, defpackage.gll gllVar, int i2) {
        ?? r8;
        java.lang.Object obj;
        boolean z3;
        boolean z4;
        int i3;
        defpackage.lb1 lb1Var;
        java.lang.String strO;
        boolean z5;
        ?? r9;
        ?? r10;
        int i4;
        defpackage.wq30 wq30Var2;
        java.lang.Object obj2;
        java.lang.String strO2;
        ?? r7;
        ?? r6;
        ?? r11;
        ?? r12;
        ?? r13;
        java.lang.String str2;
        int i5;
        defpackage.ax70 ax70Var;
        int i6;
        ?? r2;
        java.lang.Object obj3;
        ?? r14;
        java.lang.Object obj4;
        defpackage.lb1 lb1Var2;
        defpackage.lb1 lb1Var3;
        java.lang.Object obj5;
        ?? r15;
        ?? r16;
        java.util.List list2;
        defpackage.b0m b0mVar;
        ?? r17 = gllVar;
        r17.o0(-1809001819);
        int i7 = i2 | (r17.i(w2mVar) ? 4 : 2) | (r17.i(str) ? 32 : 16);
        boolean zJ = r17.j(z);
        int i8 = com.anthropic.voiceclient.VoiceClient.LATE_TCP_LEFT_UNREAD;
        int i9 = i7 | (zJ ? 256 : 128) | (r17.j(z2) ? 2048 : 1024) | (r17.i(list) ? 16384 : 8192) | (r17.i(x2mVar) ? 131072 : 65536) | (r17.i(wq30Var) ? 1048576 : 524288) | (r17.k(jjlVar) ? 8388608 : 4194304) | (r17.k(jjlVar2) ? 67108864 : 33554432) | (r17.k(jjlVar3) ? 536870912 : 268435456);
        int i10 = (r17.k(mjlVar) ? 4 : 2) | (r17.i(map) ? 32 : 16);
        if (r17.i(i8iVar)) {
            i8 = 256;
        }
        int i11 = i10 | i8 | (r17.g(i) ? 2048 : 1024) | (r17.k(hjlVar) ? 16384 : 8192) | (r17.k(mjlVar2) ? 131072 : 65536) | (r17.i(a18Var) ? 1048576 : 524288);
        if (r17.b0(i9 & 1, ((i9 & 306783379) == 306783378 && (599187 & i11) == 599186) ? false : true)) {
            java.lang.Object objW = r17.W();
            defpackage.ax70 ax70Var2 = defpackage.r9d.a;
            if (objW == ax70Var2) {
                obj = objW;
                defpackage.dil dilVar = new defpackage.dil((byte) 12);
                r17.w0(dilVar);
                obj = dilVar;
            }
            obj = objW;
            defpackage.xeu xeuVarF = defpackage.bee.f(defpackage.ueu.a, (defpackage.jjl) obj);
            boolean z6 = (i11 & 7168) == 2048;
            java.lang.Object objW2 = r17.W();
            java.lang.Object obj6 = objW2;
            if (z6 || objW2 == ax70Var2) {
                defpackage.hb3 hb3Var = new defpackage.hb3(i, (byte) 19);
                r17.w0(hb3Var);
                obj6 = hb3Var;
            }
            defpackage.xeu xeuVarB = defpackage.zb70.b((defpackage.jjl) obj6, xeuVarF, false);
            defpackage.i5d i5dVar = z2 ? defpackage.xcl0.a : null;
            defpackage.t2m t2mVar = w2mVar instanceof defpackage.t2m ? (defpackage.t2m) w2mVar : null;
            defpackage.f0m f0mVar = (t2mVar == null || (b0mVar = t2mVar.a) == null) ? null : b0mVar.a;
            boolean z7 = f0mVar instanceof defpackage.c0m;
            defpackage.c0m c0mVar = z7 ? (defpackage.c0m) f0mVar : null;
            defpackage.py60 py60Var = (c0mVar == null || map == null) ? null : (defpackage.py60) defpackage.h4a.k(c0mVar.a, map);
            boolean z8 = map != null && (z7 || (f0mVar instanceof defpackage.e0m));
            if (w2mVar != null) {
                boolean z9 = w2mVar instanceof defpackage.t2m;
                if (z9) {
                    r17.m0(411241501);
                    defpackage.b0m b0mVar2 = ((defpackage.t2m) w2mVar).a;
                    r17.m0(1399344848);
                    java.lang.String strP0 = b0mVar2.b;
                    if (strP0.length() == 0) {
                        strP0 = defpackage.y7p.p0(org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f140f8f, r17);
                    }
                    z4 = z9;
                    r17.t(false);
                    java.lang.String str3 = b0mVar2.b;
                    i3 = i11;
                    boolean zI = r17.i(strP0) | r17.i(str3) | ((((i9 & 112) ^ 48) > 32 && r17.i(str)) || (i9 & 48) == 32) | r17.i(py60Var) | r17.j(z8);
                    java.lang.Object objW3 = r17.W();
                    if (zI || objW3 == ax70Var2) {
                        int length = str3.length();
                        java.util.List list3 = defpackage.oti.a;
                        if (length != 0) {
                            if (py60Var != null) {
                                list2 = str3.equals(py60Var.b) ? py60Var.c : list3;
                            } else {
                                list2 = null;
                            }
                            if (list2 != null) {
                                list3 = list2;
                            }
                        }
                        objW3 = z8 ? defpackage.s4l0.z(strP0, list3, new defpackage.l0b0(0L, 0L, defpackage.ybl.h, (defpackage.rbl) null, (defpackage.sbl) null, (defpackage.sal) null, (java.lang.String) null, 0L, (defpackage.vu4) null, (defpackage.qjd0) null, (defpackage.xor) null, 0L, (defpackage.fed0) null, (defpackage.gb90) null, 65531)) : s(strP0, str);
                        r17.w0(objW3);
                    }
                    lb1Var = (defpackage.lb1) objW3;
                    r17.t(false);
                } else {
                    z4 = z9;
                    i3 = i11;
                    if (w2mVar instanceof defpackage.s2m) {
                        r17.m0(-136324866);
                        defpackage.qzl qzlVar = ((defpackage.s2m) w2mVar).a;
                        boolean zI2 = r17.i(qzlVar.b) | ((((i9 & 112) ^ 48) > 32 && r17.i(str)) || (i9 & 48) == 32);
                        java.lang.Object objW4 = r17.W();
                        java.lang.Object obj7 = objW4;
                        if (zI2 || objW4 == ax70Var2) {
                            defpackage.lb1 lb1VarS = s(qzlVar.b, str);
                            r17.w0(lb1VarS);
                            obj7 = lb1VarS;
                        }
                        lb1Var = (defpackage.lb1) obj7;
                        r17.t(false);
                    } else if (w2mVar instanceof defpackage.v2m) {
                        r17.m0(-136229758);
                        defpackage.m2m m2mVar = ((defpackage.v2m) w2mVar).a;
                        boolean zI3 = r17.i(m2mVar.b) | ((((i9 & 112) ^ 48) > 32 && r17.i(str)) || (i9 & 48) == 32);
                        java.lang.Object objW5 = r17.W();
                        java.lang.Object obj8 = objW5;
                        if (zI3 || objW5 == ax70Var2) {
                            defpackage.lb1 lb1VarS2 = s(m2mVar.b, str);
                            r17.w0(lb1VarS2);
                            obj8 = lb1VarS2;
                        }
                        lb1Var = (defpackage.lb1) obj8;
                        r17.t(false);
                    } else {
                        z3 = false;
                        if (w2mVar instanceof defpackage.u2m) {
                            r17.m0(411250453);
                            lb1Var = new defpackage.lb1(n((defpackage.u2m) w2mVar, r17));
                            r17.t(false);
                        }
                    }
                }
                defpackage.lb1 lb1Var4 = lb1Var;
                byte b2 = 14;
                if (z4) {
                    r17.m0(1278297746);
                    defpackage.f0m f0mVar2 = ((defpackage.t2m) w2mVar).a.a;
                    java.lang.String str4 = "3b75f1079510";
                    if (f0mVar2 instanceof defpackage.c0m) {
                        r17.m0(1278336558);
                        defpackage.fa9 fa9Var = (defpackage.fa9) x2mVar.a.get(new defpackage.hu8(((defpackage.c0m) f0mVar2).a));
                        if (fa9Var == null) {
                            r17.m0(1278336557);
                            r17.t(false);
                            r15 = 0;
                            r16 = r17;
                        } else {
                            r17.m0(1278336558);
                            defpackage.go8 go8Var = fa9Var.a;
                            int i12 = i9 & 3670016;
                            boolean z10 = i12 == 1048576;
                            java.lang.Object objW6 = r17.W();
                            if (z10 || objW6 == ax70Var2) {
                                str2 = "3b75f1079510";
                                i5 = 0;
                                ax70Var = ax70Var2;
                                i6 = 1048576;
                                defpackage.gll gllVar2 = gllVar;
                                defpackage.wck wckVar = new defpackage.wck(i5, wq30Var, str2, i5, (byte) 15);
                                gllVar2.w0(wckVar);
                                objW6 = wckVar;
                                r2 = gllVar2;
                            } else {
                                r2 = r17;
                                ax70Var = ax70Var2;
                                str2 = "3b75f1079510";
                                i6 = 1048576;
                                i5 = 0;
                            }
                            defpackage.njl njlVar = (defpackage.yjl) objW6;
                            int i13 = i12 == i6 ? 1 : i5;
                            java.lang.Object objW7 = r2.W();
                            defpackage.ax70 ax70Var3 = ax70Var;
                            if (i13 != 0 || objW7 == ax70Var3) {
                                defpackage.wck wckVar2 = new defpackage.wck(i5, wq30Var, str2, i5, (byte) 16);
                                r2.w0(wckVar2);
                                obj3 = wckVar2;
                            } else {
                                obj3 = objW7;
                            }
                            defpackage.njl njlVar2 = (defpackage.yjl) obj3;
                            int i14 = i12 == i6 ? 1 : i5;
                            java.lang.Object objW8 = r2.W();
                            if (i14 != 0 || objW8 == ax70Var3) {
                                int i15 = i5;
                                defpackage.wck wckVar3 = new defpackage.wck(i15 == true ? 1 : 0, wq30Var, str2, i5, (byte) 17);
                                r2.w0(wckVar3);
                                obj4 = wckVar3;
                                r14 = i15;
                            } else {
                                r14 = i5;
                                obj4 = objW8;
                            }
                            defpackage.njl njlVar3 = (defpackage.yjl) obj4;
                            int i16 = fa9Var.f;
                            if (py60Var == 0) {
                                r2.m0(695774614);
                                r2.t(r14);
                                lb1Var3 = null;
                            } else {
                                r2.m0(715181003);
                                r2.m0(536805358);
                                defpackage.oy60 oy60Var = py60Var.a;
                                if (oy60Var == null) {
                                    r2.t(r14);
                                    lb1Var2 = null;
                                } else {
                                    if (oy60Var.a.length() <= 0) {
                                        oy60Var = null;
                                    }
                                    if (oy60Var == null) {
                                        r2.t(r14);
                                        lb1Var2 = null;
                                    } else {
                                        defpackage.ybl yblVar = defpackage.ybl.h;
                                        defpackage.xxa xxaVar = defpackage.aya.a;
                                        defpackage.l0b0 l0b0Var = new defpackage.l0b0(defpackage.aya.a(r2).a.M0(), 0L, yblVar, (defpackage.rbl) null, (defpackage.sbl) null, (defpackage.sal) null, (java.lang.String) null, 0L, (defpackage.vu4) null, (defpackage.qjd0) null, (defpackage.xor) null, 0L, (defpackage.fed0) null, (defpackage.gb90) null, 65530);
                                        boolean zI4 = r2.i(oy60Var) | r2.i(l0b0Var);
                                        java.lang.Object objW9 = r2.W();
                                        if (zI4 || objW9 == ax70Var3) {
                                            obj5 = objW9;
                                            defpackage.lb1 lb1VarR = defpackage.v2k0.r(oy60Var, l0b0Var);
                                            r2.w0(lb1VarR);
                                            obj5 = lb1VarR;
                                        }
                                        lb1Var2 = (defpackage.lb1) obj5;
                                        r2.t(r14);
                                    }
                                }
                                r2.t(r14);
                                lb1Var3 = lb1Var2;
                            }
                            boolean z11 = fa9Var.c;
                            boolean z12 = ((i9 & 234881024) != 67108864 ? r14 == true ? 1 : 0 : true) | (r2.i(fa9Var) ? 1 : 0);
                            java.lang.Object objW10 = r2.W();
                            java.lang.Object obj9 = objW10;
                            if (z12 != 0 || objW10 == ax70Var3) {
                                defpackage.k8k k8kVar = new defpackage.k8k(jjlVar2, fa9Var, (byte) 23);
                                r2.w0(k8kVar);
                                obj9 = k8kVar;
                            }
                            int i17 = i3 << 3;
                            ?? r34 = r2;
                            defpackage.nxj0.g(go8Var, z, hjlVar, (defpackage.hjl) obj9, jjlVar, (defpackage.hjl) njlVar, (defpackage.hjl) njlVar2, (defpackage.hjl) njlVar3, i16, z11, xeuVarB, null, lb1Var4, i5dVar, i8iVar, lb1Var3, mjlVar2, a18Var, r34, ((i9 >> 3) & 112) | ((i3 >> 6) & 896) | ((i9 >> 9) & 57344), ((i3 << 6) & 57344) | (i17 & 3670016) | (i17 & 29360128), 2048);
                            ?? r18 = r34;
                            r18.t(r14);
                            r16 = r18;
                            r15 = r14;
                        }
                        r16.t(r15);
                        r11 = r16;
                        r10 = r15;
                    } else {
                        r10 = 0;
                        boolean z13 = false;
                        boolean z14 = false;
                        if (f0mVar2 instanceof defpackage.e0m) {
                            r17.m0(1279294861);
                            defpackage.ia9 ia9Var = (defpackage.ia9) x2mVar.b.get(new defpackage.e880(((defpackage.e0m) f0mVar2).a));
                            if (ia9Var == null) {
                                r17.m0(1279294860);
                                r17.t(false);
                                r6 = r17;
                            } else {
                                r17.m0(1279294861);
                                boolean zI5 = r17.i(ia9Var) | ((i9 & 234881024) == 67108864);
                                java.lang.Object objW11 = r17.W();
                                java.lang.Object obj10 = objW11;
                                if (zI5 || objW11 == ax70Var2) {
                                    defpackage.k8k k8kVar2 = new defpackage.k8k(jjlVar2, ia9Var, (byte) 24);
                                    r17.w0(k8kVar2);
                                    obj10 = k8kVar2;
                                }
                                defpackage.hjl hjlVar2 = (defpackage.hjl) obj10;
                                boolean zI6 = ((i3 & 14) == 4) | r17.i(ia9Var);
                                java.lang.Object objW12 = r17.W();
                                java.lang.Object obj11 = objW12;
                                if (zI6 != 0 || objW12 == ax70Var2) {
                                    defpackage.sgk sgkVar = new defpackage.sgk(mjlVar, ia9Var, b2);
                                    r17.w0(sgkVar);
                                    obj11 = sgkVar;
                                }
                                defpackage.oyj0.b(ia9Var, z, hjlVar, hjlVar2, xeuVarB, lb1Var4, i5dVar, i8iVar, (defpackage.jjl) obj11, null, r17, ((i9 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 29360128), com.anthropic.voiceclient.VoiceClient.EVENT_REPLY_DRAINED);
                                ?? r19 = r17;
                                r19.t(false);
                                r6 = r19;
                            }
                            r6.t(false);
                            r11 = r6;
                        } else {
                            if (!(f0mVar2 instanceof defpackage.d0m)) {
                                throw defpackage.prw.v(1011066736, r17, false);
                            }
                            r17.m0(1280007055);
                            defpackage.utz utzVar = (defpackage.utz) x2mVar.c.get(new defpackage.m700(((defpackage.d0m) f0mVar2).a));
                            if (utzVar == null) {
                                r17.m0(1280007054);
                                r17.t(false);
                                r7 = r17;
                                r10 = 0;
                            } else {
                                r17.m0(1280007055);
                                boolean z15 = (i9 & 3670016) == 1048576;
                                java.lang.Object objW13 = r17.W();
                                if (z15 || objW13 == ax70Var2) {
                                    i4 = 536870912;
                                    defpackage.wck wckVar4 = new defpackage.wck(z14 ? 1 : 0, wq30Var, str4, z13 ? 1 : 0, (byte) 18);
                                    wq30Var2 = wq30Var;
                                    r17.w0(wckVar4);
                                    obj2 = wckVar4;
                                } else {
                                    i4 = 536870912;
                                    wq30Var2 = wq30Var;
                                    obj2 = objW13;
                                }
                                defpackage.njl njlVar4 = (defpackage.yjl) obj2;
                                if (wq30Var2.c.y(utzVar.a)) {
                                    strO2 = defpackage.prw.o(r17, -221819425, org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f1410ee, r17, false);
                                } else {
                                    r17.m0(1713582700);
                                    r17.t(r10);
                                    strO2 = null;
                                }
                                int i18 = ((i9 & 1879048192) != i4 ? r10 : 1) | (r17.i(utzVar) ? 1 : 0);
                                java.lang.Object objW14 = r17.W();
                                java.lang.Object obj12 = objW14;
                                if (i18 != 0 || objW14 == ax70Var2) {
                                    defpackage.k8k k8kVar3 = new defpackage.k8k(jjlVar3, utzVar, (byte) 25);
                                    r17.w0(k8kVar3);
                                    obj12 = k8kVar3;
                                }
                                defpackage.yxj0.e(utzVar, z, hjlVar, (defpackage.hjl) obj12, (defpackage.hjl) njlVar4, xeuVarB, lb1Var4, i5dVar, i8iVar, strO2, r17, ((i9 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 18) & 234881024), 0);
                                ?? r20 = r17;
                                r20.t(r10);
                                r7 = r20;
                            }
                            r7.t(r10);
                            r13 = r7;
                            r12 = r10;
                        }
                        r13.t(r12);
                        r8 = r13;
                    }
                    r12 = r10;
                    r13 = r11;
                    r13.t(r12);
                    r8 = r13;
                } else if (w2mVar instanceof defpackage.v2m) {
                    r17.m0(1280722535);
                    java.util.Map map2 = x2mVar.e;
                    defpackage.v2m v2mVar = (defpackage.v2m) w2mVar;
                    defpackage.m2m m2mVar2 = v2mVar.a;
                    defpackage.f2m f2mVar = (defpackage.f2m) map2.get(m2mVar2.a);
                    if (f2mVar == null) {
                        r17.m0(1280722534);
                        r17.t(false);
                        r9 = r17;
                        z5 = false;
                    } else {
                        r17.m0(1280722535);
                        boolean z16 = ((defpackage.z5h) r17.m(defpackage.ckd.e)).N0() > 1.3f;
                        if (m2mVar2.d) {
                            strO = defpackage.prw.o(r17, -1364450645, org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f1410ee, r17, false);
                        } else {
                            r17.m0(651753248);
                            r17.t(false);
                            strO = null;
                        }
                        defpackage.h8i h8iVar = new defpackage.h8i(q(v2mVar, x2mVar, r17), strO);
                        java.lang.String str5 = strO;
                        z5 = false;
                        defpackage.l8i.c(z, hjlVar, xeuVarB, null, null, null, null, null, null, h8iVar, defpackage.s11.q0(1955708644, new defpackage.we(f2mVar, str5, lb1Var4, i5dVar, z16, z2, (byte) 1), r17), r17, (14 & (i9 >> 6)) | ((i3 >> 9) & 112), 504);
                        ?? r21 = r17;
                        r21.t(false);
                        r9 = r21;
                    }
                    r9.t(z5);
                    r8 = r9;
                } else {
                    if (!(w2mVar instanceof defpackage.s2m) && !(w2mVar instanceof defpackage.u2m)) {
                        throw defpackage.prw.v(1011068852, r17, false);
                    }
                    r17.m0(1282352267);
                    boolean z17 = ((defpackage.z5h) r17.m(defpackage.ckd.e)).N0() > 1.3f;
                    if ((w2mVar instanceof defpackage.u2m) && list != null) {
                        i5dVar = null;
                    }
                    defpackage.l8i.c(z, hjlVar, xeuVarB, defpackage.y7p.p0(org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f140fba, r17), null, null, null, null, null, null, defpackage.s11.q0(1022930078, new defpackage.a2c((java.lang.Object) w2mVar, (java.lang.Object) list, (java.lang.Object) lb1Var4, z17, (java.lang.Object) i5dVar, (byte) 17), r17), r17, ((i9 >> 6) & 14) | ((i3 >> 9) & 112), 1008);
                    ?? r22 = r17;
                    r22.t(false);
                    r8 = r22;
                }
            } else {
                z3 = false;
            }
            throw defpackage.prw.v(411240442, r17, z3);
        }
        r17.e0();
        r8 = r17;
        defpackage.ua20 ua20VarZ = r8.z();
        if (ua20VarZ != null) {
            ua20VarZ.d = new defpackage.slc0(w2mVar, str, z, z2, list, x2mVar, wq30Var, jjlVar, jjlVar2, jjlVar3, mjlVar, map, i8iVar, i, hjlVar, mjlVar2, a18Var, i2);
        }
    }

    public static final void d(defpackage.k0m k0mVar, defpackage.hjl hjlVar, defpackage.hjl hjlVar2, defpackage.gll gllVar, int i) {
        int i2;
        defpackage.gll gllVar2;
        boolean z;
        defpackage.l6l l6lVar;
        float f;
        defpackage.ueu ueuVar;
        defpackage.ueu ueuVar2;
        defpackage.l6l l6lVar2;
        boolean z2;
        int i3;
        gllVar.o0(321923249);
        if ((i & 6) == 0) {
            i2 = (gllVar.g(k0mVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gllVar.k(hjlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= gllVar.k(hjlVar2) ? com.anthropic.voiceclient.VoiceClient.EVENT_FIRST_AUDIO : com.anthropic.voiceclient.VoiceClient.LATE_TCP_LEFT_UNREAD;
        }
        int i4 = i2;
        if (gllVar.b0(i4 & 1, (i4 & 147) != 146)) {
            boolean z3 = k0mVar == defpackage.k0m.g;
            boolean z4 = k0mVar == defpackage.k0m.e;
            boolean z5 = k0mVar == defpackage.k0m.d;
            defpackage.l6l l6lVarF = defpackage.m6l.f(gllVar);
            defpackage.nq5 nq5Var = defpackage.xu20.m;
            defpackage.zdx zdxVar = defpackage.p1d.a;
            defpackage.ueu ueuVar3 = defpackage.ueu.a;
            defpackage.xeu xeuVarE = defpackage.nga0.e(defpackage.u3c0.u(ueuVar3, zdxVar), 1.0f);
            java.lang.Object objW = gllVar.W();
            if (objW == defpackage.r9d.a) {
                objW = new defpackage.dil((byte) 11);
                gllVar.w0(objW);
            }
            defpackage.xeu xeuVarU = defpackage.u3c0.u(defpackage.zb70.b((defpackage.jjl) objW, xeuVarE, z3), defpackage.p1d.h);
            defpackage.d850 d850VarA = defpackage.g750.a(defpackage.c0a0.d, nq5Var, gllVar, 48);
            int iHashCode = java.lang.Long.hashCode(gllVar.U);
            defpackage.udy udyVarO = gllVar.o();
            defpackage.xeu xeuVarH = defpackage.e08.H(gllVar, xeuVarU);
            defpackage.i9d.y.getClass();
            gllVar.q0();
            if (gllVar.T) {
                gllVar.n(defpackage.d1q.o0);
            } else {
                gllVar.z0();
            }
            defpackage.pvc0.o(defpackage.qxf0.h, gllVar, d850VarA);
            defpackage.pvc0.o(defpackage.qxf0.g, gllVar, udyVarO);
            defpackage.pvc0.o(defpackage.qxf0.i, gllVar, java.lang.Integer.valueOf(iHashCode));
            defpackage.pvc0.m(gllVar);
            defpackage.pvc0.o(defpackage.qxf0.f, gllVar, xeuVarH);
            if (z3) {
                gllVar.m0(599755884);
                l6lVar = l6lVarF;
                z = z3;
                ueuVar = ueuVar3;
                f = 1.0f;
                defpackage.kq7.a(defpackage.u3c0.u(ueuVar3, defpackage.l8i.d), defpackage.gx7.e, 0L, false, gllVar, 48, 12);
                gllVar2 = gllVar;
                gllVar2.t(false);
            } else {
                z = z3;
                l6lVar = l6lVarF;
                f = 1.0f;
                ueuVar = ueuVar3;
                gllVar.m0(599873622);
                defpackage.no7 no7Var = defpackage.oo7.d;
                defpackage.eq7.b(z5 ? no7Var.f4 : no7Var.x4, defpackage.u3c0.u(ueuVar, defpackage.l8i.d), null, null, gllVar, 0, 12);
                gllVar2 = gllVar;
                gllVar2.t(false);
            }
            if (z5) {
                gllVar2.m0(600188582);
                defpackage.xxa xxaVar = defpackage.aya.a;
                defpackage.nld0 nld0VarB = defpackage.nld0.b((defpackage.nld0) ((defpackage.dj9) defpackage.aya.b(gllVar2).m.a).m, defpackage.aya.a(gllVar2).a.O(), 0L, null, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 0, 0, 16777214);
                if (f <= 0.0d) {
                    defpackage.dho.a("invalid weight; must be greater than zero");
                }
                int i5 = (i4 >> 6) & 14;
                defpackage.jbj0.j(hjlVar2, defpackage.m6l.j(new defpackage.e4q(f <= Float.MAX_VALUE ? f : Float.MAX_VALUE, true), l6lVar, gllVar2, 0).z(defpackage.jbj0.M(hjlVar2, gllVar2, i5)), nld0VarB, gllVar2, i5, 0);
                gllVar2.t(false);
                l6lVar2 = l6lVar;
                ueuVar2 = ueuVar;
                z2 = false;
                i3 = i4;
            } else {
                gllVar2.m0(600539564);
                java.lang.String strT = t(k0mVar, gllVar2);
                defpackage.xxa xxaVar2 = defpackage.aya.a;
                defpackage.nld0 nld0Var = (defpackage.nld0) ((defpackage.dj9) defpackage.aya.b(gllVar2).m.a).m;
                long jO = defpackage.aya.a(gllVar2).a.O();
                if (f <= 0.0d) {
                    defpackage.dho.a("invalid weight; must be greater than zero");
                }
                ueuVar2 = ueuVar;
                l6lVar2 = l6lVar;
                z2 = false;
                i3 = i4;
                defpackage.fkd0.b(strT, new defpackage.e4q(f <= Float.MAX_VALUE ? f : Float.MAX_VALUE, true), jO, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nld0Var, gllVar, 0, 0, 131064);
                gllVar2 = gllVar;
                gllVar2.t(false);
            }
            if (z || z5) {
                gllVar2.m0(601174413);
                gllVar2.t(z2);
            } else {
                gllVar2.m0(600830065);
                defpackage.glr.a(defpackage.y7p.p0(org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f140f7e, gllVar2), z4, defpackage.u3c0.u(defpackage.m6l.g(ueuVar2, l6lVar2, gllVar2, 6), defpackage.l8i.e), false, null, defpackage.ih6.a, defpackage.yg6.e, null, null, null, 0, hjlVar, gllVar, 1769472, (i3 << 3) & 896, 3992);
                gllVar2 = gllVar;
                gllVar2.t(z2);
            }
            gllVar2.t(true);
        } else {
            gllVar2 = gllVar;
            gllVar2.e0();
        }
        defpackage.ua20 ua20VarZ = gllVar2.z();
        if (ua20VarZ != null) {
            ua20VarZ.d = new defpackage.wo2(k0mVar, hjlVar, hjlVar2, i, (byte) 8);
        }
    }

    public static final void e(defpackage.c3m c3mVar, defpackage.kzm kzmVar, java.util.List list, defpackage.n8q n8qVar, int i, defpackage.gll gllVar, int i2) {
        defpackage.kzm kzmVar2;
        gllVar.o0(-1053108550);
        int i3 = i2 | (gllVar.i(c3mVar) ? 4 : 2) | (gllVar.i(kzmVar) ? 32 : 16) | (gllVar.i(list) ? com.anthropic.voiceclient.VoiceClient.EVENT_FIRST_AUDIO : com.anthropic.voiceclient.VoiceClient.LATE_TCP_LEFT_UNREAD) | (gllVar.i(n8qVar) ? 2048 : 1024) | (gllVar.g(i) ? 16384 : 8192);
        byte b2 = 0;
        if (gllVar.b0(i3 & 1, (i3 & 9363) != 9362)) {
            java.util.Iterator it = list.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                }
                defpackage.i0m i0mVar = (defpackage.i0m) it.next();
                if ((i0mVar instanceof defpackage.h0m) && ((defpackage.h0m) i0mVar).a.getId().equals(c3mVar)) {
                    break;
                } else {
                    i4++;
                }
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i4);
            defpackage.wbe wbeVar = null;
            if (i4 < 0) {
                numValueOf = null;
            }
            boolean zG = gllVar.g(kzmVar.b);
            java.lang.Object objW = gllVar.W();
            java.lang.Object obj = defpackage.r9d.a;
            if (zG || objW == obj) {
                gllVar.w0(c3mVar);
                objW = c3mVar;
            }
            defpackage.c3m c3mVar2 = (defpackage.c3m) objW;
            java.lang.Integer num = numValueOf;
            kzmVar2 = kzmVar;
            defpackage.npu npuVarD0 = defpackage.gyo.d0(new defpackage.jzm(c3mVar, num, defpackage.jzo.T(c3mVar, c3mVar2), kzmVar2, list, i), gllVar);
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(kzmVar2.c);
            int i5 = i3 & 7168;
            boolean zI = (i5 == 2048) | gllVar.i(npuVarD0);
            java.lang.Object objW2 = gllVar.W();
            if (zI || objW2 == obj) {
                objW2 = new defpackage.a1m(n8qVar, npuVarD0, wbeVar, b2);
                gllVar.w0(objW2);
            }
            defpackage.fhj0.j((defpackage.mjl) objW2, gllVar, numValueOf2);
            boolean zI2 = gllVar.i(npuVarD0) | (i5 == 2048);
            java.lang.Object objW3 = gllVar.W();
            if (zI2 || objW3 == obj) {
                objW3 = new defpackage.b1m(npuVarD0, n8qVar, (defpackage.wbe) null);
                gllVar.w0(objW3);
            }
            defpackage.fhj0.j((defpackage.mjl) objW3, gllVar, n8qVar);
            defpackage.npu npuVarD1 = defpackage.gyo.d0(new defpackage.bjf0(defpackage.jzo.T(c3mVar, c3mVar2) ? num : null, java.lang.Integer.valueOf(defpackage.bx0.I(list)), java.lang.Integer.valueOf(i)), gllVar);
            boolean zI3 = gllVar.i(npuVarD1) | (i5 == 2048);
            java.lang.Object objW4 = gllVar.W();
            if (zI3 || objW4 == obj) {
                objW4 = new defpackage.b1m(n8qVar, npuVarD1, (defpackage.wbe) null);
                gllVar.w0(objW4);
            }
            defpackage.fhj0.j((defpackage.mjl) objW4, gllVar, n8qVar);
        } else {
            kzmVar2 = kzmVar;
            gllVar.e0();
        }
        defpackage.ua20 ua20VarZ = gllVar.z();
        if (ua20VarZ != null) {
            ua20VarZ.d = new defpackage.xwa(c3mVar, kzmVar2, list, n8qVar, i, i2);
        }
    }

    public static final void f(defpackage.n8q n8qVar, defpackage.sdx sdxVar, defpackage.gll gllVar, int i) {
        defpackage.gll gllVar2;
        gllVar.o0(-633194321);
        int i2 = (gllVar.i(n8qVar) ? 4 : 2) | i | (gllVar.i(sdxVar) ? 32 : 16);
        if (!gllVar.b0(i2 & 1, (i2 & 19) != 18)) {
            gllVar2 = gllVar;
            gllVar2.e0();
        } else if (n8qVar.j()) {
            gllVar.m0(4477571);
            defpackage.xxa xxaVar = defpackage.aya.a;
            gllVar2 = gllVar;
            defpackage.na1.i(0.0f, 48, 0, defpackage.aya.a(gllVar).O0, gllVar2, androidx.compose.ui.platform.a.a(defpackage.u3c0.u(defpackage.ueu.a, sdxVar), "go_to_more_below"));
            gllVar2.t(false);
        } else {
            gllVar2 = gllVar;
            gllVar2.m0(4621907);
            gllVar2.t(false);
        }
        defpackage.ua20 ua20VarZ = gllVar2.z();
        if (ua20VarZ != null) {
            ua20VarZ.d = new defpackage.wai(n8qVar, sdxVar, i, (byte) 17);
        }
    }

    public static final void g(defpackage.n950 n950Var, defpackage.lb1 lb1Var, java.util.List list, defpackage.gll gllVar, int i) {
        int i2;
        gllVar.o0(1876053116);
        if ((i & 6) == 0) {
            i2 = (gllVar.i(n950Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gllVar.i(lb1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & com.anthropic.voiceclient.VoiceClient.EVENT_REPLY_DRAINED) == 0 ? gllVar.i(list) : gllVar.k(list) ? com.anthropic.voiceclient.VoiceClient.EVENT_FIRST_AUDIO : com.anthropic.voiceclient.VoiceClient.LATE_TCP_LEFT_UNREAD;
        }
        int i3 = i2;
        if (gllVar.b0(i3 & 1, (i3 & 147) != 146)) {
            defpackage.ueu ueuVar = defpackage.ueu.a;
            defpackage.xeu xeuVarA = n950Var.a(1.0f, ueuVar, true);
            defpackage.pyc pycVarA = defpackage.nyc.a(new defpackage.tz1(4.0f, true, new defpackage.nu((byte) 7)), defpackage.xu20.o, gllVar, 6);
            int iHashCode = java.lang.Long.hashCode(gllVar.U);
            defpackage.udy udyVarO = gllVar.o();
            defpackage.xeu xeuVarH = defpackage.e08.H(gllVar, xeuVarA);
            defpackage.i9d.y.getClass();
            gllVar.q0();
            boolean z = gllVar.T;
            defpackage.vco vcoVar = defpackage.d1q.o0;
            if (z) {
                gllVar.n(vcoVar);
            } else {
                gllVar.z0();
            }
            defpackage.v6d v6dVar = defpackage.qxf0.h;
            defpackage.pvc0.o(v6dVar, gllVar, pycVarA);
            defpackage.v6d v6dVar2 = defpackage.qxf0.g;
            defpackage.pvc0.o(v6dVar2, gllVar, udyVarO);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iHashCode);
            defpackage.v6d v6dVar3 = defpackage.qxf0.i;
            defpackage.pvc0.o(v6dVar3, gllVar, numValueOf);
            defpackage.pvc0.m(gllVar);
            defpackage.v6d v6dVar4 = defpackage.qxf0.f;
            defpackage.pvc0.o(v6dVar4, gllVar, xeuVarH);
            defpackage.d850 d850VarA = defpackage.g750.a(defpackage.c0a0.d, defpackage.xu20.l, gllVar, 0);
            int iHashCode2 = java.lang.Long.hashCode(gllVar.U);
            defpackage.udy udyVarO2 = gllVar.o();
            defpackage.xeu xeuVarH2 = defpackage.e08.H(gllVar, ueuVar);
            gllVar.q0();
            if (gllVar.T) {
                gllVar.n(vcoVar);
            } else {
                gllVar.z0();
            }
            defpackage.pvc0.o(v6dVar, gllVar, d850VarA);
            defpackage.pvc0.o(v6dVar2, gllVar, udyVarO2);
            defpackage.h4a.v(iHashCode2, gllVar, v6dVar3, gllVar);
            defpackage.pvc0.o(v6dVar4, gllVar, xeuVarH2);
            defpackage.l8i.b(defpackage.p950.a, lb1Var.b, null, null, lb1Var, null, null, gllVar, 6 | ((i3 << 9) & 57344), 54);
            gllVar.t(true);
            defpackage.nbl0.d(list, null, gllVar, (i3 >> 6) & 14, 2);
            gllVar.t(true);
        } else {
            gllVar.e0();
        }
        defpackage.ua20 ua20VarZ = gllVar.z();
        if (ua20VarZ != null) {
            ua20VarZ.d = new defpackage.fce(n950Var, lb1Var, list, i);
        }
    }

    public static final void h(int i, defpackage.gll gllVar, java.lang.String str, boolean z) {
        gllVar.o0(1511725094);
        int i2 = (gllVar.i(str) ? 4 : 2) | i | (gllVar.j(z) ? 32 : 16);
        if (gllVar.b0(i2 & 1, (i2 & 19) != 18)) {
            defpackage.xxa xxaVar = defpackage.aya.a;
            defpackage.fkd0.b(str, defpackage.u3c0.z(defpackage.u3c0.u(defpackage.ueu.a, defpackage.l8i.e), 0.0f, 0.0f, z ? 8.0f : 0.0f, 0.0f, 11), defpackage.bkw.c(defpackage.aya.a(gllVar).a.m0(), gllVar, ((java.lang.Boolean) gllVar.m(defpackage.bkw.a)).booleanValue()), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, (defpackage.nld0) ((defpackage.dj9) defpackage.aya.b(gllVar).m.a).m, gllVar, i2 & 14, 24960, 110584);
        } else {
            gllVar.e0();
        }
        defpackage.ua20 ua20VarZ = gllVar.z();
        if (ua20VarZ != null) {
            ua20VarZ.d = new defpackage.mi6(str, z, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object i(defpackage.n8q n8qVar, int i, int i2, int i3, int i4, defpackage.ybe ybeVar) {
        defpackage.e1m e1mVar;
        java.lang.Object next;
        int iJ;
        java.lang.Object next2;
        int iMin;
        if (ybeVar instanceof defpackage.e1m) {
            e1mVar = (defpackage.e1m) ybeVar;
            int i5 = e1mVar.P;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                e1mVar.P = i5 - Integer.MIN_VALUE;
            } else {
                e1mVar = new defpackage.e1m(ybeVar);
            }
        } else {
            e1mVar = new defpackage.e1m(ybeVar);
        }
        java.lang.Object obj = e1mVar.O;
        int i6 = e1mVar.P;
        defpackage.puf0 puf0Var = defpackage.puf0.a;
        defpackage.s9f s9fVar = defpackage.s9f.a;
        if (i6 == 0) {
            defpackage.kyo.d0(obj);
            defpackage.c8q c8qVarR = n8qVar.r();
            java.util.Iterator it = c8qVarR.n.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((defpackage.d8q) next).a != i);
            defpackage.d8q d8qVar = (defpackage.d8q) next;
            defpackage.d8q d8qVar2 = (defpackage.d8q) defpackage.lwc.b1(c8qVarR.n);
            iJ = i < i2 ? j(c8qVarR, d8qVar, i3) : 0;
            if (d8qVar == null && d8qVar2 != null && i > d8qVar2.a) {
                int i7 = (d8qVar2.q - (c8qVarR.p - c8qVarR.o)) + iJ;
                e1mVar.n = n8qVar;
                e1mVar.o = i;
                e1mVar.p = i2;
                e1mVar.q = i3;
                e1mVar.r = i4;
                e1mVar.s = iJ;
                e1mVar.P = 1;
                if (n8qVar.o(i, i7, e1mVar) != s9fVar) {
                }
            }
            return s9fVar;
        }
        if (i6 != 1) {
            if (i6 == 2) {
                defpackage.kyo.d0(obj);
                return puf0Var;
            }
            defpackage.nu.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i8 = e1mVar.s;
        i4 = e1mVar.r;
        i3 = e1mVar.q;
        i2 = e1mVar.p;
        i = e1mVar.o;
        defpackage.n8q n8qVar2 = e1mVar.n;
        defpackage.kyo.d0(obj);
        iJ = i8;
        n8qVar = n8qVar2;
        java.util.Iterator it2 = n8qVar.r().n.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((defpackage.d8q) next2).a != i);
        defpackage.d8q d8qVar3 = (defpackage.d8q) next2;
        if (d8qVar3 != null && (iMin = java.lang.Math.min(((d8qVar3.p + d8qVar3.q) + iJ) - n8qVar.r().p, i4)) > 0) {
            e1mVar.n = null;
            e1mVar.o = i;
            e1mVar.p = i2;
            e1mVar.q = i3;
            e1mVar.r = i4;
            e1mVar.s = iJ;
            e1mVar.P = 2;
            if (defpackage.k4p.l(n8qVar, iMin, defpackage.e08.Z(0.0f, 0.0f, null, 7), e1mVar) == s9fVar) {
                return s9fVar;
            }
        }
        return puf0Var;
    }

    public static final int j(defpackage.c8q c8qVar, defpackage.d8q d8qVar, int i) {
        int i2 = c8qVar.p - c8qVar.o;
        if (d8qVar == null) {
            d8qVar = (defpackage.d8q) defpackage.lwc.b1(c8qVar.n);
        }
        return defpackage.s5p.z((i2 - (d8qVar != null ? d8qVar.q : 0)) / 2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0060 -> B:20:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object k(defpackage.n8q r6, defpackage.hjl r7, defpackage.ybe r8) {
        /*
            boolean r0 = r8 instanceof defpackage.f1m
            if (r0 == 0) goto L13
            r0 = r8
            f1m r0 = (defpackage.f1m) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            f1m r0 = new f1m
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.q
            int r1 = r0.r
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            dg20 r6 = r0.p
            hjl r7 = r0.o
            n8q r1 = r0.n
            defpackage.kyo.d0(r8)
            r8 = r6
            r6 = r1
            goto L63
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.nu.p(r6)
            return r2
        L34:
            dg20 r8 = defpackage.prw.l(r8)
            java.lang.Object r1 = r7.invoke()
            r8.a = r1
        L3e:
            java.lang.Object r1 = r8.a
            jzm r1 = (defpackage.jzm) r1
            java.lang.Integer r1 = r1.b
            if (r1 == 0) goto L7e
            int r1 = r1.intValue()
            java.lang.Object r4 = r8.a
            jzm r4 = (defpackage.jzm) r4
            java.util.List r5 = r4.e
            int r4 = r4.f
            r0.n = r6
            r0.o = r7
            r0.p = r8
            r0.r = r3
            java.lang.Object r1 = p(r6, r1, r5, r4, r0)
            s9f r4 = defpackage.s9f.a
            if (r1 != r4) goto L63
            return r4
        L63:
            java.lang.Object r1 = r7.invoke()
            r4 = r1
            jzm r4 = (defpackage.jzm) r4
            java.lang.Object r5 = r8.a
            jzm r5 = (defpackage.jzm) r5
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L75
            goto L76
        L75:
            r1 = r2
        L76:
            jzm r1 = (defpackage.jzm) r1
            if (r1 != 0) goto L7b
            goto L7e
        L7b:
            r8.a = r1
            goto L3e
        L7e:
            puf0 r6 = defpackage.puf0.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h1m.k(n8q, hjl, ybe):java.lang.Object");
    }

    public static final defpackage.oo7 l(int i) {
        switch (defpackage.prw.F(i)) {
            case 0:
                return defpackage.oo7.d.J0;
            case 1:
                return defpackage.oo7.d.n1;
            case 2:
                return defpackage.oo7.d.m3;
            case 3:
                return defpackage.oo7.d.c3;
            case 4:
                return defpackage.oo7.d.N;
            case 5:
                return defpackage.oo7.d.R;
            case 6:
                return defpackage.oo7.d.f3;
            case 7:
                return defpackage.oo7.d.G1;
            default:
                defpackage.jcf0.u();
                return null;
        }
    }

    public static final java.lang.String m(defpackage.i0m i0mVar) {
        java.lang.String str;
        if (!(i0mVar instanceof defpackage.g0m)) {
            if (i0mVar instanceof defpackage.h0m) {
                return o(((defpackage.h0m) i0mVar).a.getId());
            }
            defpackage.jcf0.u();
            return null;
        }
        switch (((defpackage.g0m) i0mVar).a) {
            case 1:
                str = "Recents";
                break;
            case 2:
                str = "Projects";
                break;
            case 3:
                str = "TopMatches";
                break;
            case 4:
                str = "Chats";
                break;
            case 5:
                str = "Commands";
                break;
            case 6:
                str = "More";
                break;
            case 7:
                str = "NewChat";
                break;
            default:
                str = "null";
                break;
        }
        return "header:".concat(str);
    }

    public static final java.lang.String n(defpackage.u2m u2mVar, defpackage.gll gllVar) {
        int i;
        int iOrdinal = ((defpackage.sie) gllVar.m(defpackage.tie.a)).ordinal();
        if (iOrdinal == 0) {
            i = org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f140fb4;
        } else {
            if (iOrdinal != 1) {
                defpackage.jcf0.u();
                return null;
            }
            i = org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f140fb5;
        }
        return defpackage.eap.b0(i, new java.lang.Object[]{defpackage.e4d0.l(1, u2mVar.a)}, gllVar);
    }

    public static final java.lang.String o(defpackage.c3m c3mVar) {
        java.lang.String str;
        if (c3mVar instanceof defpackage.z2m) {
            defpackage.f0m f0mVar = ((defpackage.z2m) c3mVar).a;
            if (f0mVar instanceof defpackage.c0m) {
                return defpackage.iqa0.t("chat:", ((defpackage.c0m) f0mVar).a);
            }
            if (f0mVar instanceof defpackage.e0m) {
                return defpackage.iqa0.t("session:", ((defpackage.e0m) f0mVar).a);
            }
            if (f0mVar instanceof defpackage.d0m) {
                return defpackage.iqa0.t("project:", ((defpackage.d0m) f0mVar).a);
            }
            defpackage.jcf0.u();
            return null;
        }
        if (!(c3mVar instanceof defpackage.y2m)) {
            if (!(c3mVar instanceof defpackage.b3m)) {
                if (defpackage.jzo.T(c3mVar, defpackage.a3m.a)) {
                    return "new_chat";
                }
                defpackage.jcf0.u();
                return null;
            }
            defpackage.r2m r2mVar = ((defpackage.b3m) c3mVar).a;
            if (r2mVar instanceof defpackage.p2m) {
                return defpackage.iqa0.t("section:", ((defpackage.p2m) r2mVar).a);
            }
            if (r2mVar instanceof defpackage.q2m) {
                return defpackage.iqa0.t("settings_page:", ((defpackage.q2m) r2mVar).a);
            }
            if (r2mVar instanceof defpackage.o2m) {
                return defpackage.iqa0.t("code_project:", ((defpackage.o2m) r2mVar).a);
            }
            if (r2mVar instanceof defpackage.n2m) {
                return defpackage.iqa0.t("artifact:", ((defpackage.n2m) r2mVar).a);
            }
            defpackage.jcf0.u();
            return null;
        }
        switch (((defpackage.y2m) c3mVar).a) {
            case 1:
                str = "NewChat";
                break;
            case 2:
                str = "NewIncognitoChat";
                break;
            case 3:
                str = "ToggleSidebar";
                break;
            case 4:
                str = "SearchChats";
                break;
            case 5:
                str = "NextChat";
                break;
            case 6:
                str = "PreviousChat";
                break;
            case 7:
                str = "Settings";
                break;
            case 8:
                str = "Help";
                break;
            default:
                throw null;
        }
        return "command:".concat(str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
    
        if (i(r13, r7, r0, r9, Integer.MAX_VALUE, r11) == r12) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(defpackage.n8q r17, int r18, java.util.List r19, int r20, defpackage.ybe r21) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h1m.p(n8q, int, java.util.List, int, ybe):java.lang.Object");
    }

    public static final java.lang.String q(defpackage.v2m v2mVar, defpackage.x2m x2mVar, defpackage.gll gllVar) {
        java.util.Map map = x2mVar.e;
        defpackage.m2m m2mVar = v2mVar.a;
        defpackage.f2m f2mVar = (defpackage.f2m) map.get(m2mVar.a);
        java.lang.String strB0 = null;
        java.lang.String str = f2mVar != null ? f2mVar.c : null;
        if (str == null) {
            gllVar.m0(-1273325938);
        } else {
            gllVar.m0(-1273325937);
            strB0 = defpackage.eap.b0(org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f140fb9, new java.lang.Object[]{m2mVar.b, str}, gllVar);
        }
        gllVar.t(false);
        return strB0 == null ? m2mVar.b : strB0;
    }

    public static final java.lang.String r(defpackage.gll gllVar, java.lang.String str, java.util.List list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        gllVar.m0(-76133750);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.np7 np7Var = (defpackage.np7) it.next();
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(defpackage.nbl0.P(np7Var, gllVar));
        }
        gllVar.t(false);
        return defpackage.eap.b0(org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f140fa1, new java.lang.Object[]{str, sb.toString()}, gllVar);
    }

    public static final defpackage.lb1 s(java.lang.String str, java.lang.String str2) {
        return defpackage.s4l0.z(str, defpackage.bx0.R(new defpackage.m8l(str).a(defpackage.ijd0.c(str2))), new defpackage.l0b0(0L, 0L, defpackage.ybl.h, (defpackage.rbl) null, (defpackage.sbl) null, (defpackage.sal) null, (java.lang.String) null, 0L, (defpackage.vu4) null, (defpackage.qjd0) null, (defpackage.xor) null, 0L, (defpackage.fed0) null, (defpackage.gb90) null, 65531));
    }

    public static final java.lang.String t(defpackage.k0m k0mVar, defpackage.gll gllVar) {
        switch (k0mVar.ordinal()) {
            case 0:
                return defpackage.prw.o(gllVar, 945076879, org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f140fb6, gllVar, false);
            case 1:
                return defpackage.prw.o(gllVar, 945079216, org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f140fb0, gllVar, false);
            case 2:
                return defpackage.prw.o(gllVar, 945081816, org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f140fb1, gllVar, false);
            case 3:
                gllVar.m0(945086312);
                java.lang.String str = defpackage.q9l0.z(defpackage.fdj.a, gllVar).b;
                gllVar.t(false);
                return str;
            case 4:
                return defpackage.prw.o(gllVar, 945087476, org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f140fb2, gllVar, false);
            case 5:
                return defpackage.prw.o(gllVar, 945089944, org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f140fb7, gllVar, false);
            case 6:
                return defpackage.prw.o(gllVar, 945095022, org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f140fbc, gllVar, false);
            case 7:
                return defpackage.prw.o(gllVar, 945092626, org.chromium.net.R.string._0_resource_name_obfuscated_res_0x7f140fbb, gllVar, false);
            default:
                throw defpackage.prw.v(945075804, gllVar, false);
        }
    }
}
