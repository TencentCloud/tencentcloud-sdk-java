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
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>是否高可用</p>
    */
    @SerializedName("HaFlag")
    @Expose
    private Boolean HaFlag;

    /**
    * <p>私有网络</p>
    */
    @SerializedName("UserVPCId")
    @Expose
    private String UserVPCId;

    /**
    * <p>子网</p>
    */
    @SerializedName("UserSubnetId")
    @Expose
    private String UserSubnetId;

    /**
    * <p>系统版本</p>
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * <p>计费方式</p>
    */
    @SerializedName("ChargeProperties")
    @Expose
    private Charge ChargeProperties;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>数据节点<br>SpecName从DescribeSpec接口中返回的DataSpec.Name获取</p>
    */
    @SerializedName("DataSpec")
    @Expose
    private NodeSpec DataSpec;

    /**
    * <p>标签列表（废弃）</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag Tags;

    /**
    * <p>日志主题ID</p>
    */
    @SerializedName("ClsLogSetId")
    @Expose
    private String ClsLogSetId;

    /**
    * <p>COS桶名称</p>
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * <p>是否是裸盘挂载，默认值 0 为 未挂载，1 为挂载。</p>
    */
    @SerializedName("MountDiskType")
    @Expose
    private Long MountDiskType;

    /**
    * <p>是否是ZK高可用</p>
    */
    @SerializedName("HAZk")
    @Expose
    private Boolean HAZk;

    /**
    * <p>ZK节点SpecName从DescribeSpec接口中返回的CommonSpec结构体的Name（ZK节点）获取</p>
    */
    @SerializedName("CommonSpec")
    @Expose
    private NodeSpec CommonSpec;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("TagItems")
    @Expose
    private Tag [] TagItems;

    /**
    * <p>副可用区信息</p>
    */
    @SerializedName("SecondaryZoneInfo")
    @Expose
    private SecondaryZoneInfo [] SecondaryZoneInfo;

    /**
    * <p>default账号登录实例的密码。8-16个字符，至少包含大写字母、小写字母、数字和特殊字符!@#%^*中的三种，第一个字符不能为特殊字符</p>
    */
    @SerializedName("CkDefaultUserPwd")
    @Expose
    private String CkDefaultUserPwd;

    /**
    * <p>集群类型</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>是否高可用</p> 
     * @return HaFlag <p>是否高可用</p>
     */
    public Boolean getHaFlag() {
        return this.HaFlag;
    }

    /**
     * Set <p>是否高可用</p>
     * @param HaFlag <p>是否高可用</p>
     */
    public void setHaFlag(Boolean HaFlag) {
        this.HaFlag = HaFlag;
    }

    /**
     * Get <p>私有网络</p> 
     * @return UserVPCId <p>私有网络</p>
     */
    public String getUserVPCId() {
        return this.UserVPCId;
    }

    /**
     * Set <p>私有网络</p>
     * @param UserVPCId <p>私有网络</p>
     */
    public void setUserVPCId(String UserVPCId) {
        this.UserVPCId = UserVPCId;
    }

    /**
     * Get <p>子网</p> 
     * @return UserSubnetId <p>子网</p>
     */
    public String getUserSubnetId() {
        return this.UserSubnetId;
    }

    /**
     * Set <p>子网</p>
     * @param UserSubnetId <p>子网</p>
     */
    public void setUserSubnetId(String UserSubnetId) {
        this.UserSubnetId = UserSubnetId;
    }

    /**
     * Get <p>系统版本</p> 
     * @return ProductVersion <p>系统版本</p>
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set <p>系统版本</p>
     * @param ProductVersion <p>系统版本</p>
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get <p>计费方式</p> 
     * @return ChargeProperties <p>计费方式</p>
     */
    public Charge getChargeProperties() {
        return this.ChargeProperties;
    }

    /**
     * Set <p>计费方式</p>
     * @param ChargeProperties <p>计费方式</p>
     */
    public void setChargeProperties(Charge ChargeProperties) {
        this.ChargeProperties = ChargeProperties;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>数据节点<br>SpecName从DescribeSpec接口中返回的DataSpec.Name获取</p> 
     * @return DataSpec <p>数据节点<br>SpecName从DescribeSpec接口中返回的DataSpec.Name获取</p>
     */
    public NodeSpec getDataSpec() {
        return this.DataSpec;
    }

    /**
     * Set <p>数据节点<br>SpecName从DescribeSpec接口中返回的DataSpec.Name获取</p>
     * @param DataSpec <p>数据节点<br>SpecName从DescribeSpec接口中返回的DataSpec.Name获取</p>
     */
    public void setDataSpec(NodeSpec DataSpec) {
        this.DataSpec = DataSpec;
    }

    /**
     * Get <p>标签列表（废弃）</p> 
     * @return Tags <p>标签列表（废弃）</p>
     * @deprecated
     */
    @Deprecated
    public Tag getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表（废弃）</p>
     * @param Tags <p>标签列表（废弃）</p>
     * @deprecated
     */
    @Deprecated
    public void setTags(Tag Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>日志主题ID</p> 
     * @return ClsLogSetId <p>日志主题ID</p>
     */
    public String getClsLogSetId() {
        return this.ClsLogSetId;
    }

    /**
     * Set <p>日志主题ID</p>
     * @param ClsLogSetId <p>日志主题ID</p>
     */
    public void setClsLogSetId(String ClsLogSetId) {
        this.ClsLogSetId = ClsLogSetId;
    }

    /**
     * Get <p>COS桶名称</p> 
     * @return CosBucketName <p>COS桶名称</p>
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set <p>COS桶名称</p>
     * @param CosBucketName <p>COS桶名称</p>
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get <p>是否是裸盘挂载，默认值 0 为 未挂载，1 为挂载。</p> 
     * @return MountDiskType <p>是否是裸盘挂载，默认值 0 为 未挂载，1 为挂载。</p>
     */
    public Long getMountDiskType() {
        return this.MountDiskType;
    }

    /**
     * Set <p>是否是裸盘挂载，默认值 0 为 未挂载，1 为挂载。</p>
     * @param MountDiskType <p>是否是裸盘挂载，默认值 0 为 未挂载，1 为挂载。</p>
     */
    public void setMountDiskType(Long MountDiskType) {
        this.MountDiskType = MountDiskType;
    }

    /**
     * Get <p>是否是ZK高可用</p> 
     * @return HAZk <p>是否是ZK高可用</p>
     */
    public Boolean getHAZk() {
        return this.HAZk;
    }

    /**
     * Set <p>是否是ZK高可用</p>
     * @param HAZk <p>是否是ZK高可用</p>
     */
    public void setHAZk(Boolean HAZk) {
        this.HAZk = HAZk;
    }

    /**
     * Get <p>ZK节点SpecName从DescribeSpec接口中返回的CommonSpec结构体的Name（ZK节点）获取</p> 
     * @return CommonSpec <p>ZK节点SpecName从DescribeSpec接口中返回的CommonSpec结构体的Name（ZK节点）获取</p>
     */
    public NodeSpec getCommonSpec() {
        return this.CommonSpec;
    }

    /**
     * Set <p>ZK节点SpecName从DescribeSpec接口中返回的CommonSpec结构体的Name（ZK节点）获取</p>
     * @param CommonSpec <p>ZK节点SpecName从DescribeSpec接口中返回的CommonSpec结构体的Name（ZK节点）获取</p>
     */
    public void setCommonSpec(NodeSpec CommonSpec) {
        this.CommonSpec = CommonSpec;
    }

    /**
     * Get <p>标签列表</p> 
     * @return TagItems <p>标签列表</p>
     */
    public Tag [] getTagItems() {
        return this.TagItems;
    }

    /**
     * Set <p>标签列表</p>
     * @param TagItems <p>标签列表</p>
     */
    public void setTagItems(Tag [] TagItems) {
        this.TagItems = TagItems;
    }

    /**
     * Get <p>副可用区信息</p> 
     * @return SecondaryZoneInfo <p>副可用区信息</p>
     */
    public SecondaryZoneInfo [] getSecondaryZoneInfo() {
        return this.SecondaryZoneInfo;
    }

    /**
     * Set <p>副可用区信息</p>
     * @param SecondaryZoneInfo <p>副可用区信息</p>
     */
    public void setSecondaryZoneInfo(SecondaryZoneInfo [] SecondaryZoneInfo) {
        this.SecondaryZoneInfo = SecondaryZoneInfo;
    }

    /**
     * Get <p>default账号登录实例的密码。8-16个字符，至少包含大写字母、小写字母、数字和特殊字符!@#%^*中的三种，第一个字符不能为特殊字符</p> 
     * @return CkDefaultUserPwd <p>default账号登录实例的密码。8-16个字符，至少包含大写字母、小写字母、数字和特殊字符!@#%^*中的三种，第一个字符不能为特殊字符</p>
     */
    public String getCkDefaultUserPwd() {
        return this.CkDefaultUserPwd;
    }

    /**
     * Set <p>default账号登录实例的密码。8-16个字符，至少包含大写字母、小写字母、数字和特殊字符!@#%^*中的三种，第一个字符不能为特殊字符</p>
     * @param CkDefaultUserPwd <p>default账号登录实例的密码。8-16个字符，至少包含大写字母、小写字母、数字和特殊字符!@#%^*中的三种，第一个字符不能为特殊字符</p>
     */
    public void setCkDefaultUserPwd(String CkDefaultUserPwd) {
        this.CkDefaultUserPwd = CkDefaultUserPwd;
    }

    /**
     * Get <p>集群类型</p> 
     * @return ClusterType <p>集群类型</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型</p>
     * @param ClusterType <p>集群类型</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
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
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
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
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

