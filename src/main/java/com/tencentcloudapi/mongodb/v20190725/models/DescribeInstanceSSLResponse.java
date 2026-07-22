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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceSSLResponse extends AbstractModel {

    /**
    * <p>SSL开启状态。0为关闭，1为开启</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>证书过期时间，格式为2023-05-01 12:00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * <p>证书下载链接</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertUrl")
    @Expose
    private String CertUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>SSL开启状态。0为关闭，1为开启</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>SSL开启状态。0为关闭，1为开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>SSL开启状态。0为关闭，1为开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>SSL开启状态。0为关闭，1为开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>证书过期时间，格式为2023-05-01 12:00:00</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredTime <p>证书过期时间，格式为2023-05-01 12:00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>证书过期时间，格式为2023-05-01 12:00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredTime <p>证书过期时间，格式为2023-05-01 12:00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>证书下载链接</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertUrl <p>证书下载链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertUrl() {
        return this.CertUrl;
    }

    /**
     * Set <p>证书下载链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertUrl <p>证书下载链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertUrl(String CertUrl) {
        this.CertUrl = CertUrl;
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

    public DescribeInstanceSSLResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceSSLResponse(DescribeInstanceSSLResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.CertUrl != null) {
            this.CertUrl = new String(source.CertUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "CertUrl", this.CertUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

