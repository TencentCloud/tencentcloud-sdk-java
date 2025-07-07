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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEKSClusterRequest extends AbstractModel {

    /**
    * k8s版本号。可为1.18.4 1.20.6。
    */
    @SerializedName("K8SVersion")
    @Expose
    private String K8SVersion;

    /**
    * vpc 的Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 子网Id 列表
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 集群描述信息
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * Service CIDR 或 Serivce 所在子网Id
    */
    @SerializedName("ServiceSubnetId")
    @Expose
    private String ServiceSubnetId;

    /**
    * 集群自定义的Dns服务器信息
    */
    @SerializedName("DnsServers")
    @Expose
    private DnsServerConf [] DnsServers;

    /**
    * 扩展参数。须是map[string]string 的json 格式。
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
    * 是否在用户集群内开启Dns。默认为true
    */
    @SerializedName("EnableVpcCoreDNS")
    @Expose
    private Boolean EnableVpcCoreDNS;

    /**
    * 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例，当前仅支持绑定标签到集群实例。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * 子网信息列表
    */
    @SerializedName("SubnetInfos")
    @Expose
    private SubnetInfos [] SubnetInfos;

    /**
     * Get k8s版本号。可为1.18.4 1.20.6。 
     * @return K8SVersion k8s版本号。可为1.18.4 1.20.6。
     */
    public String getK8SVersion() {
        return this.K8SVersion;
    }

    /**
     * Set k8s版本号。可为1.18.4 1.20.6。
     * @param K8SVersion k8s版本号。可为1.18.4 1.20.6。
     */
    public void setK8SVersion(String K8SVersion) {
        this.K8SVersion = K8SVersion;
    }

    /**
     * Get vpc 的Id 
     * @return VpcId vpc 的Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc 的Id
     * @param VpcId vpc 的Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 子网Id 列表 
     * @return SubnetIds 子网Id 列表
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网Id 列表
     * @param SubnetIds 子网Id 列表
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 集群描述信息 
     * @return ClusterDesc 集群描述信息
     */
    public String getClusterDesc() {
        return this.ClusterDesc;
    }

    /**
     * Set 集群描述信息
     * @param ClusterDesc 集群描述信息
     */
    public void setClusterDesc(String ClusterDesc) {
        this.ClusterDesc = ClusterDesc;
    }

    /**
     * Get Service CIDR 或 Serivce 所在子网Id 
     * @return ServiceSubnetId Service CIDR 或 Serivce 所在子网Id
     */
    public String getServiceSubnetId() {
        return this.ServiceSubnetId;
    }

    /**
     * Set Service CIDR 或 Serivce 所在子网Id
     * @param ServiceSubnetId Service CIDR 或 Serivce 所在子网Id
     */
    public void setServiceSubnetId(String ServiceSubnetId) {
        this.ServiceSubnetId = ServiceSubnetId;
    }

    /**
     * Get 集群自定义的Dns服务器信息 
     * @return DnsServers 集群自定义的Dns服务器信息
     */
    public DnsServerConf [] getDnsServers() {
        return this.DnsServers;
    }

    /**
     * Set 集群自定义的Dns服务器信息
     * @param DnsServers 集群自定义的Dns服务器信息
     */
    public void setDnsServers(DnsServerConf [] DnsServers) {
        this.DnsServers = DnsServers;
    }

    /**
     * Get 扩展参数。须是map[string]string 的json 格式。 
     * @return ExtraParam 扩展参数。须是map[string]string 的json 格式。
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set 扩展参数。须是map[string]string 的json 格式。
     * @param ExtraParam 扩展参数。须是map[string]string 的json 格式。
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    /**
     * Get 是否在用户集群内开启Dns。默认为true 
     * @return EnableVpcCoreDNS 是否在用户集群内开启Dns。默认为true
     */
    public Boolean getEnableVpcCoreDNS() {
        return this.EnableVpcCoreDNS;
    }

    /**
     * Set 是否在用户集群内开启Dns。默认为true
     * @param EnableVpcCoreDNS 是否在用户集群内开启Dns。默认为true
     */
    public void setEnableVpcCoreDNS(Boolean EnableVpcCoreDNS) {
        this.EnableVpcCoreDNS = EnableVpcCoreDNS;
    }

    /**
     * Get 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例，当前仅支持绑定标签到集群实例。 
     * @return TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例，当前仅支持绑定标签到集群实例。
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例，当前仅支持绑定标签到集群实例。
     * @param TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例，当前仅支持绑定标签到集群实例。
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 子网信息列表 
     * @return SubnetInfos 子网信息列表
     */
    public SubnetInfos [] getSubnetInfos() {
        return this.SubnetInfos;
    }

    /**
     * Set 子网信息列表
     * @param SubnetInfos 子网信息列表
     */
    public void setSubnetInfos(SubnetInfos [] SubnetInfos) {
        this.SubnetInfos = SubnetInfos;
    }

    public CreateEKSClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEKSClusterRequest(CreateEKSClusterRequest source) {
        if (source.K8SVersion != null) {
            this.K8SVersion = new String(source.K8SVersion);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.ClusterDesc != null) {
            this.ClusterDesc = new String(source.ClusterDesc);
        }
        if (source.ServiceSubnetId != null) {
            this.ServiceSubnetId = new String(source.ServiceSubnetId);
        }
        if (source.DnsServers != null) {
            this.DnsServers = new DnsServerConf[source.DnsServers.length];
            for (int i = 0; i < source.DnsServers.length; i++) {
                this.DnsServers[i] = new DnsServerConf(source.DnsServers[i]);
            }
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
        if (source.EnableVpcCoreDNS != null) {
            this.EnableVpcCoreDNS = new Boolean(source.EnableVpcCoreDNS);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
        if (source.SubnetInfos != null) {
            this.SubnetInfos = new SubnetInfos[source.SubnetInfos.length];
            for (int i = 0; i < source.SubnetInfos.length; i++) {
                this.SubnetInfos[i] = new SubnetInfos(source.SubnetInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "K8SVersion", this.K8SVersion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamSimple(map, prefix + "ServiceSubnetId", this.ServiceSubnetId);
        this.setParamArrayObj(map, prefix + "DnsServers.", this.DnsServers);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);
        this.setParamSimple(map, prefix + "EnableVpcCoreDNS", this.EnableVpcCoreDNS);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamArrayObj(map, prefix + "SubnetInfos.", this.SubnetInfos);

    }
}

