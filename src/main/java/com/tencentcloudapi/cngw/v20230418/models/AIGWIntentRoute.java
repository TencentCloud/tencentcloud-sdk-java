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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWIntentRoute extends AbstractModel {

    /**
    * <p>意图识别模型id</p>
    */
    @SerializedName("IntentModelServiceId")
    @Expose
    private String IntentModelServiceId;

    /**
    * <p>置信度</p>
    */
    @SerializedName("ConfidenceThreshold")
    @Expose
    private Float ConfidenceThreshold;

    /**
    * <p>默认服务id</p>
    */
    @SerializedName("DefaultModelServiceId")
    @Expose
    private String DefaultModelServiceId;

    /**
    * <p>规则</p>
    */
    @SerializedName("Rules")
    @Expose
    private AIGWIntentRouteRule [] Rules;

    /**
     * Get <p>意图识别模型id</p> 
     * @return IntentModelServiceId <p>意图识别模型id</p>
     */
    public String getIntentModelServiceId() {
        return this.IntentModelServiceId;
    }

    /**
     * Set <p>意图识别模型id</p>
     * @param IntentModelServiceId <p>意图识别模型id</p>
     */
    public void setIntentModelServiceId(String IntentModelServiceId) {
        this.IntentModelServiceId = IntentModelServiceId;
    }

    /**
     * Get <p>置信度</p> 
     * @return ConfidenceThreshold <p>置信度</p>
     */
    public Float getConfidenceThreshold() {
        return this.ConfidenceThreshold;
    }

    /**
     * Set <p>置信度</p>
     * @param ConfidenceThreshold <p>置信度</p>
     */
    public void setConfidenceThreshold(Float ConfidenceThreshold) {
        this.ConfidenceThreshold = ConfidenceThreshold;
    }

    /**
     * Get <p>默认服务id</p> 
     * @return DefaultModelServiceId <p>默认服务id</p>
     */
    public String getDefaultModelServiceId() {
        return this.DefaultModelServiceId;
    }

    /**
     * Set <p>默认服务id</p>
     * @param DefaultModelServiceId <p>默认服务id</p>
     */
    public void setDefaultModelServiceId(String DefaultModelServiceId) {
        this.DefaultModelServiceId = DefaultModelServiceId;
    }

    /**
     * Get <p>规则</p> 
     * @return Rules <p>规则</p>
     */
    public AIGWIntentRouteRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>规则</p>
     * @param Rules <p>规则</p>
     */
    public void setRules(AIGWIntentRouteRule [] Rules) {
        this.Rules = Rules;
    }

    public AIGWIntentRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWIntentRoute(AIGWIntentRoute source) {
        if (source.IntentModelServiceId != null) {
            this.IntentModelServiceId = new String(source.IntentModelServiceId);
        }
        if (source.ConfidenceThreshold != null) {
            this.ConfidenceThreshold = new Float(source.ConfidenceThreshold);
        }
        if (source.DefaultModelServiceId != null) {
            this.DefaultModelServiceId = new String(source.DefaultModelServiceId);
        }
        if (source.Rules != null) {
            this.Rules = new AIGWIntentRouteRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new AIGWIntentRouteRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntentModelServiceId", this.IntentModelServiceId);
        this.setParamSimple(map, prefix + "ConfidenceThreshold", this.ConfidenceThreshold);
        this.setParamSimple(map, prefix + "DefaultModelServiceId", this.DefaultModelServiceId);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

