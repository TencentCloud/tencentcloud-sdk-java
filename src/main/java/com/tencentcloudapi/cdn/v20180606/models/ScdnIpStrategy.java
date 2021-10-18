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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnIpStrategy extends AbstractModel{

    /**
    * 域名|global表示全部域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 策略ID
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * IP白名单列表
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 规则类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 规则值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleValue")
    @Expose
    private String [] RuleValue;

    /**
     * Get 域名|global表示全部域名 
     * @return Domain 域名|global表示全部域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名|global表示全部域名
     * @param Domain 域名|global表示全部域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 策略ID 
     * @return StrategyId 策略ID
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略ID
     * @param StrategyId 策略ID
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get IP白名单列表 
     * @return IpList IP白名单列表
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set IP白名单列表
     * @param IpList IP白名单列表
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 规则类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 规则类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 规则类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 规则值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleValue 规则值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRuleValue() {
        return this.RuleValue;
    }

    /**
     * Set 规则值
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleValue 规则值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleValue(String [] RuleValue) {
        this.RuleValue = RuleValue;
    }

    public ScdnIpStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnIpStrategy(ScdnIpStrategy source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleValue != null) {
            this.RuleValue = new String[source.RuleValue.length];
            for (int i = 0; i < source.RuleValue.length; i++) {
                this.RuleValue[i] = new String(source.RuleValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RuleValue.", this.RuleValue);

    }
}

