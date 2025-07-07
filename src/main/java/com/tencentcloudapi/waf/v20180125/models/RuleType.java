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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleType extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("TypeID")
    @Expose
    private String TypeID;

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则类型描述

    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 规则类型状态，即类型生效开关，0：关闭，1：开启
    */
    @SerializedName("RuleTypeStatus")
    @Expose
    private Long RuleTypeStatus;

    /**
    * 类型下生效的规则数量
    */
    @SerializedName("ActiveRuleCount")
    @Expose
    private Long ActiveRuleCount;

    /**
    * 类型下的规则总数量
    */
    @SerializedName("TotalRuleCount")
    @Expose
    private Long TotalRuleCount;

    /**
     * Get 规则ID 
     * @return TypeID 规则ID
     */
    public String getTypeID() {
        return this.TypeID;
    }

    /**
     * Set 规则ID
     * @param TypeID 规则ID
     */
    public void setTypeID(String TypeID) {
        this.TypeID = TypeID;
    }

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则类型描述
 
     * @return Desc 规则类型描述

     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 规则类型描述

     * @param Desc 规则类型描述

     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 规则类型状态，即类型生效开关，0：关闭，1：开启 
     * @return RuleTypeStatus 规则类型状态，即类型生效开关，0：关闭，1：开启
     */
    public Long getRuleTypeStatus() {
        return this.RuleTypeStatus;
    }

    /**
     * Set 规则类型状态，即类型生效开关，0：关闭，1：开启
     * @param RuleTypeStatus 规则类型状态，即类型生效开关，0：关闭，1：开启
     */
    public void setRuleTypeStatus(Long RuleTypeStatus) {
        this.RuleTypeStatus = RuleTypeStatus;
    }

    /**
     * Get 类型下生效的规则数量 
     * @return ActiveRuleCount 类型下生效的规则数量
     */
    public Long getActiveRuleCount() {
        return this.ActiveRuleCount;
    }

    /**
     * Set 类型下生效的规则数量
     * @param ActiveRuleCount 类型下生效的规则数量
     */
    public void setActiveRuleCount(Long ActiveRuleCount) {
        this.ActiveRuleCount = ActiveRuleCount;
    }

    /**
     * Get 类型下的规则总数量 
     * @return TotalRuleCount 类型下的规则总数量
     */
    public Long getTotalRuleCount() {
        return this.TotalRuleCount;
    }

    /**
     * Set 类型下的规则总数量
     * @param TotalRuleCount 类型下的规则总数量
     */
    public void setTotalRuleCount(Long TotalRuleCount) {
        this.TotalRuleCount = TotalRuleCount;
    }

    public RuleType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleType(RuleType source) {
        if (source.TypeID != null) {
            this.TypeID = new String(source.TypeID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.RuleTypeStatus != null) {
            this.RuleTypeStatus = new Long(source.RuleTypeStatus);
        }
        if (source.ActiveRuleCount != null) {
            this.ActiveRuleCount = new Long(source.ActiveRuleCount);
        }
        if (source.TotalRuleCount != null) {
            this.TotalRuleCount = new Long(source.TotalRuleCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeID", this.TypeID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "RuleTypeStatus", this.RuleTypeStatus);
        this.setParamSimple(map, prefix + "ActiveRuleCount", this.ActiveRuleCount);
        this.setParamSimple(map, prefix + "TotalRuleCount", this.TotalRuleCount);

    }
}

