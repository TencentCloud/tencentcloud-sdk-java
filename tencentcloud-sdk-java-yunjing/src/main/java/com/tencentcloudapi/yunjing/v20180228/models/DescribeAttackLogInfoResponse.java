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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAttackLogInfoResponse extends AbstractModel{

    /**
    * 日志ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 攻击来源端口
    */
    @SerializedName("SrcPort")
    @Expose
    private Long SrcPort;

    /**
    * 攻击来源IP
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 攻击目标端口
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * 攻击目标IP
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * 攻击方法
    */
    @SerializedName("HttpMethod")
    @Expose
    private String HttpMethod;

    /**
    * 攻击目标主机
    */
    @SerializedName("HttpHost")
    @Expose
    private String HttpHost;

    /**
    * 攻击头信息
    */
    @SerializedName("HttpHead")
    @Expose
    private String HttpHead;

    /**
    * 攻击者浏览器标识
    */
    @SerializedName("HttpUserAgent")
    @Expose
    private String HttpUserAgent;

    /**
    * 请求源
    */
    @SerializedName("HttpReferer")
    @Expose
    private String HttpReferer;

    /**
    * 威胁类型
    */
    @SerializedName("VulType")
    @Expose
    private String VulType;

    /**
    * 攻击路径
    */
    @SerializedName("HttpCgi")
    @Expose
    private String HttpCgi;

    /**
    * 攻击参数
    */
    @SerializedName("HttpParam")
    @Expose
    private String HttpParam;

    /**
    * 攻击时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 攻击内容
    */
    @SerializedName("HttpContent")
    @Expose
    private String HttpContent;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志ID 
     * @return Id 日志ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 日志ID
     * @param Id 日志ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 主机ID 
     * @return Quuid 主机ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机ID
     * @param Quuid 主机ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 攻击来源端口 
     * @return SrcPort 攻击来源端口
     */
    public Long getSrcPort() {
        return this.SrcPort;
    }

    /**
     * Set 攻击来源端口
     * @param SrcPort 攻击来源端口
     */
    public void setSrcPort(Long SrcPort) {
        this.SrcPort = SrcPort;
    }

    /**
     * Get 攻击来源IP 
     * @return SrcIp 攻击来源IP
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 攻击来源IP
     * @param SrcIp 攻击来源IP
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 攻击目标端口 
     * @return DstPort 攻击目标端口
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 攻击目标端口
     * @param DstPort 攻击目标端口
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get 攻击目标IP 
     * @return DstIp 攻击目标IP
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set 攻击目标IP
     * @param DstIp 攻击目标IP
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get 攻击方法 
     * @return HttpMethod 攻击方法
     */
    public String getHttpMethod() {
        return this.HttpMethod;
    }

    /**
     * Set 攻击方法
     * @param HttpMethod 攻击方法
     */
    public void setHttpMethod(String HttpMethod) {
        this.HttpMethod = HttpMethod;
    }

    /**
     * Get 攻击目标主机 
     * @return HttpHost 攻击目标主机
     */
    public String getHttpHost() {
        return this.HttpHost;
    }

    /**
     * Set 攻击目标主机
     * @param HttpHost 攻击目标主机
     */
    public void setHttpHost(String HttpHost) {
        this.HttpHost = HttpHost;
    }

    /**
     * Get 攻击头信息 
     * @return HttpHead 攻击头信息
     */
    public String getHttpHead() {
        return this.HttpHead;
    }

    /**
     * Set 攻击头信息
     * @param HttpHead 攻击头信息
     */
    public void setHttpHead(String HttpHead) {
        this.HttpHead = HttpHead;
    }

    /**
     * Get 攻击者浏览器标识 
     * @return HttpUserAgent 攻击者浏览器标识
     */
    public String getHttpUserAgent() {
        return this.HttpUserAgent;
    }

    /**
     * Set 攻击者浏览器标识
     * @param HttpUserAgent 攻击者浏览器标识
     */
    public void setHttpUserAgent(String HttpUserAgent) {
        this.HttpUserAgent = HttpUserAgent;
    }

    /**
     * Get 请求源 
     * @return HttpReferer 请求源
     */
    public String getHttpReferer() {
        return this.HttpReferer;
    }

    /**
     * Set 请求源
     * @param HttpReferer 请求源
     */
    public void setHttpReferer(String HttpReferer) {
        this.HttpReferer = HttpReferer;
    }

    /**
     * Get 威胁类型 
     * @return VulType 威胁类型
     */
    public String getVulType() {
        return this.VulType;
    }

    /**
     * Set 威胁类型
     * @param VulType 威胁类型
     */
    public void setVulType(String VulType) {
        this.VulType = VulType;
    }

    /**
     * Get 攻击路径 
     * @return HttpCgi 攻击路径
     */
    public String getHttpCgi() {
        return this.HttpCgi;
    }

    /**
     * Set 攻击路径
     * @param HttpCgi 攻击路径
     */
    public void setHttpCgi(String HttpCgi) {
        this.HttpCgi = HttpCgi;
    }

    /**
     * Get 攻击参数 
     * @return HttpParam 攻击参数
     */
    public String getHttpParam() {
        return this.HttpParam;
    }

    /**
     * Set 攻击参数
     * @param HttpParam 攻击参数
     */
    public void setHttpParam(String HttpParam) {
        this.HttpParam = HttpParam;
    }

    /**
     * Get 攻击时间 
     * @return CreatedAt 攻击时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 攻击时间
     * @param CreatedAt 攻击时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 攻击内容 
     * @return HttpContent 攻击内容
     */
    public String getHttpContent() {
        return this.HttpContent;
    }

    /**
     * Set 攻击内容
     * @param HttpContent 攻击内容
     */
    public void setHttpContent(String HttpContent) {
        this.HttpContent = HttpContent;
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "SrcPort", this.SrcPort);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "HttpMethod", this.HttpMethod);
        this.setParamSimple(map, prefix + "HttpHost", this.HttpHost);
        this.setParamSimple(map, prefix + "HttpHead", this.HttpHead);
        this.setParamSimple(map, prefix + "HttpUserAgent", this.HttpUserAgent);
        this.setParamSimple(map, prefix + "HttpReferer", this.HttpReferer);
        this.setParamSimple(map, prefix + "VulType", this.VulType);
        this.setParamSimple(map, prefix + "HttpCgi", this.HttpCgi);
        this.setParamSimple(map, prefix + "HttpParam", this.HttpParam);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "HttpContent", this.HttpContent);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

