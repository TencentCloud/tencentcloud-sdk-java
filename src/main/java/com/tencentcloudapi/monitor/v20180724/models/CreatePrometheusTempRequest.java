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

public class CreatePrometheusTempRequest extends AbstractModel {

    /**
    * 模板设置
    */
    @SerializedName("Template")
    @Expose
    private PrometheusTemp Template;

    /**
     * Get 模板设置 
     * @return Template 模板设置
     */
    public PrometheusTemp getTemplate() {
        return this.Template;
    }

    /**
     * Set 模板设置
     * @param Template 模板设置
     */
    public void setTemplate(PrometheusTemp Template) {
        this.Template = Template;
    }

    public CreatePrometheusTempRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrometheusTempRequest(CreatePrometheusTempRequest source) {
        if (source.Template != null) {
            this.Template = new PrometheusTemp(source.Template);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Template.", this.Template);

    }
}

