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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancesRequest extends AbstractModel {

    /**
    * <p>可用区代码，如 ap-guangzhou-1。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>机型规格，如 BMS5.MEDIUM8。</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>内网网络实例ID，格式如 net-xxx。</p>
    */
    @SerializedName("PrivateNetworkId")
    @Expose
    private String PrivateNetworkId;

    /**
    * <p>公网网络实例ID，格式如 net-xxx。</p>
    */
    @SerializedName("PublicNetworkId")
    @Expose
    private String PublicNetworkId;

    /**
    * <p>实例名称。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>镜像ID，如 img-centos-7.9。</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>创建数量，默认1，最大50。</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>登录密码，与SSHKey二选一</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>SSH密钥公钥字符串，与Password二选一</p>
    */
    @SerializedName("SSHKey")
    @Expose
    private String SSHKey;

    /**
    * <p>镜像版本号，仅公共镜像有版本概念。</p>
    */
    @SerializedName("VersionNumber")
    @Expose
    private String VersionNumber;

    /**
    * <p>是否启用公网IPv6，默认false。启用后系统会在分配IPv4后额外分配一个IPv6地址。</p>
    */
    @SerializedName("EnableIpv6")
    @Expose
    private Boolean EnableIpv6;

    /**
     * Get <p>可用区代码，如 ap-guangzhou-1。</p> 
     * @return Zone <p>可用区代码，如 ap-guangzhou-1。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区代码，如 ap-guangzhou-1。</p>
     * @param Zone <p>可用区代码，如 ap-guangzhou-1。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>机型规格，如 BMS5.MEDIUM8。</p> 
     * @return InstanceType <p>机型规格，如 BMS5.MEDIUM8。</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>机型规格，如 BMS5.MEDIUM8。</p>
     * @param InstanceType <p>机型规格，如 BMS5.MEDIUM8。</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>内网网络实例ID，格式如 net-xxx。</p> 
     * @return PrivateNetworkId <p>内网网络实例ID，格式如 net-xxx。</p>
     */
    public String getPrivateNetworkId() {
        return this.PrivateNetworkId;
    }

    /**
     * Set <p>内网网络实例ID，格式如 net-xxx。</p>
     * @param PrivateNetworkId <p>内网网络实例ID，格式如 net-xxx。</p>
     */
    public void setPrivateNetworkId(String PrivateNetworkId) {
        this.PrivateNetworkId = PrivateNetworkId;
    }

    /**
     * Get <p>公网网络实例ID，格式如 net-xxx。</p> 
     * @return PublicNetworkId <p>公网网络实例ID，格式如 net-xxx。</p>
     */
    public String getPublicNetworkId() {
        return this.PublicNetworkId;
    }

    /**
     * Set <p>公网网络实例ID，格式如 net-xxx。</p>
     * @param PublicNetworkId <p>公网网络实例ID，格式如 net-xxx。</p>
     */
    public void setPublicNetworkId(String PublicNetworkId) {
        this.PublicNetworkId = PublicNetworkId;
    }

    /**
     * Get <p>实例名称。</p> 
     * @return InstanceName <p>实例名称。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称。</p>
     * @param InstanceName <p>实例名称。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>镜像ID，如 img-centos-7.9。</p> 
     * @return ImageId <p>镜像ID，如 img-centos-7.9。</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像ID，如 img-centos-7.9。</p>
     * @param ImageId <p>镜像ID，如 img-centos-7.9。</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>创建数量，默认1，最大50。</p> 
     * @return InstanceCount <p>创建数量，默认1，最大50。</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>创建数量，默认1，最大50。</p>
     * @param InstanceCount <p>创建数量，默认1，最大50。</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>登录密码，与SSHKey二选一</p> 
     * @return Password <p>登录密码，与SSHKey二选一</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>登录密码，与SSHKey二选一</p>
     * @param Password <p>登录密码，与SSHKey二选一</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>SSH密钥公钥字符串，与Password二选一</p> 
     * @return SSHKey <p>SSH密钥公钥字符串，与Password二选一</p>
     */
    public String getSSHKey() {
        return this.SSHKey;
    }

    /**
     * Set <p>SSH密钥公钥字符串，与Password二选一</p>
     * @param SSHKey <p>SSH密钥公钥字符串，与Password二选一</p>
     */
    public void setSSHKey(String SSHKey) {
        this.SSHKey = SSHKey;
    }

    /**
     * Get <p>镜像版本号，仅公共镜像有版本概念。</p> 
     * @return VersionNumber <p>镜像版本号，仅公共镜像有版本概念。</p>
     * @deprecated
     */
    @Deprecated
    public String getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set <p>镜像版本号，仅公共镜像有版本概念。</p>
     * @param VersionNumber <p>镜像版本号，仅公共镜像有版本概念。</p>
     * @deprecated
     */
    @Deprecated
    public void setVersionNumber(String VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Get <p>是否启用公网IPv6，默认false。启用后系统会在分配IPv4后额外分配一个IPv6地址。</p> 
     * @return EnableIpv6 <p>是否启用公网IPv6，默认false。启用后系统会在分配IPv4后额外分配一个IPv6地址。</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getEnableIpv6() {
        return this.EnableIpv6;
    }

    /**
     * Set <p>是否启用公网IPv6，默认false。启用后系统会在分配IPv4后额外分配一个IPv6地址。</p>
     * @param EnableIpv6 <p>是否启用公网IPv6，默认false。启用后系统会在分配IPv4后额外分配一个IPv6地址。</p>
     * @deprecated
     */
    @Deprecated
    public void setEnableIpv6(Boolean EnableIpv6) {
        this.EnableIpv6 = EnableIpv6;
    }

    public CreateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancesRequest(CreateInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.PrivateNetworkId != null) {
            this.PrivateNetworkId = new String(source.PrivateNetworkId);
        }
        if (source.PublicNetworkId != null) {
            this.PublicNetworkId = new String(source.PublicNetworkId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.SSHKey != null) {
            this.SSHKey = new String(source.SSHKey);
        }
        if (source.VersionNumber != null) {
            this.VersionNumber = new String(source.VersionNumber);
        }
        if (source.EnableIpv6 != null) {
            this.EnableIpv6 = new Boolean(source.EnableIpv6);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "PrivateNetworkId", this.PrivateNetworkId);
        this.setParamSimple(map, prefix + "PublicNetworkId", this.PublicNetworkId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "SSHKey", this.SSHKey);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "EnableIpv6", this.EnableIpv6);

    }
}

