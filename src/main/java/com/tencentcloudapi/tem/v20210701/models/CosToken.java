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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosToken extends AbstractModel{

    /**
    * 唯一请求 ID
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * 存储桶桶名
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 存储桶所在区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 临时密钥的SecretId
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * 临时密钥的SecretKey
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * 临时密钥的 sessionToken
    */
    @SerializedName("SessionToken")
    @Expose
    private String SessionToken;

    /**
    * 临时密钥获取的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 临时密钥的 expiredTime
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 包完整路径
    */
    @SerializedName("FullPath")
    @Expose
    private String FullPath;

    /**
     * Get 唯一请求 ID 
     * @return RequestId 唯一请求 ID
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID
     * @param RequestId 唯一请求 ID
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get 存储桶桶名 
     * @return Bucket 存储桶桶名
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 存储桶桶名
     * @param Bucket 存储桶桶名
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 存储桶所在区域 
     * @return Region 存储桶所在区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 存储桶所在区域
     * @param Region 存储桶所在区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 临时密钥的SecretId 
     * @return TmpSecretId 临时密钥的SecretId
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set 临时密钥的SecretId
     * @param TmpSecretId 临时密钥的SecretId
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get 临时密钥的SecretKey 
     * @return TmpSecretKey 临时密钥的SecretKey
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set 临时密钥的SecretKey
     * @param TmpSecretKey 临时密钥的SecretKey
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get 临时密钥的 sessionToken 
     * @return SessionToken 临时密钥的 sessionToken
     */
    public String getSessionToken() {
        return this.SessionToken;
    }

    /**
     * Set 临时密钥的 sessionToken
     * @param SessionToken 临时密钥的 sessionToken
     */
    public void setSessionToken(String SessionToken) {
        this.SessionToken = SessionToken;
    }

    /**
     * Get 临时密钥获取的开始时间 
     * @return StartTime 临时密钥获取的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 临时密钥获取的开始时间
     * @param StartTime 临时密钥获取的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 临时密钥的 expiredTime 
     * @return ExpiredTime 临时密钥的 expiredTime
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 临时密钥的 expiredTime
     * @param ExpiredTime 临时密钥的 expiredTime
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 包完整路径 
     * @return FullPath 包完整路径
     */
    public String getFullPath() {
        return this.FullPath;
    }

    /**
     * Set 包完整路径
     * @param FullPath 包完整路径
     */
    public void setFullPath(String FullPath) {
        this.FullPath = FullPath;
    }

    public CosToken() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosToken(CosToken source) {
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
        if (source.SessionToken != null) {
            this.SessionToken = new String(source.SessionToken);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.FullPath != null) {
            this.FullPath = new String(source.FullPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "SessionToken", this.SessionToken);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "FullPath", this.FullPath);

    }
}

