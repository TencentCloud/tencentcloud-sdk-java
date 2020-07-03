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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificatesResponse extends AbstractModel{

    /**
    * 服务器证书列表，包括证书ID 和证书名称。
    */
    @SerializedName("CertificateSet")
    @Expose
    private Certificate [] CertificateSet;

    /**
    * 满足查询条件的服务器证书总数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 服务器证书列表，包括证书ID 和证书名称。 
     * @return CertificateSet 服务器证书列表，包括证书ID 和证书名称。
     */
    public Certificate [] getCertificateSet() {
        return this.CertificateSet;
    }

    /**
     * Set 服务器证书列表，包括证书ID 和证书名称。
     * @param CertificateSet 服务器证书列表，包括证书ID 和证书名称。
     */
    public void setCertificateSet(Certificate [] CertificateSet) {
        this.CertificateSet = CertificateSet;
    }

    /**
     * Get 满足查询条件的服务器证书总数量。 
     * @return TotalCount 满足查询条件的服务器证书总数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 满足查询条件的服务器证书总数量。
     * @param TotalCount 满足查询条件的服务器证书总数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CertificateSet.", this.CertificateSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

