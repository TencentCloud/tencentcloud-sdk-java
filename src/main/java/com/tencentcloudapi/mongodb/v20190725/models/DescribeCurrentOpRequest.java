/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCurrentOpRequest extends AbstractModel {

    /**
    * 指定要查询的实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 操作所属的命名空间 namespace，格式为 db.collection。
    */
    @SerializedName("Ns")
    @Expose
    private String Ns;

    /**
    * 设置查询筛选条件为操作任务已经执行的时间。
- 默认值为0，取值范围为[0, 3600000]，单位：毫秒。
- 结果将返回超过设置时间的操作。
    */
    @SerializedName("MillisecondRunning")
    @Expose
    private Long MillisecondRunning;

    /**
    * 设置查询筛选条件为操作任务类型。取值包括：
- none：特殊状态，空闲连接或内部任务等。
- update：更新数据。
- insert：插入操作。
- query：查询操作。
- command：命令操作。
- getmore：获取更多数据。
- remove：删除操作。
- killcursors：释放查询游标的操作。
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * 筛选条件，分片名称。
    */
    @SerializedName("ReplicaSetName")
    @Expose
    private String ReplicaSetName;

    /**
    * 设置查询筛选条件为节点角色。
- primary：主节点。
- secondary：从节点。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 单次请求返回的数量，默认值为100，取值范围为[0,100]。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认值为0，取值范围为[0,10000]。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回结果集排序的字段，目前支持按照 MicrosecsRunning（操作任务已执行的时间）排序。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 返回结果集排序方式。
- ASC：升序。默认为 ASC，按照升序排序。
- DESC：降序。
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get 指定要查询的实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。 
     * @return InstanceId 指定要查询的实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定要查询的实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     * @param InstanceId 指定要查询的实例 ID。请登录 [MongoDB 控制台](https://console.cloud.tencent.com/mongodb)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 操作所属的命名空间 namespace，格式为 db.collection。 
     * @return Ns 操作所属的命名空间 namespace，格式为 db.collection。
     */
    public String getNs() {
        return this.Ns;
    }

    /**
     * Set 操作所属的命名空间 namespace，格式为 db.collection。
     * @param Ns 操作所属的命名空间 namespace，格式为 db.collection。
     */
    public void setNs(String Ns) {
        this.Ns = Ns;
    }

    /**
     * Get 设置查询筛选条件为操作任务已经执行的时间。
- 默认值为0，取值范围为[0, 3600000]，单位：毫秒。
- 结果将返回超过设置时间的操作。 
     * @return MillisecondRunning 设置查询筛选条件为操作任务已经执行的时间。
- 默认值为0，取值范围为[0, 3600000]，单位：毫秒。
- 结果将返回超过设置时间的操作。
     */
    public Long getMillisecondRunning() {
        return this.MillisecondRunning;
    }

    /**
     * Set 设置查询筛选条件为操作任务已经执行的时间。
- 默认值为0，取值范围为[0, 3600000]，单位：毫秒。
- 结果将返回超过设置时间的操作。
     * @param MillisecondRunning 设置查询筛选条件为操作任务已经执行的时间。
- 默认值为0，取值范围为[0, 3600000]，单位：毫秒。
- 结果将返回超过设置时间的操作。
     */
    public void setMillisecondRunning(Long MillisecondRunning) {
        this.MillisecondRunning = MillisecondRunning;
    }

    /**
     * Get 设置查询筛选条件为操作任务类型。取值包括：
- none：特殊状态，空闲连接或内部任务等。
- update：更新数据。
- insert：插入操作。
- query：查询操作。
- command：命令操作。
- getmore：获取更多数据。
- remove：删除操作。
- killcursors：释放查询游标的操作。 
     * @return Op 设置查询筛选条件为操作任务类型。取值包括：
- none：特殊状态，空闲连接或内部任务等。
- update：更新数据。
- insert：插入操作。
- query：查询操作。
- command：命令操作。
- getmore：获取更多数据。
- remove：删除操作。
- killcursors：释放查询游标的操作。
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set 设置查询筛选条件为操作任务类型。取值包括：
- none：特殊状态，空闲连接或内部任务等。
- update：更新数据。
- insert：插入操作。
- query：查询操作。
- command：命令操作。
- getmore：获取更多数据。
- remove：删除操作。
- killcursors：释放查询游标的操作。
     * @param Op 设置查询筛选条件为操作任务类型。取值包括：
- none：特殊状态，空闲连接或内部任务等。
- update：更新数据。
- insert：插入操作。
- query：查询操作。
- command：命令操作。
- getmore：获取更多数据。
- remove：删除操作。
- killcursors：释放查询游标的操作。
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get 筛选条件，分片名称。 
     * @return ReplicaSetName 筛选条件，分片名称。
     */
    public String getReplicaSetName() {
        return this.ReplicaSetName;
    }

    /**
     * Set 筛选条件，分片名称。
     * @param ReplicaSetName 筛选条件，分片名称。
     */
    public void setReplicaSetName(String ReplicaSetName) {
        this.ReplicaSetName = ReplicaSetName;
    }

    /**
     * Get 设置查询筛选条件为节点角色。
- primary：主节点。
- secondary：从节点。 
     * @return State 设置查询筛选条件为节点角色。
- primary：主节点。
- secondary：从节点。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 设置查询筛选条件为节点角色。
- primary：主节点。
- secondary：从节点。
     * @param State 设置查询筛选条件为节点角色。
- primary：主节点。
- secondary：从节点。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 单次请求返回的数量，默认值为100，取值范围为[0,100]。 
     * @return Limit 单次请求返回的数量，默认值为100，取值范围为[0,100]。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次请求返回的数量，默认值为100，取值范围为[0,100]。
     * @param Limit 单次请求返回的数量，默认值为100，取值范围为[0,100]。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认值为0，取值范围为[0,10000]。 
     * @return Offset 偏移量，默认值为0，取值范围为[0,10000]。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值为0，取值范围为[0,10000]。
     * @param Offset 偏移量，默认值为0，取值范围为[0,10000]。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回结果集排序的字段，目前支持按照 MicrosecsRunning（操作任务已执行的时间）排序。 
     * @return OrderBy 返回结果集排序的字段，目前支持按照 MicrosecsRunning（操作任务已执行的时间）排序。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 返回结果集排序的字段，目前支持按照 MicrosecsRunning（操作任务已执行的时间）排序。
     * @param OrderBy 返回结果集排序的字段，目前支持按照 MicrosecsRunning（操作任务已执行的时间）排序。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 返回结果集排序方式。
- ASC：升序。默认为 ASC，按照升序排序。
- DESC：降序。 
     * @return OrderByType 返回结果集排序方式。
- ASC：升序。默认为 ASC，按照升序排序。
- DESC：降序。
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 返回结果集排序方式。
- ASC：升序。默认为 ASC，按照升序排序。
- DESC：降序。
     * @param OrderByType 返回结果集排序方式。
- ASC：升序。默认为 ASC，按照升序排序。
- DESC：降序。
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeCurrentOpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCurrentOpRequest(DescribeCurrentOpRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Ns != null) {
            this.Ns = new String(source.Ns);
        }
        if (source.MillisecondRunning != null) {
            this.MillisecondRunning = new Long(source.MillisecondRunning);
        }
        if (source.Op != null) {
            this.Op = new String(source.Op);
        }
        if (source.ReplicaSetName != null) {
            this.ReplicaSetName = new String(source.ReplicaSetName);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Ns", this.Ns);
        this.setParamSimple(map, prefix + "MillisecondRunning", this.MillisecondRunning);
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamSimple(map, prefix + "ReplicaSetName", this.ReplicaSetName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

