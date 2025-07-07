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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyNode extends AbstractModel {

    /**
    * 代理节点ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * CPU核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小，单位为 MB。
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 节点状态，0 - 初始化中，1 - 在线中，2 - 下线中，3 - 销毁中，4 - 故障恢复中，5 - 节点故障，6 - 切换中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 代理节点可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 代理节点地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 连接数
    */
    @SerializedName("Connection")
    @Expose
    private Long Connection;

    /**
     * Get 代理节点ID 
     * @return ProxyId 代理节点ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 代理节点ID
     * @param ProxyId 代理节点ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get CPU核数 
     * @return Cpu CPU核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核数
     * @param Cpu CPU核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小，单位为 MB。 
     * @return Mem 内存大小，单位为 MB。
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 内存大小，单位为 MB。
     * @param Mem 内存大小，单位为 MB。
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 节点状态，0 - 初始化中，1 - 在线中，2 - 下线中，3 - 销毁中，4 - 故障恢复中，5 - 节点故障，6 - 切换中。 
     * @return Status 节点状态，0 - 初始化中，1 - 在线中，2 - 下线中，3 - 销毁中，4 - 故障恢复中，5 - 节点故障，6 - 切换中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 节点状态，0 - 初始化中，1 - 在线中，2 - 下线中，3 - 销毁中，4 - 故障恢复中，5 - 节点故障，6 - 切换中。
     * @param Status 节点状态，0 - 初始化中，1 - 在线中，2 - 下线中，3 - 销毁中，4 - 故障恢复中，5 - 节点故障，6 - 切换中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 代理节点可用区 
     * @return Zone 代理节点可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 代理节点可用区
     * @param Zone 代理节点可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 代理节点地域 
     * @return Region 代理节点地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 代理节点地域
     * @param Region 代理节点地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 连接数 
     * @return Connection 连接数
     */
    public Long getConnection() {
        return this.Connection;
    }

    /**
     * Set 连接数
     * @param Connection 连接数
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
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
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
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Connection != null) {
            this.Connection = new Long(source.Connection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Connection", this.Connection);

    }
}

