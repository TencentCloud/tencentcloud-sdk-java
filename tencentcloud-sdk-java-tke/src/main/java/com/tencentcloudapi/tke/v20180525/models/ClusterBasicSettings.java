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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterBasicSettings extends AbstractModel{

    /**
    * 集群系统。centos7.2x86_64 或者 ubuntu16.04.1 LTSx86_64，默认取值为ubuntu16.04.1 LTSx86_64
    */
    @SerializedName("ClusterOs")
    @Expose
    private String ClusterOs;

    /**
    * 集群版本,默认值为1.10.5
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群描述
    */
    @SerializedName("ClusterDescription")
    @Expose
    private String ClusterDescription;

    /**
    * 私有网络ID，形如vpc-xxx。创建托管空集群时必传。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 集群内新增资源所属项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例，当前仅支持绑定标签到集群实例。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
    * 是否开启节点的默认安全组(默认: 否，Aphla特性)
    */
    @SerializedName("NeedWorkSecurityGroup")
    @Expose
    private Boolean NeedWorkSecurityGroup;

    /**
     * Get 集群系统。centos7.2x86_64 或者 ubuntu16.04.1 LTSx86_64，默认取值为ubuntu16.04.1 LTSx86_64 
     * @return ClusterOs 集群系统。centos7.2x86_64 或者 ubuntu16.04.1 LTSx86_64，默认取值为ubuntu16.04.1 LTSx86_64
     */
    public String getClusterOs() {
        return this.ClusterOs;
    }

    /**
     * Set 集群系统。centos7.2x86_64 或者 ubuntu16.04.1 LTSx86_64，默认取值为ubuntu16.04.1 LTSx86_64
     * @param ClusterOs 集群系统。centos7.2x86_64 或者 ubuntu16.04.1 LTSx86_64，默认取值为ubuntu16.04.1 LTSx86_64
     */
    public void setClusterOs(String ClusterOs) {
        this.ClusterOs = ClusterOs;
    }

    /**
     * Get 集群版本,默认值为1.10.5 
     * @return ClusterVersion 集群版本,默认值为1.10.5
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set 集群版本,默认值为1.10.5
     * @param ClusterVersion 集群版本,默认值为1.10.5
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
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
     * Get 集群描述 
     * @return ClusterDescription 集群描述
     */
    public String getClusterDescription() {
        return this.ClusterDescription;
    }

    /**
     * Set 集群描述
     * @param ClusterDescription 集群描述
     */
    public void setClusterDescription(String ClusterDescription) {
        this.ClusterDescription = ClusterDescription;
    }

    /**
     * Get 私有网络ID，形如vpc-xxx。创建托管空集群时必传。 
     * @return VpcId 私有网络ID，形如vpc-xxx。创建托管空集群时必传。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID，形如vpc-xxx。创建托管空集群时必传。
     * @param VpcId 私有网络ID，形如vpc-xxx。创建托管空集群时必传。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 集群内新增资源所属项目ID。 
     * @return ProjectId 集群内新增资源所属项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 集群内新增资源所属项目ID。
     * @param ProjectId 集群内新增资源所属项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值) 
     * @return OsCustomizeType 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
     * @param OsCustomizeType 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Get 是否开启节点的默认安全组(默认: 否，Aphla特性) 
     * @return NeedWorkSecurityGroup 是否开启节点的默认安全组(默认: 否，Aphla特性)
     */
    public Boolean getNeedWorkSecurityGroup() {
        return this.NeedWorkSecurityGroup;
    }

    /**
     * Set 是否开启节点的默认安全组(默认: 否，Aphla特性)
     * @param NeedWorkSecurityGroup 是否开启节点的默认安全组(默认: 否，Aphla特性)
     */
    public void setNeedWorkSecurityGroup(Boolean NeedWorkSecurityGroup) {
        this.NeedWorkSecurityGroup = NeedWorkSecurityGroup;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterOs", this.ClusterOs);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterDescription", this.ClusterDescription);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);
        this.setParamSimple(map, prefix + "NeedWorkSecurityGroup", this.NeedWorkSecurityGroup);

    }
}

