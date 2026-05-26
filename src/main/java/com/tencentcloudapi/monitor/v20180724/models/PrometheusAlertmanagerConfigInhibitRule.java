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

public class PrometheusAlertmanagerConfigInhibitRule extends AbstractModel {

    /**
    * Source 告警的标签匹配规则，比如 "a=b"、"a!=c" 等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceMatchers")
    @Expose
    private String [] SourceMatchers;

    /**
    * Target 告警的标签匹配规则，比如 "a=b"、"a!=c" 等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetMatchers")
    @Expose
    private String [] TargetMatchers;

    /**
    * Source 和 Target 告警都必须有的一组标签名，比如 alertname、cluster 等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Equal")
    @Expose
    private String [] Equal;

    /**
     * Get Source 告警的标签匹配规则，比如 "a=b"、"a!=c" 等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceMatchers Source 告警的标签匹配规则，比如 "a=b"、"a!=c" 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSourceMatchers() {
        return this.SourceMatchers;
    }

    /**
     * Set Source 告警的标签匹配规则，比如 "a=b"、"a!=c" 等
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceMatchers Source 告警的标签匹配规则，比如 "a=b"、"a!=c" 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceMatchers(String [] SourceMatchers) {
        this.SourceMatchers = SourceMatchers;
    }

    /**
     * Get Target 告警的标签匹配规则，比如 "a=b"、"a!=c" 等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetMatchers Target 告警的标签匹配规则，比如 "a=b"、"a!=c" 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTargetMatchers() {
        return this.TargetMatchers;
    }

    /**
     * Set Target 告警的标签匹配规则，比如 "a=b"、"a!=c" 等
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetMatchers Target 告警的标签匹配规则，比如 "a=b"、"a!=c" 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetMatchers(String [] TargetMatchers) {
        this.TargetMatchers = TargetMatchers;
    }

    /**
     * Get Source 和 Target 告警都必须有的一组标签名，比如 alertname、cluster 等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Equal Source 和 Target 告警都必须有的一组标签名，比如 alertname、cluster 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEqual() {
        return this.Equal;
    }

    /**
     * Set Source 和 Target 告警都必须有的一组标签名，比如 alertname、cluster 等
注意：此字段可能返回 null，表示取不到有效值。
     * @param Equal Source 和 Target 告警都必须有的一组标签名，比如 alertname、cluster 等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEqual(String [] Equal) {
        this.Equal = Equal;
    }

    public PrometheusAlertmanagerConfigInhibitRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAlertmanagerConfigInhibitRule(PrometheusAlertmanagerConfigInhibitRule source) {
        if (source.SourceMatchers != null) {
            this.SourceMatchers = new String[source.SourceMatchers.length];
            for (int i = 0; i < source.SourceMatchers.length; i++) {
                this.SourceMatchers[i] = new String(source.SourceMatchers[i]);
            }
        }
        if (source.TargetMatchers != null) {
            this.TargetMatchers = new String[source.TargetMatchers.length];
            for (int i = 0; i < source.TargetMatchers.length; i++) {
                this.TargetMatchers[i] = new String(source.TargetMatchers[i]);
            }
        }
        if (source.Equal != null) {
            this.Equal = new String[source.Equal.length];
            for (int i = 0; i < source.Equal.length; i++) {
                this.Equal[i] = new String(source.Equal[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SourceMatchers.", this.SourceMatchers);
        this.setParamArraySimple(map, prefix + "TargetMatchers.", this.TargetMatchers);
        this.setParamArraySimple(map, prefix + "Equal.", this.Equal);

    }
}

