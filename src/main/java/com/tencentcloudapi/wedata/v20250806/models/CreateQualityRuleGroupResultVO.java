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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateQualityRuleGroupResultVO extends AbstractModel {

    /**
    * 任务创建结构
    */
    @SerializedName("RuleGroupResultList")
    @Expose
    private QualityRuleGroupResult [] RuleGroupResultList;

    /**
     * Get 任务创建结构 
     * @return RuleGroupResultList 任务创建结构
     */
    public QualityRuleGroupResult [] getRuleGroupResultList() {
        return this.RuleGroupResultList;
    }

    /**
     * Set 任务创建结构
     * @param RuleGroupResultList 任务创建结构
     */
    public void setRuleGroupResultList(QualityRuleGroupResult [] RuleGroupResultList) {
        this.RuleGroupResultList = RuleGroupResultList;
    }

    public CreateQualityRuleGroupResultVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateQualityRuleGroupResultVO(CreateQualityRuleGroupResultVO source) {
        if (source.RuleGroupResultList != null) {
            this.RuleGroupResultList = new QualityRuleGroupResult[source.RuleGroupResultList.length];
            for (int i = 0; i < source.RuleGroupResultList.length; i++) {
                this.RuleGroupResultList[i] = new QualityRuleGroupResult(source.RuleGroupResultList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RuleGroupResultList.", this.RuleGroupResultList);

    }
}

