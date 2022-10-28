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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeTag extends AbstractModel{

    /**
    * 节点Tag key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 节点Tag Value
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
     * Get 节点Tag key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagKey 节点Tag key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 节点Tag key
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagKey 节点Tag key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 节点Tag Value
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagValue 节点Tag Value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set 节点Tag Value
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagValue 节点Tag Value
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    public NodeTag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeTag(NodeTag source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);

    }
}

