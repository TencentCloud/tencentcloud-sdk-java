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
package com.tencentcloudapi.btoe.v20210514.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDepositCertResponse extends AbstractModel{

    /**
    * 存证编码
    */
    @SerializedName("EvidenceId")
    @Expose
    private String EvidenceId;

    /**
    * 存证证书文件临时链接
    */
    @SerializedName("EvidenceCert")
    @Expose
    private String EvidenceCert;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 存证编码 
     * @return EvidenceId 存证编码
     */
    public String getEvidenceId() {
        return this.EvidenceId;
    }

    /**
     * Set 存证编码
     * @param EvidenceId 存证编码
     */
    public void setEvidenceId(String EvidenceId) {
        this.EvidenceId = EvidenceId;
    }

    /**
     * Get 存证证书文件临时链接 
     * @return EvidenceCert 存证证书文件临时链接
     */
    public String getEvidenceCert() {
        return this.EvidenceCert;
    }

    /**
     * Set 存证证书文件临时链接
     * @param EvidenceCert 存证证书文件临时链接
     */
    public void setEvidenceCert(String EvidenceCert) {
        this.EvidenceCert = EvidenceCert;
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

    public GetDepositCertResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDepositCertResponse(GetDepositCertResponse source) {
        if (source.EvidenceId != null) {
            this.EvidenceId = new String(source.EvidenceId);
        }
        if (source.EvidenceCert != null) {
            this.EvidenceCert = new String(source.EvidenceCert);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvidenceId", this.EvidenceId);
        this.setParamSimple(map, prefix + "EvidenceCert", this.EvidenceCert);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

