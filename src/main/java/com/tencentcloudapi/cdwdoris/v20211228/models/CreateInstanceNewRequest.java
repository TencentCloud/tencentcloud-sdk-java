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

public class CreateInstanceNewRequest extends AbstractModel {

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * FE规格
    */
    @SerializedName("FeSpec")
    @Expose
    private CreateInstanceSpec FeSpec;

    /**
    * BE规格
    */
    @SerializedName("BeSpec")
    @Expose
    private CreateInstanceSpec BeSpec;

    /**
    * 是否高可用
    */
    @SerializedName("HaFlag")
    @Expose
    private Boolean HaFlag;

    /**
    * 用户VPCID
    */
    @SerializedName("UserVPCId")
    @Expose
    private String UserVPCId;

    /**
    * 用户子网ID
    */
    @SerializedName("UserSubnetId")
    @Expose
    private String UserSubnetId;

    /**
    * 产品版本号
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * 付费类型
    */
    @SerializedName("ChargeProperties")
    @Expose
    private ChargeProperties ChargeProperties;

    /**
    * 实例名字
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 数据库密码
    */
    @SerializedName("DorisUserPwd")
    @Expose
    private String DorisUserPwd;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 高可用类型：0：非高可用，1：读高可用，2：读写高可用。
    */
    @SerializedName("HaType")
    @Expose
    private Long HaType;

    /**
    * 表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Long CaseSensitive;

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
     * Get FE规格 
     * @return FeSpec FE规格
     */
    public CreateInstanceSpec getFeSpec() {
        return this.FeSpec;
    }

    /**
     * Set FE规格
     * @param FeSpec FE规格
     */
    public void setFeSpec(CreateInstanceSpec FeSpec) {
        this.FeSpec = FeSpec;
    }

    /**
     * Get BE规格 
     * @return BeSpec BE规格
     */
    public CreateInstanceSpec getBeSpec() {
        return this.BeSpec;
    }

    /**
     * Set BE规格
     * @param BeSpec BE规格
     */
    public void setBeSpec(CreateInstanceSpec BeSpec) {
        this.BeSpec = BeSpec;
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
     * Get 用户VPCID 
     * @return UserVPCId 用户VPCID
     */
    public String getUserVPCId() {
        return this.UserVPCId;
    }

    /**
     * Set 用户VPCID
     * @param UserVPCId 用户VPCID
     */
    public void setUserVPCId(String UserVPCId) {
        this.UserVPCId = UserVPCId;
    }

    /**
     * Get 用户子网ID 
     * @return UserSubnetId 用户子网ID
     */
    public String getUserSubnetId() {
        return this.UserSubnetId;
    }

    /**
     * Set 用户子网ID
     * @param UserSubnetId 用户子网ID
     */
    public void setUserSubnetId(String UserSubnetId) {
        this.UserSubnetId = UserSubnetId;
    }

    /**
     * Get 产品版本号 
     * @return ProductVersion 产品版本号
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set 产品版本号
     * @param ProductVersion 产品版本号
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get 付费类型 
     * @return ChargeProperties 付费类型
     */
    public ChargeProperties getChargeProperties() {
        return this.ChargeProperties;
    }

    /**
     * Set 付费类型
     * @param ChargeProperties 付费类型
     */
    public void setChargeProperties(ChargeProperties ChargeProperties) {
        this.ChargeProperties = ChargeProperties;
    }

    /**
     * Get 实例名字 
     * @return InstanceName 实例名字
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名字
     * @param InstanceName 实例名字
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 数据库密码 
     * @return DorisUserPwd 数据库密码
     */
    public String getDorisUserPwd() {
        return this.DorisUserPwd;
    }

    /**
     * Set 数据库密码
     * @param DorisUserPwd 数据库密码
     */
    public void setDorisUserPwd(String DorisUserPwd) {
        this.DorisUserPwd = DorisUserPwd;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 高可用类型：0：非高可用，1：读高可用，2：读写高可用。 
     * @return HaType 高可用类型：0：非高可用，1：读高可用，2：读写高可用。
     */
    public Long getHaType() {
        return this.HaType;
    }

    /**
     * Set 高可用类型：0：非高可用，1：读高可用，2：读写高可用。
     * @param HaType 高可用类型：0：非高可用，1：读高可用，2：读写高可用。
     */
    public void setHaType(Long HaType) {
        this.HaType = HaType;
    }

    /**
     * Get 表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储 
     * @return CaseSensitive 表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储
     */
    public Long getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set 表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储
     * @param CaseSensitive 表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储
     */
    public void setCaseSensitive(Long CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
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
        if (source.FeSpec != null) {
            this.FeSpec = new CreateInstanceSpec(source.FeSpec);
        }
        if (source.BeSpec != null) {
            this.BeSpec = new CreateInstanceSpec(source.BeSpec);
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
            this.ChargeProperties = new ChargeProperties(source.ChargeProperties);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.DorisUserPwd != null) {
            this.DorisUserPwd = new String(source.DorisUserPwd);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HaType != null) {
            this.HaType = new Long(source.HaType);
        }
        if (source.CaseSensitive != null) {
            this.CaseSensitive = new Long(source.CaseSensitive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamObj(map, prefix + "FeSpec.", this.FeSpec);
        this.setParamObj(map, prefix + "BeSpec.", this.BeSpec);
        this.setParamSimple(map, prefix + "HaFlag", this.HaFlag);
        this.setParamSimple(map, prefix + "UserVPCId", this.UserVPCId);
        this.setParamSimple(map, prefix + "UserSubnetId", this.UserSubnetId);
        this.setParamSimple(map, prefix + "ProductVersion", this.ProductVersion);
        this.setParamObj(map, prefix + "ChargeProperties.", this.ChargeProperties);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "DorisUserPwd", this.DorisUserPwd);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HaType", this.HaType);
        this.setParamSimple(map, prefix + "CaseSensitive", this.CaseSensitive);

    }
}

