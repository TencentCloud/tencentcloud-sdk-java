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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BusinessMetadata extends AbstractModel {

    /**
    * 标签名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagNames")
    @Expose
    private String [] TagNames;

    /**
     * Get 标签名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagNames 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTagNames() {
        return this.TagNames;
    }

    /**
     * Set 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagNames 标签名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagNames(String [] TagNames) {
        this.TagNames = TagNames;
    }

    public BusinessMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BusinessMetadata(BusinessMetadata source) {
        if (source.TagNames != null) {
            this.TagNames = new String[source.TagNames.length];
            for (int i = 0; i < source.TagNames.length; i++) {
                this.TagNames[i] = new String(source.TagNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TagNames.", this.TagNames);

    }
}

