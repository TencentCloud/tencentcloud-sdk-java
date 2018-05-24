package com.tencentcloudapi.cbs.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class InquiryPriceCreateDisksRequest  extends AbstractModel{


    /**
    * 云硬盘类型。取值范围：<br><li>普通云硬盘：CLOUD_BASIC<br><li>高性能云硬盘：CLOUD_PREMIUM<br><li>SSD云硬盘：CLOUD_SSD。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;
    

    /**
    * 云盘大小，取值范围： 普通云硬盘:10GB ~ 4000G；高性能云硬盘:50GB ~ 4000GB；SSD云硬盘:100GB ~ 4000GB，步长均为10GB。
    */
    @SerializedName("DiskSize")
    @Expose
    private Integer DiskSize;
    

    /**
    * 付费模式，目前只有预付费，即只能取值为PREPAID。
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;
    

    /**
    * 预付费相关参数设置，通过该参数可以指定包年包月云盘的购买时长，预付费云盘该参数必传。
    */
    @SerializedName("DiskChargePrepaid")
    @Expose
    private DiskChargePrepaid DiskChargePrepaid;
    

    /**
    * 购买云盘的数量。不填则默认为1。
    */
    @SerializedName("DiskCount")
    @Expose
    private Integer DiskCount;
    

    /**
    * 云盘所属项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;
    

    /**
     * 获取云硬盘类型。取值范围：<br><li>普通云硬盘：CLOUD_BASIC<br><li>高性能云硬盘：CLOUD_PREMIUM<br><li>SSD云硬盘：CLOUD_SSD。
     * @return DiskType 云硬盘类型。取值范围：<br><li>普通云硬盘：CLOUD_BASIC<br><li>高性能云硬盘：CLOUD_PREMIUM<br><li>SSD云硬盘：CLOUD_SSD。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * 设置云硬盘类型。取值范围：<br><li>普通云硬盘：CLOUD_BASIC<br><li>高性能云硬盘：CLOUD_PREMIUM<br><li>SSD云硬盘：CLOUD_SSD。
     * @param DiskType 云硬盘类型。取值范围：<br><li>普通云硬盘：CLOUD_BASIC<br><li>高性能云硬盘：CLOUD_PREMIUM<br><li>SSD云硬盘：CLOUD_SSD。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * 获取云盘大小，取值范围： 普通云硬盘:10GB ~ 4000G；高性能云硬盘:50GB ~ 4000GB；SSD云硬盘:100GB ~ 4000GB，步长均为10GB。
     * @return DiskSize 云盘大小，取值范围： 普通云硬盘:10GB ~ 4000G；高性能云硬盘:50GB ~ 4000GB；SSD云硬盘:100GB ~ 4000GB，步长均为10GB。
     */
    public Integer getDiskSize() {
        return this.DiskSize;
    }

    /**
     * 设置云盘大小，取值范围： 普通云硬盘:10GB ~ 4000G；高性能云硬盘:50GB ~ 4000GB；SSD云硬盘:100GB ~ 4000GB，步长均为10GB。
     * @param DiskSize 云盘大小，取值范围： 普通云硬盘:10GB ~ 4000G；高性能云硬盘:50GB ~ 4000GB；SSD云硬盘:100GB ~ 4000GB，步长均为10GB。
     */
    public void setDiskSize(Integer DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * 获取付费模式，目前只有预付费，即只能取值为PREPAID。
     * @return DiskChargeType 付费模式，目前只有预付费，即只能取值为PREPAID。
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * 设置付费模式，目前只有预付费，即只能取值为PREPAID。
     * @param DiskChargeType 付费模式，目前只有预付费，即只能取值为PREPAID。
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * 获取预付费相关参数设置，通过该参数可以指定包年包月云盘的购买时长，预付费云盘该参数必传。
     * @return DiskChargePrepaid 预付费相关参数设置，通过该参数可以指定包年包月云盘的购买时长，预付费云盘该参数必传。
     */
    public DiskChargePrepaid getDiskChargePrepaid() {
        return this.DiskChargePrepaid;
    }

    /**
     * 设置预付费相关参数设置，通过该参数可以指定包年包月云盘的购买时长，预付费云盘该参数必传。
     * @param DiskChargePrepaid 预付费相关参数设置，通过该参数可以指定包年包月云盘的购买时长，预付费云盘该参数必传。
     */
    public void setDiskChargePrepaid(DiskChargePrepaid DiskChargePrepaid) {
        this.DiskChargePrepaid = DiskChargePrepaid;
    }

    /**
     * 获取购买云盘的数量。不填则默认为1。
     * @return DiskCount 购买云盘的数量。不填则默认为1。
     */
    public Integer getDiskCount() {
        return this.DiskCount;
    }

    /**
     * 设置购买云盘的数量。不填则默认为1。
     * @param DiskCount 购买云盘的数量。不填则默认为1。
     */
    public void setDiskCount(Integer DiskCount) {
        this.DiskCount = DiskCount;
    }

    /**
     * 获取云盘所属项目ID。
     * @return ProjectId 云盘所属项目ID。
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置云盘所属项目ID。
     * @param ProjectId 云盘所属项目ID。
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamObj(map, prefix + "DiskChargePrepaid.", this.DiskChargePrepaid);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

