package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeJobRequest  extends AbstractModel{


    /**
    * 作业标识
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;
    

    /**
     * 获取作业标识
     * @return JobId 作业标识
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * 设置作业标识
     * @param JobId 作业标识
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);

    }
}

