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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel{

    /**
    * appid信息
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * vpcid信息
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc名称
    */
    @SerializedName("VPCName")
    @Expose
    private String VPCName;

    /**
    * 子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 资产id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资产名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 资产类型
 3是cvm实例,4是clb实例,5是eni实例,6是mysql,7是redis,8是NAT,9是VPN,10是ES,11是MARIADB,12是KAFKA 13 NATFW
    */
    @SerializedName("InsType")
    @Expose
    private Long InsType;

    /**
    * 公网ip
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 内网ip
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 端口数
    */
    @SerializedName("PortNum")
    @Expose
    private String PortNum;

    /**
    * 漏洞数
    */
    @SerializedName("LeakNum")
    @Expose
    private String LeakNum;

    /**
    * 1，公网 2内网
    */
    @SerializedName("InsSource")
    @Expose
    private String InsSource;

    /**
    * [a,b]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePath")
    @Expose
    private String [] ResourcePath;

    /**
     * Get appid信息 
     * @return AppId appid信息
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set appid信息
     * @param AppId appid信息
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get vpcid信息 
     * @return VpcId vpcid信息
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcid信息
     * @param VpcId vpcid信息
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc名称 
     * @return VPCName vpc名称
     */
    public String getVPCName() {
        return this.VPCName;
    }

    /**
     * Set vpc名称
     * @param VPCName vpc名称
     */
    public void setVPCName(String VPCName) {
        this.VPCName = VPCName;
    }

    /**
     * Get 子网id 
     * @return SubnetId 子网id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
     * @param SubnetId 子网id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 资产id 
     * @return InstanceId 资产id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资产id
     * @param InstanceId 资产id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资产名 
     * @return InstanceName 资产名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 资产名
     * @param InstanceName 资产名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 资产类型
 3是cvm实例,4是clb实例,5是eni实例,6是mysql,7是redis,8是NAT,9是VPN,10是ES,11是MARIADB,12是KAFKA 13 NATFW 
     * @return InsType 资产类型
 3是cvm实例,4是clb实例,5是eni实例,6是mysql,7是redis,8是NAT,9是VPN,10是ES,11是MARIADB,12是KAFKA 13 NATFW
     */
    public Long getInsType() {
        return this.InsType;
    }

    /**
     * Set 资产类型
 3是cvm实例,4是clb实例,5是eni实例,6是mysql,7是redis,8是NAT,9是VPN,10是ES,11是MARIADB,12是KAFKA 13 NATFW
     * @param InsType 资产类型
 3是cvm实例,4是clb实例,5是eni实例,6是mysql,7是redis,8是NAT,9是VPN,10是ES,11是MARIADB,12是KAFKA 13 NATFW
     */
    public void setInsType(Long InsType) {
        this.InsType = InsType;
    }

    /**
     * Get 公网ip 
     * @return PublicIp 公网ip
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网ip
     * @param PublicIp 公网ip
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 内网ip 
     * @return PrivateIp 内网ip
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网ip
     * @param PrivateIp 内网ip
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 端口数 
     * @return PortNum 端口数
     */
    public String getPortNum() {
        return this.PortNum;
    }

    /**
     * Set 端口数
     * @param PortNum 端口数
     */
    public void setPortNum(String PortNum) {
        this.PortNum = PortNum;
    }

    /**
     * Get 漏洞数 
     * @return LeakNum 漏洞数
     */
    public String getLeakNum() {
        return this.LeakNum;
    }

    /**
     * Set 漏洞数
     * @param LeakNum 漏洞数
     */
    public void setLeakNum(String LeakNum) {
        this.LeakNum = LeakNum;
    }

    /**
     * Get 1，公网 2内网 
     * @return InsSource 1，公网 2内网
     */
    public String getInsSource() {
        return this.InsSource;
    }

    /**
     * Set 1，公网 2内网
     * @param InsSource 1，公网 2内网
     */
    public void setInsSource(String InsSource) {
        this.InsSource = InsSource;
    }

    /**
     * Get [a,b]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePath [a,b]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getResourcePath() {
        return this.ResourcePath;
    }

    /**
     * Set [a,b]
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePath [a,b]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePath(String [] ResourcePath) {
        this.ResourcePath = ResourcePath;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VPCName != null) {
            this.VPCName = new String(source.VPCName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InsType != null) {
            this.InsType = new Long(source.InsType);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PortNum != null) {
            this.PortNum = new String(source.PortNum);
        }
        if (source.LeakNum != null) {
            this.LeakNum = new String(source.LeakNum);
        }
        if (source.InsSource != null) {
            this.InsSource = new String(source.InsSource);
        }
        if (source.ResourcePath != null) {
            this.ResourcePath = new String[source.ResourcePath.length];
            for (int i = 0; i < source.ResourcePath.length; i++) {
                this.ResourcePath[i] = new String(source.ResourcePath[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VPCName", this.VPCName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InsType", this.InsType);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PortNum", this.PortNum);
        this.setParamSimple(map, prefix + "LeakNum", this.LeakNum);
        this.setParamSimple(map, prefix + "InsSource", this.InsSource);
        this.setParamArraySimple(map, prefix + "ResourcePath.", this.ResourcePath);

    }
}

