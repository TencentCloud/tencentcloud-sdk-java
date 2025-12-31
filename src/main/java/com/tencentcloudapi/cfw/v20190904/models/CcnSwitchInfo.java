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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnSwitchInfo extends AbstractModel {

    /**
    * ccn的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 开关接入模式，1:自动接入,2:手动接入
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SwitchMode")
    @Expose
    private Long SwitchMode;

    /**
    * 引流路由方法 0:多路由表, 1:策略路由
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoutingMode")
    @Expose
    private Long RoutingMode;

    /**
    * 地域级别CIDR配置
    */
    @SerializedName("RegionCidrConfigs")
    @Expose
    private RegionCidrConfig [] RegionCidrConfigs;

    /**
    * 互联集合对列表
    */
    @SerializedName("InterconnectPairs")
    @Expose
    private InterconnectPair [] InterconnectPairs;

    /**
    * 引流通用CIDR(废弃)
    */
    @SerializedName("FwVpcCidr")
    @Expose
    private String FwVpcCidr;

    /**
     * Get ccn的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnId ccn的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set ccn的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnId ccn的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 开关接入模式，1:自动接入,2:手动接入
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SwitchMode 开关接入模式，1:自动接入,2:手动接入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSwitchMode() {
        return this.SwitchMode;
    }

    /**
     * Set 开关接入模式，1:自动接入,2:手动接入
注意：此字段可能返回 null，表示取不到有效值。
     * @param SwitchMode 开关接入模式，1:自动接入,2:手动接入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitchMode(Long SwitchMode) {
        this.SwitchMode = SwitchMode;
    }

    /**
     * Get 引流路由方法 0:多路由表, 1:策略路由
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoutingMode 引流路由方法 0:多路由表, 1:策略路由
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRoutingMode() {
        return this.RoutingMode;
    }

    /**
     * Set 引流路由方法 0:多路由表, 1:策略路由
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoutingMode 引流路由方法 0:多路由表, 1:策略路由
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoutingMode(Long RoutingMode) {
        this.RoutingMode = RoutingMode;
    }

    /**
     * Get 地域级别CIDR配置 
     * @return RegionCidrConfigs 地域级别CIDR配置
     */
    public RegionCidrConfig [] getRegionCidrConfigs() {
        return this.RegionCidrConfigs;
    }

    /**
     * Set 地域级别CIDR配置
     * @param RegionCidrConfigs 地域级别CIDR配置
     */
    public void setRegionCidrConfigs(RegionCidrConfig [] RegionCidrConfigs) {
        this.RegionCidrConfigs = RegionCidrConfigs;
    }

    /**
     * Get 互联集合对列表 
     * @return InterconnectPairs 互联集合对列表
     */
    public InterconnectPair [] getInterconnectPairs() {
        return this.InterconnectPairs;
    }

    /**
     * Set 互联集合对列表
     * @param InterconnectPairs 互联集合对列表
     */
    public void setInterconnectPairs(InterconnectPair [] InterconnectPairs) {
        this.InterconnectPairs = InterconnectPairs;
    }

    /**
     * Get 引流通用CIDR(废弃) 
     * @return FwVpcCidr 引流通用CIDR(废弃)
     */
    public String getFwVpcCidr() {
        return this.FwVpcCidr;
    }

    /**
     * Set 引流通用CIDR(废弃)
     * @param FwVpcCidr 引流通用CIDR(废弃)
     */
    public void setFwVpcCidr(String FwVpcCidr) {
        this.FwVpcCidr = FwVpcCidr;
    }

    public CcnSwitchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnSwitchInfo(CcnSwitchInfo source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.SwitchMode != null) {
            this.SwitchMode = new Long(source.SwitchMode);
        }
        if (source.RoutingMode != null) {
            this.RoutingMode = new Long(source.RoutingMode);
        }
        if (source.RegionCidrConfigs != null) {
            this.RegionCidrConfigs = new RegionCidrConfig[source.RegionCidrConfigs.length];
            for (int i = 0; i < source.RegionCidrConfigs.length; i++) {
                this.RegionCidrConfigs[i] = new RegionCidrConfig(source.RegionCidrConfigs[i]);
            }
        }
        if (source.InterconnectPairs != null) {
            this.InterconnectPairs = new InterconnectPair[source.InterconnectPairs.length];
            for (int i = 0; i < source.InterconnectPairs.length; i++) {
                this.InterconnectPairs[i] = new InterconnectPair(source.InterconnectPairs[i]);
            }
        }
        if (source.FwVpcCidr != null) {
            this.FwVpcCidr = new String(source.FwVpcCidr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "SwitchMode", this.SwitchMode);
        this.setParamSimple(map, prefix + "RoutingMode", this.RoutingMode);
        this.setParamArrayObj(map, prefix + "RegionCidrConfigs.", this.RegionCidrConfigs);
        this.setParamArrayObj(map, prefix + "InterconnectPairs.", this.InterconnectPairs);
        this.setParamSimple(map, prefix + "FwVpcCidr", this.FwVpcCidr);

    }
}

