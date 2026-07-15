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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillScanEngineResult extends AbstractModel {

    /**
    * 子引擎类型
枚举值：
AI：AI 引擎
STATIC：静态分析引擎
    */
    @SerializedName("ScanType")
    @Expose
    private String ScanType;

    /**
    * 命中规则列表
    */
    @SerializedName("RuleList")
    @Expose
    private SkillScanRuleHit [] RuleList;

    /**
     * Get 子引擎类型
枚举值：
AI：AI 引擎
STATIC：静态分析引擎 
     * @return ScanType 子引擎类型
枚举值：
AI：AI 引擎
STATIC：静态分析引擎
     */
    public String getScanType() {
        return this.ScanType;
    }

    /**
     * Set 子引擎类型
枚举值：
AI：AI 引擎
STATIC：静态分析引擎
     * @param ScanType 子引擎类型
枚举值：
AI：AI 引擎
STATIC：静态分析引擎
     */
    public void setScanType(String ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get 命中规则列表 
     * @return RuleList 命中规则列表
     */
    public SkillScanRuleHit [] getRuleList() {
        return this.RuleList;
    }

    /**
     * Set 命中规则列表
     * @param RuleList 命中规则列表
     */
    public void setRuleList(SkillScanRuleHit [] RuleList) {
        this.RuleList = RuleList;
    }

    public SkillScanEngineResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillScanEngineResult(SkillScanEngineResult source) {
        if (source.ScanType != null) {
            this.ScanType = new String(source.ScanType);
        }
        if (source.RuleList != null) {
            this.RuleList = new SkillScanRuleHit[source.RuleList.length];
            for (int i = 0; i < source.RuleList.length; i++) {
                this.RuleList[i] = new SkillScanRuleHit(source.RuleList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScanType", this.ScanType);
        this.setParamArrayObj(map, prefix + "RuleList.", this.RuleList);

    }
}

