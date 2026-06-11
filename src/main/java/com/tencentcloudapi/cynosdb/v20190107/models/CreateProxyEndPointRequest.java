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

public class CreateProxyEndPointRequest extends AbstractModel {

    /**
    * <p>集群 ID。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>私有网络 ID。</p>
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * <p>私有网络子网 ID。</p>
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * <p>连接池类型：SessionConnectionPool（会话级别连接池）。</p>
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * <p>是否开启连接池。<br>yes：表示开启。<br>no：表示不开启。</p>
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * <p>连接池阈值：单位（秒），可选范围：0 - 300秒。</p>
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

    /**
    * <p>绑定的安全组 ID 数组。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>描述说明。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>想要绑定的 vip 信息，需与 UniqueVpcId 对应。</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>权重模式：<br>system：系统分配。<br>custom：自定义。</p>
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * <p>是否自动添加只读实例。<br>yes：表示自动添加只读实例。<br>no：表示不自动添加只读实例。</p>
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * <p>是否开启故障转移。<br>yes：表示开启，开启后，当数据库代理出现故障时，连接地址将会路由到主实例。<br>no：表示不开启。<br>说明：<br>仅当 RwType 参数值为 READWRITE 时，才支持设置此项。</p>
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * <p>一致性类型：<br>eventual：最终一致性。<br>global：全局一致性。<br>session：会话一致性。<br>说明：<br>仅当 RwType 参数值为 READWRITE 时，才支持设置此项。</p>
    */
    @SerializedName("ConsistencyType")
    @Expose
    private String ConsistencyType;

    /**
    * <p>读写属性：<br>READWRITE：表示读写分离。当此参数值为 READWRITE 时，才支持设置 FailOver、ConsistencyType 参数。<br>READONLY：表示只读。</p>
    */
    @SerializedName("RwType")
    @Expose
    private String RwType;

    /**
    * <p>一致性超时时间。取值范围：0 ~ 1000000（微秒）。设置为0时，表示若只读实例出现延迟导致一致性策略不满足时，请求将一直等待。</p>
    */
    @SerializedName("ConsistencyTimeOut")
    @Expose
    private Long ConsistencyTimeOut;

    /**
    * <p>是否开启事务拆分。开启后，在一个事务中拆分读和写到不同的实例上去执行。</p>
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * <p>接入模式：<br>nearby：就近访问。<br>balance：均衡分配。</p>
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * <p>实例权重。</p>
    */
    @SerializedName("InstanceWeights")
    @Expose
    private ProxyInstanceWeight [] InstanceWeights;

    /**
    * <p>负载均衡模式</p><p>枚举值：</p><ul><li>static： 静态负载</li><li>dynamic： 动态负载</li></ul>
    */
    @SerializedName("LoadBalanceMode")
    @Expose
    private String LoadBalanceMode;

    /**
     * Get <p>集群 ID。</p> 
     * @return ClusterId <p>集群 ID。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID。</p>
     * @param ClusterId <p>集群 ID。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>私有网络 ID。</p> 
     * @return UniqueVpcId <p>私有网络 ID。</p>
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set <p>私有网络 ID。</p>
     * @param UniqueVpcId <p>私有网络 ID。</p>
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get <p>私有网络子网 ID。</p> 
     * @return UniqueSubnetId <p>私有网络子网 ID。</p>
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set <p>私有网络子网 ID。</p>
     * @param UniqueSubnetId <p>私有网络子网 ID。</p>
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get <p>连接池类型：SessionConnectionPool（会话级别连接池）。</p> 
     * @return ConnectionPoolType <p>连接池类型：SessionConnectionPool（会话级别连接池）。</p>
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set <p>连接池类型：SessionConnectionPool（会话级别连接池）。</p>
     * @param ConnectionPoolType <p>连接池类型：SessionConnectionPool（会话级别连接池）。</p>
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get <p>是否开启连接池。<br>yes：表示开启。<br>no：表示不开启。</p> 
     * @return OpenConnectionPool <p>是否开启连接池。<br>yes：表示开启。<br>no：表示不开启。</p>
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set <p>是否开启连接池。<br>yes：表示开启。<br>no：表示不开启。</p>
     * @param OpenConnectionPool <p>是否开启连接池。<br>yes：表示开启。<br>no：表示不开启。</p>
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get <p>连接池阈值：单位（秒），可选范围：0 - 300秒。</p> 
     * @return ConnectionPoolTimeOut <p>连接池阈值：单位（秒），可选范围：0 - 300秒。</p>
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set <p>连接池阈值：单位（秒），可选范围：0 - 300秒。</p>
     * @param ConnectionPoolTimeOut <p>连接池阈值：单位（秒），可选范围：0 - 300秒。</p>
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    /**
     * Get <p>绑定的安全组 ID 数组。</p> 
     * @return SecurityGroupIds <p>绑定的安全组 ID 数组。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>绑定的安全组 ID 数组。</p>
     * @param SecurityGroupIds <p>绑定的安全组 ID 数组。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>描述说明。</p> 
     * @return Description <p>描述说明。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述说明。</p>
     * @param Description <p>描述说明。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>想要绑定的 vip 信息，需与 UniqueVpcId 对应。</p> 
     * @return Vip <p>想要绑定的 vip 信息，需与 UniqueVpcId 对应。</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>想要绑定的 vip 信息，需与 UniqueVpcId 对应。</p>
     * @param Vip <p>想要绑定的 vip 信息，需与 UniqueVpcId 对应。</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>权重模式：<br>system：系统分配。<br>custom：自定义。</p> 
     * @return WeightMode <p>权重模式：<br>system：系统分配。<br>custom：自定义。</p>
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set <p>权重模式：<br>system：系统分配。<br>custom：自定义。</p>
     * @param WeightMode <p>权重模式：<br>system：系统分配。<br>custom：自定义。</p>
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get <p>是否自动添加只读实例。<br>yes：表示自动添加只读实例。<br>no：表示不自动添加只读实例。</p> 
     * @return AutoAddRo <p>是否自动添加只读实例。<br>yes：表示自动添加只读实例。<br>no：表示不自动添加只读实例。</p>
     */
    public String getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set <p>是否自动添加只读实例。<br>yes：表示自动添加只读实例。<br>no：表示不自动添加只读实例。</p>
     * @param AutoAddRo <p>是否自动添加只读实例。<br>yes：表示自动添加只读实例。<br>no：表示不自动添加只读实例。</p>
     */
    public void setAutoAddRo(String AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get <p>是否开启故障转移。<br>yes：表示开启，开启后，当数据库代理出现故障时，连接地址将会路由到主实例。<br>no：表示不开启。<br>说明：<br>仅当 RwType 参数值为 READWRITE 时，才支持设置此项。</p> 
     * @return FailOver <p>是否开启故障转移。<br>yes：表示开启，开启后，当数据库代理出现故障时，连接地址将会路由到主实例。<br>no：表示不开启。<br>说明：<br>仅当 RwType 参数值为 READWRITE 时，才支持设置此项。</p>
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set <p>是否开启故障转移。<br>yes：表示开启，开启后，当数据库代理出现故障时，连接地址将会路由到主实例。<br>no：表示不开启。<br>说明：<br>仅当 RwType 参数值为 READWRITE 时，才支持设置此项。</p>
     * @param FailOver <p>是否开启故障转移。<br>yes：表示开启，开启后，当数据库代理出现故障时，连接地址将会路由到主实例。<br>no：表示不开启。<br>说明：<br>仅当 RwType 参数值为 READWRITE 时，才支持设置此项。</p>
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get <p>一致性类型：<br>eventual：最终一致性。<br>global：全局一致性。<br>session：会话一致性。<br>说明：<br>仅当 RwType 参数值为 READWRITE 时，才支持设置此项。</p> 
     * @return ConsistencyType <p>一致性类型：<br>eventual：最终一致性。<br>global：全局一致性。<br>session：会话一致性。<br>说明：<br>仅当 RwType 参数值为 READWRITE 时，才支持设置此项。</p>
     */
    public String getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set <p>一致性类型：<br>eventual：最终一致性。<br>global：全局一致性。<br>session：会话一致性。<br>说明：<br>仅当 RwType 参数值为 READWRITE 时，才支持设置此项。</p>
     * @param ConsistencyType <p>一致性类型：<br>eventual：最终一致性。<br>global：全局一致性。<br>session：会话一致性。<br>说明：<br>仅当 RwType 参数值为 READWRITE 时，才支持设置此项。</p>
     */
    public void setConsistencyType(String ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * Get <p>读写属性：<br>READWRITE：表示读写分离。当此参数值为 READWRITE 时，才支持设置 FailOver、ConsistencyType 参数。<br>READONLY：表示只读。</p> 
     * @return RwType <p>读写属性：<br>READWRITE：表示读写分离。当此参数值为 READWRITE 时，才支持设置 FailOver、ConsistencyType 参数。<br>READONLY：表示只读。</p>
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set <p>读写属性：<br>READWRITE：表示读写分离。当此参数值为 READWRITE 时，才支持设置 FailOver、ConsistencyType 参数。<br>READONLY：表示只读。</p>
     * @param RwType <p>读写属性：<br>READWRITE：表示读写分离。当此参数值为 READWRITE 时，才支持设置 FailOver、ConsistencyType 参数。<br>READONLY：表示只读。</p>
     */
    public void setRwType(String RwType) {
        this.RwType = RwType;
    }

    /**
     * Get <p>一致性超时时间。取值范围：0 ~ 1000000（微秒）。设置为0时，表示若只读实例出现延迟导致一致性策略不满足时，请求将一直等待。</p> 
     * @return ConsistencyTimeOut <p>一致性超时时间。取值范围：0 ~ 1000000（微秒）。设置为0时，表示若只读实例出现延迟导致一致性策略不满足时，请求将一直等待。</p>
     */
    public Long getConsistencyTimeOut() {
        return this.ConsistencyTimeOut;
    }

    /**
     * Set <p>一致性超时时间。取值范围：0 ~ 1000000（微秒）。设置为0时，表示若只读实例出现延迟导致一致性策略不满足时，请求将一直等待。</p>
     * @param ConsistencyTimeOut <p>一致性超时时间。取值范围：0 ~ 1000000（微秒）。设置为0时，表示若只读实例出现延迟导致一致性策略不满足时，请求将一直等待。</p>
     */
    public void setConsistencyTimeOut(Long ConsistencyTimeOut) {
        this.ConsistencyTimeOut = ConsistencyTimeOut;
    }

    /**
     * Get <p>是否开启事务拆分。开启后，在一个事务中拆分读和写到不同的实例上去执行。</p> 
     * @return TransSplit <p>是否开启事务拆分。开启后，在一个事务中拆分读和写到不同的实例上去执行。</p>
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set <p>是否开启事务拆分。开启后，在一个事务中拆分读和写到不同的实例上去执行。</p>
     * @param TransSplit <p>是否开启事务拆分。开启后，在一个事务中拆分读和写到不同的实例上去执行。</p>
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get <p>接入模式：<br>nearby：就近访问。<br>balance：均衡分配。</p> 
     * @return AccessMode <p>接入模式：<br>nearby：就近访问。<br>balance：均衡分配。</p>
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>接入模式：<br>nearby：就近访问。<br>balance：均衡分配。</p>
     * @param AccessMode <p>接入模式：<br>nearby：就近访问。<br>balance：均衡分配。</p>
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get <p>实例权重。</p> 
     * @return InstanceWeights <p>实例权重。</p>
     */
    public ProxyInstanceWeight [] getInstanceWeights() {
        return this.InstanceWeights;
    }

    /**
     * Set <p>实例权重。</p>
     * @param InstanceWeights <p>实例权重。</p>
     */
    public void setInstanceWeights(ProxyInstanceWeight [] InstanceWeights) {
        this.InstanceWeights = InstanceWeights;
    }

    /**
     * Get <p>负载均衡模式</p><p>枚举值：</p><ul><li>static： 静态负载</li><li>dynamic： 动态负载</li></ul> 
     * @return LoadBalanceMode <p>负载均衡模式</p><p>枚举值：</p><ul><li>static： 静态负载</li><li>dynamic： 动态负载</li></ul>
     */
    public String getLoadBalanceMode() {
        return this.LoadBalanceMode;
    }

    /**
     * Set <p>负载均衡模式</p><p>枚举值：</p><ul><li>static： 静态负载</li><li>dynamic： 动态负载</li></ul>
     * @param LoadBalanceMode <p>负载均衡模式</p><p>枚举值：</p><ul><li>static： 静态负载</li><li>dynamic： 动态负载</li></ul>
     */
    public void setLoadBalanceMode(String LoadBalanceMode) {
        this.LoadBalanceMode = LoadBalanceMode;
    }

    public CreateProxyEndPointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProxyEndPointRequest(CreateProxyEndPointRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.UniqueVpcId != null) {
            this.UniqueVpcId = new String(source.UniqueVpcId);
        }
        if (source.UniqueSubnetId != null) {
            this.UniqueSubnetId = new String(source.UniqueSubnetId);
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
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new String(source.AutoAddRo);
        }
        if (source.FailOver != null) {
            this.FailOver = new String(source.FailOver);
        }
        if (source.ConsistencyType != null) {
            this.ConsistencyType = new String(source.ConsistencyType);
        }
        if (source.RwType != null) {
            this.RwType = new String(source.RwType);
        }
        if (source.ConsistencyTimeOut != null) {
            this.ConsistencyTimeOut = new Long(source.ConsistencyTimeOut);
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
        if (source.LoadBalanceMode != null) {
            this.LoadBalanceMode = new String(source.LoadBalanceMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "UniqueVpcId", this.UniqueVpcId);
        this.setParamSimple(map, prefix + "UniqueSubnetId", this.UniqueSubnetId);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "OpenConnectionPool", this.OpenConnectionPool);
        this.setParamSimple(map, prefix + "ConnectionPoolTimeOut", this.ConnectionPoolTimeOut);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "ConsistencyType", this.ConsistencyType);
        this.setParamSimple(map, prefix + "RwType", this.RwType);
        this.setParamSimple(map, prefix + "ConsistencyTimeOut", this.ConsistencyTimeOut);
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamArrayObj(map, prefix + "InstanceWeights.", this.InstanceWeights);
        this.setParamSimple(map, prefix + "LoadBalanceMode", this.LoadBalanceMode);

    }
}

