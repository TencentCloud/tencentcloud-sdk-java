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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBPOfflineAttachmentRequest extends AbstractModel{

    /**
    * xx
    */
    @SerializedName("LicenseName")
    @Expose
    private String LicenseName;

    /**
    * xx
    */
    @SerializedName("AuthorizationName")
    @Expose
    private String AuthorizationName;

    /**
    * xx
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * xx
    */
    @SerializedName("BrandCertificateName")
    @Expose
    private String BrandCertificateName;

    /**
    * xx
    */
    @SerializedName("TransferName")
    @Expose
    private String TransferName;

    /**
     * Get xx 
     * @return LicenseName xx
     */
    public String getLicenseName() {
        return this.LicenseName;
    }

    /**
     * Set xx
     * @param LicenseName xx
     */
    public void setLicenseName(String LicenseName) {
        this.LicenseName = LicenseName;
    }

    /**
     * Get xx 
     * @return AuthorizationName xx
     */
    public String getAuthorizationName() {
        return this.AuthorizationName;
    }

    /**
     * Set xx
     * @param AuthorizationName xx
     */
    public void setAuthorizationName(String AuthorizationName) {
        this.AuthorizationName = AuthorizationName;
    }

    /**
     * Get xx 
     * @return BrandName xx
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set xx
     * @param BrandName xx
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get xx 
     * @return BrandCertificateName xx
     */
    public String getBrandCertificateName() {
        return this.BrandCertificateName;
    }

    /**
     * Set xx
     * @param BrandCertificateName xx
     */
    public void setBrandCertificateName(String BrandCertificateName) {
        this.BrandCertificateName = BrandCertificateName;
    }

    /**
     * Get xx 
     * @return TransferName xx
     */
    public String getTransferName() {
        return this.TransferName;
    }

    /**
     * Set xx
     * @param TransferName xx
     */
    public void setTransferName(String TransferName) {
        this.TransferName = TransferName;
    }

    public ModifyBPOfflineAttachmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBPOfflineAttachmentRequest(ModifyBPOfflineAttachmentRequest source) {
        if (source.LicenseName != null) {
            this.LicenseName = new String(source.LicenseName);
        }
        if (source.AuthorizationName != null) {
            this.AuthorizationName = new String(source.AuthorizationName);
        }
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.BrandCertificateName != null) {
            this.BrandCertificateName = new String(source.BrandCertificateName);
        }
        if (source.TransferName != null) {
            this.TransferName = new String(source.TransferName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseName", this.LicenseName);
        this.setParamSimple(map, prefix + "AuthorizationName", this.AuthorizationName);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "BrandCertificateName", this.BrandCertificateName);
        this.setParamSimple(map, prefix + "TransferName", this.TransferName);

    }
}

