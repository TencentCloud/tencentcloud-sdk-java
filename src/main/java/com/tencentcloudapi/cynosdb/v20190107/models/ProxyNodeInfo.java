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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyNodeInfo extends AbstractModel{

    /**
    * 数据库代理节点ID
    */
    @SerializedName("ProxyNodeId")
    @Expose
    private String ProxyNodeId;

    /**
    * 节点当前连接数, DescribeProxyNodes接口此字段值不返回
    */
    @SerializedName("ProxyNodeConnections")
    @Expose
    private Long ProxyNodeConnections;

    /**
    * 数据库代理节点cpu
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 数据库代理节点内存
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 数据库代理节点状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 数据库代理组ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 用户AppID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 数据库代理节点ID 
     * @return ProxyNodeId 数据库代理节点ID
     */
    public String getProxyNodeId() {
        return this.ProxyNodeId;
    }

    /**
     * Set 数据库代理节点ID
     * @param ProxyNodeId 数据库代理节点ID
     */
    public void setProxyNodeId(String ProxyNodeId) {
        this.ProxyNodeId = ProxyNodeId;
    }

    /**
     * Get 节点当前连接数, DescribeProxyNodes接口此字段值不返回 
     * @return ProxyNodeConnections 节点当前连接数, DescribeProxyNodes接口此字段值不返回
     */
    public Long getProxyNodeConnections() {
        return this.ProxyNodeConnections;
    }

    /**
     * Set 节点当前连接数, DescribeProxyNodes接口此字段值不返回
     * @param ProxyNodeConnections 节点当前连接数, DescribeProxyNodes接口此字段值不返回
     */
    public void setProxyNodeConnections(Long ProxyNodeConnections) {
        this.ProxyNodeConnections = ProxyNodeConnections;
    }

    /**
     * Get 数据库代理节点cpu 
     * @return Cpu 数据库代理节点cpu
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 数据库代理节点cpu
     * @param Cpu 数据库代理节点cpu
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 数据库代理节点内存 
     * @return Mem 数据库代理节点内存
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 数据库代理节点内存
     * @param Mem 数据库代理节点内存
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 数据库代理节点状态 
     * @return Status 数据库代理节点状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 数据库代理节点状态
     * @param Status 数据库代理节点状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 数据库代理组ID 
     * @return ProxyGroupId 数据库代理组ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 数据库代理组ID
     * @param ProxyGroupId 数据库代理组ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 用户AppID 
     * @return AppId 用户AppID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppID
     * @param AppId 用户AppID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public ProxyNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyNodeInfo(ProxyNodeInfo source) {
        if (source.ProxyNodeId != null) {
            this.ProxyNodeId = new String(source.ProxyNodeId);
        }
        if (source.ProxyNodeConnections != null) {
            this.ProxyNodeConnections = new Long(source.ProxyNodeConnections);
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
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyNodeId", this.ProxyNodeId);
        this.setParamSimple(map, prefix + "ProxyNodeConnections", this.ProxyNodeConnections);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

