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
package com.tencentcloudapi.cws.v20180312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSitesVerificationResponse extends AbstractModel {

    /**
    * 验证信息数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 验证信息列表。
    */
    @SerializedName("SitesVerification")
    @Expose
    private SitesVerification [] SitesVerification;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 验证信息数量。 
     * @return TotalCount 验证信息数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 验证信息数量。
     * @param TotalCount 验证信息数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 验证信息列表。 
     * @return SitesVerification 验证信息列表。
     */
    public SitesVerification [] getSitesVerification() {
        return this.SitesVerification;
    }

    /**
     * Set 验证信息列表。
     * @param SitesVerification 验证信息列表。
     */
    public void setSitesVerification(SitesVerification [] SitesVerification) {
        this.SitesVerification = SitesVerification;
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

    public DescribeSitesVerificationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSitesVerificationResponse(DescribeSitesVerificationResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SitesVerification != null) {
            this.SitesVerification = new SitesVerification[source.SitesVerification.length];
            for (int i = 0; i < source.SitesVerification.length; i++) {
                this.SitesVerification[i] = new SitesVerification(source.SitesVerification[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "SitesVerification.", this.SitesVerification);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

