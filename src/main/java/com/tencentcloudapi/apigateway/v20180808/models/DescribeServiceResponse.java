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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServiceResponse extends AbstractModel{

    /**
    * 服务唯一ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 服务 环境列表。
    */
    @SerializedName("AvailableEnvironments")
    @Expose
    private String [] AvailableEnvironments;

    /**
    * 服务名称。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 服务描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceDesc")
    @Expose
    private String ServiceDesc;

    /**
    * 服务支持协议，可选值为http、https、http&https。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 服务创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 服务修改时间。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 独立集群名称。
    */
    @SerializedName("ExclusiveSetName")
    @Expose
    private String ExclusiveSetName;

    /**
    * 网络类型列表，INNER为内网访问，OUTER为外网访问。
    */
    @SerializedName("NetTypes")
    @Expose
    private String [] NetTypes;

    /**
    * 内网访问子域名。
    */
    @SerializedName("InternalSubDomain")
    @Expose
    private String InternalSubDomain;

    /**
    * 外网访问子域名。
    */
    @SerializedName("OuterSubDomain")
    @Expose
    private String OuterSubDomain;

    /**
    * 内网访问http服务端口号。
    */
    @SerializedName("InnerHttpPort")
    @Expose
    private Long InnerHttpPort;

    /**
    * 内网访问https端口号。
    */
    @SerializedName("InnerHttpsPort")
    @Expose
    private Long InnerHttpsPort;

    /**
    * API总数。
    */
    @SerializedName("ApiTotalCount")
    @Expose
    private Long ApiTotalCount;

    /**
    * API列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiIdStatusSet")
    @Expose
    private ApiIdStatus [] ApiIdStatusSet;

    /**
    * 使用计划总数量。
    */
    @SerializedName("UsagePlanTotalCount")
    @Expose
    private Long UsagePlanTotalCount;

    /**
    * 使用计划数组。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsagePlanList")
    @Expose
    private UsagePlan [] UsagePlanList;

    /**
    * IP版本。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * 此服务的用户类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * 预留字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetId")
    @Expose
    private Long SetId;

    /**
    * 服务绑定的标签。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 独享实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 独享实例name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 集群类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetType")
    @Expose
    private String SetType;

    /**
    * 服务部署的集群类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeploymentType")
    @Expose
    private String DeploymentType;

    /**
    * 特殊用途, NULL和DEFAULT表示无特殊用途，其他用途如HTTP_DNS等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecialUse")
    @Expose
    private String SpecialUse;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 服务唯一ID。 
     * @return ServiceId 服务唯一ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务唯一ID。
     * @param ServiceId 服务唯一ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 服务 环境列表。 
     * @return AvailableEnvironments 服务 环境列表。
     */
    public String [] getAvailableEnvironments() {
        return this.AvailableEnvironments;
    }

    /**
     * Set 服务 环境列表。
     * @param AvailableEnvironments 服务 环境列表。
     */
    public void setAvailableEnvironments(String [] AvailableEnvironments) {
        this.AvailableEnvironments = AvailableEnvironments;
    }

    /**
     * Get 服务名称。 
     * @return ServiceName 服务名称。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名称。
     * @param ServiceName 服务名称。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 服务描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceDesc 服务描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceDesc() {
        return this.ServiceDesc;
    }

    /**
     * Set 服务描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceDesc 服务描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceDesc(String ServiceDesc) {
        this.ServiceDesc = ServiceDesc;
    }

    /**
     * Get 服务支持协议，可选值为http、https、http&https。 
     * @return Protocol 服务支持协议，可选值为http、https、http&https。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 服务支持协议，可选值为http、https、http&https。
     * @param Protocol 服务支持协议，可选值为http、https、http&https。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 服务创建时间。 
     * @return CreatedTime 服务创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 服务创建时间。
     * @param CreatedTime 服务创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 服务修改时间。 
     * @return ModifiedTime 服务修改时间。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 服务修改时间。
     * @param ModifiedTime 服务修改时间。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 独立集群名称。 
     * @return ExclusiveSetName 独立集群名称。
     */
    public String getExclusiveSetName() {
        return this.ExclusiveSetName;
    }

    /**
     * Set 独立集群名称。
     * @param ExclusiveSetName 独立集群名称。
     */
    public void setExclusiveSetName(String ExclusiveSetName) {
        this.ExclusiveSetName = ExclusiveSetName;
    }

    /**
     * Get 网络类型列表，INNER为内网访问，OUTER为外网访问。 
     * @return NetTypes 网络类型列表，INNER为内网访问，OUTER为外网访问。
     */
    public String [] getNetTypes() {
        return this.NetTypes;
    }

    /**
     * Set 网络类型列表，INNER为内网访问，OUTER为外网访问。
     * @param NetTypes 网络类型列表，INNER为内网访问，OUTER为外网访问。
     */
    public void setNetTypes(String [] NetTypes) {
        this.NetTypes = NetTypes;
    }

    /**
     * Get 内网访问子域名。 
     * @return InternalSubDomain 内网访问子域名。
     */
    public String getInternalSubDomain() {
        return this.InternalSubDomain;
    }

    /**
     * Set 内网访问子域名。
     * @param InternalSubDomain 内网访问子域名。
     */
    public void setInternalSubDomain(String InternalSubDomain) {
        this.InternalSubDomain = InternalSubDomain;
    }

    /**
     * Get 外网访问子域名。 
     * @return OuterSubDomain 外网访问子域名。
     */
    public String getOuterSubDomain() {
        return this.OuterSubDomain;
    }

    /**
     * Set 外网访问子域名。
     * @param OuterSubDomain 外网访问子域名。
     */
    public void setOuterSubDomain(String OuterSubDomain) {
        this.OuterSubDomain = OuterSubDomain;
    }

    /**
     * Get 内网访问http服务端口号。 
     * @return InnerHttpPort 内网访问http服务端口号。
     */
    public Long getInnerHttpPort() {
        return this.InnerHttpPort;
    }

    /**
     * Set 内网访问http服务端口号。
     * @param InnerHttpPort 内网访问http服务端口号。
     */
    public void setInnerHttpPort(Long InnerHttpPort) {
        this.InnerHttpPort = InnerHttpPort;
    }

    /**
     * Get 内网访问https端口号。 
     * @return InnerHttpsPort 内网访问https端口号。
     */
    public Long getInnerHttpsPort() {
        return this.InnerHttpsPort;
    }

    /**
     * Set 内网访问https端口号。
     * @param InnerHttpsPort 内网访问https端口号。
     */
    public void setInnerHttpsPort(Long InnerHttpsPort) {
        this.InnerHttpsPort = InnerHttpsPort;
    }

    /**
     * Get API总数。 
     * @return ApiTotalCount API总数。
     */
    public Long getApiTotalCount() {
        return this.ApiTotalCount;
    }

    /**
     * Set API总数。
     * @param ApiTotalCount API总数。
     */
    public void setApiTotalCount(Long ApiTotalCount) {
        this.ApiTotalCount = ApiTotalCount;
    }

    /**
     * Get API列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiIdStatusSet API列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiIdStatus [] getApiIdStatusSet() {
        return this.ApiIdStatusSet;
    }

    /**
     * Set API列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiIdStatusSet API列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiIdStatusSet(ApiIdStatus [] ApiIdStatusSet) {
        this.ApiIdStatusSet = ApiIdStatusSet;
    }

    /**
     * Get 使用计划总数量。 
     * @return UsagePlanTotalCount 使用计划总数量。
     */
    public Long getUsagePlanTotalCount() {
        return this.UsagePlanTotalCount;
    }

    /**
     * Set 使用计划总数量。
     * @param UsagePlanTotalCount 使用计划总数量。
     */
    public void setUsagePlanTotalCount(Long UsagePlanTotalCount) {
        this.UsagePlanTotalCount = UsagePlanTotalCount;
    }

    /**
     * Get 使用计划数组。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsagePlanList 使用计划数组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UsagePlan [] getUsagePlanList() {
        return this.UsagePlanList;
    }

    /**
     * Set 使用计划数组。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsagePlanList 使用计划数组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsagePlanList(UsagePlan [] UsagePlanList) {
        this.UsagePlanList = UsagePlanList;
    }

    /**
     * Get IP版本。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpVersion IP版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set IP版本。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpVersion IP版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get 此服务的用户类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserType 此服务的用户类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 此服务的用户类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserType 此服务的用户类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 预留字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetId 预留字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSetId() {
        return this.SetId;
    }

    /**
     * Set 预留字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetId 预留字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetId(Long SetId) {
        this.SetId = SetId;
    }

    /**
     * Get 服务绑定的标签。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 服务绑定的标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 服务绑定的标签。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 服务绑定的标签。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 独享实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 独享实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 独享实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 独享实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 独享实例name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 独享实例name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 独享实例name
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 独享实例name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 集群类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSetType() {
        return this.SetType;
    }

    /**
     * Set 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetType(String SetType) {
        this.SetType = SetType;
    }

    /**
     * Get 服务部署的集群类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeploymentType 服务部署的集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeploymentType() {
        return this.DeploymentType;
    }

    /**
     * Set 服务部署的集群类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeploymentType 服务部署的集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeploymentType(String DeploymentType) {
        this.DeploymentType = DeploymentType;
    }

    /**
     * Get 特殊用途, NULL和DEFAULT表示无特殊用途，其他用途如HTTP_DNS等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecialUse 特殊用途, NULL和DEFAULT表示无特殊用途，其他用途如HTTP_DNS等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecialUse() {
        return this.SpecialUse;
    }

    /**
     * Set 特殊用途, NULL和DEFAULT表示无特殊用途，其他用途如HTTP_DNS等
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecialUse 特殊用途, NULL和DEFAULT表示无特殊用途，其他用途如HTTP_DNS等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecialUse(String SpecialUse) {
        this.SpecialUse = SpecialUse;
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

    public DescribeServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceResponse(DescribeServiceResponse source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.AvailableEnvironments != null) {
            this.AvailableEnvironments = new String[source.AvailableEnvironments.length];
            for (int i = 0; i < source.AvailableEnvironments.length; i++) {
                this.AvailableEnvironments[i] = new String(source.AvailableEnvironments[i]);
            }
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceDesc != null) {
            this.ServiceDesc = new String(source.ServiceDesc);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.ExclusiveSetName != null) {
            this.ExclusiveSetName = new String(source.ExclusiveSetName);
        }
        if (source.NetTypes != null) {
            this.NetTypes = new String[source.NetTypes.length];
            for (int i = 0; i < source.NetTypes.length; i++) {
                this.NetTypes[i] = new String(source.NetTypes[i]);
            }
        }
        if (source.InternalSubDomain != null) {
            this.InternalSubDomain = new String(source.InternalSubDomain);
        }
        if (source.OuterSubDomain != null) {
            this.OuterSubDomain = new String(source.OuterSubDomain);
        }
        if (source.InnerHttpPort != null) {
            this.InnerHttpPort = new Long(source.InnerHttpPort);
        }
        if (source.InnerHttpsPort != null) {
            this.InnerHttpsPort = new Long(source.InnerHttpsPort);
        }
        if (source.ApiTotalCount != null) {
            this.ApiTotalCount = new Long(source.ApiTotalCount);
        }
        if (source.ApiIdStatusSet != null) {
            this.ApiIdStatusSet = new ApiIdStatus[source.ApiIdStatusSet.length];
            for (int i = 0; i < source.ApiIdStatusSet.length; i++) {
                this.ApiIdStatusSet[i] = new ApiIdStatus(source.ApiIdStatusSet[i]);
            }
        }
        if (source.UsagePlanTotalCount != null) {
            this.UsagePlanTotalCount = new Long(source.UsagePlanTotalCount);
        }
        if (source.UsagePlanList != null) {
            this.UsagePlanList = new UsagePlan[source.UsagePlanList.length];
            for (int i = 0; i < source.UsagePlanList.length; i++) {
                this.UsagePlanList[i] = new UsagePlan(source.UsagePlanList[i]);
            }
        }
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.SetId != null) {
            this.SetId = new Long(source.SetId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.SetType != null) {
            this.SetType = new String(source.SetType);
        }
        if (source.DeploymentType != null) {
            this.DeploymentType = new String(source.DeploymentType);
        }
        if (source.SpecialUse != null) {
            this.SpecialUse = new String(source.SpecialUse);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamArraySimple(map, prefix + "AvailableEnvironments.", this.AvailableEnvironments);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceDesc", this.ServiceDesc);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "ExclusiveSetName", this.ExclusiveSetName);
        this.setParamArraySimple(map, prefix + "NetTypes.", this.NetTypes);
        this.setParamSimple(map, prefix + "InternalSubDomain", this.InternalSubDomain);
        this.setParamSimple(map, prefix + "OuterSubDomain", this.OuterSubDomain);
        this.setParamSimple(map, prefix + "InnerHttpPort", this.InnerHttpPort);
        this.setParamSimple(map, prefix + "InnerHttpsPort", this.InnerHttpsPort);
        this.setParamSimple(map, prefix + "ApiTotalCount", this.ApiTotalCount);
        this.setParamArrayObj(map, prefix + "ApiIdStatusSet.", this.ApiIdStatusSet);
        this.setParamSimple(map, prefix + "UsagePlanTotalCount", this.UsagePlanTotalCount);
        this.setParamArrayObj(map, prefix + "UsagePlanList.", this.UsagePlanList);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "SetId", this.SetId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "SetType", this.SetType);
        this.setParamSimple(map, prefix + "DeploymentType", this.DeploymentType);
        this.setParamSimple(map, prefix + "SpecialUse", this.SpecialUse);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

