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

public class ProxyEndPointItem extends AbstractModel {

    /**
    * <p>vpc id</p>
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * <p>安全组列表</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>权重模式</p><p>枚举值：</p><ul><li>system： 系统分配</li><li>custom： 自定义</li></ul>
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * <p>是否自动添加只读实例</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul>
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * <p>读写类型</p><p>枚举值：</p><ul><li>READWRITE： 读写</li><li>READONLY： 只读</li></ul>
    */
    @SerializedName("RwType")
    @Expose
    private String RwType;

    /**
    * <p>是否开启故障转移</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul>
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * <p>一致性超时时间</p>
    */
    @SerializedName("ConsistencyTimeOut")
    @Expose
    private Long ConsistencyTimeOut;

    /**
    * <p>一致性类型。</p><p>枚举值：</p><ul><li>eventual： 最终一致性</li><li>global： 全局一致性</li><li>session： 会话一致性</li></ul><p>仅当 RwType 参数值为 READWRITE 时，才支持设置此项。</p>
    */
    @SerializedName("ConsistencyType")
    @Expose
    private String ConsistencyType;

    /**
    * <p>是否开启事务拆分。</p><p>开启后，在一个事务中拆分读和写到不同的实例上去执行。</p>
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * <p>接入模式</p><p>枚举值：</p><ul><li>nearby： 就近访问</li><li>balance： 均衡分配</li></ul>
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * <p>实例及权重</p>
    */
    @SerializedName("InstanceWeights")
    @Expose
    private ProxyInstanceWeight [] InstanceWeights;

    /**
    * <p>描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>自动负载模式</p><p>枚举值：</p><ul><li>static： 静态</li><li>dynamic： 自适应</li></ul>
    */
    @SerializedName("LoadBalanceMode")
    @Expose
    private String LoadBalanceMode;

    /**
    * <p>是否开启连接池</p><p>枚举值：</p><ul><li>yes： 打开</li><li>no： 不打开</li></ul>
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * <p>连接池类型</p><p>枚举值：</p><ul><li>SessionConnectionPool： 会话级连接池</li><li>TransactionConnectionPool： 事物级连接池</li></ul>
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * <p>连接池阀值</p>
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

    /**
     * Get <p>vpc id</p> 
     * @return UniqueVpcId <p>vpc id</p>
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set <p>vpc id</p>
     * @param UniqueVpcId <p>vpc id</p>
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get <p>子网ID</p> 
     * @return UniqueSubnetId <p>子网ID</p>
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set <p>子网ID</p>
     * @param UniqueSubnetId <p>子网ID</p>
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get <p>安全组列表</p> 
     * @return SecurityGroupIds <p>安全组列表</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>安全组列表</p>
     * @param SecurityGroupIds <p>安全组列表</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>权重模式</p><p>枚举值：</p><ul><li>system： 系统分配</li><li>custom： 自定义</li></ul> 
     * @return WeightMode <p>权重模式</p><p>枚举值：</p><ul><li>system： 系统分配</li><li>custom： 自定义</li></ul>
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set <p>权重模式</p><p>枚举值：</p><ul><li>system： 系统分配</li><li>custom： 自定义</li></ul>
     * @param WeightMode <p>权重模式</p><p>枚举值：</p><ul><li>system： 系统分配</li><li>custom： 自定义</li></ul>
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get <p>是否自动添加只读实例</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul> 
     * @return AutoAddRo <p>是否自动添加只读实例</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul>
     */
    public String getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set <p>是否自动添加只读实例</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul>
     * @param AutoAddRo <p>是否自动添加只读实例</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul>
     */
    public void setAutoAddRo(String AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get <p>读写类型</p><p>枚举值：</p><ul><li>READWRITE： 读写</li><li>READONLY： 只读</li></ul> 
     * @return RwType <p>读写类型</p><p>枚举值：</p><ul><li>READWRITE： 读写</li><li>READONLY： 只读</li></ul>
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set <p>读写类型</p><p>枚举值：</p><ul><li>READWRITE： 读写</li><li>READONLY： 只读</li></ul>
     * @param RwType <p>读写类型</p><p>枚举值：</p><ul><li>READWRITE： 读写</li><li>READONLY： 只读</li></ul>
     */
    public void setRwType(String RwType) {
        this.RwType = RwType;
    }

    /**
     * Get <p>是否开启故障转移</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul> 
     * @return FailOver <p>是否开启故障转移</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul>
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set <p>是否开启故障转移</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul>
     * @param FailOver <p>是否开启故障转移</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul>
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get <p>一致性超时时间</p> 
     * @return ConsistencyTimeOut <p>一致性超时时间</p>
     */
    public Long getConsistencyTimeOut() {
        return this.ConsistencyTimeOut;
    }

    /**
     * Set <p>一致性超时时间</p>
     * @param ConsistencyTimeOut <p>一致性超时时间</p>
     */
    public void setConsistencyTimeOut(Long ConsistencyTimeOut) {
        this.ConsistencyTimeOut = ConsistencyTimeOut;
    }

    /**
     * Get <p>一致性类型。</p><p>枚举值：</p><ul><li>eventual： 最终一致性</li><li>global： 全局一致性</li><li>session： 会话一致性</li></ul><p>仅当 RwType 参数值为 READWRITE 时，才支持设置此项。</p> 
     * @return ConsistencyType <p>一致性类型。</p><p>枚举值：</p><ul><li>eventual： 最终一致性</li><li>global： 全局一致性</li><li>session： 会话一致性</li></ul><p>仅当 RwType 参数值为 READWRITE 时，才支持设置此项。</p>
     */
    public String getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set <p>一致性类型。</p><p>枚举值：</p><ul><li>eventual： 最终一致性</li><li>global： 全局一致性</li><li>session： 会话一致性</li></ul><p>仅当 RwType 参数值为 READWRITE 时，才支持设置此项。</p>
     * @param ConsistencyType <p>一致性类型。</p><p>枚举值：</p><ul><li>eventual： 最终一致性</li><li>global： 全局一致性</li><li>session： 会话一致性</li></ul><p>仅当 RwType 参数值为 READWRITE 时，才支持设置此项。</p>
     */
    public void setConsistencyType(String ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * Get <p>是否开启事务拆分。</p><p>开启后，在一个事务中拆分读和写到不同的实例上去执行。</p> 
     * @return TransSplit <p>是否开启事务拆分。</p><p>开启后，在一个事务中拆分读和写到不同的实例上去执行。</p>
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set <p>是否开启事务拆分。</p><p>开启后，在一个事务中拆分读和写到不同的实例上去执行。</p>
     * @param TransSplit <p>是否开启事务拆分。</p><p>开启后，在一个事务中拆分读和写到不同的实例上去执行。</p>
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get <p>接入模式</p><p>枚举值：</p><ul><li>nearby： 就近访问</li><li>balance： 均衡分配</li></ul> 
     * @return AccessMode <p>接入模式</p><p>枚举值：</p><ul><li>nearby： 就近访问</li><li>balance： 均衡分配</li></ul>
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>接入模式</p><p>枚举值：</p><ul><li>nearby： 就近访问</li><li>balance： 均衡分配</li></ul>
     * @param AccessMode <p>接入模式</p><p>枚举值：</p><ul><li>nearby： 就近访问</li><li>balance： 均衡分配</li></ul>
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get <p>实例及权重</p> 
     * @return InstanceWeights <p>实例及权重</p>
     */
    public ProxyInstanceWeight [] getInstanceWeights() {
        return this.InstanceWeights;
    }

    /**
     * Set <p>实例及权重</p>
     * @param InstanceWeights <p>实例及权重</p>
     */
    public void setInstanceWeights(ProxyInstanceWeight [] InstanceWeights) {
        this.InstanceWeights = InstanceWeights;
    }

    /**
     * Get <p>描述信息</p> 
     * @return Description <p>描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息</p>
     * @param Description <p>描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>自动负载模式</p><p>枚举值：</p><ul><li>static： 静态</li><li>dynamic： 自适应</li></ul> 
     * @return LoadBalanceMode <p>自动负载模式</p><p>枚举值：</p><ul><li>static： 静态</li><li>dynamic： 自适应</li></ul>
     */
    public String getLoadBalanceMode() {
        return this.LoadBalanceMode;
    }

    /**
     * Set <p>自动负载模式</p><p>枚举值：</p><ul><li>static： 静态</li><li>dynamic： 自适应</li></ul>
     * @param LoadBalanceMode <p>自动负载模式</p><p>枚举值：</p><ul><li>static： 静态</li><li>dynamic： 自适应</li></ul>
     */
    public void setLoadBalanceMode(String LoadBalanceMode) {
        this.LoadBalanceMode = LoadBalanceMode;
    }

    /**
     * Get <p>是否开启连接池</p><p>枚举值：</p><ul><li>yes： 打开</li><li>no： 不打开</li></ul> 
     * @return OpenConnectionPool <p>是否开启连接池</p><p>枚举值：</p><ul><li>yes： 打开</li><li>no： 不打开</li></ul>
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set <p>是否开启连接池</p><p>枚举值：</p><ul><li>yes： 打开</li><li>no： 不打开</li></ul>
     * @param OpenConnectionPool <p>是否开启连接池</p><p>枚举值：</p><ul><li>yes： 打开</li><li>no： 不打开</li></ul>
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get <p>连接池类型</p><p>枚举值：</p><ul><li>SessionConnectionPool： 会话级连接池</li><li>TransactionConnectionPool： 事物级连接池</li></ul> 
     * @return ConnectionPoolType <p>连接池类型</p><p>枚举值：</p><ul><li>SessionConnectionPool： 会话级连接池</li><li>TransactionConnectionPool： 事物级连接池</li></ul>
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set <p>连接池类型</p><p>枚举值：</p><ul><li>SessionConnectionPool： 会话级连接池</li><li>TransactionConnectionPool： 事物级连接池</li></ul>
     * @param ConnectionPoolType <p>连接池类型</p><p>枚举值：</p><ul><li>SessionConnectionPool： 会话级连接池</li><li>TransactionConnectionPool： 事物级连接池</li></ul>
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get <p>连接池阀值</p> 
     * @return ConnectionPoolTimeOut <p>连接池阀值</p>
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set <p>连接池阀值</p>
     * @param ConnectionPoolTimeOut <p>连接池阀值</p>
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    public ProxyEndPointItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyEndPointItem(ProxyEndPointItem source) {
        if (source.UniqueVpcId != null) {
            this.UniqueVpcId = new String(source.UniqueVpcId);
        }
        if (source.UniqueSubnetId != null) {
            this.UniqueSubnetId = new String(source.UniqueSubnetId);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new String(source.AutoAddRo);
        }
        if (source.RwType != null) {
            this.RwType = new String(source.RwType);
        }
        if (source.FailOver != null) {
            this.FailOver = new String(source.FailOver);
        }
        if (source.ConsistencyTimeOut != null) {
            this.ConsistencyTimeOut = new Long(source.ConsistencyTimeOut);
        }
        if (source.ConsistencyType != null) {
            this.ConsistencyType = new String(source.ConsistencyType);
        }
        if (source.TransSplit != null) {
            this.TransSplit = new Boolean(source.TransSplit);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
        }
        if (source.InstanceWeights != null) {
            this.InstanceWeights = new ProxyInstanceWeight[source.InstanceWeights.length];
            for (int i = 0; i < source.InstanceWeights.length; i++) {
                this.InstanceWeights[i] = new ProxyInstanceWeight(source.InstanceWeights[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.LoadBalanceMode != null) {
            this.LoadBalanceMode = new String(source.LoadBalanceMode);
        }
        if (source.OpenConnectionPool != null) {
            this.OpenConnectionPool = new String(source.OpenConnectionPool);
        }
        if (source.ConnectionPoolType != null) {
            this.ConnectionPoolType = new String(source.ConnectionPoolType);
        }
        if (source.ConnectionPoolTimeOut != null) {
            this.ConnectionPoolTimeOut = new Long(source.ConnectionPoolTimeOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamSimple(map, prefix + "RwType", this.RwType);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "ConsistencyTimeOut", this.ConsistencyTimeOut);
        this.setParamSimple(map, prefix + "ConsistencyType", this.ConsistencyType);
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamArrayObj(map, prefix + "InstanceWeights.", this.InstanceWeights);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "LoadBalanceMode", this.LoadBalanceMode);
        this.setParamSimple(map, prefix + "OpenConnectionPool", this.OpenConnectionPool);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "ConnectionPoolTimeOut", this.ConnectionPoolTimeOut);

    }
}

