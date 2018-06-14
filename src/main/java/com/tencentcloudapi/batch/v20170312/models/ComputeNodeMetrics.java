package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ComputeNodeMetrics  extends AbstractModel{


    /**
    * 已经完成提交的计算节点数量
    */
    @SerializedName("SubmittedCount")
    @Expose
    private String SubmittedCount;

    /**
    * 创建中的计算节点数量
    */
    @SerializedName("CreatingCount")
    @Expose
    private String CreatingCount;

    /**
    * 创建失败的计算节点数量
    */
    @SerializedName("CreationFailedCount")
    @Expose
    private String CreationFailedCount;

    /**
    * 完成创建的计算节点数量
    */
    @SerializedName("CreatedCount")
    @Expose
    private String CreatedCount;

    /**
    * 运行中的计算节点数量
    */
    @SerializedName("RunningCount")
    @Expose
    private String RunningCount;

    /**
    * 销毁中的计算节点数量
    */
    @SerializedName("DeletingCount")
    @Expose
    private String DeletingCount;

    /**
    * 异常的计算节点数量
    */
    @SerializedName("AbnormalCount")
    @Expose
    private String AbnormalCount;

    /**
     * 获取已经完成提交的计算节点数量
     * @return SubmittedCount 已经完成提交的计算节点数量
     */
    public String getSubmittedCount() {
        return this.SubmittedCount;
    }

    /**
     * 设置已经完成提交的计算节点数量
     * @param SubmittedCount 已经完成提交的计算节点数量
     */
    public void setSubmittedCount(String SubmittedCount) {
        this.SubmittedCount = SubmittedCount;
    }

    /**
     * 获取创建中的计算节点数量
     * @return CreatingCount 创建中的计算节点数量
     */
    public String getCreatingCount() {
        return this.CreatingCount;
    }

    /**
     * 设置创建中的计算节点数量
     * @param CreatingCount 创建中的计算节点数量
     */
    public void setCreatingCount(String CreatingCount) {
        this.CreatingCount = CreatingCount;
    }

    /**
     * 获取创建失败的计算节点数量
     * @return CreationFailedCount 创建失败的计算节点数量
     */
    public String getCreationFailedCount() {
        return this.CreationFailedCount;
    }

    /**
     * 设置创建失败的计算节点数量
     * @param CreationFailedCount 创建失败的计算节点数量
     */
    public void setCreationFailedCount(String CreationFailedCount) {
        this.CreationFailedCount = CreationFailedCount;
    }

    /**
     * 获取完成创建的计算节点数量
     * @return CreatedCount 完成创建的计算节点数量
     */
    public String getCreatedCount() {
        return this.CreatedCount;
    }

    /**
     * 设置完成创建的计算节点数量
     * @param CreatedCount 完成创建的计算节点数量
     */
    public void setCreatedCount(String CreatedCount) {
        this.CreatedCount = CreatedCount;
    }

    /**
     * 获取运行中的计算节点数量
     * @return RunningCount 运行中的计算节点数量
     */
    public String getRunningCount() {
        return this.RunningCount;
    }

    /**
     * 设置运行中的计算节点数量
     * @param RunningCount 运行中的计算节点数量
     */
    public void setRunningCount(String RunningCount) {
        this.RunningCount = RunningCount;
    }

    /**
     * 获取销毁中的计算节点数量
     * @return DeletingCount 销毁中的计算节点数量
     */
    public String getDeletingCount() {
        return this.DeletingCount;
    }

    /**
     * 设置销毁中的计算节点数量
     * @param DeletingCount 销毁中的计算节点数量
     */
    public void setDeletingCount(String DeletingCount) {
        this.DeletingCount = DeletingCount;
    }

    /**
     * 获取异常的计算节点数量
     * @return AbnormalCount 异常的计算节点数量
     */
    public String getAbnormalCount() {
        return this.AbnormalCount;
    }

    /**
     * 设置异常的计算节点数量
     * @param AbnormalCount 异常的计算节点数量
     */
    public void setAbnormalCount(String AbnormalCount) {
        this.AbnormalCount = AbnormalCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubmittedCount", this.SubmittedCount);
        this.setParamSimple(map, prefix + "CreatingCount", this.CreatingCount);
        this.setParamSimple(map, prefix + "CreationFailedCount", this.CreationFailedCount);
        this.setParamSimple(map, prefix + "CreatedCount", this.CreatedCount);
        this.setParamSimple(map, prefix + "RunningCount", this.RunningCount);
        this.setParamSimple(map, prefix + "DeletingCount", this.DeletingCount);
        this.setParamSimple(map, prefix + "AbnormalCount", this.AbnormalCount);

    }
}

