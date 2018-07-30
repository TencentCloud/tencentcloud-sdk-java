package com.tencentcloudapi.bm.v20180423.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeTaskOperationLogRequest  extends AbstractModel{


    /**
    * 维修任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 排序字段，目前支持：OperationTime
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方式 0:递增(默认) 1:递减
    */
    @SerializedName("Order")
    @Expose
    private Integer Order;

    /**
     * 获取维修任务ID
     * @return TaskId 维修任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置维修任务ID
     * @param TaskId 维修任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取排序字段，目前支持：OperationTime
     * @return OrderField 排序字段，目前支持：OperationTime
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * 设置排序字段，目前支持：OperationTime
     * @param OrderField 排序字段，目前支持：OperationTime
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * 获取排序方式 0:递增(默认) 1:递减
     * @return Order 排序方式 0:递增(默认) 1:递减
     */
    public Integer getOrder() {
        return this.Order;
    }

    /**
     * 设置排序方式 0:递增(默认) 1:递减
     * @param Order 排序方式 0:递增(默认) 1:递减
     */
    public void setOrder(Integer Order) {
        this.Order = Order;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

