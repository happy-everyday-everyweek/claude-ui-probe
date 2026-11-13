package android.support.v4.media;

/* JADX INFO: loaded from: classes2.dex */
class MediaBrowserCompat$SearchResultReceiver extends defpackage.od40 {
    @Override // defpackage.od40
    public final void a(int i, android.os.Bundle bundle) {
        if (bundle != null) {
            bundle = defpackage.ybt.P(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArray.length);
        for (android.os.Parcelable parcelable : parcelableArray) {
            arrayList.add((android.support.v4.media.MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
