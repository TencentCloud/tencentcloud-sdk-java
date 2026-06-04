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

public class TemplatePublishInfo extends AbstractModel {

    /**
    * 是否已同步到模版中心
    */
    @SerializedName("IsPublished")
    @Expose
    private Boolean IsPublished;

    /**
     * Get 是否已同步到模版中心 
     * @return IsPublished 是否已同步到模版中心
     */
    public Boolean getIsPublished() {
        return this.IsPublished;
    }

    /**
     * Set 是否已同步到模版中心
     * @param IsPublished 是否已同步到模版中心
     */
    public void setIsPublished(Boolean IsPublished) {
        this.IsPublished = IsPublished;
    }

    public TemplatePublishInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplatePublishInfo(TemplatePublishInfo source) {
        if (source.IsPublished != null) {
            this.IsPublished = new Boolean(source.IsPublished);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsPublished", this.IsPublished);

    }
}

