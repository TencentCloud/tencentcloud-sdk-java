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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociatedInstanceInfo extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例类型，3是cvm实例,4是clb实例,5是eni实例,6是云数据库
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 公网IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 内网IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 关联安全组数量
    */
    @SerializedName("SecurityGroupCount")
    @Expose
    private Long SecurityGroupCount;

    /**
    * 关联安全组规则数量
    */
    @SerializedName("SecurityGroupRuleCount")
    @Expose
    private Long SecurityGroupRuleCount;

    /**
    * 关联数据库代理Id
    */
    @SerializedName("CdbId")
    @Expose
    private String CdbId;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例类型，3是cvm实例,4是clb实例,5是eni实例,6是云数据库 
     * @return Type 实例类型，3是cvm实例,4是clb实例,5是eni实例,6是云数据库
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 实例类型，3是cvm实例,4是clb实例,5是eni实例,6是云数据库
     * @param Type 实例类型，3是cvm实例,4是clb实例,5是eni实例,6是云数据库
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络名称 
     * @return VpcName 私有网络名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 私有网络名称
     * @param VpcName 私有网络名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 公网IP 
     * @return PublicIp 公网IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网IP
     * @param PublicIp 公网IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 内网IP 
     * @return Ip 内网IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 内网IP
     * @param Ip 内网IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 关联安全组数量 
     * @return SecurityGroupCount 关联安全组数量
     */
    public Long getSecurityGroupCount() {
        return this.SecurityGroupCount;
    }

    /**
     * Set 关联安全组数量
     * @param SecurityGroupCount 关联安全组数量
     */
    public void setSecurityGroupCount(Long SecurityGroupCount) {
        this.SecurityGroupCount = SecurityGroupCount;
    }

    /**
     * Get 关联安全组规则数量 
     * @return SecurityGroupRuleCount 关联安全组规则数量
     */
    public Long getSecurityGroupRuleCount() {
        return this.SecurityGroupRuleCount;
    }

    /**
     * Set 关联安全组规则数量
     * @param SecurityGroupRuleCount 关联安全组规则数量
     */
    public void setSecurityGroupRuleCount(Long SecurityGroupRuleCount) {
        this.SecurityGroupRuleCount = SecurityGroupRuleCount;
    }

    /**
     * Get 关联数据库代理Id 
     * @return CdbId 关联数据库代理Id
     */
    public String getCdbId() {
        return this.CdbId;
    }

    /**
     * Set 关联数据库代理Id
     * @param CdbId 关联数据库代理Id
     */
    public void setCdbId(String CdbId) {
        this.CdbId = CdbId;
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

    }
}

