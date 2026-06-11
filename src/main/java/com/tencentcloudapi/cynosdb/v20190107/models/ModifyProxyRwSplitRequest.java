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

public class ModifyProxyRwSplitRequest extends AbstractModel {

    /**
    * <p>集群ID，例如cynosdbmysql-asd123</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>数据库代理组ID，例如cynosdbmysql-proxy-qwe123</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * <p>一致性类型；“eventual&quot;-最终一致性, &quot;session&quot;-会话一致性, &quot;global&quot;-全局一致性</p>
    */
    @SerializedName("ConsistencyType")
    @Expose
    private String ConsistencyType;

    /**
    * <p>一致性超时时间。<br>取值范围：0~1000000（微秒）,设置0则表示若只读实例出现延迟, 导致一致性策略不满足, 请求将一直等待。</p>
    */
    @SerializedName("ConsistencyTimeOut")
    @Expose
    private String ConsistencyTimeOut;

    /**
    * <p>读写权重分配模式；系统自动分配：&quot;system&quot;， 自定义：&quot;custom&quot;</p>
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * <p>实例只读权重。</p>
    */
    @SerializedName("InstanceWeights")
    @Expose
    private ProxyInstanceWeight [] InstanceWeights;

    /**
    * <p>是否开启故障转移，代理出现故障后，连接地址将路由到主实例，取值：&quot;yes&quot; , &quot;no&quot;</p>
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * <p>是否自动添加只读实例，取值：&quot;yes&quot; , &quot;no&quot;</p>
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * <p>是否打开读写分离。<br>该参数已废弃，请通过RwType设置读写属性。</p>
    */
    @SerializedName("OpenRw")
    @Expose
    private String OpenRw;

    /**
    * <p>读写类型：<br>READWRITE,READONLY</p>
    */
    @SerializedName("RwType")
    @Expose
    private String RwType;

    /**
    * <p>事务拆分。<br>在一个事务中拆分读和写到不同的实例上去执行。</p>
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * <p>连接模式：<br>nearby,balance</p>
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * <p>是否打开连接池：<br>yes,no</p>
    */
    @SerializedName("OpenConnectionPool")
    @Expose
    private String OpenConnectionPool;

    /**
    * <p>连接池类型：<br>SessionConnectionPool</p>
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * <p>连接池时间。<br>可选范围:0~300（秒）</p>
    */
    @SerializedName("ConnectionPoolTimeOut")
    @Expose
    private Long ConnectionPoolTimeOut;

    /**
    * <p>是否将libra节点当作普通RO节点</p>
    */
    @SerializedName("ApNodeAsRoNode")
    @Expose
    private Boolean ApNodeAsRoNode;

    /**
    * <p>libra节点故障，是否转发给其他节点</p>
    */
    @SerializedName("ApQueryToOtherNode")
    @Expose
    private Boolean ApQueryToOtherNode;

    /**
    * <p>负载均衡模式</p><p>枚举值：</p><ul><li>static： 静态负载</li><li>dynamic： 动态负载</li></ul>
    */
    @SerializedName("LoadBalanceMode")
    @Expose
    private String LoadBalanceMode;

    /**
     * Get <p>集群ID，例如cynosdbmysql-asd123</p> 
     * @return ClusterId <p>集群ID，例如cynosdbmysql-asd123</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID，例如cynosdbmysql-asd123</p>
     * @param ClusterId <p>集群ID，例如cynosdbmysql-asd123</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>数据库代理组ID，例如cynosdbmysql-proxy-qwe123</p> 
     * @return ProxyGroupId <p>数据库代理组ID，例如cynosdbmysql-proxy-qwe123</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>数据库代理组ID，例如cynosdbmysql-proxy-qwe123</p>
     * @param ProxyGroupId <p>数据库代理组ID，例如cynosdbmysql-proxy-qwe123</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get <p>一致性类型；“eventual&quot;-最终一致性, &quot;session&quot;-会话一致性, &quot;global&quot;-全局一致性</p> 
     * @return ConsistencyType <p>一致性类型；“eventual&quot;-最终一致性, &quot;session&quot;-会话一致性, &quot;global&quot;-全局一致性</p>
     */
    public String getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set <p>一致性类型；“eventual&quot;-最终一致性, &quot;session&quot;-会话一致性, &quot;global&quot;-全局一致性</p>
     * @param ConsistencyType <p>一致性类型；“eventual&quot;-最终一致性, &quot;session&quot;-会话一致性, &quot;global&quot;-全局一致性</p>
     */
    public void setConsistencyType(String ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * Get <p>一致性超时时间。<br>取值范围：0~1000000（微秒）,设置0则表示若只读实例出现延迟, 导致一致性策略不满足, 请求将一直等待。</p> 
     * @return ConsistencyTimeOut <p>一致性超时时间。<br>取值范围：0~1000000（微秒）,设置0则表示若只读实例出现延迟, 导致一致性策略不满足, 请求将一直等待。</p>
     */
    public String getConsistencyTimeOut() {
        return this.ConsistencyTimeOut;
    }

    /**
     * Set <p>一致性超时时间。<br>取值范围：0~1000000（微秒）,设置0则表示若只读实例出现延迟, 导致一致性策略不满足, 请求将一直等待。</p>
     * @param ConsistencyTimeOut <p>一致性超时时间。<br>取值范围：0~1000000（微秒）,设置0则表示若只读实例出现延迟, 导致一致性策略不满足, 请求将一直等待。</p>
     */
    public void setConsistencyTimeOut(String ConsistencyTimeOut) {
        this.ConsistencyTimeOut = ConsistencyTimeOut;
    }

    /**
     * Get <p>读写权重分配模式；系统自动分配：&quot;system&quot;， 自定义：&quot;custom&quot;</p> 
     * @return WeightMode <p>读写权重分配模式；系统自动分配：&quot;system&quot;， 自定义：&quot;custom&quot;</p>
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set <p>读写权重分配模式；系统自动分配：&quot;system&quot;， 自定义：&quot;custom&quot;</p>
     * @param WeightMode <p>读写权重分配模式；系统自动分配：&quot;system&quot;， 自定义：&quot;custom&quot;</p>
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get <p>实例只读权重。</p> 
     * @return InstanceWeights <p>实例只读权重。</p>
     */
    public ProxyInstanceWeight [] getInstanceWeights() {
        return this.InstanceWeights;
    }

    /**
     * Set <p>实例只读权重。</p>
     * @param InstanceWeights <p>实例只读权重。</p>
     */
    public void setInstanceWeights(ProxyInstanceWeight [] InstanceWeights) {
        this.InstanceWeights = InstanceWeights;
    }

    /**
     * Get <p>是否开启故障转移，代理出现故障后，连接地址将路由到主实例，取值：&quot;yes&quot; , &quot;no&quot;</p> 
     * @return FailOver <p>是否开启故障转移，代理出现故障后，连接地址将路由到主实例，取值：&quot;yes&quot; , &quot;no&quot;</p>
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set <p>是否开启故障转移，代理出现故障后，连接地址将路由到主实例，取值：&quot;yes&quot; , &quot;no&quot;</p>
     * @param FailOver <p>是否开启故障转移，代理出现故障后，连接地址将路由到主实例，取值：&quot;yes&quot; , &quot;no&quot;</p>
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get <p>是否自动添加只读实例，取值：&quot;yes&quot; , &quot;no&quot;</p> 
     * @return AutoAddRo <p>是否自动添加只读实例，取值：&quot;yes&quot; , &quot;no&quot;</p>
     */
    public String getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set <p>是否自动添加只读实例，取值：&quot;yes&quot; , &quot;no&quot;</p>
     * @param AutoAddRo <p>是否自动添加只读实例，取值：&quot;yes&quot; , &quot;no&quot;</p>
     */
    public void setAutoAddRo(String AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get <p>是否打开读写分离。<br>该参数已废弃，请通过RwType设置读写属性。</p> 
     * @return OpenRw <p>是否打开读写分离。<br>该参数已废弃，请通过RwType设置读写属性。</p>
     */
    public String getOpenRw() {
        return this.OpenRw;
    }

    /**
     * Set <p>是否打开读写分离。<br>该参数已废弃，请通过RwType设置读写属性。</p>
     * @param OpenRw <p>是否打开读写分离。<br>该参数已废弃，请通过RwType设置读写属性。</p>
     */
    public void setOpenRw(String OpenRw) {
        this.OpenRw = OpenRw;
    }

    /**
     * Get <p>读写类型：<br>READWRITE,READONLY</p> 
     * @return RwType <p>读写类型：<br>READWRITE,READONLY</p>
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set <p>读写类型：<br>READWRITE,READONLY</p>
     * @param RwType <p>读写类型：<br>READWRITE,READONLY</p>
     */
    public void setRwType(String RwType) {
        this.RwType = RwType;
    }

    /**
     * Get <p>事务拆分。<br>在一个事务中拆分读和写到不同的实例上去执行。</p> 
     * @return TransSplit <p>事务拆分。<br>在一个事务中拆分读和写到不同的实例上去执行。</p>
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set <p>事务拆分。<br>在一个事务中拆分读和写到不同的实例上去执行。</p>
     * @param TransSplit <p>事务拆分。<br>在一个事务中拆分读和写到不同的实例上去执行。</p>
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get <p>连接模式：<br>nearby,balance</p> 
     * @return AccessMode <p>连接模式：<br>nearby,balance</p>
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>连接模式：<br>nearby,balance</p>
     * @param AccessMode <p>连接模式：<br>nearby,balance</p>
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get <p>是否打开连接池：<br>yes,no</p> 
     * @return OpenConnectionPool <p>是否打开连接池：<br>yes,no</p>
     */
    public String getOpenConnectionPool() {
        return this.OpenConnectionPool;
    }

    /**
     * Set <p>是否打开连接池：<br>yes,no</p>
     * @param OpenConnectionPool <p>是否打开连接池：<br>yes,no</p>
     */
    public void setOpenConnectionPool(String OpenConnectionPool) {
        this.OpenConnectionPool = OpenConnectionPool;
    }

    /**
     * Get <p>连接池类型：<br>SessionConnectionPool</p> 
     * @return ConnectionPoolType <p>连接池类型：<br>SessionConnectionPool</p>
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set <p>连接池类型：<br>SessionConnectionPool</p>
     * @param ConnectionPoolType <p>连接池类型：<br>SessionConnectionPool</p>
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get <p>连接池时间。<br>可选范围:0~300（秒）</p> 
     * @return ConnectionPoolTimeOut <p>连接池时间。<br>可选范围:0~300（秒）</p>
     */
    public Long getConnectionPoolTimeOut() {
        return this.ConnectionPoolTimeOut;
    }

    /**
     * Set <p>连接池时间。<br>可选范围:0~300（秒）</p>
     * @param ConnectionPoolTimeOut <p>连接池时间。<br>可选范围:0~300（秒）</p>
     */
    public void setConnectionPoolTimeOut(Long ConnectionPoolTimeOut) {
        this.ConnectionPoolTimeOut = ConnectionPoolTimeOut;
    }

    /**
     * Get <p>是否将libra节点当作普通RO节点</p> 
     * @return ApNodeAsRoNode <p>是否将libra节点当作普通RO节点</p>
     */
    public Boolean getApNodeAsRoNode() {
        return this.ApNodeAsRoNode;
    }

    /**
     * Set <p>是否将libra节点当作普通RO节点</p>
     * @param ApNodeAsRoNode <p>是否将libra节点当作普通RO节点</p>
     */
    public void setApNodeAsRoNode(Boolean ApNodeAsRoNode) {
        this.ApNodeAsRoNode = ApNodeAsRoNode;
    }

    /**
     * Get <p>libra节点故障，是否转发给其他节点</p> 
     * @return ApQueryToOtherNode <p>libra节点故障，是否转发给其他节点</p>
     */
    public Boolean getApQueryToOtherNode() {
        return this.ApQueryToOtherNode;
    }

    /**
     * Set <p>libra节点故障，是否转发给其他节点</p>
     * @param ApQueryToOtherNode <p>libra节点故障，是否转发给其他节点</p>
     */
    public void setApQueryToOtherNode(Boolean ApQueryToOtherNode) {
        this.ApQueryToOtherNode = ApQueryToOtherNode;
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
        if (source.ApNodeAsRoNode != null) {
            this.ApNodeAsRoNode = new Boolean(source.ApNodeAsRoNode);
        }
        if (source.ApQueryToOtherNode != null) {
            this.ApQueryToOtherNode = new Boolean(source.ApQueryToOtherNode);
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
        this.setParamSimple(map, prefix + "ApNodeAsRoNode", this.ApNodeAsRoNode);
        this.setParamSimple(map, prefix + "ApQueryToOtherNode", this.ApQueryToOtherNode);
        this.setParamSimple(map, prefix + "LoadBalanceMode", this.LoadBalanceMode);

    }
}

