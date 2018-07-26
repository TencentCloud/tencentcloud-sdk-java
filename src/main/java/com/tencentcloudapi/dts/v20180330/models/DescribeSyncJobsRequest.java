package com.tencentcloudapi.dts.v20180330.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeSyncJobsRequest  extends AbstractModel{


    /**
    * 灾备同步任务ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 灾备同步任务名
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 排序字段，可以取值为JobId、Status、JobName、CreateTime
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序方式，升序为ASC，降序为DESC
    */
    @SerializedName("OrderSeq")
    @Expose
    private String OrderSeq;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回实例数量，默认20，有效区间[1,100]
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * 获取灾备同步任务ID
     * @return JobId 灾备同步任务ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * 设置灾备同步任务ID
     * @param JobId 灾备同步任务ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * 获取灾备同步任务名
     * @return JobName 灾备同步任务名
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * 设置灾备同步任务名
     * @param JobName 灾备同步任务名
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * 获取排序字段，可以取值为JobId、Status、JobName、CreateTime
     * @return Order 排序字段，可以取值为JobId、Status、JobName、CreateTime
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * 设置排序字段，可以取值为JobId、Status、JobName、CreateTime
     * @param Order 排序字段，可以取值为JobId、Status、JobName、CreateTime
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * 获取排序方式，升序为ASC，降序为DESC
     * @return OrderSeq 排序方式，升序为ASC，降序为DESC
     */
    public String getOrderSeq() {
        return this.OrderSeq;
    }

    /**
     * 设置排序方式，升序为ASC，降序为DESC
     * @param OrderSeq 排序方式，升序为ASC，降序为DESC
     */
    public void setOrderSeq(String OrderSeq) {
        this.OrderSeq = OrderSeq;
    }

    /**
     * 获取偏移量，默认为0
     * @return Offset 偏移量，默认为0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回实例数量，默认20，有效区间[1,100]
     * @return Limit 返回实例数量，默认20，有效区间[1,100]
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回实例数量，默认20，有效区间[1,100]
     * @param Limit 返回实例数量，默认20，有效区间[1,100]
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderSeq", this.OrderSeq);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

