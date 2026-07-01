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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetachConfigRuleToCompliancePackRequest extends AbstractModel {

    /**
    * <p>合规包ID</p>
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

    /**
    * <p>规则ID</p>
    */
    @SerializedName("ConfigRuleId")
    @Expose
    private String ConfigRuleId;

    /**
     * Get <p>合规包ID</p> 
     * @return CompliancePackId <p>合规包ID</p>
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set <p>合规包ID</p>
     * @param CompliancePackId <p>合规包ID</p>
     */
    public void setCompliancePackId(String CompliancePackId) {
        this.CompliancePackId = CompliancePackId;
    }

    /**
     * Get <p>规则ID</p> 
     * @return ConfigRuleId <p>规则ID</p>
     */
    public String getConfigRuleId() {
        return this.ConfigRuleId;
    }

    /**
     * Set <p>规则ID</p>
     * @param ConfigRuleId <p>规则ID</p>
     */
    public void setConfigRuleId(String ConfigRuleId) {
        this.ConfigRuleId = ConfigRuleId;
    }

    public DetachConfigRuleToCompliancePackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetachConfigRuleToCompliancePackRequest(DetachConfigRuleToCompliancePackRequest source) {
        if (source.CompliancePackId != null) {
            this.CompliancePackId = new String(source.CompliancePackId);
        }
        if (source.ConfigRuleId != null) {
            this.ConfigRuleId = new String(source.ConfigRuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompliancePackId", this.CompliancePackId);
        this.setParamSimple(map, prefix + "ConfigRuleId", this.ConfigRuleId);

    }
}

