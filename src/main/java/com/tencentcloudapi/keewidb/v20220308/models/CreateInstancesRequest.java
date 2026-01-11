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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancesRequest extends AbstractModel {

    /**
    * <p>产品版本。14：极速版。</p>
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * <p>私有网络唯一ID。请登录控制台在私有网络列表查询，如：vpc-azlk3***。</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>私有网络所属子网唯一ID。请登录控制台在私有网络列表查询，如：subnet-8abje***。</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * <p>实例数量，单次最大购买数量以查询产品售卖规格返回的数量为准。</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>选择包年包月计费模式（BillingMode 设置为1）时，您需要选择购买实例的时长。单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。按量计费（BillingMode 设置为0）实例该参数设置为1即可。</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>分片数量，支持选择3、5、6、8、9、10、12、15、16、18、20、21、24、25、27、30、32、33、35、36、39、40、42、45、48、50、51、54、55、56、57、60、63、64分片。</p>
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * <p>副本数。当前仅支持设置1个副本节点，即每一个分片仅包含1个主节点与1个副本节点，数据主从实时热备。</p>
    */
    @SerializedName("ReplicasNum")
    @Expose
    private Long ReplicasNum;

    /**
    * <p>实例内存容量，单位：GB。KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
    */
    @SerializedName("MachineMemory")
    @Expose
    private Long MachineMemory;

    /**
    * <p>实例所属的可用区ID。<ul><li>具体取值，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>获取。</li><li>参数<b>ZoneId</b>和<b>ZoneName</b>至少配置其中一个。</li></ul></p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>实例所属的可用区名称。<ul><li>具体取值，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>获取。</li><li>参数<b>ZoneId</b>和<b>ZoneName</b>至少配置其中一个。</li></ul></p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>创建实例的名称。仅支持长度小于60的中文、英文或者数字，短划线"-"、下划线"_"。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>指明创建的实例是否需要支持免密访问。<ul><li>true：免密实例。</li><li>false：非免密实例，默认为非免密实例。此时，需要设置访问密码。</li></ul></p>
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * <p>实例访问密码。<ul><li>当参数<b>NoAuth</b>为<b>true</b>时，Password为无需设置，否则Password为必填参数。</li><li>密码复杂度要求：<ul><li>8-30个字符。</li><li>至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的2种。</li><li>不能以"/"开头。</li></ul></li></ul></p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>自定义端口。默认为6379，范围[1024,65535]。</p>
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * <p>包年包月计费的续费模式。<ul><li>0：默认状态，指手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</li></ul></p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>给实例设置安全组 ID 数组。</p>
    */
    @SerializedName("SecurityGroupIdList")
    @Expose
    private String [] SecurityGroupIdList;

    /**
    * <p>给实例绑定标签。</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>混合存储版，单分片持久化内存容量，单位：GB。KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>每个分片硬盘的容量。单位：GB。每一缓存分片容量，对应的磁盘容量范围不同。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>计算 CPU 核数，可忽略不传。CPU 核数与内存为固定搭配，具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
    */
    @SerializedName("MachineCpu")
    @Expose
    private Long MachineCpu;

    /**
    * <p>项目id，取值以用户账户&gt;用户账户相关接口查询&gt;项目列表返回的projectId为准。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>数据压缩开关。<ul><li>ON：开启，默认开启压缩。</li><li>OFF：关闭。</li></ul></p>
    */
    @SerializedName("Compression")
    @Expose
    private String Compression;

    /**
     * Get <p>产品版本。14：极速版。</p> 
     * @return TypeId <p>产品版本。14：极速版。</p>
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set <p>产品版本。14：极速版。</p>
     * @param TypeId <p>产品版本。14：极速版。</p>
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get <p>私有网络唯一ID。请登录控制台在私有网络列表查询，如：vpc-azlk3***。</p> 
     * @return UniqVpcId <p>私有网络唯一ID。请登录控制台在私有网络列表查询，如：vpc-azlk3***。</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>私有网络唯一ID。请登录控制台在私有网络列表查询，如：vpc-azlk3***。</p>
     * @param UniqVpcId <p>私有网络唯一ID。请登录控制台在私有网络列表查询，如：vpc-azlk3***。</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>私有网络所属子网唯一ID。请登录控制台在私有网络列表查询，如：subnet-8abje***。</p> 
     * @return UniqSubnetId <p>私有网络所属子网唯一ID。请登录控制台在私有网络列表查询，如：subnet-8abje***。</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>私有网络所属子网唯一ID。请登录控制台在私有网络列表查询，如：subnet-8abje***。</p>
     * @param UniqSubnetId <p>私有网络所属子网唯一ID。请登录控制台在私有网络列表查询，如：subnet-8abje***。</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p> 
     * @return BillingMode <p>计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
     * @param BillingMode <p>计费模式。<ul><li>0：按量计费。</li><li>1：包年包月。</li></ul></p>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>实例数量，单次最大购买数量以查询产品售卖规格返回的数量为准。</p> 
     * @return GoodsNum <p>实例数量，单次最大购买数量以查询产品售卖规格返回的数量为准。</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>实例数量，单次最大购买数量以查询产品售卖规格返回的数量为准。</p>
     * @param GoodsNum <p>实例数量，单次最大购买数量以查询产品售卖规格返回的数量为准。</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>选择包年包月计费模式（BillingMode 设置为1）时，您需要选择购买实例的时长。单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。按量计费（BillingMode 设置为0）实例该参数设置为1即可。</p> 
     * @return Period <p>选择包年包月计费模式（BillingMode 设置为1）时，您需要选择购买实例的时长。单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。按量计费（BillingMode 设置为0）实例该参数设置为1即可。</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>选择包年包月计费模式（BillingMode 设置为1）时，您需要选择购买实例的时长。单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。按量计费（BillingMode 设置为0）实例该参数设置为1即可。</p>
     * @param Period <p>选择包年包月计费模式（BillingMode 设置为1）时，您需要选择购买实例的时长。单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。按量计费（BillingMode 设置为0）实例该参数设置为1即可。</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>分片数量，支持选择3、5、6、8、9、10、12、15、16、18、20、21、24、25、27、30、32、33、35、36、39、40、42、45、48、50、51、54、55、56、57、60、63、64分片。</p> 
     * @return ShardNum <p>分片数量，支持选择3、5、6、8、9、10、12、15、16、18、20、21、24、25、27、30、32、33、35、36、39、40、42、45、48、50、51、54、55、56、57、60、63、64分片。</p>
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set <p>分片数量，支持选择3、5、6、8、9、10、12、15、16、18、20、21、24、25、27、30、32、33、35、36、39、40、42、45、48、50、51、54、55、56、57、60、63、64分片。</p>
     * @param ShardNum <p>分片数量，支持选择3、5、6、8、9、10、12、15、16、18、20、21、24、25、27、30、32、33、35、36、39、40、42、45、48、50、51、54、55、56、57、60、63、64分片。</p>
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get <p>副本数。当前仅支持设置1个副本节点，即每一个分片仅包含1个主节点与1个副本节点，数据主从实时热备。</p> 
     * @return ReplicasNum <p>副本数。当前仅支持设置1个副本节点，即每一个分片仅包含1个主节点与1个副本节点，数据主从实时热备。</p>
     */
    public Long getReplicasNum() {
        return this.ReplicasNum;
    }

    /**
     * Set <p>副本数。当前仅支持设置1个副本节点，即每一个分片仅包含1个主节点与1个副本节点，数据主从实时热备。</p>
     * @param ReplicasNum <p>副本数。当前仅支持设置1个副本节点，即每一个分片仅包含1个主节点与1个副本节点，数据主从实时热备。</p>
     */
    public void setReplicasNum(Long ReplicasNum) {
        this.ReplicasNum = ReplicasNum;
    }

    /**
     * Get <p>实例内存容量，单位：GB。KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p> 
     * @return MachineMemory <p>实例内存容量，单位：GB。KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
     */
    public Long getMachineMemory() {
        return this.MachineMemory;
    }

    /**
     * Set <p>实例内存容量，单位：GB。KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
     * @param MachineMemory <p>实例内存容量，单位：GB。KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
     */
    public void setMachineMemory(Long MachineMemory) {
        this.MachineMemory = MachineMemory;
    }

    /**
     * Get <p>实例所属的可用区ID。<ul><li>具体取值，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>获取。</li><li>参数<b>ZoneId</b>和<b>ZoneName</b>至少配置其中一个。</li></ul></p> 
     * @return ZoneId <p>实例所属的可用区ID。<ul><li>具体取值，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>获取。</li><li>参数<b>ZoneId</b>和<b>ZoneName</b>至少配置其中一个。</li></ul></p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>实例所属的可用区ID。<ul><li>具体取值，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>获取。</li><li>参数<b>ZoneId</b>和<b>ZoneName</b>至少配置其中一个。</li></ul></p>
     * @param ZoneId <p>实例所属的可用区ID。<ul><li>具体取值，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>获取。</li><li>参数<b>ZoneId</b>和<b>ZoneName</b>至少配置其中一个。</li></ul></p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>实例所属的可用区名称。<ul><li>具体取值，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>获取。</li><li>参数<b>ZoneId</b>和<b>ZoneName</b>至少配置其中一个。</li></ul></p> 
     * @return ZoneName <p>实例所属的可用区名称。<ul><li>具体取值，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>获取。</li><li>参数<b>ZoneId</b>和<b>ZoneName</b>至少配置其中一个。</li></ul></p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>实例所属的可用区名称。<ul><li>具体取值，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>获取。</li><li>参数<b>ZoneId</b>和<b>ZoneName</b>至少配置其中一个。</li></ul></p>
     * @param ZoneName <p>实例所属的可用区名称。<ul><li>具体取值，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>获取。</li><li>参数<b>ZoneId</b>和<b>ZoneName</b>至少配置其中一个。</li></ul></p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>创建实例的名称。仅支持长度小于60的中文、英文或者数字，短划线"-"、下划线"_"。</p> 
     * @return InstanceName <p>创建实例的名称。仅支持长度小于60的中文、英文或者数字，短划线"-"、下划线"_"。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>创建实例的名称。仅支持长度小于60的中文、英文或者数字，短划线"-"、下划线"_"。</p>
     * @param InstanceName <p>创建实例的名称。仅支持长度小于60的中文、英文或者数字，短划线"-"、下划线"_"。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>指明创建的实例是否需要支持免密访问。<ul><li>true：免密实例。</li><li>false：非免密实例，默认为非免密实例。此时，需要设置访问密码。</li></ul></p> 
     * @return NoAuth <p>指明创建的实例是否需要支持免密访问。<ul><li>true：免密实例。</li><li>false：非免密实例，默认为非免密实例。此时，需要设置访问密码。</li></ul></p>
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set <p>指明创建的实例是否需要支持免密访问。<ul><li>true：免密实例。</li><li>false：非免密实例，默认为非免密实例。此时，需要设置访问密码。</li></ul></p>
     * @param NoAuth <p>指明创建的实例是否需要支持免密访问。<ul><li>true：免密实例。</li><li>false：非免密实例，默认为非免密实例。此时，需要设置访问密码。</li></ul></p>
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get <p>实例访问密码。<ul><li>当参数<b>NoAuth</b>为<b>true</b>时，Password为无需设置，否则Password为必填参数。</li><li>密码复杂度要求：<ul><li>8-30个字符。</li><li>至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的2种。</li><li>不能以"/"开头。</li></ul></li></ul></p> 
     * @return Password <p>实例访问密码。<ul><li>当参数<b>NoAuth</b>为<b>true</b>时，Password为无需设置，否则Password为必填参数。</li><li>密码复杂度要求：<ul><li>8-30个字符。</li><li>至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的2种。</li><li>不能以"/"开头。</li></ul></li></ul></p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>实例访问密码。<ul><li>当参数<b>NoAuth</b>为<b>true</b>时，Password为无需设置，否则Password为必填参数。</li><li>密码复杂度要求：<ul><li>8-30个字符。</li><li>至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的2种。</li><li>不能以"/"开头。</li></ul></li></ul></p>
     * @param Password <p>实例访问密码。<ul><li>当参数<b>NoAuth</b>为<b>true</b>时，Password为无需设置，否则Password为必填参数。</li><li>密码复杂度要求：<ul><li>8-30个字符。</li><li>至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的2种。</li><li>不能以"/"开头。</li></ul></li></ul></p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>自定义端口。默认为6379，范围[1024,65535]。</p> 
     * @return VPort <p>自定义端口。默认为6379，范围[1024,65535]。</p>
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set <p>自定义端口。默认为6379，范围[1024,65535]。</p>
     * @param VPort <p>自定义端口。默认为6379，范围[1024,65535]。</p>
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get <p>包年包月计费的续费模式。<ul><li>0：默认状态，指手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</li></ul></p> 
     * @return AutoRenew <p>包年包月计费的续费模式。<ul><li>0：默认状态，指手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</li></ul></p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>包年包月计费的续费模式。<ul><li>0：默认状态，指手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</li></ul></p>
     * @param AutoRenew <p>包年包月计费的续费模式。<ul><li>0：默认状态，指手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</li></ul></p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>给实例设置安全组 ID 数组。</p> 
     * @return SecurityGroupIdList <p>给实例设置安全组 ID 数组。</p>
     */
    public String [] getSecurityGroupIdList() {
        return this.SecurityGroupIdList;
    }

    /**
     * Set <p>给实例设置安全组 ID 数组。</p>
     * @param SecurityGroupIdList <p>给实例设置安全组 ID 数组。</p>
     */
    public void setSecurityGroupIdList(String [] SecurityGroupIdList) {
        this.SecurityGroupIdList = SecurityGroupIdList;
    }

    /**
     * Get <p>给实例绑定标签。</p> 
     * @return ResourceTags <p>给实例绑定标签。</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>给实例绑定标签。</p>
     * @param ResourceTags <p>给实例绑定标签。</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>混合存储版，单分片持久化内存容量，单位：GB。KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p> 
     * @return MemSize <p>混合存储版，单分片持久化内存容量，单位：GB。KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>混合存储版，单分片持久化内存容量，单位：GB。KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
     * @param MemSize <p>混合存储版，单分片持久化内存容量，单位：GB。KeeWiDB 内存容量<b>MachineMemory</b>与持久内存容量<b>MemSize</b>为固定搭配，即2GB内存，固定分配8GB的持久内存，不可选择。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>每个分片硬盘的容量。单位：GB。每一缓存分片容量，对应的磁盘容量范围不同。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p> 
     * @return DiskSize <p>每个分片硬盘的容量。单位：GB。每一缓存分片容量，对应的磁盘容量范围不同。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>每个分片硬盘的容量。单位：GB。每一缓存分片容量，对应的磁盘容量范围不同。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
     * @param DiskSize <p>每个分片硬盘的容量。单位：GB。每一缓存分片容量，对应的磁盘容量范围不同。具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>计算 CPU 核数，可忽略不传。CPU 核数与内存为固定搭配，具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p> 
     * @return MachineCpu <p>计算 CPU 核数，可忽略不传。CPU 核数与内存为固定搭配，具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
     */
    public Long getMachineCpu() {
        return this.MachineCpu;
    }

    /**
     * Set <p>计算 CPU 核数，可忽略不传。CPU 核数与内存为固定搭配，具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
     * @param MachineCpu <p>计算 CPU 核数，可忽略不传。CPU 核数与内存为固定搭配，具体信息，请参见<a href="https://cloud.tencent.com/document/product/1520/80808">产品规格</a>。</p>
     */
    public void setMachineCpu(Long MachineCpu) {
        this.MachineCpu = MachineCpu;
    }

    /**
     * Get <p>项目id，取值以用户账户&gt;用户账户相关接口查询&gt;项目列表返回的projectId为准。</p> 
     * @return ProjectId <p>项目id，取值以用户账户&gt;用户账户相关接口查询&gt;项目列表返回的projectId为准。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目id，取值以用户账户&gt;用户账户相关接口查询&gt;项目列表返回的projectId为准。</p>
     * @param ProjectId <p>项目id，取值以用户账户&gt;用户账户相关接口查询&gt;项目列表返回的projectId为准。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>数据压缩开关。<ul><li>ON：开启，默认开启压缩。</li><li>OFF：关闭。</li></ul></p> 
     * @return Compression <p>数据压缩开关。<ul><li>ON：开启，默认开启压缩。</li><li>OFF：关闭。</li></ul></p>
     */
    public String getCompression() {
        return this.Compression;
    }

    /**
     * Set <p>数据压缩开关。<ul><li>ON：开启，默认开启压缩。</li><li>OFF：关闭。</li></ul></p>
     * @param Compression <p>数据压缩开关。<ul><li>ON：开启，默认开启压缩。</li><li>OFF：关闭。</li></ul></p>
     */
    public void setCompression(String Compression) {
        this.Compression = Compression;
    }

    public CreateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancesRequest(CreateInstancesRequest source) {
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
        if (source.ReplicasNum != null) {
            this.ReplicasNum = new Long(source.ReplicasNum);
        }
        if (source.MachineMemory != null) {
            this.MachineMemory = new Long(source.MachineMemory);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.NoAuth != null) {
            this.NoAuth = new Boolean(source.NoAuth);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.SecurityGroupIdList != null) {
            this.SecurityGroupIdList = new String[source.SecurityGroupIdList.length];
            for (int i = 0; i < source.SecurityGroupIdList.length; i++) {
                this.SecurityGroupIdList[i] = new String(source.SecurityGroupIdList[i]);
            }
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.MachineCpu != null) {
            this.MachineCpu = new Long(source.MachineCpu);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Compression != null) {
            this.Compression = new String(source.Compression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamSimple(map, prefix + "ReplicasNum", this.ReplicasNum);
        this.setParamSimple(map, prefix + "MachineMemory", this.MachineMemory);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamArraySimple(map, prefix + "SecurityGroupIdList.", this.SecurityGroupIdList);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "MachineCpu", this.MachineCpu);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Compression", this.Compression);

    }
}

