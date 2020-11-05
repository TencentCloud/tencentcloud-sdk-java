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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancesRequest extends AbstractModel{

    /**
    * 实例所属的可用区ID，可参考[地域和可用区](https://cloud.tencent.com/document/product/239/4106)  。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 实例类型：2 – Redis2.8内存版(标准架构)，3 – CKV 3.2内存版(标准架构)，4 – CKV 3.2内存版(集群架构)，6 – Redis4.0内存版(标准架构)，7 – Redis4.0内存版(集群架构)，8 – Redis5.0内存版(标准架构)，9 – Redis5.0内存版(集群架构)。
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * 内存容量，单位为MB， 数值需为1024的整数倍，具体规格以 [查询产品售卖规格](https://cloud.tencent.com/document/api/239/30600) 返回的规格为准。
TypeId为标准架构时，MemSize是实例总内存容量；TypeId为集群架构时，MemSize是单分片内存容量。
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 实例数量，单次购买实例数量以 [查询产品售卖规格](https://cloud.tencent.com/document/api/239/30600) 返回的规格为准。
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 购买时长，在创建包年包月实例的时候需要填写，按量计费实例填1即可，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 付费方式:0-按量计费，1-包年包月。
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * 实例密码，当输入参数NoAuth为true且使用私有网络VPC时，Password为非必填，否则Password为必填参数。
当实例类型TypeId为Redis2.8、4.0和5.0时，其密码格式为：8-30个字符，至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 中的2种，不能以"/"开头；
当实例类型TypeId为CKV 3.2时，其密码格式为：8-30个字符，必须包含字母和数字 且 不包含其他字符。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 私有网络ID，如果不传则默认选择基础网络，请使用私有网络列表查询，如：vpc-sad23jfdfk。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 基础网络下， subnetId无效； vpc子网下，取值以查询子网列表，如：subnet-fdj24n34j2。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 项目id，取值以用户账户>用户账户相关接口查询>项目列表返回的projectId为准。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 自动续费标识。0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费。
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * 安全组id数组。
    */
    @SerializedName("SecurityGroupIdList")
    @Expose
    private String [] SecurityGroupIdList;

    /**
    * 用户自定义的端口 不填则默认为6379，范围[1024,65535]。
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * 实例分片数量，购买标准版实例不需要填写，集群版分片数量范围[3,5,8,12,16,24,32,64,96,128]。
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * 实例副本数量，Redis 2.8标准版、CKV标准版只支持1副本，4.0、5.0标准版和集群版支持1-5个副本。
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * 是否支持副本只读，Redis 2.8标准版、CKV标准版不支持副本只读，开启副本只读，实例将自动读写分离，写请求路由到主节点，读请求路由到副本节点，如需开启副本只读建议副本数>=2。
    */
    @SerializedName("ReplicasReadonly")
    @Expose
    private Boolean ReplicasReadonly;

    /**
    * 实例名称，长度小于60的中文/英文/数字/"-"/"_"。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 是否支持免密，true-免密实例，false-非免密实例，默认为非免密实例，仅VPC网络的实例支持免密码访问。
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
    * 实例的节点信息，目前支持传入节点的类型（主节点或者副本节点），节点的可用区。单可用区部署不需要传递此参数。
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

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
     * Get 实例类型：2 – Redis2.8内存版(标准架构)，3 – CKV 3.2内存版(标准架构)，4 – CKV 3.2内存版(集群架构)，6 – Redis4.0内存版(标准架构)，7 – Redis4.0内存版(集群架构)，8 – Redis5.0内存版(标准架构)，9 – Redis5.0内存版(集群架构)。 
     * @return TypeId 实例类型：2 – Redis2.8内存版(标准架构)，3 – CKV 3.2内存版(标准架构)，4 – CKV 3.2内存版(集群架构)，6 – Redis4.0内存版(标准架构)，7 – Redis4.0内存版(集群架构)，8 – Redis5.0内存版(标准架构)，9 – Redis5.0内存版(集群架构)。
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 实例类型：2 – Redis2.8内存版(标准架构)，3 – CKV 3.2内存版(标准架构)，4 – CKV 3.2内存版(集群架构)，6 – Redis4.0内存版(标准架构)，7 – Redis4.0内存版(集群架构)，8 – Redis5.0内存版(标准架构)，9 – Redis5.0内存版(集群架构)。
     * @param TypeId 实例类型：2 – Redis2.8内存版(标准架构)，3 – CKV 3.2内存版(标准架构)，4 – CKV 3.2内存版(集群架构)，6 – Redis4.0内存版(标准架构)，7 – Redis4.0内存版(集群架构)，8 – Redis5.0内存版(标准架构)，9 – Redis5.0内存版(集群架构)。
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get 内存容量，单位为MB， 数值需为1024的整数倍，具体规格以 [查询产品售卖规格](https://cloud.tencent.com/document/api/239/30600) 返回的规格为准。
TypeId为标准架构时，MemSize是实例总内存容量；TypeId为集群架构时，MemSize是单分片内存容量。 
     * @return MemSize 内存容量，单位为MB， 数值需为1024的整数倍，具体规格以 [查询产品售卖规格](https://cloud.tencent.com/document/api/239/30600) 返回的规格为准。
TypeId为标准架构时，MemSize是实例总内存容量；TypeId为集群架构时，MemSize是单分片内存容量。
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 内存容量，单位为MB， 数值需为1024的整数倍，具体规格以 [查询产品售卖规格](https://cloud.tencent.com/document/api/239/30600) 返回的规格为准。
TypeId为标准架构时，MemSize是实例总内存容量；TypeId为集群架构时，MemSize是单分片内存容量。
     * @param MemSize 内存容量，单位为MB， 数值需为1024的整数倍，具体规格以 [查询产品售卖规格](https://cloud.tencent.com/document/api/239/30600) 返回的规格为准。
TypeId为标准架构时，MemSize是实例总内存容量；TypeId为集群架构时，MemSize是单分片内存容量。
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 实例数量，单次购买实例数量以 [查询产品售卖规格](https://cloud.tencent.com/document/api/239/30600) 返回的规格为准。 
     * @return GoodsNum 实例数量，单次购买实例数量以 [查询产品售卖规格](https://cloud.tencent.com/document/api/239/30600) 返回的规格为准。
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 实例数量，单次购买实例数量以 [查询产品售卖规格](https://cloud.tencent.com/document/api/239/30600) 返回的规格为准。
     * @param GoodsNum 实例数量，单次购买实例数量以 [查询产品售卖规格](https://cloud.tencent.com/document/api/239/30600) 返回的规格为准。
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 购买时长，在创建包年包月实例的时候需要填写，按量计费实例填1即可，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。 
     * @return Period 购买时长，在创建包年包月实例的时候需要填写，按量计费实例填1即可，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买时长，在创建包年包月实例的时候需要填写，按量计费实例填1即可，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
     * @param Period 购买时长，在创建包年包月实例的时候需要填写，按量计费实例填1即可，单位：月，取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 付费方式:0-按量计费，1-包年包月。 
     * @return BillingMode 付费方式:0-按量计费，1-包年包月。
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set 付费方式:0-按量计费，1-包年包月。
     * @param BillingMode 付费方式:0-按量计费，1-包年包月。
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get 实例密码，当输入参数NoAuth为true且使用私有网络VPC时，Password为非必填，否则Password为必填参数。
当实例类型TypeId为Redis2.8、4.0和5.0时，其密码格式为：8-30个字符，至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 中的2种，不能以"/"开头；
当实例类型TypeId为CKV 3.2时，其密码格式为：8-30个字符，必须包含字母和数字 且 不包含其他字符。 
     * @return Password 实例密码，当输入参数NoAuth为true且使用私有网络VPC时，Password为非必填，否则Password为必填参数。
当实例类型TypeId为Redis2.8、4.0和5.0时，其密码格式为：8-30个字符，至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 中的2种，不能以"/"开头；
当实例类型TypeId为CKV 3.2时，其密码格式为：8-30个字符，必须包含字母和数字 且 不包含其他字符。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 实例密码，当输入参数NoAuth为true且使用私有网络VPC时，Password为非必填，否则Password为必填参数。
当实例类型TypeId为Redis2.8、4.0和5.0时，其密码格式为：8-30个字符，至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 中的2种，不能以"/"开头；
当实例类型TypeId为CKV 3.2时，其密码格式为：8-30个字符，必须包含字母和数字 且 不包含其他字符。
     * @param Password 实例密码，当输入参数NoAuth为true且使用私有网络VPC时，Password为非必填，否则Password为必填参数。
当实例类型TypeId为Redis2.8、4.0和5.0时，其密码格式为：8-30个字符，至少包含小写字母、大写字母、数字和字符 ()`~!@#$%^&*-+=_|{}[]:;<>,.?/ 中的2种，不能以"/"开头；
当实例类型TypeId为CKV 3.2时，其密码格式为：8-30个字符，必须包含字母和数字 且 不包含其他字符。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 私有网络ID，如果不传则默认选择基础网络，请使用私有网络列表查询，如：vpc-sad23jfdfk。 
     * @return VpcId 私有网络ID，如果不传则默认选择基础网络，请使用私有网络列表查询，如：vpc-sad23jfdfk。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID，如果不传则默认选择基础网络，请使用私有网络列表查询，如：vpc-sad23jfdfk。
     * @param VpcId 私有网络ID，如果不传则默认选择基础网络，请使用私有网络列表查询，如：vpc-sad23jfdfk。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 基础网络下， subnetId无效； vpc子网下，取值以查询子网列表，如：subnet-fdj24n34j2。 
     * @return SubnetId 基础网络下， subnetId无效； vpc子网下，取值以查询子网列表，如：subnet-fdj24n34j2。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 基础网络下， subnetId无效； vpc子网下，取值以查询子网列表，如：subnet-fdj24n34j2。
     * @param SubnetId 基础网络下， subnetId无效； vpc子网下，取值以查询子网列表，如：subnet-fdj24n34j2。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 项目id，取值以用户账户>用户账户相关接口查询>项目列表返回的projectId为准。 
     * @return ProjectId 项目id，取值以用户账户>用户账户相关接口查询>项目列表返回的projectId为准。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id，取值以用户账户>用户账户相关接口查询>项目列表返回的projectId为准。
     * @param ProjectId 项目id，取值以用户账户>用户账户相关接口查询>项目列表返回的projectId为准。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 自动续费标识。0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费。 
     * @return AutoRenew 自动续费标识。0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费。
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 自动续费标识。0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费。
     * @param AutoRenew 自动续费标识。0 - 默认状态（手动续费）；1 - 自动续费；2 - 明确不自动续费。
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 安全组id数组。 
     * @return SecurityGroupIdList 安全组id数组。
     */
    public String [] getSecurityGroupIdList() {
        return this.SecurityGroupIdList;
    }

    /**
     * Set 安全组id数组。
     * @param SecurityGroupIdList 安全组id数组。
     */
    public void setSecurityGroupIdList(String [] SecurityGroupIdList) {
        this.SecurityGroupIdList = SecurityGroupIdList;
    }

    /**
     * Get 用户自定义的端口 不填则默认为6379，范围[1024,65535]。 
     * @return VPort 用户自定义的端口 不填则默认为6379，范围[1024,65535]。
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set 用户自定义的端口 不填则默认为6379，范围[1024,65535]。
     * @param VPort 用户自定义的端口 不填则默认为6379，范围[1024,65535]。
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get 实例分片数量，购买标准版实例不需要填写，集群版分片数量范围[3,5,8,12,16,24,32,64,96,128]。 
     * @return RedisShardNum 实例分片数量，购买标准版实例不需要填写，集群版分片数量范围[3,5,8,12,16,24,32,64,96,128]。
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set 实例分片数量，购买标准版实例不需要填写，集群版分片数量范围[3,5,8,12,16,24,32,64,96,128]。
     * @param RedisShardNum 实例分片数量，购买标准版实例不需要填写，集群版分片数量范围[3,5,8,12,16,24,32,64,96,128]。
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get 实例副本数量，Redis 2.8标准版、CKV标准版只支持1副本，4.0、5.0标准版和集群版支持1-5个副本。 
     * @return RedisReplicasNum 实例副本数量，Redis 2.8标准版、CKV标准版只支持1副本，4.0、5.0标准版和集群版支持1-5个副本。
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set 实例副本数量，Redis 2.8标准版、CKV标准版只支持1副本，4.0、5.0标准版和集群版支持1-5个副本。
     * @param RedisReplicasNum 实例副本数量，Redis 2.8标准版、CKV标准版只支持1副本，4.0、5.0标准版和集群版支持1-5个副本。
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get 是否支持副本只读，Redis 2.8标准版、CKV标准版不支持副本只读，开启副本只读，实例将自动读写分离，写请求路由到主节点，读请求路由到副本节点，如需开启副本只读建议副本数>=2。 
     * @return ReplicasReadonly 是否支持副本只读，Redis 2.8标准版、CKV标准版不支持副本只读，开启副本只读，实例将自动读写分离，写请求路由到主节点，读请求路由到副本节点，如需开启副本只读建议副本数>=2。
     */
    public Boolean getReplicasReadonly() {
        return this.ReplicasReadonly;
    }

    /**
     * Set 是否支持副本只读，Redis 2.8标准版、CKV标准版不支持副本只读，开启副本只读，实例将自动读写分离，写请求路由到主节点，读请求路由到副本节点，如需开启副本只读建议副本数>=2。
     * @param ReplicasReadonly 是否支持副本只读，Redis 2.8标准版、CKV标准版不支持副本只读，开启副本只读，实例将自动读写分离，写请求路由到主节点，读请求路由到副本节点，如需开启副本只读建议副本数>=2。
     */
    public void setReplicasReadonly(Boolean ReplicasReadonly) {
        this.ReplicasReadonly = ReplicasReadonly;
    }

    /**
     * Get 实例名称，长度小于60的中文/英文/数字/"-"/"_"。 
     * @return InstanceName 实例名称，长度小于60的中文/英文/数字/"-"/"_"。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称，长度小于60的中文/英文/数字/"-"/"_"。
     * @param InstanceName 实例名称，长度小于60的中文/英文/数字/"-"/"_"。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 是否支持免密，true-免密实例，false-非免密实例，默认为非免密实例，仅VPC网络的实例支持免密码访问。 
     * @return NoAuth 是否支持免密，true-免密实例，false-非免密实例，默认为非免密实例，仅VPC网络的实例支持免密码访问。
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set 是否支持免密，true-免密实例，false-非免密实例，默认为非免密实例，仅VPC网络的实例支持免密码访问。
     * @param NoAuth 是否支持免密，true-免密实例，false-非免密实例，默认为非免密实例，仅VPC网络的实例支持免密码访问。
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Get 实例的节点信息，目前支持传入节点的类型（主节点或者副本节点），节点的可用区。单可用区部署不需要传递此参数。 
     * @return NodeSet 实例的节点信息，目前支持传入节点的类型（主节点或者副本节点），节点的可用区。单可用区部署不需要传递此参数。
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set 实例的节点信息，目前支持传入节点的类型（主节点或者副本节点），节点的可用区。单可用区部署不需要传递此参数。
     * @param NodeSet 实例的节点信息，目前支持传入节点的类型（主节点或者副本节点），节点的可用区。单可用区部署不需要传递此参数。
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
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

    }
}

