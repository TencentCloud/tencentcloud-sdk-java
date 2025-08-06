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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceNewRequest extends AbstractModel {

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 是否高可用
    */
    @SerializedName("HaFlag")
    @Expose
    private Boolean HaFlag;

    /**
    * 私有网络
    */
    @SerializedName("UserVPCId")
    @Expose
    private String UserVPCId;

    /**
    * 子网
    */
    @SerializedName("UserSubnetId")
    @Expose
    private String UserSubnetId;

    /**
    * 系统版本
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * 计费方式
    */
    @SerializedName("ChargeProperties")
    @Expose
    private Charge ChargeProperties;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 数据节点
SpecName从DescribeSpec接口中返回的DataSpec.Name获取
    */
    @SerializedName("DataSpec")
    @Expose
    private NodeSpec DataSpec;

    /**
    * 标签列表（废弃）
    */
    @SerializedName("Tags")
    @Expose
    private Tag Tags;

    /**
    * 日志主题ID
    */
    @SerializedName("ClsLogSetId")
    @Expose
    private String ClsLogSetId;

    /**
    * COS桶名称
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * 是否是裸盘挂载，默认值 0 为 未挂载，1 为挂载。
    */
    @SerializedName("MountDiskType")
    @Expose
    private Long MountDiskType;

    /**
    * 是否是ZK高可用
    */
    @SerializedName("HAZk")
    @Expose
    private Boolean HAZk;

    /**
    * ZK节点SpecName从DescribeSpec接口中返回的CommonSpec结构体的Name（ZK节点）获取
    */
    @SerializedName("CommonSpec")
    @Expose
    private NodeSpec CommonSpec;

    /**
    * 标签列表
    */
    @SerializedName("TagItems")
    @Expose
    private Tag [] TagItems;

    /**
    * 副可用区信息
    */
    @SerializedName("SecondaryZoneInfo")
    @Expose
    private SecondaryZoneInfo [] SecondaryZoneInfo;

    /**
    * default账号登陆实例的密码。8-16个字符，至少包含大写字母、小写字母、数字和特殊字符!@#%^*中的三种，第一个字符不能为特殊字符
    */
    @SerializedName("CkDefaultUserPwd")
    @Expose
    private String CkDefaultUserPwd;

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 是否高可用 
     * @return HaFlag 是否高可用
     */
    public Boolean getHaFlag() {
        return this.HaFlag;
    }

    /**
     * Set 是否高可用
     * @param HaFlag 是否高可用
     */
    public void setHaFlag(Boolean HaFlag) {
        this.HaFlag = HaFlag;
    }

    /**
     * Get 私有网络 
     * @return UserVPCId 私有网络
     */
    public String getUserVPCId() {
        return this.UserVPCId;
    }

    /**
     * Set 私有网络
     * @param UserVPCId 私有网络
     */
    public void setUserVPCId(String UserVPCId) {
        this.UserVPCId = UserVPCId;
    }

    /**
     * Get 子网 
     * @return UserSubnetId 子网
     */
    public String getUserSubnetId() {
        return this.UserSubnetId;
    }

    /**
     * Set 子网
     * @param UserSubnetId 子网
     */
    public void setUserSubnetId(String UserSubnetId) {
        this.UserSubnetId = UserSubnetId;
    }

    /**
     * Get 系统版本 
     * @return ProductVersion 系统版本
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set 系统版本
     * @param ProductVersion 系统版本
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get 计费方式 
     * @return ChargeProperties 计费方式
     */
    public Charge getChargeProperties() {
        return this.ChargeProperties;
    }

    /**
     * Set 计费方式
     * @param ChargeProperties 计费方式
     */
    public void setChargeProperties(Charge ChargeProperties) {
        this.ChargeProperties = ChargeProperties;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 数据节点
SpecName从DescribeSpec接口中返回的DataSpec.Name获取 
     * @return DataSpec 数据节点
SpecName从DescribeSpec接口中返回的DataSpec.Name获取
     */
    public NodeSpec getDataSpec() {
        return this.DataSpec;
    }

    /**
     * Set 数据节点
SpecName从DescribeSpec接口中返回的DataSpec.Name获取
     * @param DataSpec 数据节点
SpecName从DescribeSpec接口中返回的DataSpec.Name获取
     */
    public void setDataSpec(NodeSpec DataSpec) {
        this.DataSpec = DataSpec;
    }

    /**
     * Get 标签列表（废弃） 
     * @return Tags 标签列表（废弃）
     * @deprecated
     */
    @Deprecated
    public Tag getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表（废弃）
     * @param Tags 标签列表（废弃）
     * @deprecated
     */
    @Deprecated
    public void setTags(Tag Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 日志主题ID 
     * @return ClsLogSetId 日志主题ID
     */
    public String getClsLogSetId() {
        return this.ClsLogSetId;
    }

    /**
     * Set 日志主题ID
     * @param ClsLogSetId 日志主题ID
     */
    public void setClsLogSetId(String ClsLogSetId) {
        this.ClsLogSetId = ClsLogSetId;
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
     * Get 是否是裸盘挂载，默认值 0 为 未挂载，1 为挂载。 
     * @return MountDiskType 是否是裸盘挂载，默认值 0 为 未挂载，1 为挂载。
     */
    public Long getMountDiskType() {
        return this.MountDiskType;
    }

    /**
     * Set 是否是裸盘挂载，默认值 0 为 未挂载，1 为挂载。
     * @param MountDiskType 是否是裸盘挂载，默认值 0 为 未挂载，1 为挂载。
     */
    public void setMountDiskType(Long MountDiskType) {
        this.MountDiskType = MountDiskType;
    }

    /**
     * Get 是否是ZK高可用 
     * @return HAZk 是否是ZK高可用
     */
    public Boolean getHAZk() {
        return this.HAZk;
    }

    /**
     * Set 是否是ZK高可用
     * @param HAZk 是否是ZK高可用
     */
    public void setHAZk(Boolean HAZk) {
        this.HAZk = HAZk;
    }

    /**
     * Get ZK节点SpecName从DescribeSpec接口中返回的CommonSpec结构体的Name（ZK节点）获取 
     * @return CommonSpec ZK节点SpecName从DescribeSpec接口中返回的CommonSpec结构体的Name（ZK节点）获取
     */
    public NodeSpec getCommonSpec() {
        return this.CommonSpec;
    }

    /**
     * Set ZK节点SpecName从DescribeSpec接口中返回的CommonSpec结构体的Name（ZK节点）获取
     * @param CommonSpec ZK节点SpecName从DescribeSpec接口中返回的CommonSpec结构体的Name（ZK节点）获取
     */
    public void setCommonSpec(NodeSpec CommonSpec) {
        this.CommonSpec = CommonSpec;
    }

    /**
     * Get 标签列表 
     * @return TagItems 标签列表
     */
    public Tag [] getTagItems() {
        return this.TagItems;
    }

    /**
     * Set 标签列表
     * @param TagItems 标签列表
     */
    public void setTagItems(Tag [] TagItems) {
        this.TagItems = TagItems;
    }

    /**
     * Get 副可用区信息 
     * @return SecondaryZoneInfo 副可用区信息
     */
    public SecondaryZoneInfo [] getSecondaryZoneInfo() {
        return this.SecondaryZoneInfo;
    }

    /**
     * Set 副可用区信息
     * @param SecondaryZoneInfo 副可用区信息
     */
    public void setSecondaryZoneInfo(SecondaryZoneInfo [] SecondaryZoneInfo) {
        this.SecondaryZoneInfo = SecondaryZoneInfo;
    }

    /**
     * Get default账号登陆实例的密码。8-16个字符，至少包含大写字母、小写字母、数字和特殊字符!@#%^*中的三种，第一个字符不能为特殊字符 
     * @return CkDefaultUserPwd default账号登陆实例的密码。8-16个字符，至少包含大写字母、小写字母、数字和特殊字符!@#%^*中的三种，第一个字符不能为特殊字符
     */
    public String getCkDefaultUserPwd() {
        return this.CkDefaultUserPwd;
    }

    /**
     * Set default账号登陆实例的密码。8-16个字符，至少包含大写字母、小写字母、数字和特殊字符!@#%^*中的三种，第一个字符不能为特殊字符
     * @param CkDefaultUserPwd default账号登陆实例的密码。8-16个字符，至少包含大写字母、小写字母、数字和特殊字符!@#%^*中的三种，第一个字符不能为特殊字符
     */
    public void setCkDefaultUserPwd(String CkDefaultUserPwd) {
        this.CkDefaultUserPwd = CkDefaultUserPwd;
    }

    public CreateInstanceNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceNewRequest(CreateInstanceNewRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.HaFlag != null) {
            this.HaFlag = new Boolean(source.HaFlag);
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
        if (source.ChargeProperties != null) {
            this.ChargeProperties = new Charge(source.ChargeProperties);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.DataSpec != null) {
            this.DataSpec = new NodeSpec(source.DataSpec);
        }
        if (source.Tags != null) {
            this.Tags = new Tag(source.Tags);
        }
        if (source.ClsLogSetId != null) {
            this.ClsLogSetId = new String(source.ClsLogSetId);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.MountDiskType != null) {
            this.MountDiskType = new Long(source.MountDiskType);
        }
        if (source.HAZk != null) {
            this.HAZk = new Boolean(source.HAZk);
        }
        if (source.CommonSpec != null) {
            this.CommonSpec = new NodeSpec(source.CommonSpec);
        }
        if (source.TagItems != null) {
            this.TagItems = new Tag[source.TagItems.length];
            for (int i = 0; i < source.TagItems.length; i++) {
                this.TagItems[i] = new Tag(source.TagItems[i]);
            }
        }
        if (source.SecondaryZoneInfo != null) {
            this.SecondaryZoneInfo = new SecondaryZoneInfo[source.SecondaryZoneInfo.length];
            for (int i = 0; i < source.SecondaryZoneInfo.length; i++) {
                this.SecondaryZoneInfo[i] = new SecondaryZoneInfo(source.SecondaryZoneInfo[i]);
            }
        }
        if (source.CkDefaultUserPwd != null) {
            this.CkDefaultUserPwd = new String(source.CkDefaultUserPwd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "HaFlag", this.HaFlag);
        this.setParamSimple(map, prefix + "UserVPCId", this.UserVPCId);
        this.setParamSimple(map, prefix + "UserSubnetId", this.UserSubnetId);
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);
        this.setParamObj(map, prefix + "ChargeProperties.", this.ChargeProperties);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamObj(map, prefix + "DataSpec.", this.DataSpec);
        this.setParamObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ClsLogSetId", this.ClsLogSetId);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "MountDiskType", this.MountDiskType);
        this.setParamSimple(map, prefix + "HAZk", this.HAZk);
        this.setParamObj(map, prefix + "CommonSpec.", this.CommonSpec);
        this.setParamArrayObj(map, prefix + "TagItems.", this.TagItems);
        this.setParamArrayObj(map, prefix + "SecondaryZoneInfo.", this.SecondaryZoneInfo);
        this.setParamSimple(map, prefix + "CkDefaultUserPwd", this.CkDefaultUserPwd);

    }
}

