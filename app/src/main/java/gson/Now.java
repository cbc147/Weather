package gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 成 on 2017/6/17.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
