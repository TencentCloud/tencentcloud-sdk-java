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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMQTTInstanceCertResponse extends AbstractModel {

    /**
    * 集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务端证书id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SSLServerCertId")
    @Expose
    private String SSLServerCertId;

    /**
    * CA证书id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SSLCaCertId")
    @Expose
    private String SSLCaCertId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 服务端证书id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SSLServerCertId 服务端证书id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSSLServerCertId() {
        return this.SSLServerCertId;
    }

    /**
     * Set 服务端证书id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SSLServerCertId 服务端证书id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSSLServerCertId(String SSLServerCertId) {
        this.SSLServerCertId = SSLServerCertId;
    }

    /**
     * Get CA证书id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SSLCaCertId CA证书id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSSLCaCertId() {
        return this.SSLCaCertId;
    }

    /**
     * Set CA证书id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SSLCaCertId CA证书id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSSLCaCertId(String SSLCaCertId) {
        this.SSLCaCertId = SSLCaCertId;
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

    public DescribeMQTTInstanceCertResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMQTTInstanceCertResponse(DescribeMQTTInstanceCertResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SSLServerCertId != null) {
            this.SSLServerCertId = new String(source.SSLServerCertId);
        }
        if (source.SSLCaCertId != null) {
            this.SSLCaCertId = new String(source.SSLCaCertId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SSLServerCertId", this.SSLServerCertId);
        this.setParamSimple(map, prefix + "SSLCaCertId", this.SSLCaCertId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

