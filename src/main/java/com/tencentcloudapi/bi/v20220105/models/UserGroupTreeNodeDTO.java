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

public class UserGroupTreeNodeDTO extends AbstractModel {

    /**
    * 用户组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 是否查询子节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryChildNodes")
    @Expose
    private Boolean QueryChildNodes;

    /**
     * Get 用户组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 用户组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 用户组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 用户组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 是否查询子节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryChildNodes 是否查询子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getQueryChildNodes() {
        return this.QueryChildNodes;
    }

    /**
     * Set 是否查询子节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryChildNodes 是否查询子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryChildNodes(Boolean QueryChildNodes) {
        this.QueryChildNodes = QueryChildNodes;
    }

    public UserGroupTreeNodeDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserGroupTreeNodeDTO(UserGroupTreeNodeDTO source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.QueryChildNodes != null) {
            this.QueryChildNodes = new Boolean(source.QueryChildNodes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "QueryChildNodes", this.QueryChildNodes);

    }
}

