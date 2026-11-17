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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCosTempTokenResponse extends AbstractModel {

    /**
    * <p>COS 桶</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>COS 地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>上传路径，格式 appId/projectName/时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
    * <p>临时密钥过期时间，Unix 秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * <p>临时密钥过期时间，ISO 8601</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Expiration")
    @Expose
    private String Expiration;

    /**
    * <p>临时密钥</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Credentials")
    @Expose
    private CosCredentials Credentials;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>COS 桶</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bucket <p>COS 桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>COS 桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bucket <p>COS 桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>COS 地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>COS 地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>COS 地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>COS 地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>上传路径，格式 appId/projectName/时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetPath <p>上传路径，格式 appId/projectName/时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set <p>上传路径，格式 appId/projectName/时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetPath <p>上传路径，格式 appId/projectName/时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    /**
     * Get <p>临时密钥过期时间，Unix 秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredTime <p>临时密钥过期时间，Unix 秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>临时密钥过期时间，Unix 秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredTime <p>临时密钥过期时间，Unix 秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>临时密钥过期时间，ISO 8601</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Expiration <p>临时密钥过期时间，ISO 8601</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiration() {
        return this.Expiration;
    }

    /**
     * Set <p>临时密钥过期时间，ISO 8601</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Expiration <p>临时密钥过期时间，ISO 8601</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiration(String Expiration) {
        this.Expiration = Expiration;
    }

    /**
     * Get <p>临时密钥</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Credentials <p>临时密钥</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosCredentials getCredentials() {
        return this.Credentials;
    }

    /**
     * Set <p>临时密钥</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Credentials <p>临时密钥</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCredentials(CosCredentials Credentials) {
        this.Credentials = Credentials;
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

    public DescribeCosTempTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCosTempTokenResponse(DescribeCosTempTokenResponse source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.TargetPath != null) {
            this.TargetPath = new String(source.TargetPath);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.Expiration != null) {
            this.Expiration = new String(source.Expiration);
        }
        if (source.Credentials != null) {
            this.Credentials = new CosCredentials(source.Credentials);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "TargetPath", this.TargetPath);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);
        this.setParamObj(map, prefix + "Credentials.", this.Credentials);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

