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

public class TrafficSandboxLLMAuditRuleRef extends AbstractModel {

    /**
    * LLM 审计系统规则 ID（字符串）
    */
    @SerializedName("SystemRuleID")
    @Expose
    private String SystemRuleID;

    /**
    * LLM 审计系统规则名称
    */
    @SerializedName("SystemRuleName")
    @Expose
    private String SystemRuleName;

    /**
     * Get LLM 审计系统规则 ID（字符串） 
     * @return SystemRuleID LLM 审计系统规则 ID（字符串）
     */
    public String getSystemRuleID() {
        return this.SystemRuleID;
    }

    /**
     * Set LLM 审计系统规则 ID（字符串）
     * @param SystemRuleID LLM 审计系统规则 ID（字符串）
     */
    public void setSystemRuleID(String SystemRuleID) {
        this.SystemRuleID = SystemRuleID;
    }

    /**
     * Get LLM 审计系统规则名称 
     * @return SystemRuleName LLM 审计系统规则名称
     */
    public String getSystemRuleName() {
        return this.SystemRuleName;
    }

    /**
     * Set LLM 审计系统规则名称
     * @param SystemRuleName LLM 审计系统规则名称
     */
    public void setSystemRuleName(String SystemRuleName) {
        this.SystemRuleName = SystemRuleName;
    }

    public TrafficSandboxLLMAuditRuleRef() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxLLMAuditRuleRef(TrafficSandboxLLMAuditRuleRef source) {
        if (source.SystemRuleID != null) {
            this.SystemRuleID = new String(source.SystemRuleID);
        }
        if (source.SystemRuleName != null) {
            this.SystemRuleName = new String(source.SystemRuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SystemRuleID", this.SystemRuleID);
        this.setParamSimple(map, prefix + "SystemRuleName", this.SystemRuleName);

    }
}

