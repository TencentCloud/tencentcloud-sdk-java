package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteScanInstancesRequest  extends AbstractModel{


    /**
    * 删除一个或多个扫描的app，最大支持20个
    */
    @SerializedName("AppSids")
    @Expose
    private String [] AppSids;

    /**
     * 获取删除一个或多个扫描的app，最大支持20个
     * @return AppSids 删除一个或多个扫描的app，最大支持20个
     */
    public String [] getAppSids() {
        return this.AppSids;
    }

    /**
     * 设置删除一个或多个扫描的app，最大支持20个
     * @param AppSids 删除一个或多个扫描的app，最大支持20个
     */
    public void setAppSids(String [] AppSids) {
        this.AppSids = AppSids;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AppSids.", this.AppSids);

    }
}

