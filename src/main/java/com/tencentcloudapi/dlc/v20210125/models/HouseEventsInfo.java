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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HouseEventsInfo extends AbstractModel {

    /**
    * 事件时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private String [] Time;

    /**
    * 事件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventsAction")
    @Expose
    private String [] EventsAction;

    /**
    * 集群信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterInfo")
    @Expose
    private String [] ClusterInfo;

    /**
     * Get 事件时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 事件时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTime() {
        return this.Time;
    }

    /**
     * Set 事件时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 事件时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(String [] Time) {
        this.Time = Time;
    }

    /**
     * Get 事件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventsAction 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEventsAction() {
        return this.EventsAction;
    }

    /**
     * Set 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventsAction 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventsAction(String [] EventsAction) {
        this.EventsAction = EventsAction;
    }

    /**
     * Get 集群信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterInfo 集群信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set 集群信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterInfo 集群信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterInfo(String [] ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    public HouseEventsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HouseEventsInfo(HouseEventsInfo source) {
        if (source.Time != null) {
            this.Time = new String[source.Time.length];
            for (int i = 0; i < source.Time.length; i++) {
                this.Time[i] = new String(source.Time[i]);
            }
        }
        if (source.EventsAction != null) {
            this.EventsAction = new String[source.EventsAction.length];
            for (int i = 0; i < source.EventsAction.length; i++) {
                this.EventsAction[i] = new String(source.EventsAction[i]);
            }
        }
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new String[source.ClusterInfo.length];
            for (int i = 0; i < source.ClusterInfo.length; i++) {
                this.ClusterInfo[i] = new String(source.ClusterInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Time.", this.Time);
        this.setParamArraySimple(map, prefix + "EventsAction.", this.EventsAction);
        this.setParamArraySimple(map, prefix + "ClusterInfo.", this.ClusterInfo);

    }
}

