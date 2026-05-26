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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbDomainsInfo extends AbstractModel {

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>域名唯一ID</p>
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * <p>域名所属实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>域名所属实例名</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>域名所属实例类型</p>
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * <p>waf前是否部署有七层代理服务。 0：没有部署代理服务 1：有部署代理服务，waf将使用XFF获取客户端IP 2：有部署代理服务，waf将使用remote_addr获取客户端IP 3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP</p>
    */
    @SerializedName("IsCdn")
    @Expose
    private Long IsCdn;

    /**
    * <p>负载均衡类型为clb时，对应的负载均衡器信息</p>
    */
    @SerializedName("LoadBalancerSet")
    @Expose
    private LoadBalancerPackageNew [] LoadBalancerSet;

    /**
    * <p>负载均衡型WAF的流量模式，1：清洗模式，0：镜像模式</p>
    */
    @SerializedName("FlowMode")
    @Expose
    private Long FlowMode;

    /**
    * <p>域名绑定负载均衡器状态</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>负载均衡类型，clb或者apisix</p>
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
    * <p>IsCdn=3时，表示自定义header</p>
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * <p>cdc-clb-waf类型WAF的CDC集群信息</p>
    */
    @SerializedName("CdcClusters")
    @Expose
    private String CdcClusters;

    /**
    * <p>云类型:public:公有云；private:私有云;hybrid:混合云</p>
    */
    @SerializedName("CloudType")
    @Expose
    private String CloudType;

    /**
    * <p>域名备注信息</p>
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * <p>域名标签</p>
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * <p>clbwaf接入状态，0代表“尚无流量接入”，1代表“流量接入”，2代表“CLB监听器已注销”，3代表“配置生效中”，4代表“配置下发失败中”</p>
    */
    @SerializedName("AccessStatus")
    @Expose
    private Long AccessStatus;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("TagInfos")
    @Expose
    private TagInfo [] TagInfos;

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>域名唯一ID</p> 
     * @return DomainId <p>域名唯一ID</p>
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set <p>域名唯一ID</p>
     * @param DomainId <p>域名唯一ID</p>
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get <p>域名所属实例ID</p> 
     * @return InstanceId <p>域名所属实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>域名所属实例ID</p>
     * @param InstanceId <p>域名所属实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>域名所属实例名</p> 
     * @return InstanceName <p>域名所属实例名</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>域名所属实例名</p>
     * @param InstanceName <p>域名所属实例名</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>域名所属实例类型</p> 
     * @return Edition <p>域名所属实例类型</p>
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set <p>域名所属实例类型</p>
     * @param Edition <p>域名所属实例类型</p>
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get <p>waf前是否部署有七层代理服务。 0：没有部署代理服务 1：有部署代理服务，waf将使用XFF获取客户端IP 2：有部署代理服务，waf将使用remote_addr获取客户端IP 3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP</p> 
     * @return IsCdn <p>waf前是否部署有七层代理服务。 0：没有部署代理服务 1：有部署代理服务，waf将使用XFF获取客户端IP 2：有部署代理服务，waf将使用remote_addr获取客户端IP 3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP</p>
     */
    public Long getIsCdn() {
        return this.IsCdn;
    }

    /**
     * Set <p>waf前是否部署有七层代理服务。 0：没有部署代理服务 1：有部署代理服务，waf将使用XFF获取客户端IP 2：有部署代理服务，waf将使用remote_addr获取客户端IP 3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP</p>
     * @param IsCdn <p>waf前是否部署有七层代理服务。 0：没有部署代理服务 1：有部署代理服务，waf将使用XFF获取客户端IP 2：有部署代理服务，waf将使用remote_addr获取客户端IP 3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP</p>
     */
    public void setIsCdn(Long IsCdn) {
        this.IsCdn = IsCdn;
    }

    /**
     * Get <p>负载均衡类型为clb时，对应的负载均衡器信息</p> 
     * @return LoadBalancerSet <p>负载均衡类型为clb时，对应的负载均衡器信息</p>
     */
    public LoadBalancerPackageNew [] getLoadBalancerSet() {
        return this.LoadBalancerSet;
    }

    /**
     * Set <p>负载均衡类型为clb时，对应的负载均衡器信息</p>
     * @param LoadBalancerSet <p>负载均衡类型为clb时，对应的负载均衡器信息</p>
     */
    public void setLoadBalancerSet(LoadBalancerPackageNew [] LoadBalancerSet) {
        this.LoadBalancerSet = LoadBalancerSet;
    }

    /**
     * Get <p>负载均衡型WAF的流量模式，1：清洗模式，0：镜像模式</p> 
     * @return FlowMode <p>负载均衡型WAF的流量模式，1：清洗模式，0：镜像模式</p>
     */
    public Long getFlowMode() {
        return this.FlowMode;
    }

    /**
     * Set <p>负载均衡型WAF的流量模式，1：清洗模式，0：镜像模式</p>
     * @param FlowMode <p>负载均衡型WAF的流量模式，1：清洗模式，0：镜像模式</p>
     */
    public void setFlowMode(Long FlowMode) {
        this.FlowMode = FlowMode;
    }

    /**
     * Get <p>域名绑定负载均衡器状态</p> 
     * @return State <p>域名绑定负载均衡器状态</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>域名绑定负载均衡器状态</p>
     * @param State <p>域名绑定负载均衡器状态</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>负载均衡类型，clb或者apisix</p> 
     * @return AlbType <p>负载均衡类型，clb或者apisix</p>
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set <p>负载均衡类型，clb或者apisix</p>
     * @param AlbType <p>负载均衡类型，clb或者apisix</p>
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    /**
     * Get <p>IsCdn=3时，表示自定义header</p> 
     * @return IpHeaders <p>IsCdn=3时，表示自定义header</p>
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set <p>IsCdn=3时，表示自定义header</p>
     * @param IpHeaders <p>IsCdn=3时，表示自定义header</p>
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get <p>cdc-clb-waf类型WAF的CDC集群信息</p> 
     * @return CdcClusters <p>cdc-clb-waf类型WAF的CDC集群信息</p>
     */
    public String getCdcClusters() {
        return this.CdcClusters;
    }

    /**
     * Set <p>cdc-clb-waf类型WAF的CDC集群信息</p>
     * @param CdcClusters <p>cdc-clb-waf类型WAF的CDC集群信息</p>
     */
    public void setCdcClusters(String CdcClusters) {
        this.CdcClusters = CdcClusters;
    }

    /**
     * Get <p>云类型:public:公有云；private:私有云;hybrid:混合云</p> 
     * @return CloudType <p>云类型:public:公有云；private:私有云;hybrid:混合云</p>
     */
    public String getCloudType() {
        return this.CloudType;
    }

    /**
     * Set <p>云类型:public:公有云；private:私有云;hybrid:混合云</p>
     * @param CloudType <p>云类型:public:公有云；private:私有云;hybrid:混合云</p>
     */
    public void setCloudType(String CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get <p>域名备注信息</p> 
     * @return Note <p>域名备注信息</p>
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set <p>域名备注信息</p>
     * @param Note <p>域名备注信息</p>
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get <p>域名标签</p> 
     * @return Labels <p>域名标签</p>
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>域名标签</p>
     * @param Labels <p>域名标签</p>
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>clbwaf接入状态，0代表“尚无流量接入”，1代表“流量接入”，2代表“CLB监听器已注销”，3代表“配置生效中”，4代表“配置下发失败中”</p> 
     * @return AccessStatus <p>clbwaf接入状态，0代表“尚无流量接入”，1代表“流量接入”，2代表“CLB监听器已注销”，3代表“配置生效中”，4代表“配置下发失败中”</p>
     */
    public Long getAccessStatus() {
        return this.AccessStatus;
    }

    /**
     * Set <p>clbwaf接入状态，0代表“尚无流量接入”，1代表“流量接入”，2代表“CLB监听器已注销”，3代表“配置生效中”，4代表“配置下发失败中”</p>
     * @param AccessStatus <p>clbwaf接入状态，0代表“尚无流量接入”，1代表“流量接入”，2代表“CLB监听器已注销”，3代表“配置生效中”，4代表“配置下发失败中”</p>
     */
    public void setAccessStatus(Long AccessStatus) {
        this.AccessStatus = AccessStatus;
    }

    /**
     * Get <p>标签信息</p> 
     * @return TagInfos <p>标签信息</p>
     */
    public TagInfo [] getTagInfos() {
        return this.TagInfos;
    }

    /**
     * Set <p>标签信息</p>
     * @param TagInfos <p>标签信息</p>
     */
    public void setTagInfos(TagInfo [] TagInfos) {
        this.TagInfos = TagInfos;
    }

    public ClbDomainsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbDomainsInfo(ClbDomainsInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.IsCdn != null) {
            this.IsCdn = new Long(source.IsCdn);
        }
        if (source.LoadBalancerSet != null) {
            this.LoadBalancerSet = new LoadBalancerPackageNew[source.LoadBalancerSet.length];
            for (int i = 0; i < source.LoadBalancerSet.length; i++) {
                this.LoadBalancerSet[i] = new LoadBalancerPackageNew(source.LoadBalancerSet[i]);
            }
        }
        if (source.FlowMode != null) {
            this.FlowMode = new Long(source.FlowMode);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.AlbType != null) {
            this.AlbType = new String(source.AlbType);
        }
        if (source.IpHeaders != null) {
            this.IpHeaders = new String[source.IpHeaders.length];
            for (int i = 0; i < source.IpHeaders.length; i++) {
                this.IpHeaders[i] = new String(source.IpHeaders[i]);
            }
        }
        if (source.CdcClusters != null) {
            this.CdcClusters = new String(source.CdcClusters);
        }
        if (source.CloudType != null) {
            this.CloudType = new String(source.CloudType);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
        if (source.AccessStatus != null) {
            this.AccessStatus = new Long(source.AccessStatus);
        }
        if (source.TagInfos != null) {
            this.TagInfos = new TagInfo[source.TagInfos.length];
            for (int i = 0; i < source.TagInfos.length; i++) {
                this.TagInfos[i] = new TagInfo(source.TagInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "IsCdn", this.IsCdn);
        this.setParamArrayObj(map, prefix + "LoadBalancerSet.", this.LoadBalancerSet);
        this.setParamSimple(map, prefix + "FlowMode", this.FlowMode);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "AlbType", this.AlbType);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);
        this.setParamSimple(map, prefix + "CdcClusters", this.CdcClusters);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "AccessStatus", this.AccessStatus);
        this.setParamArrayObj(map, prefix + "TagInfos.", this.TagInfos);

    }
}

