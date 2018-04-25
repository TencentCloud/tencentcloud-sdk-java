package com.tencentcloudapi.cbs.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ResizeDiskRequest  extends AbstractModel{


    /**
    * 云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;
    

    /**
    * 扩容后的磁盘大小。必须大于当前值，最大值为4000G，步长为10G。
    */
    @SerializedName("DiskSize")
    @Expose
    private Integer DiskSize;
    

    /**
     * 获取云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。
     * @return DiskId 云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * 设置云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。
     * @param DiskId 云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * 获取扩容后的磁盘大小。必须大于当前值，最大值为4000G，步长为10G。
     * @return DiskSize 扩容后的磁盘大小。必须大于当前值，最大值为4000G，步长为10G。
     */
    public Integer getDiskSize() {
        return this.DiskSize;
    }

    /**
     * 设置扩容后的磁盘大小。必须大于当前值，最大值为4000G，步长为10G。
     * @param DiskSize 扩容后的磁盘大小。必须大于当前值，最大值为4000G，步长为10G。
     */
    public void setDiskSize(Integer DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

