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

public class AddInstancesRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Cpu核数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存，单位为GB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>新增只读实例数，取值范围为(0,15]</p>
    */
    @SerializedName("ReadOnlyCount")
    @Expose
    private Long ReadOnlyCount;

    /**
    * <p>实例机器类型，支持值如下：</p><ul><li>common：表示通用型</li><li>exclusive：表示独享型</li></ul>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>实例组ID，在已有RO组中新增实例时使用，不传则新增RO组。当前版本不建议传输该值。</p>
    */
    @SerializedName("InstanceGrpId")
    @Expose
    private String InstanceGrpId;

    /**
    * <p>所属VPC网络ID。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>所属子网ID，如果设置了VpcId，则SubnetId必填。</p>
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
    * <p>实例名称，字符串长度范围为[0,64)，取值范围为大小写字母，0-9数字，&#39;_&#39;,&#39;-&#39;,&#39;.&#39;</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>是否自动选择代金券 1是 0否 默认为0</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>数据库类型，取值范围: </p><li> MYSQL </li>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>订单来源，字符串长度范围为[0,64)</p>
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
    * <p>交易模式 0-下单并支付 1-下单</p>
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
    * <p>参数模板ID</p>
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * <p>参数列表，ParamTemplateId 传入时InstanceParams才有效</p>
    */
    @SerializedName("InstanceParams")
    @Expose
    private ModifyParamItem [] InstanceParams;

    /**
    * <p>安全组ID，新建只读实例时可以指定安全组。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>proxy同步升级</p>
    */
    @SerializedName("UpgradeProxy")
    @Expose
    private UpgradeProxy UpgradeProxy;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Cpu核数</p> 
     * @return Cpu <p>Cpu核数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Cpu核数</p>
     * @param Cpu <p>Cpu核数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存，单位为GB</p> 
     * @return Memory <p>内存，单位为GB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存，单位为GB</p>
     * @param Memory <p>内存，单位为GB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>新增只读实例数，取值范围为(0,15]</p> 
     * @return ReadOnlyCount <p>新增只读实例数，取值范围为(0,15]</p>
     */
    public Long getReadOnlyCount() {
        return this.ReadOnlyCount;
    }

    /**
     * Set <p>新增只读实例数，取值范围为(0,15]</p>
     * @param ReadOnlyCount <p>新增只读实例数，取值范围为(0,15]</p>
     */
    public void setReadOnlyCount(Long ReadOnlyCount) {
        this.ReadOnlyCount = ReadOnlyCount;
    }

    /**
     * Get <p>实例机器类型，支持值如下：</p><ul><li>common：表示通用型</li><li>exclusive：表示独享型</li></ul> 
     * @return DeviceType <p>实例机器类型，支持值如下：</p><ul><li>common：表示通用型</li><li>exclusive：表示独享型</li></ul>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>实例机器类型，支持值如下：</p><ul><li>common：表示通用型</li><li>exclusive：表示独享型</li></ul>
     * @param DeviceType <p>实例机器类型，支持值如下：</p><ul><li>common：表示通用型</li><li>exclusive：表示独享型</li></ul>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>实例组ID，在已有RO组中新增实例时使用，不传则新增RO组。当前版本不建议传输该值。</p> 
     * @return InstanceGrpId <p>实例组ID，在已有RO组中新增实例时使用，不传则新增RO组。当前版本不建议传输该值。</p>
     * @deprecated
     */
    @Deprecated
    public String getInstanceGrpId() {
        return this.InstanceGrpId;
    }

    /**
     * Set <p>实例组ID，在已有RO组中新增实例时使用，不传则新增RO组。当前版本不建议传输该值。</p>
     * @param InstanceGrpId <p>实例组ID，在已有RO组中新增实例时使用，不传则新增RO组。当前版本不建议传输该值。</p>
     * @deprecated
     */
    @Deprecated
    public void setInstanceGrpId(String InstanceGrpId) {
        this.InstanceGrpId = InstanceGrpId;
    }

    /**
     * Get <p>所属VPC网络ID。</p> 
     * @return VpcId <p>所属VPC网络ID。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>所属VPC网络ID。</p>
     * @param VpcId <p>所属VPC网络ID。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>所属子网ID，如果设置了VpcId，则SubnetId必填。</p> 
     * @return SubnetId <p>所属子网ID，如果设置了VpcId，则SubnetId必填。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>所属子网ID，如果设置了VpcId，则SubnetId必填。</p>
     * @param SubnetId <p>所属子网ID，如果设置了VpcId，则SubnetId必填。</p>
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
     * Get <p>实例名称，字符串长度范围为[0,64)，取值范围为大小写字母，0-9数字，&#39;_&#39;,&#39;-&#39;,&#39;.&#39;</p> 
     * @return InstanceName <p>实例名称，字符串长度范围为[0,64)，取值范围为大小写字母，0-9数字，&#39;_&#39;,&#39;-&#39;,&#39;.&#39;</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称，字符串长度范围为[0,64)，取值范围为大小写字母，0-9数字，&#39;_&#39;,&#39;-&#39;,&#39;.&#39;</p>
     * @param InstanceName <p>实例名称，字符串长度范围为[0,64)，取值范围为大小写字母，0-9数字，&#39;_&#39;,&#39;-&#39;,&#39;.&#39;</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>是否自动选择代金券 1是 0否 默认为0</p> 
     * @return AutoVoucher <p>是否自动选择代金券 1是 0否 默认为0</p>
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动选择代金券 1是 0否 默认为0</p>
     * @param AutoVoucher <p>是否自动选择代金券 1是 0否 默认为0</p>
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>数据库类型，取值范围: </p><li> MYSQL </li> 
     * @return DbType <p>数据库类型，取值范围: </p><li> MYSQL </li>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>数据库类型，取值范围: </p><li> MYSQL </li>
     * @param DbType <p>数据库类型，取值范围: </p><li> MYSQL </li>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get <p>订单来源，字符串长度范围为[0,64)</p> 
     * @return OrderSource <p>订单来源，字符串长度范围为[0,64)</p>
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set <p>订单来源，字符串长度范围为[0,64)</p>
     * @param OrderSource <p>订单来源，字符串长度范围为[0,64)</p>
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
    }

    /**
     * Get <p>交易模式 0-下单并支付 1-下单</p> 
     * @return DealMode <p>交易模式 0-下单并支付 1-下单</p>
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set <p>交易模式 0-下单并支付 1-下单</p>
     * @param DealMode <p>交易模式 0-下单并支付 1-下单</p>
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get <p>参数模板ID</p> 
     * @return ParamTemplateId <p>参数模板ID</p>
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set <p>参数模板ID</p>
     * @param ParamTemplateId <p>参数模板ID</p>
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get <p>参数列表，ParamTemplateId 传入时InstanceParams才有效</p> 
     * @return InstanceParams <p>参数列表，ParamTemplateId 传入时InstanceParams才有效</p>
     */
    public ModifyParamItem [] getInstanceParams() {
        return this.InstanceParams;
    }

    /**
     * Set <p>参数列表，ParamTemplateId 传入时InstanceParams才有效</p>
     * @param InstanceParams <p>参数列表，ParamTemplateId 传入时InstanceParams才有效</p>
     */
    public void setInstanceParams(ModifyParamItem [] InstanceParams) {
        this.InstanceParams = InstanceParams;
    }

    /**
     * Get <p>安全组ID，新建只读实例时可以指定安全组。</p> 
     * @return SecurityGroupIds <p>安全组ID，新建只读实例时可以指定安全组。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>安全组ID，新建只读实例时可以指定安全组。</p>
     * @param SecurityGroupIds <p>安全组ID，新建只读实例时可以指定安全组。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>proxy同步升级</p> 
     * @return UpgradeProxy <p>proxy同步升级</p>
     */
    public UpgradeProxy getUpgradeProxy() {
        return this.UpgradeProxy;
    }

    /**
     * Set <p>proxy同步升级</p>
     * @param UpgradeProxy <p>proxy同步升级</p>
     */
    public void setUpgradeProxy(UpgradeProxy UpgradeProxy) {
        this.UpgradeProxy = UpgradeProxy;
    }

    public AddInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddInstancesRequest(AddInstancesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.ReadOnlyCount != null) {
            this.ReadOnlyCount = new Long(source.ReadOnlyCount);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.InstanceGrpId != null) {
            this.InstanceGrpId = new String(source.InstanceGrpId);
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
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.OrderSource != null) {
            this.OrderSource = new String(source.OrderSource);
        }
        if (source.DealMode != null) {
            this.DealMode = new Long(source.DealMode);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new Long(source.ParamTemplateId);
        }
        if (source.InstanceParams != null) {
            this.InstanceParams = new ModifyParamItem[source.InstanceParams.length];
            for (int i = 0; i < source.InstanceParams.length; i++) {
                this.InstanceParams[i] = new ModifyParamItem(source.InstanceParams[i]);
            }
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.UpgradeProxy != null) {
            this.UpgradeProxy = new UpgradeProxy(source.UpgradeProxy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "ReadOnlyCount", this.ReadOnlyCount);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "InstanceGrpId", this.InstanceGrpId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "OrderSource", this.OrderSource);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamArrayObj(map, prefix + "InstanceParams.", this.InstanceParams);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "UpgradeProxy.", this.UpgradeProxy);

    }
}

