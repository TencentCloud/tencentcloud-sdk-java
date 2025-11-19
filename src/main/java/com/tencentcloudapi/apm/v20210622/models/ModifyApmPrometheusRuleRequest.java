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

public class ModifyApmPrometheusRuleRequest extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 业务系统ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 所要修改的规则名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则状态：1(启用)、2（不启用）、3（删除）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 规则生效的应用。生效于全部应用就传空（这个如果不修改也要传旧的规则）
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 匹配类型：0精准匹配，1前缀匹配，2后缀匹配（这个如果不修改也要传旧的规则）
    */
    @SerializedName("MetricMatchType")
    @Expose
    private Long MetricMatchType;

    /**
    * 客户定义的命中指标名规则。
    */
    @SerializedName("MetricNameRule")
    @Expose
    private String MetricNameRule;

    /**
     * Get 规则ID 
     * @return Id 规则ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则ID
     * @param Id 规则ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 业务系统ID 
     * @return InstanceId 业务系统ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 业务系统ID
     * @param InstanceId 业务系统ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 所要修改的规则名 
     * @return Name 所要修改的规则名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 所要修改的规则名
     * @param Name 所要修改的规则名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则状态：1(启用)、2（不启用）、3（删除） 
     * @return Status 规则状态：1(启用)、2（不启用）、3（删除）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态：1(启用)、2（不启用）、3（删除）
     * @param Status 规则状态：1(启用)、2（不启用）、3（删除）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 规则生效的应用。生效于全部应用就传空（这个如果不修改也要传旧的规则） 
     * @return ServiceName 规则生效的应用。生效于全部应用就传空（这个如果不修改也要传旧的规则）
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 规则生效的应用。生效于全部应用就传空（这个如果不修改也要传旧的规则）
     * @param ServiceName 规则生效的应用。生效于全部应用就传空（这个如果不修改也要传旧的规则）
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 匹配类型：0精准匹配，1前缀匹配，2后缀匹配（这个如果不修改也要传旧的规则） 
     * @return MetricMatchType 匹配类型：0精准匹配，1前缀匹配，2后缀匹配（这个如果不修改也要传旧的规则）
     */
    public Long getMetricMatchType() {
        return this.MetricMatchType;
    }

    /**
     * Set 匹配类型：0精准匹配，1前缀匹配，2后缀匹配（这个如果不修改也要传旧的规则）
     * @param MetricMatchType 匹配类型：0精准匹配，1前缀匹配，2后缀匹配（这个如果不修改也要传旧的规则）
     */
    public void setMetricMatchType(Long MetricMatchType) {
        this.MetricMatchType = MetricMatchType;
    }

    /**
     * Get 客户定义的命中指标名规则。 
     * @return MetricNameRule 客户定义的命中指标名规则。
     */
    public String getMetricNameRule() {
        return this.MetricNameRule;
    }

    /**
     * Set 客户定义的命中指标名规则。
     * @param MetricNameRule 客户定义的命中指标名规则。
     */
    public void setMetricNameRule(String MetricNameRule) {
        this.MetricNameRule = MetricNameRule;
    }

    public ModifyApmPrometheusRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApmPrometheusRuleRequest(ModifyApmPrometheusRuleRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "MetricMatchType", this.MetricMatchType);
        this.setParamSimple(map, prefix + "MetricNameRule", this.MetricNameRule);

    }
}

