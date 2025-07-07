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

public class ModifyContentIdentifierRequest extends AbstractModel {

    /**
    * 内容标识符 ID。
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * 内容标识符描述，长度限制不超过 20 个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 内容标识符 ID。 
     * @return ContentId 内容标识符 ID。
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set 内容标识符 ID。
     * @param ContentId 内容标识符 ID。
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Get 内容标识符描述，长度限制不超过 20 个字符。 
     * @return Description 内容标识符描述，长度限制不超过 20 个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 内容标识符描述，长度限制不超过 20 个字符。
     * @param Description 内容标识符描述，长度限制不超过 20 个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyContentIdentifierRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyContentIdentifierRequest(ModifyContentIdentifierRequest source) {
        if (source.ContentId != null) {
            this.ContentId = new String(source.ContentId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

