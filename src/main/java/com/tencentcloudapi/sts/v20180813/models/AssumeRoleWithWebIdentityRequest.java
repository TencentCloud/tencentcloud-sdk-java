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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssumeRoleWithWebIdentityRequest extends AbstractModel{

    /**
    * 身份提供商名称
    */
    @SerializedName("ProviderId")
    @Expose
    private String ProviderId;

    /**
    * IdP签发的OIDC令牌
    */
    @SerializedName("WebIdentityToken")
    @Expose
    private String WebIdentityToken;

    /**
    * 角色访问描述名
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * 会话名称
    */
    @SerializedName("RoleSessionName")
    @Expose
    private String RoleSessionName;

    /**
    * 指定临时证书的有效期，单位：秒，默认 7200 秒，最长可设定有效期为 43200 秒
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
     * Get 身份提供商名称 
     * @return ProviderId 身份提供商名称
     */
    public String getProviderId() {
        return this.ProviderId;
    }

    /**
     * Set 身份提供商名称
     * @param ProviderId 身份提供商名称
     */
    public void setProviderId(String ProviderId) {
        this.ProviderId = ProviderId;
    }

    /**
     * Get IdP签发的OIDC令牌 
     * @return WebIdentityToken IdP签发的OIDC令牌
     */
    public String getWebIdentityToken() {
        return this.WebIdentityToken;
    }

    /**
     * Set IdP签发的OIDC令牌
     * @param WebIdentityToken IdP签发的OIDC令牌
     */
    public void setWebIdentityToken(String WebIdentityToken) {
        this.WebIdentityToken = WebIdentityToken;
    }

    /**
     * Get 角色访问描述名 
     * @return RoleArn 角色访问描述名
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set 角色访问描述名
     * @param RoleArn 角色访问描述名
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get 会话名称 
     * @return RoleSessionName 会话名称
     */
    public String getRoleSessionName() {
        return this.RoleSessionName;
    }

    /**
     * Set 会话名称
     * @param RoleSessionName 会话名称
     */
    public void setRoleSessionName(String RoleSessionName) {
        this.RoleSessionName = RoleSessionName;
    }

    /**
     * Get 指定临时证书的有效期，单位：秒，默认 7200 秒，最长可设定有效期为 43200 秒 
     * @return DurationSeconds 指定临时证书的有效期，单位：秒，默认 7200 秒，最长可设定有效期为 43200 秒
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set 指定临时证书的有效期，单位：秒，默认 7200 秒，最长可设定有效期为 43200 秒
     * @param DurationSeconds 指定临时证书的有效期，单位：秒，默认 7200 秒，最长可设定有效期为 43200 秒
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    public AssumeRoleWithWebIdentityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssumeRoleWithWebIdentityRequest(AssumeRoleWithWebIdentityRequest source) {
        if (source.ProviderId != null) {
            this.ProviderId = new String(source.ProviderId);
        }
        if (source.WebIdentityToken != null) {
            this.WebIdentityToken = new String(source.WebIdentityToken);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.RoleSessionName != null) {
            this.RoleSessionName = new String(source.RoleSessionName);
        }
        if (source.DurationSeconds != null) {
            this.DurationSeconds = new Long(source.DurationSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProviderId", this.ProviderId);
        this.setParamSimple(map, prefix + "WebIdentityToken", this.WebIdentityToken);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "RoleSessionName", this.RoleSessionName);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);

    }
}

