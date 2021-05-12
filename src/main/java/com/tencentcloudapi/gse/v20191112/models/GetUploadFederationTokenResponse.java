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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetUploadFederationTokenResponse extends AbstractModel{

    /**
    * 临时证书的过期时间，Unix 时间戳，精确到秒
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 临时证书
    */
    @SerializedName("AssetCredentials")
    @Expose
    private AssetCredentials AssetCredentials;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 临时证书的过期时间，Unix 时间戳，精确到秒 
     * @return ExpiredTime 临时证书的过期时间，Unix 时间戳，精确到秒
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 临时证书的过期时间，Unix 时间戳，精确到秒
     * @param ExpiredTime 临时证书的过期时间，Unix 时间戳，精确到秒
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 临时证书 
     * @return AssetCredentials 临时证书
     */
    public AssetCredentials getAssetCredentials() {
        return this.AssetCredentials;
    }

    /**
     * Set 临时证书
     * @param AssetCredentials 临时证书
     */
    public void setAssetCredentials(AssetCredentials AssetCredentials) {
        this.AssetCredentials = AssetCredentials;
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

    public GetUploadFederationTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUploadFederationTokenResponse(GetUploadFederationTokenResponse source) {
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.AssetCredentials != null) {
            this.AssetCredentials = new AssetCredentials(source.AssetCredentials);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamObj(map, prefix + "AssetCredentials.", this.AssetCredentials);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

