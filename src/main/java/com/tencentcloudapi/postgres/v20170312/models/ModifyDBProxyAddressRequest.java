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

public class ModifyDBProxyAddressRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>Proxy地址ID</p>
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * <p>Proxy代理组 ID（不传则默认操作该实例下唯一的代理）</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * <p>地址描述/备注（最多 256 字符）</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>连接池开关</p><p>枚举值：</p><ul><li>true： 开启</li><li>false： 关闭</li></ul>
    */
    @SerializedName("ConnectionPool")
    @Expose
    private Boolean ConnectionPool;

    /**
    * <p>权重模式</p><p>枚举值：</p><ul><li>system： 系统自动分配权重</li><li>custom： 自定义权重，此模式下ProxyAllocation参数必传</li></ul><p>默认值：system</p>
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * <p>system</p><p>入参限制：路由权重列表。若 WeightMode 传的是system或不传 ，则传入的权重不生效，由系统分配默认权重。</p>
    */
    @SerializedName("ProxyAllocation")
    @Expose
    private ProxyRoute [] ProxyAllocation;

    /**
    * <p>新增只读实例是否自动加入当前连接地址，仅后续新建实例生效</p>
    */
    @SerializedName("RoAutoAdd")
    @Expose
    private Boolean RoAutoAdd;

    /**
    * <p>延迟剔除开关</p>
    */
    @SerializedName("LatencyRemove")
    @Expose
    private Boolean LatencyRemove;

    /**
    * <p>延迟剔除阈值，仅在延迟剔除开关打开时有效</p><p>单位：秒</p>
    */
    @SerializedName("LatencyRemoveTime")
    @Expose
    private Long LatencyRemoveTime;

    /**
    * <p>最小保留路由数。在延迟/故障剔除时，至少保留的路由数量，防止所有节点被剔除导致服务不可用。</p>
    */
    @SerializedName("MinRouteNum")
    @Expose
    private Long MinRouteNum;

    /**
    * <p>负载均衡策略</p><p>枚举值：</p><ul><li>0： 按活跃连接数(默认)</li><li>1： 按请求数</li></ul>
    */
    @SerializedName("LoadBalancePolicy")
    @Expose
    private Long LoadBalancePolicy;

    /**
     * Get <p>实例ID</p> 
     * @return DBInstanceId <p>实例ID</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param DBInstanceId <p>实例ID</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>Proxy地址ID</p> 
     * @return AddressId <p>Proxy地址ID</p>
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set <p>Proxy地址ID</p>
     * @param AddressId <p>Proxy地址ID</p>
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get <p>Proxy代理组 ID（不传则默认操作该实例下唯一的代理）</p> 
     * @return ProxyGroupId <p>Proxy代理组 ID（不传则默认操作该实例下唯一的代理）</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>Proxy代理组 ID（不传则默认操作该实例下唯一的代理）</p>
     * @param ProxyGroupId <p>Proxy代理组 ID（不传则默认操作该实例下唯一的代理）</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get <p>地址描述/备注（最多 256 字符）</p> 
     * @return Description <p>地址描述/备注（最多 256 字符）</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>地址描述/备注（最多 256 字符）</p>
     * @param Description <p>地址描述/备注（最多 256 字符）</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>连接池开关</p><p>枚举值：</p><ul><li>true： 开启</li><li>false： 关闭</li></ul> 
     * @return ConnectionPool <p>连接池开关</p><p>枚举值：</p><ul><li>true： 开启</li><li>false： 关闭</li></ul>
     */
    public Boolean getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set <p>连接池开关</p><p>枚举值：</p><ul><li>true： 开启</li><li>false： 关闭</li></ul>
     * @param ConnectionPool <p>连接池开关</p><p>枚举值：</p><ul><li>true： 开启</li><li>false： 关闭</li></ul>
     */
    public void setConnectionPool(Boolean ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get <p>权重模式</p><p>枚举值：</p><ul><li>system： 系统自动分配权重</li><li>custom： 自定义权重，此模式下ProxyAllocation参数必传</li></ul><p>默认值：system</p> 
     * @return WeightMode <p>权重模式</p><p>枚举值：</p><ul><li>system： 系统自动分配权重</li><li>custom： 自定义权重，此模式下ProxyAllocation参数必传</li></ul><p>默认值：system</p>
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set <p>权重模式</p><p>枚举值：</p><ul><li>system： 系统自动分配权重</li><li>custom： 自定义权重，此模式下ProxyAllocation参数必传</li></ul><p>默认值：system</p>
     * @param WeightMode <p>权重模式</p><p>枚举值：</p><ul><li>system： 系统自动分配权重</li><li>custom： 自定义权重，此模式下ProxyAllocation参数必传</li></ul><p>默认值：system</p>
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get <p>system</p><p>入参限制：路由权重列表。若 WeightMode 传的是system或不传 ，则传入的权重不生效，由系统分配默认权重。</p> 
     * @return ProxyAllocation <p>system</p><p>入参限制：路由权重列表。若 WeightMode 传的是system或不传 ，则传入的权重不生效，由系统分配默认权重。</p>
     */
    public ProxyRoute [] getProxyAllocation() {
        return this.ProxyAllocation;
    }

    /**
     * Set <p>system</p><p>入参限制：路由权重列表。若 WeightMode 传的是system或不传 ，则传入的权重不生效，由系统分配默认权重。</p>
     * @param ProxyAllocation <p>system</p><p>入参限制：路由权重列表。若 WeightMode 传的是system或不传 ，则传入的权重不生效，由系统分配默认权重。</p>
     */
    public void setProxyAllocation(ProxyRoute [] ProxyAllocation) {
        this.ProxyAllocation = ProxyAllocation;
    }

    /**
     * Get <p>新增只读实例是否自动加入当前连接地址，仅后续新建实例生效</p> 
     * @return RoAutoAdd <p>新增只读实例是否自动加入当前连接地址，仅后续新建实例生效</p>
     */
    public Boolean getRoAutoAdd() {
        return this.RoAutoAdd;
    }

    /**
     * Set <p>新增只读实例是否自动加入当前连接地址，仅后续新建实例生效</p>
     * @param RoAutoAdd <p>新增只读实例是否自动加入当前连接地址，仅后续新建实例生效</p>
     */
    public void setRoAutoAdd(Boolean RoAutoAdd) {
        this.RoAutoAdd = RoAutoAdd;
    }

    /**
     * Get <p>延迟剔除开关</p> 
     * @return LatencyRemove <p>延迟剔除开关</p>
     */
    public Boolean getLatencyRemove() {
        return this.LatencyRemove;
    }

    /**
     * Set <p>延迟剔除开关</p>
     * @param LatencyRemove <p>延迟剔除开关</p>
     */
    public void setLatencyRemove(Boolean LatencyRemove) {
        this.LatencyRemove = LatencyRemove;
    }

    /**
     * Get <p>延迟剔除阈值，仅在延迟剔除开关打开时有效</p><p>单位：秒</p> 
     * @return LatencyRemoveTime <p>延迟剔除阈值，仅在延迟剔除开关打开时有效</p><p>单位：秒</p>
     */
    public Long getLatencyRemoveTime() {
        return this.LatencyRemoveTime;
    }

    /**
     * Set <p>延迟剔除阈值，仅在延迟剔除开关打开时有效</p><p>单位：秒</p>
     * @param LatencyRemoveTime <p>延迟剔除阈值，仅在延迟剔除开关打开时有效</p><p>单位：秒</p>
     */
    public void setLatencyRemoveTime(Long LatencyRemoveTime) {
        this.LatencyRemoveTime = LatencyRemoveTime;
    }

    /**
     * Get <p>最小保留路由数。在延迟/故障剔除时，至少保留的路由数量，防止所有节点被剔除导致服务不可用。</p> 
     * @return MinRouteNum <p>最小保留路由数。在延迟/故障剔除时，至少保留的路由数量，防止所有节点被剔除导致服务不可用。</p>
     */
    public Long getMinRouteNum() {
        return this.MinRouteNum;
    }

    /**
     * Set <p>最小保留路由数。在延迟/故障剔除时，至少保留的路由数量，防止所有节点被剔除导致服务不可用。</p>
     * @param MinRouteNum <p>最小保留路由数。在延迟/故障剔除时，至少保留的路由数量，防止所有节点被剔除导致服务不可用。</p>
     */
    public void setMinRouteNum(Long MinRouteNum) {
        this.MinRouteNum = MinRouteNum;
    }

    /**
     * Get <p>负载均衡策略</p><p>枚举值：</p><ul><li>0： 按活跃连接数(默认)</li><li>1： 按请求数</li></ul> 
     * @return LoadBalancePolicy <p>负载均衡策略</p><p>枚举值：</p><ul><li>0： 按活跃连接数(默认)</li><li>1： 按请求数</li></ul>
     */
    public Long getLoadBalancePolicy() {
        return this.LoadBalancePolicy;
    }

    /**
     * Set <p>负载均衡策略</p><p>枚举值：</p><ul><li>0： 按活跃连接数(默认)</li><li>1： 按请求数</li></ul>
     * @param LoadBalancePolicy <p>负载均衡策略</p><p>枚举值：</p><ul><li>0： 按活跃连接数(默认)</li><li>1： 按请求数</li></ul>
     */
    public void setLoadBalancePolicy(Long LoadBalancePolicy) {
        this.LoadBalancePolicy = LoadBalancePolicy;
    }

    public ModifyDBProxyAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBProxyAddressRequest(ModifyDBProxyAddressRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConnectionPool != null) {
            this.ConnectionPool = new Boolean(source.ConnectionPool);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.ProxyAllocation != null) {
            this.ProxyAllocation = new ProxyRoute[source.ProxyAllocation.length];
            for (int i = 0; i < source.ProxyAllocation.length; i++) {
                this.ProxyAllocation[i] = new ProxyRoute(source.ProxyAllocation[i]);
            }
        }
        if (source.RoAutoAdd != null) {
            this.RoAutoAdd = new Boolean(source.RoAutoAdd);
        }
        if (source.LatencyRemove != null) {
            this.LatencyRemove = new Boolean(source.LatencyRemove);
        }
        if (source.LatencyRemoveTime != null) {
            this.LatencyRemoveTime = new Long(source.LatencyRemoveTime);
        }
        if (source.MinRouteNum != null) {
            this.MinRouteNum = new Long(source.MinRouteNum);
        }
        if (source.LoadBalancePolicy != null) {
            this.LoadBalancePolicy = new Long(source.LoadBalancePolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ConnectionPool", this.ConnectionPool);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamArrayObj(map, prefix + "ProxyAllocation.", this.ProxyAllocation);
        this.setParamSimple(map, prefix + "RoAutoAdd", this.RoAutoAdd);
        this.setParamSimple(map, prefix + "LatencyRemove", this.LatencyRemove);
        this.setParamSimple(map, prefix + "LatencyRemoveTime", this.LatencyRemoveTime);
        this.setParamSimple(map, prefix + "MinRouteNum", this.MinRouteNum);
        this.setParamSimple(map, prefix + "LoadBalancePolicy", this.LoadBalancePolicy);

    }
}

