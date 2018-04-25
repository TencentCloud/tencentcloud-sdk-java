package com.tencentcloudapi.cbs.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class InquiryPriceResizeDiskRequest  extends AbstractModel{


    /**
    * 云硬盘ID， 通过[DescribeDisks](/document/product/362/16315)接口查询。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;
    

    /**
    * 云硬盘扩容后的大小，单位为GB，不得小于当前云硬盘大小。
    */
    @SerializedName("DiskSize")
    @Expose
    private Integer DiskSize;
    

    /**
    * 云盘所属项目ID。 如传入则仅用于鉴权。
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;
    

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
     * 获取云硬盘扩容后的大小，单位为GB，不得小于当前云硬盘大小。
     * @return DiskSize 云硬盘扩容后的大小，单位为GB，不得小于当前云硬盘大小。
     */
    public Integer getDiskSize() {
        return this.DiskSize;
    }

    /**
     * 设置云硬盘扩容后的大小，单位为GB，不得小于当前云硬盘大小。
     * @param DiskSize 云硬盘扩容后的大小，单位为GB，不得小于当前云硬盘大小。
     */
    public void setDiskSize(Integer DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * 获取云盘所属项目ID。 如传入则仅用于鉴权。
     * @return ProjectId 云盘所属项目ID。 如传入则仅用于鉴权。
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置云盘所属项目ID。 如传入则仅用于鉴权。
     * @param ProjectId 云盘所属项目ID。 如传入则仅用于鉴权。
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

