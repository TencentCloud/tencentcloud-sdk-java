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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyAccessInfo extends AbstractModel{

    /**
    * 地域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 地域名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 通道ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 通道接入ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 三网通道VIP列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VipList")
    @Expose
    private IPDetail [] VipList;

    /**
    * 接入点IDC类型。ec或dc
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceRegionIdcType")
    @Expose
    private String SourceRegionIdcType;

    /**
     * Get 地域ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionName 地域名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionName 地域名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 通道ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyId 通道ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 通道ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyId 通道ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 通道接入ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip 通道接入ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 通道接入ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip 通道接入ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 三网通道VIP列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VipList 三网通道VIP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IPDetail [] getVipList() {
        return this.VipList;
    }

    /**
     * Set 三网通道VIP列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param VipList 三网通道VIP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVipList(IPDetail [] VipList) {
        this.VipList = VipList;
    }

    /**
     * Get 接入点IDC类型。ec或dc
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceRegionIdcType 接入点IDC类型。ec或dc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceRegionIdcType() {
        return this.SourceRegionIdcType;
    }

    /**
     * Set 接入点IDC类型。ec或dc
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceRegionIdcType 接入点IDC类型。ec或dc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceRegionIdcType(String SourceRegionIdcType) {
        this.SourceRegionIdcType = SourceRegionIdcType;
    }

    public ProxyAccessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyAccessInfo(ProxyAccessInfo source) {
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VipList != null) {
            this.VipList = new IPDetail[source.VipList.length];
            for (int i = 0; i < source.VipList.length; i++) {
                this.VipList[i] = new IPDetail(source.VipList[i]);
            }
        }
        if (source.SourceRegionIdcType != null) {
            this.SourceRegionIdcType = new String(source.SourceRegionIdcType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamArrayObj(map, prefix + "VipList.", this.VipList);
        this.setParamSimple(map, prefix + "SourceRegionIdcType", this.SourceRegionIdcType);

    }
}

