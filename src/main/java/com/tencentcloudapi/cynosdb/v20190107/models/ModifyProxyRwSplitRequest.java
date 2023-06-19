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

public class ModifyProxyRwSplitRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 数据库代理组ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 一致性类型；“eventual"-最终一致性, "session"-会话一致性, "global"-全局一致性
    */
    @SerializedName("ConsistencyType")
    @Expose
    private String ConsistencyType;

    /**
    * 一致性超时时间
    */
    @SerializedName("ConsistencyTimeOut")
    @Expose
    private String ConsistencyTimeOut;

    /**
    * 读写权重分配模式；系统自动分配："system"， 自定义："custom"
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * 实例只读权重
    */
    @SerializedName("InstanceWeights")
    @Expose
    private ProxyInstanceWeight [] InstanceWeights;

    /**
    * 是否开启故障转移，代理出现故障后，连接地址将路由到主实例，取值："yes" , "no"
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * 是否自动添加只读实例，取值："yes" , "no"
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * 是否打开读写分离
    */
    @SerializedName("OpenRw")
    @Expose
    private String OpenRw;

    /**
    * 读写类型：
READWRITE,READONLY
    */
    @SerializedName("RwType")
    @Expose
    private String RwType;

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
    * 是否打开连接池：
yes,no
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * 连接池类型：
SessionConnectionPool
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * 连接池时间
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

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
     * Get 一致性类型；“eventual"-最终一致性, "session"-会话一致性, "global"-全局一致性 
     * @return ConsistencyType 一致性类型；“eventual"-最终一致性, "session"-会话一致性, "global"-全局一致性
     */
    public String getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set 一致性类型；“eventual"-最终一致性, "session"-会话一致性, "global"-全局一致性
     * @param ConsistencyType 一致性类型；“eventual"-最终一致性, "session"-会话一致性, "global"-全局一致性
     */
    public void setConsistencyType(String ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * Get 一致性超时时间 
     * @return ConsistencyTimeOut 一致性超时时间
     */
    public String getConsistencyTimeOut() {
        return this.ConsistencyTimeOut;
    }

    /**
     * Set 一致性超时时间
     * @param ConsistencyTimeOut 一致性超时时间
     */
    public void setConsistencyTimeOut(String ConsistencyTimeOut) {
        this.ConsistencyTimeOut = ConsistencyTimeOut;
    }

    /**
     * Get 读写权重分配模式；系统自动分配："system"， 自定义："custom" 
     * @return WeightMode 读写权重分配模式；系统自动分配："system"， 自定义："custom"
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set 读写权重分配模式；系统自动分配："system"， 自定义："custom"
     * @param WeightMode 读写权重分配模式；系统自动分配："system"， 自定义："custom"
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get 实例只读权重 
     * @return InstanceWeights 实例只读权重
     */
    public ProxyInstanceWeight [] getInstanceWeights() {
        return this.InstanceWeights;
    }

    /**
     * Set 实例只读权重
     * @param InstanceWeights 实例只读权重
     */
    public void setInstanceWeights(ProxyInstanceWeight [] InstanceWeights) {
        this.InstanceWeights = InstanceWeights;
    }

    /**
     * Get 是否开启故障转移，代理出现故障后，连接地址将路由到主实例，取值："yes" , "no" 
     * @return FailOver 是否开启故障转移，代理出现故障后，连接地址将路由到主实例，取值："yes" , "no"
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set 是否开启故障转移，代理出现故障后，连接地址将路由到主实例，取值："yes" , "no"
     * @param FailOver 是否开启故障转移，代理出现故障后，连接地址将路由到主实例，取值："yes" , "no"
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get 是否自动添加只读实例，取值："yes" , "no" 
     * @return AutoAddRo 是否自动添加只读实例，取值："yes" , "no"
     */
    public String getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set 是否自动添加只读实例，取值："yes" , "no"
     * @param AutoAddRo 是否自动添加只读实例，取值："yes" , "no"
     */
    public void setAutoAddRo(String AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get 是否打开读写分离 
     * @return OpenRw 是否打开读写分离
     */
    public String getOpenRw() {
        return this.OpenRw;
    }

    /**
     * Set 是否打开读写分离
     * @param OpenRw 是否打开读写分离
     */
    public void setOpenRw(String OpenRw) {
        this.OpenRw = OpenRw;
    }

    /**
     * Get 读写类型：
READWRITE,READONLY 
     * @return RwType 读写类型：
READWRITE,READONLY
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set 读写类型：
READWRITE,READONLY
     * @param RwType 读写类型：
READWRITE,READONLY
     */
    public void setRwType(String RwType) {
        this.RwType = RwType;
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
     * Get 是否打开连接池：
yes,no 
     * @return OpenConnectionPool 是否打开连接池：
yes,no
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set 是否打开连接池：
yes,no
     * @param OpenConnectionPool 是否打开连接池：
yes,no
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get 连接池类型：
SessionConnectionPool 
     * @return ConnectionPoolType 连接池类型：
SessionConnectionPool
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set 连接池类型：
SessionConnectionPool
     * @param ConnectionPoolType 连接池类型：
SessionConnectionPool
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get 连接池时间 
     * @return ConnectionPoolTimeOut 连接池时间
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set 连接池时间
     * @param ConnectionPoolTimeOut 连接池时间
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    public ModifyProxyRwSplitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProxyRwSplitRequest(ModifyProxyRwSplitRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ConsistencyType != null) {
            this.ConsistencyType = new String(source.ConsistencyType);
        }
        if (source.ConsistencyTimeOut != null) {
            this.ConsistencyTimeOut = new String(source.ConsistencyTimeOut);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.InstanceWeights != null) {
            this.InstanceWeights = new ProxyInstanceWeight[source.InstanceWeights.length];
            for (int i = 0; i < source.InstanceWeights.length; i++) {
                this.InstanceWeights[i] = new ProxyInstanceWeight(source.InstanceWeights[i]);
            }
        }
        if (source.FailOver != null) {
            this.FailOver = new String(source.FailOver);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new String(source.AutoAddRo);
        }
        if (source.OpenRw != null) {
            this.OpenRw = new String(source.OpenRw);
        }
        if (source.RwType != null) {
            this.RwType = new String(source.RwType);
        }
        if (source.TransSplit != null) {
            this.TransSplit = new Boolean(source.TransSplit);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ConsistencyType", this.ConsistencyType);
        this.setParamSimple(map, prefix + "ConsistencyTimeOut", this.ConsistencyTimeOut);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamArrayObj(map, prefix + "InstanceWeights.", this.InstanceWeights);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamSimple(map, prefix + "OpenRw", this.OpenRw);
        this.setParamSimple(map, prefix + "RwType", this.RwType);
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "OpenConnectionPool", this.OpenConnectionPool);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "ConnectionPoolTimeOut", this.ConnectionPoolTimeOut);

    }
}

