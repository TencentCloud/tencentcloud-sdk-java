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

public class CreateProxyEndPointRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 私有网络ID，默认与集群私有网络ID保持一致
    */
    @SerializedName("UniqueVpcId")
    @Expose
    private String UniqueVpcId;

    /**
    * 私有网络子网ID，默认与集群子网ID保持一致
    */
    @SerializedName("UniqueSubnetId")
    @Expose
    private String UniqueSubnetId;

    /**
    * 连接池类型：SessionConnectionPool(会话级别连接池 )
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * 是否开启连接池,yes-开启，no-不开启
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * 连接池阈值：单位（秒）
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

    /**
    * 安全组ID数组
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 描述说明
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * vip信息
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 权重模式：
system-系统分配，custom-自定义
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * 是否自动添加只读实例，yes-是，no-不自动添加
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * 是否开启故障转移
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * 一致性类型：
eventual,global,session
    */
    @SerializedName("ConsistencyType")
    @Expose
    private String ConsistencyType;

    /**
    * 读写属性：
READWRITE,READONLY
    */
    @SerializedName("RwType")
    @Expose
    private String RwType;

    /**
    * 一致性超时时间
    */
    @SerializedName("ConsistencyTimeOut")
    @Expose
    private Long ConsistencyTimeOut;

    /**
    * 事务拆分
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * 连接模式：
nearby,balance
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * 实例权重
    */
    @SerializedName("InstanceWeights")
    @Expose
    private ProxyInstanceWeight [] InstanceWeights;

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
     * Get 私有网络ID，默认与集群私有网络ID保持一致 
     * @return UniqueVpcId 私有网络ID，默认与集群私有网络ID保持一致
     */
    public String getUniqueVpcId() {
        return this.UniqueVpcId;
    }

    /**
     * Set 私有网络ID，默认与集群私有网络ID保持一致
     * @param UniqueVpcId 私有网络ID，默认与集群私有网络ID保持一致
     */
    public void setUniqueVpcId(String UniqueVpcId) {
        this.UniqueVpcId = UniqueVpcId;
    }

    /**
     * Get 私有网络子网ID，默认与集群子网ID保持一致 
     * @return UniqueSubnetId 私有网络子网ID，默认与集群子网ID保持一致
     */
    public String getUniqueSubnetId() {
        return this.UniqueSubnetId;
    }

    /**
     * Set 私有网络子网ID，默认与集群子网ID保持一致
     * @param UniqueSubnetId 私有网络子网ID，默认与集群子网ID保持一致
     */
    public void setUniqueSubnetId(String UniqueSubnetId) {
        this.UniqueSubnetId = UniqueSubnetId;
    }

    /**
     * Get 连接池类型：SessionConnectionPool(会话级别连接池 ) 
     * @return ConnectionPoolType 连接池类型：SessionConnectionPool(会话级别连接池 )
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set 连接池类型：SessionConnectionPool(会话级别连接池 )
     * @param ConnectionPoolType 连接池类型：SessionConnectionPool(会话级别连接池 )
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get 是否开启连接池,yes-开启，no-不开启 
     * @return OpenConnectionPool 是否开启连接池,yes-开启，no-不开启
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set 是否开启连接池,yes-开启，no-不开启
     * @param OpenConnectionPool 是否开启连接池,yes-开启，no-不开启
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get 连接池阈值：单位（秒） 
     * @return ConnectionPoolTimeOut 连接池阈值：单位（秒）
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set 连接池阈值：单位（秒）
     * @param ConnectionPoolTimeOut 连接池阈值：单位（秒）
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    /**
     * Get 安全组ID数组 
     * @return SecurityGroupIds 安全组ID数组
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID数组
     * @param SecurityGroupIds 安全组ID数组
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 描述说明 
     * @return Description 描述说明
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述说明
     * @param Description 描述说明
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get vip信息 
     * @return Vip vip信息
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set vip信息
     * @param Vip vip信息
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 权重模式：
system-系统分配，custom-自定义 
     * @return WeightMode 权重模式：
system-系统分配，custom-自定义
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set 权重模式：
system-系统分配，custom-自定义
     * @param WeightMode 权重模式：
system-系统分配，custom-自定义
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get 是否自动添加只读实例，yes-是，no-不自动添加 
     * @return AutoAddRo 是否自动添加只读实例，yes-是，no-不自动添加
     */
    public String getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set 是否自动添加只读实例，yes-是，no-不自动添加
     * @param AutoAddRo 是否自动添加只读实例，yes-是，no-不自动添加
     */
    public void setAutoAddRo(String AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get 是否开启故障转移 
     * @return FailOver 是否开启故障转移
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set 是否开启故障转移
     * @param FailOver 是否开启故障转移
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get 一致性类型：
eventual,global,session 
     * @return ConsistencyType 一致性类型：
eventual,global,session
     */
    public String getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set 一致性类型：
eventual,global,session
     * @param ConsistencyType 一致性类型：
eventual,global,session
     */
    public void setConsistencyType(String ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * Get 读写属性：
READWRITE,READONLY 
     * @return RwType 读写属性：
READWRITE,READONLY
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set 读写属性：
READWRITE,READONLY
     * @param RwType 读写属性：
READWRITE,READONLY
     */
    public void setRwType(String RwType) {
        this.RwType = RwType;
    }

    /**
     * Get 一致性超时时间 
     * @return ConsistencyTimeOut 一致性超时时间
     */
    public Long getConsistencyTimeOut() {
        return this.ConsistencyTimeOut;
    }

    /**
     * Set 一致性超时时间
     * @param ConsistencyTimeOut 一致性超时时间
     */
    public void setConsistencyTimeOut(Long ConsistencyTimeOut) {
        this.ConsistencyTimeOut = ConsistencyTimeOut;
    }

    /**
     * Get 事务拆分 
     * @return TransSplit 事务拆分
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set 事务拆分
     * @param TransSplit 事务拆分
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get 连接模式：
nearby,balance 
     * @return AccessMode 连接模式：
nearby,balance
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set 连接模式：
nearby,balance
     * @param AccessMode 连接模式：
nearby,balance
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get 实例权重 
     * @return InstanceWeights 实例权重
     */
    public ProxyInstanceWeight [] getInstanceWeights() {
        return this.InstanceWeights;
    }

    /**
     * Set 实例权重
     * @param InstanceWeights 实例权重
     */
    public void setInstanceWeights(ProxyInstanceWeight [] InstanceWeights) {
        this.InstanceWeights = InstanceWeights;
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

    }
}

