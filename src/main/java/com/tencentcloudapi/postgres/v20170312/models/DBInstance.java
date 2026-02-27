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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstance extends AbstractModel {

    /**
    * <p>实例所属地域，如: ap-guangzhou，对应RegionSet的Region字段。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>实例所属可用区， 如：ap-guangzhou-3，对应ZoneSet的Zone字段。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>私有网络ID，形如vpc-e6w23k31。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15778">DescribeVpcs</a> ，从接口返回中的unVpcId字段获取。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络子网ID，形如subnet-51lcif9y。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>实例ID。</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>实例名称。</p>
    */
    @SerializedName("DBInstanceName")
    @Expose
    private String DBInstanceName;

    /**
    * <p>实例状态，分别为：applying（申请中）、init(待初始化)、initing(初始化中)、running(运行中)、limited run（受限运行）、isolating（隔离中）、isolated（已隔离）、disisolating（解隔离中）、recycling（回收中）、recycled（已回收）、job running（任务执行中）、offline（下线）、migrating（迁移中）、expanding（扩容中）、waitSwitch（等待切换）、switching（切换中）、readonly（只读）、restarting（重启中）、network changing（网络变更中）、upgrading（内核版本升级中）、audit-switching（审计状态变更中）、primary-switching（主备切换中）、offlining(下线中)、deployment changing（可用区变更中）、cloning（恢复数据中）、parameter modifying（参数修改中）、log-switching（日志状态变更中）、restoring（恢复中）、expanding（变配中）</p>
    */
    @SerializedName("DBInstanceStatus")
    @Expose
    private String DBInstanceStatus;

    /**
    * <p>实例分配的内存大小，单位：GB</p>
    */
    @SerializedName("DBInstanceMemory")
    @Expose
    private Long DBInstanceMemory;

    /**
    * <p>实例分配的存储空间大小，单位：GB</p>
    */
    @SerializedName("DBInstanceStorage")
    @Expose
    private Long DBInstanceStorage;

    /**
    * <p>实例分配的CPU数量，单位：个</p>
    */
    @SerializedName("DBInstanceCpu")
    @Expose
    private Long DBInstanceCpu;

    /**
    * <p>售卖规格ID</p>
    */
    @SerializedName("DBInstanceClass")
    @Expose
    private String DBInstanceClass;

    /**
    * <p>PostgreSQL大版本号，版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取，目前支持10，11，12，13，14，15这几个大版本。</p>
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * <p>PostgreSQL社区大版本+小版本号，如12.4，版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取。</p>
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * <p>PostgreSQL内核版本号，如v12.7_r1.8，版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取。</p>
    */
    @SerializedName("DBKernelVersion")
    @Expose
    private String DBKernelVersion;

    /**
    * <p>实例类型，类型有：</p><li>primary：主实例</li><li>readonly：只读实例</li><li>guard：灾备实例</li><li>temp：临时实例</li>
    */
    @SerializedName("DBInstanceType")
    @Expose
    private String DBInstanceType;

    /**
    * <p>实例版本，目前只支持standard（双机高可用版, 一主一从）。</p>
    */
    @SerializedName("DBInstanceVersion")
    @Expose
    private String DBInstanceVersion;

    /**
    * <p>实例字符集，目前只支持：</p><li> UTF8</li><li> LATIN1</li>
    */
    @SerializedName("DBCharset")
    @Expose
    private String DBCharset;

    /**
    * <p>实例创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>实例执行最后一次更新的时间。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>实例到期时间。</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>实例隔离时间。</p>
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * <p>计费模式：</p><li>prepaid：包年包月,预付费</li><li>postpaid：按量计费，后付费</li>
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * <p>是否自动续费：</p><li>0：手动续费</li><li>1：自动续费</li>默认值：0
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>实例网络连接信息。</p>
    */
    @SerializedName("DBInstanceNetInfo")
    @Expose
    private DBInstanceNetInfo [] DBInstanceNetInfo;

    /**
    * <p>机器类型。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>用户的AppId。</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>实例的Uid。</p>
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * <p>项目ID。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>实例绑定的标签信息。</p>
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * <p>主实例信息，仅在实例为只读实例时返回。</p>
    */
    @SerializedName("MasterDBInstanceId")
    @Expose
    private String MasterDBInstanceId;

    /**
    * <p>只读实例数量。</p>
    */
    @SerializedName("ReadOnlyInstanceNum")
    @Expose
    private Long ReadOnlyInstanceNum;

    /**
    * <p>只读实例在只读组中的状态。</p>
    */
    @SerializedName("StatusInReadonlyGroup")
    @Expose
    private String StatusInReadonlyGroup;

    /**
    * <p>下线时间。</p>
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * <p>实例的节点信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBNodeSet")
    @Expose
    private DBNode [] DBNodeSet;

    /**
    * <p>实例是否支持TDE数据加密：</p><li>0：不支持</li><li>1：支持</li>默认值：0TDE数据加密可参考[数据透明加密概述](https://cloud.tencent.com/document/product/409/71748)
    */
    @SerializedName("IsSupportTDE")
    @Expose
    private Long IsSupportTDE;

    /**
    * <p>数据库引擎，支持：</p><li>postgresql：云数据库PostgreSQL</li><li>mssql_compatible：MSSQL兼容-云数据库PostgreSQL</li>默认值：postgresql
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
    * <p>数据库引擎的配置信息，配置格式如下：<br>{&quot;$key1&quot;:&quot;$value1&quot;, &quot;$key2&quot;:&quot;$value2&quot;}<br>各引擎支持如下：<br>mssql_compatible引擎：</p><li>migrationMode：数据库模式，可选参数，可取值：single-db（单数据库模式），multi-db（多数据库模式）。默认为single-db。</li><li>defaultLocale：排序区域规则，可选参数，在初始化后不可修改，默认为en_US，可选值如下："af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN"。</li><li>serverCollationName：排序规则名称，可选参数，在初始化后不可修改，默认为sql_latin1_general_cp1_ci_as，可选值如下："bbf_unicode_general_ci_as", "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as"。</li>
    */
    @SerializedName("DBEngineConfig")
    @Expose
    private String DBEngineConfig;

    /**
    * <p>实例网络信息列表（此字段已废弃）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkAccessList")
    @Expose
    private NetworkAccess [] NetworkAccessList;

    /**
    * <p>实例是否支持Ipv6：</p><li>0：否</li><li>1：是</li>默认值：0
    */
    @SerializedName("SupportIpv6")
    @Expose
    private Long SupportIpv6;

    /**
    * <p>实例已经弹性扩容的cpu核数</p>
    */
    @SerializedName("ExpandedCpu")
    @Expose
    private Long ExpandedCpu;

    /**
    * <p>实例是否开启删除保护，取值如下：</p><ul><li>true：开启删除保护</li><li>false：关闭删除保护</li></ul>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
     * Get <p>实例所属地域，如: ap-guangzhou，对应RegionSet的Region字段。</p> 
     * @return Region <p>实例所属地域，如: ap-guangzhou，对应RegionSet的Region字段。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>实例所属地域，如: ap-guangzhou，对应RegionSet的Region字段。</p>
     * @param Region <p>实例所属地域，如: ap-guangzhou，对应RegionSet的Region字段。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>实例所属可用区， 如：ap-guangzhou-3，对应ZoneSet的Zone字段。</p> 
     * @return Zone <p>实例所属可用区， 如：ap-guangzhou-3，对应ZoneSet的Zone字段。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>实例所属可用区， 如：ap-guangzhou-3，对应ZoneSet的Zone字段。</p>
     * @param Zone <p>实例所属可用区， 如：ap-guangzhou-3，对应ZoneSet的Zone字段。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>私有网络ID，形如vpc-e6w23k31。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15778">DescribeVpcs</a> ，从接口返回中的unVpcId字段获取。</p> 
     * @return VpcId <p>私有网络ID，形如vpc-e6w23k31。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15778">DescribeVpcs</a> ，从接口返回中的unVpcId字段获取。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID，形如vpc-e6w23k31。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15778">DescribeVpcs</a> ，从接口返回中的unVpcId字段获取。</p>
     * @param VpcId <p>私有网络ID，形如vpc-e6w23k31。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15778">DescribeVpcs</a> ，从接口返回中的unVpcId字段获取。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络子网ID，形如subnet-51lcif9y。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p> 
     * @return SubnetId <p>私有网络子网ID，形如subnet-51lcif9y。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>私有网络子网ID，形如subnet-51lcif9y。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
     * @param SubnetId <p>私有网络子网ID，形如subnet-51lcif9y。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>实例ID。</p> 
     * @return DBInstanceId <p>实例ID。</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例ID。</p>
     * @param DBInstanceId <p>实例ID。</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>实例名称。</p> 
     * @return DBInstanceName <p>实例名称。</p>
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * Set <p>实例名称。</p>
     * @param DBInstanceName <p>实例名称。</p>
     */
    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    /**
     * Get <p>实例状态，分别为：applying（申请中）、init(待初始化)、initing(初始化中)、running(运行中)、limited run（受限运行）、isolating（隔离中）、isolated（已隔离）、disisolating（解隔离中）、recycling（回收中）、recycled（已回收）、job running（任务执行中）、offline（下线）、migrating（迁移中）、expanding（扩容中）、waitSwitch（等待切换）、switching（切换中）、readonly（只读）、restarting（重启中）、network changing（网络变更中）、upgrading（内核版本升级中）、audit-switching（审计状态变更中）、primary-switching（主备切换中）、offlining(下线中)、deployment changing（可用区变更中）、cloning（恢复数据中）、parameter modifying（参数修改中）、log-switching（日志状态变更中）、restoring（恢复中）、expanding（变配中）</p> 
     * @return DBInstanceStatus <p>实例状态，分别为：applying（申请中）、init(待初始化)、initing(初始化中)、running(运行中)、limited run（受限运行）、isolating（隔离中）、isolated（已隔离）、disisolating（解隔离中）、recycling（回收中）、recycled（已回收）、job running（任务执行中）、offline（下线）、migrating（迁移中）、expanding（扩容中）、waitSwitch（等待切换）、switching（切换中）、readonly（只读）、restarting（重启中）、network changing（网络变更中）、upgrading（内核版本升级中）、audit-switching（审计状态变更中）、primary-switching（主备切换中）、offlining(下线中)、deployment changing（可用区变更中）、cloning（恢复数据中）、parameter modifying（参数修改中）、log-switching（日志状态变更中）、restoring（恢复中）、expanding（变配中）</p>
     */
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    /**
     * Set <p>实例状态，分别为：applying（申请中）、init(待初始化)、initing(初始化中)、running(运行中)、limited run（受限运行）、isolating（隔离中）、isolated（已隔离）、disisolating（解隔离中）、recycling（回收中）、recycled（已回收）、job running（任务执行中）、offline（下线）、migrating（迁移中）、expanding（扩容中）、waitSwitch（等待切换）、switching（切换中）、readonly（只读）、restarting（重启中）、network changing（网络变更中）、upgrading（内核版本升级中）、audit-switching（审计状态变更中）、primary-switching（主备切换中）、offlining(下线中)、deployment changing（可用区变更中）、cloning（恢复数据中）、parameter modifying（参数修改中）、log-switching（日志状态变更中）、restoring（恢复中）、expanding（变配中）</p>
     * @param DBInstanceStatus <p>实例状态，分别为：applying（申请中）、init(待初始化)、initing(初始化中)、running(运行中)、limited run（受限运行）、isolating（隔离中）、isolated（已隔离）、disisolating（解隔离中）、recycling（回收中）、recycled（已回收）、job running（任务执行中）、offline（下线）、migrating（迁移中）、expanding（扩容中）、waitSwitch（等待切换）、switching（切换中）、readonly（只读）、restarting（重启中）、network changing（网络变更中）、upgrading（内核版本升级中）、audit-switching（审计状态变更中）、primary-switching（主备切换中）、offlining(下线中)、deployment changing（可用区变更中）、cloning（恢复数据中）、parameter modifying（参数修改中）、log-switching（日志状态变更中）、restoring（恢复中）、expanding（变配中）</p>
     */
    public void setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
    }

    /**
     * Get <p>实例分配的内存大小，单位：GB</p> 
     * @return DBInstanceMemory <p>实例分配的内存大小，单位：GB</p>
     */
    public Long getDBInstanceMemory() {
        return this.DBInstanceMemory;
    }

    /**
     * Set <p>实例分配的内存大小，单位：GB</p>
     * @param DBInstanceMemory <p>实例分配的内存大小，单位：GB</p>
     */
    public void setDBInstanceMemory(Long DBInstanceMemory) {
        this.DBInstanceMemory = DBInstanceMemory;
    }

    /**
     * Get <p>实例分配的存储空间大小，单位：GB</p> 
     * @return DBInstanceStorage <p>实例分配的存储空间大小，单位：GB</p>
     */
    public Long getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * Set <p>实例分配的存储空间大小，单位：GB</p>
     * @param DBInstanceStorage <p>实例分配的存储空间大小，单位：GB</p>
     */
    public void setDBInstanceStorage(Long DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
    }

    /**
     * Get <p>实例分配的CPU数量，单位：个</p> 
     * @return DBInstanceCpu <p>实例分配的CPU数量，单位：个</p>
     */
    public Long getDBInstanceCpu() {
        return this.DBInstanceCpu;
    }

    /**
     * Set <p>实例分配的CPU数量，单位：个</p>
     * @param DBInstanceCpu <p>实例分配的CPU数量，单位：个</p>
     */
    public void setDBInstanceCpu(Long DBInstanceCpu) {
        this.DBInstanceCpu = DBInstanceCpu;
    }

    /**
     * Get <p>售卖规格ID</p> 
     * @return DBInstanceClass <p>售卖规格ID</p>
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * Set <p>售卖规格ID</p>
     * @param DBInstanceClass <p>售卖规格ID</p>
     */
    public void setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
    }

    /**
     * Get <p>PostgreSQL大版本号，版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取，目前支持10，11，12，13，14，15这几个大版本。</p> 
     * @return DBMajorVersion <p>PostgreSQL大版本号，版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取，目前支持10，11，12，13，14，15这几个大版本。</p>
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set <p>PostgreSQL大版本号，版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取，目前支持10，11，12，13，14，15这几个大版本。</p>
     * @param DBMajorVersion <p>PostgreSQL大版本号，版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取，目前支持10，11，12，13，14，15这几个大版本。</p>
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get <p>PostgreSQL社区大版本+小版本号，如12.4，版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取。</p> 
     * @return DBVersion <p>PostgreSQL社区大版本+小版本号，如12.4，版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取。</p>
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set <p>PostgreSQL社区大版本+小版本号，如12.4，版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取。</p>
     * @param DBVersion <p>PostgreSQL社区大版本+小版本号，如12.4，版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取。</p>
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get <p>PostgreSQL内核版本号，如v12.7_r1.8，版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取。</p> 
     * @return DBKernelVersion <p>PostgreSQL内核版本号，如v12.7_r1.8，版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取。</p>
     */
    public String getDBKernelVersion() {
        return this.DBKernelVersion;
    }

    /**
     * Set <p>PostgreSQL内核版本号，如v12.7_r1.8，版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取。</p>
     * @param DBKernelVersion <p>PostgreSQL内核版本号，如v12.7_r1.8，版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取。</p>
     */
    public void setDBKernelVersion(String DBKernelVersion) {
        this.DBKernelVersion = DBKernelVersion;
    }

    /**
     * Get <p>实例类型，类型有：</p><li>primary：主实例</li><li>readonly：只读实例</li><li>guard：灾备实例</li><li>temp：临时实例</li> 
     * @return DBInstanceType <p>实例类型，类型有：</p><li>primary：主实例</li><li>readonly：只读实例</li><li>guard：灾备实例</li><li>temp：临时实例</li>
     */
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    /**
     * Set <p>实例类型，类型有：</p><li>primary：主实例</li><li>readonly：只读实例</li><li>guard：灾备实例</li><li>temp：临时实例</li>
     * @param DBInstanceType <p>实例类型，类型有：</p><li>primary：主实例</li><li>readonly：只读实例</li><li>guard：灾备实例</li><li>temp：临时实例</li>
     */
    public void setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
    }

    /**
     * Get <p>实例版本，目前只支持standard（双机高可用版, 一主一从）。</p> 
     * @return DBInstanceVersion <p>实例版本，目前只支持standard（双机高可用版, 一主一从）。</p>
     */
    public String getDBInstanceVersion() {
        return this.DBInstanceVersion;
    }

    /**
     * Set <p>实例版本，目前只支持standard（双机高可用版, 一主一从）。</p>
     * @param DBInstanceVersion <p>实例版本，目前只支持standard（双机高可用版, 一主一从）。</p>
     */
    public void setDBInstanceVersion(String DBInstanceVersion) {
        this.DBInstanceVersion = DBInstanceVersion;
    }

    /**
     * Get <p>实例字符集，目前只支持：</p><li> UTF8</li><li> LATIN1</li> 
     * @return DBCharset <p>实例字符集，目前只支持：</p><li> UTF8</li><li> LATIN1</li>
     */
    public String getDBCharset() {
        return this.DBCharset;
    }

    /**
     * Set <p>实例字符集，目前只支持：</p><li> UTF8</li><li> LATIN1</li>
     * @param DBCharset <p>实例字符集，目前只支持：</p><li> UTF8</li><li> LATIN1</li>
     */
    public void setDBCharset(String DBCharset) {
        this.DBCharset = DBCharset;
    }

    /**
     * Get <p>实例创建时间。</p> 
     * @return CreateTime <p>实例创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>实例创建时间。</p>
     * @param CreateTime <p>实例创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>实例执行最后一次更新的时间。</p> 
     * @return UpdateTime <p>实例执行最后一次更新的时间。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>实例执行最后一次更新的时间。</p>
     * @param UpdateTime <p>实例执行最后一次更新的时间。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>实例到期时间。</p> 
     * @return ExpireTime <p>实例到期时间。</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>实例到期时间。</p>
     * @param ExpireTime <p>实例到期时间。</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>实例隔离时间。</p> 
     * @return IsolatedTime <p>实例隔离时间。</p>
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set <p>实例隔离时间。</p>
     * @param IsolatedTime <p>实例隔离时间。</p>
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get <p>计费模式：</p><li>prepaid：包年包月,预付费</li><li>postpaid：按量计费，后付费</li> 
     * @return PayType <p>计费模式：</p><li>prepaid：包年包月,预付费</li><li>postpaid：按量计费，后付费</li>
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set <p>计费模式：</p><li>prepaid：包年包月,预付费</li><li>postpaid：按量计费，后付费</li>
     * @param PayType <p>计费模式：</p><li>prepaid：包年包月,预付费</li><li>postpaid：按量计费，后付费</li>
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get <p>是否自动续费：</p><li>0：手动续费</li><li>1：自动续费</li>默认值：0 
     * @return AutoRenew <p>是否自动续费：</p><li>0：手动续费</li><li>1：自动续费</li>默认值：0
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>是否自动续费：</p><li>0：手动续费</li><li>1：自动续费</li>默认值：0
     * @param AutoRenew <p>是否自动续费：</p><li>0：手动续费</li><li>1：自动续费</li>默认值：0
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>实例网络连接信息。</p> 
     * @return DBInstanceNetInfo <p>实例网络连接信息。</p>
     */
    public DBInstanceNetInfo [] getDBInstanceNetInfo() {
        return this.DBInstanceNetInfo;
    }

    /**
     * Set <p>实例网络连接信息。</p>
     * @param DBInstanceNetInfo <p>实例网络连接信息。</p>
     */
    public void setDBInstanceNetInfo(DBInstanceNetInfo [] DBInstanceNetInfo) {
        this.DBInstanceNetInfo = DBInstanceNetInfo;
    }

    /**
     * Get <p>机器类型。</p> 
     * @return Type <p>机器类型。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>机器类型。</p>
     * @param Type <p>机器类型。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>用户的AppId。</p> 
     * @return AppId <p>用户的AppId。</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户的AppId。</p>
     * @param AppId <p>用户的AppId。</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>实例的Uid。</p> 
     * @return Uid <p>实例的Uid。</p>
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set <p>实例的Uid。</p>
     * @param Uid <p>实例的Uid。</p>
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get <p>项目ID。</p> 
     * @return ProjectId <p>项目ID。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID。</p>
     * @param ProjectId <p>项目ID。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>实例绑定的标签信息。</p> 
     * @return TagList <p>实例绑定的标签信息。</p>
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>实例绑定的标签信息。</p>
     * @param TagList <p>实例绑定的标签信息。</p>
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>主实例信息，仅在实例为只读实例时返回。</p> 
     * @return MasterDBInstanceId <p>主实例信息，仅在实例为只读实例时返回。</p>
     */
    public String getMasterDBInstanceId() {
        return this.MasterDBInstanceId;
    }

    /**
     * Set <p>主实例信息，仅在实例为只读实例时返回。</p>
     * @param MasterDBInstanceId <p>主实例信息，仅在实例为只读实例时返回。</p>
     */
    public void setMasterDBInstanceId(String MasterDBInstanceId) {
        this.MasterDBInstanceId = MasterDBInstanceId;
    }

    /**
     * Get <p>只读实例数量。</p> 
     * @return ReadOnlyInstanceNum <p>只读实例数量。</p>
     */
    public Long getReadOnlyInstanceNum() {
        return this.ReadOnlyInstanceNum;
    }

    /**
     * Set <p>只读实例数量。</p>
     * @param ReadOnlyInstanceNum <p>只读实例数量。</p>
     */
    public void setReadOnlyInstanceNum(Long ReadOnlyInstanceNum) {
        this.ReadOnlyInstanceNum = ReadOnlyInstanceNum;
    }

    /**
     * Get <p>只读实例在只读组中的状态。</p> 
     * @return StatusInReadonlyGroup <p>只读实例在只读组中的状态。</p>
     */
    public String getStatusInReadonlyGroup() {
        return this.StatusInReadonlyGroup;
    }

    /**
     * Set <p>只读实例在只读组中的状态。</p>
     * @param StatusInReadonlyGroup <p>只读实例在只读组中的状态。</p>
     */
    public void setStatusInReadonlyGroup(String StatusInReadonlyGroup) {
        this.StatusInReadonlyGroup = StatusInReadonlyGroup;
    }

    /**
     * Get <p>下线时间。</p> 
     * @return OfflineTime <p>下线时间。</p>
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set <p>下线时间。</p>
     * @param OfflineTime <p>下线时间。</p>
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get <p>实例的节点信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBNodeSet <p>实例的节点信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DBNode [] getDBNodeSet() {
        return this.DBNodeSet;
    }

    /**
     * Set <p>实例的节点信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBNodeSet <p>实例的节点信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBNodeSet(DBNode [] DBNodeSet) {
        this.DBNodeSet = DBNodeSet;
    }

    /**
     * Get <p>实例是否支持TDE数据加密：</p><li>0：不支持</li><li>1：支持</li>默认值：0TDE数据加密可参考[数据透明加密概述](https://cloud.tencent.com/document/product/409/71748) 
     * @return IsSupportTDE <p>实例是否支持TDE数据加密：</p><li>0：不支持</li><li>1：支持</li>默认值：0TDE数据加密可参考[数据透明加密概述](https://cloud.tencent.com/document/product/409/71748)
     */
    public Long getIsSupportTDE() {
        return this.IsSupportTDE;
    }

    /**
     * Set <p>实例是否支持TDE数据加密：</p><li>0：不支持</li><li>1：支持</li>默认值：0TDE数据加密可参考[数据透明加密概述](https://cloud.tencent.com/document/product/409/71748)
     * @param IsSupportTDE <p>实例是否支持TDE数据加密：</p><li>0：不支持</li><li>1：支持</li>默认值：0TDE数据加密可参考[数据透明加密概述](https://cloud.tencent.com/document/product/409/71748)
     */
    public void setIsSupportTDE(Long IsSupportTDE) {
        this.IsSupportTDE = IsSupportTDE;
    }

    /**
     * Get <p>数据库引擎，支持：</p><li>postgresql：云数据库PostgreSQL</li><li>mssql_compatible：MSSQL兼容-云数据库PostgreSQL</li>默认值：postgresql 
     * @return DBEngine <p>数据库引擎，支持：</p><li>postgresql：云数据库PostgreSQL</li><li>mssql_compatible：MSSQL兼容-云数据库PostgreSQL</li>默认值：postgresql
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set <p>数据库引擎，支持：</p><li>postgresql：云数据库PostgreSQL</li><li>mssql_compatible：MSSQL兼容-云数据库PostgreSQL</li>默认值：postgresql
     * @param DBEngine <p>数据库引擎，支持：</p><li>postgresql：云数据库PostgreSQL</li><li>mssql_compatible：MSSQL兼容-云数据库PostgreSQL</li>默认值：postgresql
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    /**
     * Get <p>数据库引擎的配置信息，配置格式如下：<br>{&quot;$key1&quot;:&quot;$value1&quot;, &quot;$key2&quot;:&quot;$value2&quot;}<br>各引擎支持如下：<br>mssql_compatible引擎：</p><li>migrationMode：数据库模式，可选参数，可取值：single-db（单数据库模式），multi-db（多数据库模式）。默认为single-db。</li><li>defaultLocale：排序区域规则，可选参数，在初始化后不可修改，默认为en_US，可选值如下："af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN"。</li><li>serverCollationName：排序规则名称，可选参数，在初始化后不可修改，默认为sql_latin1_general_cp1_ci_as，可选值如下："bbf_unicode_general_ci_as", "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as"。</li> 
     * @return DBEngineConfig <p>数据库引擎的配置信息，配置格式如下：<br>{&quot;$key1&quot;:&quot;$value1&quot;, &quot;$key2&quot;:&quot;$value2&quot;}<br>各引擎支持如下：<br>mssql_compatible引擎：</p><li>migrationMode：数据库模式，可选参数，可取值：single-db（单数据库模式），multi-db（多数据库模式）。默认为single-db。</li><li>defaultLocale：排序区域规则，可选参数，在初始化后不可修改，默认为en_US，可选值如下："af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN"。</li><li>serverCollationName：排序规则名称，可选参数，在初始化后不可修改，默认为sql_latin1_general_cp1_ci_as，可选值如下："bbf_unicode_general_ci_as", "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as"。</li>
     */
    public String getDBEngineConfig() {
        return this.DBEngineConfig;
    }

    /**
     * Set <p>数据库引擎的配置信息，配置格式如下：<br>{&quot;$key1&quot;:&quot;$value1&quot;, &quot;$key2&quot;:&quot;$value2&quot;}<br>各引擎支持如下：<br>mssql_compatible引擎：</p><li>migrationMode：数据库模式，可选参数，可取值：single-db（单数据库模式），multi-db（多数据库模式）。默认为single-db。</li><li>defaultLocale：排序区域规则，可选参数，在初始化后不可修改，默认为en_US，可选值如下："af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN"。</li><li>serverCollationName：排序规则名称，可选参数，在初始化后不可修改，默认为sql_latin1_general_cp1_ci_as，可选值如下："bbf_unicode_general_ci_as", "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as"。</li>
     * @param DBEngineConfig <p>数据库引擎的配置信息，配置格式如下：<br>{&quot;$key1&quot;:&quot;$value1&quot;, &quot;$key2&quot;:&quot;$value2&quot;}<br>各引擎支持如下：<br>mssql_compatible引擎：</p><li>migrationMode：数据库模式，可选参数，可取值：single-db（单数据库模式），multi-db（多数据库模式）。默认为single-db。</li><li>defaultLocale：排序区域规则，可选参数，在初始化后不可修改，默认为en_US，可选值如下："af_ZA", "sq_AL", "ar_DZ", "ar_BH", "ar_EG", "ar_IQ", "ar_JO", "ar_KW", "ar_LB", "ar_LY", "ar_MA", "ar_OM", "ar_QA", "ar_SA", "ar_SY", "ar_TN", "ar_AE", "ar_YE", "hy_AM", "az_Cyrl_AZ", "az_Latn_AZ", "eu_ES", "be_BY", "bg_BG", "ca_ES", "zh_HK", "zh_MO", "zh_CN", "zh_SG", "zh_TW", "hr_HR", "cs_CZ", "da_DK", "nl_BE", "nl_NL", "en_AU", "en_BZ", "en_CA", "en_IE", "en_JM", "en_NZ", "en_PH", "en_ZA", "en_TT", "en_GB", "en_US", "en_ZW", "et_EE", "fo_FO", "fa_IR", "fi_FI", "fr_BE", "fr_CA", "fr_FR", "fr_LU", "fr_MC", "fr_CH", "mk_MK", "ka_GE", "de_AT", "de_DE", "de_LI", "de_LU", "de_CH", "el_GR", "gu_IN", "he_IL", "hi_IN", "hu_HU", "is_IS", "id_ID", "it_IT", "it_CH", "ja_JP", "kn_IN", "kok_IN", "ko_KR", "ky_KG", "lv_LV", "lt_LT", "ms_BN", "ms_MY", "mr_IN", "mn_MN", "nb_NO", "nn_NO", "pl_PL", "pt_BR", "pt_PT", "pa_IN", "ro_RO", "ru_RU", "sa_IN", "sr_Cyrl_RS", "sr_Latn_RS", "sk_SK", "sl_SI", "es_AR", "es_BO", "es_CL", "es_CO", "es_CR", "es_DO", "es_EC", "es_SV", "es_GT", "es_HN", "es_MX", "es_NI", "es_PA", "es_PY","es_PE", "es_PR", "es_ES", "es_TRADITIONAL", "es_UY", "es_VE", "sw_KE", "sv_FI", "sv_SE", "tt_RU", "te_IN", "th_TH", "tr_TR", "uk_UA", "ur_IN", "ur_PK", "uz_Cyrl_UZ", "uz_Latn_UZ", "vi_VN"。</li><li>serverCollationName：排序规则名称，可选参数，在初始化后不可修改，默认为sql_latin1_general_cp1_ci_as，可选值如下："bbf_unicode_general_ci_as", "bbf_unicode_cp1_ci_as", "bbf_unicode_CP1250_ci_as", "bbf_unicode_CP1251_ci_as", "bbf_unicode_cp1253_ci_as", "bbf_unicode_cp1254_ci_as", "bbf_unicode_cp1255_ci_as", "bbf_unicode_cp1256_ci_as", "bbf_unicode_cp1257_ci_as", "bbf_unicode_cp1258_ci_as", "bbf_unicode_cp874_ci_as", "sql_latin1_general_cp1250_ci_as", "sql_latin1_general_cp1251_ci_as", "sql_latin1_general_cp1_ci_as", "sql_latin1_general_cp1253_ci_as", "sql_latin1_general_cp1254_ci_as", "sql_latin1_general_cp1255_ci_as","sql_latin1_general_cp1256_ci_as", "sql_latin1_general_cp1257_ci_as", "sql_latin1_general_cp1258_ci_as", "chinese_prc_ci_as", "cyrillic_general_ci_as", "finnish_swedish_ci_as", "french_ci_as", "japanese_ci_as", "korean_wansung_ci_as", "latin1_general_ci_as", "modern_spanish_ci_as", "polish_ci_as", "thai_ci_as", "traditional_spanish_ci_as", "turkish_ci_as", "ukrainian_ci_as", "vietnamese_ci_as"。</li>
     */
    public void setDBEngineConfig(String DBEngineConfig) {
        this.DBEngineConfig = DBEngineConfig;
    }

    /**
     * Get <p>实例网络信息列表（此字段已废弃）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkAccessList <p>实例网络信息列表（此字段已废弃）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetworkAccess [] getNetworkAccessList() {
        return this.NetworkAccessList;
    }

    /**
     * Set <p>实例网络信息列表（此字段已废弃）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkAccessList <p>实例网络信息列表（此字段已废弃）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkAccessList(NetworkAccess [] NetworkAccessList) {
        this.NetworkAccessList = NetworkAccessList;
    }

    /**
     * Get <p>实例是否支持Ipv6：</p><li>0：否</li><li>1：是</li>默认值：0 
     * @return SupportIpv6 <p>实例是否支持Ipv6：</p><li>0：否</li><li>1：是</li>默认值：0
     */
    public Long getSupportIpv6() {
        return this.SupportIpv6;
    }

    /**
     * Set <p>实例是否支持Ipv6：</p><li>0：否</li><li>1：是</li>默认值：0
     * @param SupportIpv6 <p>实例是否支持Ipv6：</p><li>0：否</li><li>1：是</li>默认值：0
     */
    public void setSupportIpv6(Long SupportIpv6) {
        this.SupportIpv6 = SupportIpv6;
    }

    /**
     * Get <p>实例已经弹性扩容的cpu核数</p> 
     * @return ExpandedCpu <p>实例已经弹性扩容的cpu核数</p>
     */
    public Long getExpandedCpu() {
        return this.ExpandedCpu;
    }

    /**
     * Set <p>实例已经弹性扩容的cpu核数</p>
     * @param ExpandedCpu <p>实例已经弹性扩容的cpu核数</p>
     */
    public void setExpandedCpu(Long ExpandedCpu) {
        this.ExpandedCpu = ExpandedCpu;
    }

    /**
     * Get <p>实例是否开启删除保护，取值如下：</p><ul><li>true：开启删除保护</li><li>false：关闭删除保护</li></ul> 
     * @return DeletionProtection <p>实例是否开启删除保护，取值如下：</p><ul><li>true：开启删除保护</li><li>false：关闭删除保护</li></ul>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>实例是否开启删除保护，取值如下：</p><ul><li>true：开启删除保护</li><li>false：关闭删除保护</li></ul>
     * @param DeletionProtection <p>实例是否开启删除保护，取值如下：</p><ul><li>true：开启删除保护</li><li>false：关闭删除保护</li></ul>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    public DBInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBInstance(DBInstance source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.DBInstanceName != null) {
            this.DBInstanceName = new String(source.DBInstanceName);
        }
        if (source.DBInstanceStatus != null) {
            this.DBInstanceStatus = new String(source.DBInstanceStatus);
        }
        if (source.DBInstanceMemory != null) {
            this.DBInstanceMemory = new Long(source.DBInstanceMemory);
        }
        if (source.DBInstanceStorage != null) {
            this.DBInstanceStorage = new Long(source.DBInstanceStorage);
        }
        if (source.DBInstanceCpu != null) {
            this.DBInstanceCpu = new Long(source.DBInstanceCpu);
        }
        if (source.DBInstanceClass != null) {
            this.DBInstanceClass = new String(source.DBInstanceClass);
        }
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.DBKernelVersion != null) {
            this.DBKernelVersion = new String(source.DBKernelVersion);
        }
        if (source.DBInstanceType != null) {
            this.DBInstanceType = new String(source.DBInstanceType);
        }
        if (source.DBInstanceVersion != null) {
            this.DBInstanceVersion = new String(source.DBInstanceVersion);
        }
        if (source.DBCharset != null) {
            this.DBCharset = new String(source.DBCharset);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.DBInstanceNetInfo != null) {
            this.DBInstanceNetInfo = new DBInstanceNetInfo[source.DBInstanceNetInfo.length];
            for (int i = 0; i < source.DBInstanceNetInfo.length; i++) {
                this.DBInstanceNetInfo[i] = new DBInstanceNetInfo(source.DBInstanceNetInfo[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.MasterDBInstanceId != null) {
            this.MasterDBInstanceId = new String(source.MasterDBInstanceId);
        }
        if (source.ReadOnlyInstanceNum != null) {
            this.ReadOnlyInstanceNum = new Long(source.ReadOnlyInstanceNum);
        }
        if (source.StatusInReadonlyGroup != null) {
            this.StatusInReadonlyGroup = new String(source.StatusInReadonlyGroup);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.DBNodeSet != null) {
            this.DBNodeSet = new DBNode[source.DBNodeSet.length];
            for (int i = 0; i < source.DBNodeSet.length; i++) {
                this.DBNodeSet[i] = new DBNode(source.DBNodeSet[i]);
            }
        }
        if (source.IsSupportTDE != null) {
            this.IsSupportTDE = new Long(source.IsSupportTDE);
        }
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
        if (source.DBEngineConfig != null) {
            this.DBEngineConfig = new String(source.DBEngineConfig);
        }
        if (source.NetworkAccessList != null) {
            this.NetworkAccessList = new NetworkAccess[source.NetworkAccessList.length];
            for (int i = 0; i < source.NetworkAccessList.length; i++) {
                this.NetworkAccessList[i] = new NetworkAccess(source.NetworkAccessList[i]);
            }
        }
        if (source.SupportIpv6 != null) {
            this.SupportIpv6 = new Long(source.SupportIpv6);
        }
        if (source.ExpandedCpu != null) {
            this.ExpandedCpu = new Long(source.ExpandedCpu);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "DBInstanceName", this.DBInstanceName);
        this.setParamSimple(map, prefix + "DBInstanceStatus", this.DBInstanceStatus);
        this.setParamSimple(map, prefix + "DBInstanceMemory", this.DBInstanceMemory);
        this.setParamSimple(map, prefix + "DBInstanceStorage", this.DBInstanceStorage);
        this.setParamSimple(map, prefix + "DBInstanceCpu", this.DBInstanceCpu);
        this.setParamSimple(map, prefix + "DBInstanceClass", this.DBInstanceClass);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "DBKernelVersion", this.DBKernelVersion);
        this.setParamSimple(map, prefix + "DBInstanceType", this.DBInstanceType);
        this.setParamSimple(map, prefix + "DBInstanceVersion", this.DBInstanceVersion);
        this.setParamSimple(map, prefix + "DBCharset", this.DBCharset);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamArrayObj(map, prefix + "DBInstanceNetInfo.", this.DBInstanceNetInfo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "MasterDBInstanceId", this.MasterDBInstanceId);
        this.setParamSimple(map, prefix + "ReadOnlyInstanceNum", this.ReadOnlyInstanceNum);
        this.setParamSimple(map, prefix + "StatusInReadonlyGroup", this.StatusInReadonlyGroup);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamArrayObj(map, prefix + "DBNodeSet.", this.DBNodeSet);
        this.setParamSimple(map, prefix + "IsSupportTDE", this.IsSupportTDE);
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);
        this.setParamSimple(map, prefix + "DBEngineConfig", this.DBEngineConfig);
        this.setParamArrayObj(map, prefix + "NetworkAccessList.", this.NetworkAccessList);
        this.setParamSimple(map, prefix + "SupportIpv6", this.SupportIpv6);
        this.setParamSimple(map, prefix + "ExpandedCpu", this.ExpandedCpu);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);

    }
}

