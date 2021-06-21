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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaticPackRelation extends AbstractModel{

    /**
    * 保底带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectBandwidth")
    @Expose
    private Long ProtectBandwidth;

    /**
    * 业务带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NormalBandwidth")
    @Expose
    private Long NormalBandwidth;

    /**
    * 转发规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForwardRulesLimit")
    @Expose
    private Long ForwardRulesLimit;

    /**
    * 自动续费标记
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 到期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurDeadline")
    @Expose
    private String CurDeadline;

    /**
     * Get 保底带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectBandwidth 保底带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProtectBandwidth() {
        return this.ProtectBandwidth;
    }

    /**
     * Set 保底带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectBandwidth 保底带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectBandwidth(Long ProtectBandwidth) {
        this.ProtectBandwidth = ProtectBandwidth;
    }

    /**
     * Get 业务带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NormalBandwidth 业务带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNormalBandwidth() {
        return this.NormalBandwidth;
    }

    /**
     * Set 业务带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param NormalBandwidth 业务带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNormalBandwidth(Long NormalBandwidth) {
        this.NormalBandwidth = NormalBandwidth;
    }

    /**
     * Get 转发规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForwardRulesLimit 转发规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getForwardRulesLimit() {
        return this.ForwardRulesLimit;
    }

    /**
     * Set 转发规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForwardRulesLimit 转发规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForwardRulesLimit(Long ForwardRulesLimit) {
        this.ForwardRulesLimit = ForwardRulesLimit;
    }

    /**
     * Get 自动续费标记
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag 自动续费标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag 自动续费标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 到期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurDeadline 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurDeadline() {
        return this.CurDeadline;
    }

    /**
     * Set 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurDeadline 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurDeadline(String CurDeadline) {
        this.CurDeadline = CurDeadline;
    }

    public StaticPackRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaticPackRelation(StaticPackRelation source) {
        if (source.ProtectBandwidth != null) {
            this.ProtectBandwidth = new Long(source.ProtectBandwidth);
        }
        if (source.NormalBandwidth != null) {
            this.NormalBandwidth = new Long(source.NormalBandwidth);
        }
        if (source.ForwardRulesLimit != null) {
            this.ForwardRulesLimit = new Long(source.ForwardRulesLimit);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.CurDeadline != null) {
            this.CurDeadline = new String(source.CurDeadline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectBandwidth", this.ProtectBandwidth);
        this.setParamSimple(map, prefix + "NormalBandwidth", this.NormalBandwidth);
        this.setParamSimple(map, prefix + "ForwardRulesLimit", this.ForwardRulesLimit);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "CurDeadline", this.CurDeadline);

    }
}

