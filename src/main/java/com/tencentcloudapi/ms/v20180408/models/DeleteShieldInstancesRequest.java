package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteShieldInstancesRequest  extends AbstractModel{


    /**
    * 任务唯一标识ItemId的列表
    */
    @SerializedName("ItemIds")
    @Expose
    private String [] ItemIds;
    

    /**
     * 获取任务唯一标识ItemId的列表
     * @return ItemIds 任务唯一标识ItemId的列表
     */
    public String [] getItemIds() {
        return this.ItemIds;
    }

    /**
     * 设置任务唯一标识ItemId的列表
     * @param ItemIds 任务唯一标识ItemId的列表
     */
    public void setItemIds(String [] ItemIds) {
        this.ItemIds = ItemIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ItemIds.", this.ItemIds);

    }
}

