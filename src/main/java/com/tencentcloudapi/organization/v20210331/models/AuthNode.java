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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthNode extends AbstractModel{

    /**
    * 互信主体关系ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelationId")
    @Expose
    private Long RelationId;

    /**
    * 互信主体名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthName")
    @Expose
    private String AuthName;

    /**
    * 主体管理员
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Manager")
    @Expose
    private MemberMainInfo Manager;

    /**
     * Get 互信主体关系ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelationId 互信主体关系ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRelationId() {
        return this.RelationId;
    }

    /**
     * Set 互信主体关系ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelationId 互信主体关系ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelationId(Long RelationId) {
        this.RelationId = RelationId;
    }

    /**
     * Get 互信主体名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthName 互信主体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthName() {
        return this.AuthName;
    }

    /**
     * Set 互信主体名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthName 互信主体名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthName(String AuthName) {
        this.AuthName = AuthName;
    }

    /**
     * Get 主体管理员
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Manager 主体管理员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MemberMainInfo getManager() {
        return this.Manager;
    }

    /**
     * Set 主体管理员
注意：此字段可能返回 null，表示取不到有效值。
     * @param Manager 主体管理员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManager(MemberMainInfo Manager) {
        this.Manager = Manager;
    }

    public AuthNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthNode(AuthNode source) {
        if (source.RelationId != null) {
            this.RelationId = new Long(source.RelationId);
        }
        if (source.AuthName != null) {
            this.AuthName = new String(source.AuthName);
        }
        if (source.Manager != null) {
            this.Manager = new MemberMainInfo(source.Manager);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RelationId", this.RelationId);
        this.setParamSimple(map, prefix + "AuthName", this.AuthName);
        this.setParamObj(map, prefix + "Manager.", this.Manager);

    }
}

