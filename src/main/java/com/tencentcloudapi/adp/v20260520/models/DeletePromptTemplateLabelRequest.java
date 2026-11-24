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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePromptTemplateLabelRequest extends AbstractModel {

    /**
    * 标签ID
    */
    @SerializedName("PromptTemplateLabelId")
    @Expose
    private String PromptTemplateLabelId;

    /**
     * Get 标签ID 
     * @return PromptTemplateLabelId 标签ID
     */
    public String getPromptTemplateLabelId() {
        return this.PromptTemplateLabelId;
    }

    /**
     * Set 标签ID
     * @param PromptTemplateLabelId 标签ID
     */
    public void setPromptTemplateLabelId(String PromptTemplateLabelId) {
        this.PromptTemplateLabelId = PromptTemplateLabelId;
    }

    public DeletePromptTemplateLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePromptTemplateLabelRequest(DeletePromptTemplateLabelRequest source) {
        if (source.PromptTemplateLabelId != null) {
            this.PromptTemplateLabelId = new String(source.PromptTemplateLabelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PromptTemplateLabelId", this.PromptTemplateLabelId);

    }
}

