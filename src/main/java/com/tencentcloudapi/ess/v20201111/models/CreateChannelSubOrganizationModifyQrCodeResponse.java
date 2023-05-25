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

public class CreateChannelSubOrganizationModifyQrCodeResponse extends AbstractModel{

    /**
    * 二维码下载链接
    */
    @SerializedName("QrCodeUrl")
    @Expose
    private String QrCodeUrl;

    /**
    * 二维码失效时间 UNIX 时间戳 精确到秒
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 二维码下载链接 
     * @return QrCodeUrl 二维码下载链接
     */
    public String getQrCodeUrl() {
        return this.QrCodeUrl;
    }

    /**
     * Set 二维码下载链接
     * @param QrCodeUrl 二维码下载链接
     */
    public void setQrCodeUrl(String QrCodeUrl) {
        this.QrCodeUrl = QrCodeUrl;
    }

    /**
     * Get 二维码失效时间 UNIX 时间戳 精确到秒 
     * @return ExpiredTime 二维码失效时间 UNIX 时间戳 精确到秒
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 二维码失效时间 UNIX 时间戳 精确到秒
     * @param ExpiredTime 二维码失效时间 UNIX 时间戳 精确到秒
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
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

    public CreateChannelSubOrganizationModifyQrCodeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateChannelSubOrganizationModifyQrCodeResponse(CreateChannelSubOrganizationModifyQrCodeResponse source) {
        if (source.QrCodeUrl != null) {
            this.QrCodeUrl = new String(source.QrCodeUrl);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QrCodeUrl", this.QrCodeUrl);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

