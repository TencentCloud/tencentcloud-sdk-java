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

public class CreateDBProxyAddressRequest extends AbstractModel {

    /**
    * <p>实例 ID，指定要创建代理地址的目标实例</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>VPC ID，代理地址所属的私有网络</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网 ID，代理地址所属的子网</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>代理组 ID。不传则按实例自动查找其默认代理组</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * <p>安全组 ID 列表，用于代理地址的网络安全控制</p>
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * <p>代理地址备注信息，最长 256 个字符</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>连接池开关。true：开启连接池；false：关闭连接池</p>
    */
    @SerializedName("ConnectionPool")
    @Expose
    private Boolean ConnectionPool;

    /**
    * <p>权重模式。取值：<ul><li>system：系统自动分配权重</li><li>custom：手动指定权重，需配合 ProxyAllocation 参数使用</li></ul></p>
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * <p>路由权重列表。WeightMode 为 custom 时必填。若WeightMode传system或不传 ，则传入的权重不生效，由系统分配默认权重。</p>
    */
    @SerializedName("ProxyAllocation")
    @Expose
    private ProxyRoute [] ProxyAllocation;

    /**
    * <p>是否自动将新增的只读实例加入读写分离。true：自动加入；false：不自动加入</p>
    */
    @SerializedName("RoAutoAdd")
    @Expose
    private Boolean RoAutoAdd;

    /**
    * <p>延迟剔除开关。true：开启延迟剔除，当只读实例延迟超过阈值时自动剔除路由；false：关闭延迟剔除。开启时 LatencyRemoveTime 必填</p>
    */
    @SerializedName("LatencyRemove")
    @Expose
    private Boolean LatencyRemove;

    /**
    * <p>延迟剔除阈值，单位秒，取值范围 [1, 10000]。LatencyRemove 为 true 时必填</p>
    */
    @SerializedName("LatencyRemoveTime")
    @Expose
    private Long LatencyRemoveTime;

    /**
    * <p>最小路由节点数，取值范围 [0, 256]。用于防止延迟剔除将所有节点剔除后的兜底策略</p>
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
     * Get <p>实例 ID，指定要创建代理地址的目标实例</p> 
     * @return DBInstanceId <p>实例 ID，指定要创建代理地址的目标实例</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例 ID，指定要创建代理地址的目标实例</p>
     * @param DBInstanceId <p>实例 ID，指定要创建代理地址的目标实例</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>VPC ID，代理地址所属的私有网络</p> 
     * @return VpcId <p>VPC ID，代理地址所属的私有网络</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID，代理地址所属的私有网络</p>
     * @param VpcId <p>VPC ID，代理地址所属的私有网络</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网 ID，代理地址所属的子网</p> 
     * @return SubnetId <p>子网 ID，代理地址所属的子网</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 ID，代理地址所属的子网</p>
     * @param SubnetId <p>子网 ID，代理地址所属的子网</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>代理组 ID。不传则按实例自动查找其默认代理组</p> 
     * @return ProxyGroupId <p>代理组 ID。不传则按实例自动查找其默认代理组</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>代理组 ID。不传则按实例自动查找其默认代理组</p>
     * @param ProxyGroupId <p>代理组 ID。不传则按实例自动查找其默认代理组</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get <p>安全组 ID 列表，用于代理地址的网络安全控制</p> 
     * @return SecurityGroup <p>安全组 ID 列表，用于代理地址的网络安全控制</p>
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set <p>安全组 ID 列表，用于代理地址的网络安全控制</p>
     * @param SecurityGroup <p>安全组 ID 列表，用于代理地址的网络安全控制</p>
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get <p>代理地址备注信息，最长 256 个字符</p> 
     * @return Description <p>代理地址备注信息，最长 256 个字符</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>代理地址备注信息，最长 256 个字符</p>
     * @param Description <p>代理地址备注信息，最长 256 个字符</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>连接池开关。true：开启连接池；false：关闭连接池</p> 
     * @return ConnectionPool <p>连接池开关。true：开启连接池；false：关闭连接池</p>
     */
    public Boolean getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set <p>连接池开关。true：开启连接池；false：关闭连接池</p>
     * @param ConnectionPool <p>连接池开关。true：开启连接池；false：关闭连接池</p>
     */
    public void setConnectionPool(Boolean ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get <p>权重模式。取值：<ul><li>system：系统自动分配权重</li><li>custom：手动指定权重，需配合 ProxyAllocation 参数使用</li></ul></p> 
     * @return WeightMode <p>权重模式。取值：<ul><li>system：系统自动分配权重</li><li>custom：手动指定权重，需配合 ProxyAllocation 参数使用</li></ul></p>
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set <p>权重模式。取值：<ul><li>system：系统自动分配权重</li><li>custom：手动指定权重，需配合 ProxyAllocation 参数使用</li></ul></p>
     * @param WeightMode <p>权重模式。取值：<ul><li>system：系统自动分配权重</li><li>custom：手动指定权重，需配合 ProxyAllocation 参数使用</li></ul></p>
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get <p>路由权重列表。WeightMode 为 custom 时必填。若WeightMode传system或不传 ，则传入的权重不生效，由系统分配默认权重。</p> 
     * @return ProxyAllocation <p>路由权重列表。WeightMode 为 custom 时必填。若WeightMode传system或不传 ，则传入的权重不生效，由系统分配默认权重。</p>
     */
    public ProxyRoute [] getProxyAllocation() {
        return this.ProxyAllocation;
    }

    /**
     * Set <p>路由权重列表。WeightMode 为 custom 时必填。若WeightMode传system或不传 ，则传入的权重不生效，由系统分配默认权重。</p>
     * @param ProxyAllocation <p>路由权重列表。WeightMode 为 custom 时必填。若WeightMode传system或不传 ，则传入的权重不生效，由系统分配默认权重。</p>
     */
    public void setProxyAllocation(ProxyRoute [] ProxyAllocation) {
        this.ProxyAllocation = ProxyAllocation;
    }

    /**
     * Get <p>是否自动将新增的只读实例加入读写分离。true：自动加入；false：不自动加入</p> 
     * @return RoAutoAdd <p>是否自动将新增的只读实例加入读写分离。true：自动加入；false：不自动加入</p>
     */
    public Boolean getRoAutoAdd() {
        return this.RoAutoAdd;
    }

    /**
     * Set <p>是否自动将新增的只读实例加入读写分离。true：自动加入；false：不自动加入</p>
     * @param RoAutoAdd <p>是否自动将新增的只读实例加入读写分离。true：自动加入；false：不自动加入</p>
     */
    public void setRoAutoAdd(Boolean RoAutoAdd) {
        this.RoAutoAdd = RoAutoAdd;
    }

    /**
     * Get <p>延迟剔除开关。true：开启延迟剔除，当只读实例延迟超过阈值时自动剔除路由；false：关闭延迟剔除。开启时 LatencyRemoveTime 必填</p> 
     * @return LatencyRemove <p>延迟剔除开关。true：开启延迟剔除，当只读实例延迟超过阈值时自动剔除路由；false：关闭延迟剔除。开启时 LatencyRemoveTime 必填</p>
     */
    public Boolean getLatencyRemove() {
        return this.LatencyRemove;
    }

    /**
     * Set <p>延迟剔除开关。true：开启延迟剔除，当只读实例延迟超过阈值时自动剔除路由；false：关闭延迟剔除。开启时 LatencyRemoveTime 必填</p>
     * @param LatencyRemove <p>延迟剔除开关。true：开启延迟剔除，当只读实例延迟超过阈值时自动剔除路由；false：关闭延迟剔除。开启时 LatencyRemoveTime 必填</p>
     */
    public void setLatencyRemove(Boolean LatencyRemove) {
        this.LatencyRemove = LatencyRemove;
    }

    /**
     * Get <p>延迟剔除阈值，单位秒，取值范围 [1, 10000]。LatencyRemove 为 true 时必填</p> 
     * @return LatencyRemoveTime <p>延迟剔除阈值，单位秒，取值范围 [1, 10000]。LatencyRemove 为 true 时必填</p>
     */
    public Long getLatencyRemoveTime() {
        return this.LatencyRemoveTime;
    }

    /**
     * Set <p>延迟剔除阈值，单位秒，取值范围 [1, 10000]。LatencyRemove 为 true 时必填</p>
     * @param LatencyRemoveTime <p>延迟剔除阈值，单位秒，取值范围 [1, 10000]。LatencyRemove 为 true 时必填</p>
     */
    public void setLatencyRemoveTime(Long LatencyRemoveTime) {
        this.LatencyRemoveTime = LatencyRemoveTime;
    }

    /**
     * Get <p>最小路由节点数，取值范围 [0, 256]。用于防止延迟剔除将所有节点剔除后的兜底策略</p> 
     * @return MinRouteNum <p>最小路由节点数，取值范围 [0, 256]。用于防止延迟剔除将所有节点剔除后的兜底策略</p>
     */
    public Long getMinRouteNum() {
        return this.MinRouteNum;
    }

    /**
     * Set <p>最小路由节点数，取值范围 [0, 256]。用于防止延迟剔除将所有节点剔除后的兜底策略</p>
     * @param MinRouteNum <p>最小路由节点数，取值范围 [0, 256]。用于防止延迟剔除将所有节点剔除后的兜底策略</p>
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

    public CreateDBProxyAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBProxyAddressRequest(CreateDBProxyAddressRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
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
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
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

