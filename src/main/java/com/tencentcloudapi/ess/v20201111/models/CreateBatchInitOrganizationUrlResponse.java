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

public class CreateBatchInitOrganizationUrlResponse extends AbstractModel {

    /**
    * <p>小程序路径</p>
    */
    @SerializedName("MiniAppPath")
    @Expose
    private String MiniAppPath;

    /**
    * <p>操作长链</p>
    */
    @SerializedName("OperateLongUrl")
    @Expose
    private String OperateLongUrl;

    /**
    * <p>操作短链</p>
    */
    @SerializedName("OperateShortUrl")
    @Expose
    private String OperateShortUrl;

    /**
    * <p>操作二维码</p>
    */
    @SerializedName("QRCodeUrl")
    @Expose
    private String QRCodeUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>小程序路径</p> 
     * @return MiniAppPath <p>小程序路径</p>
     */
    public String getMiniAppPath() {
        return this.MiniAppPath;
    }

    /**
     * Set <p>小程序路径</p>
     * @param MiniAppPath <p>小程序路径</p>
     */
    public void setMiniAppPath(String MiniAppPath) {
        this.MiniAppPath = MiniAppPath;
    }

    /**
     * Get <p>操作长链</p> 
     * @return OperateLongUrl <p>操作长链</p>
     */
    public String getOperateLongUrl() {
        return this.OperateLongUrl;
    }

    /**
     * Set <p>操作长链</p>
     * @param OperateLongUrl <p>操作长链</p>
     */
    public void setOperateLongUrl(String OperateLongUrl) {
        this.OperateLongUrl = OperateLongUrl;
    }

    /**
     * Get <p>操作短链</p> 
     * @return OperateShortUrl <p>操作短链</p>
     */
    public String getOperateShortUrl() {
        return this.OperateShortUrl;
    }

    /**
     * Set <p>操作短链</p>
     * @param OperateShortUrl <p>操作短链</p>
     */
    public void setOperateShortUrl(String OperateShortUrl) {
        this.OperateShortUrl = OperateShortUrl;
    }

    /**
     * Get <p>操作二维码</p> 
     * @return QRCodeUrl <p>操作二维码</p>
     */
    public String getQRCodeUrl() {
        return this.QRCodeUrl;
    }

    /**
     * Set <p>操作二维码</p>
     * @param QRCodeUrl <p>操作二维码</p>
     */
    public void setQRCodeUrl(String QRCodeUrl) {
        this.QRCodeUrl = QRCodeUrl;
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

    public CreateBatchInitOrganizationUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchInitOrganizationUrlResponse(CreateBatchInitOrganizationUrlResponse source) {
        if (source.MiniAppPath != null) {
            this.MiniAppPath = new String(source.MiniAppPath);
        }
        if (source.OperateLongUrl != null) {
            this.OperateLongUrl = new String(source.OperateLongUrl);
        }
        if (source.OperateShortUrl != null) {
            this.OperateShortUrl = new String(source.OperateShortUrl);
        }
        if (source.QRCodeUrl != null) {
            this.QRCodeUrl = new String(source.QRCodeUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MiniAppPath", this.MiniAppPath);
        this.setParamSimple(map, prefix + "OperateLongUrl", this.OperateLongUrl);
        this.setParamSimple(map, prefix + "OperateShortUrl", this.OperateShortUrl);
        this.setParamSimple(map, prefix + "QRCodeUrl", this.QRCodeUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

