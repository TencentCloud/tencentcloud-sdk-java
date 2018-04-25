package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class UpgradeDBInstanceResponse  extends AbstractModel{


    /**
    * 短订单ID，用于调用云API相关接口，如[获取订单信息](https://cloud.tencent.com/document/api/403/4392)
    */
    @SerializedName("DealIds")
    @Expose
    private String [] DealIds;
    

    /**
    * 长订单ID，用于反馈订单问题给腾讯云官方客服
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;
    

    /**
    * 异步任务的请求ID，可使用此ID查询异步任务的执行结果
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
     * 获取短订单ID，用于调用云API相关接口，如[获取订单信息](https://cloud.tencent.com/document/api/403/4392)
     * @return DealIds 短订单ID，用于调用云API相关接口，如[获取订单信息](https://cloud.tencent.com/document/api/403/4392)
     */
    public String [] getDealIds() {
        return this.DealIds;
    }

    /**
     * 设置短订单ID，用于调用云API相关接口，如[获取订单信息](https://cloud.tencent.com/document/api/403/4392)
     * @param DealIds 短订单ID，用于调用云API相关接口，如[获取订单信息](https://cloud.tencent.com/document/api/403/4392)
     */
    public void setDealIds(String [] DealIds) {
        this.DealIds = DealIds;
    }

    /**
     * 获取长订单ID，用于反馈订单问题给腾讯云官方客服
     * @return DealNames 长订单ID，用于反馈订单问题给腾讯云官方客服
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * 设置长订单ID，用于反馈订单问题给腾讯云官方客服
     * @param DealNames 长订单ID，用于反馈订单问题给腾讯云官方客服
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * 获取异步任务的请求ID，可使用此ID查询异步任务的执行结果
     * @return AsyncRequestId 异步任务的请求ID，可使用此ID查询异步任务的执行结果
     */
    public String getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * 设置异步任务的请求ID，可使用此ID查询异步任务的执行结果
     * @param AsyncRequestId 异步任务的请求ID，可使用此ID查询异步任务的执行结果
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
        this.setParamArraySimple(map, prefix + "DealIds.", this.DealIds);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

