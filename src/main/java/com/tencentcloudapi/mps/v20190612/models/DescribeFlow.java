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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlow extends AbstractModel {

    /**
    * <p>流Id。</p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>流名称。</p>
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * <p>流状态，目前有IDLE/RUNNING。</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>最大带宽值。</p>
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * <p>输入组。</p>
    */
    @SerializedName("InputGroup")
    @Expose
    private DescribeInput [] InputGroup;

    /**
    * <p>输出组。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputGroup")
    @Expose
    private DescribeOutput [] OutputGroup;

    /**
    * <p>该Flow关联的媒体传输事件EventId。</p>
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * <p>媒体传输输入流所属的区域，取值和InputRegion相同。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>该Flow允许创建的输入协议</p>
    */
    @SerializedName("AllowedInputProtocols")
    @Expose
    private String [] AllowedInputProtocols;

    /**
    * <p>该Flow允许创建的输出协议</p>
    */
    @SerializedName("AllowedOutputProtocols")
    @Expose
    private String [] AllowedOutputProtocols;

    /**
     * Get <p>流Id。</p> 
     * @return FlowId <p>流Id。</p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>流Id。</p>
     * @param FlowId <p>流Id。</p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>流名称。</p> 
     * @return FlowName <p>流名称。</p>
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set <p>流名称。</p>
     * @param FlowName <p>流名称。</p>
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get <p>流状态，目前有IDLE/RUNNING。</p> 
     * @return State <p>流状态，目前有IDLE/RUNNING。</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>流状态，目前有IDLE/RUNNING。</p>
     * @param State <p>流状态，目前有IDLE/RUNNING。</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>最大带宽值。</p> 
     * @return MaxBandwidth <p>最大带宽值。</p>
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set <p>最大带宽值。</p>
     * @param MaxBandwidth <p>最大带宽值。</p>
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get <p>输入组。</p> 
     * @return InputGroup <p>输入组。</p>
     */
    public DescribeInput [] getInputGroup() {
        return this.InputGroup;
    }

    /**
     * Set <p>输入组。</p>
     * @param InputGroup <p>输入组。</p>
     */
    public void setInputGroup(DescribeInput [] InputGroup) {
        this.InputGroup = InputGroup;
    }

    /**
     * Get <p>输出组。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputGroup <p>输出组。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeOutput [] getOutputGroup() {
        return this.OutputGroup;
    }

    /**
     * Set <p>输出组。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputGroup <p>输出组。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputGroup(DescribeOutput [] OutputGroup) {
        this.OutputGroup = OutputGroup;
    }

    /**
     * Get <p>该Flow关联的媒体传输事件EventId。</p> 
     * @return EventId <p>该Flow关联的媒体传输事件EventId。</p>
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>该Flow关联的媒体传输事件EventId。</p>
     * @param EventId <p>该Flow关联的媒体传输事件EventId。</p>
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>媒体传输输入流所属的区域，取值和InputRegion相同。</p> 
     * @return Region <p>媒体传输输入流所属的区域，取值和InputRegion相同。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>媒体传输输入流所属的区域，取值和InputRegion相同。</p>
     * @param Region <p>媒体传输输入流所属的区域，取值和InputRegion相同。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>该Flow允许创建的输入协议</p> 
     * @return AllowedInputProtocols <p>该Flow允许创建的输入协议</p>
     */
    public String [] getAllowedInputProtocols() {
        return this.AllowedInputProtocols;
    }

    /**
     * Set <p>该Flow允许创建的输入协议</p>
     * @param AllowedInputProtocols <p>该Flow允许创建的输入协议</p>
     */
    public void setAllowedInputProtocols(String [] AllowedInputProtocols) {
        this.AllowedInputProtocols = AllowedInputProtocols;
    }

    /**
     * Get <p>该Flow允许创建的输出协议</p> 
     * @return AllowedOutputProtocols <p>该Flow允许创建的输出协议</p>
     */
    public String [] getAllowedOutputProtocols() {
        return this.AllowedOutputProtocols;
    }

    /**
     * Set <p>该Flow允许创建的输出协议</p>
     * @param AllowedOutputProtocols <p>该Flow允许创建的输出协议</p>
     */
    public void setAllowedOutputProtocols(String [] AllowedOutputProtocols) {
        this.AllowedOutputProtocols = AllowedOutputProtocols;
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
        if (source.AllowedInputProtocols != null) {
            this.AllowedInputProtocols = new String[source.AllowedInputProtocols.length];
            for (int i = 0; i < source.AllowedInputProtocols.length; i++) {
                this.AllowedInputProtocols[i] = new String(source.AllowedInputProtocols[i]);
            }
        }
        if (source.AllowedOutputProtocols != null) {
            this.AllowedOutputProtocols = new String[source.AllowedOutputProtocols.length];
            for (int i = 0; i < source.AllowedOutputProtocols.length; i++) {
                this.AllowedOutputProtocols[i] = new String(source.AllowedOutputProtocols[i]);
            }
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
        this.setParamArraySimple(map, prefix + "AllowedInputProtocols.", this.AllowedInputProtocols);
        this.setParamArraySimple(map, prefix + "AllowedOutputProtocols.", this.AllowedOutputProtocols);

    }
}

