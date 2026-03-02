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

public class CreateInstancesRequest extends AbstractModel {

    /**
    * <p>实例所属主可用区， 如：ap-guangzhou-3；若需要支持多可用区，在DBNodeSet.N字段中进行添加主可用区和备可用区信息；<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>售卖规格码。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/409/89019">DescribeClasses</a>的返回值中的SpecCode字段来获取。</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>实例磁盘容量大小，单位：GB。该参数的设置步长为10。</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>购买实例数量，取值范围：[1-10]。一次性购买支持最大数量10个，若超过该数量，可进行多次调用进行购买。</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>购买时长，单位：月。</p><li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36</li><li>后付费：只支持1</li>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>实例字符集，目前只支持：</p><li> UTF8</li><li> LATIN1</li>
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * <p>实例根账号用户名，具体规范如下：</p><li>用户名需要1-16个字符，只能由字母、数字或下划线组成</li><li>不能为postgres</li><li>不能由数字和pg_开头</li><li>所有规则均不区分大小写</li>
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * <p>实例根账号用户名对应的密码，长度8 ~ 32位，推荐使用12位以上的密码;不能以&quot; / &quot;开头;<br>必须包含以下四项，字符种类:</p><li>小写字母： [a ~ z]</li><li>大写字母：[A ～ Z]</li><li>数字：0 - 9</li><li>特殊字符：()`~!@#$%^&amp;*-+=_|{}[]:;'&lt;&gt;,.?/</li>
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * <p>PostgreSQL大版本号（该参数当前必传），版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取。目前支持10，11，12，13，14，15这几个大版本，详情见<a href="https://cloud.tencent.com/document/product/409/67018">内核版本概述</a>。<br>输入该参数时，会基于此大版本号创建对应的最新小版本的最新内核版本号实例。</p>
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * <p>PostgreSQL社区大版本+小版本号。<br>一般场景不推荐传入该参数。如需指定，只能传当前大版本号下最新小版本号。</p>
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * <p>PostgreSQL内核版本号。<br>一般场景不推荐传入该参数。如需指定，只能传当前大版本号下最新内核版本号。</p>
    */
    @SerializedName("DBKernelVersion")
    @Expose
    private String DBKernelVersion;

    /**
    * <p>实例计费类型，目前支持：</p><li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：后付费，即按量计费</li>默认值：PREPAID
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>私有网络ID，形如vpc-xxxxxxxx（该参数当前必传）。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a> ，从接口返回中的unVpcId字段获取。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络子网ID，形如subnet-xxxxxxxx（该参数当前必传）。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>实例节点部署信息，支持多可用区部署时需要指定每个节点的部署可用区信息。<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
    */
    @SerializedName("DBNodeSet")
    @Expose
    private DBNode [] DBNodeSet;

    /**
    * <p>续费标记：</p><li>0：手动续费</li><li>1：自动续费</li>默认值：0
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>是否自动使用代金券：</p><li>0：否</li><li>1：是</li>默认值：0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * <p>代金券ID列表，目前仅支持指定一张代金券。</p>
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * <p>项目ID。默认取之为0，表示归属默认项目。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>活动ID。</p>
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * <p>实例名称，仅支持长度小于60的中文/英文/数字/&quot;_&quot;/&quot;-&quot;，不指定实例名称则默认显示&quot;未命名&quot;。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>实例需要绑定的Tag信息，默认为空；可以通过调用 <a href="https://cloud.tencent.com/document/api/651/35316">DescribeTags</a> 返回值中的 Tags 字段来获取。</p>
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * <p>实例所属安全组，该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>是否需要支持数据透明加密：</p><li>0：否</li><li>1：是</li>默认值：0参考[数据透明加密概述](https://cloud.tencent.com/document/product/409/71748)
    */
    @SerializedName("NeedSupportTDE")
    @Expose
    private Long NeedSupportTDE;

    /**
    * <p>自定义密钥的KeyId，若选择自定义密匙加密，则需要传入自定义密匙的KeyId，KeyId是CMK的唯一标识。<br>KeyId创建获取相关参考<a href="https://cloud.tencent.com/document/product/409/71749">开启透明数据加密</a></p>
    */
    @SerializedName("KMSKeyId")
    @Expose
    private String KMSKeyId;

    /**
    * <p>使用KMS服务的地域，KMSRegion为空默认使用本地域的KMS，本地域不支持的情况下需自选其他KMS支持的地域。<br>KMSRegion相关介绍参考<a href="https://cloud.tencent.com/document/product/409/71749">开启透明数据加密</a></p>
    */
    @SerializedName("KMSRegion")
    @Expose
    private String KMSRegion;

    /**
    * <p>指定KMS服务的集群，KMSClusterId为空使用默认集群的KMS，若选择指定KMS集群，则需要传入KMSClusterId。 KMSClusterId相关介绍参考开启透明数据加密</p>
    */
    @SerializedName("KMSClusterId")
    @Expose
    private String KMSClusterId;

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
    * <p>主从同步方式，支持： </p><li>Semi-sync：半同步</li><li>Async：异步</li>主实例默认值：Semi-sync只读实例默认值：Async
    */
    @SerializedName("SyncMode")
    @Expose
    private String SyncMode;

    /**
    * <p>是否需要支持Ipv6：</p><li>0：否</li><li>1：是</li>默认值：0
    */
    @SerializedName("NeedSupportIpv6")
    @Expose
    private Long NeedSupportIpv6;

    /**
    * <p>实例是否开启删除保护: true-开启删除保护；false-关闭删除保护。</p>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
     * Get <p>实例所属主可用区， 如：ap-guangzhou-3；若需要支持多可用区，在DBNodeSet.N字段中进行添加主可用区和备可用区信息；<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p> 
     * @return Zone <p>实例所属主可用区， 如：ap-guangzhou-3；若需要支持多可用区，在DBNodeSet.N字段中进行添加主可用区和备可用区信息；<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>实例所属主可用区， 如：ap-guangzhou-3；若需要支持多可用区，在DBNodeSet.N字段中进行添加主可用区和备可用区信息；<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
     * @param Zone <p>实例所属主可用区， 如：ap-guangzhou-3；若需要支持多可用区，在DBNodeSet.N字段中进行添加主可用区和备可用区信息；<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>售卖规格码。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/409/89019">DescribeClasses</a>的返回值中的SpecCode字段来获取。</p> 
     * @return SpecCode <p>售卖规格码。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/409/89019">DescribeClasses</a>的返回值中的SpecCode字段来获取。</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>售卖规格码。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/409/89019">DescribeClasses</a>的返回值中的SpecCode字段来获取。</p>
     * @param SpecCode <p>售卖规格码。该参数可以通过调用<a href="https://cloud.tencent.com/document/api/409/89019">DescribeClasses</a>的返回值中的SpecCode字段来获取。</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>实例磁盘容量大小，单位：GB。该参数的设置步长为10。</p> 
     * @return Storage <p>实例磁盘容量大小，单位：GB。该参数的设置步长为10。</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>实例磁盘容量大小，单位：GB。该参数的设置步长为10。</p>
     * @param Storage <p>实例磁盘容量大小，单位：GB。该参数的设置步长为10。</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>购买实例数量，取值范围：[1-10]。一次性购买支持最大数量10个，若超过该数量，可进行多次调用进行购买。</p> 
     * @return InstanceCount <p>购买实例数量，取值范围：[1-10]。一次性购买支持最大数量10个，若超过该数量，可进行多次调用进行购买。</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>购买实例数量，取值范围：[1-10]。一次性购买支持最大数量10个，若超过该数量，可进行多次调用进行购买。</p>
     * @param InstanceCount <p>购买实例数量，取值范围：[1-10]。一次性购买支持最大数量10个，若超过该数量，可进行多次调用进行购买。</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>购买时长，单位：月。</p><li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36</li><li>后付费：只支持1</li> 
     * @return Period <p>购买时长，单位：月。</p><li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36</li><li>后付费：只支持1</li>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>购买时长，单位：月。</p><li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36</li><li>后付费：只支持1</li>
     * @param Period <p>购买时长，单位：月。</p><li>预付费：支持1,2,3,4,5,6,7,8,9,10,11,12,24,36</li><li>后付费：只支持1</li>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>实例字符集，目前只支持：</p><li> UTF8</li><li> LATIN1</li> 
     * @return Charset <p>实例字符集，目前只支持：</p><li> UTF8</li><li> LATIN1</li>
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set <p>实例字符集，目前只支持：</p><li> UTF8</li><li> LATIN1</li>
     * @param Charset <p>实例字符集，目前只支持：</p><li> UTF8</li><li> LATIN1</li>
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get <p>实例根账号用户名，具体规范如下：</p><li>用户名需要1-16个字符，只能由字母、数字或下划线组成</li><li>不能为postgres</li><li>不能由数字和pg_开头</li><li>所有规则均不区分大小写</li> 
     * @return AdminName <p>实例根账号用户名，具体规范如下：</p><li>用户名需要1-16个字符，只能由字母、数字或下划线组成</li><li>不能为postgres</li><li>不能由数字和pg_开头</li><li>所有规则均不区分大小写</li>
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set <p>实例根账号用户名，具体规范如下：</p><li>用户名需要1-16个字符，只能由字母、数字或下划线组成</li><li>不能为postgres</li><li>不能由数字和pg_开头</li><li>所有规则均不区分大小写</li>
     * @param AdminName <p>实例根账号用户名，具体规范如下：</p><li>用户名需要1-16个字符，只能由字母、数字或下划线组成</li><li>不能为postgres</li><li>不能由数字和pg_开头</li><li>所有规则均不区分大小写</li>
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get <p>实例根账号用户名对应的密码，长度8 ~ 32位，推荐使用12位以上的密码;不能以&quot; / &quot;开头;<br>必须包含以下四项，字符种类:</p><li>小写字母： [a ~ z]</li><li>大写字母：[A ～ Z]</li><li>数字：0 - 9</li><li>特殊字符：()`~!@#$%^&amp;*-+=_|{}[]:;'&lt;&gt;,.?/</li> 
     * @return AdminPassword <p>实例根账号用户名对应的密码，长度8 ~ 32位，推荐使用12位以上的密码;不能以&quot; / &quot;开头;<br>必须包含以下四项，字符种类:</p><li>小写字母： [a ~ z]</li><li>大写字母：[A ～ Z]</li><li>数字：0 - 9</li><li>特殊字符：()`~!@#$%^&amp;*-+=_|{}[]:;'&lt;&gt;,.?/</li>
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set <p>实例根账号用户名对应的密码，长度8 ~ 32位，推荐使用12位以上的密码;不能以&quot; / &quot;开头;<br>必须包含以下四项，字符种类:</p><li>小写字母： [a ~ z]</li><li>大写字母：[A ～ Z]</li><li>数字：0 - 9</li><li>特殊字符：()`~!@#$%^&amp;*-+=_|{}[]:;'&lt;&gt;,.?/</li>
     * @param AdminPassword <p>实例根账号用户名对应的密码，长度8 ~ 32位，推荐使用12位以上的密码;不能以&quot; / &quot;开头;<br>必须包含以下四项，字符种类:</p><li>小写字母： [a ~ z]</li><li>大写字母：[A ～ Z]</li><li>数字：0 - 9</li><li>特殊字符：()`~!@#$%^&amp;*-+=_|{}[]:;'&lt;&gt;,.?/</li>
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get <p>PostgreSQL大版本号（该参数当前必传），版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取。目前支持10，11，12，13，14，15这几个大版本，详情见<a href="https://cloud.tencent.com/document/product/409/67018">内核版本概述</a>。<br>输入该参数时，会基于此大版本号创建对应的最新小版本的最新内核版本号实例。</p> 
     * @return DBMajorVersion <p>PostgreSQL大版本号（该参数当前必传），版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取。目前支持10，11，12，13，14，15这几个大版本，详情见<a href="https://cloud.tencent.com/document/product/409/67018">内核版本概述</a>。<br>输入该参数时，会基于此大版本号创建对应的最新小版本的最新内核版本号实例。</p>
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set <p>PostgreSQL大版本号（该参数当前必传），版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取。目前支持10，11，12，13，14，15这几个大版本，详情见<a href="https://cloud.tencent.com/document/product/409/67018">内核版本概述</a>。<br>输入该参数时，会基于此大版本号创建对应的最新小版本的最新内核版本号实例。</p>
     * @param DBMajorVersion <p>PostgreSQL大版本号（该参数当前必传），版本信息可从<a href="https://cloud.tencent.com/document/api/409/89018">DescribeDBVersions</a>获取。目前支持10，11，12，13，14，15这几个大版本，详情见<a href="https://cloud.tencent.com/document/product/409/67018">内核版本概述</a>。<br>输入该参数时，会基于此大版本号创建对应的最新小版本的最新内核版本号实例。</p>
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get <p>PostgreSQL社区大版本+小版本号。<br>一般场景不推荐传入该参数。如需指定，只能传当前大版本号下最新小版本号。</p> 
     * @return DBVersion <p>PostgreSQL社区大版本+小版本号。<br>一般场景不推荐传入该参数。如需指定，只能传当前大版本号下最新小版本号。</p>
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set <p>PostgreSQL社区大版本+小版本号。<br>一般场景不推荐传入该参数。如需指定，只能传当前大版本号下最新小版本号。</p>
     * @param DBVersion <p>PostgreSQL社区大版本+小版本号。<br>一般场景不推荐传入该参数。如需指定，只能传当前大版本号下最新小版本号。</p>
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get <p>PostgreSQL内核版本号。<br>一般场景不推荐传入该参数。如需指定，只能传当前大版本号下最新内核版本号。</p> 
     * @return DBKernelVersion <p>PostgreSQL内核版本号。<br>一般场景不推荐传入该参数。如需指定，只能传当前大版本号下最新内核版本号。</p>
     */
    public String getDBKernelVersion() {
        return this.DBKernelVersion;
    }

    /**
     * Set <p>PostgreSQL内核版本号。<br>一般场景不推荐传入该参数。如需指定，只能传当前大版本号下最新内核版本号。</p>
     * @param DBKernelVersion <p>PostgreSQL内核版本号。<br>一般场景不推荐传入该参数。如需指定，只能传当前大版本号下最新内核版本号。</p>
     */
    public void setDBKernelVersion(String DBKernelVersion) {
        this.DBKernelVersion = DBKernelVersion;
    }

    /**
     * Get <p>实例计费类型，目前支持：</p><li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：后付费，即按量计费</li>默认值：PREPAID 
     * @return InstanceChargeType <p>实例计费类型，目前支持：</p><li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：后付费，即按量计费</li>默认值：PREPAID
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>实例计费类型，目前支持：</p><li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：后付费，即按量计费</li>默认值：PREPAID
     * @param InstanceChargeType <p>实例计费类型，目前支持：</p><li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：后付费，即按量计费</li>默认值：PREPAID
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>私有网络ID，形如vpc-xxxxxxxx（该参数当前必传）。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a> ，从接口返回中的unVpcId字段获取。</p> 
     * @return VpcId <p>私有网络ID，形如vpc-xxxxxxxx（该参数当前必传）。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a> ，从接口返回中的unVpcId字段获取。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID，形如vpc-xxxxxxxx（该参数当前必传）。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a> ，从接口返回中的unVpcId字段获取。</p>
     * @param VpcId <p>私有网络ID，形如vpc-xxxxxxxx（该参数当前必传）。有效的VpcId可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a> ，从接口返回中的unVpcId字段获取。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络子网ID，形如subnet-xxxxxxxx（该参数当前必传）。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p> 
     * @return SubnetId <p>私有网络子网ID，形如subnet-xxxxxxxx（该参数当前必传）。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>私有网络子网ID，形如subnet-xxxxxxxx（该参数当前必传）。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
     * @param SubnetId <p>私有网络子网ID，形如subnet-xxxxxxxx（该参数当前必传）。有效的私有网络子网ID可通过登录控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets </a>，从接口返回中的unSubnetId字段获取。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>实例节点部署信息，支持多可用区部署时需要指定每个节点的部署可用区信息。<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p> 
     * @return DBNodeSet <p>实例节点部署信息，支持多可用区部署时需要指定每个节点的部署可用区信息。<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
     */
    public DBNode [] getDBNodeSet() {
        return this.DBNodeSet;
    }

    /**
     * Set <p>实例节点部署信息，支持多可用区部署时需要指定每个节点的部署可用区信息。<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
     * @param DBNodeSet <p>实例节点部署信息，支持多可用区部署时需要指定每个节点的部署可用区信息。<br>可用区信息可以通过调用 <a href="https://cloud.tencent.com/document/api/409/16769">DescribeZones</a> 接口的返回值中的Zone字段来获取。</p>
     */
    public void setDBNodeSet(DBNode [] DBNodeSet) {
        this.DBNodeSet = DBNodeSet;
    }

    /**
     * Get <p>续费标记：</p><li>0：手动续费</li><li>1：自动续费</li>默认值：0 
     * @return AutoRenewFlag <p>续费标记：</p><li>0：手动续费</li><li>1：自动续费</li>默认值：0
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>续费标记：</p><li>0：手动续费</li><li>1：自动续费</li>默认值：0
     * @param AutoRenewFlag <p>续费标记：</p><li>0：手动续费</li><li>1：自动续费</li>默认值：0
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>是否自动使用代金券：</p><li>0：否</li><li>1：是</li>默认值：0 
     * @return AutoVoucher <p>是否自动使用代金券：</p><li>0：否</li><li>1：是</li>默认值：0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>是否自动使用代金券：</p><li>0：否</li><li>1：是</li>默认值：0
     * @param AutoVoucher <p>是否自动使用代金券：</p><li>0：否</li><li>1：是</li>默认值：0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>代金券ID列表，目前仅支持指定一张代金券。</p> 
     * @return VoucherIds <p>代金券ID列表，目前仅支持指定一张代金券。</p>
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set <p>代金券ID列表，目前仅支持指定一张代金券。</p>
     * @param VoucherIds <p>代金券ID列表，目前仅支持指定一张代金券。</p>
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get <p>项目ID。默认取之为0，表示归属默认项目。</p> 
     * @return ProjectId <p>项目ID。默认取之为0，表示归属默认项目。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID。默认取之为0，表示归属默认项目。</p>
     * @param ProjectId <p>项目ID。默认取之为0，表示归属默认项目。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>活动ID。</p> 
     * @return ActivityId <p>活动ID。</p>
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set <p>活动ID。</p>
     * @param ActivityId <p>活动ID。</p>
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get <p>实例名称，仅支持长度小于60的中文/英文/数字/&quot;_&quot;/&quot;-&quot;，不指定实例名称则默认显示&quot;未命名&quot;。</p> 
     * @return Name <p>实例名称，仅支持长度小于60的中文/英文/数字/&quot;_&quot;/&quot;-&quot;，不指定实例名称则默认显示&quot;未命名&quot;。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>实例名称，仅支持长度小于60的中文/英文/数字/&quot;_&quot;/&quot;-&quot;，不指定实例名称则默认显示&quot;未命名&quot;。</p>
     * @param Name <p>实例名称，仅支持长度小于60的中文/英文/数字/&quot;_&quot;/&quot;-&quot;，不指定实例名称则默认显示&quot;未命名&quot;。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>实例需要绑定的Tag信息，默认为空；可以通过调用 <a href="https://cloud.tencent.com/document/api/651/35316">DescribeTags</a> 返回值中的 Tags 字段来获取。</p> 
     * @return TagList <p>实例需要绑定的Tag信息，默认为空；可以通过调用 <a href="https://cloud.tencent.com/document/api/651/35316">DescribeTags</a> 返回值中的 Tags 字段来获取。</p>
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>实例需要绑定的Tag信息，默认为空；可以通过调用 <a href="https://cloud.tencent.com/document/api/651/35316">DescribeTags</a> 返回值中的 Tags 字段来获取。</p>
     * @param TagList <p>实例需要绑定的Tag信息，默认为空；可以通过调用 <a href="https://cloud.tencent.com/document/api/651/35316">DescribeTags</a> 返回值中的 Tags 字段来获取。</p>
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>实例所属安全组，该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。</p> 
     * @return SecurityGroupIds <p>实例所属安全组，该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>实例所属安全组，该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。</p>
     * @param SecurityGroupIds <p>实例所属安全组，该参数可以通过调用 <a href="https://cloud.tencent.com/document/api/215/15808">DescribeSecurityGroups</a> 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>是否需要支持数据透明加密：</p><li>0：否</li><li>1：是</li>默认值：0参考[数据透明加密概述](https://cloud.tencent.com/document/product/409/71748) 
     * @return NeedSupportTDE <p>是否需要支持数据透明加密：</p><li>0：否</li><li>1：是</li>默认值：0参考[数据透明加密概述](https://cloud.tencent.com/document/product/409/71748)
     */
    public Long getNeedSupportTDE() {
        return this.NeedSupportTDE;
    }

    /**
     * Set <p>是否需要支持数据透明加密：</p><li>0：否</li><li>1：是</li>默认值：0参考[数据透明加密概述](https://cloud.tencent.com/document/product/409/71748)
     * @param NeedSupportTDE <p>是否需要支持数据透明加密：</p><li>0：否</li><li>1：是</li>默认值：0参考[数据透明加密概述](https://cloud.tencent.com/document/product/409/71748)
     */
    public void setNeedSupportTDE(Long NeedSupportTDE) {
        this.NeedSupportTDE = NeedSupportTDE;
    }

    /**
     * Get <p>自定义密钥的KeyId，若选择自定义密匙加密，则需要传入自定义密匙的KeyId，KeyId是CMK的唯一标识。<br>KeyId创建获取相关参考<a href="https://cloud.tencent.com/document/product/409/71749">开启透明数据加密</a></p> 
     * @return KMSKeyId <p>自定义密钥的KeyId，若选择自定义密匙加密，则需要传入自定义密匙的KeyId，KeyId是CMK的唯一标识。<br>KeyId创建获取相关参考<a href="https://cloud.tencent.com/document/product/409/71749">开启透明数据加密</a></p>
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * Set <p>自定义密钥的KeyId，若选择自定义密匙加密，则需要传入自定义密匙的KeyId，KeyId是CMK的唯一标识。<br>KeyId创建获取相关参考<a href="https://cloud.tencent.com/document/product/409/71749">开启透明数据加密</a></p>
     * @param KMSKeyId <p>自定义密钥的KeyId，若选择自定义密匙加密，则需要传入自定义密匙的KeyId，KeyId是CMK的唯一标识。<br>KeyId创建获取相关参考<a href="https://cloud.tencent.com/document/product/409/71749">开启透明数据加密</a></p>
     */
    public void setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
    }

    /**
     * Get <p>使用KMS服务的地域，KMSRegion为空默认使用本地域的KMS，本地域不支持的情况下需自选其他KMS支持的地域。<br>KMSRegion相关介绍参考<a href="https://cloud.tencent.com/document/product/409/71749">开启透明数据加密</a></p> 
     * @return KMSRegion <p>使用KMS服务的地域，KMSRegion为空默认使用本地域的KMS，本地域不支持的情况下需自选其他KMS支持的地域。<br>KMSRegion相关介绍参考<a href="https://cloud.tencent.com/document/product/409/71749">开启透明数据加密</a></p>
     */
    public String getKMSRegion() {
        return this.KMSRegion;
    }

    /**
     * Set <p>使用KMS服务的地域，KMSRegion为空默认使用本地域的KMS，本地域不支持的情况下需自选其他KMS支持的地域。<br>KMSRegion相关介绍参考<a href="https://cloud.tencent.com/document/product/409/71749">开启透明数据加密</a></p>
     * @param KMSRegion <p>使用KMS服务的地域，KMSRegion为空默认使用本地域的KMS，本地域不支持的情况下需自选其他KMS支持的地域。<br>KMSRegion相关介绍参考<a href="https://cloud.tencent.com/document/product/409/71749">开启透明数据加密</a></p>
     */
    public void setKMSRegion(String KMSRegion) {
        this.KMSRegion = KMSRegion;
    }

    /**
     * Get <p>指定KMS服务的集群，KMSClusterId为空使用默认集群的KMS，若选择指定KMS集群，则需要传入KMSClusterId。 KMSClusterId相关介绍参考开启透明数据加密</p> 
     * @return KMSClusterId <p>指定KMS服务的集群，KMSClusterId为空使用默认集群的KMS，若选择指定KMS集群，则需要传入KMSClusterId。 KMSClusterId相关介绍参考开启透明数据加密</p>
     */
    public String getKMSClusterId() {
        return this.KMSClusterId;
    }

    /**
     * Set <p>指定KMS服务的集群，KMSClusterId为空使用默认集群的KMS，若选择指定KMS集群，则需要传入KMSClusterId。 KMSClusterId相关介绍参考开启透明数据加密</p>
     * @param KMSClusterId <p>指定KMS服务的集群，KMSClusterId为空使用默认集群的KMS，若选择指定KMS集群，则需要传入KMSClusterId。 KMSClusterId相关介绍参考开启透明数据加密</p>
     */
    public void setKMSClusterId(String KMSClusterId) {
        this.KMSClusterId = KMSClusterId;
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
     * Get <p>主从同步方式，支持： </p><li>Semi-sync：半同步</li><li>Async：异步</li>主实例默认值：Semi-sync只读实例默认值：Async 
     * @return SyncMode <p>主从同步方式，支持： </p><li>Semi-sync：半同步</li><li>Async：异步</li>主实例默认值：Semi-sync只读实例默认值：Async
     */
    public String getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set <p>主从同步方式，支持： </p><li>Semi-sync：半同步</li><li>Async：异步</li>主实例默认值：Semi-sync只读实例默认值：Async
     * @param SyncMode <p>主从同步方式，支持： </p><li>Semi-sync：半同步</li><li>Async：异步</li>主实例默认值：Semi-sync只读实例默认值：Async
     */
    public void setSyncMode(String SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Get <p>是否需要支持Ipv6：</p><li>0：否</li><li>1：是</li>默认值：0 
     * @return NeedSupportIpv6 <p>是否需要支持Ipv6：</p><li>0：否</li><li>1：是</li>默认值：0
     */
    public Long getNeedSupportIpv6() {
        return this.NeedSupportIpv6;
    }

    /**
     * Set <p>是否需要支持Ipv6：</p><li>0：否</li><li>1：是</li>默认值：0
     * @param NeedSupportIpv6 <p>是否需要支持Ipv6：</p><li>0：否</li><li>1：是</li>默认值：0
     */
    public void setNeedSupportIpv6(Long NeedSupportIpv6) {
        this.NeedSupportIpv6 = NeedSupportIpv6;
    }

    /**
     * Get <p>实例是否开启删除保护: true-开启删除保护；false-关闭删除保护。</p> 
     * @return DeletionProtection <p>实例是否开启删除保护: true-开启删除保护；false-关闭删除保护。</p>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>实例是否开启删除保护: true-开启删除保护；false-关闭删除保护。</p>
     * @param DeletionProtection <p>实例是否开启删除保护: true-开启删除保护；false-关闭删除保护。</p>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    public CreateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancesRequest(CreateInstancesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
        if (source.AdminName != null) {
            this.AdminName = new String(source.AdminName);
        }
        if (source.AdminPassword != null) {
            this.AdminPassword = new String(source.AdminPassword);
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
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DBNodeSet != null) {
            this.DBNodeSet = new DBNode[source.DBNodeSet.length];
            for (int i = 0; i < source.DBNodeSet.length; i++) {
                this.DBNodeSet[i] = new DBNode(source.DBNodeSet[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.NeedSupportTDE != null) {
            this.NeedSupportTDE = new Long(source.NeedSupportTDE);
        }
        if (source.KMSKeyId != null) {
            this.KMSKeyId = new String(source.KMSKeyId);
        }
        if (source.KMSRegion != null) {
            this.KMSRegion = new String(source.KMSRegion);
        }
        if (source.KMSClusterId != null) {
            this.KMSClusterId = new String(source.KMSClusterId);
        }
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
        if (source.DBEngineConfig != null) {
            this.DBEngineConfig = new String(source.DBEngineConfig);
        }
        if (source.SyncMode != null) {
            this.SyncMode = new String(source.SyncMode);
        }
        if (source.NeedSupportIpv6 != null) {
            this.NeedSupportIpv6 = new Long(source.NeedSupportIpv6);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "DBKernelVersion", this.DBKernelVersion);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "DBNodeSet.", this.DBNodeSet);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "NeedSupportTDE", this.NeedSupportTDE);
        this.setParamSimple(map, prefix + "KMSKeyId", this.KMSKeyId);
        this.setParamSimple(map, prefix + "KMSRegion", this.KMSRegion);
        this.setParamSimple(map, prefix + "KMSClusterId", this.KMSClusterId);
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);
        this.setParamSimple(map, prefix + "DBEngineConfig", this.DBEngineConfig);
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);
        this.setParamSimple(map, prefix + "NeedSupportIpv6", this.NeedSupportIpv6);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);

    }
}

