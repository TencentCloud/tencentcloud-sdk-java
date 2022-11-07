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

public class FlowLogInfo extends AbstractModel{

    /**
    * 时间戳，单位为秒。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 输入输出类型（input/output）。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 输入或输出Id。
    */
    @SerializedName("InputOutputId")
    @Expose
    private String InputOutputId;

    /**
    * 协议。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 事件代码。
    */
    @SerializedName("EventCode")
    @Expose
    private String EventCode;

    /**
    * 事件信息。
    */
    @SerializedName("EventMessage")
    @Expose
    private String EventMessage;

    /**
    * 对端IP。
    */
    @SerializedName("RemoteIp")
    @Expose
    private String RemoteIp;

    /**
    * 对端端口。
    */
    @SerializedName("RemotePort")
    @Expose
    private String RemotePort;

    /**
    * 主备通道，0为主通道，1为备通道。
    */
    @SerializedName("Pipeline")
    @Expose
    private String Pipeline;

    /**
    * 输入或输出的名称。
    */
    @SerializedName("InputOutputName")
    @Expose
    private String InputOutputName;

    /**
     * Get 时间戳，单位为秒。 
     * @return Timestamp 时间戳，单位为秒。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳，单位为秒。
     * @param Timestamp 时间戳，单位为秒。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 输入输出类型（input/output）。 
     * @return Type 输入输出类型（input/output）。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 输入输出类型（input/output）。
     * @param Type 输入输出类型（input/output）。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 输入或输出Id。 
     * @return InputOutputId 输入或输出Id。
     */
    public String getInputOutputId() {
        return this.InputOutputId;
    }

    /**
     * Set 输入或输出Id。
     * @param InputOutputId 输入或输出Id。
     */
    public void setInputOutputId(String InputOutputId) {
        this.InputOutputId = InputOutputId;
    }

    /**
     * Get 协议。 
     * @return Protocol 协议。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议。
     * @param Protocol 协议。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 事件代码。 
     * @return EventCode 事件代码。
     */
    public String getEventCode() {
        return this.EventCode;
    }

    /**
     * Set 事件代码。
     * @param EventCode 事件代码。
     */
    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }

    /**
     * Get 事件信息。 
     * @return EventMessage 事件信息。
     */
    public String getEventMessage() {
        return this.EventMessage;
    }

    /**
     * Set 事件信息。
     * @param EventMessage 事件信息。
     */
    public void setEventMessage(String EventMessage) {
        this.EventMessage = EventMessage;
    }

    /**
     * Get 对端IP。 
     * @return RemoteIp 对端IP。
     */
    public String getRemoteIp() {
        return this.RemoteIp;
    }

    /**
     * Set 对端IP。
     * @param RemoteIp 对端IP。
     */
    public void setRemoteIp(String RemoteIp) {
        this.RemoteIp = RemoteIp;
    }

    /**
     * Get 对端端口。 
     * @return RemotePort 对端端口。
     */
    public String getRemotePort() {
        return this.RemotePort;
    }

    /**
     * Set 对端端口。
     * @param RemotePort 对端端口。
     */
    public void setRemotePort(String RemotePort) {
        this.RemotePort = RemotePort;
    }

    /**
     * Get 主备通道，0为主通道，1为备通道。 
     * @return Pipeline 主备通道，0为主通道，1为备通道。
     */
    public String getPipeline() {
        return this.Pipeline;
    }

    /**
     * Set 主备通道，0为主通道，1为备通道。
     * @param Pipeline 主备通道，0为主通道，1为备通道。
     */
    public void setPipeline(String Pipeline) {
        this.Pipeline = Pipeline;
    }

    /**
     * Get 输入或输出的名称。 
     * @return InputOutputName 输入或输出的名称。
     */
    public String getInputOutputName() {
        return this.InputOutputName;
    }

    /**
     * Set 输入或输出的名称。
     * @param InputOutputName 输入或输出的名称。
     */
    public void setInputOutputName(String InputOutputName) {
        this.InputOutputName = InputOutputName;
    }

    public FlowLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowLogInfo(FlowLogInfo source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InputOutputId != null) {
            this.InputOutputId = new String(source.InputOutputId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.EventCode != null) {
            this.EventCode = new String(source.EventCode);
        }
        if (source.EventMessage != null) {
            this.EventMessage = new String(source.EventMessage);
        }
        if (source.RemoteIp != null) {
            this.RemoteIp = new String(source.RemoteIp);
        }
        if (source.RemotePort != null) {
            this.RemotePort = new String(source.RemotePort);
        }
        if (source.Pipeline != null) {
            this.Pipeline = new String(source.Pipeline);
        }
        if (source.InputOutputName != null) {
            this.InputOutputName = new String(source.InputOutputName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InputOutputId", this.InputOutputId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "EventCode", this.EventCode);
        this.setParamSimple(map, prefix + "EventMessage", this.EventMessage);
        this.setParamSimple(map, prefix + "RemoteIp", this.RemoteIp);
        this.setParamSimple(map, prefix + "RemotePort", this.RemotePort);
        this.setParamSimple(map, prefix + "Pipeline", this.Pipeline);
        this.setParamSimple(map, prefix + "InputOutputName", this.InputOutputName);

    }
}

