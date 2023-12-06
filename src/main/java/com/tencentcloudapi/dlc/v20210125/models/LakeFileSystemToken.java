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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LakeFileSystemToken extends AbstractModel {

    /**
    * Token使用的临时密钥的ID
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * Token使用的临时密钥
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Token信息
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 过期时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 颁布时间
    */
    @SerializedName("IssueTime")
    @Expose
    private Long IssueTime;

    /**
     * Get Token使用的临时密钥的ID 
     * @return SecretId Token使用的临时密钥的ID
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set Token使用的临时密钥的ID
     * @param SecretId Token使用的临时密钥的ID
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get Token使用的临时密钥 
     * @return SecretKey Token使用的临时密钥
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Token使用的临时密钥
     * @param SecretKey Token使用的临时密钥
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Token信息 
     * @return Token Token信息
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set Token信息
     * @param Token Token信息
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

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
     * Get 颁布时间 
     * @return IssueTime 颁布时间
     */
    public Long getIssueTime() {
        return this.IssueTime;
    }

    /**
     * Set 颁布时间
     * @param IssueTime 颁布时间
     */
    public void setIssueTime(Long IssueTime) {
        this.IssueTime = IssueTime;
    }

    public LakeFileSystemToken() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LakeFileSystemToken(LakeFileSystemToken source) {
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
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
        if (source.IssueTime != null) {
            this.IssueTime = new Long(source.IssueTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "IssueTime", this.IssueTime);

    }
}

