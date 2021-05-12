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

public class GetUploadCredentialsRequest extends AbstractModel{

    /**
    * 生成包所在地域，详见产品支持的 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
    */
    @SerializedName("AssetRegion")
    @Expose
    private String AssetRegion;

    /**
    * 生成包的ZIP包名，例如：server.zip
    */
    @SerializedName("BucketKey")
    @Expose
    private String BucketKey;

    /**
     * Get 生成包所在地域，详见产品支持的 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8) 
     * @return AssetRegion 生成包所在地域，详见产品支持的 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
     */
    public String getAssetRegion() {
        return this.AssetRegion;
    }

    /**
     * Set 生成包所在地域，详见产品支持的 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
     * @param AssetRegion 生成包所在地域，详见产品支持的 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
     */
    public void setAssetRegion(String AssetRegion) {
        this.AssetRegion = AssetRegion;
    }

    /**
     * Get 生成包的ZIP包名，例如：server.zip 
     * @return BucketKey 生成包的ZIP包名，例如：server.zip
     */
    public String getBucketKey() {
        return this.BucketKey;
    }

    /**
     * Set 生成包的ZIP包名，例如：server.zip
     * @param BucketKey 生成包的ZIP包名，例如：server.zip
     */
    public void setBucketKey(String BucketKey) {
        this.BucketKey = BucketKey;
    }

    public GetUploadCredentialsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUploadCredentialsRequest(GetUploadCredentialsRequest source) {
        if (source.AssetRegion != null) {
            this.AssetRegion = new String(source.AssetRegion);
        }
        if (source.BucketKey != null) {
            this.BucketKey = new String(source.BucketKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetRegion", this.AssetRegion);
        this.setParamSimple(map, prefix + "BucketKey", this.BucketKey);

    }
}

