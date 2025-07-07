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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCosCredentialResponse extends AbstractModel {

    /**
    * Cos SecretID
    */
    @SerializedName("SecretID")
    @Expose
    private String SecretID;

    /**
    * Cos SecretKey
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Cos Session
    */
    @SerializedName("SessionToken")
    @Expose
    private String SessionToken;

    /**
    * Cos Bucket
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * Cos Region
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * Cos 操作路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Cos 密钥的起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Cos 密钥的失效时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Cos SecretID 
     * @return SecretID Cos SecretID
     */
    public String getSecretID() {
        return this.SecretID;
    }

    /**
     * Set Cos SecretID
     * @param SecretID Cos SecretID
     */
    public void setSecretID(String SecretID) {
        this.SecretID = SecretID;
    }

    /**
     * Get Cos SecretKey 
     * @return SecretKey Cos SecretKey
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Cos SecretKey
     * @param SecretKey Cos SecretKey
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Cos Session 
     * @return SessionToken Cos Session
     */
    public String getSessionToken() {
        return this.SessionToken;
    }

    /**
     * Set Cos Session
     * @param SessionToken Cos Session
     */
    public void setSessionToken(String SessionToken) {
        this.SessionToken = SessionToken;
    }

    /**
     * Get Cos Bucket 
     * @return CosBucket Cos Bucket
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set Cos Bucket
     * @param CosBucket Cos Bucket
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get Cos Region 
     * @return CosRegion Cos Region
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set Cos Region
     * @param CosRegion Cos Region
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get Cos 操作路径 
     * @return Path Cos 操作路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Cos 操作路径
     * @param Path Cos 操作路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Cos 密钥的起始时间 
     * @return StartTime Cos 密钥的起始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Cos 密钥的起始时间
     * @param StartTime Cos 密钥的起始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Cos 密钥的失效时间 
     * @return ExpiredTime Cos 密钥的失效时间
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Cos 密钥的失效时间
     * @param ExpiredTime Cos 密钥的失效时间
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
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

    public CreateCosCredentialResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCosCredentialResponse(CreateCosCredentialResponse source) {
        if (source.SecretID != null) {
            this.SecretID = new String(source.SecretID);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.SessionToken != null) {
            this.SessionToken = new String(source.SessionToken);
        }
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
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
        this.setParamSimple(map, prefix + "SecretID", this.SecretID);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "SessionToken", this.SessionToken);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

