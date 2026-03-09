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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancePreData extends AbstractModel {

    /**
    * <p>CreateInstancePre返回固定为0，不能作为CheckTaskStatus的查询条件。只是为了保证和后台数据结构对齐。</p>
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
    * <p>订单号列表</p>
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * <p>ckafka集群实例Id，当购买多个实例时，默认返回购买的第一个实例 id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>订单和购买实例对应映射列表</p>
    */
    @SerializedName("DealNameInstanceIdMapping")
    @Expose
    private DealInstanceDTO [] DealNameInstanceIdMapping;

    /**
    * <p>CAM鉴权返回的eventId</p>
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
     * Get <p>CreateInstancePre返回固定为0，不能作为CheckTaskStatus的查询条件。只是为了保证和后台数据结构对齐。</p> 
     * @return FlowId <p>CreateInstancePre返回固定为0，不能作为CheckTaskStatus的查询条件。只是为了保证和后台数据结构对齐。</p>
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>CreateInstancePre返回固定为0，不能作为CheckTaskStatus的查询条件。只是为了保证和后台数据结构对齐。</p>
     * @param FlowId <p>CreateInstancePre返回固定为0，不能作为CheckTaskStatus的查询条件。只是为了保证和后台数据结构对齐。</p>
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>订单号列表</p> 
     * @return DealNames <p>订单号列表</p>
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set <p>订单号列表</p>
     * @param DealNames <p>订单号列表</p>
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get <p>ckafka集群实例Id，当购买多个实例时，默认返回购买的第一个实例 id</p> 
     * @return InstanceId <p>ckafka集群实例Id，当购买多个实例时，默认返回购买的第一个实例 id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例Id，当购买多个实例时，默认返回购买的第一个实例 id</p>
     * @param InstanceId <p>ckafka集群实例Id，当购买多个实例时，默认返回购买的第一个实例 id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>订单和购买实例对应映射列表</p> 
     * @return DealNameInstanceIdMapping <p>订单和购买实例对应映射列表</p>
     */
    public DealInstanceDTO [] getDealNameInstanceIdMapping() {
        return this.DealNameInstanceIdMapping;
    }

    /**
     * Set <p>订单和购买实例对应映射列表</p>
     * @param DealNameInstanceIdMapping <p>订单和购买实例对应映射列表</p>
     */
    public void setDealNameInstanceIdMapping(DealInstanceDTO [] DealNameInstanceIdMapping) {
        this.DealNameInstanceIdMapping = DealNameInstanceIdMapping;
    }

    /**
     * Get <p>CAM鉴权返回的eventId</p> 
     * @return EventId <p>CAM鉴权返回的eventId</p>
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>CAM鉴权返回的eventId</p>
     * @param EventId <p>CAM鉴权返回的eventId</p>
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    public CreateInstancePreData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancePreData(CreateInstancePreData source) {
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DealNameInstanceIdMapping != null) {
            this.DealNameInstanceIdMapping = new DealInstanceDTO[source.DealNameInstanceIdMapping.length];
            for (int i = 0; i < source.DealNameInstanceIdMapping.length; i++) {
                this.DealNameInstanceIdMapping[i] = new DealInstanceDTO(source.DealNameInstanceIdMapping[i]);
            }
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "DealNameInstanceIdMapping.", this.DealNameInstanceIdMapping);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

