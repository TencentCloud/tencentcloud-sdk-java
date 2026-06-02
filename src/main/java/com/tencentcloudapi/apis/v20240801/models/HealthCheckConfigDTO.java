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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckConfigDTO extends AbstractModel {

    /**
    * 健康检查路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckPath")
    @Expose
    private String HealthCheckPath;

    /**
    * 状态码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidHealthCheckStatusCode")
    @Expose
    private Long [] ValidHealthCheckStatusCode;

    /**
    * 请求的超时时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckTimeout")
    @Expose
    private Long HealthCheckTimeout;

    /**
     * Get 健康检查路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckPath 健康检查路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHealthCheckPath() {
        return this.HealthCheckPath;
    }

    /**
     * Set 健康检查路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckPath 健康检查路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckPath(String HealthCheckPath) {
        this.HealthCheckPath = HealthCheckPath;
    }

    /**
     * Get 状态码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidHealthCheckStatusCode 状态码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getValidHealthCheckStatusCode() {
        return this.ValidHealthCheckStatusCode;
    }

    /**
     * Set 状态码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidHealthCheckStatusCode 状态码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidHealthCheckStatusCode(Long [] ValidHealthCheckStatusCode) {
        this.ValidHealthCheckStatusCode = ValidHealthCheckStatusCode;
    }

    /**
     * Get 请求的超时时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckTimeout 请求的超时时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHealthCheckTimeout() {
        return this.HealthCheckTimeout;
    }

    /**
     * Set 请求的超时时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckTimeout 请求的超时时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckTimeout(Long HealthCheckTimeout) {
        this.HealthCheckTimeout = HealthCheckTimeout;
    }

    public HealthCheckConfigDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckConfigDTO(HealthCheckConfigDTO source) {
        if (source.HealthCheckPath != null) {
            this.HealthCheckPath = new String(source.HealthCheckPath);
        }
        if (source.ValidHealthCheckStatusCode != null) {
            this.ValidHealthCheckStatusCode = new Long[source.ValidHealthCheckStatusCode.length];
            for (int i = 0; i < source.ValidHealthCheckStatusCode.length; i++) {
                this.ValidHealthCheckStatusCode[i] = new Long(source.ValidHealthCheckStatusCode[i]);
            }
        }
        if (source.HealthCheckTimeout != null) {
            this.HealthCheckTimeout = new Long(source.HealthCheckTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthCheckPath", this.HealthCheckPath);
        this.setParamArraySimple(map, prefix + "ValidHealthCheckStatusCode.", this.ValidHealthCheckStatusCode);
        this.setParamSimple(map, prefix + "HealthCheckTimeout", this.HealthCheckTimeout);

    }
}

