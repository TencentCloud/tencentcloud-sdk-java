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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetryTagItem extends AbstractModel {

    /**
    * <p>标签名称</p>
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * <p>标签值</p>
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
     * Get <p>标签名称</p> 
     * @return TagName <p>标签名称</p>
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set <p>标签名称</p>
     * @param TagName <p>标签名称</p>
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get <p>标签值</p> 
     * @return TagValue <p>标签值</p>
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set <p>标签值</p>
     * @param TagValue <p>标签值</p>
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    public RetryTagItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetryTagItem(RetryTagItem source) {
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);

    }
}

