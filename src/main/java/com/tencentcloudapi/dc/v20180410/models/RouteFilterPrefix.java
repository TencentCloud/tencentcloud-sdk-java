package com.tencentcloudapi.dc.v20180410.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class RouteFilterPrefix  extends AbstractModel{


    /**
    * 用户侧网段地址
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
     * 获取用户侧网段地址
     * @return Cidr 用户侧网段地址
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * 设置用户侧网段地址
     * @param Cidr 用户侧网段地址
     */
    public void setCidr(String Cidr) {
        this.Cidr = Cidr;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cidr", this.Cidr);

    }
}

