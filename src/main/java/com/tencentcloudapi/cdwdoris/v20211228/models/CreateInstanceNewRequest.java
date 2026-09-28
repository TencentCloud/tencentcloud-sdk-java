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
package com.tencentcloudapi.cdwdoris.v20211228.models;

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
    * <p>FE规格</p>
    */
    @SerializedName("FeSpec")
    @Expose
    private CreateInstanceSpec FeSpec;

    /**
    * <p>BE规格</p>
    */
    @SerializedName("BeSpec")
    @Expose
    private CreateInstanceSpec BeSpec;

    /**
    * <p>是否高可用</p>
    */
    @SerializedName("HaFlag")
    @Expose
    private Boolean HaFlag;

    /**
    * <p>用户VPCID</p>
    */
    @SerializedName("UserVPCId")
    @Expose
    private String UserVPCId;

    /**
    * <p>用户子网ID</p>
    */
    @SerializedName("UserSubnetId")
    @Expose
    private String UserSubnetId;

    /**
    * <p>产品版本号</p>
    */
    @SerializedName("ProductVersion")
    @Expose
    private String ProductVersion;

    /**
    * <p>付费类型</p>
    */
    @SerializedName("ChargeProperties")
    @Expose
    private ChargeProperties ChargeProperties;

    /**
    * <p>实例名字</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>数据库密码</p>
    */
    @SerializedName("DorisUserPwd")
    @Expose
    private String DorisUserPwd;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>高可用类型：<br>0：非高可用（只有1个FE，FeSpec.CreateInstanceSpec.Count=1），<br>1：读高可用（至少需部署3个FE，FeSpec.CreateInstanceSpec.Count&gt;=3，且为奇数），<br>2：读写高可用（至少需部署5个FE，FeSpec.CreateInstanceSpec.Count&gt;=5，且为奇数）。</p>
    */
    @SerializedName("HaType")
    @Expose
    private Long HaType;

    /**
    * <p>表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储</p>
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Long CaseSensitive;

    /**
    * <p>是否开启多可用区</p>
    */
    @SerializedName("EnableMultiZones")
    @Expose
    private Boolean EnableMultiZones;

    /**
    * <p>开启多可用区后，用户的所有可用区和子网信息</p>
    */
    @SerializedName("UserMultiZoneInfos")
    @Expose
    private NetworkInfo UserMultiZoneInfos;

    /**
    * <p>开启多可用区后，用户的所有可用区和子网信息</p>
    */
    @SerializedName("UserMultiZoneInfoArr")
    @Expose
    private NetworkInfo [] UserMultiZoneInfoArr;

    /**
    * <p>是否存算分离</p>
    */
    @SerializedName("IsSSC")
    @Expose
    private Boolean IsSSC;

    /**
    * <p>CU数</p>
    */
    @SerializedName("SSCCU")
    @Expose
    private Long SSCCU;

    /**
    * <p>缓存盘大小</p>
    */
    @SerializedName("CacheDiskSize")
    @Expose
    private String CacheDiskSize;

    /**
    * <p>缓存盘大小</p>
    */
    @SerializedName("CacheDataDiskSize")
    @Expose
    private Long CacheDataDiskSize;

    /**
    * <p>磁盘加密</p>
    */
    @SerializedName("DiskEncrypt")
    @Expose
    private Long DiskEncrypt;

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
     * Get <p>FE规格</p> 
     * @return FeSpec <p>FE规格</p>
     */
    public CreateInstanceSpec getFeSpec() {
        return this.FeSpec;
    }

    /**
     * Set <p>FE规格</p>
     * @param FeSpec <p>FE规格</p>
     */
    public void setFeSpec(CreateInstanceSpec FeSpec) {
        this.FeSpec = FeSpec;
    }

    /**
     * Get <p>BE规格</p> 
     * @return BeSpec <p>BE规格</p>
     */
    public CreateInstanceSpec getBeSpec() {
        return this.BeSpec;
    }

    /**
     * Set <p>BE规格</p>
     * @param BeSpec <p>BE规格</p>
     */
    public void setBeSpec(CreateInstanceSpec BeSpec) {
        this.BeSpec = BeSpec;
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
     * Get <p>用户VPCID</p> 
     * @return UserVPCId <p>用户VPCID</p>
     */
    public String getUserVPCId() {
        return this.UserVPCId;
    }

    /**
     * Set <p>用户VPCID</p>
     * @param UserVPCId <p>用户VPCID</p>
     */
    public void setUserVPCId(String UserVPCId) {
        this.UserVPCId = UserVPCId;
    }

    /**
     * Get <p>用户子网ID</p> 
     * @return UserSubnetId <p>用户子网ID</p>
     */
    public String getUserSubnetId() {
        return this.UserSubnetId;
    }

    /**
     * Set <p>用户子网ID</p>
     * @param UserSubnetId <p>用户子网ID</p>
     */
    public void setUserSubnetId(String UserSubnetId) {
        this.UserSubnetId = UserSubnetId;
    }

    /**
     * Get <p>产品版本号</p> 
     * @return ProductVersion <p>产品版本号</p>
     */
    public String getProductVersion() {
        return this.ProductVersion;
    }

    /**
     * Set <p>产品版本号</p>
     * @param ProductVersion <p>产品版本号</p>
     */
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
    }

    /**
     * Get <p>付费类型</p> 
     * @return ChargeProperties <p>付费类型</p>
     */
    public ChargeProperties getChargeProperties() {
        return this.ChargeProperties;
    }

    /**
     * Set <p>付费类型</p>
     * @param ChargeProperties <p>付费类型</p>
     */
    public void setChargeProperties(ChargeProperties ChargeProperties) {
        this.ChargeProperties = ChargeProperties;
    }

    /**
     * Get <p>实例名字</p> 
     * @return InstanceName <p>实例名字</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名字</p>
     * @param InstanceName <p>实例名字</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>数据库密码</p> 
     * @return DorisUserPwd <p>数据库密码</p>
     */
    public String getDorisUserPwd() {
        return this.DorisUserPwd;
    }

    /**
     * Set <p>数据库密码</p>
     * @param DorisUserPwd <p>数据库密码</p>
     */
    public void setDorisUserPwd(String DorisUserPwd) {
        this.DorisUserPwd = DorisUserPwd;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>高可用类型：<br>0：非高可用（只有1个FE，FeSpec.CreateInstanceSpec.Count=1），<br>1：读高可用（至少需部署3个FE，FeSpec.CreateInstanceSpec.Count&gt;=3，且为奇数），<br>2：读写高可用（至少需部署5个FE，FeSpec.CreateInstanceSpec.Count&gt;=5，且为奇数）。</p> 
     * @return HaType <p>高可用类型：<br>0：非高可用（只有1个FE，FeSpec.CreateInstanceSpec.Count=1），<br>1：读高可用（至少需部署3个FE，FeSpec.CreateInstanceSpec.Count&gt;=3，且为奇数），<br>2：读写高可用（至少需部署5个FE，FeSpec.CreateInstanceSpec.Count&gt;=5，且为奇数）。</p>
     */
    public Long getHaType() {
        return this.HaType;
    }

    /**
     * Set <p>高可用类型：<br>0：非高可用（只有1个FE，FeSpec.CreateInstanceSpec.Count=1），<br>1：读高可用（至少需部署3个FE，FeSpec.CreateInstanceSpec.Count&gt;=3，且为奇数），<br>2：读写高可用（至少需部署5个FE，FeSpec.CreateInstanceSpec.Count&gt;=5，且为奇数）。</p>
     * @param HaType <p>高可用类型：<br>0：非高可用（只有1个FE，FeSpec.CreateInstanceSpec.Count=1），<br>1：读高可用（至少需部署3个FE，FeSpec.CreateInstanceSpec.Count&gt;=3，且为奇数），<br>2：读写高可用（至少需部署5个FE，FeSpec.CreateInstanceSpec.Count&gt;=5，且为奇数）。</p>
     */
    public void setHaType(Long HaType) {
        this.HaType = HaType;
    }

    /**
     * Get <p>表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储</p> 
     * @return CaseSensitive <p>表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储</p>
     */
    public Long getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set <p>表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储</p>
     * @param CaseSensitive <p>表名大小写是否敏感，0：敏感；1：不敏感，以小写进行比较；2：不敏感，表名改为以小写存储</p>
     */
    public void setCaseSensitive(Long CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get <p>是否开启多可用区</p> 
     * @return EnableMultiZones <p>是否开启多可用区</p>
     */
    public Boolean getEnableMultiZones() {
        return this.EnableMultiZones;
    }

    /**
     * Set <p>是否开启多可用区</p>
     * @param EnableMultiZones <p>是否开启多可用区</p>
     */
    public void setEnableMultiZones(Boolean EnableMultiZones) {
        this.EnableMultiZones = EnableMultiZones;
    }

    /**
     * Get <p>开启多可用区后，用户的所有可用区和子网信息</p> 
     * @return UserMultiZoneInfos <p>开启多可用区后，用户的所有可用区和子网信息</p>
     * @deprecated
     */
    @Deprecated
    public NetworkInfo getUserMultiZoneInfos() {
        return this.UserMultiZoneInfos;
    }

    /**
     * Set <p>开启多可用区后，用户的所有可用区和子网信息</p>
     * @param UserMultiZoneInfos <p>开启多可用区后，用户的所有可用区和子网信息</p>
     * @deprecated
     */
    @Deprecated
    public void setUserMultiZoneInfos(NetworkInfo UserMultiZoneInfos) {
        this.UserMultiZoneInfos = UserMultiZoneInfos;
    }

    /**
     * Get <p>开启多可用区后，用户的所有可用区和子网信息</p> 
     * @return UserMultiZoneInfoArr <p>开启多可用区后，用户的所有可用区和子网信息</p>
     */
    public NetworkInfo [] getUserMultiZoneInfoArr() {
        return this.UserMultiZoneInfoArr;
    }

    /**
     * Set <p>开启多可用区后，用户的所有可用区和子网信息</p>
     * @param UserMultiZoneInfoArr <p>开启多可用区后，用户的所有可用区和子网信息</p>
     */
    public void setUserMultiZoneInfoArr(NetworkInfo [] UserMultiZoneInfoArr) {
        this.UserMultiZoneInfoArr = UserMultiZoneInfoArr;
    }

    /**
     * Get <p>是否存算分离</p> 
     * @return IsSSC <p>是否存算分离</p>
     */
    public Boolean getIsSSC() {
        return this.IsSSC;
    }

    /**
     * Set <p>是否存算分离</p>
     * @param IsSSC <p>是否存算分离</p>
     */
    public void setIsSSC(Boolean IsSSC) {
        this.IsSSC = IsSSC;
    }

    /**
     * Get <p>CU数</p> 
     * @return SSCCU <p>CU数</p>
     */
    public Long getSSCCU() {
        return this.SSCCU;
    }

    /**
     * Set <p>CU数</p>
     * @param SSCCU <p>CU数</p>
     */
    public void setSSCCU(Long SSCCU) {
        this.SSCCU = SSCCU;
    }

    /**
     * Get <p>缓存盘大小</p> 
     * @return CacheDiskSize <p>缓存盘大小</p>
     * @deprecated
     */
    @Deprecated
    public String getCacheDiskSize() {
        return this.CacheDiskSize;
    }

    /**
     * Set <p>缓存盘大小</p>
     * @param CacheDiskSize <p>缓存盘大小</p>
     * @deprecated
     */
    @Deprecated
    public void setCacheDiskSize(String CacheDiskSize) {
        this.CacheDiskSize = CacheDiskSize;
    }

    /**
     * Get <p>缓存盘大小</p> 
     * @return CacheDataDiskSize <p>缓存盘大小</p>
     */
    public Long getCacheDataDiskSize() {
        return this.CacheDataDiskSize;
    }

    /**
     * Set <p>缓存盘大小</p>
     * @param CacheDataDiskSize <p>缓存盘大小</p>
     */
    public void setCacheDataDiskSize(Long CacheDataDiskSize) {
        this.CacheDataDiskSize = CacheDataDiskSize;
    }

    /**
     * Get <p>磁盘加密</p> 
     * @return DiskEncrypt <p>磁盘加密</p>
     */
    public Long getDiskEncrypt() {
        return this.DiskEncrypt;
    }

    /**
     * Set <p>磁盘加密</p>
     * @param DiskEncrypt <p>磁盘加密</p>
     */
    public void setDiskEncrypt(Long DiskEncrypt) {
        this.DiskEncrypt = DiskEncrypt;
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
        if (source.EnableMultiZones != null) {
            this.EnableMultiZones = new Boolean(source.EnableMultiZones);
        }
        if (source.UserMultiZoneInfos != null) {
            this.UserMultiZoneInfos = new NetworkInfo(source.UserMultiZoneInfos);
        }
        if (source.UserMultiZoneInfoArr != null) {
            this.UserMultiZoneInfoArr = new NetworkInfo[source.UserMultiZoneInfoArr.length];
            for (int i = 0; i < source.UserMultiZoneInfoArr.length; i++) {
                this.UserMultiZoneInfoArr[i] = new NetworkInfo(source.UserMultiZoneInfoArr[i]);
            }
        }
        if (source.IsSSC != null) {
            this.IsSSC = new Boolean(source.IsSSC);
        }
        if (source.SSCCU != null) {
            this.SSCCU = new Long(source.SSCCU);
        }
        if (source.CacheDiskSize != null) {
            this.CacheDiskSize = new String(source.CacheDiskSize);
        }
        if (source.CacheDataDiskSize != null) {
            this.CacheDataDiskSize = new Long(source.CacheDataDiskSize);
        }
        if (source.DiskEncrypt != null) {
            this.DiskEncrypt = new Long(source.DiskEncrypt);
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
        this.setParamSimple(map, prefix + "EnableMultiZones", this.EnableMultiZones);
        this.setParamObj(map, prefix + "UserMultiZoneInfos.", this.UserMultiZoneInfos);
        this.setParamArrayObj(map, prefix + "UserMultiZoneInfoArr.", this.UserMultiZoneInfoArr);
        this.setParamSimple(map, prefix + "IsSSC", this.IsSSC);
        this.setParamSimple(map, prefix + "SSCCU", this.SSCCU);
        this.setParamSimple(map, prefix + "CacheDiskSize", this.CacheDiskSize);
        this.setParamSimple(map, prefix + "CacheDataDiskSize", this.CacheDataDiskSize);
        this.setParamSimple(map, prefix + "DiskEncrypt", this.DiskEncrypt);

    }
}

