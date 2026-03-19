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

public class CreateDigitalDataSignResponse extends AbstractModel {

    /**
    * 加签签名值
    */
    @SerializedName("SignValue")
    @Expose
    private String SignValue;

    /**
    * 加签时间戳
    */
    @SerializedName("SignTimestamp")
    @Expose
    private String SignTimestamp;

    /**
    * 签署证书信息
    */
    @SerializedName("Certificate")
    @Expose
    private SignCertificate Certificate;

    /**
    * 签署算法
    */
    @SerializedName("SignAlgorithm")
    @Expose
    private String SignAlgorithm;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 加签签名值 
     * @return SignValue 加签签名值
     */
    public String getSignValue() {
        return this.SignValue;
    }

    /**
     * Set 加签签名值
     * @param SignValue 加签签名值
     */
    public void setSignValue(String SignValue) {
        this.SignValue = SignValue;
    }

    /**
     * Get 加签时间戳 
     * @return SignTimestamp 加签时间戳
     */
    public String getSignTimestamp() {
        return this.SignTimestamp;
    }

    /**
     * Set 加签时间戳
     * @param SignTimestamp 加签时间戳
     */
    public void setSignTimestamp(String SignTimestamp) {
        this.SignTimestamp = SignTimestamp;
    }

    /**
     * Get 签署证书信息 
     * @return Certificate 签署证书信息
     */
    public SignCertificate getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 签署证书信息
     * @param Certificate 签署证书信息
     */
    public void setCertificate(SignCertificate Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get 签署算法 
     * @return SignAlgorithm 签署算法
     */
    public String getSignAlgorithm() {
        return this.SignAlgorithm;
    }

    /**
     * Set 签署算法
     * @param SignAlgorithm 签署算法
     */
    public void setSignAlgorithm(String SignAlgorithm) {
        this.SignAlgorithm = SignAlgorithm;
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

    public CreateDigitalDataSignResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDigitalDataSignResponse(CreateDigitalDataSignResponse source) {
        if (source.SignValue != null) {
            this.SignValue = new String(source.SignValue);
        }
        if (source.SignTimestamp != null) {
            this.SignTimestamp = new String(source.SignTimestamp);
        }
        if (source.Certificate != null) {
            this.Certificate = new SignCertificate(source.Certificate);
        }
        if (source.SignAlgorithm != null) {
            this.SignAlgorithm = new String(source.SignAlgorithm);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignValue", this.SignValue);
        this.setParamSimple(map, prefix + "SignTimestamp", this.SignTimestamp);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamSimple(map, prefix + "SignAlgorithm", this.SignAlgorithm);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

