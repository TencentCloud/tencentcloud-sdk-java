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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerCert extends AbstractModel{

    /**
    * 服务器证书 ID
在 SSL 证书管理进行证书托管时自动生成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 服务器证书名称
在 SSL 证书管理进行证书托管时自动生成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * 服务器证书信息
上传自有证书时必填，需要包含完整的证书链
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Certificate")
    @Expose
    private String Certificate;

    /**
    * 服务器密钥信息
上传自有证书时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * 证书过期时间
作为入参配置时无需填充
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 证书颁发时间
作为入参配置时无需填充
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployTime")
    @Expose
    private String DeployTime;

    /**
    * 证书备注信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 服务器证书 ID
在 SSL 证书管理进行证书托管时自动生成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertId 服务器证书 ID
在 SSL 证书管理进行证书托管时自动生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 服务器证书 ID
在 SSL 证书管理进行证书托管时自动生成
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertId 服务器证书 ID
在 SSL 证书管理进行证书托管时自动生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 服务器证书名称
在 SSL 证书管理进行证书托管时自动生成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertName 服务器证书名称
在 SSL 证书管理进行证书托管时自动生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set 服务器证书名称
在 SSL 证书管理进行证书托管时自动生成
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertName 服务器证书名称
在 SSL 证书管理进行证书托管时自动生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get 服务器证书信息
上传自有证书时必填，需要包含完整的证书链
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Certificate 服务器证书信息
上传自有证书时必填，需要包含完整的证书链
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 服务器证书信息
上传自有证书时必填，需要包含完整的证书链
注意：此字段可能返回 null，表示取不到有效值。
     * @param Certificate 服务器证书信息
上传自有证书时必填，需要包含完整的证书链
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificate(String Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get 服务器密钥信息
上传自有证书时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateKey 服务器密钥信息
上传自有证书时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 服务器密钥信息
上传自有证书时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateKey 服务器密钥信息
上传自有证书时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get 证书过期时间
作为入参配置时无需填充
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 证书过期时间
作为入参配置时无需填充
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 证书过期时间
作为入参配置时无需填充
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 证书过期时间
作为入参配置时无需填充
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 证书颁发时间
作为入参配置时无需填充
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployTime 证书颁发时间
作为入参配置时无需填充
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeployTime() {
        return this.DeployTime;
    }

    /**
     * Set 证书颁发时间
作为入参配置时无需填充
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployTime 证书颁发时间
作为入参配置时无需填充
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployTime(String DeployTime) {
        this.DeployTime = DeployTime;
    }

    /**
     * Get 证书备注信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 证书备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 证书备注信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 证书备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "Certificate", this.Certificate);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "DeployTime", this.DeployTime);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

