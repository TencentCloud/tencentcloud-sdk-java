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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAlertmanagerConfigV2 extends AbstractModel {

    /**
    * Prometheus Alertmanger 抑制规则组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InhibitRules")
    @Expose
    private PrometheusAlertmanagerConfigInhibitRule [] InhibitRules;

    /**
     * Get Prometheus Alertmanger 抑制规则组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InhibitRules Prometheus Alertmanger 抑制规则组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusAlertmanagerConfigInhibitRule [] getInhibitRules() {
        return this.InhibitRules;
    }

    /**
     * Set Prometheus Alertmanger 抑制规则组
注意：此字段可能返回 null，表示取不到有效值。
     * @param InhibitRules Prometheus Alertmanger 抑制规则组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInhibitRules(PrometheusAlertmanagerConfigInhibitRule [] InhibitRules) {
        this.InhibitRules = InhibitRules;
    }

    public PrometheusAlertmanagerConfigV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAlertmanagerConfigV2(PrometheusAlertmanagerConfigV2 source) {
        if (source.InhibitRules != null) {
            this.InhibitRules = new PrometheusAlertmanagerConfigInhibitRule[source.InhibitRules.length];
            for (int i = 0; i < source.InhibitRules.length; i++) {
                this.InhibitRules[i] = new PrometheusAlertmanagerConfigInhibitRule(source.InhibitRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InhibitRules.", this.InhibitRules);

    }
}

