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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomPromConfig extends AbstractModel {

    /**
    * Prometheus 访问地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 认证方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * 是否公网地址，缺省为 false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPublicAddr")
    @Expose
    private Boolean IsPublicAddr;

    /**
    * 虚拟网络id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Prometheus 用户名（用于 basic 认证方式）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Prometheus 密码（用于 basic 认证方式）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get Prometheus 访问地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url Prometheus 访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Prometheus 访问地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url Prometheus 访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 认证方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthType 认证方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 认证方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthType 认证方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 是否公网地址，缺省为 false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPublicAddr 是否公网地址，缺省为 false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPublicAddr() {
        return this.IsPublicAddr;
    }

    /**
     * Set 是否公网地址，缺省为 false
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPublicAddr 是否公网地址，缺省为 false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPublicAddr(Boolean IsPublicAddr) {
        this.IsPublicAddr = IsPublicAddr;
    }

    /**
     * Get 虚拟网络id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 虚拟网络id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 虚拟网络id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 虚拟网络id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Prometheus 用户名（用于 basic 认证方式）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Username Prometheus 用户名（用于 basic 认证方式）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Prometheus 用户名（用于 basic 认证方式）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Username Prometheus 用户名（用于 basic 认证方式）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Prometheus 密码（用于 basic 认证方式）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password Prometheus 密码（用于 basic 认证方式）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Prometheus 密码（用于 basic 认证方式）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password Prometheus 密码（用于 basic 认证方式）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public CustomPromConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomPromConfig(CustomPromConfig source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.IsPublicAddr != null) {
            this.IsPublicAddr = new Boolean(source.IsPublicAddr);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "IsPublicAddr", this.IsPublicAddr);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

