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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthRoleInfo extends AbstractModel {

    /**
    * <p>Auth角色名称</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>Auth角色对应权限SecretId</p>
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * <p>Auth角色对应权限SecretKey</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
     * Get <p>Auth角色名称</p> 
     * @return RoleName <p>Auth角色名称</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>Auth角色名称</p>
     * @param RoleName <p>Auth角色名称</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>Auth角色对应权限SecretId</p> 
     * @return SecretId <p>Auth角色对应权限SecretId</p>
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set <p>Auth角色对应权限SecretId</p>
     * @param SecretId <p>Auth角色对应权限SecretId</p>
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get <p>Auth角色对应权限SecretKey</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretKey <p>Auth角色对应权限SecretKey</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>Auth角色对应权限SecretKey</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretKey <p>Auth角色对应权限SecretKey</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    public AuthRoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthRoleInfo(AuthRoleInfo source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);

    }
}

