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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddEcdnDomainRequest extends AbstractModel{

    /**
    * 域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 源站配置。
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * 域名加速区域，mainland，overseas或global，分别表示中国境内加速，海外加速或全球加速。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 项目id，默认0。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * IP黑白名单配置。
    */
    @SerializedName("IpFilter")
    @Expose
    private IpFilter IpFilter;

    /**
    * IP限频配置。
    */
    @SerializedName("IpFreqLimit")
    @Expose
    private IpFreqLimit IpFreqLimit;

    /**
    * 源站响应头部配置。
    */
    @SerializedName("ResponseHeader")
    @Expose
    private ResponseHeader ResponseHeader;

    /**
    * 节点缓存配置。
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * 缓存规则配置。
    */
    @SerializedName("Cache")
    @Expose
    private Cache Cache;

    /**
    * Https配置。
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * 访问协议强制跳转配置。
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * 域名绑定的标签
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * WebSocket配置
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocket WebSocket;

    /**
     * Get 域名。 
     * @return Domain 域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名。
     * @param Domain 域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 源站配置。 
     * @return Origin 源站配置。
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站配置。
     * @param Origin 源站配置。
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 域名加速区域，mainland，overseas或global，分别表示中国境内加速，海外加速或全球加速。 
     * @return Area 域名加速区域，mainland，overseas或global，分别表示中国境内加速，海外加速或全球加速。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 域名加速区域，mainland，overseas或global，分别表示中国境内加速，海外加速或全球加速。
     * @param Area 域名加速区域，mainland，overseas或global，分别表示中国境内加速，海外加速或全球加速。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 项目id，默认0。 
     * @return ProjectId 项目id，默认0。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id，默认0。
     * @param ProjectId 项目id，默认0。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get IP黑白名单配置。 
     * @return IpFilter IP黑白名单配置。
     */
    public IpFilter getIpFilter() {
        return this.IpFilter;
    }

    /**
     * Set IP黑白名单配置。
     * @param IpFilter IP黑白名单配置。
     */
    public void setIpFilter(IpFilter IpFilter) {
        this.IpFilter = IpFilter;
    }

    /**
     * Get IP限频配置。 
     * @return IpFreqLimit IP限频配置。
     */
    public IpFreqLimit getIpFreqLimit() {
        return this.IpFreqLimit;
    }

    /**
     * Set IP限频配置。
     * @param IpFreqLimit IP限频配置。
     */
    public void setIpFreqLimit(IpFreqLimit IpFreqLimit) {
        this.IpFreqLimit = IpFreqLimit;
    }

    /**
     * Get 源站响应头部配置。 
     * @return ResponseHeader 源站响应头部配置。
     */
    public ResponseHeader getResponseHeader() {
        return this.ResponseHeader;
    }

    /**
     * Set 源站响应头部配置。
     * @param ResponseHeader 源站响应头部配置。
     */
    public void setResponseHeader(ResponseHeader ResponseHeader) {
        this.ResponseHeader = ResponseHeader;
    }

    /**
     * Get 节点缓存配置。 
     * @return CacheKey 节点缓存配置。
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set 节点缓存配置。
     * @param CacheKey 节点缓存配置。
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get 缓存规则配置。 
     * @return Cache 缓存规则配置。
     */
    public Cache getCache() {
        return this.Cache;
    }

    /**
     * Set 缓存规则配置。
     * @param Cache 缓存规则配置。
     */
    public void setCache(Cache Cache) {
        this.Cache = Cache;
    }

    /**
     * Get Https配置。 
     * @return Https Https配置。
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set Https配置。
     * @param Https Https配置。
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get 访问协议强制跳转配置。 
     * @return ForceRedirect 访问协议强制跳转配置。
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set 访问协议强制跳转配置。
     * @param ForceRedirect 访问协议强制跳转配置。
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get 域名绑定的标签 
     * @return Tag 域名绑定的标签
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 域名绑定的标签
     * @param Tag 域名绑定的标签
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get WebSocket配置 
     * @return WebSocket WebSocket配置
     */
    public WebSocket getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set WebSocket配置
     * @param WebSocket WebSocket配置
     */
    public void setWebSocket(WebSocket WebSocket) {
        this.WebSocket = WebSocket;
    }

    public AddEcdnDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddEcdnDomainRequest(AddEcdnDomainRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Origin != null) {
            this.Origin = new Origin(source.Origin);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.IpFilter != null) {
            this.IpFilter = new IpFilter(source.IpFilter);
        }
        if (source.IpFreqLimit != null) {
            this.IpFreqLimit = new IpFreqLimit(source.IpFreqLimit);
        }
        if (source.ResponseHeader != null) {
            this.ResponseHeader = new ResponseHeader(source.ResponseHeader);
        }
        if (source.CacheKey != null) {
            this.CacheKey = new CacheKey(source.CacheKey);
        }
        if (source.Cache != null) {
            this.Cache = new Cache(source.Cache);
        }
        if (source.Https != null) {
            this.Https = new Https(source.Https);
        }
        if (source.ForceRedirect != null) {
            this.ForceRedirect = new ForceRedirect(source.ForceRedirect);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.WebSocket != null) {
            this.WebSocket = new WebSocket(source.WebSocket);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "IpFilter.", this.IpFilter);
        this.setParamObj(map, prefix + "IpFreqLimit.", this.IpFreqLimit);
        this.setParamObj(map, prefix + "ResponseHeader.", this.ResponseHeader);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamObj(map, prefix + "Https.", this.Https);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamObj(map, prefix + "WebSocket.", this.WebSocket);

    }
}

