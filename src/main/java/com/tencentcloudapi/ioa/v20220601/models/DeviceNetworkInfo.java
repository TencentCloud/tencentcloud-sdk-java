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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceNetworkInfo extends AbstractModel {

    /**
    * 本地地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalAddr")
    @Expose
    private String LocalAddr;

    /**
    * 本地端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalPort")
    @Expose
    private Long LocalPort;

    /**
    * 进程id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * 进程名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 远程地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteAddr")
    @Expose
    private String RemoteAddr;

    /**
    * 远程端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemotePort")
    @Expose
    private Long RemotePort;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
     * Get 本地地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalAddr 本地地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocalAddr() {
        return this.LocalAddr;
    }

    /**
     * Set 本地地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalAddr 本地地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalAddr(String LocalAddr) {
        this.LocalAddr = LocalAddr;
    }

    /**
     * Get 本地端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalPort 本地端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLocalPort() {
        return this.LocalPort;
    }

    /**
     * Set 本地端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalPort 本地端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalPort(Long LocalPort) {
        this.LocalPort = LocalPort;
    }

    /**
     * Get 进程id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessId 进程id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set 进程id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessId 进程id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get 进程名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessName 进程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessName 进程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 远程地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteAddr 远程地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemoteAddr() {
        return this.RemoteAddr;
    }

    /**
     * Set 远程地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteAddr 远程地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteAddr(String RemoteAddr) {
        this.RemoteAddr = RemoteAddr;
    }

    /**
     * Get 远程端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemotePort 远程端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRemotePort() {
        return this.RemotePort;
    }

    /**
     * Set 远程端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemotePort 远程端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemotePort(Long RemotePort) {
        this.RemotePort = RemotePort;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(Long State) {
        this.State = State;
    }

    public DeviceNetworkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceNetworkInfo(DeviceNetworkInfo source) {
        if (source.LocalAddr != null) {
            this.LocalAddr = new String(source.LocalAddr);
        }
        if (source.LocalPort != null) {
            this.LocalPort = new Long(source.LocalPort);
        }
        if (source.ProcessId != null) {
            this.ProcessId = new Long(source.ProcessId);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.RemoteAddr != null) {
            this.RemoteAddr = new String(source.RemoteAddr);
        }
        if (source.RemotePort != null) {
            this.RemotePort = new Long(source.RemotePort);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalAddr", this.LocalAddr);
        this.setParamSimple(map, prefix + "LocalPort", this.LocalPort);
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "RemoteAddr", this.RemoteAddr);
        this.setParamSimple(map, prefix + "RemotePort", this.RemotePort);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

