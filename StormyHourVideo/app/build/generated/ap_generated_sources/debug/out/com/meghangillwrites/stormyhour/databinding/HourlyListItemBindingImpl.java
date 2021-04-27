package com.meghangillwrites.stormyhour.databinding;
import com.meghangillwrites.stormyhour.R;
import com.meghangillwrites.stormyhour.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HourlyListItemBindingImpl extends HourlyListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tempDegreeImageView, 6);
        sViewsWithIds.put(R.id.realFealTempLabel, 7);
        sViewsWithIds.put(R.id.realFeelTempDegree, 8);
        sViewsWithIds.put(R.id.precipImage, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HourlyListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private HourlyListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            );
        this.hourlyListView.setTag(null);
        this.precipChanceValue.setTag(null);
        this.realFealTempValue.setTag(null);
        this.temperatureLabel.setTag(null);
        this.timeLabel.setTag(null);
        this.weatherIconImageView.setTag(null);
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
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.hour);
        super.requestRebind();
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
        double hourTemperature = 0.0;
        java.lang.String stringValueOfMathRoundHourRealFeelTemp = null;
        java.lang.String stringValueOfHourPrecipitation = null;
        java.lang.String stringValueOfHourPrecipitationJavaLangString = null;
        java.lang.String hourTime = null;
        java.lang.String stringValueOfHourTime = null;
        int hourPrecipitation = 0;
        int hourIconID = 0;
        com.meghangillwrites.stormyhour.weather.Hour hour = mHour;
        java.lang.String stringValueOfMathRoundHourTemperature = null;
        double hourRealFeelTemp = 0.0;
        long mathRoundHourTemperature = 0;
        long mathRoundHourRealFeelTemp = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (hour != null) {
                    // read hour.temperature
                    hourTemperature = hour.getTemperature();
                    // read hour.time
                    hourTime = hour.getTime();
                    // read hour.precipitation
                    hourPrecipitation = hour.getPrecipitation();
                    // read hour.iconID
                    hourIconID = hour.getIconID();
                    // read hour.realFeelTemp
                    hourRealFeelTemp = hour.getRealFeelTemp();
                }


                // read Math.round(hour.temperature)
                mathRoundHourTemperature = java.lang.Math.round(hourTemperature);
                // read String.valueOf(hour.time)
                stringValueOfHourTime = java.lang.String.valueOf(hourTime);
                // read String.valueOf(hour.precipitation)
                stringValueOfHourPrecipitation = java.lang.String.valueOf(hourPrecipitation);
                // read Math.round(hour.realFeelTemp)
                mathRoundHourRealFeelTemp = java.lang.Math.round(hourRealFeelTemp);


                // read String.valueOf(Math.round(hour.temperature))
                stringValueOfMathRoundHourTemperature = java.lang.String.valueOf(mathRoundHourTemperature);
                // read (String.valueOf(hour.precipitation)) + (" % ")
                stringValueOfHourPrecipitationJavaLangString = (stringValueOfHourPrecipitation) + (" % ");
                // read String.valueOf(Math.round(hour.realFeelTemp))
                stringValueOfMathRoundHourRealFeelTemp = java.lang.String.valueOf(mathRoundHourRealFeelTemp);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.precipChanceValue, stringValueOfHourPrecipitationJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.realFealTempValue, stringValueOfMathRoundHourRealFeelTemp);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.temperatureLabel, stringValueOfMathRoundHourTemperature);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.timeLabel, stringValueOfHourTime);
            this.weatherIconImageView.setImageResource(hourIconID);
        }
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