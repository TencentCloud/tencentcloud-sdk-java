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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAlertRulesRequest extends AbstractModel{

    /**
    * 规则 ID 列表
    */
    @SerializedName("RuleIds")
    @Expose
    private String [] RuleIds;

    /**
    * Prometheus 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 规则 ID 列表 
     * @return RuleIds 规则 ID 列表
     */
    public String [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set 规则 ID 列表
     * @param RuleIds 规则 ID 列表
     */
    public void setRuleIds(String [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get Prometheus 实例 ID 
     * @return InstanceId Prometheus 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Prometheus 实例 ID
     * @param InstanceId Prometheus 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DeleteAlertRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAlertRulesRequest(DeleteAlertRulesRequest source) {
        if (source.RuleIds != null) {
            this.RuleIds = new String[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new String(source.RuleIds[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

