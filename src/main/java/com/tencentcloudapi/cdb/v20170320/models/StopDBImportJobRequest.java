package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class StopDBImportJobRequest  extends AbstractModel{


    /**
    * 异步任务的请求ID。
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private String AsyncRequestId;
    

    /**
     * 获取异步任务的请求ID。
     * @return AsyncRequestId 异步任务的请求ID。
     */
    public String getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * 设置异步任务的请求ID。
     * @param AsyncRequestId 异步任务的请求ID。
     */
    public void setAsyncRequestId(String AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);

    }
}

