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

public class CreateAssetResponse extends AbstractModel{

    /**
    * 生成包ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 生成包的全局唯一资源标识符
    */
    @SerializedName("AssetArn")
    @Expose
    private String AssetArn;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 生成包ID 
     * @return AssetId 生成包ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 生成包ID
     * @param AssetId 生成包ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 生成包的全局唯一资源标识符 
     * @return AssetArn 生成包的全局唯一资源标识符
     */
    public String getAssetArn() {
        return this.AssetArn;
    }

    /**
     * Set 生成包的全局唯一资源标识符
     * @param AssetArn 生成包的全局唯一资源标识符
     */
    public void setAssetArn(String AssetArn) {
        this.AssetArn = AssetArn;
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

    public CreateAssetResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetResponse(CreateAssetResponse source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetArn != null) {
            this.AssetArn = new String(source.AssetArn);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetArn", this.AssetArn);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

