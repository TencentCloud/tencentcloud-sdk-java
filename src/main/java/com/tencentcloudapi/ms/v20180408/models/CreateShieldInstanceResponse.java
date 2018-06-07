package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateShieldInstanceResponse  extends AbstractModel{


    /**
    * 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
    */
    @SerializedName("Progress")
    @Expose
    private Integer Progress;
    

    /**
    * 任务唯一标识
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     * @return Progress 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     */
    public Integer getProgress() {
        return this.Progress;
    }

    /**
     * 设置任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     * @param Progress 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     */
    public void setProgress(Integer Progress) {
        this.Progress = Progress;
    }

    /**
     * 获取任务唯一标识
     * @return ItemId 任务唯一标识
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * 设置任务唯一标识
     * @param ItemId 任务唯一标识
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

