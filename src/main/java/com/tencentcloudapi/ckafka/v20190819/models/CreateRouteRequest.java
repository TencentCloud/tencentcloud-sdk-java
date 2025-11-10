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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRouteRequest extends AbstractModel {

    /**
    * <p>ckafka集群实例id,可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>路由网络类型(3:vpc路由;7:内部支撑路由;1:公网路由)</p>
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * <p>vpc网络Id,当vipType为3时必填</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>vpc子网id,当vipType为3时必填</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>访问类型：0-plaintext；1-sasl_plaintext；3-sasl_ssl; 4-sasl_scram_sha_256; 5-sasl_scram_sha_512  默认为0vipType=3,支持 0,1,3,4,5vipType=7,支持0,1,3vipType=1,支持1,3</p>
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * <p>是否需要权限管理,该字段已废弃</p>
    */
    @SerializedName("AuthFlag")
    @Expose
    private Long AuthFlag;

    /**
    * <p>调用方appId</p>
    */
    @SerializedName("CallerAppid")
    @Expose
    private Long CallerAppid;

    /**
    * <p>公网带宽,公网路由必传,且是3的倍数,无默认值</p>
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Long PublicNetwork;

    /**
    * <p>vip地址</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>备注信息</p>
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * <p>关联安全组有序列表</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get <p>ckafka集群实例id,可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p> 
     * @return InstanceId <p>ckafka集群实例id,可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例id,可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     * @param InstanceId <p>ckafka集群实例id,可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>路由网络类型(3:vpc路由;7:内部支撑路由;1:公网路由)</p> 
     * @return VipType <p>路由网络类型(3:vpc路由;7:内部支撑路由;1:公网路由)</p>
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set <p>路由网络类型(3:vpc路由;7:内部支撑路由;1:公网路由)</p>
     * @param VipType <p>路由网络类型(3:vpc路由;7:内部支撑路由;1:公网路由)</p>
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get <p>vpc网络Id,当vipType为3时必填</p> 
     * @return VpcId <p>vpc网络Id,当vipType为3时必填</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>vpc网络Id,当vipType为3时必填</p>
     * @param VpcId <p>vpc网络Id,当vipType为3时必填</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>vpc子网id,当vipType为3时必填</p> 
     * @return SubnetId <p>vpc子网id,当vipType为3时必填</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>vpc子网id,当vipType为3时必填</p>
     * @param SubnetId <p>vpc子网id,当vipType为3时必填</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>访问类型：0-plaintext；1-sasl_plaintext；3-sasl_ssl; 4-sasl_scram_sha_256; 5-sasl_scram_sha_512  默认为0vipType=3,支持 0,1,3,4,5vipType=7,支持0,1,3vipType=1,支持1,3</p> 
     * @return AccessType <p>访问类型：0-plaintext；1-sasl_plaintext；3-sasl_ssl; 4-sasl_scram_sha_256; 5-sasl_scram_sha_512  默认为0vipType=3,支持 0,1,3,4,5vipType=7,支持0,1,3vipType=1,支持1,3</p>
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>访问类型：0-plaintext；1-sasl_plaintext；3-sasl_ssl; 4-sasl_scram_sha_256; 5-sasl_scram_sha_512  默认为0vipType=3,支持 0,1,3,4,5vipType=7,支持0,1,3vipType=1,支持1,3</p>
     * @param AccessType <p>访问类型：0-plaintext；1-sasl_plaintext；3-sasl_ssl; 4-sasl_scram_sha_256; 5-sasl_scram_sha_512  默认为0vipType=3,支持 0,1,3,4,5vipType=7,支持0,1,3vipType=1,支持1,3</p>
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <p>是否需要权限管理,该字段已废弃</p> 
     * @return AuthFlag <p>是否需要权限管理,该字段已废弃</p>
     */
    public Long getAuthFlag() {
        return this.AuthFlag;
    }

    /**
     * Set <p>是否需要权限管理,该字段已废弃</p>
     * @param AuthFlag <p>是否需要权限管理,该字段已废弃</p>
     */
    public void setAuthFlag(Long AuthFlag) {
        this.AuthFlag = AuthFlag;
    }

    /**
     * Get <p>调用方appId</p> 
     * @return CallerAppid <p>调用方appId</p>
     */
    public Long getCallerAppid() {
        return this.CallerAppid;
    }

    /**
     * Set <p>调用方appId</p>
     * @param CallerAppid <p>调用方appId</p>
     */
    public void setCallerAppid(Long CallerAppid) {
        this.CallerAppid = CallerAppid;
    }

    /**
     * Get <p>公网带宽,公网路由必传,且是3的倍数,无默认值</p> 
     * @return PublicNetwork <p>公网带宽,公网路由必传,且是3的倍数,无默认值</p>
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set <p>公网带宽,公网路由必传,且是3的倍数,无默认值</p>
     * @param PublicNetwork <p>公网带宽,公网路由必传,且是3的倍数,无默认值</p>
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get <p>vip地址</p> 
     * @return Ip <p>vip地址</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>vip地址</p>
     * @param Ip <p>vip地址</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>备注信息</p> 
     * @return Note <p>备注信息</p>
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set <p>备注信息</p>
     * @param Note <p>备注信息</p>
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get <p>关联安全组有序列表</p> 
     * @return SecurityGroupIds <p>关联安全组有序列表</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>关联安全组有序列表</p>
     * @param SecurityGroupIds <p>关联安全组有序列表</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public CreateRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRouteRequest(CreateRouteRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.AuthFlag != null) {
            this.AuthFlag = new Long(source.AuthFlag);
        }
        if (source.CallerAppid != null) {
            this.CallerAppid = new Long(source.CallerAppid);
        }
        if (source.PublicNetwork != null) {
            this.PublicNetwork = new Long(source.PublicNetwork);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "AuthFlag", this.AuthFlag);
        this.setParamSimple(map, prefix + "CallerAppid", this.CallerAppid);
        this.setParamSimple(map, prefix + "PublicNetwork", this.PublicNetwork);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

