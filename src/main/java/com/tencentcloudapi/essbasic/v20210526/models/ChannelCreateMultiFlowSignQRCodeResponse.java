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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreateMultiFlowSignQRCodeResponse extends AbstractModel {

    /**
    * <p>一码多签签署码的基本信息，用户可扫描该二维码进行签署操作。</p>
    */
    @SerializedName("QrCode")
    @Expose
    private SignQrCode QrCode;

    /**
    * <p>一码多签签署码链接信息，适用于客户系统整合二维码功能。通过链接，用户可直接访问电子签名小程序并签署合同。</p>
    */
    @SerializedName("SignUrls")
    @Expose
    private SignUrl SignUrls;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>一码多签签署码的基本信息，用户可扫描该二维码进行签署操作。</p> 
     * @return QrCode <p>一码多签签署码的基本信息，用户可扫描该二维码进行签署操作。</p>
     */
    public SignQrCode getQrCode() {
        return this.QrCode;
    }

    /**
     * Set <p>一码多签签署码的基本信息，用户可扫描该二维码进行签署操作。</p>
     * @param QrCode <p>一码多签签署码的基本信息，用户可扫描该二维码进行签署操作。</p>
     */
    public void setQrCode(SignQrCode QrCode) {
        this.QrCode = QrCode;
    }

    /**
     * Get <p>一码多签签署码链接信息，适用于客户系统整合二维码功能。通过链接，用户可直接访问电子签名小程序并签署合同。</p> 
     * @return SignUrls <p>一码多签签署码链接信息，适用于客户系统整合二维码功能。通过链接，用户可直接访问电子签名小程序并签署合同。</p>
     */
    public SignUrl getSignUrls() {
        return this.SignUrls;
    }

    /**
     * Set <p>一码多签签署码链接信息，适用于客户系统整合二维码功能。通过链接，用户可直接访问电子签名小程序并签署合同。</p>
     * @param SignUrls <p>一码多签签署码链接信息，适用于客户系统整合二维码功能。通过链接，用户可直接访问电子签名小程序并签署合同。</p>
     */
    public void setSignUrls(SignUrl SignUrls) {
        this.SignUrls = SignUrls;
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

    public ChannelCreateMultiFlowSignQRCodeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateMultiFlowSignQRCodeResponse(ChannelCreateMultiFlowSignQRCodeResponse source) {
        if (source.QrCode != null) {
            this.QrCode = new SignQrCode(source.QrCode);
        }
        if (source.SignUrls != null) {
            this.SignUrls = new SignUrl(source.SignUrls);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "QrCode.", this.QrCode);
        this.setParamObj(map, prefix + "SignUrls.", this.SignUrls);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

