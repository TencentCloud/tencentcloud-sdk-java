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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUploadIncrementalInfoResponse extends AbstractModel{

    /**
    * 存储桶名称
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 存储桶地域信息
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 存储路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 临时密钥ID
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * 临时密钥Key
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * 临时密钥Token
    */
    @SerializedName("XCosSecurityToken")
    @Expose
    private String XCosSecurityToken;

    /**
    * 临时密钥开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 临时密钥到期时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 存储桶名称 
     * @return BucketName 存储桶名称
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 存储桶名称
     * @param BucketName 存储桶名称
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 存储桶地域信息 
     * @return Region 存储桶地域信息
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 存储桶地域信息
     * @param Region 存储桶地域信息
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 存储路径 
     * @return Path 存储路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 存储路径
     * @param Path 存储路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 临时密钥ID 
     * @return TmpSecretId 临时密钥ID
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set 临时密钥ID
     * @param TmpSecretId 临时密钥ID
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get 临时密钥Key 
     * @return TmpSecretKey 临时密钥Key
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set 临时密钥Key
     * @param TmpSecretKey 临时密钥Key
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get 临时密钥Token 
     * @return XCosSecurityToken 临时密钥Token
     */
    public String getXCosSecurityToken() {
        return this.XCosSecurityToken;
    }

    /**
     * Set 临时密钥Token
     * @param XCosSecurityToken 临时密钥Token
     */
    public void setXCosSecurityToken(String XCosSecurityToken) {
        this.XCosSecurityToken = XCosSecurityToken;
    }

    /**
     * Get 临时密钥开始时间 
     * @return StartTime 临时密钥开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 临时密钥开始时间
     * @param StartTime 临时密钥开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 临时密钥到期时间 
     * @return ExpiredTime 临时密钥到期时间
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 临时密钥到期时间
     * @param ExpiredTime 临时密钥到期时间
     */
    public void setExpiredTime(String ExpiredTime) {
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

    public DescribeUploadIncrementalInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUploadIncrementalInfoResponse(DescribeUploadIncrementalInfoResponse source) {
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
        if (source.XCosSecurityToken != null) {
            this.XCosSecurityToken = new String(source.XCosSecurityToken);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "XCosSecurityToken", this.XCosSecurityToken);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

