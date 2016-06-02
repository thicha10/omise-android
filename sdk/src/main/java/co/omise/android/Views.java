package co.omise.android;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

final class Views {
    private final Activity activity;
    private final ViewGroup parent;

    public Views(Activity activity) {
        this.activity = activity;
        this.parent = null;
    }

    public Views(ViewGroup parent) {
        this.activity = null;
        this.parent = parent;
    }

    public Spinner spinner(int id) {
        return this.<Spinner>find(id);
    }

    public EditText editText(int id) {
        return this.<EditText>find(id);
    }

    public ImageView image(int id) {
        return this.<ImageView>find(id);
    }

    public <T> T find(int id) {
        if (activity != null) {
            return (T) activity.findViewById(id);
        } else {
            return (T) parent.findViewById(id);
        }
    }
}
