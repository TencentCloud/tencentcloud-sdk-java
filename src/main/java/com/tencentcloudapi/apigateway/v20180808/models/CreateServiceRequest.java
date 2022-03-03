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

public class CreateServiceRequest extends AbstractModel{

    /**
    * 用户自定义的服务名称。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 服务的前端请求类型。如 http、https、http&https。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 用户自定义的服务描述。
    */
    @SerializedName("ServiceDesc")
    @Expose
    private String ServiceDesc;

    /**
    * 独立集群名称，用于指定创建服务所在的独立集群。
    */
    @SerializedName("ExclusiveSetName")
    @Expose
    private String ExclusiveSetName;

    /**
    * 网络类型列表，用于指定支持的访问类型，INNER为内网访问，OUTER为外网访问。默认为OUTER。
    */
    @SerializedName("NetTypes")
    @Expose
    private String [] NetTypes;

    /**
    * IP版本号，支持IPv4和IPv6，默认为IPv4。
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * 集群名称。保留字段，tsf serverlss类型使用。
    */
    @SerializedName("SetServerName")
    @Expose
    private String SetServerName;

    /**
    * 用户类型。保留类型，serverless用户使用。
    */
    @SerializedName("AppIdType")
    @Expose
    private String AppIdType;

    /**
    * 标签。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 独享实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * vpc属性
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
     * Get 用户自定义的服务名称。 
     * @return ServiceName 用户自定义的服务名称。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 用户自定义的服务名称。
     * @param ServiceName 用户自定义的服务名称。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 服务的前端请求类型。如 http、https、http&https。 
     * @return Protocol 服务的前端请求类型。如 http、https、http&https。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 服务的前端请求类型。如 http、https、http&https。
     * @param Protocol 服务的前端请求类型。如 http、https、http&https。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 用户自定义的服务描述。 
     * @return ServiceDesc 用户自定义的服务描述。
     */
    public String getServiceDesc() {
        return this.ServiceDesc;
    }

    /**
     * Set 用户自定义的服务描述。
     * @param ServiceDesc 用户自定义的服务描述。
     */
    public void setServiceDesc(String ServiceDesc) {
        this.ServiceDesc = ServiceDesc;
    }

    /**
     * Get 独立集群名称，用于指定创建服务所在的独立集群。 
     * @return ExclusiveSetName 独立集群名称，用于指定创建服务所在的独立集群。
     */
    public String getExclusiveSetName() {
        return this.ExclusiveSetName;
    }

    /**
     * Set 独立集群名称，用于指定创建服务所在的独立集群。
     * @param ExclusiveSetName 独立集群名称，用于指定创建服务所在的独立集群。
     */
    public void setExclusiveSetName(String ExclusiveSetName) {
        this.ExclusiveSetName = ExclusiveSetName;
    }

    /**
     * Get 网络类型列表，用于指定支持的访问类型，INNER为内网访问，OUTER为外网访问。默认为OUTER。 
     * @return NetTypes 网络类型列表，用于指定支持的访问类型，INNER为内网访问，OUTER为外网访问。默认为OUTER。
     */
    public String [] getNetTypes() {
        return this.NetTypes;
    }

    /**
     * Set 网络类型列表，用于指定支持的访问类型，INNER为内网访问，OUTER为外网访问。默认为OUTER。
     * @param NetTypes 网络类型列表，用于指定支持的访问类型，INNER为内网访问，OUTER为外网访问。默认为OUTER。
     */
    public void setNetTypes(String [] NetTypes) {
        this.NetTypes = NetTypes;
    }

    /**
     * Get IP版本号，支持IPv4和IPv6，默认为IPv4。 
     * @return IpVersion IP版本号，支持IPv4和IPv6，默认为IPv4。
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set IP版本号，支持IPv4和IPv6，默认为IPv4。
     * @param IpVersion IP版本号，支持IPv4和IPv6，默认为IPv4。
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get 集群名称。保留字段，tsf serverlss类型使用。 
     * @return SetServerName 集群名称。保留字段，tsf serverlss类型使用。
     */
    public String getSetServerName() {
        return this.SetServerName;
    }

    /**
     * Set 集群名称。保留字段，tsf serverlss类型使用。
     * @param SetServerName 集群名称。保留字段，tsf serverlss类型使用。
     */
    public void setSetServerName(String SetServerName) {
        this.SetServerName = SetServerName;
    }

    /**
     * Get 用户类型。保留类型，serverless用户使用。 
     * @return AppIdType 用户类型。保留类型，serverless用户使用。
     */
    public String getAppIdType() {
        return this.AppIdType;
    }

    /**
     * Set 用户类型。保留类型，serverless用户使用。
     * @param AppIdType 用户类型。保留类型，serverless用户使用。
     */
    public void setAppIdType(String AppIdType) {
        this.AppIdType = AppIdType;
    }

    /**
     * Get 标签。 
     * @return Tags 标签。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签。
     * @param Tags 标签。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 独享实例id 
     * @return InstanceId 独享实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 独享实例id
     * @param InstanceId 独享实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get vpc属性 
     * @return UniqVpcId vpc属性
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set vpc属性
     * @param UniqVpcId vpc属性
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    public CreateServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServiceRequest(CreateServiceRequest source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ServiceDesc != null) {
            this.ServiceDesc = new String(source.ServiceDesc);
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
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
        }
        if (source.SetServerName != null) {
            this.SetServerName = new String(source.SetServerName);
        }
        if (source.AppIdType != null) {
            this.AppIdType = new String(source.AppIdType);
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
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ServiceDesc", this.ServiceDesc);
        this.setParamSimple(map, prefix + "ExclusiveSetName", this.ExclusiveSetName);
        this.setParamArraySimple(map, prefix + "NetTypes.", this.NetTypes);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "SetServerName", this.SetServerName);
        this.setParamSimple(map, prefix + "AppIdType", this.AppIdType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);

    }
}

