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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVpcEndPointRequest extends AbstractModel{

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网实例ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 终端节点名称。
    */
    @SerializedName("EndPointName")
    @Expose
    private String EndPointName;

    /**
    * 终端节点服务ID。
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * 终端节点VIP，可以指定IP申请。
    */
    @SerializedName("EndPointVip")
    @Expose
    private String EndPointVip;

    /**
    * 安全组ID。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
     * Get VPC实例ID。 
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网实例ID。 
     * @return SubnetId 子网实例ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网实例ID。
     * @param SubnetId 子网实例ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 终端节点名称。 
     * @return EndPointName 终端节点名称。
     */
    public String getEndPointName() {
        return this.EndPointName;
    }

    /**
     * Set 终端节点名称。
     * @param EndPointName 终端节点名称。
     */
    public void setEndPointName(String EndPointName) {
        this.EndPointName = EndPointName;
    }

    /**
     * Get 终端节点服务ID。 
     * @return EndPointServiceId 终端节点服务ID。
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set 终端节点服务ID。
     * @param EndPointServiceId 终端节点服务ID。
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get 终端节点VIP，可以指定IP申请。 
     * @return EndPointVip 终端节点VIP，可以指定IP申请。
     */
    public String getEndPointVip() {
        return this.EndPointVip;
    }

    /**
     * Set 终端节点VIP，可以指定IP申请。
     * @param EndPointVip 终端节点VIP，可以指定IP申请。
     */
    public void setEndPointVip(String EndPointVip) {
        this.EndPointVip = EndPointVip;
    }

    /**
     * Get 安全组ID。 
     * @return SecurityGroupId 安全组ID。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组ID。
     * @param SecurityGroupId 安全组ID。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    public CreateVpcEndPointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpcEndPointRequest(CreateVpcEndPointRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.EndPointName != null) {
            this.EndPointName = new String(source.EndPointName);
        }
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.EndPointVip != null) {
            this.EndPointVip = new String(source.EndPointVip);
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "EndPointName", this.EndPointName);
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamSimple(map, prefix + "EndPointVip", this.EndPointVip);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);

    }
}

