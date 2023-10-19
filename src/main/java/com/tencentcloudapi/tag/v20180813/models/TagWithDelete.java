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

public class TagWithDelete extends AbstractModel {

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
    * 是否可以删除
    */
    @SerializedName("CanDelete")
    @Expose
    private Long CanDelete;

    /**
    * 标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 是否可以删除 
     * @return CanDelete 是否可以删除
     */
    public Long getCanDelete() {
        return this.CanDelete;
    }

    /**
     * Set 是否可以删除
     * @param CanDelete 是否可以删除
     */
    public void setCanDelete(Long CanDelete) {
        this.CanDelete = CanDelete;
    }

    /**
     * Get 标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Category 标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Category 标签类型。取值： Custom：自定义标签。 System：系统标签。 All：全部标签。 默认值：All。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public TagWithDelete() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagWithDelete(TagWithDelete source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.CanDelete != null) {
            this.CanDelete = new Long(source.CanDelete);
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
        this.setParamSimple(map, prefix + "CanDelete", this.CanDelete);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

