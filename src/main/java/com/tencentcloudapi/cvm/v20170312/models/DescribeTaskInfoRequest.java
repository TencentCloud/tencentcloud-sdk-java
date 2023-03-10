/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskInfoRequest extends AbstractModel{

    /**
    * 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 按照指定的产品类型查询，支持取值：

- `CVM`：云服务器
- `CDH`：专用宿主机
- `CPM2.0`：裸金属云服务器

未传入或为空时，默认查询全部产品类型。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 按照一个或多个任务状态ID进行过滤。
`TaskStatus`（任务状态ID）与任务状态中文名的对应关系如下：

- `1`：待授权
- `2`：处理中
- `3`：已结束
- `4`：已预约
- `5`：已取消
- `6`：已避免

各任务状态的具体含义，可参考 [任务状态](https://cloud.tencent.com/document/product/213/67789#.E4.BB.BB.E5.8A.A1.E7.8A.B6.E6.80.81)。
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long [] TaskStatus;

    /**
    * 按照一个或多个任务类型ID进行过滤。

`TaskTypeId`（任务类型ID）与任务类型中文名的对应关系如下：

- `101`：实例运行隐患
- `102`：实例运行异常
- `103`：实例硬盘异常
- `104`：实例网络连接异常
- `105`：实例运行预警
- `106`：实例硬盘预警
- `107`：实例维护升级

各任务类型的具体含义，可参考 [维修任务分类](https://cloud.tencent.com/document/product/213/67789#.E7.BB.B4.E4.BF.AE.E4.BB.BB.E5.8A.A1.E5.88.86.E7.B1.BB)。
    */
    @SerializedName("TaskTypeIds")
    @Expose
    private Long [] TaskTypeIds;

    /**
    * 按照一个或者多个任务ID查询。任务ID形如：`rep-xxxxxxxx`。
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 按照一个或者多个实例ID查询。实例ID形如：`ins-xxxxxxxx`。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 按照一个或者多个实例名称查询。
    */
    @SerializedName("Aliases")
    @Expose
    private String [] Aliases;

    /**
    * 时间查询区间的起始位置，会根据任务创建时间`CreateTime`进行过滤。未传入时默认为当天`00:00:00`。
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 时间查询区间的终止位置，会根据任务创建时间`CreateTime`进行过滤。未传入时默认为当前时刻。
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 指定返回维修任务列表的排序字段，目前支持：

- `CreateTime`：任务创建时间
- `AuthTime`：任务授权时间
- `EndTime`：任务结束时间

未传入时或为空时，默认按`CreateTime`字段进行排序。
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方式，目前支持：

- `0`：升序（默认）
- `1`：降序

未传入或为空时，默认按升序排序。

    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
     * Get 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 按照指定的产品类型查询，支持取值：

- `CVM`：云服务器
- `CDH`：专用宿主机
- `CPM2.0`：裸金属云服务器

未传入或为空时，默认查询全部产品类型。 
     * @return Product 按照指定的产品类型查询，支持取值：

- `CVM`：云服务器
- `CDH`：专用宿主机
- `CPM2.0`：裸金属云服务器

未传入或为空时，默认查询全部产品类型。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 按照指定的产品类型查询，支持取值：

- `CVM`：云服务器
- `CDH`：专用宿主机
- `CPM2.0`：裸金属云服务器

未传入或为空时，默认查询全部产品类型。
     * @param Product 按照指定的产品类型查询，支持取值：

- `CVM`：云服务器
- `CDH`：专用宿主机
- `CPM2.0`：裸金属云服务器

未传入或为空时，默认查询全部产品类型。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 按照一个或多个任务状态ID进行过滤。
`TaskStatus`（任务状态ID）与任务状态中文名的对应关系如下：

- `1`：待授权
- `2`：处理中
- `3`：已结束
- `4`：已预约
- `5`：已取消
- `6`：已避免

各任务状态的具体含义，可参考 [任务状态](https://cloud.tencent.com/document/product/213/67789#.E4.BB.BB.E5.8A.A1.E7.8A.B6.E6.80.81)。 
     * @return TaskStatus 按照一个或多个任务状态ID进行过滤。
`TaskStatus`（任务状态ID）与任务状态中文名的对应关系如下：

- `1`：待授权
- `2`：处理中
- `3`：已结束
- `4`：已预约
- `5`：已取消
- `6`：已避免

各任务状态的具体含义，可参考 [任务状态](https://cloud.tencent.com/document/product/213/67789#.E4.BB.BB.E5.8A.A1.E7.8A.B6.E6.80.81)。
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 按照一个或多个任务状态ID进行过滤。
`TaskStatus`（任务状态ID）与任务状态中文名的对应关系如下：

- `1`：待授权
- `2`：处理中
- `3`：已结束
- `4`：已预约
- `5`：已取消
- `6`：已避免

各任务状态的具体含义，可参考 [任务状态](https://cloud.tencent.com/document/product/213/67789#.E4.BB.BB.E5.8A.A1.E7.8A.B6.E6.80.81)。
     * @param TaskStatus 按照一个或多个任务状态ID进行过滤。
`TaskStatus`（任务状态ID）与任务状态中文名的对应关系如下：

- `1`：待授权
- `2`：处理中
- `3`：已结束
- `4`：已预约
- `5`：已取消
- `6`：已避免

各任务状态的具体含义，可参考 [任务状态](https://cloud.tencent.com/document/product/213/67789#.E4.BB.BB.E5.8A.A1.E7.8A.B6.E6.80.81)。
     */
    public void setTaskStatus(Long [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 按照一个或多个任务类型ID进行过滤。

`TaskTypeId`（任务类型ID）与任务类型中文名的对应关系如下：

- `101`：实例运行隐患
- `102`：实例运行异常
- `103`：实例硬盘异常
- `104`：实例网络连接异常
- `105`：实例运行预警
- `106`：实例硬盘预警
- `107`：实例维护升级

各任务类型的具体含义，可参考 [维修任务分类](https://cloud.tencent.com/document/product/213/67789#.E7.BB.B4.E4.BF.AE.E4.BB.BB.E5.8A.A1.E5.88.86.E7.B1.BB)。 
     * @return TaskTypeIds 按照一个或多个任务类型ID进行过滤。

`TaskTypeId`（任务类型ID）与任务类型中文名的对应关系如下：

- `101`：实例运行隐患
- `102`：实例运行异常
- `103`：实例硬盘异常
- `104`：实例网络连接异常
- `105`：实例运行预警
- `106`：实例硬盘预警
- `107`：实例维护升级

各任务类型的具体含义，可参考 [维修任务分类](https://cloud.tencent.com/document/product/213/67789#.E7.BB.B4.E4.BF.AE.E4.BB.BB.E5.8A.A1.E5.88.86.E7.B1.BB)。
     */
    public Long [] getTaskTypeIds() {
        return this.TaskTypeIds;
    }

    /**
     * Set 按照一个或多个任务类型ID进行过滤。

`TaskTypeId`（任务类型ID）与任务类型中文名的对应关系如下：

- `101`：实例运行隐患
- `102`：实例运行异常
- `103`：实例硬盘异常
- `104`：实例网络连接异常
- `105`：实例运行预警
- `106`：实例硬盘预警
- `107`：实例维护升级

各任务类型的具体含义，可参考 [维修任务分类](https://cloud.tencent.com/document/product/213/67789#.E7.BB.B4.E4.BF.AE.E4.BB.BB.E5.8A.A1.E5.88.86.E7.B1.BB)。
     * @param TaskTypeIds 按照一个或多个任务类型ID进行过滤。

`TaskTypeId`（任务类型ID）与任务类型中文名的对应关系如下：

- `101`：实例运行隐患
- `102`：实例运行异常
- `103`：实例硬盘异常
- `104`：实例网络连接异常
- `105`：实例运行预警
- `106`：实例硬盘预警
- `107`：实例维护升级

各任务类型的具体含义，可参考 [维修任务分类](https://cloud.tencent.com/document/product/213/67789#.E7.BB.B4.E4.BF.AE.E4.BB.BB.E5.8A.A1.E5.88.86.E7.B1.BB)。
     */
    public void setTaskTypeIds(Long [] TaskTypeIds) {
        this.TaskTypeIds = TaskTypeIds;
    }

    /**
     * Get 按照一个或者多个任务ID查询。任务ID形如：`rep-xxxxxxxx`。 
     * @return TaskIds 按照一个或者多个任务ID查询。任务ID形如：`rep-xxxxxxxx`。
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 按照一个或者多个任务ID查询。任务ID形如：`rep-xxxxxxxx`。
     * @param TaskIds 按照一个或者多个任务ID查询。任务ID形如：`rep-xxxxxxxx`。
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 按照一个或者多个实例ID查询。实例ID形如：`ins-xxxxxxxx`。 
     * @return InstanceIds 按照一个或者多个实例ID查询。实例ID形如：`ins-xxxxxxxx`。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 按照一个或者多个实例ID查询。实例ID形如：`ins-xxxxxxxx`。
     * @param InstanceIds 按照一个或者多个实例ID查询。实例ID形如：`ins-xxxxxxxx`。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 按照一个或者多个实例名称查询。 
     * @return Aliases 按照一个或者多个实例名称查询。
     */
    public String [] getAliases() {
        return this.Aliases;
    }

    /**
     * Set 按照一个或者多个实例名称查询。
     * @param Aliases 按照一个或者多个实例名称查询。
     */
    public void setAliases(String [] Aliases) {
        this.Aliases = Aliases;
    }

    /**
     * Get 时间查询区间的起始位置，会根据任务创建时间`CreateTime`进行过滤。未传入时默认为当天`00:00:00`。 
     * @return StartDate 时间查询区间的起始位置，会根据任务创建时间`CreateTime`进行过滤。未传入时默认为当天`00:00:00`。
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 时间查询区间的起始位置，会根据任务创建时间`CreateTime`进行过滤。未传入时默认为当天`00:00:00`。
     * @param StartDate 时间查询区间的起始位置，会根据任务创建时间`CreateTime`进行过滤。未传入时默认为当天`00:00:00`。
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 时间查询区间的终止位置，会根据任务创建时间`CreateTime`进行过滤。未传入时默认为当前时刻。 
     * @return EndDate 时间查询区间的终止位置，会根据任务创建时间`CreateTime`进行过滤。未传入时默认为当前时刻。
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 时间查询区间的终止位置，会根据任务创建时间`CreateTime`进行过滤。未传入时默认为当前时刻。
     * @param EndDate 时间查询区间的终止位置，会根据任务创建时间`CreateTime`进行过滤。未传入时默认为当前时刻。
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 指定返回维修任务列表的排序字段，目前支持：

- `CreateTime`：任务创建时间
- `AuthTime`：任务授权时间
- `EndTime`：任务结束时间

未传入时或为空时，默认按`CreateTime`字段进行排序。 
     * @return OrderField 指定返回维修任务列表的排序字段，目前支持：

- `CreateTime`：任务创建时间
- `AuthTime`：任务授权时间
- `EndTime`：任务结束时间

未传入时或为空时，默认按`CreateTime`字段进行排序。
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 指定返回维修任务列表的排序字段，目前支持：

- `CreateTime`：任务创建时间
- `AuthTime`：任务授权时间
- `EndTime`：任务结束时间

未传入时或为空时，默认按`CreateTime`字段进行排序。
     * @param OrderField 指定返回维修任务列表的排序字段，目前支持：

- `CreateTime`：任务创建时间
- `AuthTime`：任务授权时间
- `EndTime`：任务结束时间

未传入时或为空时，默认按`CreateTime`字段进行排序。
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方式，目前支持：

- `0`：升序（默认）
- `1`：降序

未传入或为空时，默认按升序排序。
 
     * @return Order 排序方式，目前支持：

- `0`：升序（默认）
- `1`：降序

未传入或为空时，默认按升序排序。

     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，目前支持：

- `0`：升序（默认）
- `1`：降序

未传入或为空时，默认按升序排序。

     * @param Order 排序方式，目前支持：

- `0`：升序（默认）
- `1`：降序

未传入或为空时，默认按升序排序。

     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    public DescribeTaskInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskInfoRequest(DescribeTaskInfoRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long[source.TaskStatus.length];
            for (int i = 0; i < source.TaskStatus.length; i++) {
                this.TaskStatus[i] = new Long(source.TaskStatus[i]);
            }
        }
        if (source.TaskTypeIds != null) {
            this.TaskTypeIds = new Long[source.TaskTypeIds.length];
            for (int i = 0; i < source.TaskTypeIds.length; i++) {
                this.TaskTypeIds[i] = new Long(source.TaskTypeIds[i]);
            }
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Aliases != null) {
            this.Aliases = new String[source.Aliases.length];
            for (int i = 0; i < source.Aliases.length; i++) {
                this.Aliases[i] = new String(source.Aliases[i]);
            }
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "TaskStatus.", this.TaskStatus);
        this.setParamArraySimple(map, prefix + "TaskTypeIds.", this.TaskTypeIds);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "Aliases.", this.Aliases);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

