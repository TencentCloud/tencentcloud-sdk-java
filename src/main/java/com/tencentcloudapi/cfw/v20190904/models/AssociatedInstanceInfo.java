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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociatedInstanceInfo extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例类型，3是cvm实例,4是clb实例,5是eni实例,6是云数据库</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>私有网络ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络名称</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>公网IP</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>内网IP</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>关联安全组数量</p>
    */
    @SerializedName("SecurityGroupCount")
    @Expose
    private Long SecurityGroupCount;

    /**
    * <p>关联安全组规则数量</p>
    */
    @SerializedName("SecurityGroupRuleCount")
    @Expose
    private Long SecurityGroupRuleCount;

    /**
    * <p>关联数据库代理Id</p>
    */
    @SerializedName("CdbId")
    @Expose
    private String CdbId;

    /**
    * <p>容器服务集群ID</p>
    */
    @SerializedName("TkeClusterId")
    @Expose
    private String TkeClusterId;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例类型，3是cvm实例,4是clb实例,5是eni实例,6是云数据库</p> 
     * @return Type <p>实例类型，3是cvm实例,4是clb实例,5是eni实例,6是云数据库</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>实例类型，3是cvm实例,4是clb实例,5是eni实例,6是云数据库</p>
     * @param Type <p>实例类型，3是cvm实例,4是clb实例,5是eni实例,6是云数据库</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>私有网络ID</p> 
     * @return VpcId <p>私有网络ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID</p>
     * @param VpcId <p>私有网络ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络名称</p> 
     * @return VpcName <p>私有网络名称</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>私有网络名称</p>
     * @param VpcName <p>私有网络名称</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>公网IP</p> 
     * @return PublicIp <p>公网IP</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>公网IP</p>
     * @param PublicIp <p>公网IP</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>内网IP</p> 
     * @return Ip <p>内网IP</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>内网IP</p>
     * @param Ip <p>内网IP</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>关联安全组数量</p> 
     * @return SecurityGroupCount <p>关联安全组数量</p>
     */
    public Long getSecurityGroupCount() {
        return this.SecurityGroupCount;
    }

    /**
     * Set <p>关联安全组数量</p>
     * @param SecurityGroupCount <p>关联安全组数量</p>
     */
    public void setSecurityGroupCount(Long SecurityGroupCount) {
        this.SecurityGroupCount = SecurityGroupCount;
    }

    /**
     * Get <p>关联安全组规则数量</p> 
     * @return SecurityGroupRuleCount <p>关联安全组规则数量</p>
     */
    public Long getSecurityGroupRuleCount() {
        return this.SecurityGroupRuleCount;
    }

    /**
     * Set <p>关联安全组规则数量</p>
     * @param SecurityGroupRuleCount <p>关联安全组规则数量</p>
     */
    public void setSecurityGroupRuleCount(Long SecurityGroupRuleCount) {
        this.SecurityGroupRuleCount = SecurityGroupRuleCount;
    }

    /**
     * Get <p>关联数据库代理Id</p> 
     * @return CdbId <p>关联数据库代理Id</p>
     */
    public String getCdbId() {
        return this.CdbId;
    }

    /**
     * Set <p>关联数据库代理Id</p>
     * @param CdbId <p>关联数据库代理Id</p>
     */
    public void setCdbId(String CdbId) {
        this.CdbId = CdbId;
    }

    /**
     * Get <p>容器服务集群ID</p> 
     * @return TkeClusterId <p>容器服务集群ID</p>
     */
    public String getTkeClusterId() {
        return this.TkeClusterId;
    }

    /**
     * Set <p>容器服务集群ID</p>
     * @param TkeClusterId <p>容器服务集群ID</p>
     */
    public void setTkeClusterId(String TkeClusterId) {
        this.TkeClusterId = TkeClusterId;
    }

    public AssociatedInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociatedInstanceInfo(AssociatedInstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.SecurityGroupCount != null) {
            this.SecurityGroupCount = new Long(source.SecurityGroupCount);
        }
        if (source.SecurityGroupRuleCount != null) {
            this.SecurityGroupRuleCount = new Long(source.SecurityGroupRuleCount);
        }
        if (source.CdbId != null) {
            this.CdbId = new String(source.CdbId);
        }
        if (source.TkeClusterId != null) {
            this.TkeClusterId = new String(source.TkeClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "SecurityGroupCount", this.SecurityGroupCount);
        this.setParamSimple(map, prefix + "SecurityGroupRuleCount", this.SecurityGroupRuleCount);
        this.setParamSimple(map, prefix + "CdbId", this.CdbId);
        this.setParamSimple(map, prefix + "TkeClusterId", this.TkeClusterId);

    }
}

