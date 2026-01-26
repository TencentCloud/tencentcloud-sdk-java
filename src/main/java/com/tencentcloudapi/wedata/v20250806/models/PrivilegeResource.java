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

public class PrivilegeResource extends AbstractModel {

    /**
    * 资源类型 Catalog、Schema等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源URI
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceUri")
    @Expose
    private String ResourceUri;

    /**
     * Get 资源类型 Catalog、Schema等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源类型 Catalog、Schema等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型 Catalog、Schema等
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源类型 Catalog、Schema等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源URI
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceUri 资源URI
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceUri() {
        return this.ResourceUri;
    }

    /**
     * Set 资源URI
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceUri 资源URI
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceUri(String ResourceUri) {
        this.ResourceUri = ResourceUri;
    }

    public PrivilegeResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivilegeResource(PrivilegeResource source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceUri != null) {
            this.ResourceUri = new String(source.ResourceUri);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceUri", this.ResourceUri);

    }
}

