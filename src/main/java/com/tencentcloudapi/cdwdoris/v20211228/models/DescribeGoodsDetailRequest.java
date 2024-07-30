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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGoodsDetailRequest extends AbstractModel {

    /**
    * 操作类型，“CREATE"表示创建、”MODIFY"表示变更配置、“RENEW"表示续费
    */
    @SerializedName("Case")
    @Expose
    private String Case;

    /**
    * 可用区，例如"ap-guangzhou-3"表示广州三区等
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 集群的高可用标记，true表示为高可用集群
    */
    @SerializedName("HaFlag")
    @Expose
    private Boolean HaFlag;

    /**
    * 高可用类型： 0：非高可用 1：读高可用 2：读写高可用。	
    */
    @SerializedName("HaType")
    @Expose
    private Long HaType;

    /**
    * 用户集群的私有网络
    */
    @SerializedName("UserVPCId")
    @Expose
    private String UserVPCId;

    /**
    * 用户集群的子网
    */
    @SerializedName("UserSubnetId")
    @Expose
    private String UserSubnetId;

    /**
    * 用户集群的版本，例如“20.7.2.30”等
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * 集群ID，创建时为空，其他情况必须存在
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集群资源规格描述
    */
    @SerializedName("Resources")
    @Expose
    private ResourceNodeSpec [] Resources;

    /**
    * 集群规格修改参数
    */
    @SerializedName("ModifySpec")
    @Expose
    private ResourceNodeSpec ModifySpec;

    /**
    * 计费信息
    */
    @SerializedName("ChargeProperties")
    @Expose
    private ChargeProperties ChargeProperties;

    /**
    * 创建集群时需要填写InstanceName
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 购买页填写的标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * CLS日志集ID
    */
    @SerializedName("ClsLogSetId")
    @Expose
    private String ClsLogSetId;

    /**
    * 用户子网剩余ip数量
    */
    @SerializedName("UserSubnetIPNum")
    @Expose
    private Long UserSubnetIPNum;

    /**
    * COS桶名称
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * 按量计费转包年包月
    */
    @SerializedName("HourToPrepaid")
    @Expose
    private Boolean HourToPrepaid;

    /**
    * base64密码
    */
    @SerializedName("DorisUserPwd")
    @Expose
    private String DorisUserPwd;

    /**
    * 日志的类型，es或者cls_topic
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 表名大小写是否敏感，0：敏感；1：不敏感，表名改为以小写存储；2：不敏感，以小写进行比较
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Long CaseSensitive;

    /**
    * true为滚动重启 false为批量重启
    */
    @SerializedName("RollingRestart")
    @Expose
    private Boolean RollingRestart;

    /**
    * 是否为多可用区
    */
    @SerializedName("EnableMultiZones")
    @Expose
    private Boolean EnableMultiZones;

    /**
    * 用户多可用区的网络信息
    */
    @SerializedName("UserMultiZoneInfos")
    @Expose
    private NetworkInfo [] UserMultiZoneInfos;

    /**
    * 扩展字段
    */
    @SerializedName("Details")
    @Expose
    private InstanceDetail Details;

    /**
     * Get 操作类型，“CREATE"表示创建、”MODIFY"表示变更配置、“RENEW"表示续费 
     * @return Case 操作类型，“CREATE"表示创建、”MODIFY"表示变更配置、“RENEW"表示续费
     */
    public String getCase() {
        return this.Case;
    }

    /**
     * Set 操作类型，“CREATE"表示创建、”MODIFY"表示变更配置、“RENEW"表示续费
     * @param Case 操作类型，“CREATE"表示创建、”MODIFY"表示变更配置、“RENEW"表示续费
     */
    public void setCase(String Case) {
        this.Case = Case;
    }

    /**
     * Get 可用区，例如"ap-guangzhou-3"表示广州三区等 
     * @return Zone 可用区，例如"ap-guangzhou-3"表示广州三区等
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区，例如"ap-guangzhou-3"表示广州三区等
     * @param Zone 可用区，例如"ap-guangzhou-3"表示广州三区等
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 集群的高可用标记，true表示为高可用集群 
     * @return HaFlag 集群的高可用标记，true表示为高可用集群
     */
    public Boolean getHaFlag() {
        return this.HaFlag;
    }

    /**
     * Set 集群的高可用标记，true表示为高可用集群
     * @param HaFlag 集群的高可用标记，true表示为高可用集群
     */
    public void setHaFlag(Boolean HaFlag) {
        this.HaFlag = HaFlag;
    }

    /**
     * Get 高可用类型： 0：非高可用 1：读高可用 2：读写高可用。	 
     * @return HaType 高可用类型： 0：非高可用 1：读高可用 2：读写高可用。	
     */
    public Long getHaType() {
        return this.HaType;
    }

    /**
     * Set 高可用类型： 0：非高可用 1：读高可用 2：读写高可用。	
     * @param HaType 高可用类型： 0：非高可用 1：读高可用 2：读写高可用。	
     */
    public void setHaType(Long HaType) {
        this.HaType = HaType;
    }

    /**
     * Get 用户集群的私有网络 
     * @return UserVPCId 用户集群的私有网络
     */
    public String getUserVPCId() {
        return this.UserVPCId;
    }

    /**
     * Set 用户集群的私有网络
     * @param UserVPCId 用户集群的私有网络
     */
    public void setUserVPCId(String UserVPCId) {
        this.UserVPCId = UserVPCId;
    }

    /**
     * Get 用户集群的子网 
     * @return UserSubnetId 用户集群的子网
     */
    public String getUserSubnetId() {
        return this.UserSubnetId;
    }

    /**
     * Set 用户集群的子网
     * @param UserSubnetId 用户集群的子网
     */
    public void setUserSubnetId(String UserSubnetId) {
        this.UserSubnetId = UserSubnetId;
    }

    /**
     * Get 用户集群的版本，例如“20.7.2.30”等 
     * @return ProductVersion 用户集群的版本，例如“20.7.2.30”等
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set 用户集群的版本，例如“20.7.2.30”等
     * @param ProductVersion 用户集群的版本，例如“20.7.2.30”等
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get 集群ID，创建时为空，其他情况必须存在 
     * @return InstanceId 集群ID，创建时为空，其他情况必须存在
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID，创建时为空，其他情况必须存在
     * @param InstanceId 集群ID，创建时为空，其他情况必须存在
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集群资源规格描述 
     * @return Resources 集群资源规格描述
     */
    public ResourceNodeSpec [] getResources() {
        return this.Resources;
    }

    /**
     * Set 集群资源规格描述
     * @param Resources 集群资源规格描述
     */
    public void setResources(ResourceNodeSpec [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 集群规格修改参数 
     * @return ModifySpec 集群规格修改参数
     */
    public ResourceNodeSpec getModifySpec() {
        return this.ModifySpec;
    }

    /**
     * Set 集群规格修改参数
     * @param ModifySpec 集群规格修改参数
     */
    public void setModifySpec(ResourceNodeSpec ModifySpec) {
        this.ModifySpec = ModifySpec;
    }

    /**
     * Get 计费信息 
     * @return ChargeProperties 计费信息
     */
    public ChargeProperties getChargeProperties() {
        return this.ChargeProperties;
    }

    /**
     * Set 计费信息
     * @param ChargeProperties 计费信息
     */
    public void setChargeProperties(ChargeProperties ChargeProperties) {
        this.ChargeProperties = ChargeProperties;
    }

    /**
     * Get 创建集群时需要填写InstanceName 
     * @return InstanceName 创建集群时需要填写InstanceName
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 创建集群时需要填写InstanceName
     * @param InstanceName 创建集群时需要填写InstanceName
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 购买页填写的标签列表 
     * @return Tags 购买页填写的标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 购买页填写的标签列表
     * @param Tags 购买页填写的标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get CLS日志集ID 
     * @return ClsLogSetId CLS日志集ID
     */
    public String getClsLogSetId() {
        return this.ClsLogSetId;
    }

    /**
     * Set CLS日志集ID
     * @param ClsLogSetId CLS日志集ID
     */
    public void setClsLogSetId(String ClsLogSetId) {
        this.ClsLogSetId = ClsLogSetId;
    }

    /**
     * Get 用户子网剩余ip数量 
     * @return UserSubnetIPNum 用户子网剩余ip数量
     */
    public Long getUserSubnetIPNum() {
        return this.UserSubnetIPNum;
    }

    /**
     * Set 用户子网剩余ip数量
     * @param UserSubnetIPNum 用户子网剩余ip数量
     */
    public void setUserSubnetIPNum(Long UserSubnetIPNum) {
        this.UserSubnetIPNum = UserSubnetIPNum;
    }

    /**
     * Get COS桶名称 
     * @return CosBucketName COS桶名称
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set COS桶名称
     * @param CosBucketName COS桶名称
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get 按量计费转包年包月 
     * @return HourToPrepaid 按量计费转包年包月
     */
    public Boolean getHourToPrepaid() {
        return this.HourToPrepaid;
    }

    /**
     * Set 按量计费转包年包月
     * @param HourToPrepaid 按量计费转包年包月
     */
    public void setHourToPrepaid(Boolean HourToPrepaid) {
        this.HourToPrepaid = HourToPrepaid;
    }

    /**
     * Get base64密码 
     * @return DorisUserPwd base64密码
     */
    public String getDorisUserPwd() {
        return this.DorisUserPwd;
    }

    /**
     * Set base64密码
     * @param DorisUserPwd base64密码
     */
    public void setDorisUserPwd(String DorisUserPwd) {
        this.DorisUserPwd = DorisUserPwd;
    }

    /**
     * Get 日志的类型，es或者cls_topic 
     * @return LogType 日志的类型，es或者cls_topic
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志的类型，es或者cls_topic
     * @param LogType 日志的类型，es或者cls_topic
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 表名大小写是否敏感，0：敏感；1：不敏感，表名改为以小写存储；2：不敏感，以小写进行比较 
     * @return CaseSensitive 表名大小写是否敏感，0：敏感；1：不敏感，表名改为以小写存储；2：不敏感，以小写进行比较
     */
    public Long getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set 表名大小写是否敏感，0：敏感；1：不敏感，表名改为以小写存储；2：不敏感，以小写进行比较
     * @param CaseSensitive 表名大小写是否敏感，0：敏感；1：不敏感，表名改为以小写存储；2：不敏感，以小写进行比较
     */
    public void setCaseSensitive(Long CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get true为滚动重启 false为批量重启 
     * @return RollingRestart true为滚动重启 false为批量重启
     */
    public Boolean getRollingRestart() {
        return this.RollingRestart;
    }

    /**
     * Set true为滚动重启 false为批量重启
     * @param RollingRestart true为滚动重启 false为批量重启
     */
    public void setRollingRestart(Boolean RollingRestart) {
        this.RollingRestart = RollingRestart;
    }

    /**
     * Get 是否为多可用区 
     * @return EnableMultiZones 是否为多可用区
     */
    public Boolean getEnableMultiZones() {
        return this.EnableMultiZones;
    }

    /**
     * Set 是否为多可用区
     * @param EnableMultiZones 是否为多可用区
     */
    public void setEnableMultiZones(Boolean EnableMultiZones) {
        this.EnableMultiZones = EnableMultiZones;
    }

    /**
     * Get 用户多可用区的网络信息 
     * @return UserMultiZoneInfos 用户多可用区的网络信息
     */
    public NetworkInfo [] getUserMultiZoneInfos() {
        return this.UserMultiZoneInfos;
    }

    /**
     * Set 用户多可用区的网络信息
     * @param UserMultiZoneInfos 用户多可用区的网络信息
     */
    public void setUserMultiZoneInfos(NetworkInfo [] UserMultiZoneInfos) {
        this.UserMultiZoneInfos = UserMultiZoneInfos;
    }

    /**
     * Get 扩展字段 
     * @return Details 扩展字段
     */
    public InstanceDetail getDetails() {
        return this.Details;
    }

    /**
     * Set 扩展字段
     * @param Details 扩展字段
     */
    public void setDetails(InstanceDetail Details) {
        this.Details = Details;
    }

    public DescribeGoodsDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGoodsDetailRequest(DescribeGoodsDetailRequest source) {
        if (source.Case != null) {
            this.Case = new String(source.Case);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.HaFlag != null) {
            this.HaFlag = new Boolean(source.HaFlag);
        }
        if (source.HaType != null) {
            this.HaType = new Long(source.HaType);
        }
        if (source.UserVPCId != null) {
            this.UserVPCId = new String(source.UserVPCId);
        }
        if (source.UserSubnetId != null) {
            this.UserSubnetId = new String(source.UserSubnetId);
        }
        if (source.ProductVersion != null) {
            this.ProductVersion = new String(source.ProductVersion);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Resources != null) {
            this.Resources = new ResourceNodeSpec[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new ResourceNodeSpec(source.Resources[i]);
            }
        }
        if (source.ModifySpec != null) {
            this.ModifySpec = new ResourceNodeSpec(source.ModifySpec);
        }
        if (source.ChargeProperties != null) {
            this.ChargeProperties = new ChargeProperties(source.ChargeProperties);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ClsLogSetId != null) {
            this.ClsLogSetId = new String(source.ClsLogSetId);
        }
        if (source.UserSubnetIPNum != null) {
            this.UserSubnetIPNum = new Long(source.UserSubnetIPNum);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.HourToPrepaid != null) {
            this.HourToPrepaid = new Boolean(source.HourToPrepaid);
        }
        if (source.DorisUserPwd != null) {
            this.DorisUserPwd = new String(source.DorisUserPwd);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.CaseSensitive != null) {
            this.CaseSensitive = new Long(source.CaseSensitive);
        }
        if (source.RollingRestart != null) {
            this.RollingRestart = new Boolean(source.RollingRestart);
        }
        if (source.EnableMultiZones != null) {
            this.EnableMultiZones = new Boolean(source.EnableMultiZones);
        }
        if (source.UserMultiZoneInfos != null) {
            this.UserMultiZoneInfos = new NetworkInfo[source.UserMultiZoneInfos.length];
            for (int i = 0; i < source.UserMultiZoneInfos.length; i++) {
                this.UserMultiZoneInfos[i] = new NetworkInfo(source.UserMultiZoneInfos[i]);
            }
        }
        if (source.Details != null) {
            this.Details = new InstanceDetail(source.Details);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Case", this.Case);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "HaFlag", this.HaFlag);
        this.setParamSimple(map, prefix + "HaType", this.HaType);
        this.setParamSimple(map, prefix + "UserVPCId", this.UserVPCId);
        this.setParamSimple(map, prefix + "UserSubnetId", this.UserSubnetId);
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamObj(map, prefix + "ModifySpec.", this.ModifySpec);
        this.setParamObj(map, prefix + "ChargeProperties.", this.ChargeProperties);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ClsLogSetId", this.ClsLogSetId);
        this.setParamSimple(map, prefix + "UserSubnetIPNum", this.UserSubnetIPNum);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "HourToPrepaid", this.HourToPrepaid);
        this.setParamSimple(map, prefix + "DorisUserPwd", this.DorisUserPwd);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "CaseSensitive", this.CaseSensitive);
        this.setParamSimple(map, prefix + "RollingRestart", this.RollingRestart);
        this.setParamSimple(map, prefix + "EnableMultiZones", this.EnableMultiZones);
        this.setParamArrayObj(map, prefix + "UserMultiZoneInfos.", this.UserMultiZoneInfos);
        this.setParamObj(map, prefix + "Details.", this.Details);

    }
}

