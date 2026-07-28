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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyNode extends AbstractModel {

    /**
    * <p>Proxy 节点 ID</p>
    */
    @SerializedName("ProxyNodeId")
    @Expose
    private String ProxyNodeId;

    /**
    * <p>Proxy 节点所在可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>节点 CPU 核数（核）</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>节点内存大小（MB）</p><p>单位：MB</p>
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * <p>节点状态：running/isolated/abnormal 等</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>节点当前连接数</p>
    */
    @SerializedName("Connection")
    @Expose
    private Long Connection;

    /**
     * Get <p>Proxy 节点 ID</p> 
     * @return ProxyNodeId <p>Proxy 节点 ID</p>
     */
    public String getProxyNodeId() {
        return this.ProxyNodeId;
    }

    /**
     * Set <p>Proxy 节点 ID</p>
     * @param ProxyNodeId <p>Proxy 节点 ID</p>
     */
    public void setProxyNodeId(String ProxyNodeId) {
        this.ProxyNodeId = ProxyNodeId;
    }

    /**
     * Get <p>Proxy 节点所在可用区</p> 
     * @return Zone <p>Proxy 节点所在可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Proxy 节点所在可用区</p>
     * @param Zone <p>Proxy 节点所在可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>节点 CPU 核数（核）</p> 
     * @return Cpu <p>节点 CPU 核数（核）</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>节点 CPU 核数（核）</p>
     * @param Cpu <p>节点 CPU 核数（核）</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>节点内存大小（MB）</p><p>单位：MB</p> 
     * @return Mem <p>节点内存大小（MB）</p><p>单位：MB</p>
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set <p>节点内存大小（MB）</p><p>单位：MB</p>
     * @param Mem <p>节点内存大小（MB）</p><p>单位：MB</p>
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get <p>节点状态：running/isolated/abnormal 等</p> 
     * @return Status <p>节点状态：running/isolated/abnormal 等</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>节点状态：running/isolated/abnormal 等</p>
     * @param Status <p>节点状态：running/isolated/abnormal 等</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>节点当前连接数</p> 
     * @return Connection <p>节点当前连接数</p>
     */
    public Long getConnection() {
        return this.Connection;
    }

    /**
     * Set <p>节点当前连接数</p>
     * @param Connection <p>节点当前连接数</p>
     */
    public void setConnection(Long Connection) {
        this.Connection = Connection;
    }

    public ProxyNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyNode(ProxyNode source) {
        if (source.ProxyNodeId != null) {
            this.ProxyNodeId = new String(source.ProxyNodeId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Connection != null) {
            this.Connection = new Long(source.Connection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyNodeId", this.ProxyNodeId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Connection", this.Connection);

    }
}

