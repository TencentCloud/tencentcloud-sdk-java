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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddServerlessRoInstancesRequest extends AbstractModel {

    /**
    * <p>集群Id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>ro实例最小规格</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>ro实例最大规格</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>ro实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>所属VPC网络ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>所属子网ID，如果设置了VpcId，则SubnetId必填</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>新增RO组时使用的Port，取值范围为[0,65535)</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>安全组ID，新建只读实例时可以指定安全组</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>是否自动暂停</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul>
    */
    @SerializedName("AutoPause")
    @Expose
    private String AutoPause;

    /**
    * <p>自动暂停时间</p><p>单位：秒</p>
    */
    @SerializedName("AutoPauseDelay")
    @Expose
    private Long AutoPauseDelay;

    /**
    * <p>实例参数</p>
    */
    @SerializedName("InstanceParams")
    @Expose
    private ModifyParamItem [] InstanceParams;

    /**
    * <p>参数模板</p>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * <p>新增的只读实例数量</p>
    */
    @SerializedName("RoCount")
    @Expose
    private Long RoCount;

    /**
     * Get <p>集群Id</p> 
     * @return ClusterId <p>集群Id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群Id</p>
     * @param ClusterId <p>集群Id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>ro实例最小规格</p> 
     * @return MinCpu <p>ro实例最小规格</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>ro实例最小规格</p>
     * @param MinCpu <p>ro实例最小规格</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>ro实例最大规格</p> 
     * @return MaxCpu <p>ro实例最大规格</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>ro实例最大规格</p>
     * @param MaxCpu <p>ro实例最大规格</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>ro实例名称</p> 
     * @return InstanceName <p>ro实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>ro实例名称</p>
     * @param InstanceName <p>ro实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>所属VPC网络ID</p> 
     * @return VpcId <p>所属VPC网络ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>所属VPC网络ID</p>
     * @param VpcId <p>所属VPC网络ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>所属子网ID，如果设置了VpcId，则SubnetId必填</p> 
     * @return SubnetId <p>所属子网ID，如果设置了VpcId，则SubnetId必填</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>所属子网ID，如果设置了VpcId，则SubnetId必填</p>
     * @param SubnetId <p>所属子网ID，如果设置了VpcId，则SubnetId必填</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>新增RO组时使用的Port，取值范围为[0,65535)</p> 
     * @return Port <p>新增RO组时使用的Port，取值范围为[0,65535)</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>新增RO组时使用的Port，取值范围为[0,65535)</p>
     * @param Port <p>新增RO组时使用的Port，取值范围为[0,65535)</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>安全组ID，新建只读实例时可以指定安全组</p> 
     * @return SecurityGroupIds <p>安全组ID，新建只读实例时可以指定安全组</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>安全组ID，新建只读实例时可以指定安全组</p>
     * @param SecurityGroupIds <p>安全组ID，新建只读实例时可以指定安全组</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>是否自动暂停</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul> 
     * @return AutoPause <p>是否自动暂停</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul>
     */
    public String getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set <p>是否自动暂停</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul>
     * @param AutoPause <p>是否自动暂停</p><p>枚举值：</p><ul><li>yes： 是</li><li>no： 否</li></ul>
     */
    public void setAutoPause(String AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get <p>自动暂停时间</p><p>单位：秒</p> 
     * @return AutoPauseDelay <p>自动暂停时间</p><p>单位：秒</p>
     */
    public Long getAutoPauseDelay() {
        return this.AutoPauseDelay;
    }

    /**
     * Set <p>自动暂停时间</p><p>单位：秒</p>
     * @param AutoPauseDelay <p>自动暂停时间</p><p>单位：秒</p>
     */
    public void setAutoPauseDelay(Long AutoPauseDelay) {
        this.AutoPauseDelay = AutoPauseDelay;
    }

    /**
     * Get <p>实例参数</p> 
     * @return InstanceParams <p>实例参数</p>
     */
    public ModifyParamItem [] getInstanceParams() {
        return this.InstanceParams;
    }

    /**
     * Set <p>实例参数</p>
     * @param InstanceParams <p>实例参数</p>
     */
    public void setInstanceParams(ModifyParamItem [] InstanceParams) {
        this.InstanceParams = InstanceParams;
    }

    /**
     * Get <p>参数模板</p> 
     * @return ParamTemplateId <p>参数模板</p>
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>参数模板</p>
     * @param ParamTemplateId <p>参数模板</p>
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>新增的只读实例数量</p> 
     * @return RoCount <p>新增的只读实例数量</p>
     */
    public Long getRoCount() {
        return this.RoCount;
    }

    /**
     * Set <p>新增的只读实例数量</p>
     * @param RoCount <p>新增的只读实例数量</p>
     */
    public void setRoCount(Long RoCount) {
        this.RoCount = RoCount;
    }

    public AddServerlessRoInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddServerlessRoInstancesRequest(AddServerlessRoInstancesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.AutoPause != null) {
            this.AutoPause = new String(source.AutoPause);
        }
        if (source.AutoPauseDelay != null) {
            this.AutoPauseDelay = new Long(source.AutoPauseDelay);
        }
        if (source.InstanceParams != null) {
            this.InstanceParams = new ModifyParamItem[source.InstanceParams.length];
            for (int i = 0; i < source.InstanceParams.length; i++) {
                this.InstanceParams[i] = new ModifyParamItem(source.InstanceParams[i]);
            }
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new Long(source.ParamTemplateId);
        }
        if (source.RoCount != null) {
            this.RoCount = new Long(source.RoCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "AutoPause", this.AutoPause);
        this.setParamSimple(map, prefix + "AutoPauseDelay", this.AutoPauseDelay);
        this.setParamArrayObj(map, prefix + "InstanceParams.", this.InstanceParams);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "RoCount", this.RoCount);

    }
}

