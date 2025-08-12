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

public class DescribeConfigTemplateRequest extends AbstractModel {

    /**
    * 配置模板ID。该参数可以通过调用 [DescribeConfigTemplate](https://cloud.tencent.com/document/product/649/85856) 的返回值中的 ConfigTemplateId 字段来获取或通过登录[控制台](https://console.cloud.tencent.com/tse/tsf-consul?subTab=template)查看；也可以调用[CreateConfigTemplate](https://cloud.tencent.com/document/product/649/85861)创建新的配置模板。
    */
    @SerializedName("ConfigTemplateId")
    @Expose
    private String ConfigTemplateId;

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

    public DescribeConfigTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigTemplateRequest(DescribeConfigTemplateRequest source) {
        if (source.ConfigTemplateId != null) {
            this.ConfigTemplateId = new String(source.ConfigTemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigTemplateId", this.ConfigTemplateId);

    }
}

