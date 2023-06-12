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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEvent extends AbstractModel{

    /**
    * Event的名称。
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Event的Id，唯一标识一个event。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * Event创建时间，格式为yyyy-MM-ddTHH:mm:ssZ。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Event的描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Event的状态信息
0：未运行
1：运行中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Event关联的Flow列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachedFlowGroup")
    @Expose
    private DescribeFlowId [] AttachedFlowGroup;

    /**
     * Get Event的名称。 
     * @return EventName Event的名称。
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Event的名称。
     * @param EventName Event的名称。
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Event的Id，唯一标识一个event。 
     * @return EventId Event的Id，唯一标识一个event。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set Event的Id，唯一标识一个event。
     * @param EventId Event的Id，唯一标识一个event。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Event创建时间，格式为yyyy-MM-ddTHH:mm:ssZ。 
     * @return CreateTime Event创建时间，格式为yyyy-MM-ddTHH:mm:ssZ。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Event创建时间，格式为yyyy-MM-ddTHH:mm:ssZ。
     * @param CreateTime Event创建时间，格式为yyyy-MM-ddTHH:mm:ssZ。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Event的描述。 
     * @return Description Event的描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Event的描述。
     * @param Description Event的描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Event的状态信息
0：未运行
1：运行中 
     * @return Status Event的状态信息
0：未运行
1：运行中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Event的状态信息
0：未运行
1：运行中
     * @param Status Event的状态信息
0：未运行
1：运行中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Event关联的Flow列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachedFlowGroup Event关联的Flow列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeFlowId [] getAttachedFlowGroup() {
        return this.AttachedFlowGroup;
    }

    /**
     * Set Event关联的Flow列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachedFlowGroup Event关联的Flow列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachedFlowGroup(DescribeFlowId [] AttachedFlowGroup) {
        this.AttachedFlowGroup = AttachedFlowGroup;
    }

    public DescribeEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEvent(DescribeEvent source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AttachedFlowGroup != null) {
            this.AttachedFlowGroup = new DescribeFlowId[source.AttachedFlowGroup.length];
            for (int i = 0; i < source.AttachedFlowGroup.length; i++) {
                this.AttachedFlowGroup[i] = new DescribeFlowId(source.AttachedFlowGroup[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "AttachedFlowGroup.", this.AttachedFlowGroup);

    }
}

