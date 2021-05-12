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

public class GetUploadCredentialsResponse extends AbstractModel{

    /**
    * 上传文件授权信息Auth
    */
    @SerializedName("BucketAuth")
    @Expose
    private String BucketAuth;

    /**
    * Bucket名字
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 生成包所在地域
    */
    @SerializedName("AssetRegion")
    @Expose
    private String AssetRegion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 上传文件授权信息Auth 
     * @return BucketAuth 上传文件授权信息Auth
     */
    public String getBucketAuth() {
        return this.BucketAuth;
    }

    /**
     * Set 上传文件授权信息Auth
     * @param BucketAuth 上传文件授权信息Auth
     */
    public void setBucketAuth(String BucketAuth) {
        this.BucketAuth = BucketAuth;
    }

    /**
     * Get Bucket名字 
     * @return BucketName Bucket名字
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Bucket名字
     * @param BucketName Bucket名字
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 生成包所在地域 
     * @return AssetRegion 生成包所在地域
     */
    public String getAssetRegion() {
        return this.AssetRegion;
    }

    /**
     * Set 生成包所在地域
     * @param AssetRegion 生成包所在地域
     */
    public void setAssetRegion(String AssetRegion) {
        this.AssetRegion = AssetRegion;
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

    public GetUploadCredentialsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUploadCredentialsResponse(GetUploadCredentialsResponse source) {
        if (source.BucketAuth != null) {
            this.BucketAuth = new String(source.BucketAuth);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.AssetRegion != null) {
            this.AssetRegion = new String(source.AssetRegion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketAuth", this.BucketAuth);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "AssetRegion", this.AssetRegion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

