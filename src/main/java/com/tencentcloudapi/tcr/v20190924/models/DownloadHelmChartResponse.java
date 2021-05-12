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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadHelmChartResponse extends AbstractModel{

    /**
    * 临时token
    */
    @SerializedName("TmpToken")
    @Expose
    private String TmpToken;

    /**
    * 临时的secretId
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * 临时的secretKey
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * 存储桶信息
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 实例ID
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * chart信息
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 开始时间时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * token过期时间时间戳
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
     * Get 临时token 
     * @return TmpToken 临时token
     */
    public String getTmpToken() {
        return this.TmpToken;
    }

    /**
     * Set 临时token
     * @param TmpToken 临时token
     */
    public void setTmpToken(String TmpToken) {
        this.TmpToken = TmpToken;
    }

    /**
     * Get 临时的secretId 
     * @return TmpSecretId 临时的secretId
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set 临时的secretId
     * @param TmpSecretId 临时的secretId
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get 临时的secretKey 
     * @return TmpSecretKey 临时的secretKey
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set 临时的secretKey
     * @param TmpSecretKey 临时的secretKey
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get 存储桶信息 
     * @return Bucket 存储桶信息
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 存储桶信息
     * @param Bucket 存储桶信息
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 实例ID 
     * @return Region 实例ID
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例ID
     * @param Region 实例ID
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get chart信息 
     * @return Path chart信息
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set chart信息
     * @param Path chart信息
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 开始时间时间戳 
     * @return StartTime 开始时间时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间时间戳
     * @param StartTime 开始时间时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get token过期时间时间戳 
     * @return ExpiredTime token过期时间时间戳
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set token过期时间时间戳
     * @param ExpiredTime token过期时间时间戳
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

    public DownloadHelmChartResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadHelmChartResponse(DownloadHelmChartResponse source) {
        if (source.TmpToken != null) {
            this.TmpToken = new String(source.TmpToken);
        }
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
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
        this.setParamSimple(map, prefix + "TmpToken", this.TmpToken);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

