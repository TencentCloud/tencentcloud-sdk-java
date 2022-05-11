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

public class CreateClusterEndpointRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群端口所在的子网ID  (仅在开启非外网访问时需要填，必须为集群所在VPC内的子网)
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 是否为外网访问（TRUE 外网访问 FALSE 内网访问，默认值： FALSE）
    */
    @SerializedName("IsExtranet")
    @Expose
    private Boolean IsExtranet;

    /**
    * 设置域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 使用的安全组，只有外网访问需要传递
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
    * 创建lb参数，只有外网访问需要设置
    */
    @SerializedName("ExtensiveParameters")
    @Expose
    private String ExtensiveParameters;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群端口所在的子网ID  (仅在开启非外网访问时需要填，必须为集群所在VPC内的子网) 
     * @return SubnetId 集群端口所在的子网ID  (仅在开启非外网访问时需要填，必须为集群所在VPC内的子网)
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 集群端口所在的子网ID  (仅在开启非外网访问时需要填，必须为集群所在VPC内的子网)
     * @param SubnetId 集群端口所在的子网ID  (仅在开启非外网访问时需要填，必须为集群所在VPC内的子网)
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 是否为外网访问（TRUE 外网访问 FALSE 内网访问，默认值： FALSE） 
     * @return IsExtranet 是否为外网访问（TRUE 外网访问 FALSE 内网访问，默认值： FALSE）
     */
    public Boolean getIsExtranet() {
        return this.IsExtranet;
    }

    /**
     * Set 是否为外网访问（TRUE 外网访问 FALSE 内网访问，默认值： FALSE）
     * @param IsExtranet 是否为外网访问（TRUE 外网访问 FALSE 内网访问，默认值： FALSE）
     */
    public void setIsExtranet(Boolean IsExtranet) {
        this.IsExtranet = IsExtranet;
    }

    /**
     * Get 设置域名 
     * @return Domain 设置域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 设置域名
     * @param Domain 设置域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 使用的安全组，只有外网访问需要传递 
     * @return SecurityGroup 使用的安全组，只有外网访问需要传递
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 使用的安全组，只有外网访问需要传递
     * @param SecurityGroup 使用的安全组，只有外网访问需要传递
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get 创建lb参数，只有外网访问需要设置 
     * @return ExtensiveParameters 创建lb参数，只有外网访问需要设置
     */
    public String getExtensiveParameters() {
        return this.ExtensiveParameters;
    }

    /**
     * Set 创建lb参数，只有外网访问需要设置
     * @param ExtensiveParameters 创建lb参数，只有外网访问需要设置
     */
    public void setExtensiveParameters(String ExtensiveParameters) {
        this.ExtensiveParameters = ExtensiveParameters;
    }

    public CreateClusterEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterEndpointRequest(CreateClusterEndpointRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.IsExtranet != null) {
            this.IsExtranet = new Boolean(source.IsExtranet);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String(source.SecurityGroup);
        }
        if (source.ExtensiveParameters != null) {
            this.ExtensiveParameters = new String(source.ExtensiveParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "IsExtranet", this.IsExtranet);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SecurityGroup", this.SecurityGroup);
        this.setParamSimple(map, prefix + "ExtensiveParameters", this.ExtensiveParameters);

    }
}

