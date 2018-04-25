package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class InitDBInstancesResponse  extends AbstractModel{


    /**
    * 异步任务的请求ID数组，可使用此ID查询异步任务的执行结果
    */
    @SerializedName("AsyncRequestIds")
    @Expose
    private String [] AsyncRequestIds;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取异步任务的请求ID数组，可使用此ID查询异步任务的执行结果
     * @return AsyncRequestIds 异步任务的请求ID数组，可使用此ID查询异步任务的执行结果
     */
    public String [] getAsyncRequestIds() {
        return this.AsyncRequestIds;
    }

    /**
     * 设置异步任务的请求ID数组，可使用此ID查询异步任务的执行结果
     * @param AsyncRequestIds 异步任务的请求ID数组，可使用此ID查询异步任务的执行结果
     */
    public void setAsyncRequestIds(String [] AsyncRequestIds) {
        this.AsyncRequestIds = AsyncRequestIds;
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
        this.setParamArraySimple(map, prefix + "AsyncRequestIds.", this.AsyncRequestIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

