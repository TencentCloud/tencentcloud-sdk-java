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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseConditionDetail extends AbstractModel {

    /**
    * 产品
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Business")
    @Expose
    private AnalyseBusinessDetail [] Business;

    /**
    * 项目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Project")
    @Expose
    private AnalyseProjectDetail [] Project;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private AnalyseRegionDetail [] Region;

    /**
    * 计费模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private AnalysePayModeDetail [] PayMode;

    /**
    * 交易类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionType")
    @Expose
    private AnalyseActionTypeDetail [] ActionType;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private AnalyseZoneDetail [] Zone;

    /**
    * 资源所有者Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private AnalyseOwnerUinDetail [] OwnerUin;

    /**
    * 费用类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Amount")
    @Expose
    private AnalyseAmountDetail [] Amount;

    /**
     * Get 产品
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Business 产品
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AnalyseBusinessDetail [] getBusiness() {
        return this.Business;
    }

    /**
     * Set 产品
注意：此字段可能返回 null，表示取不到有效值。
     * @param Business 产品
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusiness(AnalyseBusinessDetail [] Business) {
        this.Business = Business;
    }

    /**
     * Get 项目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Project 项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AnalyseProjectDetail [] getProject() {
        return this.Project;
    }

    /**
     * Set 项目
注意：此字段可能返回 null，表示取不到有效值。
     * @param Project 项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProject(AnalyseProjectDetail [] Project) {
        this.Project = Project;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AnalyseRegionDetail [] getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(AnalyseRegionDetail [] Region) {
        this.Region = Region;
    }

    /**
     * Get 计费模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 计费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AnalysePayModeDetail [] getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 计费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(AnalysePayModeDetail [] PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 交易类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionType 交易类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AnalyseActionTypeDetail [] getActionType() {
        return this.ActionType;
    }

    /**
     * Set 交易类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionType 交易类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionType(AnalyseActionTypeDetail [] ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AnalyseZoneDetail [] getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(AnalyseZoneDetail [] Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 资源所有者Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 资源所有者Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AnalyseOwnerUinDetail [] getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 资源所有者Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 资源所有者Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(AnalyseOwnerUinDetail [] OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 费用类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Amount 费用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AnalyseAmountDetail [] getAmount() {
        return this.Amount;
    }

    /**
     * Set 费用类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Amount 费用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmount(AnalyseAmountDetail [] Amount) {
        this.Amount = Amount;
    }

    public AnalyseConditionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyseConditionDetail(AnalyseConditionDetail source) {
        if (source.Business != null) {
            this.Business = new AnalyseBusinessDetail[source.Business.length];
            for (int i = 0; i < source.Business.length; i++) {
                this.Business[i] = new AnalyseBusinessDetail(source.Business[i]);
            }
        }
        if (source.Project != null) {
            this.Project = new AnalyseProjectDetail[source.Project.length];
            for (int i = 0; i < source.Project.length; i++) {
                this.Project[i] = new AnalyseProjectDetail(source.Project[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new AnalyseRegionDetail[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new AnalyseRegionDetail(source.Region[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new AnalysePayModeDetail[source.PayMode.length];
            for (int i = 0; i < source.PayMode.length; i++) {
                this.PayMode[i] = new AnalysePayModeDetail(source.PayMode[i]);
            }
        }
        if (source.ActionType != null) {
            this.ActionType = new AnalyseActionTypeDetail[source.ActionType.length];
            for (int i = 0; i < source.ActionType.length; i++) {
                this.ActionType[i] = new AnalyseActionTypeDetail(source.ActionType[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new AnalyseZoneDetail[source.Zone.length];
            for (int i = 0; i < source.Zone.length; i++) {
                this.Zone[i] = new AnalyseZoneDetail(source.Zone[i]);
            }
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new AnalyseOwnerUinDetail[source.OwnerUin.length];
            for (int i = 0; i < source.OwnerUin.length; i++) {
                this.OwnerUin[i] = new AnalyseOwnerUinDetail(source.OwnerUin[i]);
            }
        }
        if (source.Amount != null) {
            this.Amount = new AnalyseAmountDetail[source.Amount.length];
            for (int i = 0; i < source.Amount.length; i++) {
                this.Amount[i] = new AnalyseAmountDetail(source.Amount[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Business.", this.Business);
        this.setParamArrayObj(map, prefix + "Project.", this.Project);
        this.setParamArrayObj(map, prefix + "Region.", this.Region);
        this.setParamArrayObj(map, prefix + "PayMode.", this.PayMode);
        this.setParamArrayObj(map, prefix + "ActionType.", this.ActionType);
        this.setParamArrayObj(map, prefix + "Zone.", this.Zone);
        this.setParamArrayObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamArrayObj(map, prefix + "Amount.", this.Amount);

    }
}

