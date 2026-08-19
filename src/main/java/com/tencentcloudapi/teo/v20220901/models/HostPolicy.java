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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostPolicy extends AbstractModel {

    /**
    * <p>站点级策略，针对站点下所有域名生效的策略，详情见 站点级策略。</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>当前域名使用的策略类型。取值有：<li>ZoneDefault：使用站点级策略，即 ZoneDefaultPolicy 中定义的策略配置。</li><li>Custom：使用域名级策略。使用该选项时，必须同时配置 Policy 字段，指定详细策略配置。</li><li>Template：使用策略模板。使用该选项时，必须同时配置 TemplateId 字段，指定当前域名使用的策略模板。</li></p>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * <p>可选。当 PolicyType 为 Custom 时，该字段为当前域名的详细策略配置，对当前域名生效。</p>
    */
    @SerializedName("Policy")
    @Expose
    private SecurityPolicy Policy;

    /**
    * <p>可选。当 PolicyType 为 Template 时，该字段用于指定当前域名所使用的策略模板的 Id。</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get <p>站点级策略，针对站点下所有域名生效的策略，详情见 站点级策略。</p> 
     * @return Host <p>站点级策略，针对站点下所有域名生效的策略，详情见 站点级策略。</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>站点级策略，针对站点下所有域名生效的策略，详情见 站点级策略。</p>
     * @param Host <p>站点级策略，针对站点下所有域名生效的策略，详情见 站点级策略。</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>当前域名使用的策略类型。取值有：<li>ZoneDefault：使用站点级策略，即 ZoneDefaultPolicy 中定义的策略配置。</li><li>Custom：使用域名级策略。使用该选项时，必须同时配置 Policy 字段，指定详细策略配置。</li><li>Template：使用策略模板。使用该选项时，必须同时配置 TemplateId 字段，指定当前域名使用的策略模板。</li></p> 
     * @return PolicyType <p>当前域名使用的策略类型。取值有：<li>ZoneDefault：使用站点级策略，即 ZoneDefaultPolicy 中定义的策略配置。</li><li>Custom：使用域名级策略。使用该选项时，必须同时配置 Policy 字段，指定详细策略配置。</li><li>Template：使用策略模板。使用该选项时，必须同时配置 TemplateId 字段，指定当前域名使用的策略模板。</li></p>
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set <p>当前域名使用的策略类型。取值有：<li>ZoneDefault：使用站点级策略，即 ZoneDefaultPolicy 中定义的策略配置。</li><li>Custom：使用域名级策略。使用该选项时，必须同时配置 Policy 字段，指定详细策略配置。</li><li>Template：使用策略模板。使用该选项时，必须同时配置 TemplateId 字段，指定当前域名使用的策略模板。</li></p>
     * @param PolicyType <p>当前域名使用的策略类型。取值有：<li>ZoneDefault：使用站点级策略，即 ZoneDefaultPolicy 中定义的策略配置。</li><li>Custom：使用域名级策略。使用该选项时，必须同时配置 Policy 字段，指定详细策略配置。</li><li>Template：使用策略模板。使用该选项时，必须同时配置 TemplateId 字段，指定当前域名使用的策略模板。</li></p>
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get <p>可选。当 PolicyType 为 Custom 时，该字段为当前域名的详细策略配置，对当前域名生效。</p> 
     * @return Policy <p>可选。当 PolicyType 为 Custom 时，该字段为当前域名的详细策略配置，对当前域名生效。</p>
     */
    public SecurityPolicy getPolicy() {
        return this.Policy;
    }

    /**
     * Set <p>可选。当 PolicyType 为 Custom 时，该字段为当前域名的详细策略配置，对当前域名生效。</p>
     * @param Policy <p>可选。当 PolicyType 为 Custom 时，该字段为当前域名的详细策略配置，对当前域名生效。</p>
     */
    public void setPolicy(SecurityPolicy Policy) {
        this.Policy = Policy;
    }

    /**
     * Get <p>可选。当 PolicyType 为 Template 时，该字段用于指定当前域名所使用的策略模板的 Id。</p> 
     * @return TemplateId <p>可选。当 PolicyType 为 Template 时，该字段用于指定当前域名所使用的策略模板的 Id。</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>可选。当 PolicyType 为 Template 时，该字段用于指定当前域名所使用的策略模板的 Id。</p>
     * @param TemplateId <p>可选。当 PolicyType 为 Template 时，该字段用于指定当前域名所使用的策略模板的 Id。</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public HostPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostPolicy(HostPolicy source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.Policy != null) {
            this.Policy = new SecurityPolicy(source.Policy);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamObj(map, prefix + "Policy.", this.Policy);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

