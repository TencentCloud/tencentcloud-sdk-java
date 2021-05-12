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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsGetCrowdUploadInfoResponse extends AbstractModel{

    /**
    * 过期时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 会话token
    */
    @SerializedName("SessionToken")
    @Expose
    private String SessionToken;

    /**
    * 临时密钥id
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * 临时密钥
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * cos信息
    */
    @SerializedName("CosInfo")
    @Expose
    private UploadFansInfoCosInfo CosInfo;

    /**
     * Get 过期时间 
     * @return ExpiredTime 过期时间
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 过期时间
     * @param ExpiredTime 过期时间
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 会话token 
     * @return SessionToken 会话token
     */
    public String getSessionToken() {
        return this.SessionToken;
    }

    /**
     * Set 会话token
     * @param SessionToken 会话token
     */
    public void setSessionToken(String SessionToken) {
        this.SessionToken = SessionToken;
    }

    /**
     * Get 临时密钥id 
     * @return TmpSecretId 临时密钥id
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set 临时密钥id
     * @param TmpSecretId 临时密钥id
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get 临时密钥 
     * @return TmpSecretKey 临时密钥
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set 临时密钥
     * @param TmpSecretKey 临时密钥
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get cos信息 
     * @return CosInfo cos信息
     */
    public UploadFansInfoCosInfo getCosInfo() {
        return this.CosInfo;
    }

    /**
     * Set cos信息
     * @param CosInfo cos信息
     */
    public void setCosInfo(UploadFansInfoCosInfo CosInfo) {
        this.CosInfo = CosInfo;
    }

    public SmsGetCrowdUploadInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsGetCrowdUploadInfoResponse(SmsGetCrowdUploadInfoResponse source) {
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.SessionToken != null) {
            this.SessionToken = new String(source.SessionToken);
        }
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
        if (source.CosInfo != null) {
            this.CosInfo = new UploadFansInfoCosInfo(source.CosInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "SessionToken", this.SessionToken);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamObj(map, prefix + "CosInfo.", this.CosInfo);

    }
}

