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

public class SetContentIdentifierParameters extends AbstractModel {

    /**
    * 内容标识id
    */
    @SerializedName("ContentIdentifier")
    @Expose
    private String ContentIdentifier;

    /**
     * Get 内容标识id 
     * @return ContentIdentifier 内容标识id
     */
    public String getContentIdentifier() {
        return this.ContentIdentifier;
    }

    /**
     * Set 内容标识id
     * @param ContentIdentifier 内容标识id
     */
    public void setContentIdentifier(String ContentIdentifier) {
        this.ContentIdentifier = ContentIdentifier;
    }

    public SetContentIdentifierParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetContentIdentifierParameters(SetContentIdentifierParameters source) {
        if (source.ContentIdentifier != null) {
            this.ContentIdentifier = new String(source.ContentIdentifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentIdentifier", this.ContentIdentifier);

    }
}

