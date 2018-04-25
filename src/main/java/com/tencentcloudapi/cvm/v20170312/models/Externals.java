package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Externals  extends AbstractModel{


    /**
    * 释放地址
    */
    @SerializedName("ReleaseAddress")
    @Expose
    private Boolean ReleaseAddress;
    

    /**
     * 获取释放地址
     * @return ReleaseAddress 释放地址
     */
    public Boolean getReleaseAddress() {
        return this.ReleaseAddress;
    }

    /**
     * 设置释放地址
     * @param ReleaseAddress 释放地址
     */
    public void setReleaseAddress(Boolean ReleaseAddress) {
        this.ReleaseAddress = ReleaseAddress;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReleaseAddress", this.ReleaseAddress);

    }
}

