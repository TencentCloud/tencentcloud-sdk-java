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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddResourceTagRequest extends AbstractModel{

    /**
    * 需要绑定的标签键，取值规范参考：https://cloud.tencent.com/document/product/651/13354
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 需要绑定的标签值，取值规范参考：https://cloud.tencent.com/document/product/651/13354
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * 待关联的资源，用标准的资源六段式表示。正确的资源六段式请参考：https://cloud.tencent.com/document/product/651/89122
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
     * Get 需要绑定的标签键，取值规范参考：https://cloud.tencent.com/document/product/651/13354 
     * @return TagKey 需要绑定的标签键，取值规范参考：https://cloud.tencent.com/document/product/651/13354
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 需要绑定的标签键，取值规范参考：https://cloud.tencent.com/document/product/651/13354
     * @param TagKey 需要绑定的标签键，取值规范参考：https://cloud.tencent.com/document/product/651/13354
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 需要绑定的标签值，取值规范参考：https://cloud.tencent.com/document/product/651/13354 
     * @return TagValue 需要绑定的标签值，取值规范参考：https://cloud.tencent.com/document/product/651/13354
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set 需要绑定的标签值，取值规范参考：https://cloud.tencent.com/document/product/651/13354
     * @param TagValue 需要绑定的标签值，取值规范参考：https://cloud.tencent.com/document/product/651/13354
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get 待关联的资源，用标准的资源六段式表示。正确的资源六段式请参考：https://cloud.tencent.com/document/product/651/89122 
     * @return Resource 待关联的资源，用标准的资源六段式表示。正确的资源六段式请参考：https://cloud.tencent.com/document/product/651/89122
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 待关联的资源，用标准的资源六段式表示。正确的资源六段式请参考：https://cloud.tencent.com/document/product/651/89122
     * @param Resource 待关联的资源，用标准的资源六段式表示。正确的资源六段式请参考：https://cloud.tencent.com/document/product/651/89122
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    public AddResourceTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddResourceTagRequest(AddResourceTagRequest source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "Resource", this.Resource);

    }
}

