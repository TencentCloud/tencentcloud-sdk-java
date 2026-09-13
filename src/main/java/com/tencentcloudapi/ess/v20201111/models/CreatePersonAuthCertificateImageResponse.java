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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePersonAuthCertificateImageResponse extends AbstractModel {

    /**
    * <p>个人用户认证证书图片下载URL，<code>有效期为5分钟</code>，超过有效期后将无法再下载。</p>
    */
    @SerializedName("AuthCertUrl")
    @Expose
    private String AuthCertUrl;

    /**
    * <p>个人用户认证证书的编号, 为20位数字组成的字符串,  由腾讯电子签下发此编号 。<br>该编号会合成到个人用户证书证明图片。</p><p>注: <code>个人用户认证证书的编号和证明图片绑定, 获取新的证明图片编号会变动</code></p>
    */
    @SerializedName("ImageCertId")
    @Expose
    private String ImageCertId;

    /**
    * <p>在数字证书申请过程中，系统会自动生成一个独一无二的序列号。请注意，当证书到期并自动续期时，该序列号将会发生变化。值得注意的是，此序列号不会被合成至个人用户证书的证明图片中。</p>
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * <p>CA证书颁发时间，格式为Unix标准时间戳（秒）<br>该时间格式化后会合成到个人用户证书证明图片</p>
    */
    @SerializedName("ValidFrom")
    @Expose
    private Long ValidFrom;

    /**
    * <p>CA证书有效截止时间，格式为Unix标准时间戳（秒）<br>该时间格式化后会合成到个人用户证书证明图片</p>
    */
    @SerializedName("ValidTo")
    @Expose
    private Long ValidTo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>个人用户认证证书图片下载URL，<code>有效期为5分钟</code>，超过有效期后将无法再下载。</p> 
     * @return AuthCertUrl <p>个人用户认证证书图片下载URL，<code>有效期为5分钟</code>，超过有效期后将无法再下载。</p>
     */
    public String getAuthCertUrl() {
        return this.AuthCertUrl;
    }

    /**
     * Set <p>个人用户认证证书图片下载URL，<code>有效期为5分钟</code>，超过有效期后将无法再下载。</p>
     * @param AuthCertUrl <p>个人用户认证证书图片下载URL，<code>有效期为5分钟</code>，超过有效期后将无法再下载。</p>
     */
    public void setAuthCertUrl(String AuthCertUrl) {
        this.AuthCertUrl = AuthCertUrl;
    }

    /**
     * Get <p>个人用户认证证书的编号, 为20位数字组成的字符串,  由腾讯电子签下发此编号 。<br>该编号会合成到个人用户证书证明图片。</p><p>注: <code>个人用户认证证书的编号和证明图片绑定, 获取新的证明图片编号会变动</code></p> 
     * @return ImageCertId <p>个人用户认证证书的编号, 为20位数字组成的字符串,  由腾讯电子签下发此编号 。<br>该编号会合成到个人用户证书证明图片。</p><p>注: <code>个人用户认证证书的编号和证明图片绑定, 获取新的证明图片编号会变动</code></p>
     */
    public String getImageCertId() {
        return this.ImageCertId;
    }

    /**
     * Set <p>个人用户认证证书的编号, 为20位数字组成的字符串,  由腾讯电子签下发此编号 。<br>该编号会合成到个人用户证书证明图片。</p><p>注: <code>个人用户认证证书的编号和证明图片绑定, 获取新的证明图片编号会变动</code></p>
     * @param ImageCertId <p>个人用户认证证书的编号, 为20位数字组成的字符串,  由腾讯电子签下发此编号 。<br>该编号会合成到个人用户证书证明图片。</p><p>注: <code>个人用户认证证书的编号和证明图片绑定, 获取新的证明图片编号会变动</code></p>
     */
    public void setImageCertId(String ImageCertId) {
        this.ImageCertId = ImageCertId;
    }

    /**
     * Get <p>在数字证书申请过程中，系统会自动生成一个独一无二的序列号。请注意，当证书到期并自动续期时，该序列号将会发生变化。值得注意的是，此序列号不会被合成至个人用户证书的证明图片中。</p> 
     * @return SerialNumber <p>在数字证书申请过程中，系统会自动生成一个独一无二的序列号。请注意，当证书到期并自动续期时，该序列号将会发生变化。值得注意的是，此序列号不会被合成至个人用户证书的证明图片中。</p>
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set <p>在数字证书申请过程中，系统会自动生成一个独一无二的序列号。请注意，当证书到期并自动续期时，该序列号将会发生变化。值得注意的是，此序列号不会被合成至个人用户证书的证明图片中。</p>
     * @param SerialNumber <p>在数字证书申请过程中，系统会自动生成一个独一无二的序列号。请注意，当证书到期并自动续期时，该序列号将会发生变化。值得注意的是，此序列号不会被合成至个人用户证书的证明图片中。</p>
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get <p>CA证书颁发时间，格式为Unix标准时间戳（秒）<br>该时间格式化后会合成到个人用户证书证明图片</p> 
     * @return ValidFrom <p>CA证书颁发时间，格式为Unix标准时间戳（秒）<br>该时间格式化后会合成到个人用户证书证明图片</p>
     */
    public Long getValidFrom() {
        return this.ValidFrom;
    }

    /**
     * Set <p>CA证书颁发时间，格式为Unix标准时间戳（秒）<br>该时间格式化后会合成到个人用户证书证明图片</p>
     * @param ValidFrom <p>CA证书颁发时间，格式为Unix标准时间戳（秒）<br>该时间格式化后会合成到个人用户证书证明图片</p>
     */
    public void setValidFrom(Long ValidFrom) {
        this.ValidFrom = ValidFrom;
    }

    /**
     * Get <p>CA证书有效截止时间，格式为Unix标准时间戳（秒）<br>该时间格式化后会合成到个人用户证书证明图片</p> 
     * @return ValidTo <p>CA证书有效截止时间，格式为Unix标准时间戳（秒）<br>该时间格式化后会合成到个人用户证书证明图片</p>
     */
    public Long getValidTo() {
        return this.ValidTo;
    }

    /**
     * Set <p>CA证书有效截止时间，格式为Unix标准时间戳（秒）<br>该时间格式化后会合成到个人用户证书证明图片</p>
     * @param ValidTo <p>CA证书有效截止时间，格式为Unix标准时间戳（秒）<br>该时间格式化后会合成到个人用户证书证明图片</p>
     */
    public void setValidTo(Long ValidTo) {
        this.ValidTo = ValidTo;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
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

