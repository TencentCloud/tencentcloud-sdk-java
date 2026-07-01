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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyNodeInfo extends AbstractModel {

    /**
    * <p>数据库代理节点ID</p>
    */
    @SerializedName("ProxyNodeId")
    @Expose
    private String ProxyNodeId;

    /**
    * <p>节点当前连接数, DescribeProxyNodes接口此字段值不返回</p>
    */
    @SerializedName("ProxyNodeConnections")
    @Expose
    private Long ProxyNodeConnections;

    /**
    * <p>数据库代理节点cpu</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>数据库代理节点内存</p>
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * <p>数据库代理节点状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>数据库代理组ID</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>用户AppID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>数据库代理节点名字</p>
    */
    @SerializedName("OssProxyNodeName")
    @Expose
    private String OssProxyNodeName;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>数据库代理节点ID</p> 
     * @return ProxyNodeId <p>数据库代理节点ID</p>
     */
    public String getProxyNodeId() {
        return this.ProxyNodeId;
    }

    /**
     * Set <p>数据库代理节点ID</p>
     * @param ProxyNodeId <p>数据库代理节点ID</p>
     */
    public void setProxyNodeId(String ProxyNodeId) {
        this.ProxyNodeId = ProxyNodeId;
    }

    /**
     * Get <p>节点当前连接数, DescribeProxyNodes接口此字段值不返回</p> 
     * @return ProxyNodeConnections <p>节点当前连接数, DescribeProxyNodes接口此字段值不返回</p>
     */
    public Long getProxyNodeConnections() {
        return this.ProxyNodeConnections;
    }

    /**
     * Set <p>节点当前连接数, DescribeProxyNodes接口此字段值不返回</p>
     * @param ProxyNodeConnections <p>节点当前连接数, DescribeProxyNodes接口此字段值不返回</p>
     */
    public void setProxyNodeConnections(Long ProxyNodeConnections) {
        this.ProxyNodeConnections = ProxyNodeConnections;
    }

    /**
     * Get <p>数据库代理节点cpu</p> 
     * @return Cpu <p>数据库代理节点cpu</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>数据库代理节点cpu</p>
     * @param Cpu <p>数据库代理节点cpu</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>数据库代理节点内存</p> 
     * @return Mem <p>数据库代理节点内存</p>
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set <p>数据库代理节点内存</p>
     * @param Mem <p>数据库代理节点内存</p>
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get <p>数据库代理节点状态</p> 
     * @return Status <p>数据库代理节点状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>数据库代理节点状态</p>
     * @param Status <p>数据库代理节点状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>数据库代理组ID</p> 
     * @return ProxyGroupId <p>数据库代理组ID</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>数据库代理组ID</p>
     * @param ProxyGroupId <p>数据库代理组ID</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>用户AppID</p> 
     * @return AppId <p>用户AppID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户AppID</p>
     * @param AppId <p>用户AppID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>数据库代理节点名字</p> 
     * @return OssProxyNodeName <p>数据库代理节点名字</p>
     */
    public String getOssProxyNodeName() {
        return this.OssProxyNodeName;
    }

    /**
     * Set <p>数据库代理节点名字</p>
     * @param OssProxyNodeName <p>数据库代理节点名字</p>
     */
    public void setOssProxyNodeName(String OssProxyNodeName) {
        this.OssProxyNodeName = OssProxyNodeName;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
        if (source.OssProxyNodeName != null) {
            this.OssProxyNodeName = new String(source.OssProxyNodeName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
        this.setParamSimple(map, prefix + "OssProxyNodeName", this.OssProxyNodeName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

