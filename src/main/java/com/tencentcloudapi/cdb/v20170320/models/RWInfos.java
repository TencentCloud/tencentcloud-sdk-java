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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RWInfos extends AbstractModel{

    /**
    * 代理实例数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstCount")
    @Expose
    private Long InstCount;

    /**
    * 权重分配模式；
系统自动分配："system"， 自定义："custom"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * 是否开启延迟剔除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsKickOut")
    @Expose
    private Boolean IsKickOut;

    /**
    * 最小保留数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinCount")
    @Expose
    private Long MinCount;

    /**
    * 延迟剔除阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * 是否开启故障转移
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailOver")
    @Expose
    private Boolean FailOver;

    /**
    * 是否自动添加RO
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoAddRo")
    @Expose
    private Boolean AutoAddRo;

    /**
    * 代理实例信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RWInstInfo")
    @Expose
    private RWInstanceInfo [] RWInstInfo;

    /**
     * Get 代理实例数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstCount 代理实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstCount() {
        return this.InstCount;
    }

    /**
     * Set 代理实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstCount 代理实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstCount(Long InstCount) {
        this.InstCount = InstCount;
    }

    /**
     * Get 权重分配模式；
系统自动分配："system"， 自定义："custom"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeightMode 权重分配模式；
系统自动分配："system"， 自定义："custom"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set 权重分配模式；
系统自动分配："system"， 自定义："custom"
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeightMode 权重分配模式；
系统自动分配："system"， 自定义："custom"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get 是否开启延迟剔除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsKickOut 是否开启延迟剔除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsKickOut() {
        return this.IsKickOut;
    }

    /**
     * Set 是否开启延迟剔除
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsKickOut 是否开启延迟剔除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsKickOut(Boolean IsKickOut) {
        this.IsKickOut = IsKickOut;
    }

    /**
     * Get 最小保留数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinCount 最小保留数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinCount() {
        return this.MinCount;
    }

    /**
     * Set 最小保留数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinCount 最小保留数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinCount(Long MinCount) {
        this.MinCount = MinCount;
    }

    /**
     * Get 延迟剔除阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxDelay 延迟剔除阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set 延迟剔除阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxDelay 延迟剔除阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get 是否开启故障转移
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailOver 是否开启故障转移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getFailOver() {
        return this.FailOver;
    }

    /**
     * Set 是否开启故障转移
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailOver 是否开启故障转移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailOver(Boolean FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get 是否自动添加RO
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoAddRo 是否自动添加RO
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set 是否自动添加RO
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoAddRo 是否自动添加RO
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoAddRo(Boolean AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get 代理实例信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RWInstInfo 代理实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RWInstanceInfo [] getRWInstInfo() {
        return this.RWInstInfo;
    }

    /**
     * Set 代理实例信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RWInstInfo 代理实例信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRWInstInfo(RWInstanceInfo [] RWInstInfo) {
        this.RWInstInfo = RWInstInfo;
    }

    public RWInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RWInfos(RWInfos source) {
        if (source.InstCount != null) {
            this.InstCount = new Long(source.InstCount);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.IsKickOut != null) {
            this.IsKickOut = new Boolean(source.IsKickOut);
        }
        if (source.MinCount != null) {
            this.MinCount = new Long(source.MinCount);
        }
        if (source.MaxDelay != null) {
            this.MaxDelay = new Long(source.MaxDelay);
        }
        if (source.FailOver != null) {
            this.FailOver = new Boolean(source.FailOver);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new Boolean(source.AutoAddRo);
        }
        if (source.RWInstInfo != null) {
            this.RWInstInfo = new RWInstanceInfo[source.RWInstInfo.length];
            for (int i = 0; i < source.RWInstInfo.length; i++) {
                this.RWInstInfo[i] = new RWInstanceInfo(source.RWInstInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstCount", this.InstCount);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "IsKickOut", this.IsKickOut);
        this.setParamSimple(map, prefix + "MinCount", this.MinCount);
        this.setParamSimple(map, prefix + "MaxDelay", this.MaxDelay);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamArrayObj(map, prefix + "RWInstInfo.", this.RWInstInfo);

    }
}

