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

public class ExploreFileResource extends AbstractModel {

    /**
    * 资源类型，只能是这两种类型: folder, script
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 资源ID：目录id或脚本id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * id全路径，用于递归鉴权
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceIdForPath")
    @Expose
    private String ResourceIdForPath;

    /**
    * cfs路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceCFSPath")
    @Expose
    private String ResourceCFSPath;

    /**
     * Get 资源类型，只能是这两种类型: folder, script
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源类型，只能是这两种类型: folder, script
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，只能是这两种类型: folder, script
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源类型，只能是这两种类型: folder, script
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源ID：目录id或脚本id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源ID：目录id或脚本id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID：目录id或脚本id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源ID：目录id或脚本id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get id全路径，用于递归鉴权
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceIdForPath id全路径，用于递归鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceIdForPath() {
        return this.ResourceIdForPath;
    }

    /**
     * Set id全路径，用于递归鉴权
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceIdForPath id全路径，用于递归鉴权
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceIdForPath(String ResourceIdForPath) {
        this.ResourceIdForPath = ResourceIdForPath;
    }

    /**
     * Get cfs路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceCFSPath cfs路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceCFSPath() {
        return this.ResourceCFSPath;
    }

    /**
     * Set cfs路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceCFSPath cfs路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceCFSPath(String ResourceCFSPath) {
        this.ResourceCFSPath = ResourceCFSPath;
    }

    public ExploreFileResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExploreFileResource(ExploreFileResource source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceIdForPath != null) {
            this.ResourceIdForPath = new String(source.ResourceIdForPath);
        }
        if (source.ResourceCFSPath != null) {
            this.ResourceCFSPath = new String(source.ResourceCFSPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceIdForPath", this.ResourceIdForPath);
        this.setParamSimple(map, prefix + "ResourceCFSPath", this.ResourceCFSPath);

    }
}

