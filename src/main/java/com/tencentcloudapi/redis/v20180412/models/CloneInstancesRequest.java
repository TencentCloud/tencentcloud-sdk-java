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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneInstancesRequest extends AbstractModel {

    /**
    * <p>指定待克隆的源实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>单次克隆实例的数量。</p><ul><li>包年包月每次购买最大数量为100。</li><li>按量计费每次购买最大数量为30。</li></ul>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>克隆实例所属的可用区ID。当前所支持的可用区 ID，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a> 。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>付费方式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * <p>购买实例时长。<ul><li>单位：月。</li><li>付费方式选择包年包月计费时，取值范围为[1,2,3,4,5,6,7,8,9,10,11,12,24,36,48,60]。</li><li>付费方式选择按量计费时，设置为1。</li></ul></p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>安全组ID。请通过 <a href="https://cloud.tencent.com/document/product/239/34447">DescribeInstanceSecurityGroup</a> 接口获取实例的安全组 ID。</p>
    */
    @SerializedName("SecurityGroupIdList")
    @Expose
    private String [] SecurityGroupIdList;

    /**
    * <p>克隆实例使用的备份ID。请通过接口<a href="https://cloud.tencent.com/document/product/239/20011">DescribeInstanceBackups</a>获取备份ID。</p>
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * <p>配置克隆实例是否支持免密访问。开启 SSL 与外网均不支持免密访问。<ul><li>true：免密实例，</li><li>false：非免密实例。默认为非免密实例。</li></ul></p>
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * <p>配置克隆实例的私有网络ID。如果未配置该参数，默认选择基础网络。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>配置克隆实例所属私有网络的子网。基础网络时该参数无需配置。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>克隆实例的名称。<br>仅支持长度小于60的中文、英文或者数字，短划线&quot;-&quot;、下划线&quot;_&quot;。<br></p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>克隆实例的访问密码。<ul><li>当输入参数<b>NoAuth</b>为<b>true</b>时，可不设置该参数。</li><li>当实例为Redis2.8、4.0和5.0时，其密码格式为：8-30个字符，至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的2种，不能以&quot;/&quot;开头；</li><li>当实例为CKV 3.2时，其密码格式为：8-30个字符，必须包含字母和数字，且不包含其他字符。</li></ul></p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>自动续费标识。<ul><li>0：默认状态，手动续费。</li><li>1：自动续费。</li><li>2：不自动续费，到期自动隔离。</li></ul></p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>用户自定义的端口，默认为6379，取值范围[1024,65535]。</p>
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * <p>实例的节点信息。<ul><li>目前支持配置节点的类型（主节点或者副本节点），及其节点的可用区信息。具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/20022#RedisNodeInfo">RedisNodeInfo</a>。</li><li>单可用区部署可不配置该参数。</li></ul></p>
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

    /**
    * <p>项目 ID。登录<a href="https://console.cloud.tencent.com/redis#/">Redis 控制台</a>，可在右上角的<b>账号中心</b> &gt; <b>项目管理</b>中查找项目ID。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>克隆实例需绑定的标签。</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>指定克隆实例相关的参数模板 ID。</p><ul><li>若不配置该参数，则系统会依据所选择的兼容版本及架构，自动适配对应的默认模板。</li><li>请通过<a href="https://cloud.tencent.com/document/product/239/58750">DescribeParamTemplates</a>接口，查询实例的参数模板列表，获取模板 ID 编号。</li></ul>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>指定克隆实例的告警策略 ID。请登录<a href="https://console.cloud.tencent.com/monitor/alarm2/policy">腾讯云可观测平台控制台</a>，在 <b>告警管理</b> &gt; <b>策略管理</b>页面获取策略 ID 信息。</p>
    */
    @SerializedName("AlarmPolicyList")
    @Expose
    private String [] AlarmPolicyList;

    /**
    * <p>克隆指定恢复数据的时间。<br>仅支持已开通秒级备份的实例</p>
    */
    @SerializedName("CloneTime")
    @Expose
    private String CloneTime;

    /**
    * <p>是否加密密码</p>
    */
    @SerializedName("EncryptPassword")
    @Expose
    private Boolean EncryptPassword;

    /**
    * <p>实例密码复杂度策略</p><p>入参限制：未传或 Enabled=false 视为不启用，按默认规则校验</p>
    */
    @SerializedName("PasswordPolicy")
    @Expose
    private PasswordPolicy PasswordPolicy;

    /**
    * <p>是否开启 SSL 加密传输。</p><p>枚举值：</p><ul><li>true： 开启。</li><li>false： 关闭（默认值）。</li></ul><p>默认值：false</p>
    */
    @SerializedName("EnableSSL")
    @Expose
    private Boolean EnableSSL;

    /**
    * <p>开启 SSL 时，是否将实例的内网 IPv4 地址写入证书的域名别名（SAN）中。仅在 EnableSSL 为 true 时生效。</p><p>枚举值：</p><ul><li>true： 允许使用内网 IP 进行 SSL 证书校验。</li><li>false： 不添加证书的 SAN 扩展信息。</li></ul><p>默认值：false</p>
    */
    @SerializedName("SSLBindPrivateIPv4")
    @Expose
    private Boolean SSLBindPrivateIPv4;

    /**
     * Get <p>指定待克隆的源实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>指定待克隆的源实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定待克隆的源实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>指定待克隆的源实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>单次克隆实例的数量。</p><ul><li>包年包月每次购买最大数量为100。</li><li>按量计费每次购买最大数量为30。</li></ul> 
     * @return GoodsNum <p>单次克隆实例的数量。</p><ul><li>包年包月每次购买最大数量为100。</li><li>按量计费每次购买最大数量为30。</li></ul>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>单次克隆实例的数量。</p><ul><li>包年包月每次购买最大数量为100。</li><li>按量计费每次购买最大数量为30。</li></ul>
     * @param GoodsNum <p>单次克隆实例的数量。</p><ul><li>包年包月每次购买最大数量为100。</li><li>按量计费每次购买最大数量为30。</li></ul>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>克隆实例所属的可用区ID。当前所支持的可用区 ID，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a> 。</p> 
     * @return ZoneId <p>克隆实例所属的可用区ID。当前所支持的可用区 ID，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a> 。</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>克隆实例所属的可用区ID。当前所支持的可用区 ID，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a> 。</p>
     * @param ZoneId <p>克隆实例所属的可用区ID。当前所支持的可用区 ID，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a> 。</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>付费方式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p> 
     * @return BillingMode <p>付费方式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>付费方式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
     * @param BillingMode <p>付费方式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>购买实例时长。<ul><li>单位：月。</li><li>付费方式选择包年包月计费时，取值范围为[1,2,3,4,5,6,7,8,9,10,11,12,24,36,48,60]。</li><li>付费方式选择按量计费时，设置为1。</li></ul></p> 
     * @return Period <p>购买实例时长。<ul><li>单位：月。</li><li>付费方式选择包年包月计费时，取值范围为[1,2,3,4,5,6,7,8,9,10,11,12,24,36,48,60]。</li><li>付费方式选择按量计费时，设置为1。</li></ul></p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>购买实例时长。<ul><li>单位：月。</li><li>付费方式选择包年包月计费时，取值范围为[1,2,3,4,5,6,7,8,9,10,11,12,24,36,48,60]。</li><li>付费方式选择按量计费时，设置为1。</li></ul></p>
     * @param Period <p>购买实例时长。<ul><li>单位：月。</li><li>付费方式选择包年包月计费时，取值范围为[1,2,3,4,5,6,7,8,9,10,11,12,24,36,48,60]。</li><li>付费方式选择按量计费时，设置为1。</li></ul></p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>安全组ID。请通过 <a href="https://cloud.tencent.com/document/product/239/34447">DescribeInstanceSecurityGroup</a> 接口获取实例的安全组 ID。</p> 
     * @return SecurityGroupIdList <p>安全组ID。请通过 <a href="https://cloud.tencent.com/document/product/239/34447">DescribeInstanceSecurityGroup</a> 接口获取实例的安全组 ID。</p>
     */
    public String [] getSecurityGroupIdList() {
        return this.SecurityGroupIdList;
    }

    /**
     * Set <p>安全组ID。请通过 <a href="https://cloud.tencent.com/document/product/239/34447">DescribeInstanceSecurityGroup</a> 接口获取实例的安全组 ID。</p>
     * @param SecurityGroupIdList <p>安全组ID。请通过 <a href="https://cloud.tencent.com/document/product/239/34447">DescribeInstanceSecurityGroup</a> 接口获取实例的安全组 ID。</p>
     */
    public void setSecurityGroupIdList(String [] SecurityGroupIdList) {
        this.SecurityGroupIdList = SecurityGroupIdList;
    }

    /**
     * Get <p>克隆实例使用的备份ID。请通过接口<a href="https://cloud.tencent.com/document/product/239/20011">DescribeInstanceBackups</a>获取备份ID。</p> 
     * @return BackupId <p>克隆实例使用的备份ID。请通过接口<a href="https://cloud.tencent.com/document/product/239/20011">DescribeInstanceBackups</a>获取备份ID。</p>
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>克隆实例使用的备份ID。请通过接口<a href="https://cloud.tencent.com/document/product/239/20011">DescribeInstanceBackups</a>获取备份ID。</p>
     * @param BackupId <p>克隆实例使用的备份ID。请通过接口<a href="https://cloud.tencent.com/document/product/239/20011">DescribeInstanceBackups</a>获取备份ID。</p>
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get <p>配置克隆实例是否支持免密访问。开启 SSL 与外网均不支持免密访问。<ul><li>true：免密实例，</li><li>false：非免密实例。默认为非免密实例。</li></ul></p> 
     * @return NoAuth <p>配置克隆实例是否支持免密访问。开启 SSL 与外网均不支持免密访问。<ul><li>true：免密实例，</li><li>false：非免密实例。默认为非免密实例。</li></ul></p>
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set <p>配置克隆实例是否支持免密访问。开启 SSL 与外网均不支持免密访问。<ul><li>true：免密实例，</li><li>false：非免密实例。默认为非免密实例。</li></ul></p>
     * @param NoAuth <p>配置克隆实例是否支持免密访问。开启 SSL 与外网均不支持免密访问。<ul><li>true：免密实例，</li><li>false：非免密实例。默认为非免密实例。</li></ul></p>
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get <p>配置克隆实例的私有网络ID。如果未配置该参数，默认选择基础网络。</p> 
     * @return VpcId <p>配置克隆实例的私有网络ID。如果未配置该参数，默认选择基础网络。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>配置克隆实例的私有网络ID。如果未配置该参数，默认选择基础网络。</p>
     * @param VpcId <p>配置克隆实例的私有网络ID。如果未配置该参数，默认选择基础网络。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>配置克隆实例所属私有网络的子网。基础网络时该参数无需配置。</p> 
     * @return SubnetId <p>配置克隆实例所属私有网络的子网。基础网络时该参数无需配置。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>配置克隆实例所属私有网络的子网。基础网络时该参数无需配置。</p>
     * @param SubnetId <p>配置克隆实例所属私有网络的子网。基础网络时该参数无需配置。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>克隆实例的名称。<br>仅支持长度小于60的中文、英文或者数字，短划线&quot;-&quot;、下划线&quot;_&quot;。<br></p> 
     * @return InstanceName <p>克隆实例的名称。<br>仅支持长度小于60的中文、英文或者数字，短划线&quot;-&quot;、下划线&quot;_&quot;。<br></p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>克隆实例的名称。<br>仅支持长度小于60的中文、英文或者数字，短划线&quot;-&quot;、下划线&quot;_&quot;。<br></p>
     * @param InstanceName <p>克隆实例的名称。<br>仅支持长度小于60的中文、英文或者数字，短划线&quot;-&quot;、下划线&quot;_&quot;。<br></p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>克隆实例的访问密码。<ul><li>当输入参数<b>NoAuth</b>为<b>true</b>时，可不设置该参数。</li><li>当实例为Redis2.8、4.0和5.0时，其密码格式为：8-30个字符，至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的2种，不能以&quot;/&quot;开头；</li><li>当实例为CKV 3.2时，其密码格式为：8-30个字符，必须包含字母和数字，且不包含其他字符。</li></ul></p> 
     * @return Password <p>克隆实例的访问密码。<ul><li>当输入参数<b>NoAuth</b>为<b>true</b>时，可不设置该参数。</li><li>当实例为Redis2.8、4.0和5.0时，其密码格式为：8-30个字符，至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的2种，不能以&quot;/&quot;开头；</li><li>当实例为CKV 3.2时，其密码格式为：8-30个字符，必须包含字母和数字，且不包含其他字符。</li></ul></p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>克隆实例的访问密码。<ul><li>当输入参数<b>NoAuth</b>为<b>true</b>时，可不设置该参数。</li><li>当实例为Redis2.8、4.0和5.0时，其密码格式为：8-30个字符，至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的2种，不能以&quot;/&quot;开头；</li><li>当实例为CKV 3.2时，其密码格式为：8-30个字符，必须包含字母和数字，且不包含其他字符。</li></ul></p>
     * @param Password <p>克隆实例的访问密码。<ul><li>当输入参数<b>NoAuth</b>为<b>true</b>时，可不设置该参数。</li><li>当实例为Redis2.8、4.0和5.0时，其密码格式为：8-30个字符，至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的2种，不能以&quot;/&quot;开头；</li><li>当实例为CKV 3.2时，其密码格式为：8-30个字符，必须包含字母和数字，且不包含其他字符。</li></ul></p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>自动续费标识。<ul><li>0：默认状态，手动续费。</li><li>1：自动续费。</li><li>2：不自动续费，到期自动隔离。</li></ul></p> 
     * @return AutoRenew <p>自动续费标识。<ul><li>0：默认状态，手动续费。</li><li>1：自动续费。</li><li>2：不自动续费，到期自动隔离。</li></ul></p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>自动续费标识。<ul><li>0：默认状态，手动续费。</li><li>1：自动续费。</li><li>2：不自动续费，到期自动隔离。</li></ul></p>
     * @param AutoRenew <p>自动续费标识。<ul><li>0：默认状态，手动续费。</li><li>1：自动续费。</li><li>2：不自动续费，到期自动隔离。</li></ul></p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>用户自定义的端口，默认为6379，取值范围[1024,65535]。</p> 
     * @return VPort <p>用户自定义的端口，默认为6379，取值范围[1024,65535]。</p>
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set <p>用户自定义的端口，默认为6379，取值范围[1024,65535]。</p>
     * @param VPort <p>用户自定义的端口，默认为6379，取值范围[1024,65535]。</p>
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get <p>实例的节点信息。<ul><li>目前支持配置节点的类型（主节点或者副本节点），及其节点的可用区信息。具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/20022#RedisNodeInfo">RedisNodeInfo</a>。</li><li>单可用区部署可不配置该参数。</li></ul></p> 
     * @return NodeSet <p>实例的节点信息。<ul><li>目前支持配置节点的类型（主节点或者副本节点），及其节点的可用区信息。具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/20022#RedisNodeInfo">RedisNodeInfo</a>。</li><li>单可用区部署可不配置该参数。</li></ul></p>
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set <p>实例的节点信息。<ul><li>目前支持配置节点的类型（主节点或者副本节点），及其节点的可用区信息。具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/20022#RedisNodeInfo">RedisNodeInfo</a>。</li><li>单可用区部署可不配置该参数。</li></ul></p>
     * @param NodeSet <p>实例的节点信息。<ul><li>目前支持配置节点的类型（主节点或者副本节点），及其节点的可用区信息。具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/20022#RedisNodeInfo">RedisNodeInfo</a>。</li><li>单可用区部署可不配置该参数。</li></ul></p>
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Get <p>项目 ID。登录<a href="https://console.cloud.tencent.com/redis#/">Redis 控制台</a>，可在右上角的<b>账号中心</b> &gt; <b>项目管理</b>中查找项目ID。</p> 
     * @return ProjectId <p>项目 ID。登录<a href="https://console.cloud.tencent.com/redis#/">Redis 控制台</a>，可在右上角的<b>账号中心</b> &gt; <b>项目管理</b>中查找项目ID。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID。登录<a href="https://console.cloud.tencent.com/redis#/">Redis 控制台</a>，可在右上角的<b>账号中心</b> &gt; <b>项目管理</b>中查找项目ID。</p>
     * @param ProjectId <p>项目 ID。登录<a href="https://console.cloud.tencent.com/redis#/">Redis 控制台</a>，可在右上角的<b>账号中心</b> &gt; <b>项目管理</b>中查找项目ID。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>克隆实例需绑定的标签。</p> 
     * @return ResourceTags <p>克隆实例需绑定的标签。</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>克隆实例需绑定的标签。</p>
     * @param ResourceTags <p>克隆实例需绑定的标签。</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>指定克隆实例相关的参数模板 ID。</p><ul><li>若不配置该参数，则系统会依据所选择的兼容版本及架构，自动适配对应的默认模板。</li><li>请通过<a href="https://cloud.tencent.com/document/product/239/58750">DescribeParamTemplates</a>接口，查询实例的参数模板列表，获取模板 ID 编号。</li></ul> 
     * @return TemplateId <p>指定克隆实例相关的参数模板 ID。</p><ul><li>若不配置该参数，则系统会依据所选择的兼容版本及架构，自动适配对应的默认模板。</li><li>请通过<a href="https://cloud.tencent.com/document/product/239/58750">DescribeParamTemplates</a>接口，查询实例的参数模板列表，获取模板 ID 编号。</li></ul>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>指定克隆实例相关的参数模板 ID。</p><ul><li>若不配置该参数，则系统会依据所选择的兼容版本及架构，自动适配对应的默认模板。</li><li>请通过<a href="https://cloud.tencent.com/document/product/239/58750">DescribeParamTemplates</a>接口，查询实例的参数模板列表，获取模板 ID 编号。</li></ul>
     * @param TemplateId <p>指定克隆实例相关的参数模板 ID。</p><ul><li>若不配置该参数，则系统会依据所选择的兼容版本及架构，自动适配对应的默认模板。</li><li>请通过<a href="https://cloud.tencent.com/document/product/239/58750">DescribeParamTemplates</a>接口，查询实例的参数模板列表，获取模板 ID 编号。</li></ul>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>指定克隆实例的告警策略 ID。请登录<a href="https://console.cloud.tencent.com/monitor/alarm2/policy">腾讯云可观测平台控制台</a>，在 <b>告警管理</b> &gt; <b>策略管理</b>页面获取策略 ID 信息。</p> 
     * @return AlarmPolicyList <p>指定克隆实例的告警策略 ID。请登录<a href="https://console.cloud.tencent.com/monitor/alarm2/policy">腾讯云可观测平台控制台</a>，在 <b>告警管理</b> &gt; <b>策略管理</b>页面获取策略 ID 信息。</p>
     */
    public String [] getAlarmPolicyList() {
        return this.AlarmPolicyList;
    }

    /**
     * Set <p>指定克隆实例的告警策略 ID。请登录<a href="https://console.cloud.tencent.com/monitor/alarm2/policy">腾讯云可观测平台控制台</a>，在 <b>告警管理</b> &gt; <b>策略管理</b>页面获取策略 ID 信息。</p>
     * @param AlarmPolicyList <p>指定克隆实例的告警策略 ID。请登录<a href="https://console.cloud.tencent.com/monitor/alarm2/policy">腾讯云可观测平台控制台</a>，在 <b>告警管理</b> &gt; <b>策略管理</b>页面获取策略 ID 信息。</p>
     */
    public void setAlarmPolicyList(String [] AlarmPolicyList) {
        this.AlarmPolicyList = AlarmPolicyList;
    }

    /**
     * Get <p>克隆指定恢复数据的时间。<br>仅支持已开通秒级备份的实例</p> 
     * @return CloneTime <p>克隆指定恢复数据的时间。<br>仅支持已开通秒级备份的实例</p>
     */
    public String getCloneTime() {
        return this.CloneTime;
    }

    /**
     * Set <p>克隆指定恢复数据的时间。<br>仅支持已开通秒级备份的实例</p>
     * @param CloneTime <p>克隆指定恢复数据的时间。<br>仅支持已开通秒级备份的实例</p>
     */
    public void setCloneTime(String CloneTime) {
        this.CloneTime = CloneTime;
    }

    /**
     * Get <p>是否加密密码</p> 
     * @return EncryptPassword <p>是否加密密码</p>
     */
    public Boolean getEncryptPassword() {
        return this.EncryptPassword;
    }

    /**
     * Set <p>是否加密密码</p>
     * @param EncryptPassword <p>是否加密密码</p>
     */
    public void setEncryptPassword(Boolean EncryptPassword) {
        this.EncryptPassword = EncryptPassword;
    }

    /**
     * Get <p>实例密码复杂度策略</p><p>入参限制：未传或 Enabled=false 视为不启用，按默认规则校验</p> 
     * @return PasswordPolicy <p>实例密码复杂度策略</p><p>入参限制：未传或 Enabled=false 视为不启用，按默认规则校验</p>
     */
    public PasswordPolicy getPasswordPolicy() {
        return this.PasswordPolicy;
    }

    /**
     * Set <p>实例密码复杂度策略</p><p>入参限制：未传或 Enabled=false 视为不启用，按默认规则校验</p>
     * @param PasswordPolicy <p>实例密码复杂度策略</p><p>入参限制：未传或 Enabled=false 视为不启用，按默认规则校验</p>
     */
    public void setPasswordPolicy(PasswordPolicy PasswordPolicy) {
        this.PasswordPolicy = PasswordPolicy;
    }

    /**
     * Get <p>是否开启 SSL 加密传输。</p><p>枚举值：</p><ul><li>true： 开启。</li><li>false： 关闭（默认值）。</li></ul><p>默认值：false</p> 
     * @return EnableSSL <p>是否开启 SSL 加密传输。</p><p>枚举值：</p><ul><li>true： 开启。</li><li>false： 关闭（默认值）。</li></ul><p>默认值：false</p>
     */
    public Boolean getEnableSSL() {
        return this.EnableSSL;
    }

    /**
     * Set <p>是否开启 SSL 加密传输。</p><p>枚举值：</p><ul><li>true： 开启。</li><li>false： 关闭（默认值）。</li></ul><p>默认值：false</p>
     * @param EnableSSL <p>是否开启 SSL 加密传输。</p><p>枚举值：</p><ul><li>true： 开启。</li><li>false： 关闭（默认值）。</li></ul><p>默认值：false</p>
     */
    public void setEnableSSL(Boolean EnableSSL) {
        this.EnableSSL = EnableSSL;
    }

    /**
     * Get <p>开启 SSL 时，是否将实例的内网 IPv4 地址写入证书的域名别名（SAN）中。仅在 EnableSSL 为 true 时生效。</p><p>枚举值：</p><ul><li>true： 允许使用内网 IP 进行 SSL 证书校验。</li><li>false： 不添加证书的 SAN 扩展信息。</li></ul><p>默认值：false</p> 
     * @return SSLBindPrivateIPv4 <p>开启 SSL 时，是否将实例的内网 IPv4 地址写入证书的域名别名（SAN）中。仅在 EnableSSL 为 true 时生效。</p><p>枚举值：</p><ul><li>true： 允许使用内网 IP 进行 SSL 证书校验。</li><li>false： 不添加证书的 SAN 扩展信息。</li></ul><p>默认值：false</p>
     */
    public Boolean getSSLBindPrivateIPv4() {
        return this.SSLBindPrivateIPv4;
    }

    /**
     * Set <p>开启 SSL 时，是否将实例的内网 IPv4 地址写入证书的域名别名（SAN）中。仅在 EnableSSL 为 true 时生效。</p><p>枚举值：</p><ul><li>true： 允许使用内网 IP 进行 SSL 证书校验。</li><li>false： 不添加证书的 SAN 扩展信息。</li></ul><p>默认值：false</p>
     * @param SSLBindPrivateIPv4 <p>开启 SSL 时，是否将实例的内网 IPv4 地址写入证书的域名别名（SAN）中。仅在 EnableSSL 为 true 时生效。</p><p>枚举值：</p><ul><li>true： 允许使用内网 IP 进行 SSL 证书校验。</li><li>false： 不添加证书的 SAN 扩展信息。</li></ul><p>默认值：false</p>
     */
    public void setSSLBindPrivateIPv4(Boolean SSLBindPrivateIPv4) {
        this.SSLBindPrivateIPv4 = SSLBindPrivateIPv4;
    }

    public CloneInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneInstancesRequest(CloneInstancesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.SecurityGroupIdList != null) {
            this.SecurityGroupIdList = new String[source.SecurityGroupIdList.length];
            for (int i = 0; i < source.SecurityGroupIdList.length; i++) {
                this.SecurityGroupIdList[i] = new String(source.SecurityGroupIdList[i]);
            }
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.NoAuth != null) {
            this.NoAuth = new Boolean(source.NoAuth);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.NodeSet != null) {
            this.NodeSet = new RedisNodeInfo[source.NodeSet.length];
            for (int i = 0; i < source.NodeSet.length; i++) {
                this.NodeSet[i] = new RedisNodeInfo(source.NodeSet[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.AlarmPolicyList != null) {
            this.AlarmPolicyList = new String[source.AlarmPolicyList.length];
            for (int i = 0; i < source.AlarmPolicyList.length; i++) {
                this.AlarmPolicyList[i] = new String(source.AlarmPolicyList[i]);
            }
        }
        if (source.CloneTime != null) {
            this.CloneTime = new String(source.CloneTime);
        }
        if (source.EncryptPassword != null) {
            this.EncryptPassword = new Boolean(source.EncryptPassword);
        }
        if (source.PasswordPolicy != null) {
            this.PasswordPolicy = new PasswordPolicy(source.PasswordPolicy);
        }
        if (source.EnableSSL != null) {
            this.EnableSSL = new Boolean(source.EnableSSL);
        }
        if (source.SSLBindPrivateIPv4 != null) {
            this.SSLBindPrivateIPv4 = new Boolean(source.SSLBindPrivateIPv4);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "SecurityGroupIdList.", this.SecurityGroupIdList);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamArrayObj(map, prefix + "NodeSet.", this.NodeSet);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArraySimple(map, prefix + "AlarmPolicyList.", this.AlarmPolicyList);
        this.setParamSimple(map, prefix + "CloneTime", this.CloneTime);
        this.setParamSimple(map, prefix + "EncryptPassword", this.EncryptPassword);
        this.setParamObj(map, prefix + "PasswordPolicy.", this.PasswordPolicy);
        this.setParamSimple(map, prefix + "EnableSSL", this.EnableSSL);
        this.setParamSimple(map, prefix + "SSLBindPrivateIPv4", this.SSLBindPrivateIPv4);

    }
}

