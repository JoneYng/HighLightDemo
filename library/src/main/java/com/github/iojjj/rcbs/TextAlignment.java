package com.github.iojjj.rcbs;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 文本对齐方式
 */
@IntDef({
        RoundedCornersBackgroundSpan.ALIGN_START,
        RoundedCornersBackgroundSpan.ALIGN_END,
        RoundedCornersBackgroundSpan.ALIGN_CENTER
})
@Retention(RetentionPolicy.SOURCE)
public @interface TextAlignment {
}
