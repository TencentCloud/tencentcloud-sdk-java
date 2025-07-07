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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddExternalSAMLIdPCertificateRequest extends AbstractModel {

    /**
    * 空间ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * PEM 格式的 X509 证书。  由 SAML 身份提供商提供。
    */
    @SerializedName("X509Certificate")
    @Expose
    private String X509Certificate;

    /**
     * Get 空间ID。 
     * @return ZoneId 空间ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间ID。
     * @param ZoneId 空间ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get PEM 格式的 X509 证书。  由 SAML 身份提供商提供。 
     * @return X509Certificate PEM 格式的 X509 证书。  由 SAML 身份提供商提供。
     */
    public String getX509Certificate() {
        return this.X509Certificate;
    }

    /**
     * Set PEM 格式的 X509 证书。  由 SAML 身份提供商提供。
     * @param X509Certificate PEM 格式的 X509 证书。  由 SAML 身份提供商提供。
     */
    public void setX509Certificate(String X509Certificate) {
        this.X509Certificate = X509Certificate;
    }

    public AddExternalSAMLIdPCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddExternalSAMLIdPCertificateRequest(AddExternalSAMLIdPCertificateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.X509Certificate != null) {
            this.X509Certificate = new String(source.X509Certificate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "X509Certificate", this.X509Certificate);

    }
}

