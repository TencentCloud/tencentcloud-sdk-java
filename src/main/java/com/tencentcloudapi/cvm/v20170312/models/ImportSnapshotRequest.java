package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ImportSnapshotRequest  extends AbstractModel{


    /**
    * 制作的快照名称
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;
    

    /**
    * 制作的快照描述
    */
    @SerializedName("SnapshotDescription")
    @Expose
    private String SnapshotDescription;
    

    /**
    * 数据盘镜像COS链接
    */
    @SerializedName("SnapshotUrl")
    @Expose
    private String SnapshotUrl;
    

    /**
    * 制作的快照大小
    */
    @SerializedName("SnapshotSize")
    @Expose
    private Integer SnapshotSize;
    

    /**
    * true为仅检查参数，默认为false
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;
    

    /**
     * 获取制作的快照名称
     * @return SnapshotName 制作的快照名称
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * 设置制作的快照名称
     * @param SnapshotName 制作的快照名称
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * 获取制作的快照描述
     * @return SnapshotDescription 制作的快照描述
     */
    public String getSnapshotDescription() {
        return this.SnapshotDescription;
    }

    /**
     * 设置制作的快照描述
     * @param SnapshotDescription 制作的快照描述
     */
    public void setSnapshotDescription(String SnapshotDescription) {
        this.SnapshotDescription = SnapshotDescription;
    }

    /**
     * 获取数据盘镜像COS链接
     * @return SnapshotUrl 数据盘镜像COS链接
     */
    public String getSnapshotUrl() {
        return this.SnapshotUrl;
    }

    /**
     * 设置数据盘镜像COS链接
     * @param SnapshotUrl 数据盘镜像COS链接
     */
    public void setSnapshotUrl(String SnapshotUrl) {
        this.SnapshotUrl = SnapshotUrl;
    }

    /**
     * 获取制作的快照大小
     * @return SnapshotSize 制作的快照大小
     */
    public Integer getSnapshotSize() {
        return this.SnapshotSize;
    }

    /**
     * 设置制作的快照大小
     * @param SnapshotSize 制作的快照大小
     */
    public void setSnapshotSize(Integer SnapshotSize) {
        this.SnapshotSize = SnapshotSize;
    }

    /**
     * 获取true为仅检查参数，默认为false
     * @return DryRun true为仅检查参数，默认为false
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * 设置true为仅检查参数，默认为false
     * @param DryRun true为仅检查参数，默认为false
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "SnapshotDescription", this.SnapshotDescription);
        this.setParamSimple(map, prefix + "SnapshotUrl", this.SnapshotUrl);
        this.setParamSimple(map, prefix + "SnapshotSize", this.SnapshotSize);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

