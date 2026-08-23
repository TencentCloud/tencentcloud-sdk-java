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

public class ProxyAddress extends AbstractModel {

    /**
    * <p>Proxy 接入地址 ID</p>
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * <p>Proxy 接入地址 IP</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>Proxy 接入地址端口</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>VPC ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网 ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>接入地址描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>是否开启连接池：0-未开启，1-开启</p>
    */
    @SerializedName("ConnectionPool")
    @Expose
    private Boolean ConnectionPool;

    /**
    * <p>路由列表</p>
    */
    @SerializedName("Routes")
    @Expose
    private ProxyRoute [] Routes;

    /**
    * <p>连接池大小</p>
    */
    @SerializedName("ConnectionPoolLimit")
    @Expose
    private Long ConnectionPoolLimit;

    /**
    * <p>读写分离开关。启用后 proxy 将读请求分发到只读节点，写请求仍走主节点。</p>
    */
    @SerializedName("RwSplitEnable")
    @Expose
    private Boolean RwSplitEnable;

    /**
    * <p>权重模式</p><p>枚举值：</p><ul><li>system： 系统自动分配</li><li>custom： 用户自定义权重</li></ul>
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * <p>新增只读是否自动加入读写分离</p>
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
    * <p>延迟剔除阈值</p><p>单位：秒</p>
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
    * <p>只读全部异常时是否回切到主</p>
    */
    @SerializedName("FailOver")
    @Expose
    private Boolean FailOver;

    /**
    * <p>负载均衡策略</p><p>枚举值：</p><ul><li>0： 按活跃连接数(默认)</li><li>1： 按请求数</li></ul>
    */
    @SerializedName("LoadBalancePolicy")
    @Expose
    private Long LoadBalancePolicy;

    /**
     * Get <p>Proxy 接入地址 ID</p> 
     * @return AddressId <p>Proxy 接入地址 ID</p>
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set <p>Proxy 接入地址 ID</p>
     * @param AddressId <p>Proxy 接入地址 ID</p>
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get <p>Proxy 接入地址 IP</p> 
     * @return Vip <p>Proxy 接入地址 IP</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>Proxy 接入地址 IP</p>
     * @param Vip <p>Proxy 接入地址 IP</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>Proxy 接入地址端口</p> 
     * @return Vport <p>Proxy 接入地址端口</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>Proxy 接入地址端口</p>
     * @param Vport <p>Proxy 接入地址端口</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>VPC ID</p> 
     * @return VpcId <p>VPC ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID</p>
     * @param VpcId <p>VPC ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网 ID</p> 
     * @return SubnetId <p>子网 ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 ID</p>
     * @param SubnetId <p>子网 ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>接入地址描述</p> 
     * @return Description <p>接入地址描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>接入地址描述</p>
     * @param Description <p>接入地址描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>是否开启连接池：0-未开启，1-开启</p> 
     * @return ConnectionPool <p>是否开启连接池：0-未开启，1-开启</p>
     */
    public Boolean getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set <p>是否开启连接池：0-未开启，1-开启</p>
     * @param ConnectionPool <p>是否开启连接池：0-未开启，1-开启</p>
     */
    public void setConnectionPool(Boolean ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get <p>路由列表</p> 
     * @return Routes <p>路由列表</p>
     */
    public ProxyRoute [] getRoutes() {
        return this.Routes;
    }

    /**
     * Set <p>路由列表</p>
     * @param Routes <p>路由列表</p>
     */
    public void setRoutes(ProxyRoute [] Routes) {
        this.Routes = Routes;
    }

    /**
     * Get <p>连接池大小</p> 
     * @return ConnectionPoolLimit <p>连接池大小</p>
     */
    public Long getConnectionPoolLimit() {
        return this.ConnectionPoolLimit;
    }

    /**
     * Set <p>连接池大小</p>
     * @param ConnectionPoolLimit <p>连接池大小</p>
     */
    public void setConnectionPoolLimit(Long ConnectionPoolLimit) {
        this.ConnectionPoolLimit = ConnectionPoolLimit;
    }

    /**
     * Get <p>读写分离开关。启用后 proxy 将读请求分发到只读节点，写请求仍走主节点。</p> 
     * @return RwSplitEnable <p>读写分离开关。启用后 proxy 将读请求分发到只读节点，写请求仍走主节点。</p>
     */
    public Boolean getRwSplitEnable() {
        return this.RwSplitEnable;
    }

    /**
     * Set <p>读写分离开关。启用后 proxy 将读请求分发到只读节点，写请求仍走主节点。</p>
     * @param RwSplitEnable <p>读写分离开关。启用后 proxy 将读请求分发到只读节点，写请求仍走主节点。</p>
     */
    public void setRwSplitEnable(Boolean RwSplitEnable) {
        this.RwSplitEnable = RwSplitEnable;
    }

    /**
     * Get <p>权重模式</p><p>枚举值：</p><ul><li>system： 系统自动分配</li><li>custom： 用户自定义权重</li></ul> 
     * @return WeightMode <p>权重模式</p><p>枚举值：</p><ul><li>system： 系统自动分配</li><li>custom： 用户自定义权重</li></ul>
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set <p>权重模式</p><p>枚举值：</p><ul><li>system： 系统自动分配</li><li>custom： 用户自定义权重</li></ul>
     * @param WeightMode <p>权重模式</p><p>枚举值：</p><ul><li>system： 系统自动分配</li><li>custom： 用户自定义权重</li></ul>
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get <p>新增只读是否自动加入读写分离</p> 
     * @return RoAutoAdd <p>新增只读是否自动加入读写分离</p>
     */
    public Boolean getRoAutoAdd() {
        return this.RoAutoAdd;
    }

    /**
     * Set <p>新增只读是否自动加入读写分离</p>
     * @param RoAutoAdd <p>新增只读是否自动加入读写分离</p>
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
     * Get <p>延迟剔除阈值</p><p>单位：秒</p> 
     * @return LatencyRemoveTime <p>延迟剔除阈值</p><p>单位：秒</p>
     */
    public Long getLatencyRemoveTime() {
        return this.LatencyRemoveTime;
    }

    /**
     * Set <p>延迟剔除阈值</p><p>单位：秒</p>
     * @param LatencyRemoveTime <p>延迟剔除阈值</p><p>单位：秒</p>
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
     * Get <p>只读全部异常时是否回切到主</p> 
     * @return FailOver <p>只读全部异常时是否回切到主</p>
     */
    public Boolean getFailOver() {
        return this.FailOver;
    }

    /**
     * Set <p>只读全部异常时是否回切到主</p>
     * @param FailOver <p>只读全部异常时是否回切到主</p>
     */
    public void setFailOver(Boolean FailOver) {
        this.FailOver = FailOver;
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

    public ProxyAddress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyAddress(ProxyAddress source) {
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConnectionPool != null) {
            this.ConnectionPool = new Boolean(source.ConnectionPool);
        }
        if (source.Routes != null) {
            this.Routes = new ProxyRoute[source.Routes.length];
            for (int i = 0; i < source.Routes.length; i++) {
                this.Routes[i] = new ProxyRoute(source.Routes[i]);
            }
        }
        if (source.ConnectionPoolLimit != null) {
            this.ConnectionPoolLimit = new Long(source.ConnectionPoolLimit);
        }
        if (source.RwSplitEnable != null) {
            this.RwSplitEnable = new Boolean(source.RwSplitEnable);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
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
        if (source.FailOver != null) {
            this.FailOver = new Boolean(source.FailOver);
        }
        if (source.LoadBalancePolicy != null) {
            this.LoadBalancePolicy = new Long(source.LoadBalancePolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ConnectionPool", this.ConnectionPool);
        this.setParamArrayObj(map, prefix + "Routes.", this.Routes);
        this.setParamSimple(map, prefix + "ConnectionPoolLimit", this.ConnectionPoolLimit);
        this.setParamSimple(map, prefix + "RwSplitEnable", this.RwSplitEnable);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "RoAutoAdd", this.RoAutoAdd);
        this.setParamSimple(map, prefix + "LatencyRemove", this.LatencyRemove);
        this.setParamSimple(map, prefix + "LatencyRemoveTime", this.LatencyRemoveTime);
        this.setParamSimple(map, prefix + "MinRouteNum", this.MinRouteNum);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "LoadBalancePolicy", this.LoadBalancePolicy);

    }
}

