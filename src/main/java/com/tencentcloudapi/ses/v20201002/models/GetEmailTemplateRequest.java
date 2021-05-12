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

public class GetEmailTemplateRequest extends AbstractModel{

    /**
    * 模板ID
    */
    @SerializedName("TemplateID")
    @Expose
    private Long TemplateID;

    /**
     * Get 模板ID 
     * @return TemplateID 模板ID
     */
    public Long getTemplateID() {
        return this.TemplateID;
    }

    /**
     * Set 模板ID
     * @param TemplateID 模板ID
     */
    public void setTemplateID(Long TemplateID) {
        this.TemplateID = TemplateID;
    }

    public GetEmailTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEmailTemplateRequest(GetEmailTemplateRequest source) {
        if (source.TemplateID != null) {
            this.TemplateID = new Long(source.TemplateID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateID", this.TemplateID);

    }
}

