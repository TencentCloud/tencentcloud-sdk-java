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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainDetailInfo extends AbstractModel{

    /**
    * 域名名称。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 加速地区信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccelerateAreaInfos")
    @Expose
    private AccelerateAreaInfo [] AccelerateAreaInfos;

    /**
    * 部署状态，取值有：
<li>Online：上线；</li>
<li>Deploying：部署中；</li>
<li>Locked: 锁定中，出现该状态时，无法对该域名进行部署变更。</li>
    */
    @SerializedName("DeployStatus")
    @Expose
    private String DeployStatus;

    /**
    * HTTPS 配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HTTPSConfig")
    @Expose
    private DomainHTTPSConfig HTTPSConfig;

    /**
    * [Key 防盗链](https://cloud.tencent.com/document/product/266/14047)配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UrlSignatureAuthPolicy")
    @Expose
    private UrlSignatureAuthPolicy UrlSignatureAuthPolicy;

    /**
    * [Referer 防盗链](https://cloud.tencent.com/document/product/266/14046)配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefererAuthPolicy")
    @Expose
    private RefererAuthPolicy RefererAuthPolicy;

    /**
    * 域名添加到腾讯云点播系统中的时间。
<li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。</li>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 域名名称。 
     * @return Domain 域名名称。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名名称。
     * @param Domain 域名名称。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 加速地区信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccelerateAreaInfos 加速地区信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccelerateAreaInfo [] getAccelerateAreaInfos() {
        return this.AccelerateAreaInfos;
    }

    /**
     * Set 加速地区信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccelerateAreaInfos 加速地区信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccelerateAreaInfos(AccelerateAreaInfo [] AccelerateAreaInfos) {
        this.AccelerateAreaInfos = AccelerateAreaInfos;
    }

    /**
     * Get 部署状态，取值有：
<li>Online：上线；</li>
<li>Deploying：部署中；</li>
<li>Locked: 锁定中，出现该状态时，无法对该域名进行部署变更。</li> 
     * @return DeployStatus 部署状态，取值有：
<li>Online：上线；</li>
<li>Deploying：部署中；</li>
<li>Locked: 锁定中，出现该状态时，无法对该域名进行部署变更。</li>
     */
    public String getDeployStatus() {
        return this.DeployStatus;
    }

    /**
     * Set 部署状态，取值有：
<li>Online：上线；</li>
<li>Deploying：部署中；</li>
<li>Locked: 锁定中，出现该状态时，无法对该域名进行部署变更。</li>
     * @param DeployStatus 部署状态，取值有：
<li>Online：上线；</li>
<li>Deploying：部署中；</li>
<li>Locked: 锁定中，出现该状态时，无法对该域名进行部署变更。</li>
     */
    public void setDeployStatus(String DeployStatus) {
        this.DeployStatus = DeployStatus;
    }

    /**
     * Get HTTPS 配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HTTPSConfig HTTPS 配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DomainHTTPSConfig getHTTPSConfig() {
        return this.HTTPSConfig;
    }

    /**
     * Set HTTPS 配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HTTPSConfig HTTPS 配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHTTPSConfig(DomainHTTPSConfig HTTPSConfig) {
        this.HTTPSConfig = HTTPSConfig;
    }

    /**
     * Get [Key 防盗链](https://cloud.tencent.com/document/product/266/14047)配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UrlSignatureAuthPolicy [Key 防盗链](https://cloud.tencent.com/document/product/266/14047)配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UrlSignatureAuthPolicy getUrlSignatureAuthPolicy() {
        return this.UrlSignatureAuthPolicy;
    }

    /**
     * Set [Key 防盗链](https://cloud.tencent.com/document/product/266/14047)配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UrlSignatureAuthPolicy [Key 防盗链](https://cloud.tencent.com/document/product/266/14047)配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrlSignatureAuthPolicy(UrlSignatureAuthPolicy UrlSignatureAuthPolicy) {
        this.UrlSignatureAuthPolicy = UrlSignatureAuthPolicy;
    }

    /**
     * Get [Referer 防盗链](https://cloud.tencent.com/document/product/266/14046)配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefererAuthPolicy [Referer 防盗链](https://cloud.tencent.com/document/product/266/14046)配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RefererAuthPolicy getRefererAuthPolicy() {
        return this.RefererAuthPolicy;
    }

    /**
     * Set [Referer 防盗链](https://cloud.tencent.com/document/product/266/14046)配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefererAuthPolicy [Referer 防盗链](https://cloud.tencent.com/document/product/266/14046)配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefererAuthPolicy(RefererAuthPolicy RefererAuthPolicy) {
        this.RefererAuthPolicy = RefererAuthPolicy;
    }

    /**
     * Get 域名添加到腾讯云点播系统中的时间。
<li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。</li> 
     * @return CreateTime 域名添加到腾讯云点播系统中的时间。
<li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。</li>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 域名添加到腾讯云点播系统中的时间。
<li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。</li>
     * @param CreateTime 域名添加到腾讯云点播系统中的时间。
<li>格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。</li>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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

    }
}

