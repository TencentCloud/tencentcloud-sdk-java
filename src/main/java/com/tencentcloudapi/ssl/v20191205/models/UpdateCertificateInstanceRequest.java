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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCertificateInstanceRequest extends AbstractModel {

    /**
    * <p>一键更新的旧证书ID。 通过查询该证书ID绑定的云资源，然后使用新证书对这些云资源进行更新</p>
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * <p>需要部署的资源类型，参数值可选（小写）：clb、cdn、waf、live、ddos、teo、apigateway、vod、tke、tcb、tse、cos、mqtt、scf、tdmq、gaap</p>
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * <p>一键更新的新证书ID。 不传该参数，则公钥证书和私钥证书必传</p>
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * <p>需要部署的地域列表（废弃）</p>
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
    * <p>云资源需要部署的地域列表，支持地域的云资源类型必传，取值：clb、tke、apigateway、waf、tcb、tse、cos、mqtt、scf、tdmq</p>
    */
    @SerializedName("ResourceTypesRegions")
    @Expose
    private ResourceTypeRegions [] ResourceTypesRegions;

    /**
    * <p>公钥证书， 若上传公钥证书，那么私钥证书必传。  则CertificateId不用传</p>
    */
    @SerializedName("CertificatePublicKey")
    @Expose
    private String CertificatePublicKey;

    /**
    * <p>私钥证书，若上传私钥证书， 那么公钥证书必传；  则CertificateId不用传</p>
    */
    @SerializedName("CertificatePrivateKey")
    @Expose
    private String CertificatePrivateKey;

    /**
    * <p>旧证书是否忽略到期提醒  0:不忽略通知。1:忽略通知，忽略OldCertificateId到期提醒</p>
    */
    @SerializedName("ExpiringNotificationSwitch")
    @Expose
    private Long ExpiringNotificationSwitch;

    /**
    * <p>相同的证书是否允许重复上传，若选择上传公钥私钥证书， 则可以配置该参数。 若存在相同重复证书，则更新任务会失败</p>
    */
    @SerializedName("Repeatable")
    @Expose
    private Boolean Repeatable;

    /**
    * <p>是否允许下载，若选择上传公私钥证书， 则可以配置该参数</p>
    */
    @SerializedName("AllowDownload")
    @Expose
    private Boolean AllowDownload;

    /**
    * <p>标签列表，若选择上传公私钥证书， 则可以配置该参数</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * <p>项目 ID，若选择上传公私钥证书， 则可以配置该参数</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get <p>一键更新的旧证书ID。 通过查询该证书ID绑定的云资源，然后使用新证书对这些云资源进行更新</p> 
     * @return OldCertificateId <p>一键更新的旧证书ID。 通过查询该证书ID绑定的云资源，然后使用新证书对这些云资源进行更新</p>
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set <p>一键更新的旧证书ID。 通过查询该证书ID绑定的云资源，然后使用新证书对这些云资源进行更新</p>
     * @param OldCertificateId <p>一键更新的旧证书ID。 通过查询该证书ID绑定的云资源，然后使用新证书对这些云资源进行更新</p>
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get <p>需要部署的资源类型，参数值可选（小写）：clb、cdn、waf、live、ddos、teo、apigateway、vod、tke、tcb、tse、cos、mqtt、scf、tdmq、gaap</p> 
     * @return ResourceTypes <p>需要部署的资源类型，参数值可选（小写）：clb、cdn、waf、live、ddos、teo、apigateway、vod、tke、tcb、tse、cos、mqtt、scf、tdmq、gaap</p>
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set <p>需要部署的资源类型，参数值可选（小写）：clb、cdn、waf、live、ddos、teo、apigateway、vod、tke、tcb、tse、cos、mqtt、scf、tdmq、gaap</p>
     * @param ResourceTypes <p>需要部署的资源类型，参数值可选（小写）：clb、cdn、waf、live、ddos、teo、apigateway、vod、tke、tcb、tse、cos、mqtt、scf、tdmq、gaap</p>
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get <p>一键更新的新证书ID。 不传该参数，则公钥证书和私钥证书必传</p> 
     * @return CertificateId <p>一键更新的新证书ID。 不传该参数，则公钥证书和私钥证书必传</p>
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set <p>一键更新的新证书ID。 不传该参数，则公钥证书和私钥证书必传</p>
     * @param CertificateId <p>一键更新的新证书ID。 不传该参数，则公钥证书和私钥证书必传</p>
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get <p>需要部署的地域列表（废弃）</p> 
     * @return Regions <p>需要部署的地域列表（废弃）</p>
     * @deprecated
     */
    @Deprecated
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set <p>需要部署的地域列表（废弃）</p>
     * @param Regions <p>需要部署的地域列表（废弃）</p>
     * @deprecated
     */
    @Deprecated
    public void setRegions(String [] Regions) {
        this.Regions = Regions;
    }

    /**
     * Get <p>云资源需要部署的地域列表，支持地域的云资源类型必传，取值：clb、tke、apigateway、waf、tcb、tse、cos、mqtt、scf、tdmq</p> 
     * @return ResourceTypesRegions <p>云资源需要部署的地域列表，支持地域的云资源类型必传，取值：clb、tke、apigateway、waf、tcb、tse、cos、mqtt、scf、tdmq</p>
     */
    public ResourceTypeRegions [] getResourceTypesRegions() {
        return this.ResourceTypesRegions;
    }

    /**
     * Set <p>云资源需要部署的地域列表，支持地域的云资源类型必传，取值：clb、tke、apigateway、waf、tcb、tse、cos、mqtt、scf、tdmq</p>
     * @param ResourceTypesRegions <p>云资源需要部署的地域列表，支持地域的云资源类型必传，取值：clb、tke、apigateway、waf、tcb、tse、cos、mqtt、scf、tdmq</p>
     */
    public void setResourceTypesRegions(ResourceTypeRegions [] ResourceTypesRegions) {
        this.ResourceTypesRegions = ResourceTypesRegions;
    }

    /**
     * Get <p>公钥证书， 若上传公钥证书，那么私钥证书必传。  则CertificateId不用传</p> 
     * @return CertificatePublicKey <p>公钥证书， 若上传公钥证书，那么私钥证书必传。  则CertificateId不用传</p>
     */
    public String getCertificatePublicKey() {
        return this.CertificatePublicKey;
    }

    /**
     * Set <p>公钥证书， 若上传公钥证书，那么私钥证书必传。  则CertificateId不用传</p>
     * @param CertificatePublicKey <p>公钥证书， 若上传公钥证书，那么私钥证书必传。  则CertificateId不用传</p>
     */
    public void setCertificatePublicKey(String CertificatePublicKey) {
        this.CertificatePublicKey = CertificatePublicKey;
    }

    /**
     * Get <p>私钥证书，若上传私钥证书， 那么公钥证书必传；  则CertificateId不用传</p> 
     * @return CertificatePrivateKey <p>私钥证书，若上传私钥证书， 那么公钥证书必传；  则CertificateId不用传</p>
     */
    public String getCertificatePrivateKey() {
        return this.CertificatePrivateKey;
    }

    /**
     * Set <p>私钥证书，若上传私钥证书， 那么公钥证书必传；  则CertificateId不用传</p>
     * @param CertificatePrivateKey <p>私钥证书，若上传私钥证书， 那么公钥证书必传；  则CertificateId不用传</p>
     */
    public void setCertificatePrivateKey(String CertificatePrivateKey) {
        this.CertificatePrivateKey = CertificatePrivateKey;
    }

    /**
     * Get <p>旧证书是否忽略到期提醒  0:不忽略通知。1:忽略通知，忽略OldCertificateId到期提醒</p> 
     * @return ExpiringNotificationSwitch <p>旧证书是否忽略到期提醒  0:不忽略通知。1:忽略通知，忽略OldCertificateId到期提醒</p>
     */
    public Long getExpiringNotificationSwitch() {
        return this.ExpiringNotificationSwitch;
    }

    /**
     * Set <p>旧证书是否忽略到期提醒  0:不忽略通知。1:忽略通知，忽略OldCertificateId到期提醒</p>
     * @param ExpiringNotificationSwitch <p>旧证书是否忽略到期提醒  0:不忽略通知。1:忽略通知，忽略OldCertificateId到期提醒</p>
     */
    public void setExpiringNotificationSwitch(Long ExpiringNotificationSwitch) {
        this.ExpiringNotificationSwitch = ExpiringNotificationSwitch;
    }

    /**
     * Get <p>相同的证书是否允许重复上传，若选择上传公钥私钥证书， 则可以配置该参数。 若存在相同重复证书，则更新任务会失败</p> 
     * @return Repeatable <p>相同的证书是否允许重复上传，若选择上传公钥私钥证书， 则可以配置该参数。 若存在相同重复证书，则更新任务会失败</p>
     */
    public Boolean getRepeatable() {
        return this.Repeatable;
    }

    /**
     * Set <p>相同的证书是否允许重复上传，若选择上传公钥私钥证书， 则可以配置该参数。 若存在相同重复证书，则更新任务会失败</p>
     * @param Repeatable <p>相同的证书是否允许重复上传，若选择上传公钥私钥证书， 则可以配置该参数。 若存在相同重复证书，则更新任务会失败</p>
     */
    public void setRepeatable(Boolean Repeatable) {
        this.Repeatable = Repeatable;
    }

    /**
     * Get <p>是否允许下载，若选择上传公私钥证书， 则可以配置该参数</p> 
     * @return AllowDownload <p>是否允许下载，若选择上传公私钥证书， 则可以配置该参数</p>
     */
    public Boolean getAllowDownload() {
        return this.AllowDownload;
    }

    /**
     * Set <p>是否允许下载，若选择上传公私钥证书， 则可以配置该参数</p>
     * @param AllowDownload <p>是否允许下载，若选择上传公私钥证书， 则可以配置该参数</p>
     */
    public void setAllowDownload(Boolean AllowDownload) {
        this.AllowDownload = AllowDownload;
    }

    /**
     * Get <p>标签列表，若选择上传公私钥证书， 则可以配置该参数</p> 
     * @return Tags <p>标签列表，若选择上传公私钥证书， 则可以配置该参数</p>
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表，若选择上传公私钥证书， 则可以配置该参数</p>
     * @param Tags <p>标签列表，若选择上传公私钥证书， 则可以配置该参数</p>
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>项目 ID，若选择上传公私钥证书， 则可以配置该参数</p> 
     * @return ProjectId <p>项目 ID，若选择上传公私钥证书， 则可以配置该参数</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID，若选择上传公私钥证书， 则可以配置该参数</p>
     * @param ProjectId <p>项目 ID，若选择上传公私钥证书， 则可以配置该参数</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    public UpdateCertificateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCertificateInstanceRequest(UpdateCertificateInstanceRequest source) {
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
        if (source.ResourceTypes != null) {
            this.ResourceTypes = new String[source.ResourceTypes.length];
            for (int i = 0; i < source.ResourceTypes.length; i++) {
                this.ResourceTypes[i] = new String(source.ResourceTypes[i]);
            }
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.Regions != null) {
            this.Regions = new String[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new String(source.Regions[i]);
            }
        }
        if (source.ResourceTypesRegions != null) {
            this.ResourceTypesRegions = new ResourceTypeRegions[source.ResourceTypesRegions.length];
            for (int i = 0; i < source.ResourceTypesRegions.length; i++) {
                this.ResourceTypesRegions[i] = new ResourceTypeRegions(source.ResourceTypesRegions[i]);
            }
        }
        if (source.CertificatePublicKey != null) {
            this.CertificatePublicKey = new String(source.CertificatePublicKey);
        }
        if (source.CertificatePrivateKey != null) {
            this.CertificatePrivateKey = new String(source.CertificatePrivateKey);
        }
        if (source.ExpiringNotificationSwitch != null) {
            this.ExpiringNotificationSwitch = new Long(source.ExpiringNotificationSwitch);
        }
        if (source.Repeatable != null) {
            this.Repeatable = new Boolean(source.Repeatable);
        }
        if (source.AllowDownload != null) {
            this.AllowDownload = new Boolean(source.AllowDownload);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);
        this.setParamArraySimple(map, prefix + "ResourceTypes.", this.ResourceTypes);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamArraySimple(map, prefix + "Regions.", this.Regions);
        this.setParamArrayObj(map, prefix + "ResourceTypesRegions.", this.ResourceTypesRegions);
        this.setParamSimple(map, prefix + "CertificatePublicKey", this.CertificatePublicKey);
        this.setParamSimple(map, prefix + "CertificatePrivateKey", this.CertificatePrivateKey);
        this.setParamSimple(map, prefix + "ExpiringNotificationSwitch", this.ExpiringNotificationSwitch);
        this.setParamSimple(map, prefix + "Repeatable", this.Repeatable);
        this.setParamSimple(map, prefix + "AllowDownload", this.AllowDownload);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

