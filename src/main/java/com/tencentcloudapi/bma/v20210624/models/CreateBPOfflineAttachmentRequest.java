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

public class CreateBPOfflineAttachmentRequest extends AbstractModel{

    /**
    * 品牌名字
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * 商标证明
    */
    @SerializedName("BrandCertificateName")
    @Expose
    private String BrandCertificateName;

    /**
    * 商标转让证明
    */
    @SerializedName("TransferName")
    @Expose
    private String TransferName;

    /**
    * 授权书
    */
    @SerializedName("AuthorizationName")
    @Expose
    private String AuthorizationName;

    /**
     * Get 品牌名字 
     * @return BrandName 品牌名字
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set 品牌名字
     * @param BrandName 品牌名字
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get 商标证明 
     * @return BrandCertificateName 商标证明
     */
    public String getBrandCertificateName() {
        return this.BrandCertificateName;
    }

    /**
     * Set 商标证明
     * @param BrandCertificateName 商标证明
     */
    public void setBrandCertificateName(String BrandCertificateName) {
        this.BrandCertificateName = BrandCertificateName;
    }

    /**
     * Get 商标转让证明 
     * @return TransferName 商标转让证明
     */
    public String getTransferName() {
        return this.TransferName;
    }

    /**
     * Set 商标转让证明
     * @param TransferName 商标转让证明
     */
    public void setTransferName(String TransferName) {
        this.TransferName = TransferName;
    }

    /**
     * Get 授权书 
     * @return AuthorizationName 授权书
     */
    public String getAuthorizationName() {
        return this.AuthorizationName;
    }

    /**
     * Set 授权书
     * @param AuthorizationName 授权书
     */
    public void setAuthorizationName(String AuthorizationName) {
        this.AuthorizationName = AuthorizationName;
    }

    public CreateBPOfflineAttachmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBPOfflineAttachmentRequest(CreateBPOfflineAttachmentRequest source) {
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.BrandCertificateName != null) {
            this.BrandCertificateName = new String(source.BrandCertificateName);
        }
        if (source.TransferName != null) {
            this.TransferName = new String(source.TransferName);
        }
        if (source.AuthorizationName != null) {
            this.AuthorizationName = new String(source.AuthorizationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "BrandCertificateName", this.BrandCertificateName);
        this.setParamSimple(map, prefix + "TransferName", this.TransferName);
        this.setParamSimple(map, prefix + "AuthorizationName", this.AuthorizationName);

    }
}

