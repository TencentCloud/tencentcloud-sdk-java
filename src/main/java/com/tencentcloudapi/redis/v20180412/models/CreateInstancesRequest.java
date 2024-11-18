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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancesRequest extends AbstractModel {

    /**
    * 实例类型。
<ul><li>2：Redis 2.8 内存版（标准架构）。</li><li>3：CKV 3.2 内存版（标准架构）。</li><li>4：CKV 3.2 内存版（集群架构）。</li><li>6：Redis 4.0 内存版（标准架构）。</li><li>7：Redis 4.0 内存版（集群架构）。</li><li>8：Redis 5.0 内存版（标准架构）。</li><li>9：Redis 5.0 内存版（集群架构）。</li><li>15：Redis 6.2 内存版（标准架构）。</li><li>16：Redis 6.2 内存版（集群架构）。</li><li>17：Redis 7.0 内存版（标准架构）。</li><li>18：Redis 7.0 内存版（集群架构）。</li></ul>
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * 内存容量，单位为MB， 数值需为1024的整数倍。具体规格，请通过 [DescribeProductInfo](https://cloud.tencent.com/document/api/239/30600) 接口查询全地域的售卖规格。
- **TypeId**为标准架构时，**MemSize**是实例总内存容量；
- **TypeId**为集群架构时，**MemSize**是单分片内存容量。
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 实例数量，单次购买实例数量。具体信息，请通过 [DescribeProductInfo](https://cloud.tencent.com/document/api/239/30600) 接口查询全地域的售卖规格。
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 购买实例的时长。
- 若 **BillingMode**为**1**，即计费方式为包年包月时，需设置该参数，指定所购买实例的时长。单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
- 若 **BillingMode**为**0**，即计费方式为按量计费时，该参数配置为1。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 计费方式。
- 0：按量计费。
- 1：包年包月。
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * 实例所属的可用区ID，可参考[地域和可用区](https://cloud.tencent.com/document/product/239/4106)  。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 访问实例的密码。
- 当输入参数**NoAuth**为**true**时，指设置实例为免密码访问，Password可不用配置，否则Password为必填参数。
- 当实例类型**TypeId**为Redis 2.8 内存版标准架构、Redis 4.0、5.0、6.0内存版标准架构或集群架构时，其密码复杂度要求为：8-30个字符，至少包含小写字母、大写字母、数字和字符()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 中的2种，不能以"/"开头。
- 当实例类型**TypeId**为CKV 3.2 内存版标准架构或集群架构时，其密码复杂度为：8-30个字符，必须包含字母和数字，且 不包含其他字符。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 私有网络ID。如果不配置该参数则默认选择基础网络。请登录 [私有网络](https://console.cloud.tencent.com/vpc)控制台查询具体的ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络VPC的子网。基础网络下， 该参数无需配置。请登录 [私有网络](https://console.cloud.tencent.com/vpc)控制台查询子网列表获取具体的 ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 项目 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)，在右上角的账户信息菜单中，选择**项目管理**查询项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 自动续费标识。
- 0：默认状态（手动续费）。
- 1：自动续费。
- 2：到期不续费。
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 安全组 ID 数组。
- 安全组是一种虚拟防火墙，对云数据库实例的网络访问进行控制。创建实例时，建议绑定相应的安全组。
- 请通过 [DescribeInstanceSecurityGroup](https://cloud.tencent.com/document/product/239/34447) 接口获取实例的安全组 ID。
    */
    @SerializedName("SecurityGroupIdList")
    @Expose
    private String [] SecurityGroupIdList;

    /**
    * 用户自定义的网络端口。默认为6379，范围为 [1024,65535]。
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * 实例分片数量。
- 标准版实例无需配置该参数。
- 集群版实例，分片数量范围为：[1、3、5、8、12、16、24、32、40、48、64、80、96、128]。
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * 实例副本数量。
- Redis 内存版 4.0、5.0、6.2 标准架构和集群架构支持副本数量范围为[1,5]。
- Redis 2.8标准版、CKV标准版只支持1副本。
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * 标识实例是否需支持副本只读。
- Redis 2.8 标准版、CKV标准版不支持副本只读。
- 开启副本只读，实例将自动读写分离，写请求路由到主节点，读请求路由到副本节点。
- 如需开启副本只读，建议副本数量大于等于2。
    */
    @SerializedName("ReplicasReadonly")
    @Expose
    private Boolean ReplicasReadonly;

    /**
    * 实例名称。命名要求：仅支持长度小于60的中文、英文或者数字，短划线"-"、下划线"_"。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 配置实例是否支持免密码访问。
- true：免密访问实例。
- false：非免密访问实例。默认为非免密方式，仅VPC网络的实例支持免密码访问。
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * 实例的节点信息，包含节点 ID、节点类型、节点可用区 ID等。具体信息，请参见[RedisNodeInfo ](https://cloud.tencent.com/document/product/239/20022)。
目前支持传入节点的类型（主节点或者副本节点），节点的可用区。单可用区部署不需要传递此参数。
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

    /**
    * 给实例设定标签。
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * 指定实例所属的可用区名称。具体信息，请参见[地域和可用区](https://cloud.tencent.com/document/product/239/4106)  。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 指定实例相关的参数模板 ID。
- 若不配置该参数，则系统会依据所选择的兼容版本及架构，自动适配对应的默认模板。
- 请通过[DescribeParamTemplates](https://cloud.tencent.com/document/product/239/58750)接口，查询实例的参数模板列表，获取模板 ID 编号。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 内部参数，标识创建实例是否需要检查。
- false ：默认值。发送正常请求，通过检查后直接创建实例。
- true：发送检查请求，不会创建实例。
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 指定实例的产品版本。
- local：本地盘版。
- cloud：云盘版，
- cdc：独享集群版。如果不传默认发货为本地盘版本。
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * 独享集群 ID。当**ProductVersion**设置为**cdc**时，该参数必须设置。
    */
    @SerializedName("RedisClusterId")
    @Expose
    private String RedisClusterId;

    /**
    * 告警策略 ID 数组。

- 请登录[腾讯云可观测平台-告警管理-策略管理](https://console.cloud.tencent.com/monitor/alarm/policy)获取告警策略 ID。
- 若不配置该参数，则绑定默认告警策略。默认告警策略具体信息，请登录[腾讯云可观测平台-告警管理-策略管理](https://console.cloud.tencent.com/monitor/alarm/policy)查看。
    */
    @SerializedName("AlarmPolicyList")
    @Expose
    private String [] AlarmPolicyList;

    /**
     * Get 实例类型。
<ul><li>2：Redis 2.8 内存版（标准架构）。</li><li>3：CKV 3.2 内存版（标准架构）。</li><li>4：CKV 3.2 内存版（集群架构）。</li><li>6：Redis 4.0 内存版（标准架构）。</li><li>7：Redis 4.0 内存版（集群架构）。</li><li>8：Redis 5.0 内存版（标准架构）。</li><li>9：Redis 5.0 内存版（集群架构）。</li><li>15：Redis 6.2 内存版（标准架构）。</li><li>16：Redis 6.2 内存版（集群架构）。</li><li>17：Redis 7.0 内存版（标准架构）。</li><li>18：Redis 7.0 内存版（集群架构）。</li></ul> 
     * @return TypeId 实例类型。
<ul><li>2：Redis 2.8 内存版（标准架构）。</li><li>3：CKV 3.2 内存版（标准架构）。</li><li>4：CKV 3.2 内存版（集群架构）。</li><li>6：Redis 4.0 内存版（标准架构）。</li><li>7：Redis 4.0 内存版（集群架构）。</li><li>8：Redis 5.0 内存版（标准架构）。</li><li>9：Redis 5.0 内存版（集群架构）。</li><li>15：Redis 6.2 内存版（标准架构）。</li><li>16：Redis 6.2 内存版（集群架构）。</li><li>17：Redis 7.0 内存版（标准架构）。</li><li>18：Redis 7.0 内存版（集群架构）。</li></ul>
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 实例类型。
<ul><li>2：Redis 2.8 内存版（标准架构）。</li><li>3：CKV 3.2 内存版（标准架构）。</li><li>4：CKV 3.2 内存版（集群架构）。</li><li>6：Redis 4.0 内存版（标准架构）。</li><li>7：Redis 4.0 内存版（集群架构）。</li><li>8：Redis 5.0 内存版（标准架构）。</li><li>9：Redis 5.0 内存版（集群架构）。</li><li>15：Redis 6.2 内存版（标准架构）。</li><li>16：Redis 6.2 内存版（集群架构）。</li><li>17：Redis 7.0 内存版（标准架构）。</li><li>18：Redis 7.0 内存版（集群架构）。</li></ul>
     * @param TypeId 实例类型。
<ul><li>2：Redis 2.8 内存版（标准架构）。</li><li>3：CKV 3.2 内存版（标准架构）。</li><li>4：CKV 3.2 内存版（集群架构）。</li><li>6：Redis 4.0 内存版（标准架构）。</li><li>7：Redis 4.0 内存版（集群架构）。</li><li>8：Redis 5.0 内存版（标准架构）。</li><li>9：Redis 5.0 内存版（集群架构）。</li><li>15：Redis 6.2 内存版（标准架构）。</li><li>16：Redis 6.2 内存版（集群架构）。</li><li>17：Redis 7.0 内存版（标准架构）。</li><li>18：Redis 7.0 内存版（集群架构）。</li></ul>
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get 内存容量，单位为MB， 数值需为1024的整数倍。具体规格，请通过 [DescribeProductInfo](https://cloud.tencent.com/document/api/239/30600) 接口查询全地域的售卖规格。
- **TypeId**为标准架构时，**MemSize**是实例总内存容量；
- **TypeId**为集群架构时，**MemSize**是单分片内存容量。 
     * @return MemSize 内存容量，单位为MB， 数值需为1024的整数倍。具体规格，请通过 [DescribeProductInfo](https://cloud.tencent.com/document/api/239/30600) 接口查询全地域的售卖规格。
- **TypeId**为标准架构时，**MemSize**是实例总内存容量；
- **TypeId**为集群架构时，**MemSize**是单分片内存容量。
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 内存容量，单位为MB， 数值需为1024的整数倍。具体规格，请通过 [DescribeProductInfo](https://cloud.tencent.com/document/api/239/30600) 接口查询全地域的售卖规格。
- **TypeId**为标准架构时，**MemSize**是实例总内存容量；
- **TypeId**为集群架构时，**MemSize**是单分片内存容量。
     * @param MemSize 内存容量，单位为MB， 数值需为1024的整数倍。具体规格，请通过 [DescribeProductInfo](https://cloud.tencent.com/document/api/239/30600) 接口查询全地域的售卖规格。
- **TypeId**为标准架构时，**MemSize**是实例总内存容量；
- **TypeId**为集群架构时，**MemSize**是单分片内存容量。
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 实例数量，单次购买实例数量。具体信息，请通过 [DescribeProductInfo](https://cloud.tencent.com/document/api/239/30600) 接口查询全地域的售卖规格。 
     * @return GoodsNum 实例数量，单次购买实例数量。具体信息，请通过 [DescribeProductInfo](https://cloud.tencent.com/document/api/239/30600) 接口查询全地域的售卖规格。
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 实例数量，单次购买实例数量。具体信息，请通过 [DescribeProductInfo](https://cloud.tencent.com/document/api/239/30600) 接口查询全地域的售卖规格。
     * @param GoodsNum 实例数量，单次购买实例数量。具体信息，请通过 [DescribeProductInfo](https://cloud.tencent.com/document/api/239/30600) 接口查询全地域的售卖规格。
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 购买实例的时长。
- 若 **BillingMode**为**1**，即计费方式为包年包月时，需设置该参数，指定所购买实例的时长。单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
- 若 **BillingMode**为**0**，即计费方式为按量计费时，该参数配置为1。 
     * @return Period 购买实例的时长。
- 若 **BillingMode**为**1**，即计费方式为包年包月时，需设置该参数，指定所购买实例的时长。单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
- 若 **BillingMode**为**0**，即计费方式为按量计费时，该参数配置为1。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买实例的时长。
- 若 **BillingMode**为**1**，即计费方式为包年包月时，需设置该参数，指定所购买实例的时长。单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
- 若 **BillingMode**为**0**，即计费方式为按量计费时，该参数配置为1。
     * @param Period 购买实例的时长。
- 若 **BillingMode**为**1**，即计费方式为包年包月时，需设置该参数，指定所购买实例的时长。单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
- 若 **BillingMode**为**0**，即计费方式为按量计费时，该参数配置为1。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 计费方式。
- 0：按量计费。
- 1：包年包月。 
     * @return BillingMode 计费方式。
- 0：按量计费。
- 1：包年包月。
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set 计费方式。
- 0：按量计费。
- 1：包年包月。
     * @param BillingMode 计费方式。
- 0：按量计费。
- 1：包年包月。
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get 实例所属的可用区ID，可参考[地域和可用区](https://cloud.tencent.com/document/product/239/4106)  。 
     * @return ZoneId 实例所属的可用区ID，可参考[地域和可用区](https://cloud.tencent.com/document/product/239/4106)  。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 实例所属的可用区ID，可参考[地域和可用区](https://cloud.tencent.com/document/product/239/4106)  。
     * @param ZoneId 实例所属的可用区ID，可参考[地域和可用区](https://cloud.tencent.com/document/product/239/4106)  。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 访问实例的密码。
- 当输入参数**NoAuth**为**true**时，指设置实例为免密码访问，Password可不用配置，否则Password为必填参数。
- 当实例类型**TypeId**为Redis 2.8 内存版标准架构、Redis 4.0、5.0、6.0内存版标准架构或集群架构时，其密码复杂度要求为：8-30个字符，至少包含小写字母、大写字母、数字和字符()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 中的2种，不能以"/"开头。
- 当实例类型**TypeId**为CKV 3.2 内存版标准架构或集群架构时，其密码复杂度为：8-30个字符，必须包含字母和数字，且 不包含其他字符。 
     * @return Password 访问实例的密码。
- 当输入参数**NoAuth**为**true**时，指设置实例为免密码访问，Password可不用配置，否则Password为必填参数。
- 当实例类型**TypeId**为Redis 2.8 内存版标准架构、Redis 4.0、5.0、6.0内存版标准架构或集群架构时，其密码复杂度要求为：8-30个字符，至少包含小写字母、大写字母、数字和字符()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 中的2种，不能以"/"开头。
- 当实例类型**TypeId**为CKV 3.2 内存版标准架构或集群架构时，其密码复杂度为：8-30个字符，必须包含字母和数字，且 不包含其他字符。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 访问实例的密码。
- 当输入参数**NoAuth**为**true**时，指设置实例为免密码访问，Password可不用配置，否则Password为必填参数。
- 当实例类型**TypeId**为Redis 2.8 内存版标准架构、Redis 4.0、5.0、6.0内存版标准架构或集群架构时，其密码复杂度要求为：8-30个字符，至少包含小写字母、大写字母、数字和字符()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 中的2种，不能以"/"开头。
- 当实例类型**TypeId**为CKV 3.2 内存版标准架构或集群架构时，其密码复杂度为：8-30个字符，必须包含字母和数字，且 不包含其他字符。
     * @param Password 访问实例的密码。
- 当输入参数**NoAuth**为**true**时，指设置实例为免密码访问，Password可不用配置，否则Password为必填参数。
- 当实例类型**TypeId**为Redis 2.8 内存版标准架构、Redis 4.0、5.0、6.0内存版标准架构或集群架构时，其密码复杂度要求为：8-30个字符，至少包含小写字母、大写字母、数字和字符()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 中的2种，不能以"/"开头。
- 当实例类型**TypeId**为CKV 3.2 内存版标准架构或集群架构时，其密码复杂度为：8-30个字符，必须包含字母和数字，且 不包含其他字符。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 私有网络ID。如果不配置该参数则默认选择基础网络。请登录 [私有网络](https://console.cloud.tencent.com/vpc)控制台查询具体的ID。 
     * @return VpcId 私有网络ID。如果不配置该参数则默认选择基础网络。请登录 [私有网络](https://console.cloud.tencent.com/vpc)控制台查询具体的ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID。如果不配置该参数则默认选择基础网络。请登录 [私有网络](https://console.cloud.tencent.com/vpc)控制台查询具体的ID。
     * @param VpcId 私有网络ID。如果不配置该参数则默认选择基础网络。请登录 [私有网络](https://console.cloud.tencent.com/vpc)控制台查询具体的ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络VPC的子网。基础网络下， 该参数无需配置。请登录 [私有网络](https://console.cloud.tencent.com/vpc)控制台查询子网列表获取具体的 ID。 
     * @return SubnetId 私有网络VPC的子网。基础网络下， 该参数无需配置。请登录 [私有网络](https://console.cloud.tencent.com/vpc)控制台查询子网列表获取具体的 ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络VPC的子网。基础网络下， 该参数无需配置。请登录 [私有网络](https://console.cloud.tencent.com/vpc)控制台查询子网列表获取具体的 ID。
     * @param SubnetId 私有网络VPC的子网。基础网络下， 该参数无需配置。请登录 [私有网络](https://console.cloud.tencent.com/vpc)控制台查询子网列表获取具体的 ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 项目 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)，在右上角的账户信息菜单中，选择**项目管理**查询项目 ID。 
     * @return ProjectId 项目 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)，在右上角的账户信息菜单中，选择**项目管理**查询项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)，在右上角的账户信息菜单中，选择**项目管理**查询项目 ID。
     * @param ProjectId 项目 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis#/)，在右上角的账户信息菜单中，选择**项目管理**查询项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 自动续费标识。
- 0：默认状态（手动续费）。
- 1：自动续费。
- 2：到期不续费。 
     * @return AutoRenew 自动续费标识。
- 0：默认状态（手动续费）。
- 1：自动续费。
- 2：到期不续费。
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 自动续费标识。
- 0：默认状态（手动续费）。
- 1：自动续费。
- 2：到期不续费。
     * @param AutoRenew 自动续费标识。
- 0：默认状态（手动续费）。
- 1：自动续费。
- 2：到期不续费。
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 安全组 ID 数组。
- 安全组是一种虚拟防火墙，对云数据库实例的网络访问进行控制。创建实例时，建议绑定相应的安全组。
- 请通过 [DescribeInstanceSecurityGroup](https://cloud.tencent.com/document/product/239/34447) 接口获取实例的安全组 ID。 
     * @return SecurityGroupIdList 安全组 ID 数组。
- 安全组是一种虚拟防火墙，对云数据库实例的网络访问进行控制。创建实例时，建议绑定相应的安全组。
- 请通过 [DescribeInstanceSecurityGroup](https://cloud.tencent.com/document/product/239/34447) 接口获取实例的安全组 ID。
     */
    public String [] getSecurityGroupIdList() {
        return this.SecurityGroupIdList;
    }

    /**
     * Set 安全组 ID 数组。
- 安全组是一种虚拟防火墙，对云数据库实例的网络访问进行控制。创建实例时，建议绑定相应的安全组。
- 请通过 [DescribeInstanceSecurityGroup](https://cloud.tencent.com/document/product/239/34447) 接口获取实例的安全组 ID。
     * @param SecurityGroupIdList 安全组 ID 数组。
- 安全组是一种虚拟防火墙，对云数据库实例的网络访问进行控制。创建实例时，建议绑定相应的安全组。
- 请通过 [DescribeInstanceSecurityGroup](https://cloud.tencent.com/document/product/239/34447) 接口获取实例的安全组 ID。
     */
    public void setSecurityGroupIdList(String [] SecurityGroupIdList) {
        this.SecurityGroupIdList = SecurityGroupIdList;
    }

    /**
     * Get 用户自定义的网络端口。默认为6379，范围为 [1024,65535]。 
     * @return VPort 用户自定义的网络端口。默认为6379，范围为 [1024,65535]。
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set 用户自定义的网络端口。默认为6379，范围为 [1024,65535]。
     * @param VPort 用户自定义的网络端口。默认为6379，范围为 [1024,65535]。
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get 实例分片数量。
- 标准版实例无需配置该参数。
- 集群版实例，分片数量范围为：[1、3、5、8、12、16、24、32、40、48、64、80、96、128]。 
     * @return RedisShardNum 实例分片数量。
- 标准版实例无需配置该参数。
- 集群版实例，分片数量范围为：[1、3、5、8、12、16、24、32、40、48、64、80、96、128]。
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set 实例分片数量。
- 标准版实例无需配置该参数。
- 集群版实例，分片数量范围为：[1、3、5、8、12、16、24、32、40、48、64、80、96、128]。
     * @param RedisShardNum 实例分片数量。
- 标准版实例无需配置该参数。
- 集群版实例，分片数量范围为：[1、3、5、8、12、16、24、32、40、48、64、80、96、128]。
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get 实例副本数量。
- Redis 内存版 4.0、5.0、6.2 标准架构和集群架构支持副本数量范围为[1,5]。
- Redis 2.8标准版、CKV标准版只支持1副本。 
     * @return RedisReplicasNum 实例副本数量。
- Redis 内存版 4.0、5.0、6.2 标准架构和集群架构支持副本数量范围为[1,5]。
- Redis 2.8标准版、CKV标准版只支持1副本。
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set 实例副本数量。
- Redis 内存版 4.0、5.0、6.2 标准架构和集群架构支持副本数量范围为[1,5]。
- Redis 2.8标准版、CKV标准版只支持1副本。
     * @param RedisReplicasNum 实例副本数量。
- Redis 内存版 4.0、5.0、6.2 标准架构和集群架构支持副本数量范围为[1,5]。
- Redis 2.8标准版、CKV标准版只支持1副本。
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get 标识实例是否需支持副本只读。
- Redis 2.8 标准版、CKV标准版不支持副本只读。
- 开启副本只读，实例将自动读写分离，写请求路由到主节点，读请求路由到副本节点。
- 如需开启副本只读，建议副本数量大于等于2。 
     * @return ReplicasReadonly 标识实例是否需支持副本只读。
- Redis 2.8 标准版、CKV标准版不支持副本只读。
- 开启副本只读，实例将自动读写分离，写请求路由到主节点，读请求路由到副本节点。
- 如需开启副本只读，建议副本数量大于等于2。
     */
    public Boolean getReplicasReadonly() {
        return this.ReplicasReadonly;
    }

    /**
     * Set 标识实例是否需支持副本只读。
- Redis 2.8 标准版、CKV标准版不支持副本只读。
- 开启副本只读，实例将自动读写分离，写请求路由到主节点，读请求路由到副本节点。
- 如需开启副本只读，建议副本数量大于等于2。
     * @param ReplicasReadonly 标识实例是否需支持副本只读。
- Redis 2.8 标准版、CKV标准版不支持副本只读。
- 开启副本只读，实例将自动读写分离，写请求路由到主节点，读请求路由到副本节点。
- 如需开启副本只读，建议副本数量大于等于2。
     */
    public void setReplicasReadonly(Boolean ReplicasReadonly) {
        this.ReplicasReadonly = ReplicasReadonly;
    }

    /**
     * Get 实例名称。命名要求：仅支持长度小于60的中文、英文或者数字，短划线"-"、下划线"_"。 
     * @return InstanceName 实例名称。命名要求：仅支持长度小于60的中文、英文或者数字，短划线"-"、下划线"_"。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。命名要求：仅支持长度小于60的中文、英文或者数字，短划线"-"、下划线"_"。
     * @param InstanceName 实例名称。命名要求：仅支持长度小于60的中文、英文或者数字，短划线"-"、下划线"_"。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 配置实例是否支持免密码访问。
- true：免密访问实例。
- false：非免密访问实例。默认为非免密方式，仅VPC网络的实例支持免密码访问。 
     * @return NoAuth 配置实例是否支持免密码访问。
- true：免密访问实例。
- false：非免密访问实例。默认为非免密方式，仅VPC网络的实例支持免密码访问。
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set 配置实例是否支持免密码访问。
- true：免密访问实例。
- false：非免密访问实例。默认为非免密方式，仅VPC网络的实例支持免密码访问。
     * @param NoAuth 配置实例是否支持免密码访问。
- true：免密访问实例。
- false：非免密访问实例。默认为非免密方式，仅VPC网络的实例支持免密码访问。
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get 实例的节点信息，包含节点 ID、节点类型、节点可用区 ID等。具体信息，请参见[RedisNodeInfo ](https://cloud.tencent.com/document/product/239/20022)。
目前支持传入节点的类型（主节点或者副本节点），节点的可用区。单可用区部署不需要传递此参数。 
     * @return NodeSet 实例的节点信息，包含节点 ID、节点类型、节点可用区 ID等。具体信息，请参见[RedisNodeInfo ](https://cloud.tencent.com/document/product/239/20022)。
目前支持传入节点的类型（主节点或者副本节点），节点的可用区。单可用区部署不需要传递此参数。
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set 实例的节点信息，包含节点 ID、节点类型、节点可用区 ID等。具体信息，请参见[RedisNodeInfo ](https://cloud.tencent.com/document/product/239/20022)。
目前支持传入节点的类型（主节点或者副本节点），节点的可用区。单可用区部署不需要传递此参数。
     * @param NodeSet 实例的节点信息，包含节点 ID、节点类型、节点可用区 ID等。具体信息，请参见[RedisNodeInfo ](https://cloud.tencent.com/document/product/239/20022)。
目前支持传入节点的类型（主节点或者副本节点），节点的可用区。单可用区部署不需要传递此参数。
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Get 给实例设定标签。 
     * @return ResourceTags 给实例设定标签。
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 给实例设定标签。
     * @param ResourceTags 给实例设定标签。
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 指定实例所属的可用区名称。具体信息，请参见[地域和可用区](https://cloud.tencent.com/document/product/239/4106)  。 
     * @return ZoneName 指定实例所属的可用区名称。具体信息，请参见[地域和可用区](https://cloud.tencent.com/document/product/239/4106)  。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 指定实例所属的可用区名称。具体信息，请参见[地域和可用区](https://cloud.tencent.com/document/product/239/4106)  。
     * @param ZoneName 指定实例所属的可用区名称。具体信息，请参见[地域和可用区](https://cloud.tencent.com/document/product/239/4106)  。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 指定实例相关的参数模板 ID。
- 若不配置该参数，则系统会依据所选择的兼容版本及架构，自动适配对应的默认模板。
- 请通过[DescribeParamTemplates](https://cloud.tencent.com/document/product/239/58750)接口，查询实例的参数模板列表，获取模板 ID 编号。 
     * @return TemplateId 指定实例相关的参数模板 ID。
- 若不配置该参数，则系统会依据所选择的兼容版本及架构，自动适配对应的默认模板。
- 请通过[DescribeParamTemplates](https://cloud.tencent.com/document/product/239/58750)接口，查询实例的参数模板列表，获取模板 ID 编号。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 指定实例相关的参数模板 ID。
- 若不配置该参数，则系统会依据所选择的兼容版本及架构，自动适配对应的默认模板。
- 请通过[DescribeParamTemplates](https://cloud.tencent.com/document/product/239/58750)接口，查询实例的参数模板列表，获取模板 ID 编号。
     * @param TemplateId 指定实例相关的参数模板 ID。
- 若不配置该参数，则系统会依据所选择的兼容版本及架构，自动适配对应的默认模板。
- 请通过[DescribeParamTemplates](https://cloud.tencent.com/document/product/239/58750)接口，查询实例的参数模板列表，获取模板 ID 编号。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 内部参数，标识创建实例是否需要检查。
- false ：默认值。发送正常请求，通过检查后直接创建实例。
- true：发送检查请求，不会创建实例。 
     * @return DryRun 内部参数，标识创建实例是否需要检查。
- false ：默认值。发送正常请求，通过检查后直接创建实例。
- true：发送检查请求，不会创建实例。
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 内部参数，标识创建实例是否需要检查。
- false ：默认值。发送正常请求，通过检查后直接创建实例。
- true：发送检查请求，不会创建实例。
     * @param DryRun 内部参数，标识创建实例是否需要检查。
- false ：默认值。发送正常请求，通过检查后直接创建实例。
- true：发送检查请求，不会创建实例。
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 指定实例的产品版本。
- local：本地盘版。
- cloud：云盘版，
- cdc：独享集群版。如果不传默认发货为本地盘版本。 
     * @return ProductVersion 指定实例的产品版本。
- local：本地盘版。
- cloud：云盘版，
- cdc：独享集群版。如果不传默认发货为本地盘版本。
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set 指定实例的产品版本。
- local：本地盘版。
- cloud：云盘版，
- cdc：独享集群版。如果不传默认发货为本地盘版本。
     * @param ProductVersion 指定实例的产品版本。
- local：本地盘版。
- cloud：云盘版，
- cdc：独享集群版。如果不传默认发货为本地盘版本。
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get 独享集群 ID。当**ProductVersion**设置为**cdc**时，该参数必须设置。 
     * @return RedisClusterId 独享集群 ID。当**ProductVersion**设置为**cdc**时，该参数必须设置。
     */
    public String getRedisClusterId() {
        return this.RedisClusterId;
    }

    /**
     * Set 独享集群 ID。当**ProductVersion**设置为**cdc**时，该参数必须设置。
     * @param RedisClusterId 独享集群 ID。当**ProductVersion**设置为**cdc**时，该参数必须设置。
     */
    public void setRedisClusterId(String RedisClusterId) {
        this.RedisClusterId = RedisClusterId;
    }

    /**
     * Get 告警策略 ID 数组。

- 请登录[腾讯云可观测平台-告警管理-策略管理](https://console.cloud.tencent.com/monitor/alarm/policy)获取告警策略 ID。
- 若不配置该参数，则绑定默认告警策略。默认告警策略具体信息，请登录[腾讯云可观测平台-告警管理-策略管理](https://console.cloud.tencent.com/monitor/alarm/policy)查看。 
     * @return AlarmPolicyList 告警策略 ID 数组。

- 请登录[腾讯云可观测平台-告警管理-策略管理](https://console.cloud.tencent.com/monitor/alarm/policy)获取告警策略 ID。
- 若不配置该参数，则绑定默认告警策略。默认告警策略具体信息，请登录[腾讯云可观测平台-告警管理-策略管理](https://console.cloud.tencent.com/monitor/alarm/policy)查看。
     */
    public String [] getAlarmPolicyList() {
        return this.AlarmPolicyList;
    }

    /**
     * Set 告警策略 ID 数组。

- 请登录[腾讯云可观测平台-告警管理-策略管理](https://console.cloud.tencent.com/monitor/alarm/policy)获取告警策略 ID。
- 若不配置该参数，则绑定默认告警策略。默认告警策略具体信息，请登录[腾讯云可观测平台-告警管理-策略管理](https://console.cloud.tencent.com/monitor/alarm/policy)查看。
     * @param AlarmPolicyList 告警策略 ID 数组。

- 请登录[腾讯云可观测平台-告警管理-策略管理](https://console.cloud.tencent.com/monitor/alarm/policy)获取告警策略 ID。
- 若不配置该参数，则绑定默认告警策略。默认告警策略具体信息，请登录[腾讯云可观测平台-告警管理-策略管理](https://console.cloud.tencent.com/monitor/alarm/policy)查看。
     */
    public void setAlarmPolicyList(String [] AlarmPolicyList) {
        this.AlarmPolicyList = AlarmPolicyList;
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

    }
}

