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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCOSCredentialsResponse extends AbstractModel{

    /**
    * COS存储桶名称
    */
    @SerializedName("StorageBucket")
    @Expose
    private String StorageBucket;

    /**
    * COS存储桶区域
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * COS存储桶路径
    */
    @SerializedName("StoragePath")
    @Expose
    private String StoragePath;

    /**
    * COS上传用的SecretID
    */
    @SerializedName("SecretID")
    @Expose
    private String SecretID;

    /**
    * COS上传用的SecretKey
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * COS上传用的Token
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 密钥信息过期时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get COS存储桶名称 
     * @return StorageBucket COS存储桶名称
     */
    public String getStorageBucket() {
        return this.StorageBucket;
    }

    /**
     * Set COS存储桶名称
     * @param StorageBucket COS存储桶名称
     */
    public void setStorageBucket(String StorageBucket) {
        this.StorageBucket = StorageBucket;
    }

    /**
     * Get COS存储桶区域 
     * @return StorageRegion COS存储桶区域
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set COS存储桶区域
     * @param StorageRegion COS存储桶区域
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get COS存储桶路径 
     * @return StoragePath COS存储桶路径
     */
    public String getStoragePath() {
        return this.StoragePath;
    }

    /**
     * Set COS存储桶路径
     * @param StoragePath COS存储桶路径
     */
    public void setStoragePath(String StoragePath) {
        this.StoragePath = StoragePath;
    }

    /**
     * Get COS上传用的SecretID 
     * @return SecretID COS上传用的SecretID
     */
    public String getSecretID() {
        return this.SecretID;
    }

    /**
     * Set COS上传用的SecretID
     * @param SecretID COS上传用的SecretID
     */
    public void setSecretID(String SecretID) {
        this.SecretID = SecretID;
    }

    /**
     * Get COS上传用的SecretKey 
     * @return SecretKey COS上传用的SecretKey
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set COS上传用的SecretKey
     * @param SecretKey COS上传用的SecretKey
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get COS上传用的Token 
     * @return Token COS上传用的Token
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set COS上传用的Token
     * @param Token COS上传用的Token
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 密钥信息过期时间 
     * @return ExpiredTime 密钥信息过期时间
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 密钥信息过期时间
     * @param ExpiredTime 密钥信息过期时间
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
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

    public CreateCOSCredentialsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCOSCredentialsResponse(CreateCOSCredentialsResponse source) {
        if (source.StorageBucket != null) {
            this.StorageBucket = new String(source.StorageBucket);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.StoragePath != null) {
            this.StoragePath = new String(source.StoragePath);
        }
        if (source.SecretID != null) {
            this.SecretID = new String(source.SecretID);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageBucket", this.StorageBucket);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "StoragePath", this.StoragePath);
        this.setParamSimple(map, prefix + "SecretID", this.SecretID);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

