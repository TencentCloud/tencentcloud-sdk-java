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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainDetailInfo extends AbstractModel {

    /**
    * <p>域名名称。</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>加速地区信息。</p>
    */
    @SerializedName("AccelerateAreaInfos")
    @Expose
    private AccelerateAreaInfo [] AccelerateAreaInfos;

    /**
    * <p>部署状态，取值有：</p><li>Online：上线；</li><li>Deploying：部署中；</li><li>Locked: 锁定中，出现该状态时，无法对该域名进行部署变更。</li>
    */
    @SerializedName("DeployStatus")
    @Expose
    private String DeployStatus;

    /**
    * <p>HTTPS 配置信息。</p>
    */
    @SerializedName("HTTPSConfig")
    @Expose
    private DomainHTTPSConfig HTTPSConfig;

    /**
    * <p><a href="https://cloud.tencent.com/document/product/266/14047">Key 防盗链</a>配置信息。</p>
    */
    @SerializedName("UrlSignatureAuthPolicy")
    @Expose
    private UrlSignatureAuthPolicy UrlSignatureAuthPolicy;

    /**
    * <p><a href="https://cloud.tencent.com/document/product/266/14046">Referer 防盗链</a>配置信息。</p>
    */
    @SerializedName("RefererAuthPolicy")
    @Expose
    private RefererAuthPolicy RefererAuthPolicy;

    /**
    * <p>域名添加到腾讯云点播系统中的时间。<li>格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</li></p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>域名 QUIC 配置信息。</p>
    */
    @SerializedName("QUICConfig")
    @Expose
    private DomainQUICConfig QUICConfig;

    /**
    * <p>IP 访问限制配置信息。</p>
    */
    @SerializedName("IPFilterPolicy")
    @Expose
    private IPFilterPolicy IPFilterPolicy;

    /**
    * <p>域名类型，取值有： <li>VOD：使用 VOD 产品分发的域名；</li> <li>EdgeOne：使用 EdgeOne 产品分发的域名。</li></p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>域名名称。</p> 
     * @return Domain <p>域名名称。</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名名称。</p>
     * @param Domain <p>域名名称。</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>加速地区信息。</p> 
     * @return AccelerateAreaInfos <p>加速地区信息。</p>
     */
    public AccelerateAreaInfo [] getAccelerateAreaInfos() {
        return this.AccelerateAreaInfos;
    }

    /**
     * Set <p>加速地区信息。</p>
     * @param AccelerateAreaInfos <p>加速地区信息。</p>
     */
    public void setAccelerateAreaInfos(AccelerateAreaInfo [] AccelerateAreaInfos) {
        this.AccelerateAreaInfos = AccelerateAreaInfos;
    }

    /**
     * Get <p>部署状态，取值有：</p><li>Online：上线；</li><li>Deploying：部署中；</li><li>Locked: 锁定中，出现该状态时，无法对该域名进行部署变更。</li> 
     * @return DeployStatus <p>部署状态，取值有：</p><li>Online：上线；</li><li>Deploying：部署中；</li><li>Locked: 锁定中，出现该状态时，无法对该域名进行部署变更。</li>
     */
    public String getDeployStatus() {
        return this.DeployStatus;
    }

    /**
     * Set <p>部署状态，取值有：</p><li>Online：上线；</li><li>Deploying：部署中；</li><li>Locked: 锁定中，出现该状态时，无法对该域名进行部署变更。</li>
     * @param DeployStatus <p>部署状态，取值有：</p><li>Online：上线；</li><li>Deploying：部署中；</li><li>Locked: 锁定中，出现该状态时，无法对该域名进行部署变更。</li>
     */
    public void setDeployStatus(String DeployStatus) {
        this.DeployStatus = DeployStatus;
    }

    /**
     * Get <p>HTTPS 配置信息。</p> 
     * @return HTTPSConfig <p>HTTPS 配置信息。</p>
     */
    public DomainHTTPSConfig getHTTPSConfig() {
        return this.HTTPSConfig;
    }

    /**
     * Set <p>HTTPS 配置信息。</p>
     * @param HTTPSConfig <p>HTTPS 配置信息。</p>
     */
    public void setHTTPSConfig(DomainHTTPSConfig HTTPSConfig) {
        this.HTTPSConfig = HTTPSConfig;
    }

    /**
     * Get <p><a href="https://cloud.tencent.com/document/product/266/14047">Key 防盗链</a>配置信息。</p> 
     * @return UrlSignatureAuthPolicy <p><a href="https://cloud.tencent.com/document/product/266/14047">Key 防盗链</a>配置信息。</p>
     */
    public UrlSignatureAuthPolicy getUrlSignatureAuthPolicy() {
        return this.UrlSignatureAuthPolicy;
    }

    /**
     * Set <p><a href="https://cloud.tencent.com/document/product/266/14047">Key 防盗链</a>配置信息。</p>
     * @param UrlSignatureAuthPolicy <p><a href="https://cloud.tencent.com/document/product/266/14047">Key 防盗链</a>配置信息。</p>
     */
    public void setUrlSignatureAuthPolicy(UrlSignatureAuthPolicy UrlSignatureAuthPolicy) {
        this.UrlSignatureAuthPolicy = UrlSignatureAuthPolicy;
    }

    /**
     * Get <p><a href="https://cloud.tencent.com/document/product/266/14046">Referer 防盗链</a>配置信息。</p> 
     * @return RefererAuthPolicy <p><a href="https://cloud.tencent.com/document/product/266/14046">Referer 防盗链</a>配置信息。</p>
     */
    public RefererAuthPolicy getRefererAuthPolicy() {
        return this.RefererAuthPolicy;
    }

    /**
     * Set <p><a href="https://cloud.tencent.com/document/product/266/14046">Referer 防盗链</a>配置信息。</p>
     * @param RefererAuthPolicy <p><a href="https://cloud.tencent.com/document/product/266/14046">Referer 防盗链</a>配置信息。</p>
     */
    public void setRefererAuthPolicy(RefererAuthPolicy RefererAuthPolicy) {
        this.RefererAuthPolicy = RefererAuthPolicy;
    }

    /**
     * Get <p>域名添加到腾讯云点播系统中的时间。<li>格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</li></p> 
     * @return CreateTime <p>域名添加到腾讯云点播系统中的时间。<li>格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</li></p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>域名添加到腾讯云点播系统中的时间。<li>格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</li></p>
     * @param CreateTime <p>域名添加到腾讯云点播系统中的时间。<li>格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</li></p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>域名 QUIC 配置信息。</p> 
     * @return QUICConfig <p>域名 QUIC 配置信息。</p>
     */
    public DomainQUICConfig getQUICConfig() {
        return this.QUICConfig;
    }

    /**
     * Set <p>域名 QUIC 配置信息。</p>
     * @param QUICConfig <p>域名 QUIC 配置信息。</p>
     */
    public void setQUICConfig(DomainQUICConfig QUICConfig) {
        this.QUICConfig = QUICConfig;
    }

    /**
     * Get <p>IP 访问限制配置信息。</p> 
     * @return IPFilterPolicy <p>IP 访问限制配置信息。</p>
     */
    public IPFilterPolicy getIPFilterPolicy() {
        return this.IPFilterPolicy;
    }

    /**
     * Set <p>IP 访问限制配置信息。</p>
     * @param IPFilterPolicy <p>IP 访问限制配置信息。</p>
     */
    public void setIPFilterPolicy(IPFilterPolicy IPFilterPolicy) {
        this.IPFilterPolicy = IPFilterPolicy;
    }

    /**
     * Get <p>域名类型，取值有： <li>VOD：使用 VOD 产品分发的域名；</li> <li>EdgeOne：使用 EdgeOne 产品分发的域名。</li></p> 
     * @return Type <p>域名类型，取值有： <li>VOD：使用 VOD 产品分发的域名；</li> <li>EdgeOne：使用 EdgeOne 产品分发的域名。</li></p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>域名类型，取值有： <li>VOD：使用 VOD 产品分发的域名；</li> <li>EdgeOne：使用 EdgeOne 产品分发的域名。</li></p>
     * @param Type <p>域名类型，取值有： <li>VOD：使用 VOD 产品分发的域名；</li> <li>EdgeOne：使用 EdgeOne 产品分发的域名。</li></p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DomainDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainDetailInfo(DomainDetailInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AccelerateAreaInfos != null) {
            this.AccelerateAreaInfos = new AccelerateAreaInfo[source.AccelerateAreaInfos.length];
            for (int i = 0; i < source.AccelerateAreaInfos.length; i++) {
                this.AccelerateAreaInfos[i] = new AccelerateAreaInfo(source.AccelerateAreaInfos[i]);
            }
        }
        if (source.DeployStatus != null) {
            this.DeployStatus = new String(source.DeployStatus);
        }
        if (source.HTTPSConfig != null) {
            this.HTTPSConfig = new DomainHTTPSConfig(source.HTTPSConfig);
        }
        if (source.UrlSignatureAuthPolicy != null) {
            this.UrlSignatureAuthPolicy = new UrlSignatureAuthPolicy(source.UrlSignatureAuthPolicy);
        }
        if (source.RefererAuthPolicy != null) {
            this.RefererAuthPolicy = new RefererAuthPolicy(source.RefererAuthPolicy);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.QUICConfig != null) {
            this.QUICConfig = new DomainQUICConfig(source.QUICConfig);
        }
        if (source.IPFilterPolicy != null) {
            this.IPFilterPolicy = new IPFilterPolicy(source.IPFilterPolicy);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "AccelerateAreaInfos.", this.AccelerateAreaInfos);
        this.setParamSimple(map, prefix + "DeployStatus", this.DeployStatus);
        this.setParamObj(map, prefix + "HTTPSConfig.", this.HTTPSConfig);
        this.setParamObj(map, prefix + "UrlSignatureAuthPolicy.", this.UrlSignatureAuthPolicy);
        this.setParamObj(map, prefix + "RefererAuthPolicy.", this.RefererAuthPolicy);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "QUICConfig.", this.QUICConfig);
        this.setParamObj(map, prefix + "IPFilterPolicy.", this.IPFilterPolicy);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

