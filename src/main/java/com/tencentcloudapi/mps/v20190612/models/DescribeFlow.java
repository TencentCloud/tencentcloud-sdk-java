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

public class DescribeFlow extends AbstractModel{

    /**
    * 流Id。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 流名称。
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 流状态，目前有IDLE/RUNNING。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 最大带宽值。
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * 输入组。
    */
    @SerializedName("InputGroup")
    @Expose
    private DescribeInput [] InputGroup;

    /**
    * 输出组。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputGroup")
    @Expose
    private DescribeOutput [] OutputGroup;

    /**
    * 该Flow关联的媒体传输事件EventId。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 媒体传输输入流所属的区域，取值和InputRegion相同。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 流Id。 
     * @return FlowId 流Id。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流Id。
     * @param FlowId 流Id。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

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
     * Get 流状态，目前有IDLE/RUNNING。 
     * @return State 流状态，目前有IDLE/RUNNING。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 流状态，目前有IDLE/RUNNING。
     * @param State 流状态，目前有IDLE/RUNNING。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 最大带宽值。 
     * @return MaxBandwidth 最大带宽值。
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set 最大带宽值。
     * @param MaxBandwidth 最大带宽值。
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get 输入组。 
     * @return InputGroup 输入组。
     */
    public DescribeInput [] getInputGroup() {
        return this.InputGroup;
    }

    /**
     * Set 输入组。
     * @param InputGroup 输入组。
     */
    public void setInputGroup(DescribeInput [] InputGroup) {
        this.InputGroup = InputGroup;
    }

    /**
     * Get 输出组。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputGroup 输出组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutput [] getOutputGroup() {
        return this.OutputGroup;
    }

    /**
     * Set 输出组。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputGroup 输出组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputGroup(DescribeOutput [] OutputGroup) {
        this.OutputGroup = OutputGroup;
    }

    /**
     * Get 该Flow关联的媒体传输事件EventId。 
     * @return EventId 该Flow关联的媒体传输事件EventId。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 该Flow关联的媒体传输事件EventId。
     * @param EventId 该Flow关联的媒体传输事件EventId。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 媒体传输输入流所属的区域，取值和InputRegion相同。 
     * @return Region 媒体传输输入流所属的区域，取值和InputRegion相同。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 媒体传输输入流所属的区域，取值和InputRegion相同。
     * @param Region 媒体传输输入流所属的区域，取值和InputRegion相同。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public DescribeFlow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlow(DescribeFlow source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.MaxBandwidth != null) {
            this.MaxBandwidth = new Long(source.MaxBandwidth);
        }
        if (source.InputGroup != null) {
            this.InputGroup = new DescribeInput[source.InputGroup.length];
            for (int i = 0; i < source.InputGroup.length; i++) {
                this.InputGroup[i] = new DescribeInput(source.InputGroup[i]);
            }
        }
        if (source.OutputGroup != null) {
            this.OutputGroup = new DescribeOutput[source.OutputGroup.length];
            for (int i = 0; i < source.OutputGroup.length; i++) {
                this.OutputGroup[i] = new DescribeOutput(source.OutputGroup[i]);
            }
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "MaxBandwidth", this.MaxBandwidth);
        this.setParamArrayObj(map, prefix + "InputGroup.", this.InputGroup);
        this.setParamArrayObj(map, prefix + "OutputGroup.", this.OutputGroup);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

