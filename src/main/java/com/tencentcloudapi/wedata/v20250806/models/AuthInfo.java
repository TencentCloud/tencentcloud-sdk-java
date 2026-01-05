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

public class AuthInfo extends AbstractModel {

    /**
    * 授权给的目标项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthProjectIds")
    @Expose
    private String [] AuthProjectIds;

    /**
    * 授权给的项目下用户列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthUsers")
    @Expose
    private String [] AuthUsers;

    /**
     * Get 授权给的目标项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthProjectIds 授权给的目标项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAuthProjectIds() {
        return this.AuthProjectIds;
    }

    /**
     * Set 授权给的目标项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthProjectIds 授权给的目标项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthProjectIds(String [] AuthProjectIds) {
        this.AuthProjectIds = AuthProjectIds;
    }

    /**
     * Get 授权给的项目下用户列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthUsers 授权给的项目下用户列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAuthUsers() {
        return this.AuthUsers;
    }

    /**
     * Set 授权给的项目下用户列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthUsers 授权给的项目下用户列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthUsers(String [] AuthUsers) {
        this.AuthUsers = AuthUsers;
    }

    public AuthInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthInfo(AuthInfo source) {
        if (source.AuthProjectIds != null) {
            this.AuthProjectIds = new String[source.AuthProjectIds.length];
            for (int i = 0; i < source.AuthProjectIds.length; i++) {
                this.AuthProjectIds[i] = new String(source.AuthProjectIds[i]);
            }
        }
        if (source.AuthUsers != null) {
            this.AuthUsers = new String[source.AuthUsers.length];
            for (int i = 0; i < source.AuthUsers.length; i++) {
                this.AuthUsers[i] = new String(source.AuthUsers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AuthProjectIds.", this.AuthProjectIds);
        this.setParamArraySimple(map, prefix + "AuthUsers.", this.AuthUsers);

    }
}

