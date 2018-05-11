package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AppAddUserResponse  extends AbstractModel{


    /**
    * 应用用户
    */
    @SerializedName("AppUser")
    @Expose
    private AppUser AppUser;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取应用用户
     * @return AppUser 应用用户
     */
    public AppUser getAppUser() {
        return this.AppUser;
    }

    /**
     * 设置应用用户
     * @param AppUser 应用用户
     */
    public void setAppUser(AppUser AppUser) {
        this.AppUser = AppUser;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AppUser.", this.AppUser);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

