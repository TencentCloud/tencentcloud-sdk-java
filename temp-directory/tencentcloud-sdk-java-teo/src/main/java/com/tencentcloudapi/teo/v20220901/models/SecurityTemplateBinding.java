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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityTemplateBinding extends AbstractModel {

    /**
    * 模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 模板绑定状态。
    */
    @SerializedName("TemplateScope")
    @Expose
    private TemplateScope [] TemplateScope;

    /**
     * Get 模板ID 
     * @return TemplateId 模板ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID
     * @param TemplateId 模板ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板绑定状态。 
     * @return TemplateScope 模板绑定状态。
     */
    public TemplateScope [] getTemplateScope() {
        return this.TemplateScope;
    }

    /**
     * Set 模板绑定状态。
     * @param TemplateScope 模板绑定状态。
     */
    public void setTemplateScope(TemplateScope [] TemplateScope) {
        this.TemplateScope = TemplateScope;
    }

    public SecurityTemplateBinding() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityTemplateBinding(SecurityTemplateBinding source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateScope != null) {
            this.TemplateScope = new TemplateScope[source.TemplateScope.length];
            for (int i = 0; i < source.TemplateScope.length; i++) {
                this.TemplateScope[i] = new TemplateScope(source.TemplateScope[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArrayObj(map, prefix + "TemplateScope.", this.TemplateScope);

    }
}

