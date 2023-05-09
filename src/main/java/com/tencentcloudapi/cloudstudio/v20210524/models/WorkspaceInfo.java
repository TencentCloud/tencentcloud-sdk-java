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
package com.tencentcloudapi.cloudstudio.v20210524.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkspaceInfo extends AbstractModel{

    /**
    * 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 工作空间标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpaceKey")
    @Expose
    private String SpaceKey;

    /**
    * 工作空间名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkspaceId 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkspaceId 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 工作空间标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpaceKey 工作空间标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpaceKey() {
        return this.SpaceKey;
    }

    /**
     * Set 工作空间标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpaceKey 工作空间标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpaceKey(String SpaceKey) {
        this.SpaceKey = SpaceKey;
    }

    /**
     * Get 工作空间名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 工作空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 工作空间名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 工作空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public WorkspaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkspaceInfo(WorkspaceInfo source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.SpaceKey != null) {
            this.SpaceKey = new String(source.SpaceKey);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "SpaceKey", this.SpaceKey);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

