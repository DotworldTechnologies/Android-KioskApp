package in.dotworld.kiosk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public class AdminReceiver extends android.app.admin.DeviceAdminReceiver {

    @Override
    public void onProfileProvisioningComplete(Context context, Intent intent) {
    }
    public static ComponentName getComponentName(Context context) {
        return new ComponentName(context.getApplicationContext(), AdminReceiver.class);
    }
}
