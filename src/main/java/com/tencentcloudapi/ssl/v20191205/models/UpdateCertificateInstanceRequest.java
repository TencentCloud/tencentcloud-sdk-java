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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCertificateInstanceRequest extends AbstractModel {

    /**
    * 一键更新原证书ID， 查询绑定该证书的云资源然后进行证书更新
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * 需要部署的资源类型，参数值可选（小写）：clb、cdn、waf、live、ddos、teo、apigateway、vod、tke、tcb、tse
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * 一键更新新证书ID，不传该则证书公钥和私钥必传
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 需要部署的地域列表（废弃）
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
    * 云资源需要部署的地域列表，支持地域的云资源类型必传，如：clb、tke、apigateway、waf、tcb、tse等
    */
    @SerializedName("ResourceTypesRegions")
    @Expose
    private ResourceTypeRegions [] ResourceTypesRegions;

    /**
    * 证书公钥， 若上传证书公钥， 则CertificateId不用传
    */
    @SerializedName("CertificatePublicKey")
    @Expose
    private String CertificatePublicKey;

    /**
    * 证书私钥，若上传证书公钥， 则CertificateId不用传
    */
    @SerializedName("CertificatePrivateKey")
    @Expose
    private String CertificatePrivateKey;

    /**
    * 旧证书是否忽略到期提醒  0:不忽略通知。1:忽略通知，忽略OldCertificateId到期提醒
    */
    @SerializedName("ExpiringNotificationSwitch")
    @Expose
    private Long ExpiringNotificationSwitch;

    /**
    * 相同的证书是否允许重复上传，若选择上传证书， 则可以配置该参数
    */
    @SerializedName("Repeatable")
    @Expose
    private Boolean Repeatable;

    /**
    * 是否允许下载，若选择上传证书， 则可以配置该参数
    */
    @SerializedName("AllowDownload")
    @Expose
    private Boolean AllowDownload;

    /**
    * 标签列表，若选择上传证书， 则可以配置该参数
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * 项目 ID，若选择上传证书， 则可以配置该参数
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get 一键更新原证书ID， 查询绑定该证书的云资源然后进行证书更新 
     * @return OldCertificateId 一键更新原证书ID， 查询绑定该证书的云资源然后进行证书更新
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set 一键更新原证书ID， 查询绑定该证书的云资源然后进行证书更新
     * @param OldCertificateId 一键更新原证书ID， 查询绑定该证书的云资源然后进行证书更新
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get 需要部署的资源类型，参数值可选（小写）：clb、cdn、waf、live、ddos、teo、apigateway、vod、tke、tcb、tse 
     * @return ResourceTypes 需要部署的资源类型，参数值可选（小写）：clb、cdn、waf、live、ddos、teo、apigateway、vod、tke、tcb、tse
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set 需要部署的资源类型，参数值可选（小写）：clb、cdn、waf、live、ddos、teo、apigateway、vod、tke、tcb、tse
     * @param ResourceTypes 需要部署的资源类型，参数值可选（小写）：clb、cdn、waf、live、ddos、teo、apigateway、vod、tke、tcb、tse
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get 一键更新新证书ID，不传该则证书公钥和私钥必传 
     * @return CertificateId 一键更新新证书ID，不传该则证书公钥和私钥必传
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 一键更新新证书ID，不传该则证书公钥和私钥必传
     * @param CertificateId 一键更新新证书ID，不传该则证书公钥和私钥必传
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 需要部署的地域列表（废弃） 
     * @return Regions 需要部署的地域列表（废弃）
     * @deprecated
     */
    @Deprecated
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set 需要部署的地域列表（废弃）
     * @param Regions 需要部署的地域列表（废弃）
     * @deprecated
     */
    @Deprecated
    public void setRegions(String [] Regions) {
        this.Regions = Regions;
    }

    /**
     * Get 云资源需要部署的地域列表，支持地域的云资源类型必传，如：clb、tke、apigateway、waf、tcb、tse等 
     * @return ResourceTypesRegions 云资源需要部署的地域列表，支持地域的云资源类型必传，如：clb、tke、apigateway、waf、tcb、tse等
     */
    public ResourceTypeRegions [] getResourceTypesRegions() {
        return this.ResourceTypesRegions;
    }

    /**
     * Set 云资源需要部署的地域列表，支持地域的云资源类型必传，如：clb、tke、apigateway、waf、tcb、tse等
     * @param ResourceTypesRegions 云资源需要部署的地域列表，支持地域的云资源类型必传，如：clb、tke、apigateway、waf、tcb、tse等
     */
    public void setResourceTypesRegions(ResourceTypeRegions [] ResourceTypesRegions) {
        this.ResourceTypesRegions = ResourceTypesRegions;
    }

    /**
     * Get 证书公钥， 若上传证书公钥， 则CertificateId不用传 
     * @return CertificatePublicKey 证书公钥， 若上传证书公钥， 则CertificateId不用传
     */
    public String getCertificatePublicKey() {
        return this.CertificatePublicKey;
    }

    /**
     * Set 证书公钥， 若上传证书公钥， 则CertificateId不用传
     * @param CertificatePublicKey 证书公钥， 若上传证书公钥， 则CertificateId不用传
     */
    public void setCertificatePublicKey(String CertificatePublicKey) {
        this.CertificatePublicKey = CertificatePublicKey;
    }

    /**
     * Get 证书私钥，若上传证书公钥， 则CertificateId不用传 
     * @return CertificatePrivateKey 证书私钥，若上传证书公钥， 则CertificateId不用传
     */
    public String getCertificatePrivateKey() {
        return this.CertificatePrivateKey;
    }

    /**
     * Set 证书私钥，若上传证书公钥， 则CertificateId不用传
     * @param CertificatePrivateKey 证书私钥，若上传证书公钥， 则CertificateId不用传
     */
    public void setCertificatePrivateKey(String CertificatePrivateKey) {
        this.CertificatePrivateKey = CertificatePrivateKey;
    }

    /**
     * Get 旧证书是否忽略到期提醒  0:不忽略通知。1:忽略通知，忽略OldCertificateId到期提醒 
     * @return ExpiringNotificationSwitch 旧证书是否忽略到期提醒  0:不忽略通知。1:忽略通知，忽略OldCertificateId到期提醒
     */
    public Long getExpiringNotificationSwitch() {
        return this.ExpiringNotificationSwitch;
    }

    /**
     * Set 旧证书是否忽略到期提醒  0:不忽略通知。1:忽略通知，忽略OldCertificateId到期提醒
     * @param ExpiringNotificationSwitch 旧证书是否忽略到期提醒  0:不忽略通知。1:忽略通知，忽略OldCertificateId到期提醒
     */
    public void setExpiringNotificationSwitch(Long ExpiringNotificationSwitch) {
        this.ExpiringNotificationSwitch = ExpiringNotificationSwitch;
    }

    /**
     * Get 相同的证书是否允许重复上传，若选择上传证书， 则可以配置该参数 
     * @return Repeatable 相同的证书是否允许重复上传，若选择上传证书， 则可以配置该参数
     */
    public Boolean getRepeatable() {
        return this.Repeatable;
    }

    /**
     * Set 相同的证书是否允许重复上传，若选择上传证书， 则可以配置该参数
     * @param Repeatable 相同的证书是否允许重复上传，若选择上传证书， 则可以配置该参数
     */
    public void setRepeatable(Boolean Repeatable) {
        this.Repeatable = Repeatable;
    }

    /**
     * Get 是否允许下载，若选择上传证书， 则可以配置该参数 
     * @return AllowDownload 是否允许下载，若选择上传证书， 则可以配置该参数
     */
    public Boolean getAllowDownload() {
        return this.AllowDownload;
    }

    /**
     * Set 是否允许下载，若选择上传证书， 则可以配置该参数
     * @param AllowDownload 是否允许下载，若选择上传证书， 则可以配置该参数
     */
    public void setAllowDownload(Boolean AllowDownload) {
        this.AllowDownload = AllowDownload;
    }

    /**
     * Get 标签列表，若选择上传证书， 则可以配置该参数 
     * @return Tags 标签列表，若选择上传证书， 则可以配置该参数
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表，若选择上传证书， 则可以配置该参数
     * @param Tags 标签列表，若选择上传证书， 则可以配置该参数
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 项目 ID，若选择上传证书， 则可以配置该参数 
     * @return ProjectId 项目 ID，若选择上传证书， 则可以配置该参数
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID，若选择上传证书， 则可以配置该参数
     * @param ProjectId 项目 ID，若选择上传证书， 则可以配置该参数
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

