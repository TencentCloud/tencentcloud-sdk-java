package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ColdMigrateInstanceRequest  extends AbstractModel{


    /**
    * 操作系统架构
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;
    

    /**
    * 操作系统类型
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;
    

    /**
    * 操作系统版本
    */
    @SerializedName("OsVersion")
    @Expose
    private String OsVersion;
    

    /**
    * 迁移的系统盘镜像COS链接
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;
    

    /**
    * 迁移目的实例的实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 迁移的系统盘大小，用于校验
    */
    @SerializedName("SnapshotSize")
    @Expose
    private Integer SnapshotSize;
    

    /**
     * 获取操作系统架构
     * @return Architecture 操作系统架构
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * 设置操作系统架构
     * @param Architecture 操作系统架构
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * 获取操作系统类型
     * @return OsType 操作系统类型
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * 设置操作系统类型
     * @param OsType 操作系统类型
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * 获取操作系统版本
     * @return OsVersion 操作系统版本
     */
    public String getOsVersion() {
        return this.OsVersion;
    }

    /**
     * 设置操作系统版本
     * @param OsVersion 操作系统版本
     */
    public void setOsVersion(String OsVersion) {
        this.OsVersion = OsVersion;
    }

    /**
     * 获取迁移的系统盘镜像COS链接
     * @return ImageUrl 迁移的系统盘镜像COS链接
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * 设置迁移的系统盘镜像COS链接
     * @param ImageUrl 迁移的系统盘镜像COS链接
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * 获取迁移目的实例的实例ID
     * @return InstanceId 迁移目的实例的实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置迁移目的实例的实例ID
     * @param InstanceId 迁移目的实例的实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取迁移的系统盘大小，用于校验
     * @return SnapshotSize 迁移的系统盘大小，用于校验
     */
    public Integer getSnapshotSize() {
        return this.SnapshotSize;
    }

    /**
     * 设置迁移的系统盘大小，用于校验
     * @param SnapshotSize 迁移的系统盘大小，用于校验
     */
    public void setSnapshotSize(Integer SnapshotSize) {
        this.SnapshotSize = SnapshotSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "OsVersion", this.OsVersion);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SnapshotSize", this.SnapshotSize);

    }
}

