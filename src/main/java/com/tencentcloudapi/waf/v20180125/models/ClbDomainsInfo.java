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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbDomainsInfo extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名唯一ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 域名所属实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 域名所属实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 域名所属实例类型
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * waf前是否部署有七层代理服务。 0：没有部署代理服务 1：有部署代理服务，waf将使用XFF获取客户端IP 2：有部署代理服务，waf将使用remote_addr获取客户端IP 3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP
    */
    @SerializedName("IsCdn")
    @Expose
    private Long IsCdn;

    /**
    * 负载均衡类型为clb时，对应的负载均衡器信息
    */
    @SerializedName("LoadBalancerSet")
    @Expose
    private LoadBalancerPackageNew [] LoadBalancerSet;

    /**
    * 负载均衡型WAF的流量模式，1：清洗模式，0：镜像模式
    */
    @SerializedName("FlowMode")
    @Expose
    private Long FlowMode;

    /**
    * 域名绑定负载均衡器状态
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 负载均衡类型，clb或者apisix
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
    * IsCdn=3时，表示自定义header
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * cdc-clb-waf类型WAF的CDC集群信息
    */
    @SerializedName("CdcClusters")
    @Expose
    private String CdcClusters;

    /**
    * 云类型:public:公有云；private:私有云;hybrid:混合云
    */
    @SerializedName("CloudType")
    @Expose
    private String CloudType;

    /**
    * 域名备注信息
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 域名标签
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名唯一ID 
     * @return DomainId 域名唯一ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名唯一ID
     * @param DomainId 域名唯一ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 域名所属实例ID 
     * @return InstanceId 域名所属实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 域名所属实例ID
     * @param InstanceId 域名所属实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 域名所属实例名 
     * @return InstanceName 域名所属实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 域名所属实例名
     * @param InstanceName 域名所属实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 域名所属实例类型 
     * @return Edition 域名所属实例类型
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 域名所属实例类型
     * @param Edition 域名所属实例类型
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get waf前是否部署有七层代理服务。 0：没有部署代理服务 1：有部署代理服务，waf将使用XFF获取客户端IP 2：有部署代理服务，waf将使用remote_addr获取客户端IP 3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP 
     * @return IsCdn waf前是否部署有七层代理服务。 0：没有部署代理服务 1：有部署代理服务，waf将使用XFF获取客户端IP 2：有部署代理服务，waf将使用remote_addr获取客户端IP 3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP
     */
    public Long getIsCdn() {
        return this.IsCdn;
    }

    /**
     * Set waf前是否部署有七层代理服务。 0：没有部署代理服务 1：有部署代理服务，waf将使用XFF获取客户端IP 2：有部署代理服务，waf将使用remote_addr获取客户端IP 3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP
     * @param IsCdn waf前是否部署有七层代理服务。 0：没有部署代理服务 1：有部署代理服务，waf将使用XFF获取客户端IP 2：有部署代理服务，waf将使用remote_addr获取客户端IP 3：有部署代理服务，waf将使用ip_headers中的自定义header获取客户端IP
     */
    public void setIsCdn(Long IsCdn) {
        this.IsCdn = IsCdn;
    }

    /**
     * Get 负载均衡类型为clb时，对应的负载均衡器信息 
     * @return LoadBalancerSet 负载均衡类型为clb时，对应的负载均衡器信息
     */
    public LoadBalancerPackageNew [] getLoadBalancerSet() {
        return this.LoadBalancerSet;
    }

    /**
     * Set 负载均衡类型为clb时，对应的负载均衡器信息
     * @param LoadBalancerSet 负载均衡类型为clb时，对应的负载均衡器信息
     */
    public void setLoadBalancerSet(LoadBalancerPackageNew [] LoadBalancerSet) {
        this.LoadBalancerSet = LoadBalancerSet;
    }

    /**
     * Get 负载均衡型WAF的流量模式，1：清洗模式，0：镜像模式 
     * @return FlowMode 负载均衡型WAF的流量模式，1：清洗模式，0：镜像模式
     */
    public Long getFlowMode() {
        return this.FlowMode;
    }

    /**
     * Set 负载均衡型WAF的流量模式，1：清洗模式，0：镜像模式
     * @param FlowMode 负载均衡型WAF的流量模式，1：清洗模式，0：镜像模式
     */
    public void setFlowMode(Long FlowMode) {
        this.FlowMode = FlowMode;
    }

    /**
     * Get 域名绑定负载均衡器状态 
     * @return State 域名绑定负载均衡器状态
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 域名绑定负载均衡器状态
     * @param State 域名绑定负载均衡器状态
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 负载均衡类型，clb或者apisix 
     * @return AlbType 负载均衡类型，clb或者apisix
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set 负载均衡类型，clb或者apisix
     * @param AlbType 负载均衡类型，clb或者apisix
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    /**
     * Get IsCdn=3时，表示自定义header 
     * @return IpHeaders IsCdn=3时，表示自定义header
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set IsCdn=3时，表示自定义header
     * @param IpHeaders IsCdn=3时，表示自定义header
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get cdc-clb-waf类型WAF的CDC集群信息 
     * @return CdcClusters cdc-clb-waf类型WAF的CDC集群信息
     */
    public String getCdcClusters() {
        return this.CdcClusters;
    }

    /**
     * Set cdc-clb-waf类型WAF的CDC集群信息
     * @param CdcClusters cdc-clb-waf类型WAF的CDC集群信息
     */
    public void setCdcClusters(String CdcClusters) {
        this.CdcClusters = CdcClusters;
    }

    /**
     * Get 云类型:public:公有云；private:私有云;hybrid:混合云 
     * @return CloudType 云类型:public:公有云；private:私有云;hybrid:混合云
     */
    public String getCloudType() {
        return this.CloudType;
    }

    /**
     * Set 云类型:public:公有云；private:私有云;hybrid:混合云
     * @param CloudType 云类型:public:公有云；private:私有云;hybrid:混合云
     */
    public void setCloudType(String CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get 域名备注信息 
     * @return Note 域名备注信息
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 域名备注信息
     * @param Note 域名备注信息
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 域名标签 
     * @return Labels 域名标签
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 域名标签
     * @param Labels 域名标签
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
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

    }
}

