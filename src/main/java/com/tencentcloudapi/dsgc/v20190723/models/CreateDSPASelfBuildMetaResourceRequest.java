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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDSPASelfBuildMetaResourceRequest extends AbstractModel {

    /**
    * Dspa实例ID。
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 自建数据库类型。目前支持的自建数据库类型按照协议进行区分，支持两种开源数据库协议：
mysql_like_proto -- Mysql协议类关系型数据库，
postgre_like_proto -- Postgre协议类关系型数据库。
其他闭源协议的数据库如SqlServer、Oracle等暂不支持。
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * 资源所处地域。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 自建云资源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 可用于访问自建云资源的IP。
    */
    @SerializedName("ResourceVip")
    @Expose
    private String ResourceVip;

    /**
    * 可用于访问自建云资源的端口。
    */
    @SerializedName("ResourceVPort")
    @Expose
    private Long ResourceVPort;

    /**
    * 自建云资源的VPC ID。
    */
    @SerializedName("ResourceUniqueVpcId")
    @Expose
    private String ResourceUniqueVpcId;

    /**
    * 自建云资源的Subnet ID。
    */
    @SerializedName("ResourceUniqueSubnetId")
    @Expose
    private String ResourceUniqueSubnetId;

    /**
    * 自建云资源所处的服务类型，可选：
cvm - 通过云服务器直接访问。
clb - 通过LB的方式进行访问。
    */
    @SerializedName("ResourceAccessType")
    @Expose
    private String ResourceAccessType;

    /**
    * 账户名。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 账户密码。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 资源名称，1-60个字符。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
     * Get Dspa实例ID。 
     * @return DspaId Dspa实例ID。
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set Dspa实例ID。
     * @param DspaId Dspa实例ID。
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 自建数据库类型。目前支持的自建数据库类型按照协议进行区分，支持两种开源数据库协议：
mysql_like_proto -- Mysql协议类关系型数据库，
postgre_like_proto -- Postgre协议类关系型数据库。
其他闭源协议的数据库如SqlServer、Oracle等暂不支持。 
     * @return MetaType 自建数据库类型。目前支持的自建数据库类型按照协议进行区分，支持两种开源数据库协议：
mysql_like_proto -- Mysql协议类关系型数据库，
postgre_like_proto -- Postgre协议类关系型数据库。
其他闭源协议的数据库如SqlServer、Oracle等暂不支持。
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set 自建数据库类型。目前支持的自建数据库类型按照协议进行区分，支持两种开源数据库协议：
mysql_like_proto -- Mysql协议类关系型数据库，
postgre_like_proto -- Postgre协议类关系型数据库。
其他闭源协议的数据库如SqlServer、Oracle等暂不支持。
     * @param MetaType 自建数据库类型。目前支持的自建数据库类型按照协议进行区分，支持两种开源数据库协议：
mysql_like_proto -- Mysql协议类关系型数据库，
postgre_like_proto -- Postgre协议类关系型数据库。
其他闭源协议的数据库如SqlServer、Oracle等暂不支持。
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get 资源所处地域。 
     * @return ResourceRegion 资源所处地域。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所处地域。
     * @param ResourceRegion 资源所处地域。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 自建云资源ID。 
     * @return ResourceId 自建云资源ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 自建云资源ID。
     * @param ResourceId 自建云资源ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 可用于访问自建云资源的IP。 
     * @return ResourceVip 可用于访问自建云资源的IP。
     */
    public String getResourceVip() {
        return this.ResourceVip;
    }

    /**
     * Set 可用于访问自建云资源的IP。
     * @param ResourceVip 可用于访问自建云资源的IP。
     */
    public void setResourceVip(String ResourceVip) {
        this.ResourceVip = ResourceVip;
    }

    /**
     * Get 可用于访问自建云资源的端口。 
     * @return ResourceVPort 可用于访问自建云资源的端口。
     */
    public Long getResourceVPort() {
        return this.ResourceVPort;
    }

    /**
     * Set 可用于访问自建云资源的端口。
     * @param ResourceVPort 可用于访问自建云资源的端口。
     */
    public void setResourceVPort(Long ResourceVPort) {
        this.ResourceVPort = ResourceVPort;
    }

    /**
     * Get 自建云资源的VPC ID。 
     * @return ResourceUniqueVpcId 自建云资源的VPC ID。
     */
    public String getResourceUniqueVpcId() {
        return this.ResourceUniqueVpcId;
    }

    /**
     * Set 自建云资源的VPC ID。
     * @param ResourceUniqueVpcId 自建云资源的VPC ID。
     */
    public void setResourceUniqueVpcId(String ResourceUniqueVpcId) {
        this.ResourceUniqueVpcId = ResourceUniqueVpcId;
    }

    /**
     * Get 自建云资源的Subnet ID。 
     * @return ResourceUniqueSubnetId 自建云资源的Subnet ID。
     */
    public String getResourceUniqueSubnetId() {
        return this.ResourceUniqueSubnetId;
    }

    /**
     * Set 自建云资源的Subnet ID。
     * @param ResourceUniqueSubnetId 自建云资源的Subnet ID。
     */
    public void setResourceUniqueSubnetId(String ResourceUniqueSubnetId) {
        this.ResourceUniqueSubnetId = ResourceUniqueSubnetId;
    }

    /**
     * Get 自建云资源所处的服务类型，可选：
cvm - 通过云服务器直接访问。
clb - 通过LB的方式进行访问。 
     * @return ResourceAccessType 自建云资源所处的服务类型，可选：
cvm - 通过云服务器直接访问。
clb - 通过LB的方式进行访问。
     */
    public String getResourceAccessType() {
        return this.ResourceAccessType;
    }

    /**
     * Set 自建云资源所处的服务类型，可选：
cvm - 通过云服务器直接访问。
clb - 通过LB的方式进行访问。
     * @param ResourceAccessType 自建云资源所处的服务类型，可选：
cvm - 通过云服务器直接访问。
clb - 通过LB的方式进行访问。
     */
    public void setResourceAccessType(String ResourceAccessType) {
        this.ResourceAccessType = ResourceAccessType;
    }

    /**
     * Get 账户名。 
     * @return UserName 账户名。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 账户名。
     * @param UserName 账户名。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 账户密码。 
     * @return Password 账户密码。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 账户密码。
     * @param Password 账户密码。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 资源名称，1-60个字符。 
     * @return ResourceName 资源名称，1-60个字符。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称，1-60个字符。
     * @param ResourceName 资源名称，1-60个字符。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    public CreateDSPASelfBuildMetaResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDSPASelfBuildMetaResourceRequest(CreateDSPASelfBuildMetaResourceRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceVip != null) {
            this.ResourceVip = new String(source.ResourceVip);
        }
        if (source.ResourceVPort != null) {
            this.ResourceVPort = new Long(source.ResourceVPort);
        }
        if (source.ResourceUniqueVpcId != null) {
            this.ResourceUniqueVpcId = new String(source.ResourceUniqueVpcId);
        }
        if (source.ResourceUniqueSubnetId != null) {
            this.ResourceUniqueSubnetId = new String(source.ResourceUniqueSubnetId);
        }
        if (source.ResourceAccessType != null) {
            this.ResourceAccessType = new String(source.ResourceAccessType);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceVip", this.ResourceVip);
        this.setParamSimple(map, prefix + "ResourceVPort", this.ResourceVPort);
        this.setParamSimple(map, prefix + "ResourceUniqueVpcId", this.ResourceUniqueVpcId);
        this.setParamSimple(map, prefix + "ResourceUniqueSubnetId", this.ResourceUniqueSubnetId);
        this.setParamSimple(map, prefix + "ResourceAccessType", this.ResourceAccessType);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);

    }
}

