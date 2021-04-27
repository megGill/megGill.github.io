package com.meghangillwrites.stormyhour.databinding;
import com.meghangillwrites.stormyhour.R;
import com.meghangillwrites.stormyhour.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.locationLabel, 1);
        sViewsWithIds.put(R.id.hourlyListItems, 2);
        sViewsWithIds.put(R.id.mainTime, 3);
        sViewsWithIds.put(R.id.mainWeatherIcon, 4);
        sViewsWithIds.put(R.id.mainTemperature, 5);
        sViewsWithIds.put(R.id.mainTempDegree, 6);
        sViewsWithIds.put(R.id.mainRealFealTempLabel, 7);
        sViewsWithIds.put(R.id.mainRealFealTempValue, 8);
        sViewsWithIds.put(R.id.mainRealFeelTempDegree, 9);
        sViewsWithIds.put(R.id.mainPrecipImage, 10);
        sViewsWithIds.put(R.id.mainPrecipChanceValue, 11);
        sViewsWithIds.put(R.id.accuweatherAttribution, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[12]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[11]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.hour == variableId) {
            setHour((com.meghangillwrites.stormyhour.weather.Hour) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHour(@Nullable com.meghangillwrites.stormyhour.weather.Hour Hour) {
        this.mHour = Hour;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): hour
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}