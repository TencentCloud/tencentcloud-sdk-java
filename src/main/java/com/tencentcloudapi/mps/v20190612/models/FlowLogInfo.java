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

public class FlowLogInfo extends AbstractModel {

    /**
    * <p>时间戳，单位为秒。</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * <p>输入输出类型（input/output）。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>输入或输出Id。</p>
    */
    @SerializedName("InputOutputId")
    @Expose
    private String InputOutputId;

    /**
    * <p>协议。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>事件代码。</p>
    */
    @SerializedName("EventCode")
    @Expose
    private String EventCode;

    /**
    * <p>事件信息。</p>
    */
    @SerializedName("EventMessage")
    @Expose
    private String EventMessage;

    /**
    * <p>对端IP。</p>
    */
    @SerializedName("RemoteIp")
    @Expose
    private String RemoteIp;

    /**
    * <p>对端端口。</p>
    */
    @SerializedName("RemotePort")
    @Expose
    private String RemotePort;

    /**
    * <p>主备通道，0为主通道，1为备通道。</p>
    */
    @SerializedName("Pipeline")
    @Expose
    private String Pipeline;

    /**
    * <p>输入或输出的名称。</p>
    */
    @SerializedName("InputOutputName")
    @Expose
    private String InputOutputName;

    /**
     * Get <p>时间戳，单位为秒。</p> 
     * @return Timestamp <p>时间戳，单位为秒。</p>
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>时间戳，单位为秒。</p>
     * @param Timestamp <p>时间戳，单位为秒。</p>
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>输入输出类型（input/output）。</p> 
     * @return Type <p>输入输出类型（input/output）。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>输入输出类型（input/output）。</p>
     * @param Type <p>输入输出类型（input/output）。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>输入或输出Id。</p> 
     * @return InputOutputId <p>输入或输出Id。</p>
     */
    public String getInputOutputId() {
        return this.InputOutputId;
    }

    /**
     * Set <p>输入或输出Id。</p>
     * @param InputOutputId <p>输入或输出Id。</p>
     */
    public void setInputOutputId(String InputOutputId) {
        this.InputOutputId = InputOutputId;
    }

    /**
     * Get <p>协议。</p> 
     * @return Protocol <p>协议。</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议。</p>
     * @param Protocol <p>协议。</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>事件代码。</p> 
     * @return EventCode <p>事件代码。</p>
     */
    public String getEventCode() {
        return this.EventCode;
    }

    /**
     * Set <p>事件代码。</p>
     * @param EventCode <p>事件代码。</p>
     */
    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }

    /**
     * Get <p>事件信息。</p> 
     * @return EventMessage <p>事件信息。</p>
     */
    public String getEventMessage() {
        return this.EventMessage;
    }

    /**
     * Set <p>事件信息。</p>
     * @param EventMessage <p>事件信息。</p>
     */
    public void setEventMessage(String EventMessage) {
        this.EventMessage = EventMessage;
    }

    /**
     * Get <p>对端IP。</p> 
     * @return RemoteIp <p>对端IP。</p>
     */
    public String getRemoteIp() {
        return this.RemoteIp;
    }

    /**
     * Set <p>对端IP。</p>
     * @param RemoteIp <p>对端IP。</p>
     */
    public void setRemoteIp(String RemoteIp) {
        this.RemoteIp = RemoteIp;
    }

    /**
     * Get <p>对端端口。</p> 
     * @return RemotePort <p>对端端口。</p>
     */
    public String getRemotePort() {
        return this.RemotePort;
    }

    /**
     * Set <p>对端端口。</p>
     * @param RemotePort <p>对端端口。</p>
     */
    public void setRemotePort(String RemotePort) {
        this.RemotePort = RemotePort;
    }

    /**
     * Get <p>主备通道，0为主通道，1为备通道。</p> 
     * @return Pipeline <p>主备通道，0为主通道，1为备通道。</p>
     */
    public String getPipeline() {
        return this.Pipeline;
    }

    /**
     * Set <p>主备通道，0为主通道，1为备通道。</p>
     * @param Pipeline <p>主备通道，0为主通道，1为备通道。</p>
     */
    public void setPipeline(String Pipeline) {
        this.Pipeline = Pipeline;
    }

    /**
     * Get <p>输入或输出的名称。</p> 
     * @return InputOutputName <p>输入或输出的名称。</p>
     */
    public String getInputOutputName() {
        return this.InputOutputName;
    }

    /**
     * Set <p>输入或输出的名称。</p>
     * @param InputOutputName <p>输入或输出的名称。</p>
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

