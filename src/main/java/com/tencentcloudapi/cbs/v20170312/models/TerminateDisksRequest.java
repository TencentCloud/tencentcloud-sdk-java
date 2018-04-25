package com.tencentcloudapi.cbs.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class TerminateDisksRequest  extends AbstractModel{


    /**
    * 需退还的云盘ID列表。
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;
    

    /**
     * 获取需退还的云盘ID列表。
     * @return DiskIds 需退还的云盘ID列表。
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * 设置需退还的云盘ID列表。
     * @param DiskIds 需退还的云盘ID列表。
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);

    }
}

