package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class InternetChargeTypeConfig  extends AbstractModel{


    /**
    * 网络计费模式。
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * 网络计费模式描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * 获取网络计费模式。
     * @return InternetChargeType 网络计费模式。
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * 设置网络计费模式。
     * @param InternetChargeType 网络计费模式。
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * 获取网络计费模式描述信息。
     * @return Description 网络计费模式描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置网络计费模式描述信息。
     * @param Description 网络计费模式描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

