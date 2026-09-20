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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditGroupTagRequest extends AbstractModel {

    /**
    * <p>标签类别。<br>Other：全量，TagText：文字，TagImage：图片，TagAudio：音频。</p>
    */
    @SerializedName("TagType")
    @Expose
    private String TagType;

    /**
     * Get <p>标签类别。<br>Other：全量，TagText：文字，TagImage：图片，TagAudio：音频。</p> 
     * @return TagType <p>标签类别。<br>Other：全量，TagText：文字，TagImage：图片，TagAudio：音频。</p>
     */
    public String getTagType() {
        return this.TagType;
    }

    /**
     * Set <p>标签类别。<br>Other：全量，TagText：文字，TagImage：图片，TagAudio：音频。</p>
     * @param TagType <p>标签类别。<br>Other：全量，TagText：文字，TagImage：图片，TagAudio：音频。</p>
     */
    public void setTagType(String TagType) {
        this.TagType = TagType;
    }

    public DescribeAuditGroupTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditGroupTagRequest(DescribeAuditGroupTagRequest source) {
        if (source.TagType != null) {
            this.TagType = new String(source.TagType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagType", this.TagType);

    }
}

