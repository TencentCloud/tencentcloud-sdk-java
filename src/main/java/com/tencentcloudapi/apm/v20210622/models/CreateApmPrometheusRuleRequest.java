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

public class CreateApmPrometheusRuleRequest extends AbstractModel {

    /**
    * <p>指标匹配规则名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>规则生效的应用。作用全部应用就传空字符串</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>指标匹配类型：0精准匹配，1前缀匹配，2后缀匹配</p>
    */
    @SerializedName("MetricMatchType")
    @Expose
    private Long MetricMatchType;

    /**
    * <p>客户定义的命中指标名规则。</p>
    */
    @SerializedName("MetricNameRule")
    @Expose
    private String MetricNameRule;

    /**
    * <p>业务系统ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>是否追加资源属性</p>
    */
    @SerializedName("AppendResourceAttributes")
    @Expose
    private Boolean AppendResourceAttributes;

    /**
     * Get <p>指标匹配规则名</p> 
     * @return Name <p>指标匹配规则名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>指标匹配规则名</p>
     * @param Name <p>指标匹配规则名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>规则生效的应用。作用全部应用就传空字符串</p> 
     * @return ServiceName <p>规则生效的应用。作用全部应用就传空字符串</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>规则生效的应用。作用全部应用就传空字符串</p>
     * @param ServiceName <p>规则生效的应用。作用全部应用就传空字符串</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>指标匹配类型：0精准匹配，1前缀匹配，2后缀匹配</p> 
     * @return MetricMatchType <p>指标匹配类型：0精准匹配，1前缀匹配，2后缀匹配</p>
     */
    public Long getMetricMatchType() {
        return this.MetricMatchType;
    }

    /**
     * Set <p>指标匹配类型：0精准匹配，1前缀匹配，2后缀匹配</p>
     * @param MetricMatchType <p>指标匹配类型：0精准匹配，1前缀匹配，2后缀匹配</p>
     */
    public void setMetricMatchType(Long MetricMatchType) {
        this.MetricMatchType = MetricMatchType;
    }

    /**
     * Get <p>客户定义的命中指标名规则。</p> 
     * @return MetricNameRule <p>客户定义的命中指标名规则。</p>
     */
    public String getMetricNameRule() {
        return this.MetricNameRule;
    }

    /**
     * Set <p>客户定义的命中指标名规则。</p>
     * @param MetricNameRule <p>客户定义的命中指标名规则。</p>
     */
    public void setMetricNameRule(String MetricNameRule) {
        this.MetricNameRule = MetricNameRule;
    }

    /**
     * Get <p>业务系统ID</p> 
     * @return InstanceId <p>业务系统ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>业务系统ID</p>
     * @param InstanceId <p>业务系统ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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

    public CreateApmPrometheusRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApmPrometheusRuleRequest(CreateApmPrometheusRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.MetricMatchType != null) {
            this.MetricMatchType = new Long(source.MetricMatchType);
        }
        if (source.MetricNameRule != null) {
            this.MetricNameRule = new String(source.MetricNameRule);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AppendResourceAttributes != null) {
            this.AppendResourceAttributes = new Boolean(source.AppendResourceAttributes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "MetricMatchType", this.MetricMatchType);
        this.setParamSimple(map, prefix + "MetricNameRule", this.MetricNameRule);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AppendResourceAttributes", this.AppendResourceAttributes);

    }
}

