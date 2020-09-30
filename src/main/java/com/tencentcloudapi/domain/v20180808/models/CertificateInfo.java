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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateInfo extends AbstractModel{

    /**
    * 证件号码。
    */
    @SerializedName("CertificateCode")
    @Expose
    private String CertificateCode;

    /**
    * 证件类型。
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * 证件照片地址。
    */
    @SerializedName("ImgUrl")
    @Expose
    private String ImgUrl;

    /**
     * Get 证件号码。 
     * @return CertificateCode 证件号码。
     */
    public String getCertificateCode() {
        return this.CertificateCode;
    }

    /**
     * Set 证件号码。
     * @param CertificateCode 证件号码。
     */
    public void setCertificateCode(String CertificateCode) {
        this.CertificateCode = CertificateCode;
    }

    /**
     * Get 证件类型。 
     * @return CertificateType 证件类型。
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set 证件类型。
     * @param CertificateType 证件类型。
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get 证件照片地址。 
     * @return ImgUrl 证件照片地址。
     */
    public String getImgUrl() {
        return this.ImgUrl;
    }

    /**
     * Set 证件照片地址。
     * @param ImgUrl 证件照片地址。
     */
    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateCode", this.CertificateCode);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "ImgUrl", this.ImgUrl);

    }
}

