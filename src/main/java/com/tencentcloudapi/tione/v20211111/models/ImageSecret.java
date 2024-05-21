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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageSecret extends AbstractModel {

    /**
    * 用于加密密码的KMS公钥ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 密码,base64编码； 当keyId不为空时，密码是加密后的
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 用于加密密码的KMS公钥ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyId 用于加密密码的KMS公钥ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 用于加密密码的KMS公钥ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyId 用于加密密码的KMS公钥ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

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
     * Get 密码,base64编码； 当keyId不为空时，密码是加密后的
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password 密码,base64编码； 当keyId不为空时，密码是加密后的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码,base64编码； 当keyId不为空时，密码是加密后的
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password 密码,base64编码； 当keyId不为空时，密码是加密后的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ImageSecret() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSecret(ImageSecret source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
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
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

