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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagsForm extends AbstractModel {

    /**
    * key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * value
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagValue")
    @Expose
    private String [] TagValue;

    /**
     * Get key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagKey key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set key
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagKey key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get value
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagValue value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTagValue() {
        return this.TagValue;
    }

    /**
     * Set value
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagValue value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagValue(String [] TagValue) {
        this.TagValue = TagValue;
    }

    public TagsForm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagsForm(TagsForm source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String[source.TagValue.length];
            for (int i = 0; i < source.TagValue.length; i++) {
                this.TagValue[i] = new String(source.TagValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamArraySimple(map, prefix + "TagValue.", this.TagValue);

    }
}

