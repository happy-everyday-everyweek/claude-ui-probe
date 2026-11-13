package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
public class SearchView$SearchAutoComplete extends android.widget.AutoCompleteTextView {
    public static final int[] g = {android.R.attr.popupBackground};
    public final defpackage.cbf0 a;
    public final defpackage.jj1 b;
    public final defpackage.vo40 c;
    public int d;
    public boolean e;
    public final defpackage.sn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchView$SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, org.chromium.net.R.attr._0_resource_name_obfuscated_res_0x7f040045);
        java.lang.Object obj = defpackage.she0.a;
        if (!(context.getResources() instanceof defpackage.the0)) {
            context.getResources();
            int i = defpackage.asg0.a;
        }
        defpackage.tmd0.a(this, getContext());
        android.content.Context context2 = getContext();
        int i2 = 0;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, g, org.chromium.net.R.attr._0_resource_name_obfuscated_res_0x7f040045, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setDropDownBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : defpackage.ppj0.o(context2, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
        defpackage.cbf0 cbf0Var = new defpackage.cbf0(this);
        this.a = cbf0Var;
        cbf0Var.l(attributeSet, org.chromium.net.R.attr._0_resource_name_obfuscated_res_0x7f040045);
        defpackage.jj1 jj1Var = new defpackage.jj1(this);
        this.b = jj1Var;
        jj1Var.d(attributeSet, org.chromium.net.R.attr._0_resource_name_obfuscated_res_0x7f040045);
        jj1Var.b();
        defpackage.vo40 vo40Var = new defpackage.vo40(this);
        this.c = vo40Var;
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, defpackage.ik10.b, org.chromium.net.R.attr._0_resource_name_obfuscated_res_0x7f040045, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes2.hasValue(14) ? typedArrayObtainStyledAttributes2.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes2.recycle();
            defpackage.lsi lsiVar = (defpackage.lsi) ((defpackage.t8d) vo40Var.b).c;
            if (lsiVar.c != z) {
                if (lsiVar.b != null) {
                    defpackage.hri hriVarA = defpackage.hri.a();
                    defpackage.ksi ksiVar = lsiVar.b;
                    defpackage.q02 q02Var = hriVarA.b;
                    defpackage.n290.k(ksiVar, "initCallback cannot be null");
                    java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = hriVarA.a;
                    reentrantReadWriteLock.writeLock().lock();
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        q02Var.getClass();
                        defpackage.h02 h02Var = new defpackage.h02(q02Var);
                        while (h02Var.hasNext()) {
                            defpackage.fri friVar = (defpackage.fri) h02Var.next();
                            if (friVar.a == ksiVar) {
                                arrayList.add(friVar);
                            }
                        }
                        int size = arrayList.size();
                        while (i2 < size) {
                            java.lang.Object obj2 = arrayList.get(i2);
                            i2++;
                            q02Var.remove((defpackage.fri) obj2);
                        }
                        reentrantReadWriteLock.writeLock().unlock();
                    } catch (java.lang.Throwable th) {
                        reentrantReadWriteLock.writeLock().unlock();
                        throw th;
                    }
                }
                lsiVar.c = z;
                if (z) {
                    defpackage.lsi.a(lsiVar.a, defpackage.hri.a().c());
                }
            }
            defpackage.vo40 vo40Var2 = this.c;
            android.text.method.KeyListener keyListener = getKeyListener();
            vo40Var2.getClass();
            if (!(keyListener instanceof android.text.method.NumberKeyListener)) {
                boolean zIsFocusable = super.isFocusable();
                boolean zIsClickable = super.isClickable();
                boolean zIsLongClickable = super.isLongClickable();
                int inputType = super.getInputType();
                android.text.method.KeyListener keyListenerL = vo40Var2.l(keyListener);
                if (keyListenerL != keyListener) {
                    super.setKeyListener(keyListenerL);
                    super.setRawInputType(inputType);
                    super.setFocusable(zIsFocusable);
                    super.setClickable(zIsClickable);
                    super.setLongClickable(zIsLongClickable);
                }
            }
            this.f = new defpackage.sn(this, (byte) 8);
            this.d = getThreshold();
        } catch (java.lang.Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public final android.view.inputmethod.InputConnection a(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (android.view.ViewParent parent = getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            }
        }
        defpackage.t8d t8dVar = (defpackage.t8d) this.c.b;
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        return inputConnectionOnCreateInputConnection instanceof defpackage.mri ? inputConnectionOnCreateInputConnection : new defpackage.mri((androidx.appcompat.widget.SearchView$SearchAutoComplete) t8dVar.b, inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        defpackage.cbf0 cbf0Var = this.a;
        if (cbf0Var != null) {
            cbf0Var.b();
        }
        defpackage.jj1 jj1Var = this.b;
        if (jj1Var != null) {
            jj1Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.d <= 0 || super.enoughToFilter();
    }

    @Override // android.widget.TextView
    public final android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        android.view.ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof defpackage.amd0 ? ((defpackage.amd0) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection inputConnectionA = a(editorInfo);
        if (this.e) {
            defpackage.sn snVar = this.f;
            removeCallbacks(snVar);
            post(snVar);
        }
        return inputConnectionA;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int i;
        super.onFinishInflate();
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        android.content.res.Configuration configuration = getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i2 < 960 || i3 < 720 || configuration.orientation != 2) {
            i = (i2 >= 600 || (i2 >= 640 && i3 >= 480)) ? 192 : 160;
        } else {
            i = com.anthropic.voiceclient.VoiceClient.EVENT_FIRST_AUDIO;
        }
        setMinWidth((int) android.util.TypedValue.applyDimension(1, i, displayMetrics));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, android.view.KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(java.lang.CharSequence charSequence) {
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        defpackage.cbf0 cbf0Var = this.a;
        if (cbf0Var != null) {
            cbf0Var.a = -1;
            cbf0Var.r(null);
            cbf0Var.b();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        android.content.res.ColorStateList colorStateListG;
        super.setBackgroundResource(i);
        defpackage.cbf0 cbf0Var = this.a;
        if (cbf0Var != null) {
            cbf0Var.a = i;
            defpackage.cj1 cj1Var = (defpackage.cj1) cbf0Var.c;
            if (cj1Var != null) {
                android.content.Context context = ((android.widget.TextView) cbf0Var.b).getContext();
                synchronized (cj1Var) {
                    colorStateListG = cj1Var.a.g(context, i);
                }
            } else {
                colorStateListG = null;
            }
            cbf0Var.r(colorStateListG);
            cbf0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        defpackage.jj1 jj1Var = this.b;
        if (jj1Var != null) {
            jj1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        defpackage.jj1 jj1Var = this.b;
        if (jj1Var != null) {
            jj1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT <= 27 && !(callback instanceof defpackage.amd0) && callback != null) {
            callback = new defpackage.amd0(callback, this);
        }
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(defpackage.ppj0.o(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(android.text.method.KeyListener keyListener) {
        super.setKeyListener(this.c.l(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        defpackage.jj1 jj1Var = this.b;
        if (jj1Var != null) {
            jj1Var.e(context, i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setThreshold(int i) {
        super.setThreshold(i);
        this.d = i;
    }

    public SearchView$SearchAutoComplete(android.content.Context context) {
        this(context, null);
    }
}
