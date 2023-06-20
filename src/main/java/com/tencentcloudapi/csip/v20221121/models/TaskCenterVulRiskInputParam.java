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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskCenterVulRiskInputParam extends AbstractModel{

    /**
    * 风险ID
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * 是否开启，0-不开启，1-开启
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get 风险ID 
     * @return RiskId 风险ID
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 风险ID
     * @param RiskId 风险ID
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get 是否开启，0-不开启，1-开启 
     * @return Enable 是否开启，0-不开启，1-开启
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启，0-不开启，1-开启
     * @param Enable 是否开启，0-不开启，1-开启
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public TaskCenterVulRiskInputParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskCenterVulRiskInputParam(TaskCenterVulRiskInputParam source) {
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

