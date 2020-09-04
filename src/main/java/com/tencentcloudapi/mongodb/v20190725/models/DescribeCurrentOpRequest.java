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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCurrentOpRequest extends AbstractModel{

    /**
    * 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 筛选条件，操作所属的命名空间namespace，格式为db.collection
    */
    @SerializedName("Ns")
    @Expose
    private String Ns;

    /**
    * 筛选条件，操作已经执行的时间（单位：毫秒），结果将返回超过设置时间的操作，默认值为0，取值范围为[0, 3600000]
    */
    @SerializedName("MillisecondRunning")
    @Expose
    private Long MillisecondRunning;

    /**
    * 筛选条件，操作类型，可能的取值：none，update，insert，query，command，getmore，remove和killcursors
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * 筛选条件，分片名称
    */
    @SerializedName("ReplicaSetName")
    @Expose
    private String ReplicaSetName;

    /**
    * 筛选条件，节点状态，可能的取值为：primary
secondary
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 单次请求返回的数量，默认值为100，取值范围为[0,100]
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认值为0，取值范围为[0,10000]
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回结果集排序的字段，目前支持："MicrosecsRunning"/"microsecsrunning"，默认为升序排序
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 返回结果集排序方式，可能的取值："ASC"/"asc"或"DESC"/"desc"
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同 
     * @return InstanceId 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     * @param InstanceId 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 筛选条件，操作所属的命名空间namespace，格式为db.collection 
     * @return Ns 筛选条件，操作所属的命名空间namespace，格式为db.collection
     */
    public String getNs() {
        return this.Ns;
    }

    /**
     * Set 筛选条件，操作所属的命名空间namespace，格式为db.collection
     * @param Ns 筛选条件，操作所属的命名空间namespace，格式为db.collection
     */
    public void setNs(String Ns) {
        this.Ns = Ns;
    }

    /**
     * Get 筛选条件，操作已经执行的时间（单位：毫秒），结果将返回超过设置时间的操作，默认值为0，取值范围为[0, 3600000] 
     * @return MillisecondRunning 筛选条件，操作已经执行的时间（单位：毫秒），结果将返回超过设置时间的操作，默认值为0，取值范围为[0, 3600000]
     */
    public Long getMillisecondRunning() {
        return this.MillisecondRunning;
    }

    /**
     * Set 筛选条件，操作已经执行的时间（单位：毫秒），结果将返回超过设置时间的操作，默认值为0，取值范围为[0, 3600000]
     * @param MillisecondRunning 筛选条件，操作已经执行的时间（单位：毫秒），结果将返回超过设置时间的操作，默认值为0，取值范围为[0, 3600000]
     */
    public void setMillisecondRunning(Long MillisecondRunning) {
        this.MillisecondRunning = MillisecondRunning;
    }

    /**
     * Get 筛选条件，操作类型，可能的取值：none，update，insert，query，command，getmore，remove和killcursors 
     * @return Op 筛选条件，操作类型，可能的取值：none，update，insert，query，command，getmore，remove和killcursors
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set 筛选条件，操作类型，可能的取值：none，update，insert，query，command，getmore，remove和killcursors
     * @param Op 筛选条件，操作类型，可能的取值：none，update，insert，query，command，getmore，remove和killcursors
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get 筛选条件，分片名称 
     * @return ReplicaSetName 筛选条件，分片名称
     */
    public String getReplicaSetName() {
        return this.ReplicaSetName;
    }

    /**
     * Set 筛选条件，分片名称
     * @param ReplicaSetName 筛选条件，分片名称
     */
    public void setReplicaSetName(String ReplicaSetName) {
        this.ReplicaSetName = ReplicaSetName;
    }

    /**
     * Get 筛选条件，节点状态，可能的取值为：primary
secondary 
     * @return State 筛选条件，节点状态，可能的取值为：primary
secondary
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 筛选条件，节点状态，可能的取值为：primary
secondary
     * @param State 筛选条件，节点状态，可能的取值为：primary
secondary
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 单次请求返回的数量，默认值为100，取值范围为[0,100] 
     * @return Limit 单次请求返回的数量，默认值为100，取值范围为[0,100]
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次请求返回的数量，默认值为100，取值范围为[0,100]
     * @param Limit 单次请求返回的数量，默认值为100，取值范围为[0,100]
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认值为0，取值范围为[0,10000] 
     * @return Offset 偏移量，默认值为0，取值范围为[0,10000]
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值为0，取值范围为[0,10000]
     * @param Offset 偏移量，默认值为0，取值范围为[0,10000]
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回结果集排序的字段，目前支持："MicrosecsRunning"/"microsecsrunning"，默认为升序排序 
     * @return OrderBy 返回结果集排序的字段，目前支持："MicrosecsRunning"/"microsecsrunning"，默认为升序排序
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 返回结果集排序的字段，目前支持："MicrosecsRunning"/"microsecsrunning"，默认为升序排序
     * @param OrderBy 返回结果集排序的字段，目前支持："MicrosecsRunning"/"microsecsrunning"，默认为升序排序
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 返回结果集排序方式，可能的取值："ASC"/"asc"或"DESC"/"desc" 
     * @return OrderByType 返回结果集排序方式，可能的取值："ASC"/"asc"或"DESC"/"desc"
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 返回结果集排序方式，可能的取值："ASC"/"asc"或"DESC"/"desc"
     * @param OrderByType 返回结果集排序方式，可能的取值："ASC"/"asc"或"DESC"/"desc"
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
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

