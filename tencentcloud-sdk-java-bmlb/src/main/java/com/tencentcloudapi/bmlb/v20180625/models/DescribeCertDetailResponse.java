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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertDetailResponse extends AbstractModel{

    /**
    * 证书ID。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 证书名称。
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * 证书类型（SVR=服务器证书，CA=客户端证书）。
    */
    @SerializedName("CertType")
    @Expose
    private String CertType;

    /**
    * 证书内容。
    */
    @SerializedName("CertContent")
    @Expose
    private String CertContent;

    /**
    * 证书主域名。
    */
    @SerializedName("CertDomain")
    @Expose
    private String CertDomain;

    /**
    * 证书子域名列表。
    */
    @SerializedName("CertSubjectDomain")
    @Expose
    private String [] CertSubjectDomain;

    /**
    * 证书上传时间。
    */
    @SerializedName("CertUploadTime")
    @Expose
    private String CertUploadTime;

    /**
    * 证书生效时间。
    */
    @SerializedName("CertBeginTime")
    @Expose
    private String CertBeginTime;

    /**
    * 证书失效时间。
    */
    @SerializedName("CertEndTime")
    @Expose
    private String CertEndTime;

    /**
    * 该证书关联的黑石负载均衡对象列表。
    */
    @SerializedName("CertLoadBalancerSet")
    @Expose
    private CertDetailLoadBalancer [] CertLoadBalancerSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 证书ID。 
     * @return CertId 证书ID。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书ID。
     * @param CertId 证书ID。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 证书名称。 
     * @return CertName 证书名称。
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set 证书名称。
     * @param CertName 证书名称。
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get 证书类型（SVR=服务器证书，CA=客户端证书）。 
     * @return CertType 证书类型（SVR=服务器证书，CA=客户端证书）。
     */
    public String getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型（SVR=服务器证书，CA=客户端证书）。
     * @param CertType 证书类型（SVR=服务器证书，CA=客户端证书）。
     */
    public void setCertType(String CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 证书内容。 
     * @return CertContent 证书内容。
     */
    public String getCertContent() {
        return this.CertContent;
    }

    /**
     * Set 证书内容。
     * @param CertContent 证书内容。
     */
    public void setCertContent(String CertContent) {
        this.CertContent = CertContent;
    }

    /**
     * Get 证书主域名。 
     * @return CertDomain 证书主域名。
     */
    public String getCertDomain() {
        return this.CertDomain;
    }

    /**
     * Set 证书主域名。
     * @param CertDomain 证书主域名。
     */
    public void setCertDomain(String CertDomain) {
        this.CertDomain = CertDomain;
    }

    /**
     * Get 证书子域名列表。 
     * @return CertSubjectDomain 证书子域名列表。
     */
    public String [] getCertSubjectDomain() {
        return this.CertSubjectDomain;
    }

    /**
     * Set 证书子域名列表。
     * @param CertSubjectDomain 证书子域名列表。
     */
    public void setCertSubjectDomain(String [] CertSubjectDomain) {
        this.CertSubjectDomain = CertSubjectDomain;
    }

    /**
     * Get 证书上传时间。 
     * @return CertUploadTime 证书上传时间。
     */
    public String getCertUploadTime() {
        return this.CertUploadTime;
    }

    /**
     * Set 证书上传时间。
     * @param CertUploadTime 证书上传时间。
     */
    public void setCertUploadTime(String CertUploadTime) {
        this.CertUploadTime = CertUploadTime;
    }

    /**
     * Get 证书生效时间。 
     * @return CertBeginTime 证书生效时间。
     */
    public String getCertBeginTime() {
        return this.CertBeginTime;
    }

    /**
     * Set 证书生效时间。
     * @param CertBeginTime 证书生效时间。
     */
    public void setCertBeginTime(String CertBeginTime) {
        this.CertBeginTime = CertBeginTime;
    }

    /**
     * Get 证书失效时间。 
     * @return CertEndTime 证书失效时间。
     */
    public String getCertEndTime() {
        return this.CertEndTime;
    }

    /**
     * Set 证书失效时间。
     * @param CertEndTime 证书失效时间。
     */
    public void setCertEndTime(String CertEndTime) {
        this.CertEndTime = CertEndTime;
    }

    /**
     * Get 该证书关联的黑石负载均衡对象列表。 
     * @return CertLoadBalancerSet 该证书关联的黑石负载均衡对象列表。
     */
    public CertDetailLoadBalancer [] getCertLoadBalancerSet() {
        return this.CertLoadBalancerSet;
    }

    /**
     * Set 该证书关联的黑石负载均衡对象列表。
     * @param CertLoadBalancerSet 该证书关联的黑石负载均衡对象列表。
     */
    public void setCertLoadBalancerSet(CertDetailLoadBalancer [] CertLoadBalancerSet) {
        this.CertLoadBalancerSet = CertLoadBalancerSet;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "CertContent", this.CertContent);
        this.setParamSimple(map, prefix + "CertDomain", this.CertDomain);
        this.setParamArraySimple(map, prefix + "CertSubjectDomain.", this.CertSubjectDomain);
        this.setParamSimple(map, prefix + "CertUploadTime", this.CertUploadTime);
        this.setParamSimple(map, prefix + "CertBeginTime", this.CertBeginTime);
        this.setParamSimple(map, prefix + "CertEndTime", this.CertEndTime);
        this.setParamArrayObj(map, prefix + "CertLoadBalancerSet.", this.CertLoadBalancerSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

