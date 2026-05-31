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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmPrometheusRules extends AbstractModel {

    /**
    * <p>指标匹配规则ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>指标匹配规则名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>规则生效的应用。生效于全部应用就传空字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>指标匹配规则状态：1(启用)、2（不启用）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>指标匹配规则</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricNameRule")
    @Expose
    private String MetricNameRule;

    /**
    * <p>匹配类型：0精准匹配，1前缀匹配，2后缀匹配</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricMatchType")
    @Expose
    private Long MetricMatchType;

    /**
    * <p>是否追加资源属性</p>
    */
    @SerializedName("AppendResourceAttributes")
    @Expose
    private Boolean AppendResourceAttributes;

    /**
     * Get <p>指标匹配规则ID</p> 
     * @return Id <p>指标匹配规则ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>指标匹配规则ID</p>
     * @param Id <p>指标匹配规则ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>指标匹配规则名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>指标匹配规则名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>指标匹配规则名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>指标匹配规则名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>规则生效的应用。生效于全部应用就传空字符串</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName <p>规则生效的应用。生效于全部应用就传空字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>规则生效的应用。生效于全部应用就传空字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName <p>规则生效的应用。生效于全部应用就传空字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>指标匹配规则状态：1(启用)、2（不启用）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>指标匹配规则状态：1(启用)、2（不启用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>指标匹配规则状态：1(启用)、2（不启用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>指标匹配规则状态：1(启用)、2（不启用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>指标匹配规则</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricNameRule <p>指标匹配规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricNameRule() {
        return this.MetricNameRule;
    }

    /**
     * Set <p>指标匹配规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricNameRule <p>指标匹配规则</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricNameRule(String MetricNameRule) {
        this.MetricNameRule = MetricNameRule;
    }

    /**
     * Get <p>匹配类型：0精准匹配，1前缀匹配，2后缀匹配</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricMatchType <p>匹配类型：0精准匹配，1前缀匹配，2后缀匹配</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMetricMatchType() {
        return this.MetricMatchType;
    }

    /**
     * Set <p>匹配类型：0精准匹配，1前缀匹配，2后缀匹配</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricMatchType <p>匹配类型：0精准匹配，1前缀匹配，2后缀匹配</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricMatchType(Long MetricMatchType) {
        this.MetricMatchType = MetricMatchType;
    }

    /**
     * Get <p>是否追加资源属性</p> 
     * @return AppendResourceAttributes <p>是否追加资源属性</p>
     */
    public Boolean getAppendResourceAttributes() {
        return this.AppendResourceAttributes;
    }

    /**
     * Set <p>是否追加资源属性</p>
     * @param AppendResourceAttributes <p>是否追加资源属性</p>
     */
    public void setAppendResourceAttributes(Boolean AppendResourceAttributes) {
        this.AppendResourceAttributes = AppendResourceAttributes;
    }

    public ApmPrometheusRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmPrometheusRules(ApmPrometheusRules source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MetricNameRule != null) {
            this.MetricNameRule = new String(source.MetricNameRule);
        }
        if (source.MetricMatchType != null) {
            this.MetricMatchType = new Long(source.MetricMatchType);
        }
        if (source.AppendResourceAttributes != null) {
            this.AppendResourceAttributes = new Boolean(source.AppendResourceAttributes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MetricNameRule", this.MetricNameRule);
        this.setParamSimple(map, prefix + "MetricMatchType", this.MetricMatchType);
        this.setParamSimple(map, prefix + "AppendResourceAttributes", this.AppendResourceAttributes);

    }
}

