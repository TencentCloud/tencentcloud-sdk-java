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

public class FlowRealtimeStatusItem extends AbstractModel{

    /**
    * 类型，Input|Output。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 输入Id，如果Type为Input，此字段不为空。
    */
    @SerializedName("InputId")
    @Expose
    private String InputId;

    /**
    * 输出Id，如果Type为Output，此字段不为空。
    */
    @SerializedName("OutputId")
    @Expose
    private String OutputId;

    /**
    * 流Id。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 协议， SRT | RTMP。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 共同状态信息。
    */
    @SerializedName("CommonStatus")
    @Expose
    private FlowRealtimeStatusCommon CommonStatus;

    /**
    * 如果是SRT协议则有此字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SRTStatus")
    @Expose
    private FlowRealtimeStatusSRT SRTStatus;

    /**
    * 如果是RTMP协议则有此字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTMPStatus")
    @Expose
    private FlowRealtimeStatusRTMP RTMPStatus;

    /**
    * 服务器IP。
    */
    @SerializedName("ConnectServerIP")
    @Expose
    private String ConnectServerIP;

    /**
    * 如果是RTP协议则有此字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTPStatus")
    @Expose
    private FlowRealtimeStatusRTP RTPStatus;

    /**
     * Get 类型，Input|Output。 
     * @return Type 类型，Input|Output。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，Input|Output。
     * @param Type 类型，Input|Output。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 输入Id，如果Type为Input，此字段不为空。 
     * @return InputId 输入Id，如果Type为Input，此字段不为空。
     */
    public String getInputId() {
        return this.InputId;
    }

    /**
     * Set 输入Id，如果Type为Input，此字段不为空。
     * @param InputId 输入Id，如果Type为Input，此字段不为空。
     */
    public void setInputId(String InputId) {
        this.InputId = InputId;
    }

    /**
     * Get 输出Id，如果Type为Output，此字段不为空。 
     * @return OutputId 输出Id，如果Type为Output，此字段不为空。
     */
    public String getOutputId() {
        return this.OutputId;
    }

    /**
     * Set 输出Id，如果Type为Output，此字段不为空。
     * @param OutputId 输出Id，如果Type为Output，此字段不为空。
     */
    public void setOutputId(String OutputId) {
        this.OutputId = OutputId;
    }

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
     * Get 协议， SRT | RTMP。 
     * @return Protocol 协议， SRT | RTMP。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议， SRT | RTMP。
     * @param Protocol 协议， SRT | RTMP。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 共同状态信息。 
     * @return CommonStatus 共同状态信息。
     */
    public FlowRealtimeStatusCommon getCommonStatus() {
        return this.CommonStatus;
    }

    /**
     * Set 共同状态信息。
     * @param CommonStatus 共同状态信息。
     */
    public void setCommonStatus(FlowRealtimeStatusCommon CommonStatus) {
        this.CommonStatus = CommonStatus;
    }

    /**
     * Get 如果是SRT协议则有此字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SRTStatus 如果是SRT协议则有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FlowRealtimeStatusSRT getSRTStatus() {
        return this.SRTStatus;
    }

    /**
     * Set 如果是SRT协议则有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SRTStatus 如果是SRT协议则有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSRTStatus(FlowRealtimeStatusSRT SRTStatus) {
        this.SRTStatus = SRTStatus;
    }

    /**
     * Get 如果是RTMP协议则有此字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTMPStatus 如果是RTMP协议则有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FlowRealtimeStatusRTMP getRTMPStatus() {
        return this.RTMPStatus;
    }

    /**
     * Set 如果是RTMP协议则有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTMPStatus 如果是RTMP协议则有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTMPStatus(FlowRealtimeStatusRTMP RTMPStatus) {
        this.RTMPStatus = RTMPStatus;
    }

    /**
     * Get 服务器IP。 
     * @return ConnectServerIP 服务器IP。
     */
    public String getConnectServerIP() {
        return this.ConnectServerIP;
    }

    /**
     * Set 服务器IP。
     * @param ConnectServerIP 服务器IP。
     */
    public void setConnectServerIP(String ConnectServerIP) {
        this.ConnectServerIP = ConnectServerIP;
    }

    /**
     * Get 如果是RTP协议则有此字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTPStatus 如果是RTP协议则有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FlowRealtimeStatusRTP getRTPStatus() {
        return this.RTPStatus;
    }

    /**
     * Set 如果是RTP协议则有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTPStatus 如果是RTP协议则有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTPStatus(FlowRealtimeStatusRTP RTPStatus) {
        this.RTPStatus = RTPStatus;
    }

    public FlowRealtimeStatusItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowRealtimeStatusItem(FlowRealtimeStatusItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InputId != null) {
            this.InputId = new String(source.InputId);
        }
        if (source.OutputId != null) {
            this.OutputId = new String(source.OutputId);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.CommonStatus != null) {
            this.CommonStatus = new FlowRealtimeStatusCommon(source.CommonStatus);
        }
        if (source.SRTStatus != null) {
            this.SRTStatus = new FlowRealtimeStatusSRT(source.SRTStatus);
        }
        if (source.RTMPStatus != null) {
            this.RTMPStatus = new FlowRealtimeStatusRTMP(source.RTMPStatus);
        }
        if (source.ConnectServerIP != null) {
            this.ConnectServerIP = new String(source.ConnectServerIP);
        }
        if (source.RTPStatus != null) {
            this.RTPStatus = new FlowRealtimeStatusRTP(source.RTPStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InputId", this.InputId);
        this.setParamSimple(map, prefix + "OutputId", this.OutputId);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "CommonStatus.", this.CommonStatus);
        this.setParamObj(map, prefix + "SRTStatus.", this.SRTStatus);
        this.setParamObj(map, prefix + "RTMPStatus.", this.RTMPStatus);
        this.setParamSimple(map, prefix + "ConnectServerIP", this.ConnectServerIP);
        this.setParamObj(map, prefix + "RTPStatus.", this.RTPStatus);

    }
}

