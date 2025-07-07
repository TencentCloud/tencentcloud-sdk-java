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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckTemplate extends AbstractModel {

    /**
    * 健康检测项
    */
    @SerializedName("Rules")
    @Expose
    private HealthCheckTemplateRule [] Rules;

    /**
     * Get 健康检测项 
     * @return Rules 健康检测项
     */
    public HealthCheckTemplateRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 健康检测项
     * @param Rules 健康检测项
     */
    public void setRules(HealthCheckTemplateRule [] Rules) {
        this.Rules = Rules;
    }

    public HealthCheckTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckTemplate(HealthCheckTemplate source) {
        if (source.Rules != null) {
            this.Rules = new HealthCheckTemplateRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new HealthCheckTemplateRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

