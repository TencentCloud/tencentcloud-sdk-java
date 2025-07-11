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

public class CreateWebSecurityTemplateRequest extends AbstractModel {

    /**
    * 站点 ID。该参数明确策略模板在访问权限上归属的站点。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 策略模板名称。由中文、英文、数字和下划线组成，不能以下划线开头，且长度不能超过 32 个字符。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 安全策略模板配置内容，字段为空时生成默认配置。目前支持 Web 防护模块中的例外规则、自定义规则、速率限制规则和托管规则配置，通过表达式语法对安全策略进行配置。 Bot 管理规则配置暂不支持，正在开发中。
    */
    @SerializedName("SecurityPolicy")
    @Expose
    private SecurityPolicy SecurityPolicy;

    /**
     * Get 站点 ID。该参数明确策略模板在访问权限上归属的站点。 
     * @return ZoneId 站点 ID。该参数明确策略模板在访问权限上归属的站点。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。该参数明确策略模板在访问权限上归属的站点。
     * @param ZoneId 站点 ID。该参数明确策略模板在访问权限上归属的站点。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 策略模板名称。由中文、英文、数字和下划线组成，不能以下划线开头，且长度不能超过 32 个字符。 
     * @return TemplateName 策略模板名称。由中文、英文、数字和下划线组成，不能以下划线开头，且长度不能超过 32 个字符。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 策略模板名称。由中文、英文、数字和下划线组成，不能以下划线开头，且长度不能超过 32 个字符。
     * @param TemplateName 策略模板名称。由中文、英文、数字和下划线组成，不能以下划线开头，且长度不能超过 32 个字符。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 安全策略模板配置内容，字段为空时生成默认配置。目前支持 Web 防护模块中的例外规则、自定义规则、速率限制规则和托管规则配置，通过表达式语法对安全策略进行配置。 Bot 管理规则配置暂不支持，正在开发中。 
     * @return SecurityPolicy 安全策略模板配置内容，字段为空时生成默认配置。目前支持 Web 防护模块中的例外规则、自定义规则、速率限制规则和托管规则配置，通过表达式语法对安全策略进行配置。 Bot 管理规则配置暂不支持，正在开发中。
     */
    public SecurityPolicy getSecurityPolicy() {
        return this.SecurityPolicy;
    }

    /**
     * Set 安全策略模板配置内容，字段为空时生成默认配置。目前支持 Web 防护模块中的例外规则、自定义规则、速率限制规则和托管规则配置，通过表达式语法对安全策略进行配置。 Bot 管理规则配置暂不支持，正在开发中。
     * @param SecurityPolicy 安全策略模板配置内容，字段为空时生成默认配置。目前支持 Web 防护模块中的例外规则、自定义规则、速率限制规则和托管规则配置，通过表达式语法对安全策略进行配置。 Bot 管理规则配置暂不支持，正在开发中。
     */
    public void setSecurityPolicy(SecurityPolicy SecurityPolicy) {
        this.SecurityPolicy = SecurityPolicy;
    }

    public CreateWebSecurityTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWebSecurityTemplateRequest(CreateWebSecurityTemplateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.SecurityPolicy != null) {
            this.SecurityPolicy = new SecurityPolicy(source.SecurityPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamObj(map, prefix + "SecurityPolicy.", this.SecurityPolicy);

    }
}

