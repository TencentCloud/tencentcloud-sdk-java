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

public class ProxyGroupRwInfo extends AbstractModel{

    /**
    * 一致性类型 eventual-最终一致性,global-全局一致性,session-会话一致性
    */
    @SerializedName("ConsistencyType")
    @Expose
    private String ConsistencyType;

    /**
    * 一致性超时时间
    */
    @SerializedName("ConsistencyTimeOut")
    @Expose
    private Long ConsistencyTimeOut;

    /**
    * 权重模式 system-系统分配，custom-自定义
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * 是否开启故障转移
    */
    @SerializedName("FailOver")
    @Expose
    private String FailOver;

    /**
    * 是否自动添加只读实例，yes-是，no-不自动添加
    */
    @SerializedName("AutoAddRo")
    @Expose
    private String AutoAddRo;

    /**
    * 实例权重数组
    */
    @SerializedName("InstanceWeights")
    @Expose
    private ProxyInstanceWeight [] InstanceWeights;

    /**
    * 是否开通读写节点，yse-是，no-否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenRw")
    @Expose
    private String OpenRw;

    /**
    * 读写属性，可选值：READWRITE,READONLY
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
    * 连接模式，可选值：balance，nearby
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
     * Get 一致性类型 eventual-最终一致性,global-全局一致性,session-会话一致性 
     * @return ConsistencyType 一致性类型 eventual-最终一致性,global-全局一致性,session-会话一致性
     */
    public String getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set 一致性类型 eventual-最终一致性,global-全局一致性,session-会话一致性
     * @param ConsistencyType 一致性类型 eventual-最终一致性,global-全局一致性,session-会话一致性
     */
    public void setConsistencyType(String ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
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
     * Get 权重模式 system-系统分配，custom-自定义 
     * @return WeightMode 权重模式 system-系统分配，custom-自定义
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set 权重模式 system-系统分配，custom-自定义
     * @param WeightMode 权重模式 system-系统分配，custom-自定义
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
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
     * Get 实例权重数组 
     * @return InstanceWeights 实例权重数组
     */
    public ProxyInstanceWeight [] getInstanceWeights() {
        return this.InstanceWeights;
    }

    /**
     * Set 实例权重数组
     * @param InstanceWeights 实例权重数组
     */
    public void setInstanceWeights(ProxyInstanceWeight [] InstanceWeights) {
        this.InstanceWeights = InstanceWeights;
    }

    /**
     * Get 是否开通读写节点，yse-是，no-否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenRw 是否开通读写节点，yse-是，no-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenRw() {
        return this.OpenRw;
    }

    /**
     * Set 是否开通读写节点，yse-是，no-否
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenRw 是否开通读写节点，yse-是，no-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenRw(String OpenRw) {
        this.OpenRw = OpenRw;
    }

    /**
     * Get 读写属性，可选值：READWRITE,READONLY 
     * @return RwType 读写属性，可选值：READWRITE,READONLY
     */
    public String getRwType() {
        return this.RwType;
    }

    /**
     * Set 读写属性，可选值：READWRITE,READONLY
     * @param RwType 读写属性，可选值：READWRITE,READONLY
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
     * Get 连接模式，可选值：balance，nearby 
     * @return AccessMode 连接模式，可选值：balance，nearby
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set 连接模式，可选值：balance，nearby
     * @param AccessMode 连接模式，可选值：balance，nearby
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
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

    }
}

