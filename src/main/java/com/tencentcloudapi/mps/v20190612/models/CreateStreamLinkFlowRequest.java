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

public class CreateStreamLinkFlowRequest extends AbstractModel{

    /**
    * 流名称。
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 最大带宽，单位bps，可选[10000000, 20000000, 50000000]。
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * 流的输入组。
    */
    @SerializedName("InputGroup")
    @Expose
    private CreateInput [] InputGroup;

    /**
    * 该Flow关联的媒体传输事件ID，每个flow只能关联一个Event。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
     * Get 流名称。 
     * @return FlowName 流名称。
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 流名称。
     * @param FlowName 流名称。
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 最大带宽，单位bps，可选[10000000, 20000000, 50000000]。 
     * @return MaxBandwidth 最大带宽，单位bps，可选[10000000, 20000000, 50000000]。
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set 最大带宽，单位bps，可选[10000000, 20000000, 50000000]。
     * @param MaxBandwidth 最大带宽，单位bps，可选[10000000, 20000000, 50000000]。
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get 流的输入组。 
     * @return InputGroup 流的输入组。
     */
    public CreateInput [] getInputGroup() {
        return this.InputGroup;
    }

    /**
     * Set 流的输入组。
     * @param InputGroup 流的输入组。
     */
    public void setInputGroup(CreateInput [] InputGroup) {
        this.InputGroup = InputGroup;
    }

    /**
     * Get 该Flow关联的媒体传输事件ID，每个flow只能关联一个Event。 
     * @return EventId 该Flow关联的媒体传输事件ID，每个flow只能关联一个Event。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 该Flow关联的媒体传输事件ID，每个flow只能关联一个Event。
     * @param EventId 该Flow关联的媒体传输事件ID，每个flow只能关联一个Event。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    public CreateStreamLinkFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamLinkFlowRequest(CreateStreamLinkFlowRequest source) {
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.MaxBandwidth != null) {
            this.MaxBandwidth = new Long(source.MaxBandwidth);
        }
        if (source.InputGroup != null) {
            this.InputGroup = new CreateInput[source.InputGroup.length];
            for (int i = 0; i < source.InputGroup.length; i++) {
                this.InputGroup[i] = new CreateInput(source.InputGroup[i]);
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
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "MaxBandwidth", this.MaxBandwidth);
        this.setParamArrayObj(map, prefix + "InputGroup.", this.InputGroup);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

