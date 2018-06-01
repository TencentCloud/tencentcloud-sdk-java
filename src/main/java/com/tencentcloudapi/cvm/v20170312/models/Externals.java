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
    * 不支持的网络类型
    */
    @SerializedName("UnsupportNetworks")
    @Expose
    private String [] UnsupportNetworks;
    

    /**
    * HDD本地存储属性
    */
    @SerializedName("StorageBlockAttr")
    @Expose
    private StorageBlock StorageBlockAttr;
    

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
     * 获取不支持的网络类型
     * @return UnsupportNetworks 不支持的网络类型
     */
    public String [] getUnsupportNetworks() {
        return this.UnsupportNetworks;
    }

    /**
     * 设置不支持的网络类型
     * @param UnsupportNetworks 不支持的网络类型
     */
    public void setUnsupportNetworks(String [] UnsupportNetworks) {
        this.UnsupportNetworks = UnsupportNetworks;
    }

    /**
     * 获取HDD本地存储属性
     * @return StorageBlockAttr HDD本地存储属性
     */
    public StorageBlock getStorageBlockAttr() {
        return this.StorageBlockAttr;
    }

    /**
     * 设置HDD本地存储属性
     * @param StorageBlockAttr HDD本地存储属性
     */
    public void setStorageBlockAttr(StorageBlock StorageBlockAttr) {
        this.StorageBlockAttr = StorageBlockAttr;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReleaseAddress", this.ReleaseAddress);
        this.setParamArraySimple(map, prefix + "UnsupportNetworks.", this.UnsupportNetworks);
        this.setParamObj(map, prefix + "StorageBlockAttr.", this.StorageBlockAttr);

    }
}

