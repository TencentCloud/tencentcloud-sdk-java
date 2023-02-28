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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHttpsPackagesResponse extends AbstractModel{

    /**
    * HTTPS请求包总个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * HTTPS请求包详情
    */
    @SerializedName("HttpsPackages")
    @Expose
    private HttpsPackage [] HttpsPackages;

    /**
    * 即将过期的HTTPS请求包个数（7天内）
    */
    @SerializedName("ExpiringCount")
    @Expose
    private Long ExpiringCount;

    /**
    * 有效HTTPS请求包个数
    */
    @SerializedName("EnabledCount")
    @Expose
    private Long EnabledCount;

    /**
    * 付费HTTPS请求包个数
    */
    @SerializedName("PaidCount")
    @Expose
    private Long PaidCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get HTTPS请求包总个数 
     * @return TotalCount HTTPS请求包总个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set HTTPS请求包总个数
     * @param TotalCount HTTPS请求包总个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get HTTPS请求包详情 
     * @return HttpsPackages HTTPS请求包详情
     */
    public HttpsPackage [] getHttpsPackages() {
        return this.HttpsPackages;
    }

    /**
     * Set HTTPS请求包详情
     * @param HttpsPackages HTTPS请求包详情
     */
    public void setHttpsPackages(HttpsPackage [] HttpsPackages) {
        this.HttpsPackages = HttpsPackages;
    }

    /**
     * Get 即将过期的HTTPS请求包个数（7天内） 
     * @return ExpiringCount 即将过期的HTTPS请求包个数（7天内）
     */
    public Long getExpiringCount() {
        return this.ExpiringCount;
    }

    /**
     * Set 即将过期的HTTPS请求包个数（7天内）
     * @param ExpiringCount 即将过期的HTTPS请求包个数（7天内）
     */
    public void setExpiringCount(Long ExpiringCount) {
        this.ExpiringCount = ExpiringCount;
    }

    /**
     * Get 有效HTTPS请求包个数 
     * @return EnabledCount 有效HTTPS请求包个数
     */
    public Long getEnabledCount() {
        return this.EnabledCount;
    }

    /**
     * Set 有效HTTPS请求包个数
     * @param EnabledCount 有效HTTPS请求包个数
     */
    public void setEnabledCount(Long EnabledCount) {
        this.EnabledCount = EnabledCount;
    }

    /**
     * Get 付费HTTPS请求包个数 
     * @return PaidCount 付费HTTPS请求包个数
     */
    public Long getPaidCount() {
        return this.PaidCount;
    }

    /**
     * Set 付费HTTPS请求包个数
     * @param PaidCount 付费HTTPS请求包个数
     */
    public void setPaidCount(Long PaidCount) {
        this.PaidCount = PaidCount;
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

    public DescribeHttpsPackagesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHttpsPackagesResponse(DescribeHttpsPackagesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.HttpsPackages != null) {
            this.HttpsPackages = new HttpsPackage[source.HttpsPackages.length];
            for (int i = 0; i < source.HttpsPackages.length; i++) {
                this.HttpsPackages[i] = new HttpsPackage(source.HttpsPackages[i]);
            }
        }
        if (source.ExpiringCount != null) {
            this.ExpiringCount = new Long(source.ExpiringCount);
        }
        if (source.EnabledCount != null) {
            this.EnabledCount = new Long(source.EnabledCount);
        }
        if (source.PaidCount != null) {
            this.PaidCount = new Long(source.PaidCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "HttpsPackages.", this.HttpsPackages);
        this.setParamSimple(map, prefix + "ExpiringCount", this.ExpiringCount);
        this.setParamSimple(map, prefix + "EnabledCount", this.EnabledCount);
        this.setParamSimple(map, prefix + "PaidCount", this.PaidCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

