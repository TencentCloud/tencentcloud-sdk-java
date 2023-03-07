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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineRuleDetect extends AbstractModel{

    /**
    * 规则Id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则描述
    */
    @SerializedName("RuleDesc")
    @Expose
    private String RuleDesc;

    /**
    * 关联项数
    */
    @SerializedName("ItemCount")
    @Expose
    private Long ItemCount;

    /**
    * 关联主机数
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 首次检测时间
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * string
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 0:未通过 1:忽略 3:通过 5:检测中
    */
    @SerializedName("DetectStatus")
    @Expose
    private Long DetectStatus;

    /**
    * ItemID集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemIds")
    @Expose
    private Long [] ItemIds;

    /**
     * Get 规则Id 
     * @return RuleId 规则Id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则Id
     * @param RuleId 规则Id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则描述 
     * @return RuleDesc 规则描述
     */
    public String getRuleDesc() {
        return this.RuleDesc;
    }

    /**
     * Set 规则描述
     * @param RuleDesc 规则描述
     */
    public void setRuleDesc(String RuleDesc) {
        this.RuleDesc = RuleDesc;
    }

    /**
     * Get 关联项数 
     * @return ItemCount 关联项数
     */
    public Long getItemCount() {
        return this.ItemCount;
    }

    /**
     * Set 关联项数
     * @param ItemCount 关联项数
     */
    public void setItemCount(Long ItemCount) {
        this.ItemCount = ItemCount;
    }

    /**
     * Get 关联主机数 
     * @return HostCount 关联主机数
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 关联主机数
     * @param HostCount 关联主机数
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 首次检测时间 
     * @return FirstTime 首次检测时间
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 首次检测时间
     * @param FirstTime 首次检测时间
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get string 
     * @return LastTime string
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set string
     * @param LastTime string
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 0:未通过 1:忽略 3:通过 5:检测中 
     * @return DetectStatus 0:未通过 1:忽略 3:通过 5:检测中
     */
    public Long getDetectStatus() {
        return this.DetectStatus;
    }

    /**
     * Set 0:未通过 1:忽略 3:通过 5:检测中
     * @param DetectStatus 0:未通过 1:忽略 3:通过 5:检测中
     */
    public void setDetectStatus(Long DetectStatus) {
        this.DetectStatus = DetectStatus;
    }

    /**
     * Get ItemID集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemIds ItemID集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getItemIds() {
        return this.ItemIds;
    }

    /**
     * Set ItemID集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemIds ItemID集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemIds(Long [] ItemIds) {
        this.ItemIds = ItemIds;
    }

    public BaselineRuleDetect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineRuleDetect(BaselineRuleDetect source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleDesc != null) {
            this.RuleDesc = new String(source.RuleDesc);
        }
        if (source.ItemCount != null) {
            this.ItemCount = new Long(source.ItemCount);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.DetectStatus != null) {
            this.DetectStatus = new Long(source.DetectStatus);
        }
        if (source.ItemIds != null) {
            this.ItemIds = new Long[source.ItemIds.length];
            for (int i = 0; i < source.ItemIds.length; i++) {
                this.ItemIds[i] = new Long(source.ItemIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleDesc", this.RuleDesc);
        this.setParamSimple(map, prefix + "ItemCount", this.ItemCount);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "DetectStatus", this.DetectStatus);
        this.setParamArraySimple(map, prefix + "ItemIds.", this.ItemIds);

    }
}

