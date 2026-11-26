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

public class CreateProxyRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>cpu核数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存</p>
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * <p>代理内核版本。不传时默认使用最新稳定版本（白名单用户以appoint策略为准）；显式指定时将实时校验该版本是否在当前集群支持的代理版本集合内，不在则返回错误。集群存在已开启列存索引的只读实例时，所选版本需不低于列存转发要求的最低版本（如1.4.7）</p>
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
    * <p>私有网络ID，默认与集群私有网络ID保持一致</p>
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * <p>私有网络子网ID，默认与集群子网ID保持一致</p>
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * <p>数据库代理组节点个数（该参数不再建议使用，建议使用ProxyZones)</p>
    */
    @SerializedName("ProxyCount")
    @Expose
    private Long ProxyCount;

    /**
    * <p>连接池类型：SessionConnectionPool(会话级别连接池 )</p>
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * <p>是否开启连接池,yes-开启，no-不开启</p>
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * <p>连接池阈值：单位（秒）</p>
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

    /**
    * <p>安全组ID数组</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>描述说明</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>数据库节点信息（该参数与ProxyCount需要任选一个输入）</p>
    */
    @SerializedName("ProxyZones")
    @Expose
    private ProxyZone [] ProxyZones;

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
     * Get <p>cpu核数</p> 
     * @return Cpu <p>cpu核数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>cpu核数</p>
     * @param Cpu <p>cpu核数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存</p> 
     * @return Mem <p>内存</p>
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set <p>内存</p>
     * @param Mem <p>内存</p>
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get <p>代理内核版本。不传时默认使用最新稳定版本（白名单用户以appoint策略为准）；显式指定时将实时校验该版本是否在当前集群支持的代理版本集合内，不在则返回错误。集群存在已开启列存索引的只读实例时，所选版本需不低于列存转发要求的最低版本（如1.4.7）</p> 
     * @return ProxyVersion <p>代理内核版本。不传时默认使用最新稳定版本（白名单用户以appoint策略为准）；显式指定时将实时校验该版本是否在当前集群支持的代理版本集合内，不在则返回错误。集群存在已开启列存索引的只读实例时，所选版本需不低于列存转发要求的最低版本（如1.4.7）</p>
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set <p>代理内核版本。不传时默认使用最新稳定版本（白名单用户以appoint策略为准）；显式指定时将实时校验该版本是否在当前集群支持的代理版本集合内，不在则返回错误。集群存在已开启列存索引的只读实例时，所选版本需不低于列存转发要求的最低版本（如1.4.7）</p>
     * @param ProxyVersion <p>代理内核版本。不传时默认使用最新稳定版本（白名单用户以appoint策略为准）；显式指定时将实时校验该版本是否在当前集群支持的代理版本集合内，不在则返回错误。集群存在已开启列存索引的只读实例时，所选版本需不低于列存转发要求的最低版本（如1.4.7）</p>
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * Get <p>私有网络ID，默认与集群私有网络ID保持一致</p> 
     * @return UniqueVpcId <p>私有网络ID，默认与集群私有网络ID保持一致</p>
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set <p>私有网络ID，默认与集群私有网络ID保持一致</p>
     * @param UniqueVpcId <p>私有网络ID，默认与集群私有网络ID保持一致</p>
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get <p>私有网络子网ID，默认与集群子网ID保持一致</p> 
     * @return UniqueSubnetId <p>私有网络子网ID，默认与集群子网ID保持一致</p>
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set <p>私有网络子网ID，默认与集群子网ID保持一致</p>
     * @param UniqueSubnetId <p>私有网络子网ID，默认与集群子网ID保持一致</p>
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get <p>数据库代理组节点个数（该参数不再建议使用，建议使用ProxyZones)</p> 
     * @return ProxyCount <p>数据库代理组节点个数（该参数不再建议使用，建议使用ProxyZones)</p>
     */
    public Long getProxyCount() {
        return this.ProxyCount;
    }

    /**
     * Set <p>数据库代理组节点个数（该参数不再建议使用，建议使用ProxyZones)</p>
     * @param ProxyCount <p>数据库代理组节点个数（该参数不再建议使用，建议使用ProxyZones)</p>
     */
    public void setProxyCount(Long ProxyCount) {
        this.ProxyCount = ProxyCount;
    }

    /**
     * Get <p>连接池类型：SessionConnectionPool(会话级别连接池 )</p> 
     * @return ConnectionPoolType <p>连接池类型：SessionConnectionPool(会话级别连接池 )</p>
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set <p>连接池类型：SessionConnectionPool(会话级别连接池 )</p>
     * @param ConnectionPoolType <p>连接池类型：SessionConnectionPool(会话级别连接池 )</p>
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get <p>是否开启连接池,yes-开启，no-不开启</p> 
     * @return OpenConnectionPool <p>是否开启连接池,yes-开启，no-不开启</p>
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set <p>是否开启连接池,yes-开启，no-不开启</p>
     * @param OpenConnectionPool <p>是否开启连接池,yes-开启，no-不开启</p>
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get <p>连接池阈值：单位（秒）</p> 
     * @return ConnectionPoolTimeOut <p>连接池阈值：单位（秒）</p>
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set <p>连接池阈值：单位（秒）</p>
     * @param ConnectionPoolTimeOut <p>连接池阈值：单位（秒）</p>
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    /**
     * Get <p>安全组ID数组</p> 
     * @return SecurityGroupIds <p>安全组ID数组</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>安全组ID数组</p>
     * @param SecurityGroupIds <p>安全组ID数组</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>描述说明</p> 
     * @return Description <p>描述说明</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述说明</p>
     * @param Description <p>描述说明</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>数据库节点信息（该参数与ProxyCount需要任选一个输入）</p> 
     * @return ProxyZones <p>数据库节点信息（该参数与ProxyCount需要任选一个输入）</p>
     */
    public ProxyZone [] getProxyZones() {
        return this.ProxyZones;
    }

    /**
     * Set <p>数据库节点信息（该参数与ProxyCount需要任选一个输入）</p>
     * @param ProxyZones <p>数据库节点信息（该参数与ProxyCount需要任选一个输入）</p>
     */
    public void setProxyZones(ProxyZone [] ProxyZones) {
        this.ProxyZones = ProxyZones;
    }

    public CreateProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProxyRequest(CreateProxyRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.ProxyVersion != null) {
            this.ProxyVersion = new String(source.ProxyVersion);
        }
        if (source.UniqueVpcId != null) {
            this.UniqueVpcId = new String(source.UniqueVpcId);
        }
        if (source.UniqueSubnetId != null) {
            this.UniqueSubnetId = new String(source.UniqueSubnetId);
        }
        if (source.ProxyCount != null) {
            this.ProxyCount = new Long(source.ProxyCount);
        }
        if (source.ConnectionPoolType != null) {
            this.ConnectionPoolType = new String(source.ConnectionPoolType);
        }
        if (source.OpenConnectionPool != null) {
            this.OpenConnectionPool = new String(source.OpenConnectionPool);
        }
        if (source.ConnectionPoolTimeOut != null) {
            this.ConnectionPoolTimeOut = new Long(source.ConnectionPoolTimeOut);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ProxyZones != null) {
            this.ProxyZones = new ProxyZone[source.ProxyZones.length];
            for (int i = 0; i < source.ProxyZones.length; i++) {
                this.ProxyZones[i] = new ProxyZone(source.ProxyZones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "ProxyVersion", this.ProxyVersion);
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamSimple(map, prefix + "ProxyCount", this.ProxyCount);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "OpenConnectionPool", this.OpenConnectionPool);
        this.setParamSimple(map, prefix + "ConnectionPoolTimeOut", this.ConnectionPoolTimeOut);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ProxyZones.", this.ProxyZones);

    }
}

