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

public class ModifyWebSecurityTemplateRequest extends AbstractModel {

    /**
    * 站点 ID。需要传入目标策略模板在访问权限上归属的站点，可使用 DescribeWebSecurityTemplates 接口查询策略模板归属的站点。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 策略模板 ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 修改后的策略模板名称。由中文、英文、数字和下划线组成，不能以下划线开头，且长度不能超过32个字符。字段为空时则不修改。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 安全策略模板配置内容。值为空时不修改；没有传入的子模块结构不会被修改。目前支持 Web 防护模块中的例外规则、自定义规则、速率限制规则和托管规则配置，通过表达式语法对安全策略进行配置。 Bot 管理规则配置暂不支持，正在开发中。
特别说明：当入参某个子模块结构时，请确保携带所有需要保留的规则内容，未传入规则内容视为删除。
    */
    @SerializedName("SecurityPolicy")
    @Expose
    private SecurityPolicy SecurityPolicy;

    /**
     * Get 站点 ID。需要传入目标策略模板在访问权限上归属的站点，可使用 DescribeWebSecurityTemplates 接口查询策略模板归属的站点。 
     * @return ZoneId 站点 ID。需要传入目标策略模板在访问权限上归属的站点，可使用 DescribeWebSecurityTemplates 接口查询策略模板归属的站点。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。需要传入目标策略模板在访问权限上归属的站点，可使用 DescribeWebSecurityTemplates 接口查询策略模板归属的站点。
     * @param ZoneId 站点 ID。需要传入目标策略模板在访问权限上归属的站点，可使用 DescribeWebSecurityTemplates 接口查询策略模板归属的站点。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 策略模板 ID。 
     * @return TemplateId 策略模板 ID。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 策略模板 ID。
     * @param TemplateId 策略模板 ID。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 修改后的策略模板名称。由中文、英文、数字和下划线组成，不能以下划线开头，且长度不能超过32个字符。字段为空时则不修改。 
     * @return TemplateName 修改后的策略模板名称。由中文、英文、数字和下划线组成，不能以下划线开头，且长度不能超过32个字符。字段为空时则不修改。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 修改后的策略模板名称。由中文、英文、数字和下划线组成，不能以下划线开头，且长度不能超过32个字符。字段为空时则不修改。
     * @param TemplateName 修改后的策略模板名称。由中文、英文、数字和下划线组成，不能以下划线开头，且长度不能超过32个字符。字段为空时则不修改。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 安全策略模板配置内容。值为空时不修改；没有传入的子模块结构不会被修改。目前支持 Web 防护模块中的例外规则、自定义规则、速率限制规则和托管规则配置，通过表达式语法对安全策略进行配置。 Bot 管理规则配置暂不支持，正在开发中。
特别说明：当入参某个子模块结构时，请确保携带所有需要保留的规则内容，未传入规则内容视为删除。 
     * @return SecurityPolicy 安全策略模板配置内容。值为空时不修改；没有传入的子模块结构不会被修改。目前支持 Web 防护模块中的例外规则、自定义规则、速率限制规则和托管规则配置，通过表达式语法对安全策略进行配置。 Bot 管理规则配置暂不支持，正在开发中。
特别说明：当入参某个子模块结构时，请确保携带所有需要保留的规则内容，未传入规则内容视为删除。
     */
    public SecurityPolicy getSecurityPolicy() {
        return this.SecurityPolicy;
    }

    /**
     * Set 安全策略模板配置内容。值为空时不修改；没有传入的子模块结构不会被修改。目前支持 Web 防护模块中的例外规则、自定义规则、速率限制规则和托管规则配置，通过表达式语法对安全策略进行配置。 Bot 管理规则配置暂不支持，正在开发中。
特别说明：当入参某个子模块结构时，请确保携带所有需要保留的规则内容，未传入规则内容视为删除。
     * @param SecurityPolicy 安全策略模板配置内容。值为空时不修改；没有传入的子模块结构不会被修改。目前支持 Web 防护模块中的例外规则、自定义规则、速率限制规则和托管规则配置，通过表达式语法对安全策略进行配置。 Bot 管理规则配置暂不支持，正在开发中。
特别说明：当入参某个子模块结构时，请确保携带所有需要保留的规则内容，未传入规则内容视为删除。
     */
    public void setSecurityPolicy(SecurityPolicy SecurityPolicy) {
        this.SecurityPolicy = SecurityPolicy;
    }

    public ModifyWebSecurityTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebSecurityTemplateRequest(ModifyWebSecurityTemplateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
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
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamObj(map, prefix + "SecurityPolicy.", this.SecurityPolicy);

    }
}

