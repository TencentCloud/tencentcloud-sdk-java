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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStorageRegionsResponse extends AbstractModel{

    /**
    * 存储地域信息列表。
    */
    @SerializedName("StorageRegionInfos")
    @Expose
    private StorageRegionInfo [] StorageRegionInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 存储地域信息列表。 
     * @return StorageRegionInfos 存储地域信息列表。
     */
    public StorageRegionInfo [] getStorageRegionInfos() {
        return this.StorageRegionInfos;
    }

    /**
     * Set 存储地域信息列表。
     * @param StorageRegionInfos 存储地域信息列表。
     */
    public void setStorageRegionInfos(StorageRegionInfo [] StorageRegionInfos) {
        this.StorageRegionInfos = StorageRegionInfos;
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

    public DescribeStorageRegionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStorageRegionsResponse(DescribeStorageRegionsResponse source) {
        if (source.StorageRegionInfos != null) {
            this.StorageRegionInfos = new StorageRegionInfo[source.StorageRegionInfos.length];
            for (int i = 0; i < source.StorageRegionInfos.length; i++) {
                this.StorageRegionInfos[i] = new StorageRegionInfo(source.StorageRegionInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "StorageRegionInfos.", this.StorageRegionInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

