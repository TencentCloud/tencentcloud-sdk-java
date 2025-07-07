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
package com.tencentcloudapi.mongodb.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBInstanceRequest extends AbstractModel {

    /**
    * 每个副本集内从节点个数
    */
    @SerializedName("SecondaryNum")
    @Expose
    private Long SecondaryNum;

    /**
    * 实例内存大小，单位：GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例硬盘大小，单位：GB
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 指版本信息。具体支持的版本信息 ，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。 - MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。 - MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。 - MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。 - MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。 - MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。 - MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * 机器类型，HIO10G：高IO万兆。
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * 实例数量，默认值为1, 最小值1，最大值为10
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 实例所属区域名称，格式如：ap-guangzhou-2
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 时长，购买月数
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 实例密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 项目ID，不填为默认项目
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 安全组参数
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * 私有网络ID，如果不传则默认选择基础网络
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 实例类型，REPLSET-副本集，SHARD-分片集群，默认为REPLSET
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get 每个副本集内从节点个数 
     * @return SecondaryNum 每个副本集内从节点个数
     */
    public Long getSecondaryNum() {
        return this.SecondaryNum;
    }

    /**
     * Set 每个副本集内从节点个数
     * @param SecondaryNum 每个副本集内从节点个数
     */
    public void setSecondaryNum(Long SecondaryNum) {
        this.SecondaryNum = SecondaryNum;
    }

    /**
     * Get 实例内存大小，单位：GB 
     * @return Memory 实例内存大小，单位：GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小，单位：GB
     * @param Memory 实例内存大小，单位：GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例硬盘大小，单位：GB 
     * @return Volume 实例硬盘大小，单位：GB
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 实例硬盘大小，单位：GB
     * @param Volume 实例硬盘大小，单位：GB
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 指版本信息。具体支持的版本信息 ，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。 - MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。 - MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。 - MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。 - MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。 - MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。 - MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。 
     * @return MongoVersion 指版本信息。具体支持的版本信息 ，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。 - MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。 - MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。 - MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。 - MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。 - MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。 - MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set 指版本信息。具体支持的版本信息 ，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。 - MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。 - MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。 - MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。 - MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。 - MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。 - MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
     * @param MongoVersion 指版本信息。具体支持的版本信息 ，请通过接口 [DescribeSpecInfo](https://cloud.tencent.com/document/product/240/38567) 获取。 - MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本。 - MONGO_40_WT：MongoDB 4.0 WiredTiger存储引擎版本。 - MONGO_42_WT：MongoDB 4.2 WiredTiger存储引擎版本。 - MONGO_44_WT：MongoDB 4.4 WiredTiger存储引擎版本。 - MONGO_50_WT：MongoDB 5.0 WiredTiger存储引擎版本。 - MONGO_60_WT：MongoDB 6.0 WiredTiger存储引擎版本。
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get 机器类型，HIO10G：高IO万兆。 
     * @return MachineCode 机器类型，HIO10G：高IO万兆。
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set 机器类型，HIO10G：高IO万兆。
     * @param MachineCode 机器类型，HIO10G：高IO万兆。
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    /**
     * Get 实例数量，默认值为1, 最小值1，最大值为10 
     * @return GoodsNum 实例数量，默认值为1, 最小值1，最大值为10
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 实例数量，默认值为1, 最小值1，最大值为10
     * @param GoodsNum 实例数量，默认值为1, 最小值1，最大值为10
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 实例所属区域名称，格式如：ap-guangzhou-2 
     * @return Zone 实例所属区域名称，格式如：ap-guangzhou-2
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例所属区域名称，格式如：ap-guangzhou-2
     * @param Zone 实例所属区域名称，格式如：ap-guangzhou-2
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 时长，购买月数 
     * @return TimeSpan 时长，购买月数
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 时长，购买月数
     * @param TimeSpan 时长，购买月数
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 实例密码 
     * @return Password 实例密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 实例密码
     * @param Password 实例密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 项目ID，不填为默认项目 
     * @return ProjectId 项目ID，不填为默认项目
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，不填为默认项目
     * @param ProjectId 项目ID，不填为默认项目
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 安全组参数 
     * @return SecurityGroup 安全组参数
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 安全组参数
     * @param SecurityGroup 安全组参数
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get 私有网络ID，如果不传则默认选择基础网络 
     * @return UniqVpcId 私有网络ID，如果不传则默认选择基础网络
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 私有网络ID，如果不传则默认选择基础网络
     * @param UniqVpcId 私有网络ID，如果不传则默认选择基础网络
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填 
     * @return UniqSubnetId 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     * @param UniqSubnetId 私有网络下的子网ID，如果设置了 VpcId，则 SubnetId必填
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 实例类型，REPLSET-副本集，SHARD-分片集群，默认为REPLSET 
     * @return InstanceType 实例类型，REPLSET-副本集，SHARD-分片集群，默认为REPLSET
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型，REPLSET-副本集，SHARD-分片集群，默认为REPLSET
     * @param InstanceType 实例类型，REPLSET-副本集，SHARD-分片集群，默认为REPLSET
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public CreateDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBInstanceRequest(CreateDBInstanceRequest source) {
        if (source.SecondaryNum != null) {
            this.SecondaryNum = new Long(source.SecondaryNum);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String(source.MongoVersion);
        }
        if (source.MachineCode != null) {
            this.MachineCode = new String(source.MachineCode);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecondaryNum", this.SecondaryNum);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

