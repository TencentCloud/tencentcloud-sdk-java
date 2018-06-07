package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeScanResultsRequest  extends AbstractModel{


    /**
    * 任务唯一标识
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;
    

    /**
    * 批量查询一个或者多个app的扫描结果，如果不传表示查询该任务下所提交的所有app
    */
    @SerializedName("AppMd5s")
    @Expose
    private String [] AppMd5s;
    

    /**
     * 获取任务唯一标识
     * @return ItemId 任务唯一标识
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * 设置任务唯一标识
     * @param ItemId 任务唯一标识
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * 获取批量查询一个或者多个app的扫描结果，如果不传表示查询该任务下所提交的所有app
     * @return AppMd5s 批量查询一个或者多个app的扫描结果，如果不传表示查询该任务下所提交的所有app
     */
    public String [] getAppMd5s() {
        return this.AppMd5s;
    }

    /**
     * 设置批量查询一个或者多个app的扫描结果，如果不传表示查询该任务下所提交的所有app
     * @param AppMd5s 批量查询一个或者多个app的扫描结果，如果不传表示查询该任务下所提交的所有app
     */
    public void setAppMd5s(String [] AppMd5s) {
        this.AppMd5s = AppMd5s;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamArraySimple(map, prefix + "AppMd5s.", this.AppMd5s);

    }
}

