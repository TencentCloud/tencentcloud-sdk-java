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

public class DefaultDenySecurityActionParameters extends AbstractModel {

    /**
    * 托管规则默认拦截处置动作配置。	DenyActionParameters 支持的配置参数：<li>ReturnCustomPage：是否使用自定义页面。</li><li>ResponseCode：自定义页面的状态码。</li><li>ErrorPageId：自定义页面的 PageId。</li>
    */
    @SerializedName("ManagedRules")
    @Expose
    private DenyActionParameters ManagedRules;

    /**
    * 除托管规则外的安全防护规则（自定义规则、速率限制 和 Bot 管理功能）默认拦截处置动作配置。	DenyActionParameters 支持的配置参数：<li>ReturnCustomPage：是否使用自定义页面。</li><li>ResponseCode：自定义页面的状态码。</li><li>ErrorPageId：自定义页面的 PageId。</li>
    */
    @SerializedName("OtherModules")
    @Expose
    private DenyActionParameters OtherModules;

    /**
     * Get 托管规则默认拦截处置动作配置。	DenyActionParameters 支持的配置参数：<li>ReturnCustomPage：是否使用自定义页面。</li><li>ResponseCode：自定义页面的状态码。</li><li>ErrorPageId：自定义页面的 PageId。</li> 
     * @return ManagedRules 托管规则默认拦截处置动作配置。	DenyActionParameters 支持的配置参数：<li>ReturnCustomPage：是否使用自定义页面。</li><li>ResponseCode：自定义页面的状态码。</li><li>ErrorPageId：自定义页面的 PageId。</li>
     */
    public DenyActionParameters getManagedRules() {
        return this.ManagedRules;
    }

    /**
     * Set 托管规则默认拦截处置动作配置。	DenyActionParameters 支持的配置参数：<li>ReturnCustomPage：是否使用自定义页面。</li><li>ResponseCode：自定义页面的状态码。</li><li>ErrorPageId：自定义页面的 PageId。</li>
     * @param ManagedRules 托管规则默认拦截处置动作配置。	DenyActionParameters 支持的配置参数：<li>ReturnCustomPage：是否使用自定义页面。</li><li>ResponseCode：自定义页面的状态码。</li><li>ErrorPageId：自定义页面的 PageId。</li>
     */
    public void setManagedRules(DenyActionParameters ManagedRules) {
        this.ManagedRules = ManagedRules;
    }

    /**
     * Get 除托管规则外的安全防护规则（自定义规则、速率限制 和 Bot 管理功能）默认拦截处置动作配置。	DenyActionParameters 支持的配置参数：<li>ReturnCustomPage：是否使用自定义页面。</li><li>ResponseCode：自定义页面的状态码。</li><li>ErrorPageId：自定义页面的 PageId。</li> 
     * @return OtherModules 除托管规则外的安全防护规则（自定义规则、速率限制 和 Bot 管理功能）默认拦截处置动作配置。	DenyActionParameters 支持的配置参数：<li>ReturnCustomPage：是否使用自定义页面。</li><li>ResponseCode：自定义页面的状态码。</li><li>ErrorPageId：自定义页面的 PageId。</li>
     */
    public DenyActionParameters getOtherModules() {
        return this.OtherModules;
    }

    /**
     * Set 除托管规则外的安全防护规则（自定义规则、速率限制 和 Bot 管理功能）默认拦截处置动作配置。	DenyActionParameters 支持的配置参数：<li>ReturnCustomPage：是否使用自定义页面。</li><li>ResponseCode：自定义页面的状态码。</li><li>ErrorPageId：自定义页面的 PageId。</li>
     * @param OtherModules 除托管规则外的安全防护规则（自定义规则、速率限制 和 Bot 管理功能）默认拦截处置动作配置。	DenyActionParameters 支持的配置参数：<li>ReturnCustomPage：是否使用自定义页面。</li><li>ResponseCode：自定义页面的状态码。</li><li>ErrorPageId：自定义页面的 PageId。</li>
     */
    public void setOtherModules(DenyActionParameters OtherModules) {
        this.OtherModules = OtherModules;
    }

    public DefaultDenySecurityActionParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DefaultDenySecurityActionParameters(DefaultDenySecurityActionParameters source) {
        if (source.ManagedRules != null) {
            this.ManagedRules = new DenyActionParameters(source.ManagedRules);
        }
        if (source.OtherModules != null) {
            this.OtherModules = new DenyActionParameters(source.OtherModules);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ManagedRules.", this.ManagedRules);
        this.setParamObj(map, prefix + "OtherModules.", this.OtherModules);

    }
}

