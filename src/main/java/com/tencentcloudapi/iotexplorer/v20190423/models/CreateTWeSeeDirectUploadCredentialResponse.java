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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTWeSeeDirectUploadCredentialResponse extends AbstractModel {

    /**
    * <p>访问 COS 的临时密钥过期时间（秒级 UNIX 时间戳）</p>
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * <p>访问 COS 的临时密钥 SecretId</p>
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * <p>访问 COS 的临时密钥 SecretKey</p>
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * <p>COS 存储桶名称</p>
    */
    @SerializedName("StorageBucket")
    @Expose
    private String StorageBucket;

    /**
    * <p>COS 对象 Key 前缀。返回的临时凭据仅允许上传到此前缀下，格式为 Direct/{Uin}/{SessionId}/。</p>
    */
    @SerializedName("StoragePath")
    @Expose
    private String StoragePath;

    /**
    * <p>COS 存储桶所在地域</p>
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * <p>访问 COS 的临时密钥 Token</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>访问 COS 的临时密钥过期时间（秒级 UNIX 时间戳）</p> 
     * @return ExpiredTime <p>访问 COS 的临时密钥过期时间（秒级 UNIX 时间戳）</p>
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>访问 COS 的临时密钥过期时间（秒级 UNIX 时间戳）</p>
     * @param ExpiredTime <p>访问 COS 的临时密钥过期时间（秒级 UNIX 时间戳）</p>
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>访问 COS 的临时密钥 SecretId</p> 
     * @return SecretId <p>访问 COS 的临时密钥 SecretId</p>
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set <p>访问 COS 的临时密钥 SecretId</p>
     * @param SecretId <p>访问 COS 的临时密钥 SecretId</p>
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get <p>访问 COS 的临时密钥 SecretKey</p> 
     * @return SecretKey <p>访问 COS 的临时密钥 SecretKey</p>
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>访问 COS 的临时密钥 SecretKey</p>
     * @param SecretKey <p>访问 COS 的临时密钥 SecretKey</p>
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get <p>COS 存储桶名称</p> 
     * @return StorageBucket <p>COS 存储桶名称</p>
     */
    public String getStorageBucket() {
        return this.StorageBucket;
    }

    /**
     * Set <p>COS 存储桶名称</p>
     * @param StorageBucket <p>COS 存储桶名称</p>
     */
    public void setStorageBucket(String StorageBucket) {
        this.StorageBucket = StorageBucket;
    }

    /**
     * Get <p>COS 对象 Key 前缀。返回的临时凭据仅允许上传到此前缀下，格式为 Direct/{Uin}/{SessionId}/。</p> 
     * @return StoragePath <p>COS 对象 Key 前缀。返回的临时凭据仅允许上传到此前缀下，格式为 Direct/{Uin}/{SessionId}/。</p>
     */
    public String getStoragePath() {
        return this.StoragePath;
    }

    /**
     * Set <p>COS 对象 Key 前缀。返回的临时凭据仅允许上传到此前缀下，格式为 Direct/{Uin}/{SessionId}/。</p>
     * @param StoragePath <p>COS 对象 Key 前缀。返回的临时凭据仅允许上传到此前缀下，格式为 Direct/{Uin}/{SessionId}/。</p>
     */
    public void setStoragePath(String StoragePath) {
        this.StoragePath = StoragePath;
    }

    /**
     * Get <p>COS 存储桶所在地域</p> 
     * @return StorageRegion <p>COS 存储桶所在地域</p>
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set <p>COS 存储桶所在地域</p>
     * @param StorageRegion <p>COS 存储桶所在地域</p>
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get <p>访问 COS 的临时密钥 Token</p> 
     * @return Token <p>访问 COS 的临时密钥 Token</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>访问 COS 的临时密钥 Token</p>
     * @param Token <p>访问 COS 的临时密钥 Token</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
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

    public CreateTWeSeeDirectUploadCredentialResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTWeSeeDirectUploadCredentialResponse(CreateTWeSeeDirectUploadCredentialResponse source) {
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.StorageBucket != null) {
            this.StorageBucket = new String(source.StorageBucket);
        }
        if (source.StoragePath != null) {
            this.StoragePath = new String(source.StoragePath);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "StorageBucket", this.StorageBucket);
        this.setParamSimple(map, prefix + "StoragePath", this.StoragePath);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

