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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceListDTO extends AbstractModel {

    /**
    * 资源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EntityId")
    @Expose
    private Long EntityId;

    /**
    * 资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * 资源权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceList")
    @Expose
    private ResourceItem [] ResourceList;

    /**
     * Get 资源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EntityId 资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEntityId() {
        return this.EntityId;
    }

    /**
     * Set 资源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param EntityId 资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntityId(Long EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get 资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeType 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeType 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 资源权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceList 资源权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceItem [] getResourceList() {
        return this.ResourceList;
    }

    /**
     * Set 资源权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceList 资源权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceList(ResourceItem [] ResourceList) {
        this.ResourceList = ResourceList;
    }

    public ResourceListDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceListDTO(ResourceListDTO source) {
        if (source.EntityId != null) {
            this.EntityId = new Long(source.EntityId);
        }
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.ResourceList != null) {
            this.ResourceList = new ResourceItem[source.ResourceList.length];
            for (int i = 0; i < source.ResourceList.length; i++) {
                this.ResourceList[i] = new ResourceItem(source.ResourceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArrayObj(map, prefix + "ResourceList.", this.ResourceList);

    }
}

