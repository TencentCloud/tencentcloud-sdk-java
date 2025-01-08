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
package com.tencentcloudapi.cloudapp.v20220530.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyLicenseResponse extends AbstractModel {

    /**
    * 软件的详细授权信息。
    */
    @SerializedName("License")
    @Expose
    private License License;

    /**
    * 当前请求服务端的时间戳，格式为RFC3339
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 对License字段对应的json数据的签名
    */
    @SerializedName("Signature")
    @Expose
    private String Signature;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 软件的详细授权信息。 
     * @return License 软件的详细授权信息。
     */
    public License getLicense() {
        return this.License;
    }

    /**
     * Set 软件的详细授权信息。
     * @param License 软件的详细授权信息。
     */
    public void setLicense(License License) {
        this.License = License;
    }

    /**
     * Get 当前请求服务端的时间戳，格式为RFC3339 
     * @return Timestamp 当前请求服务端的时间戳，格式为RFC3339
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 当前请求服务端的时间戳，格式为RFC3339
     * @param Timestamp 当前请求服务端的时间戳，格式为RFC3339
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 对License字段对应的json数据的签名 
     * @return Signature 对License字段对应的json数据的签名
     */
    public String getSignature() {
        return this.Signature;
    }

    /**
     * Set 对License字段对应的json数据的签名
     * @param Signature 对License字段对应的json数据的签名
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
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

    public VerifyLicenseResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyLicenseResponse(VerifyLicenseResponse source) {
        if (source.License != null) {
            this.License = new License(source.License);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.Signature != null) {
            this.Signature = new String(source.Signature);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "License.", this.License);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Signature", this.Signature);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

