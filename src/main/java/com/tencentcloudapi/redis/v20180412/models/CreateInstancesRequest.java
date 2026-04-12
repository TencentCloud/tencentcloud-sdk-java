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

public class CreateInstancesRequest extends AbstractModel {

    /**
    * <p>实例类型。</p><ul><li>2：Redis 2.8 内存版（标准架构）。</li><li>3：CKV 3.2 内存版（标准架构）。</li><li>4：CKV 3.2 内存版（集群架构）。</li><li>6：Redis 4.0 内存版（标准架构）。</li><li>7：Redis 4.0 内存版（集群架构）。</li><li>8：Redis 5.0 内存版（标准架构）。</li><li>9：Redis 5.0 内存版（集群架构）。</li><li>15：Redis 6.2 内存版（标准架构）。</li><li>16：Redis 6.2 内存版（集群架构）。</li><li>17：Redis 7.0 内存版（标准架构）。</li><li>18：Redis 7.0 内存版（集群架构）。</li><li>19：Valkey 8.0 内存版（标准架构）。</li><li>20：Valkey 8.0 内存版（集群架构）。</li><li>200：Memcached 1.6 内存版（集群架构）。<br><strong>说明</strong>：CKV 版本当前有存量用户使用，暂时保留。</li></ul>
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * <p>内存容量，单位为MB， 数值需为1024的整数倍。具体规格，请通过 <a href="https://cloud.tencent.com/document/api/239/30600">DescribeProductInfo</a> 接口查询全地域的售卖规格。</p><ul><li><strong>TypeId</strong>为标准架构时，<strong>MemSize</strong>是实例总内存容量；</li><li><strong>TypeId</strong>为集群架构时，<strong>MemSize</strong>是单分片内存容量。</li></ul>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>实例数量，单次购买实例数量。具体信息，请通过 <a href="https://cloud.tencent.com/document/api/239/30600">DescribeProductInfo</a> 接口查询全地域的售卖规格。</p>
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * <p>购买实例的时长。</p><ul><li>若 <strong>BillingMode</strong>为<strong>1</strong>，即计费方式为包年包月时，需设置该参数，指定所购买实例的时长。单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</li><li>若 <strong>BillingMode</strong>为<strong>0</strong>，即计费方式为按量计费时，该参数配置为1。</li></ul>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>计费方式。</p><ul><li>0：按量计费。</li><li>1：包年包月。</li></ul>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * <p>实例所属的可用区ID，可参考<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>访问实例的密码。</p><ul><li>当输入参数<strong>NoAuth</strong>为<strong>true</strong>时，指设置实例为免密码访问，Password可不用配置，否则Password为必填参数。</li><li>当实例类型<strong>TypeId</strong>为Redis 2.8 内存版标准架构、Redis 4.0、5.0、6.2、7.0内存版标准架构或集群架构时，其密码复杂度要求为：8-64个字符，至少包含小写字母、大写字母、数字和字符()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的2种，不能以&quot;/&quot;开头。</li><li>当实例类型<strong>TypeId</strong>为CKV 3.2 内存版标准架构或集群架构时，其密码复杂度为：8-30个字符，必须包含字母和数字，且不包含其他字符。</li></ul>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>私有网络ID。如果不配置该参数则默认选择基础网络。请登录 <a href="https://console.cloud.tencent.com/vpc">私有网络</a>控制台查询具体的ID。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络VPC的子网。基础网络下， 该参数无需配置。请登录 <a href="https://console.cloud.tencent.com/vpc">私有网络</a>控制台查询子网列表获取具体的 ID。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>项目 ID。请登录<a href="https://console.cloud.tencent.com/redis#/">Redis控制台</a>，在右上角的账户信息菜单中，选择<strong>项目管理</strong>查询项目 ID。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>自动续费标识。</p><ul><li>0：默认状态（手动续费）。</li><li>1：自动续费。</li><li>2：到期不续费。</li></ul>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>安全组 ID 数组。</p><ul><li>安全组是一种虚拟防火墙，对云数据库实例的网络访问进行控制。创建实例时，建议绑定相应的安全组。</li><li>请通过 <a href="https://cloud.tencent.com/document/product/239/34447">DescribeInstanceSecurityGroup</a> 接口获取实例的安全组 ID。</li></ul>
    */
    @SerializedName("SecurityGroupIdList")
    @Expose
    private String [] SecurityGroupIdList;

    /**
    * <p>用户自定义的网络端口。默认为6379，范围为 [1024,65535]。</p>
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * <p>实例分片数量。</p><ul><li>标准版实例无需配置该参数。</li><li>集群版实例，分片数量范围为：[1、3、5、8、12、16、24、32、40、48、64、80、96、128]。</li></ul>
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * <p>实例副本数量。</p><ul><li>Redis 内存版 4.0、5.0、6.2、7.0 标准架构和集群架构支持副本数量范围为[1,5]。</li><li>Redis 2.8标准版、CKV标准版只支持1副本。</li></ul>
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * <p>标识实例是否需支持副本只读。</p><ul><li>Redis 2.8 标准版、CKV标准版不支持副本只读。</li><li>开启副本只读，实例将自动读写分离，写请求路由到主节点，读请求路由到副本节点。</li><li>如需开启副本只读，建议副本数量大于等于2。</li></ul>
    */
    @SerializedName("ReplicasReadonly")
    @Expose
    private Boolean ReplicasReadonly;

    /**
    * <p>实例名称。命名要求：仅支持长度小于60的中文、英文或者数字，短划线&quot;-&quot;、下划线&quot;_&quot;。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>配置实例是否支持免密码访问。</p><ul><li>true：免密访问实例。</li><li>false：非免密访问实例。默认为非免密方式，仅VPC网络的实例支持免密码访问。</li></ul>
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * <p>实例的节点信息，包含节点 ID、节点类型、节点可用区 ID等。具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/20022">RedisNodeInfo </a>。<br>目前支持传入节点的类型（主节点或者副本节点），节点的可用区。未指定该参数时，在支持多可用区部署的地域，系统将默认创建多可用区架构实例。</p>
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

    /**
    * <p>给实例设定标签。</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>指定实例所属的可用区名称。具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>指定实例相关的参数模板 ID。</p><ul><li>若不配置该参数，则系统会依据所选择的兼容版本及架构，自动适配对应的默认模板。</li><li>请通过<a href="https://cloud.tencent.com/document/product/239/58750">DescribeParamTemplates</a>接口，查询实例的参数模板列表，获取模板 ID 编号。</li></ul>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>内部参数，标识创建实例是否需要检查。</p><ul><li>false ：默认值。发送正常请求，通过检查后直接创建实例。</li><li>true：发送检查请求，不会创建实例。</li></ul>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>指实例部署模式。</p><ul><li>local：传统架构，默认为 local。</li><li>cdc：独享集群。</li><li>cloud：云原生，当前已暂停售卖。</li></ul>
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * <p>独享集群 ID。</p><ul><li>当 <strong>ProductVersion</strong> 设置为 <strong>cdc</strong> 时，该参数必须设置。</li><li>请通过接口<a href="https://cloud.tencent.com/document/product/239/109628"> DescribeRedisClusters</a> 获取集群 ID。</li></ul>
    */
    @SerializedName("RedisClusterId")
    @Expose
    private String RedisClusterId;

    /**
    * <p>告警策略 ID 数组。</p><ul><li>请登录<a href="https://console.cloud.tencent.com/monitor/alarm/policy">腾讯云可观测平台-告警管理-策略管理</a>获取告警策略 ID。</li><li>若不配置该参数，则绑定默认告警策略。默认告警策略具体信息，请登录<a href="https://console.cloud.tencent.com/monitor/alarm/policy">腾讯云可观测平台-告警管理-策略管理</a>查看。</li></ul>
    */
    @SerializedName("AlarmPolicyList")
    @Expose
    private String [] AlarmPolicyList;

    /**
    * <p>是否加密密码</p>
    */
    @SerializedName("EncryptPassword")
    @Expose
    private Boolean EncryptPassword;

    /**
     * Get <p>实例类型。</p><ul><li>2：Redis 2.8 内存版（标准架构）。</li><li>3：CKV 3.2 内存版（标准架构）。</li><li>4：CKV 3.2 内存版（集群架构）。</li><li>6：Redis 4.0 内存版（标准架构）。</li><li>7：Redis 4.0 内存版（集群架构）。</li><li>8：Redis 5.0 内存版（标准架构）。</li><li>9：Redis 5.0 内存版（集群架构）。</li><li>15：Redis 6.2 内存版（标准架构）。</li><li>16：Redis 6.2 内存版（集群架构）。</li><li>17：Redis 7.0 内存版（标准架构）。</li><li>18：Redis 7.0 内存版（集群架构）。</li><li>19：Valkey 8.0 内存版（标准架构）。</li><li>20：Valkey 8.0 内存版（集群架构）。</li><li>200：Memcached 1.6 内存版（集群架构）。<br><strong>说明</strong>：CKV 版本当前有存量用户使用，暂时保留。</li></ul> 
     * @return TypeId <p>实例类型。</p><ul><li>2：Redis 2.8 内存版（标准架构）。</li><li>3：CKV 3.2 内存版（标准架构）。</li><li>4：CKV 3.2 内存版（集群架构）。</li><li>6：Redis 4.0 内存版（标准架构）。</li><li>7：Redis 4.0 内存版（集群架构）。</li><li>8：Redis 5.0 内存版（标准架构）。</li><li>9：Redis 5.0 内存版（集群架构）。</li><li>15：Redis 6.2 内存版（标准架构）。</li><li>16：Redis 6.2 内存版（集群架构）。</li><li>17：Redis 7.0 内存版（标准架构）。</li><li>18：Redis 7.0 内存版（集群架构）。</li><li>19：Valkey 8.0 内存版（标准架构）。</li><li>20：Valkey 8.0 内存版（集群架构）。</li><li>200：Memcached 1.6 内存版（集群架构）。<br><strong>说明</strong>：CKV 版本当前有存量用户使用，暂时保留。</li></ul>
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set <p>实例类型。</p><ul><li>2：Redis 2.8 内存版（标准架构）。</li><li>3：CKV 3.2 内存版（标准架构）。</li><li>4：CKV 3.2 内存版（集群架构）。</li><li>6：Redis 4.0 内存版（标准架构）。</li><li>7：Redis 4.0 内存版（集群架构）。</li><li>8：Redis 5.0 内存版（标准架构）。</li><li>9：Redis 5.0 内存版（集群架构）。</li><li>15：Redis 6.2 内存版（标准架构）。</li><li>16：Redis 6.2 内存版（集群架构）。</li><li>17：Redis 7.0 内存版（标准架构）。</li><li>18：Redis 7.0 内存版（集群架构）。</li><li>19：Valkey 8.0 内存版（标准架构）。</li><li>20：Valkey 8.0 内存版（集群架构）。</li><li>200：Memcached 1.6 内存版（集群架构）。<br><strong>说明</strong>：CKV 版本当前有存量用户使用，暂时保留。</li></ul>
     * @param TypeId <p>实例类型。</p><ul><li>2：Redis 2.8 内存版（标准架构）。</li><li>3：CKV 3.2 内存版（标准架构）。</li><li>4：CKV 3.2 内存版（集群架构）。</li><li>6：Redis 4.0 内存版（标准架构）。</li><li>7：Redis 4.0 内存版（集群架构）。</li><li>8：Redis 5.0 内存版（标准架构）。</li><li>9：Redis 5.0 内存版（集群架构）。</li><li>15：Redis 6.2 内存版（标准架构）。</li><li>16：Redis 6.2 内存版（集群架构）。</li><li>17：Redis 7.0 内存版（标准架构）。</li><li>18：Redis 7.0 内存版（集群架构）。</li><li>19：Valkey 8.0 内存版（标准架构）。</li><li>20：Valkey 8.0 内存版（集群架构）。</li><li>200：Memcached 1.6 内存版（集群架构）。<br><strong>说明</strong>：CKV 版本当前有存量用户使用，暂时保留。</li></ul>
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get <p>内存容量，单位为MB， 数值需为1024的整数倍。具体规格，请通过 <a href="https://cloud.tencent.com/document/api/239/30600">DescribeProductInfo</a> 接口查询全地域的售卖规格。</p><ul><li><strong>TypeId</strong>为标准架构时，<strong>MemSize</strong>是实例总内存容量；</li><li><strong>TypeId</strong>为集群架构时，<strong>MemSize</strong>是单分片内存容量。</li></ul> 
     * @return MemSize <p>内存容量，单位为MB， 数值需为1024的整数倍。具体规格，请通过 <a href="https://cloud.tencent.com/document/api/239/30600">DescribeProductInfo</a> 接口查询全地域的售卖规格。</p><ul><li><strong>TypeId</strong>为标准架构时，<strong>MemSize</strong>是实例总内存容量；</li><li><strong>TypeId</strong>为集群架构时，<strong>MemSize</strong>是单分片内存容量。</li></ul>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>内存容量，单位为MB， 数值需为1024的整数倍。具体规格，请通过 <a href="https://cloud.tencent.com/document/api/239/30600">DescribeProductInfo</a> 接口查询全地域的售卖规格。</p><ul><li><strong>TypeId</strong>为标准架构时，<strong>MemSize</strong>是实例总内存容量；</li><li><strong>TypeId</strong>为集群架构时，<strong>MemSize</strong>是单分片内存容量。</li></ul>
     * @param MemSize <p>内存容量，单位为MB， 数值需为1024的整数倍。具体规格，请通过 <a href="https://cloud.tencent.com/document/api/239/30600">DescribeProductInfo</a> 接口查询全地域的售卖规格。</p><ul><li><strong>TypeId</strong>为标准架构时，<strong>MemSize</strong>是实例总内存容量；</li><li><strong>TypeId</strong>为集群架构时，<strong>MemSize</strong>是单分片内存容量。</li></ul>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>实例数量，单次购买实例数量。具体信息，请通过 <a href="https://cloud.tencent.com/document/api/239/30600">DescribeProductInfo</a> 接口查询全地域的售卖规格。</p> 
     * @return GoodsNum <p>实例数量，单次购买实例数量。具体信息，请通过 <a href="https://cloud.tencent.com/document/api/239/30600">DescribeProductInfo</a> 接口查询全地域的售卖规格。</p>
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set <p>实例数量，单次购买实例数量。具体信息，请通过 <a href="https://cloud.tencent.com/document/api/239/30600">DescribeProductInfo</a> 接口查询全地域的售卖规格。</p>
     * @param GoodsNum <p>实例数量，单次购买实例数量。具体信息，请通过 <a href="https://cloud.tencent.com/document/api/239/30600">DescribeProductInfo</a> 接口查询全地域的售卖规格。</p>
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get <p>购买实例的时长。</p><ul><li>若 <strong>BillingMode</strong>为<strong>1</strong>，即计费方式为包年包月时，需设置该参数，指定所购买实例的时长。单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</li><li>若 <strong>BillingMode</strong>为<strong>0</strong>，即计费方式为按量计费时，该参数配置为1。</li></ul> 
     * @return Period <p>购买实例的时长。</p><ul><li>若 <strong>BillingMode</strong>为<strong>1</strong>，即计费方式为包年包月时，需设置该参数，指定所购买实例的时长。单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</li><li>若 <strong>BillingMode</strong>为<strong>0</strong>，即计费方式为按量计费时，该参数配置为1。</li></ul>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>购买实例的时长。</p><ul><li>若 <strong>BillingMode</strong>为<strong>1</strong>，即计费方式为包年包月时，需设置该参数，指定所购买实例的时长。单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</li><li>若 <strong>BillingMode</strong>为<strong>0</strong>，即计费方式为按量计费时，该参数配置为1。</li></ul>
     * @param Period <p>购买实例的时长。</p><ul><li>若 <strong>BillingMode</strong>为<strong>1</strong>，即计费方式为包年包月时，需设置该参数，指定所购买实例的时长。单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</li><li>若 <strong>BillingMode</strong>为<strong>0</strong>，即计费方式为按量计费时，该参数配置为1。</li></ul>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>计费方式。</p><ul><li>0：按量计费。</li><li>1：包年包月。</li></ul> 
     * @return BillingMode <p>计费方式。</p><ul><li>0：按量计费。</li><li>1：包年包月。</li></ul>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>计费方式。</p><ul><li>0：按量计费。</li><li>1：包年包月。</li></ul>
     * @param BillingMode <p>计费方式。</p><ul><li>0：按量计费。</li><li>1：包年包月。</li></ul>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>实例所属的可用区ID，可参考<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。</p> 
     * @return ZoneId <p>实例所属的可用区ID，可参考<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>实例所属的可用区ID，可参考<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。</p>
     * @param ZoneId <p>实例所属的可用区ID，可参考<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>访问实例的密码。</p><ul><li>当输入参数<strong>NoAuth</strong>为<strong>true</strong>时，指设置实例为免密码访问，Password可不用配置，否则Password为必填参数。</li><li>当实例类型<strong>TypeId</strong>为Redis 2.8 内存版标准架构、Redis 4.0、5.0、6.2、7.0内存版标准架构或集群架构时，其密码复杂度要求为：8-64个字符，至少包含小写字母、大写字母、数字和字符()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的2种，不能以&quot;/&quot;开头。</li><li>当实例类型<strong>TypeId</strong>为CKV 3.2 内存版标准架构或集群架构时，其密码复杂度为：8-30个字符，必须包含字母和数字，且不包含其他字符。</li></ul> 
     * @return Password <p>访问实例的密码。</p><ul><li>当输入参数<strong>NoAuth</strong>为<strong>true</strong>时，指设置实例为免密码访问，Password可不用配置，否则Password为必填参数。</li><li>当实例类型<strong>TypeId</strong>为Redis 2.8 内存版标准架构、Redis 4.0、5.0、6.2、7.0内存版标准架构或集群架构时，其密码复杂度要求为：8-64个字符，至少包含小写字母、大写字母、数字和字符()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的2种，不能以&quot;/&quot;开头。</li><li>当实例类型<strong>TypeId</strong>为CKV 3.2 内存版标准架构或集群架构时，其密码复杂度为：8-30个字符，必须包含字母和数字，且不包含其他字符。</li></ul>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>访问实例的密码。</p><ul><li>当输入参数<strong>NoAuth</strong>为<strong>true</strong>时，指设置实例为免密码访问，Password可不用配置，否则Password为必填参数。</li><li>当实例类型<strong>TypeId</strong>为Redis 2.8 内存版标准架构、Redis 4.0、5.0、6.2、7.0内存版标准架构或集群架构时，其密码复杂度要求为：8-64个字符，至少包含小写字母、大写字母、数字和字符()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的2种，不能以&quot;/&quot;开头。</li><li>当实例类型<strong>TypeId</strong>为CKV 3.2 内存版标准架构或集群架构时，其密码复杂度为：8-30个字符，必须包含字母和数字，且不包含其他字符。</li></ul>
     * @param Password <p>访问实例的密码。</p><ul><li>当输入参数<strong>NoAuth</strong>为<strong>true</strong>时，指设置实例为免密码访问，Password可不用配置，否则Password为必填参数。</li><li>当实例类型<strong>TypeId</strong>为Redis 2.8 内存版标准架构、Redis 4.0、5.0、6.2、7.0内存版标准架构或集群架构时，其密码复杂度要求为：8-64个字符，至少包含小写字母、大写字母、数字和字符()`~!@#$%^&amp;*-+=_|{}[]:;&lt;&gt;,.?/ 中的2种，不能以&quot;/&quot;开头。</li><li>当实例类型<strong>TypeId</strong>为CKV 3.2 内存版标准架构或集群架构时，其密码复杂度为：8-30个字符，必须包含字母和数字，且不包含其他字符。</li></ul>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>私有网络ID。如果不配置该参数则默认选择基础网络。请登录 <a href="https://console.cloud.tencent.com/vpc">私有网络</a>控制台查询具体的ID。</p> 
     * @return VpcId <p>私有网络ID。如果不配置该参数则默认选择基础网络。请登录 <a href="https://console.cloud.tencent.com/vpc">私有网络</a>控制台查询具体的ID。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID。如果不配置该参数则默认选择基础网络。请登录 <a href="https://console.cloud.tencent.com/vpc">私有网络</a>控制台查询具体的ID。</p>
     * @param VpcId <p>私有网络ID。如果不配置该参数则默认选择基础网络。请登录 <a href="https://console.cloud.tencent.com/vpc">私有网络</a>控制台查询具体的ID。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络VPC的子网。基础网络下， 该参数无需配置。请登录 <a href="https://console.cloud.tencent.com/vpc">私有网络</a>控制台查询子网列表获取具体的 ID。</p> 
     * @return SubnetId <p>私有网络VPC的子网。基础网络下， 该参数无需配置。请登录 <a href="https://console.cloud.tencent.com/vpc">私有网络</a>控制台查询子网列表获取具体的 ID。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>私有网络VPC的子网。基础网络下， 该参数无需配置。请登录 <a href="https://console.cloud.tencent.com/vpc">私有网络</a>控制台查询子网列表获取具体的 ID。</p>
     * @param SubnetId <p>私有网络VPC的子网。基础网络下， 该参数无需配置。请登录 <a href="https://console.cloud.tencent.com/vpc">私有网络</a>控制台查询子网列表获取具体的 ID。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>项目 ID。请登录<a href="https://console.cloud.tencent.com/redis#/">Redis控制台</a>，在右上角的账户信息菜单中，选择<strong>项目管理</strong>查询项目 ID。</p> 
     * @return ProjectId <p>项目 ID。请登录<a href="https://console.cloud.tencent.com/redis#/">Redis控制台</a>，在右上角的账户信息菜单中，选择<strong>项目管理</strong>查询项目 ID。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID。请登录<a href="https://console.cloud.tencent.com/redis#/">Redis控制台</a>，在右上角的账户信息菜单中，选择<strong>项目管理</strong>查询项目 ID。</p>
     * @param ProjectId <p>项目 ID。请登录<a href="https://console.cloud.tencent.com/redis#/">Redis控制台</a>，在右上角的账户信息菜单中，选择<strong>项目管理</strong>查询项目 ID。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>自动续费标识。</p><ul><li>0：默认状态（手动续费）。</li><li>1：自动续费。</li><li>2：到期不续费。</li></ul> 
     * @return AutoRenew <p>自动续费标识。</p><ul><li>0：默认状态（手动续费）。</li><li>1：自动续费。</li><li>2：到期不续费。</li></ul>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>自动续费标识。</p><ul><li>0：默认状态（手动续费）。</li><li>1：自动续费。</li><li>2：到期不续费。</li></ul>
     * @param AutoRenew <p>自动续费标识。</p><ul><li>0：默认状态（手动续费）。</li><li>1：自动续费。</li><li>2：到期不续费。</li></ul>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>安全组 ID 数组。</p><ul><li>安全组是一种虚拟防火墙，对云数据库实例的网络访问进行控制。创建实例时，建议绑定相应的安全组。</li><li>请通过 <a href="https://cloud.tencent.com/document/product/239/34447">DescribeInstanceSecurityGroup</a> 接口获取实例的安全组 ID。</li></ul> 
     * @return SecurityGroupIdList <p>安全组 ID 数组。</p><ul><li>安全组是一种虚拟防火墙，对云数据库实例的网络访问进行控制。创建实例时，建议绑定相应的安全组。</li><li>请通过 <a href="https://cloud.tencent.com/document/product/239/34447">DescribeInstanceSecurityGroup</a> 接口获取实例的安全组 ID。</li></ul>
     */
    public String [] getSecurityGroupIdList() {
        return this.SecurityGroupIdList;
    }

    /**
     * Set <p>安全组 ID 数组。</p><ul><li>安全组是一种虚拟防火墙，对云数据库实例的网络访问进行控制。创建实例时，建议绑定相应的安全组。</li><li>请通过 <a href="https://cloud.tencent.com/document/product/239/34447">DescribeInstanceSecurityGroup</a> 接口获取实例的安全组 ID。</li></ul>
     * @param SecurityGroupIdList <p>安全组 ID 数组。</p><ul><li>安全组是一种虚拟防火墙，对云数据库实例的网络访问进行控制。创建实例时，建议绑定相应的安全组。</li><li>请通过 <a href="https://cloud.tencent.com/document/product/239/34447">DescribeInstanceSecurityGroup</a> 接口获取实例的安全组 ID。</li></ul>
     */
    public void setSecurityGroupIdList(String [] SecurityGroupIdList) {
        this.SecurityGroupIdList = SecurityGroupIdList;
    }

    /**
     * Get <p>用户自定义的网络端口。默认为6379，范围为 [1024,65535]。</p> 
     * @return VPort <p>用户自定义的网络端口。默认为6379，范围为 [1024,65535]。</p>
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set <p>用户自定义的网络端口。默认为6379，范围为 [1024,65535]。</p>
     * @param VPort <p>用户自定义的网络端口。默认为6379，范围为 [1024,65535]。</p>
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get <p>实例分片数量。</p><ul><li>标准版实例无需配置该参数。</li><li>集群版实例，分片数量范围为：[1、3、5、8、12、16、24、32、40、48、64、80、96、128]。</li></ul> 
     * @return RedisShardNum <p>实例分片数量。</p><ul><li>标准版实例无需配置该参数。</li><li>集群版实例，分片数量范围为：[1、3、5、8、12、16、24、32、40、48、64、80、96、128]。</li></ul>
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set <p>实例分片数量。</p><ul><li>标准版实例无需配置该参数。</li><li>集群版实例，分片数量范围为：[1、3、5、8、12、16、24、32、40、48、64、80、96、128]。</li></ul>
     * @param RedisShardNum <p>实例分片数量。</p><ul><li>标准版实例无需配置该参数。</li><li>集群版实例，分片数量范围为：[1、3、5、8、12、16、24、32、40、48、64、80、96、128]。</li></ul>
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get <p>实例副本数量。</p><ul><li>Redis 内存版 4.0、5.0、6.2、7.0 标准架构和集群架构支持副本数量范围为[1,5]。</li><li>Redis 2.8标准版、CKV标准版只支持1副本。</li></ul> 
     * @return RedisReplicasNum <p>实例副本数量。</p><ul><li>Redis 内存版 4.0、5.0、6.2、7.0 标准架构和集群架构支持副本数量范围为[1,5]。</li><li>Redis 2.8标准版、CKV标准版只支持1副本。</li></ul>
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set <p>实例副本数量。</p><ul><li>Redis 内存版 4.0、5.0、6.2、7.0 标准架构和集群架构支持副本数量范围为[1,5]。</li><li>Redis 2.8标准版、CKV标准版只支持1副本。</li></ul>
     * @param RedisReplicasNum <p>实例副本数量。</p><ul><li>Redis 内存版 4.0、5.0、6.2、7.0 标准架构和集群架构支持副本数量范围为[1,5]。</li><li>Redis 2.8标准版、CKV标准版只支持1副本。</li></ul>
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get <p>标识实例是否需支持副本只读。</p><ul><li>Redis 2.8 标准版、CKV标准版不支持副本只读。</li><li>开启副本只读，实例将自动读写分离，写请求路由到主节点，读请求路由到副本节点。</li><li>如需开启副本只读，建议副本数量大于等于2。</li></ul> 
     * @return ReplicasReadonly <p>标识实例是否需支持副本只读。</p><ul><li>Redis 2.8 标准版、CKV标准版不支持副本只读。</li><li>开启副本只读，实例将自动读写分离，写请求路由到主节点，读请求路由到副本节点。</li><li>如需开启副本只读，建议副本数量大于等于2。</li></ul>
     */
    public Boolean getReplicasReadonly() {
        return this.ReplicasReadonly;
    }

    /**
     * Set <p>标识实例是否需支持副本只读。</p><ul><li>Redis 2.8 标准版、CKV标准版不支持副本只读。</li><li>开启副本只读，实例将自动读写分离，写请求路由到主节点，读请求路由到副本节点。</li><li>如需开启副本只读，建议副本数量大于等于2。</li></ul>
     * @param ReplicasReadonly <p>标识实例是否需支持副本只读。</p><ul><li>Redis 2.8 标准版、CKV标准版不支持副本只读。</li><li>开启副本只读，实例将自动读写分离，写请求路由到主节点，读请求路由到副本节点。</li><li>如需开启副本只读，建议副本数量大于等于2。</li></ul>
     */
    public void setReplicasReadonly(Boolean ReplicasReadonly) {
        this.ReplicasReadonly = ReplicasReadonly;
    }

    /**
     * Get <p>实例名称。命名要求：仅支持长度小于60的中文、英文或者数字，短划线&quot;-&quot;、下划线&quot;_&quot;。</p> 
     * @return InstanceName <p>实例名称。命名要求：仅支持长度小于60的中文、英文或者数字，短划线&quot;-&quot;、下划线&quot;_&quot;。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称。命名要求：仅支持长度小于60的中文、英文或者数字，短划线&quot;-&quot;、下划线&quot;_&quot;。</p>
     * @param InstanceName <p>实例名称。命名要求：仅支持长度小于60的中文、英文或者数字，短划线&quot;-&quot;、下划线&quot;_&quot;。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>配置实例是否支持免密码访问。</p><ul><li>true：免密访问实例。</li><li>false：非免密访问实例。默认为非免密方式，仅VPC网络的实例支持免密码访问。</li></ul> 
     * @return NoAuth <p>配置实例是否支持免密码访问。</p><ul><li>true：免密访问实例。</li><li>false：非免密访问实例。默认为非免密方式，仅VPC网络的实例支持免密码访问。</li></ul>
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set <p>配置实例是否支持免密码访问。</p><ul><li>true：免密访问实例。</li><li>false：非免密访问实例。默认为非免密方式，仅VPC网络的实例支持免密码访问。</li></ul>
     * @param NoAuth <p>配置实例是否支持免密码访问。</p><ul><li>true：免密访问实例。</li><li>false：非免密访问实例。默认为非免密方式，仅VPC网络的实例支持免密码访问。</li></ul>
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get <p>实例的节点信息，包含节点 ID、节点类型、节点可用区 ID等。具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/20022">RedisNodeInfo </a>。<br>目前支持传入节点的类型（主节点或者副本节点），节点的可用区。未指定该参数时，在支持多可用区部署的地域，系统将默认创建多可用区架构实例。</p> 
     * @return NodeSet <p>实例的节点信息，包含节点 ID、节点类型、节点可用区 ID等。具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/20022">RedisNodeInfo </a>。<br>目前支持传入节点的类型（主节点或者副本节点），节点的可用区。未指定该参数时，在支持多可用区部署的地域，系统将默认创建多可用区架构实例。</p>
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set <p>实例的节点信息，包含节点 ID、节点类型、节点可用区 ID等。具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/20022">RedisNodeInfo </a>。<br>目前支持传入节点的类型（主节点或者副本节点），节点的可用区。未指定该参数时，在支持多可用区部署的地域，系统将默认创建多可用区架构实例。</p>
     * @param NodeSet <p>实例的节点信息，包含节点 ID、节点类型、节点可用区 ID等。具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/20022">RedisNodeInfo </a>。<br>目前支持传入节点的类型（主节点或者副本节点），节点的可用区。未指定该参数时，在支持多可用区部署的地域，系统将默认创建多可用区架构实例。</p>
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Get <p>给实例设定标签。</p> 
     * @return ResourceTags <p>给实例设定标签。</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>给实例设定标签。</p>
     * @param ResourceTags <p>给实例设定标签。</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>指定实例所属的可用区名称。具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。</p> 
     * @return ZoneName <p>指定实例所属的可用区名称。具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>指定实例所属的可用区名称。具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。</p>
     * @param ZoneName <p>指定实例所属的可用区名称。具体信息，请参见<a href="https://cloud.tencent.com/document/product/239/4106">地域和可用区</a>  。</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>指定实例相关的参数模板 ID。</p><ul><li>若不配置该参数，则系统会依据所选择的兼容版本及架构，自动适配对应的默认模板。</li><li>请通过<a href="https://cloud.tencent.com/document/product/239/58750">DescribeParamTemplates</a>接口，查询实例的参数模板列表，获取模板 ID 编号。</li></ul> 
     * @return TemplateId <p>指定实例相关的参数模板 ID。</p><ul><li>若不配置该参数，则系统会依据所选择的兼容版本及架构，自动适配对应的默认模板。</li><li>请通过<a href="https://cloud.tencent.com/document/product/239/58750">DescribeParamTemplates</a>接口，查询实例的参数模板列表，获取模板 ID 编号。</li></ul>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>指定实例相关的参数模板 ID。</p><ul><li>若不配置该参数，则系统会依据所选择的兼容版本及架构，自动适配对应的默认模板。</li><li>请通过<a href="https://cloud.tencent.com/document/product/239/58750">DescribeParamTemplates</a>接口，查询实例的参数模板列表，获取模板 ID 编号。</li></ul>
     * @param TemplateId <p>指定实例相关的参数模板 ID。</p><ul><li>若不配置该参数，则系统会依据所选择的兼容版本及架构，自动适配对应的默认模板。</li><li>请通过<a href="https://cloud.tencent.com/document/product/239/58750">DescribeParamTemplates</a>接口，查询实例的参数模板列表，获取模板 ID 编号。</li></ul>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>内部参数，标识创建实例是否需要检查。</p><ul><li>false ：默认值。发送正常请求，通过检查后直接创建实例。</li><li>true：发送检查请求，不会创建实例。</li></ul> 
     * @return DryRun <p>内部参数，标识创建实例是否需要检查。</p><ul><li>false ：默认值。发送正常请求，通过检查后直接创建实例。</li><li>true：发送检查请求，不会创建实例。</li></ul>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>内部参数，标识创建实例是否需要检查。</p><ul><li>false ：默认值。发送正常请求，通过检查后直接创建实例。</li><li>true：发送检查请求，不会创建实例。</li></ul>
     * @param DryRun <p>内部参数，标识创建实例是否需要检查。</p><ul><li>false ：默认值。发送正常请求，通过检查后直接创建实例。</li><li>true：发送检查请求，不会创建实例。</li></ul>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get <p>指实例部署模式。</p><ul><li>local：传统架构，默认为 local。</li><li>cdc：独享集群。</li><li>cloud：云原生，当前已暂停售卖。</li></ul> 
     * @return ProductVersion <p>指实例部署模式。</p><ul><li>local：传统架构，默认为 local。</li><li>cdc：独享集群。</li><li>cloud：云原生，当前已暂停售卖。</li></ul>
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set <p>指实例部署模式。</p><ul><li>local：传统架构，默认为 local。</li><li>cdc：独享集群。</li><li>cloud：云原生，当前已暂停售卖。</li></ul>
     * @param ProductVersion <p>指实例部署模式。</p><ul><li>local：传统架构，默认为 local。</li><li>cdc：独享集群。</li><li>cloud：云原生，当前已暂停售卖。</li></ul>
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get <p>独享集群 ID。</p><ul><li>当 <strong>ProductVersion</strong> 设置为 <strong>cdc</strong> 时，该参数必须设置。</li><li>请通过接口<a href="https://cloud.tencent.com/document/product/239/109628"> DescribeRedisClusters</a> 获取集群 ID。</li></ul> 
     * @return RedisClusterId <p>独享集群 ID。</p><ul><li>当 <strong>ProductVersion</strong> 设置为 <strong>cdc</strong> 时，该参数必须设置。</li><li>请通过接口<a href="https://cloud.tencent.com/document/product/239/109628"> DescribeRedisClusters</a> 获取集群 ID。</li></ul>
     */
    public String getRedisClusterId() {
        return this.RedisClusterId;
    }

    /**
     * Set <p>独享集群 ID。</p><ul><li>当 <strong>ProductVersion</strong> 设置为 <strong>cdc</strong> 时，该参数必须设置。</li><li>请通过接口<a href="https://cloud.tencent.com/document/product/239/109628"> DescribeRedisClusters</a> 获取集群 ID。</li></ul>
     * @param RedisClusterId <p>独享集群 ID。</p><ul><li>当 <strong>ProductVersion</strong> 设置为 <strong>cdc</strong> 时，该参数必须设置。</li><li>请通过接口<a href="https://cloud.tencent.com/document/product/239/109628"> DescribeRedisClusters</a> 获取集群 ID。</li></ul>
     */
    public void setRedisClusterId(String RedisClusterId) {
        this.RedisClusterId = RedisClusterId;
    }

    /**
     * Get <p>告警策略 ID 数组。</p><ul><li>请登录<a href="https://console.cloud.tencent.com/monitor/alarm/policy">腾讯云可观测平台-告警管理-策略管理</a>获取告警策略 ID。</li><li>若不配置该参数，则绑定默认告警策略。默认告警策略具体信息，请登录<a href="https://console.cloud.tencent.com/monitor/alarm/policy">腾讯云可观测平台-告警管理-策略管理</a>查看。</li></ul> 
     * @return AlarmPolicyList <p>告警策略 ID 数组。</p><ul><li>请登录<a href="https://console.cloud.tencent.com/monitor/alarm/policy">腾讯云可观测平台-告警管理-策略管理</a>获取告警策略 ID。</li><li>若不配置该参数，则绑定默认告警策略。默认告警策略具体信息，请登录<a href="https://console.cloud.tencent.com/monitor/alarm/policy">腾讯云可观测平台-告警管理-策略管理</a>查看。</li></ul>
     */
    public String [] getAlarmPolicyList() {
        return this.AlarmPolicyList;
    }

    /**
     * Set <p>告警策略 ID 数组。</p><ul><li>请登录<a href="https://console.cloud.tencent.com/monitor/alarm/policy">腾讯云可观测平台-告警管理-策略管理</a>获取告警策略 ID。</li><li>若不配置该参数，则绑定默认告警策略。默认告警策略具体信息，请登录<a href="https://console.cloud.tencent.com/monitor/alarm/policy">腾讯云可观测平台-告警管理-策略管理</a>查看。</li></ul>
     * @param AlarmPolicyList <p>告警策略 ID 数组。</p><ul><li>请登录<a href="https://console.cloud.tencent.com/monitor/alarm/policy">腾讯云可观测平台-告警管理-策略管理</a>获取告警策略 ID。</li><li>若不配置该参数，则绑定默认告警策略。默认告警策略具体信息，请登录<a href="https://console.cloud.tencent.com/monitor/alarm/policy">腾讯云可观测平台-告警管理-策略管理</a>查看。</li></ul>
     */
    public void setAlarmPolicyList(String [] AlarmPolicyList) {
        this.AlarmPolicyList = AlarmPolicyList;
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
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
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
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.RedisShardNum != null) {
            this.RedisShardNum = new Long(source.RedisShardNum);
        }
        if (source.RedisReplicasNum != null) {
            this.RedisReplicasNum = new Long(source.RedisReplicasNum);
        }
        if (source.ReplicasReadonly != null) {
            this.ReplicasReadonly = new Boolean(source.ReplicasReadonly);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.NoAuth != null) {
            this.NoAuth = new Boolean(source.NoAuth);
        }
        if (source.NodeSet != null) {
            this.NodeSet = new RedisNodeInfo[source.NodeSet.length];
            for (int i = 0; i < source.NodeSet.length; i++) {
                this.NodeSet[i] = new RedisNodeInfo(source.NodeSet[i]);
            }
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.ProductVersion != null) {
            this.ProductVersion = new String(source.ProductVersion);
        }
        if (source.RedisClusterId != null) {
            this.RedisClusterId = new String(source.RedisClusterId);
        }
        if (source.AlarmPolicyList != null) {
            this.AlarmPolicyList = new String[source.AlarmPolicyList.length];
            for (int i = 0; i < source.AlarmPolicyList.length; i++) {
                this.AlarmPolicyList[i] = new String(source.AlarmPolicyList[i]);
            }
        }
        if (source.EncryptPassword != null) {
            this.EncryptPassword = new Boolean(source.EncryptPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamArraySimple(map, prefix + "SecurityGroupIdList.", this.SecurityGroupIdList);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);
        this.setParamSimple(map, prefix + "ReplicasReadonly", this.ReplicasReadonly);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);
        this.setParamArrayObj(map, prefix + "NodeSet.", this.NodeSet);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);
        this.setParamSimple(map, prefix + "RedisClusterId", this.RedisClusterId);
        this.setParamArraySimple(map, prefix + "AlarmPolicyList.", this.AlarmPolicyList);
        this.setParamSimple(map, prefix + "EncryptPassword", this.EncryptPassword);

    }
}

