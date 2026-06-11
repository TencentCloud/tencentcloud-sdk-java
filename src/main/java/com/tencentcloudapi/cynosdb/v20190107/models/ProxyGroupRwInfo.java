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

public class ProxyGroupRwInfo extends AbstractModel {

    /**
    * <p>一致性类型 eventual-最终一致性,global-全局一致性,session-会话一致性</p>
    */
    @SerializedName("ConsistencyType")
    @Expose
    private String ConsistencyType;

    /**
    * <p>一致性超时时间</p>
    */
    @SerializedName("ConsistencyTimeOut")
    @Expose
    private Long ConsistencyTimeOut;

    /**
    * <p>权重模式 system-系统分配，custom-自定义</p>
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * <p>是否开启故障转移</p>
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * <p>是否自动添加只读实例，yes-是，no-不自动添加</p>
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * <p>实例权重数组</p>
    */
    @SerializedName("InstanceWeights")
    @Expose
    private ProxyInstanceWeight [] InstanceWeights;

    /**
    * <p>是否开通读写节点，yse-是，no-否</p>
    */
    @SerializedName("OpenRw")
    @Expose
    private String OpenRw;

    /**
    * <p>读写属性，可选值：READWRITE,READONLY</p>
    */
    @SerializedName("RwType")
    @Expose
    private String RwType;

    /**
    * <p>事务拆分</p>
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * <p>连接模式，可选值：balance，nearby</p>
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

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
    * <p>自动负载</p><p>枚举值：</p><ul><li>static： 静态负载</li><li>dynamic： 动态负载</li></ul>
    */
    @SerializedName("LoadBalanceMode")
    @Expose
    private String LoadBalanceMode;

    /**
     * Get <p>一致性类型 eventual-最终一致性,global-全局一致性,session-会话一致性</p> 
     * @return ConsistencyType <p>一致性类型 eventual-最终一致性,global-全局一致性,session-会话一致性</p>
     */
    public String getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set <p>一致性类型 eventual-最终一致性,global-全局一致性,session-会话一致性</p>
     * @param ConsistencyType <p>一致性类型 eventual-最终一致性,global-全局一致性,session-会话一致性</p>
     */
    public void setConsistencyType(String ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
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
     * Get <p>权重模式 system-系统分配，custom-自定义</p> 
     * @return WeightMode <p>权重模式 system-系统分配，custom-自定义</p>
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set <p>权重模式 system-系统分配，custom-自定义</p>
     * @param WeightMode <p>权重模式 system-系统分配，custom-自定义</p>
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get <p>是否开启故障转移</p> 
     * @return FailOver <p>是否开启故障转移</p>
     */
    public String getFailOver() {
        return this.FailOver;
    }

    /**
     * Set <p>是否开启故障转移</p>
     * @param FailOver <p>是否开启故障转移</p>
     */
    public void setFailOver(String FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get <p>是否自动添加只读实例，yes-是，no-不自动添加</p> 
     * @return AutoAddRo <p>是否自动添加只读实例，yes-是，no-不自动添加</p>
     */
    public String getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set <p>是否自动添加只读实例，yes-是，no-不自动添加</p>
     * @param AutoAddRo <p>是否自动添加只读实例，yes-是，no-不自动添加</p>
     */
    public void setAutoAddRo(String AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get <p>实例权重数组</p> 
     * @return InstanceWeights <p>实例权重数组</p>
     */
    public ProxyInstanceWeight [] getInstanceWeights() {
        return this.InstanceWeights;
    }

    /**
     * Set <p>实例权重数组</p>
     * @param InstanceWeights <p>实例权重数组</p>
     */
    public void setInstanceWeights(ProxyInstanceWeight [] InstanceWeights) {
        this.InstanceWeights = InstanceWeights;
    }

    /**
     * Get <p>是否开通读写节点，yse-是，no-否</p> 
     * @return OpenRw <p>是否开通读写节点，yse-是，no-否</p>
     */
    public String getOpenRw() {
        return this.OpenRw;
    }

    /**
     * Set <p>是否开通读写节点，yse-是，no-否</p>
     * @param OpenRw <p>是否开通读写节点，yse-是，no-否</p>
     */
    public void setOpenRw(String OpenRw) {
        this.OpenRw = OpenRw;
    }

    /**
     * Get <p>读写属性，可选值：READWRITE,READONLY</p> 
     * @return RwType <p>读写属性，可选值：READWRITE,READONLY</p>
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set <p>读写属性，可选值：READWRITE,READONLY</p>
     * @param RwType <p>读写属性，可选值：READWRITE,READONLY</p>
     */
    public void setRwType(String RwType) {
        this.RwType = RwType;
    }

    /**
     * Get <p>事务拆分</p> 
     * @return TransSplit <p>事务拆分</p>
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set <p>事务拆分</p>
     * @param TransSplit <p>事务拆分</p>
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get <p>连接模式，可选值：balance，nearby</p> 
     * @return AccessMode <p>连接模式，可选值：balance，nearby</p>
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>连接模式，可选值：balance，nearby</p>
     * @param AccessMode <p>连接模式，可选值：balance，nearby</p>
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
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
     * Get <p>自动负载</p><p>枚举值：</p><ul><li>static： 静态负载</li><li>dynamic： 动态负载</li></ul> 
     * @return LoadBalanceMode <p>自动负载</p><p>枚举值：</p><ul><li>static： 静态负载</li><li>dynamic： 动态负载</li></ul>
     */
    public String getLoadBalanceMode() {
        return this.LoadBalanceMode;
    }

    /**
     * Set <p>自动负载</p><p>枚举值：</p><ul><li>static： 静态负载</li><li>dynamic： 动态负载</li></ul>
     * @param LoadBalanceMode <p>自动负载</p><p>枚举值：</p><ul><li>static： 静态负载</li><li>dynamic： 动态负载</li></ul>
     */
    public void setLoadBalanceMode(String LoadBalanceMode) {
        this.LoadBalanceMode = LoadBalanceMode;
    }

    public ProxyGroupRwInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroupRwInfo(ProxyGroupRwInfo source) {
        if (source.ConsistencyType != null) {
            this.ConsistencyType = new String(source.ConsistencyType);
        }
        if (source.ConsistencyTimeOut != null) {
            this.ConsistencyTimeOut = new Long(source.ConsistencyTimeOut);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.FailOver != null) {
            this.FailOver = new String(source.FailOver);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new String(source.AutoAddRo);
        }
        if (source.InstanceWeights != null) {
            this.InstanceWeights = new ProxyInstanceWeight[source.InstanceWeights.length];
            for (int i = 0; i < source.InstanceWeights.length; i++) {
                this.InstanceWeights[i] = new ProxyInstanceWeight(source.InstanceWeights[i]);
            }
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
        this.setParamSimple(map, prefix + "ConsistencyType", this.ConsistencyType);
        this.setParamSimple(map, prefix + "ConsistencyTimeOut", this.ConsistencyTimeOut);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamArrayObj(map, prefix + "InstanceWeights.", this.InstanceWeights);
        this.setParamSimple(map, prefix + "OpenRw", this.OpenRw);
        this.setParamSimple(map, prefix + "RwType", this.RwType);
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "ApNodeAsRoNode", this.ApNodeAsRoNode);
        this.setParamSimple(map, prefix + "ApQueryToOtherNode", this.ApQueryToOtherNode);
        this.setParamSimple(map, prefix + "LoadBalanceMode", this.LoadBalanceMode);

    }
}

