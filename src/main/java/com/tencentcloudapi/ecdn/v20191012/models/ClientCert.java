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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientCert extends AbstractModel{

    /**
    * 客户端证书，pem格式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Certificate")
    @Expose
    private String Certificate;

    /**
    * 客户端证书名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * 证书过期时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 证书颁发时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployTime")
    @Expose
    private String DeployTime;

    /**
     * Get 客户端证书，pem格式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Certificate 客户端证书，pem格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 客户端证书，pem格式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Certificate 客户端证书，pem格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificate(String Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get 客户端证书名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertName 客户端证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set 客户端证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertName 客户端证书名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get 证书过期时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 证书过期时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 证书过期时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 证书过期时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 证书颁发时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployTime 证书颁发时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeployTime() {
        return this.DeployTime;
    }

    /**
     * Set 证书颁发时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployTime 证书颁发时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployTime(String DeployTime) {
        this.DeployTime = DeployTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Certificate", this.Certificate);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "DeployTime", this.DeployTime);

    }
}

