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

public class ResourceIdTag extends AbstractModel{

    /**
    * 资源唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 标签键值对
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagKeyValues")
    @Expose
    private Tag [] TagKeyValues;

    /**
     * Get 资源唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 标签键值对
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagKeyValues 标签键值对
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTagKeyValues() {
        return this.TagKeyValues;
    }

    /**
     * Set 标签键值对
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagKeyValues 标签键值对
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagKeyValues(Tag [] TagKeyValues) {
        this.TagKeyValues = TagKeyValues;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArrayObj(map, prefix + "TagKeyValues.", this.TagKeyValues);

    }
}

