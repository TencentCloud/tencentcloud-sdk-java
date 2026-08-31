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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteResourceData extends AbstractModel {

    /**
    * 资源类型 ,1:资源 2:资源组(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 资源或资源组Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private Long ResourceId;

    /**
     * Get 资源类型 ,1:资源 2:资源组(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源类型 ,1:资源 2:资源组(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型 ,1:资源 2:资源组(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源类型 ,1:资源 2:资源组(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源或资源组Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源或资源组Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源或资源组Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源或资源组Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(Long ResourceId) {
        this.ResourceId = ResourceId;
    }

    public DeleteResourceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteResourceData(DeleteResourceData source) {
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new Long(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

