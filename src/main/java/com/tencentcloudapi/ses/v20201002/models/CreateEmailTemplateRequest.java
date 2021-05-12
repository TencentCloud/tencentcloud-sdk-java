/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEmailTemplateRequest extends AbstractModel{

    /**
    * 模板名称
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 模板内容
    */
    @SerializedName("TemplateContent")
    @Expose
    private TemplateContent TemplateContent;

    /**
     * Get 模板名称 
     * @return TemplateName 模板名称
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称
     * @param TemplateName 模板名称
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 模板内容 
     * @return TemplateContent 模板内容
     */
    public TemplateContent getTemplateContent() {
        return this.TemplateContent;
    }

    /**
     * Set 模板内容
     * @param TemplateContent 模板内容
     */
    public void setTemplateContent(TemplateContent TemplateContent) {
        this.TemplateContent = TemplateContent;
    }

    public CreateEmailTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEmailTemplateRequest(CreateEmailTemplateRequest source) {
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TemplateContent != null) {
            this.TemplateContent = new TemplateContent(source.TemplateContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamObj(map, prefix + "TemplateContent.", this.TemplateContent);

    }
}

