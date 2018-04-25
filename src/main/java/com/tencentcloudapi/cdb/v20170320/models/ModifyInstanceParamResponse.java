package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyInstanceParamResponse  extends AbstractModel{


    /**
    * 异步任务Id，可用于查询任务进度。
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private String AsyncRequestId;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取异步任务Id，可用于查询任务进度。
     * @return AsyncRequestId 异步任务Id，可用于查询任务进度。
     */
    public String getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * 设置异步任务Id，可用于查询任务进度。
     * @param AsyncRequestId 异步任务Id，可用于查询任务进度。
     */
    public void setAsyncRequestId(String AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
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
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

