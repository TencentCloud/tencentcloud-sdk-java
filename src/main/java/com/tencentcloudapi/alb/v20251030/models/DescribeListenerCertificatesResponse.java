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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListenerCertificatesResponse extends AbstractModel {

    /**
    * 监听器绑定的证书信息列表。
    */
    @SerializedName("Certificates")
    @Expose
    private CertificateInfo [] Certificates;

    /**
    * 本次读取的最大数据记录数量。	
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 下一次查询的令牌。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 监听器绑定的证书总量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 监听器绑定的证书信息列表。 
     * @return Certificates 监听器绑定的证书信息列表。
     */
    public CertificateInfo [] getCertificates() {
        return this.Certificates;
    }

    /**
     * Set 监听器绑定的证书信息列表。
     * @param Certificates 监听器绑定的证书信息列表。
     */
    public void setCertificates(CertificateInfo [] Certificates) {
        this.Certificates = Certificates;
    }

    /**
     * Get 本次读取的最大数据记录数量。	 
     * @return MaxResults 本次读取的最大数据记录数量。	
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 本次读取的最大数据记录数量。	
     * @param MaxResults 本次读取的最大数据记录数量。	
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get 下一次查询的令牌。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextToken 下一次查询的令牌。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 下一次查询的令牌。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextToken 下一次查询的令牌。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 监听器绑定的证书总量。 
     * @return TotalCount 监听器绑定的证书总量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 监听器绑定的证书总量。
     * @param TotalCount 监听器绑定的证书总量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeListenerCertificatesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListenerCertificatesResponse(DescribeListenerCertificatesResponse source) {
        if (source.Certificates != null) {
            this.Certificates = new CertificateInfo[source.Certificates.length];
            for (int i = 0; i < source.Certificates.length; i++) {
                this.Certificates[i] = new CertificateInfo(source.Certificates[i]);
            }
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Certificates.", this.Certificates);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

