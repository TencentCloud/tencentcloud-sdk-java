package com.tencentcloudapi.msp.v20180319.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class TaskStatus  extends AbstractModel{


    /**
    * 迁移状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 迁移进度
    */
    @SerializedName("Progress")
    @Expose
    private String Progress;

    /**
    * 迁移日期
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * 获取迁移状态
     * @return Status 迁移状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置迁移状态
     * @param Status 迁移状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取迁移进度
     * @return Progress 迁移进度
     */
    public String getProgress() {
        return this.Progress;
    }

    /**
     * 设置迁移进度
     * @param Progress 迁移进度
     */
    public void setProgress(String Progress) {
        this.Progress = Progress;
    }

    /**
     * 获取迁移日期
     * @return UpdateTime 迁移日期
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置迁移日期
     * @param UpdateTime 迁移日期
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

