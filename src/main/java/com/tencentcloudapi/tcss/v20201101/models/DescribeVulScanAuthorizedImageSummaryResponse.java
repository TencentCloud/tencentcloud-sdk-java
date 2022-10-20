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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulScanAuthorizedImageSummaryResponse extends AbstractModel{

    /**
    * 全部已授权的本地镜像数
    */
    @SerializedName("AllAuthorizedImageCount")
    @Expose
    private Long AllAuthorizedImageCount;

    /**
    * 已授权未扫描的本地镜像数
    */
    @SerializedName("UnScanAuthorizedImageCount")
    @Expose
    private Long UnScanAuthorizedImageCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 全部已授权的本地镜像数 
     * @return AllAuthorizedImageCount 全部已授权的本地镜像数
     */
    public Long getAllAuthorizedImageCount() {
        return this.AllAuthorizedImageCount;
    }

    /**
     * Set 全部已授权的本地镜像数
     * @param AllAuthorizedImageCount 全部已授权的本地镜像数
     */
    public void setAllAuthorizedImageCount(Long AllAuthorizedImageCount) {
        this.AllAuthorizedImageCount = AllAuthorizedImageCount;
    }

    /**
     * Get 已授权未扫描的本地镜像数 
     * @return UnScanAuthorizedImageCount 已授权未扫描的本地镜像数
     */
    public Long getUnScanAuthorizedImageCount() {
        return this.UnScanAuthorizedImageCount;
    }

    /**
     * Set 已授权未扫描的本地镜像数
     * @param UnScanAuthorizedImageCount 已授权未扫描的本地镜像数
     */
    public void setUnScanAuthorizedImageCount(Long UnScanAuthorizedImageCount) {
        this.UnScanAuthorizedImageCount = UnScanAuthorizedImageCount;
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

    public DescribeVulScanAuthorizedImageSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulScanAuthorizedImageSummaryResponse(DescribeVulScanAuthorizedImageSummaryResponse source) {
        if (source.AllAuthorizedImageCount != null) {
            this.AllAuthorizedImageCount = new Long(source.AllAuthorizedImageCount);
        }
        if (source.UnScanAuthorizedImageCount != null) {
            this.UnScanAuthorizedImageCount = new Long(source.UnScanAuthorizedImageCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllAuthorizedImageCount", this.AllAuthorizedImageCount);
        this.setParamSimple(map, prefix + "UnScanAuthorizedImageCount", this.UnScanAuthorizedImageCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

