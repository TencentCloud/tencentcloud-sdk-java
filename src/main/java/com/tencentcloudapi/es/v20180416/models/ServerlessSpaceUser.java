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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerlessSpaceUser extends AbstractModel {

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 用户密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 用户状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 有权限的索引数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndicesScope")
    @Expose
    private String [] IndicesScope;

    /**
    * 权限类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivilegeType")
    @Expose
    private Long PrivilegeType;

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Username 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Username 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 用户密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password 用户密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 用户密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password 用户密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 用户状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 用户状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 用户状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 用户状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 有权限的索引数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndicesScope 有权限的索引数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIndicesScope() {
        return this.IndicesScope;
    }

    /**
     * Set 有权限的索引数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndicesScope 有权限的索引数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndicesScope(String [] IndicesScope) {
        this.IndicesScope = IndicesScope;
    }

    /**
     * Get 权限类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivilegeType 权限类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPrivilegeType() {
        return this.PrivilegeType;
    }

    /**
     * Set 权限类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivilegeType 权限类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivilegeType(Long PrivilegeType) {
        this.PrivilegeType = PrivilegeType;
    }

    public ServerlessSpaceUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerlessSpaceUser(ServerlessSpaceUser source) {
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IndicesScope != null) {
            this.IndicesScope = new String[source.IndicesScope.length];
            for (int i = 0; i < source.IndicesScope.length; i++) {
                this.IndicesScope[i] = new String(source.IndicesScope[i]);
            }
        }
        if (source.PrivilegeType != null) {
            this.PrivilegeType = new Long(source.PrivilegeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "IndicesScope.", this.IndicesScope);
        this.setParamSimple(map, prefix + "PrivilegeType", this.PrivilegeType);

    }
}

