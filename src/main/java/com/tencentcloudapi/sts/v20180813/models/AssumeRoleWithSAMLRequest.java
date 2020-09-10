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

public class AssumeRoleWithSAMLRequest extends AbstractModel{

    /**
    * base64 编码的 SAML 断言信息
    */
    @SerializedName("SAMLAssertion")
    @Expose
    private String SAMLAssertion;

    /**
    * 扮演者访问描述名
    */
    @SerializedName("PrincipalArn")
    @Expose
    private String PrincipalArn;

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
     * Get base64 编码的 SAML 断言信息 
     * @return SAMLAssertion base64 编码的 SAML 断言信息
     */
    public String getSAMLAssertion() {
        return this.SAMLAssertion;
    }

    /**
     * Set base64 编码的 SAML 断言信息
     * @param SAMLAssertion base64 编码的 SAML 断言信息
     */
    public void setSAMLAssertion(String SAMLAssertion) {
        this.SAMLAssertion = SAMLAssertion;
    }

    /**
     * Get 扮演者访问描述名 
     * @return PrincipalArn 扮演者访问描述名
     */
    public String getPrincipalArn() {
        return this.PrincipalArn;
    }

    /**
     * Set 扮演者访问描述名
     * @param PrincipalArn 扮演者访问描述名
     */
    public void setPrincipalArn(String PrincipalArn) {
        this.PrincipalArn = PrincipalArn;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SAMLAssertion", this.SAMLAssertion);
        this.setParamSimple(map, prefix + "PrincipalArn", this.PrincipalArn);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "RoleSessionName", this.RoleSessionName);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);

    }
}

