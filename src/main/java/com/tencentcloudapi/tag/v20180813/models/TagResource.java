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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagResource extends AbstractModel {

    /**
    * 标签键
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 标签值
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 标签键MD5值
    */
    @SerializedName("TagKeyMd5")
    @Expose
    private String TagKeyMd5;

    /**
    * 标签值MD5值
    */
    @SerializedName("TagValueMd5")
    @Expose
    private String TagValueMd5;

    /**
    * 资源类型
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 标签类型。取值： Custom：自定义标签。 System：系统标签。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get 标签键 
     * @return TagKey 标签键
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 标签键
     * @param TagKey 标签键
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 标签值 
     * @return TagValue 标签值
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set 标签值
     * @param TagValue 标签值
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 标签键MD5值 
     * @return TagKeyMd5 标签键MD5值
     */
    public String getTagKeyMd5() {
        return this.TagKeyMd5;
    }

    /**
     * Set 标签键MD5值
     * @param TagKeyMd5 标签键MD5值
     */
    public void setTagKeyMd5(String TagKeyMd5) {
        this.TagKeyMd5 = TagKeyMd5;
    }

    /**
     * Get 标签值MD5值 
     * @return TagValueMd5 标签值MD5值
     */
    public String getTagValueMd5() {
        return this.TagValueMd5;
    }

    /**
     * Set 标签值MD5值
     * @param TagValueMd5 标签值MD5值
     */
    public void setTagValueMd5(String TagValueMd5) {
        this.TagValueMd5 = TagValueMd5;
    }

    /**
     * Get 资源类型 
     * @return ServiceType 资源类型
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 资源类型
     * @param ServiceType 资源类型
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 标签类型。取值： Custom：自定义标签。 System：系统标签。 
     * @return Category 标签类型。取值： Custom：自定义标签。 System：系统标签。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 标签类型。取值： Custom：自定义标签。 System：系统标签。
     * @param Category 标签类型。取值： Custom：自定义标签。 System：系统标签。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public TagResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagResource(TagResource source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.TagKeyMd5 != null) {
            this.TagKeyMd5 = new String(source.TagKeyMd5);
        }
        if (source.TagValueMd5 != null) {
            this.TagValueMd5 = new String(source.TagValueMd5);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TagKeyMd5", this.TagKeyMd5);
        this.setParamSimple(map, prefix + "TagValueMd5", this.TagValueMd5);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

