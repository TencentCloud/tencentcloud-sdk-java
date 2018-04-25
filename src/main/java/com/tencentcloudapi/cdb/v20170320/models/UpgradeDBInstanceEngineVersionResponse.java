package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class UpgradeDBInstanceEngineVersionResponse  extends AbstractModel{


    /**
    * 异步任务ID，可使用[查询任务列表](https://cloud.tencent.com/document/api/236/8010)获取其执行情况
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
     * 获取异步任务ID，可使用[查询任务列表](https://cloud.tencent.com/document/api/236/8010)获取其执行情况
     * @return AsyncRequestId 异步任务ID，可使用[查询任务列表](https://cloud.tencent.com/document/api/236/8010)获取其执行情况
     */
    public String getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * 设置异步任务ID，可使用[查询任务列表](https://cloud.tencent.com/document/api/236/8010)获取其执行情况
     * @param AsyncRequestId 异步任务ID，可使用[查询任务列表](https://cloud.tencent.com/document/api/236/8010)获取其执行情况
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

