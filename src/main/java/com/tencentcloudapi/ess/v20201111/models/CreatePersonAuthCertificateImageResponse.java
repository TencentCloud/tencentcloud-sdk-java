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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePersonAuthCertificateImageResponse extends AbstractModel{

    /**
    * 个人用户证明证书的下载链接
    */
    @SerializedName("AuthCertUrl")
    @Expose
    private String AuthCertUrl;

    /**
    * 证书图片上的证书编号，20位数字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageCertId")
    @Expose
    private String ImageCertId;

    /**
    * 图片证明对应的CA证书序列号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * CA证书颁发时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidFrom")
    @Expose
    private Long ValidFrom;

    /**
    * CA证书有效截止时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidTo")
    @Expose
    private Long ValidTo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 个人用户证明证书的下载链接 
     * @return AuthCertUrl 个人用户证明证书的下载链接
     */
    public String getAuthCertUrl() {
        return this.AuthCertUrl;
    }

    /**
     * Set 个人用户证明证书的下载链接
     * @param AuthCertUrl 个人用户证明证书的下载链接
     */
    public void setAuthCertUrl(String AuthCertUrl) {
        this.AuthCertUrl = AuthCertUrl;
    }

    /**
     * Get 证书图片上的证书编号，20位数字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageCertId 证书图片上的证书编号，20位数字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageCertId() {
        return this.ImageCertId;
    }

    /**
     * Set 证书图片上的证书编号，20位数字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageCertId 证书图片上的证书编号，20位数字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageCertId(String ImageCertId) {
        this.ImageCertId = ImageCertId;
    }

    /**
     * Get 图片证明对应的CA证书序列号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialNumber 图片证明对应的CA证书序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 图片证明对应的CA证书序列号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialNumber 图片证明对应的CA证书序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get CA证书颁发时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidFrom CA证书颁发时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getValidFrom() {
        return this.ValidFrom;
    }

    /**
     * Set CA证书颁发时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidFrom CA证书颁发时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidFrom(Long ValidFrom) {
        this.ValidFrom = ValidFrom;
    }

    /**
     * Get CA证书有效截止时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidTo CA证书有效截止时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getValidTo() {
        return this.ValidTo;
    }

    /**
     * Set CA证书有效截止时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidTo CA证书有效截止时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidTo(Long ValidTo) {
        this.ValidTo = ValidTo;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreatePersonAuthCertificateImageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePersonAuthCertificateImageResponse(CreatePersonAuthCertificateImageResponse source) {
        if (source.AuthCertUrl != null) {
            this.AuthCertUrl = new String(source.AuthCertUrl);
        }
        if (source.ImageCertId != null) {
            this.ImageCertId = new String(source.ImageCertId);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.ValidFrom != null) {
            this.ValidFrom = new Long(source.ValidFrom);
        }
        if (source.ValidTo != null) {
            this.ValidTo = new Long(source.ValidTo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthCertUrl", this.AuthCertUrl);
        this.setParamSimple(map, prefix + "ImageCertId", this.ImageCertId);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "ValidFrom", this.ValidFrom);
        this.setParamSimple(map, prefix + "ValidTo", this.ValidTo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

