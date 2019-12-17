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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateOutput extends AbstractModel{

    /**
    * 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * 服务端证书的 ID。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 客户端证书的 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertCaId")
    @Expose
    private String CertCaId;

    /**
     * Get 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证 
     * @return SSLMode 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证
     * @param SSLMode 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * Get 服务端证书的 ID。 
     * @return CertId 服务端证书的 ID。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 服务端证书的 ID。
     * @param CertId 服务端证书的 ID。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 客户端证书的 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertCaId 客户端证书的 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * Set 客户端证书的 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertCaId 客户端证书的 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertCaId", this.CertCaId);

    }
}

