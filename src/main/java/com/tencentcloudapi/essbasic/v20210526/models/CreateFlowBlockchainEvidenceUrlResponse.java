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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowBlockchainEvidenceUrlResponse extends AbstractModel {

    /**
    * 二维码图片下载链接，下载链接有效时间5分钟，请尽快下载保存。
    */
    @SerializedName("QrCode")
    @Expose
    private String QrCode;

    /**
    * 查看短链，可直接点击短链查看证书。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 二维码和短链的过期时间戳，过期时间默认为生成链接后7天。
    */
    @SerializedName("ExpiredOn")
    @Expose
    private Long ExpiredOn;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 二维码图片下载链接，下载链接有效时间5分钟，请尽快下载保存。 
     * @return QrCode 二维码图片下载链接，下载链接有效时间5分钟，请尽快下载保存。
     */
    public String getQrCode() {
        return this.QrCode;
    }

    /**
     * Set 二维码图片下载链接，下载链接有效时间5分钟，请尽快下载保存。
     * @param QrCode 二维码图片下载链接，下载链接有效时间5分钟，请尽快下载保存。
     */
    public void setQrCode(String QrCode) {
        this.QrCode = QrCode;
    }

    /**
     * Get 查看短链，可直接点击短链查看证书。 
     * @return Url 查看短链，可直接点击短链查看证书。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 查看短链，可直接点击短链查看证书。
     * @param Url 查看短链，可直接点击短链查看证书。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 二维码和短链的过期时间戳，过期时间默认为生成链接后7天。 
     * @return ExpiredOn 二维码和短链的过期时间戳，过期时间默认为生成链接后7天。
     */
    public Long getExpiredOn() {
        return this.ExpiredOn;
    }

    /**
     * Set 二维码和短链的过期时间戳，过期时间默认为生成链接后7天。
     * @param ExpiredOn 二维码和短链的过期时间戳，过期时间默认为生成链接后7天。
     */
    public void setExpiredOn(Long ExpiredOn) {
        this.ExpiredOn = ExpiredOn;
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

    public CreateFlowBlockchainEvidenceUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowBlockchainEvidenceUrlResponse(CreateFlowBlockchainEvidenceUrlResponse source) {
        if (source.QrCode != null) {
            this.QrCode = new String(source.QrCode);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ExpiredOn != null) {
            this.ExpiredOn = new Long(source.ExpiredOn);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QrCode", this.QrCode);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ExpiredOn", this.ExpiredOn);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

