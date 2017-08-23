package com.shuhao.uiimageview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView;

/**
 * Created by luke on 17-6-29.
 */

@SuppressLint("AppCompatCustomView")
public class UIImageView extends ImageView {

    public UIImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        int src_resource = attrs.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "src", 0);
        if (src_resource != 0) {
            this.setImageResource(src_resource);
        }
    }

    @Override
    public void setImageResource(@DrawableRes int resId) {
        super.setImageBitmap(decodeResource(getResources(), resId));
        invalidate();
    }

    public static Bitmap decodeResource(Resources resources, int id) {
        int densityDpi = resources.getDisplayMetrics().densityDpi;
        Bitmap bitmap;
        TypedValue value = new TypedValue();
        resources.openRawResource(id, value);
        BitmapFactory.Options opts = new BitmapFactory.Options();
        opts.inPreferredConfig = Bitmap.Config.ALPHA_8;
        if (densityDpi > DisplayMetrics.DENSITY_HIGH) {
            opts.inTargetDensity = value.density;
            bitmap = BitmapFactory.decodeResource(resources, id, opts);
        } else {
            bitmap = BitmapFactory.decodeResource(resources, id);
        }
        return bitmap;
    }
}
