package skin.support.widget;

import skin.support.utils.SkinLog;

/**
 * Created by ximsfei on 2017/1/13.
 */

public abstract class SkinCompatHelper {
    protected static final String TAG = SkinCompatHelper.class.getSimpleName();
    protected static final String SYSTEM_ID_PREFIX = "1";
    public static final int INVALID_ID = 0;

    @Deprecated
    public static int checkResourceId(int resId) {
        String hexResId = Integer.toHexString(resId);
        SkinLog.d(TAG, "hexResId = " + hexResId);
        return hexResId.startsWith(SYSTEM_ID_PREFIX) ? INVALID_ID : resId;
    }

    abstract public void applySkin();
}
