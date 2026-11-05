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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleContentK8sAPI extends AbstractModel {

    /**
    * <p>请求资源</p>
    */
    @SerializedName("RequestURI")
    @Expose
    private String RequestURI;

    /**
    * <p>操作类型</p>
    */
    @SerializedName("Verb")
    @Expose
    private String Verb;

    /**
    * <p>发起请求用户</p>
    */
    @SerializedName("RequestUser")
    @Expose
    private String RequestUser;

    /**
    * <p>用户代理</p>
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * <p>来源 IP</p>
    */
    @SerializedName("SourceIPS")
    @Expose
    private String SourceIPS;

    /**
    * <p>响应状态码</p>
    */
    @SerializedName("ResponseStatusCode")
    @Expose
    private String ResponseStatusCode;

    /**
    * <p>请求数据</p>
    */
    @SerializedName("RequestObject")
    @Expose
    private String RequestObject;

    /**
    * <p>响应数据</p>
    */
    @SerializedName("ResponseObject")
    @Expose
    private String ResponseObject;

    /**
    * <p>挂载宿主机目录</p>
    */
    @SerializedName("MountHostDir")
    @Expose
    private String MountHostDir;

    /**
    * <p>Pod 名称或 IP</p>
    */
    @SerializedName("PodNameIP")
    @Expose
    private String PodNameIP;

    /**
    * <p>审计日志 ID</p>
    */
    @SerializedName("AuditID")
    @Expose
    private String AuditID;

    /**
     * Get <p>请求资源</p> 
     * @return RequestURI <p>请求资源</p>
     */
    public String getRequestURI() {
        return this.RequestURI;
    }

    /**
     * Set <p>请求资源</p>
     * @param RequestURI <p>请求资源</p>
     */
    public void setRequestURI(String RequestURI) {
        this.RequestURI = RequestURI;
    }

    /**
     * Get <p>操作类型</p> 
     * @return Verb <p>操作类型</p>
     */
    public String getVerb() {
        return this.Verb;
    }

    /**
     * Set <p>操作类型</p>
     * @param Verb <p>操作类型</p>
     */
    public void setVerb(String Verb) {
        this.Verb = Verb;
    }

    /**
     * Get <p>发起请求用户</p> 
     * @return RequestUser <p>发起请求用户</p>
     */
    public String getRequestUser() {
        return this.RequestUser;
    }

    /**
     * Set <p>发起请求用户</p>
     * @param RequestUser <p>发起请求用户</p>
     */
    public void setRequestUser(String RequestUser) {
        this.RequestUser = RequestUser;
    }

    /**
     * Get <p>用户代理</p> 
     * @return UserAgent <p>用户代理</p>
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set <p>用户代理</p>
     * @param UserAgent <p>用户代理</p>
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get <p>来源 IP</p> 
     * @return SourceIPS <p>来源 IP</p>
     */
    public String getSourceIPS() {
        return this.SourceIPS;
    }

    /**
     * Set <p>来源 IP</p>
     * @param SourceIPS <p>来源 IP</p>
     */
    public void setSourceIPS(String SourceIPS) {
        this.SourceIPS = SourceIPS;
    }

    /**
     * Get <p>响应状态码</p> 
     * @return ResponseStatusCode <p>响应状态码</p>
     */
    public String getResponseStatusCode() {
        return this.ResponseStatusCode;
    }

    /**
     * Set <p>响应状态码</p>
     * @param ResponseStatusCode <p>响应状态码</p>
     */
    public void setResponseStatusCode(String ResponseStatusCode) {
        this.ResponseStatusCode = ResponseStatusCode;
    }

    /**
     * Get <p>请求数据</p> 
     * @return RequestObject <p>请求数据</p>
     */
    public String getRequestObject() {
        return this.RequestObject;
    }

    /**
     * Set <p>请求数据</p>
     * @param RequestObject <p>请求数据</p>
     */
    public void setRequestObject(String RequestObject) {
        this.RequestObject = RequestObject;
    }

    /**
     * Get <p>响应数据</p> 
     * @return ResponseObject <p>响应数据</p>
     */
    public String getResponseObject() {
        return this.ResponseObject;
    }

    /**
     * Set <p>响应数据</p>
     * @param ResponseObject <p>响应数据</p>
     */
    public void setResponseObject(String ResponseObject) {
        this.ResponseObject = ResponseObject;
    }

    /**
     * Get <p>挂载宿主机目录</p> 
     * @return MountHostDir <p>挂载宿主机目录</p>
     */
    public String getMountHostDir() {
        return this.MountHostDir;
    }

    /**
     * Set <p>挂载宿主机目录</p>
     * @param MountHostDir <p>挂载宿主机目录</p>
     */
    public void setMountHostDir(String MountHostDir) {
        this.MountHostDir = MountHostDir;
    }

    /**
     * Get <p>Pod 名称或 IP</p> 
     * @return PodNameIP <p>Pod 名称或 IP</p>
     */
    public String getPodNameIP() {
        return this.PodNameIP;
    }

    /**
     * Set <p>Pod 名称或 IP</p>
     * @param PodNameIP <p>Pod 名称或 IP</p>
     */
    public void setPodNameIP(String PodNameIP) {
        this.PodNameIP = PodNameIP;
    }

    /**
     * Get <p>审计日志 ID</p> 
     * @return AuditID <p>审计日志 ID</p>
     */
    public String getAuditID() {
        return this.AuditID;
    }

    /**
     * Set <p>审计日志 ID</p>
     * @param AuditID <p>审计日志 ID</p>
     */
    public void setAuditID(String AuditID) {
        this.AuditID = AuditID;
    }

    public RuleContentK8sAPI() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleContentK8sAPI(RuleContentK8sAPI source) {
        if (source.RequestURI != null) {
            this.RequestURI = new String(source.RequestURI);
        }
        if (source.Verb != null) {
            this.Verb = new String(source.Verb);
        }
        if (source.RequestUser != null) {
            this.RequestUser = new String(source.RequestUser);
        }
        if (source.UserAgent != null) {
            this.UserAgent = new String(source.UserAgent);
        }
        if (source.SourceIPS != null) {
            this.SourceIPS = new String(source.SourceIPS);
        }
        if (source.ResponseStatusCode != null) {
            this.ResponseStatusCode = new String(source.ResponseStatusCode);
        }
        if (source.RequestObject != null) {
            this.RequestObject = new String(source.RequestObject);
        }
        if (source.ResponseObject != null) {
            this.ResponseObject = new String(source.ResponseObject);
        }
        if (source.MountHostDir != null) {
            this.MountHostDir = new String(source.MountHostDir);
        }
        if (source.PodNameIP != null) {
            this.PodNameIP = new String(source.PodNameIP);
        }
        if (source.AuditID != null) {
            this.AuditID = new String(source.AuditID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestURI", this.RequestURI);
        this.setParamSimple(map, prefix + "Verb", this.Verb);
        this.setParamSimple(map, prefix + "RequestUser", this.RequestUser);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "SourceIPS", this.SourceIPS);
        this.setParamSimple(map, prefix + "ResponseStatusCode", this.ResponseStatusCode);
        this.setParamSimple(map, prefix + "RequestObject", this.RequestObject);
        this.setParamSimple(map, prefix + "ResponseObject", this.ResponseObject);
        this.setParamSimple(map, prefix + "MountHostDir", this.MountHostDir);
        this.setParamSimple(map, prefix + "PodNameIP", this.PodNameIP);
        this.setParamSimple(map, prefix + "AuditID", this.AuditID);

    }
}

