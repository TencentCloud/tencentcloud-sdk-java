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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCertificateResponse extends AbstractModel{

    /**
    * 证书ID列表
    */
    @SerializedName("CertificateIds")
    @Expose
    private String [] CertificateIds;

    /**
    * 子订单ID
    */
    @SerializedName("DealIds")
    @Expose
    private String [] DealIds;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 证书ID列表 
     * @return CertificateIds 证书ID列表
     */
    public String [] getCertificateIds() {
        return this.CertificateIds;
    }

    /**
     * Set 证书ID列表
     * @param CertificateIds 证书ID列表
     */
    public void setCertificateIds(String [] CertificateIds) {
        this.CertificateIds = CertificateIds;
    }

    /**
     * Get 子订单ID 
     * @return DealIds 子订单ID
     */
    public String [] getDealIds() {
        return this.DealIds;
    }

    /**
     * Set 子订单ID
     * @param DealIds 子订单ID
     */
    public void setDealIds(String [] DealIds) {
        this.DealIds = DealIds;
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
        this.setParamArraySimple(map, prefix + "CertificateIds.", this.CertificateIds);
        this.setParamArraySimple(map, prefix + "DealIds.", this.DealIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

