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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateConfigTemplateRequest extends AbstractModel {

    /**
    * 配置模板ID。该参数可以通过调用 [DescribeConfigTemplate](https://cloud.tencent.com/document/product/649/85856) 的返回值中的 ConfigTemplateId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=template)查看；也可以调用[CreateConfigTemplate](https://cloud.tencent.com/document/product/649/85861)创建新的配置模板。
    */
    @SerializedName("ConfigTemplateId")
    @Expose
    private String ConfigTemplateId;

    /**
    * 配置模板名称，最多支持60个字符，只能包含字母、数字及分隔符（“-”），且不能以分隔符开头或结尾。
    */
    @SerializedName("ConfigTemplateName")
    @Expose
    private String ConfigTemplateName;

    /**
    * 配置模板对应的微服务框架。
- Ribbon：Ribbon类型配置模板
- Hystrix：Hystrix类型配置模板
- Zuul：Zuul类型配置模板
- customize：自定义类型配置模板
    */
    @SerializedName("ConfigTemplateType")
    @Expose
    private String ConfigTemplateType;

    /**
    * 配置模板数据。
    */
    @SerializedName("ConfigTemplateValue")
    @Expose
    private String ConfigTemplateValue;

    /**
    * 配置模板描述，最多支持200个字符。
    */
    @SerializedName("ConfigTemplateDesc")
    @Expose
    private String ConfigTemplateDesc;

    /**
     * Get 配置模板ID。该参数可以通过调用 [DescribeConfigTemplate](https://cloud.tencent.com/document/product/649/85856) 的返回值中的 ConfigTemplateId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=template)查看；也可以调用[CreateConfigTemplate](https://cloud.tencent.com/document/product/649/85861)创建新的配置模板。 
     * @return ConfigTemplateId 配置模板ID。该参数可以通过调用 [DescribeConfigTemplate](https://cloud.tencent.com/document/product/649/85856) 的返回值中的 ConfigTemplateId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=template)查看；也可以调用[CreateConfigTemplate](https://cloud.tencent.com/document/product/649/85861)创建新的配置模板。
     */
    public String getConfigTemplateId() {
        return this.ConfigTemplateId;
    }

    /**
     * Set 配置模板ID。该参数可以通过调用 [DescribeConfigTemplate](https://cloud.tencent.com/document/product/649/85856) 的返回值中的 ConfigTemplateId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=template)查看；也可以调用[CreateConfigTemplate](https://cloud.tencent.com/document/product/649/85861)创建新的配置模板。
     * @param ConfigTemplateId 配置模板ID。该参数可以通过调用 [DescribeConfigTemplate](https://cloud.tencent.com/document/product/649/85856) 的返回值中的 ConfigTemplateId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=template)查看；也可以调用[CreateConfigTemplate](https://cloud.tencent.com/document/product/649/85861)创建新的配置模板。
     */
    public void setConfigTemplateId(String ConfigTemplateId) {
        this.ConfigTemplateId = ConfigTemplateId;
    }

    /**
     * Get 配置模板名称，最多支持60个字符，只能包含字母、数字及分隔符（“-”），且不能以分隔符开头或结尾。 
     * @return ConfigTemplateName 配置模板名称，最多支持60个字符，只能包含字母、数字及分隔符（“-”），且不能以分隔符开头或结尾。
     */
    public String getConfigTemplateName() {
        return this.ConfigTemplateName;
    }

    /**
     * Set 配置模板名称，最多支持60个字符，只能包含字母、数字及分隔符（“-”），且不能以分隔符开头或结尾。
     * @param ConfigTemplateName 配置模板名称，最多支持60个字符，只能包含字母、数字及分隔符（“-”），且不能以分隔符开头或结尾。
     */
    public void setConfigTemplateName(String ConfigTemplateName) {
        this.ConfigTemplateName = ConfigTemplateName;
    }

    /**
     * Get 配置模板对应的微服务框架。
- Ribbon：Ribbon类型配置模板
- Hystrix：Hystrix类型配置模板
- Zuul：Zuul类型配置模板
- customize：自定义类型配置模板 
     * @return ConfigTemplateType 配置模板对应的微服务框架。
- Ribbon：Ribbon类型配置模板
- Hystrix：Hystrix类型配置模板
- Zuul：Zuul类型配置模板
- customize：自定义类型配置模板
     */
    public String getConfigTemplateType() {
        return this.ConfigTemplateType;
    }

    /**
     * Set 配置模板对应的微服务框架。
- Ribbon：Ribbon类型配置模板
- Hystrix：Hystrix类型配置模板
- Zuul：Zuul类型配置模板
- customize：自定义类型配置模板
     * @param ConfigTemplateType 配置模板对应的微服务框架。
- Ribbon：Ribbon类型配置模板
- Hystrix：Hystrix类型配置模板
- Zuul：Zuul类型配置模板
- customize：自定义类型配置模板
     */
    public void setConfigTemplateType(String ConfigTemplateType) {
        this.ConfigTemplateType = ConfigTemplateType;
    }

    /**
     * Get 配置模板数据。 
     * @return ConfigTemplateValue 配置模板数据。
     */
    public String getConfigTemplateValue() {
        return this.ConfigTemplateValue;
    }

    /**
     * Set 配置模板数据。
     * @param ConfigTemplateValue 配置模板数据。
     */
    public void setConfigTemplateValue(String ConfigTemplateValue) {
        this.ConfigTemplateValue = ConfigTemplateValue;
    }

    /**
     * Get 配置模板描述，最多支持200个字符。 
     * @return ConfigTemplateDesc 配置模板描述，最多支持200个字符。
     */
    public String getConfigTemplateDesc() {
        return this.ConfigTemplateDesc;
    }

    /**
     * Set 配置模板描述，最多支持200个字符。
     * @param ConfigTemplateDesc 配置模板描述，最多支持200个字符。
     */
    public void setConfigTemplateDesc(String ConfigTemplateDesc) {
        this.ConfigTemplateDesc = ConfigTemplateDesc;
    }

    public UpdateConfigTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateConfigTemplateRequest(UpdateConfigTemplateRequest source) {
        if (source.ConfigTemplateId != null) {
            this.ConfigTemplateId = new String(source.ConfigTemplateId);
        }
        if (source.ConfigTemplateName != null) {
            this.ConfigTemplateName = new String(source.ConfigTemplateName);
        }
        if (source.ConfigTemplateType != null) {
            this.ConfigTemplateType = new String(source.ConfigTemplateType);
        }
        if (source.ConfigTemplateValue != null) {
            this.ConfigTemplateValue = new String(source.ConfigTemplateValue);
        }
        if (source.ConfigTemplateDesc != null) {
            this.ConfigTemplateDesc = new String(source.ConfigTemplateDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigTemplateId", this.ConfigTemplateId);
        this.setParamSimple(map, prefix + "ConfigTemplateName", this.ConfigTemplateName);
        this.setParamSimple(map, prefix + "ConfigTemplateType", this.ConfigTemplateType);
        this.setParamSimple(map, prefix + "ConfigTemplateValue", this.ConfigTemplateValue);
        this.setParamSimple(map, prefix + "ConfigTemplateDesc", this.ConfigTemplateDesc);

    }
}

