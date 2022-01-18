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

public class MemberIdentity extends AbstractModel{

    /**
    * 身份ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
    * 身份名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentityAliasName")
    @Expose
    private String IdentityAliasName;

    /**
     * Get 身份ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentityId 身份ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set 身份ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentityId 身份ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentityId(Long IdentityId) {
        this.IdentityId = IdentityId;
    }

    /**
     * Get 身份名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentityAliasName 身份名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentityAliasName() {
        return this.IdentityAliasName;
    }

    /**
     * Set 身份名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentityAliasName 身份名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentityAliasName(String IdentityAliasName) {
        this.IdentityAliasName = IdentityAliasName;
    }

    public MemberIdentity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemberIdentity(MemberIdentity source) {
        if (source.IdentityId != null) {
            this.IdentityId = new Long(source.IdentityId);
        }
        if (source.IdentityAliasName != null) {
            this.IdentityAliasName = new String(source.IdentityAliasName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "IdentityAliasName", this.IdentityAliasName);

    }
}

