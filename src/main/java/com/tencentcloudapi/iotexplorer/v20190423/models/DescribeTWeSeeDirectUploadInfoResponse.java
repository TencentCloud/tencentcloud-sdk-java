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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTWeSeeDirectUploadInfoResponse extends AbstractModel {

    /**
    * <p>TWeSee 直传目录的 COS URI</p>
    */
    @SerializedName("COSURI")
    @Expose
    private String COSURI;

    /**
    * <p>TWeSee 直传存储桶</p>
    */
    @SerializedName("StorageBucket")
    @Expose
    private String StorageBucket;

    /**
    * <p>TWeSee 直传目录路径</p>
    */
    @SerializedName("StoragePath")
    @Expose
    private String StoragePath;

    /**
    * <p>TWeSee 直传存储地域</p>
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>TWeSee 直传目录的 COS URI</p> 
     * @return COSURI <p>TWeSee 直传目录的 COS URI</p>
     */
    public String getCOSURI() {
        return this.COSURI;
    }

    /**
     * Set <p>TWeSee 直传目录的 COS URI</p>
     * @param COSURI <p>TWeSee 直传目录的 COS URI</p>
     */
    public void setCOSURI(String COSURI) {
        this.COSURI = COSURI;
    }

    /**
     * Get <p>TWeSee 直传存储桶</p> 
     * @return StorageBucket <p>TWeSee 直传存储桶</p>
     */
    public String getStorageBucket() {
        return this.StorageBucket;
    }

    /**
     * Set <p>TWeSee 直传存储桶</p>
     * @param StorageBucket <p>TWeSee 直传存储桶</p>
     */
    public void setStorageBucket(String StorageBucket) {
        this.StorageBucket = StorageBucket;
    }

    /**
     * Get <p>TWeSee 直传目录路径</p> 
     * @return StoragePath <p>TWeSee 直传目录路径</p>
     */
    public String getStoragePath() {
        return this.StoragePath;
    }

    /**
     * Set <p>TWeSee 直传目录路径</p>
     * @param StoragePath <p>TWeSee 直传目录路径</p>
     */
    public void setStoragePath(String StoragePath) {
        this.StoragePath = StoragePath;
    }

    /**
     * Get <p>TWeSee 直传存储地域</p> 
     * @return StorageRegion <p>TWeSee 直传存储地域</p>
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set <p>TWeSee 直传存储地域</p>
     * @param StorageRegion <p>TWeSee 直传存储地域</p>
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
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

    public DescribeTWeSeeDirectUploadInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTWeSeeDirectUploadInfoResponse(DescribeTWeSeeDirectUploadInfoResponse source) {
        if (source.COSURI != null) {
            this.COSURI = new String(source.COSURI);
        }
        if (source.StorageBucket != null) {
            this.StorageBucket = new String(source.StorageBucket);
        }
        if (source.StoragePath != null) {
            this.StoragePath = new String(source.StoragePath);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "COSURI", this.COSURI);
        this.setParamSimple(map, prefix + "StorageBucket", this.StorageBucket);
        this.setParamSimple(map, prefix + "StoragePath", this.StoragePath);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

