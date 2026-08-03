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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RayClusterHistory extends AbstractModel {

    /**
    * <p>历史记录ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>集群/数据实验室ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群/数据实验室名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>源状态</p>
    */
    @SerializedName("FromState")
    @Expose
    private String FromState;

    /**
    * <p>目标状态</p>
    */
    @SerializedName("ToState")
    @Expose
    private String ToState;

    /**
    * <p>触发事件</p>
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * <p>消息</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>转换时间（毫秒时间戳）</p>
    */
    @SerializedName("TransitionTime")
    @Expose
    private Long TransitionTime;

    /**
     * Get <p>历史记录ID</p> 
     * @return Id <p>历史记录ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>历史记录ID</p>
     * @param Id <p>历史记录ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>集群/数据实验室ID</p> 
     * @return ClusterId <p>集群/数据实验室ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群/数据实验室ID</p>
     * @param ClusterId <p>集群/数据实验室ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群/数据实验室名称</p> 
     * @return ClusterName <p>集群/数据实验室名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群/数据实验室名称</p>
     * @param ClusterName <p>集群/数据实验室名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>源状态</p> 
     * @return FromState <p>源状态</p>
     */
    public String getFromState() {
        return this.FromState;
    }

    /**
     * Set <p>源状态</p>
     * @param FromState <p>源状态</p>
     */
    public void setFromState(String FromState) {
        this.FromState = FromState;
    }

    /**
     * Get <p>目标状态</p> 
     * @return ToState <p>目标状态</p>
     */
    public String getToState() {
        return this.ToState;
    }

    /**
     * Set <p>目标状态</p>
     * @param ToState <p>目标状态</p>
     */
    public void setToState(String ToState) {
        this.ToState = ToState;
    }

    /**
     * Get <p>触发事件</p> 
     * @return Event <p>触发事件</p>
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set <p>触发事件</p>
     * @param Event <p>触发事件</p>
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get <p>消息</p> 
     * @return Message <p>消息</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>消息</p>
     * @param Message <p>消息</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>转换时间（毫秒时间戳）</p> 
     * @return TransitionTime <p>转换时间（毫秒时间戳）</p>
     */
    public Long getTransitionTime() {
        return this.TransitionTime;
    }

    /**
     * Set <p>转换时间（毫秒时间戳）</p>
     * @param TransitionTime <p>转换时间（毫秒时间戳）</p>
     */
    public void setTransitionTime(Long TransitionTime) {
        this.TransitionTime = TransitionTime;
    }

    public RayClusterHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RayClusterHistory(RayClusterHistory source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.FromState != null) {
            this.FromState = new String(source.FromState);
        }
        if (source.ToState != null) {
            this.ToState = new String(source.ToState);
        }
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.TransitionTime != null) {
            this.TransitionTime = new Long(source.TransitionTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "FromState", this.FromState);
        this.setParamSimple(map, prefix + "ToState", this.ToState);
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "TransitionTime", this.TransitionTime);

    }
}

