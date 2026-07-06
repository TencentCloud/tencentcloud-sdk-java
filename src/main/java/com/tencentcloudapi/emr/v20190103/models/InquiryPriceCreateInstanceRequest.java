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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateInstanceRequest extends AbstractModel {

    /**
    * <p>购买实例的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>购买实例的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>货币种类。取值范围：</p><li>CNY：表示人民币。</li>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>是否开启节点高可用。取值范围：</p><li>0：表示不开启节点高可用。</li><li>1：表示开启节点高可用。x07</li>
    */
    @SerializedName("SupportHA")
    @Expose
    private Long SupportHA;

    /**
    * <p>部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）需要选择不同的必选组件：<li>ProductId为2(EMR-V2.0.1)的时候，必选组件包括：hdfs-2.7.3,yarn-2.7.3,zookeeper-3.4.9,knox-1.2.0</li><li>ProductId为16(EMR-V2.3.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.5.5,knox-1.2.0</li><li>ProductId为20(EMR-V2.5.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为30(EMR-V2.6.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.1,openldap-2.4.44,knox-1.2.0</li><li>ProductId为38(EMR-V2.7.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为57(EMR-V2.8.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为7(EMR-V3.0.0)的时候，必选组件包括：hdfs-3.1.2,yarn-3.1.2,zookeeper-3.4.9,knox-1.2.0</li><li>ProductId为25(EMR-V3.1.0)的时候，必选组件包括：hdfs-3.1.2,yarn-3.1.2,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为31(EMR-V3.1.1)的时候，必选组件包括：hdfs-3.1.2,yarn-3.1.2,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为28(EMR-V3.2.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为33(EMR-V3.2.1)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.1,openldap-2.4.44,knox-1.2.0</li><li>ProductId为34(EMR-V3.3.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.1,openldap-2.4.44,knox-1.2.0</li><li>ProductId为37(EMR-V3.4.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为44(EMR-V3.5.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为53(EMR-V3.6.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为58(EMR-V3.6.1)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.46,knox-1.6.1</li><li>ProductId为47(EMR-V4.0.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li></p>
    */
    @SerializedName("Software")
    @Expose
    private String [] Software;

    /**
    * <p>询价的节点规格。</p>
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NewResourceSpec ResourceSpec;

    /**
    * <p>实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。</p>
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
    * <p>hive共享元数据库类型。取值范围：</p><li>EMR_NEW_META：表示集群默认创建</li><li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * <p>EMR-MetaDB实例</p>
    */
    @SerializedName("UnifyMetaInstanceId")
    @Expose
    private String UnifyMetaInstanceId;

    /**
    * <p>自定义MetaDB信息</p>
    */
    @SerializedName("MetaDBInfo")
    @Expose
    private CustomMetaInfo MetaDBInfo;

    /**
    * <p>产品ID，不同产品ID表示不同的EMR产品版本。取值范围：<li>2：表示EMR-V2.0.1</li><li>16：表示EMR-V2.3.0</li><li>20：表示EMR-V2.5.0</li><li>30：表示EMR-V2.6.0</li><li>38：表示EMR-V2.7.0</li><li>57：表示EMR-V2.8.0</li><li>7：表示EMR-V3.0.0</li><li>25：表示EMR-V3.1.0</li><li>31：表示EMR-V3.1.1</li><li>28：表示EMR-V3.2.0</li><li>33：表示EMR-V3.2.1</li><li>34：表示EMR-V3.3.0</li><li>37：表示EMR-V3.4.0</li><li>44：表示EMR-V3.5.0</li><li>53：表示EMR-V3.6.0</li><li>58：表示EMR-V3.6.1</li><li>47：表示EMR-V4.0.0</li></p>
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * <p>场景化取值：Hadoop-Kudu，Hadoop-Zookeeper，Hadoop-Presto，Hadoop-Hbase</p>
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * <p>共用组件信息</p>
    */
    @SerializedName("ExternalService")
    @Expose
    private ExternalService [] ExternalService;

    /**
    * <p>当前默认值为0，跨AZ特性支持后为1</p>
    */
    @SerializedName("VersionID")
    @Expose
    private Long VersionID;

    /**
    * <p>可用区的规格信息</p>
    */
    @SerializedName("MultiZoneSettings")
    @Expose
    private MultiZoneSetting [] MultiZoneSettings;

    /**
    * <p>数据库版本</p>
    */
    @SerializedName("DefaultMetaVersion")
    @Expose
    private String DefaultMetaVersion;

    /**
    * <p>0:不开通审计；1:开通审计</p>
    */
    @SerializedName("NeedCdbAudit")
    @Expose
    private Long NeedCdbAudit;

    /**
    * <p>自定义db数据</p>
    */
    @SerializedName("MetaDBGroupInfo")
    @Expose
    private CustomMetaDBInfo [] MetaDBGroupInfo;

    /**
     * Get <p>购买实例的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li> 
     * @return TimeUnit <p>购买实例的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>购买实例的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     * @param TimeUnit <p>购买实例的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>购买实例的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li> 
     * @return TimeSpan <p>购买实例的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>购买实例的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     * @param TimeSpan <p>购买实例的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>货币种类。取值范围：</p><li>CNY：表示人民币。</li> 
     * @return Currency <p>货币种类。取值范围：</p><li>CNY：表示人民币。</li>
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set <p>货币种类。取值范围：</p><li>CNY：表示人民币。</li>
     * @param Currency <p>货币种类。取值范围：</p><li>CNY：表示人民币。</li>
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li> 
     * @return PayMode <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
     * @param PayMode <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>是否开启节点高可用。取值范围：</p><li>0：表示不开启节点高可用。</li><li>1：表示开启节点高可用。x07</li> 
     * @return SupportHA <p>是否开启节点高可用。取值范围：</p><li>0：表示不开启节点高可用。</li><li>1：表示开启节点高可用。x07</li>
     */
    public Long getSupportHA() {
        return this.SupportHA;
    }

    /**
     * Set <p>是否开启节点高可用。取值范围：</p><li>0：表示不开启节点高可用。</li><li>1：表示开启节点高可用。x07</li>
     * @param SupportHA <p>是否开启节点高可用。取值范围：</p><li>0：表示不开启节点高可用。</li><li>1：表示开启节点高可用。x07</li>
     */
    public void setSupportHA(Long SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * Get <p>部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）需要选择不同的必选组件：<li>ProductId为2(EMR-V2.0.1)的时候，必选组件包括：hdfs-2.7.3,yarn-2.7.3,zookeeper-3.4.9,knox-1.2.0</li><li>ProductId为16(EMR-V2.3.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.5.5,knox-1.2.0</li><li>ProductId为20(EMR-V2.5.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为30(EMR-V2.6.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.1,openldap-2.4.44,knox-1.2.0</li><li>ProductId为38(EMR-V2.7.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为57(EMR-V2.8.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为7(EMR-V3.0.0)的时候，必选组件包括：hdfs-3.1.2,yarn-3.1.2,zookeeper-3.4.9,knox-1.2.0</li><li>ProductId为25(EMR-V3.1.0)的时候，必选组件包括：hdfs-3.1.2,yarn-3.1.2,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为31(EMR-V3.1.1)的时候，必选组件包括：hdfs-3.1.2,yarn-3.1.2,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为28(EMR-V3.2.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为33(EMR-V3.2.1)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.1,openldap-2.4.44,knox-1.2.0</li><li>ProductId为34(EMR-V3.3.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.1,openldap-2.4.44,knox-1.2.0</li><li>ProductId为37(EMR-V3.4.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为44(EMR-V3.5.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为53(EMR-V3.6.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为58(EMR-V3.6.1)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.46,knox-1.6.1</li><li>ProductId为47(EMR-V4.0.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li></p> 
     * @return Software <p>部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）需要选择不同的必选组件：<li>ProductId为2(EMR-V2.0.1)的时候，必选组件包括：hdfs-2.7.3,yarn-2.7.3,zookeeper-3.4.9,knox-1.2.0</li><li>ProductId为16(EMR-V2.3.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.5.5,knox-1.2.0</li><li>ProductId为20(EMR-V2.5.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为30(EMR-V2.6.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.1,openldap-2.4.44,knox-1.2.0</li><li>ProductId为38(EMR-V2.7.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为57(EMR-V2.8.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为7(EMR-V3.0.0)的时候，必选组件包括：hdfs-3.1.2,yarn-3.1.2,zookeeper-3.4.9,knox-1.2.0</li><li>ProductId为25(EMR-V3.1.0)的时候，必选组件包括：hdfs-3.1.2,yarn-3.1.2,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为31(EMR-V3.1.1)的时候，必选组件包括：hdfs-3.1.2,yarn-3.1.2,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为28(EMR-V3.2.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为33(EMR-V3.2.1)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.1,openldap-2.4.44,knox-1.2.0</li><li>ProductId为34(EMR-V3.3.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.1,openldap-2.4.44,knox-1.2.0</li><li>ProductId为37(EMR-V3.4.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为44(EMR-V3.5.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为53(EMR-V3.6.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为58(EMR-V3.6.1)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.46,knox-1.6.1</li><li>ProductId为47(EMR-V4.0.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li></p>
     */
    public String [] getSoftware() {
        return this.Software;
    }

    /**
     * Set <p>部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）需要选择不同的必选组件：<li>ProductId为2(EMR-V2.0.1)的时候，必选组件包括：hdfs-2.7.3,yarn-2.7.3,zookeeper-3.4.9,knox-1.2.0</li><li>ProductId为16(EMR-V2.3.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.5.5,knox-1.2.0</li><li>ProductId为20(EMR-V2.5.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为30(EMR-V2.6.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.1,openldap-2.4.44,knox-1.2.0</li><li>ProductId为38(EMR-V2.7.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为57(EMR-V2.8.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为7(EMR-V3.0.0)的时候，必选组件包括：hdfs-3.1.2,yarn-3.1.2,zookeeper-3.4.9,knox-1.2.0</li><li>ProductId为25(EMR-V3.1.0)的时候，必选组件包括：hdfs-3.1.2,yarn-3.1.2,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为31(EMR-V3.1.1)的时候，必选组件包括：hdfs-3.1.2,yarn-3.1.2,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为28(EMR-V3.2.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为33(EMR-V3.2.1)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.1,openldap-2.4.44,knox-1.2.0</li><li>ProductId为34(EMR-V3.3.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.1,openldap-2.4.44,knox-1.2.0</li><li>ProductId为37(EMR-V3.4.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为44(EMR-V3.5.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为53(EMR-V3.6.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为58(EMR-V3.6.1)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.46,knox-1.6.1</li><li>ProductId为47(EMR-V4.0.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li></p>
     * @param Software <p>部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）需要选择不同的必选组件：<li>ProductId为2(EMR-V2.0.1)的时候，必选组件包括：hdfs-2.7.3,yarn-2.7.3,zookeeper-3.4.9,knox-1.2.0</li><li>ProductId为16(EMR-V2.3.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.5.5,knox-1.2.0</li><li>ProductId为20(EMR-V2.5.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为30(EMR-V2.6.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.1,openldap-2.4.44,knox-1.2.0</li><li>ProductId为38(EMR-V2.7.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为57(EMR-V2.8.0)的时候，必选组件包括：hdfs-2.8.5,yarn-2.8.5,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为7(EMR-V3.0.0)的时候，必选组件包括：hdfs-3.1.2,yarn-3.1.2,zookeeper-3.4.9,knox-1.2.0</li><li>ProductId为25(EMR-V3.1.0)的时候，必选组件包括：hdfs-3.1.2,yarn-3.1.2,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为31(EMR-V3.1.1)的时候，必选组件包括：hdfs-3.1.2,yarn-3.1.2,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为28(EMR-V3.2.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.1,knox-1.2.0</li><li>ProductId为33(EMR-V3.2.1)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.1,openldap-2.4.44,knox-1.2.0</li><li>ProductId为34(EMR-V3.3.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.1,openldap-2.4.44,knox-1.2.0</li><li>ProductId为37(EMR-V3.4.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为44(EMR-V3.5.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为53(EMR-V3.6.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li><li>ProductId为58(EMR-V3.6.1)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.46,knox-1.6.1</li><li>ProductId为47(EMR-V4.0.0)的时候，必选组件包括：hdfs-3.2.2,yarn-3.2.2,zookeeper-3.6.3,openldap-2.4.44,knox-1.6.1</li></p>
     */
    public void setSoftware(String [] Software) {
        this.Software = Software;
    }

    /**
     * Get <p>询价的节点规格。</p> 
     * @return ResourceSpec <p>询价的节点规格。</p>
     */
    public NewResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set <p>询价的节点规格。</p>
     * @param ResourceSpec <p>询价的节点规格。</p>
     */
    public void setResourceSpec(NewResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get <p>实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。</p> 
     * @return Placement <p>实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。</p>
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set <p>实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。</p>
     * @param Placement <p>实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。</p>
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p> 
     * @return VPCSettings <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
     */
    public VPCSettings getVPCSettings() {
        return this.VPCSettings;
    }

    /**
     * Set <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
     * @param VPCSettings <p>私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。</p>
     */
    public void setVPCSettings(VPCSettings VPCSettings) {
        this.VPCSettings = VPCSettings;
    }

    /**
     * Get <p>hive共享元数据库类型。取值范围：</p><li>EMR_NEW_META：表示集群默认创建</li><li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li> 
     * @return MetaType <p>hive共享元数据库类型。取值范围：</p><li>EMR_NEW_META：表示集群默认创建</li><li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set <p>hive共享元数据库类型。取值范围：</p><li>EMR_NEW_META：表示集群默认创建</li><li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     * @param MetaType <p>hive共享元数据库类型。取值范围：</p><li>EMR_NEW_META：表示集群默认创建</li><li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li><li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get <p>EMR-MetaDB实例</p> 
     * @return UnifyMetaInstanceId <p>EMR-MetaDB实例</p>
     */
    public String getUnifyMetaInstanceId() {
        return this.UnifyMetaInstanceId;
    }

    /**
     * Set <p>EMR-MetaDB实例</p>
     * @param UnifyMetaInstanceId <p>EMR-MetaDB实例</p>
     */
    public void setUnifyMetaInstanceId(String UnifyMetaInstanceId) {
        this.UnifyMetaInstanceId = UnifyMetaInstanceId;
    }

    /**
     * Get <p>自定义MetaDB信息</p> 
     * @return MetaDBInfo <p>自定义MetaDB信息</p>
     */
    public CustomMetaInfo getMetaDBInfo() {
        return this.MetaDBInfo;
    }

    /**
     * Set <p>自定义MetaDB信息</p>
     * @param MetaDBInfo <p>自定义MetaDB信息</p>
     */
    public void setMetaDBInfo(CustomMetaInfo MetaDBInfo) {
        this.MetaDBInfo = MetaDBInfo;
    }

    /**
     * Get <p>产品ID，不同产品ID表示不同的EMR产品版本。取值范围：<li>2：表示EMR-V2.0.1</li><li>16：表示EMR-V2.3.0</li><li>20：表示EMR-V2.5.0</li><li>30：表示EMR-V2.6.0</li><li>38：表示EMR-V2.7.0</li><li>57：表示EMR-V2.8.0</li><li>7：表示EMR-V3.0.0</li><li>25：表示EMR-V3.1.0</li><li>31：表示EMR-V3.1.1</li><li>28：表示EMR-V3.2.0</li><li>33：表示EMR-V3.2.1</li><li>34：表示EMR-V3.3.0</li><li>37：表示EMR-V3.4.0</li><li>44：表示EMR-V3.5.0</li><li>53：表示EMR-V3.6.0</li><li>58：表示EMR-V3.6.1</li><li>47：表示EMR-V4.0.0</li></p> 
     * @return ProductId <p>产品ID，不同产品ID表示不同的EMR产品版本。取值范围：<li>2：表示EMR-V2.0.1</li><li>16：表示EMR-V2.3.0</li><li>20：表示EMR-V2.5.0</li><li>30：表示EMR-V2.6.0</li><li>38：表示EMR-V2.7.0</li><li>57：表示EMR-V2.8.0</li><li>7：表示EMR-V3.0.0</li><li>25：表示EMR-V3.1.0</li><li>31：表示EMR-V3.1.1</li><li>28：表示EMR-V3.2.0</li><li>33：表示EMR-V3.2.1</li><li>34：表示EMR-V3.3.0</li><li>37：表示EMR-V3.4.0</li><li>44：表示EMR-V3.5.0</li><li>53：表示EMR-V3.6.0</li><li>58：表示EMR-V3.6.1</li><li>47：表示EMR-V4.0.0</li></p>
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品ID，不同产品ID表示不同的EMR产品版本。取值范围：<li>2：表示EMR-V2.0.1</li><li>16：表示EMR-V2.3.0</li><li>20：表示EMR-V2.5.0</li><li>30：表示EMR-V2.6.0</li><li>38：表示EMR-V2.7.0</li><li>57：表示EMR-V2.8.0</li><li>7：表示EMR-V3.0.0</li><li>25：表示EMR-V3.1.0</li><li>31：表示EMR-V3.1.1</li><li>28：表示EMR-V3.2.0</li><li>33：表示EMR-V3.2.1</li><li>34：表示EMR-V3.3.0</li><li>37：表示EMR-V3.4.0</li><li>44：表示EMR-V3.5.0</li><li>53：表示EMR-V3.6.0</li><li>58：表示EMR-V3.6.1</li><li>47：表示EMR-V4.0.0</li></p>
     * @param ProductId <p>产品ID，不同产品ID表示不同的EMR产品版本。取值范围：<li>2：表示EMR-V2.0.1</li><li>16：表示EMR-V2.3.0</li><li>20：表示EMR-V2.5.0</li><li>30：表示EMR-V2.6.0</li><li>38：表示EMR-V2.7.0</li><li>57：表示EMR-V2.8.0</li><li>7：表示EMR-V3.0.0</li><li>25：表示EMR-V3.1.0</li><li>31：表示EMR-V3.1.1</li><li>28：表示EMR-V3.2.0</li><li>33：表示EMR-V3.2.1</li><li>34：表示EMR-V3.3.0</li><li>37：表示EMR-V3.4.0</li><li>44：表示EMR-V3.5.0</li><li>53：表示EMR-V3.6.0</li><li>58：表示EMR-V3.6.1</li><li>47：表示EMR-V4.0.0</li></p>
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>场景化取值：Hadoop-Kudu，Hadoop-Zookeeper，Hadoop-Presto，Hadoop-Hbase</p> 
     * @return SceneName <p>场景化取值：Hadoop-Kudu，Hadoop-Zookeeper，Hadoop-Presto，Hadoop-Hbase</p>
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set <p>场景化取值：Hadoop-Kudu，Hadoop-Zookeeper，Hadoop-Presto，Hadoop-Hbase</p>
     * @param SceneName <p>场景化取值：Hadoop-Kudu，Hadoop-Zookeeper，Hadoop-Presto，Hadoop-Hbase</p>
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get <p>共用组件信息</p> 
     * @return ExternalService <p>共用组件信息</p>
     */
    public ExternalService [] getExternalService() {
        return this.ExternalService;
    }

    /**
     * Set <p>共用组件信息</p>
     * @param ExternalService <p>共用组件信息</p>
     */
    public void setExternalService(ExternalService [] ExternalService) {
        this.ExternalService = ExternalService;
    }

    /**
     * Get <p>当前默认值为0，跨AZ特性支持后为1</p> 
     * @return VersionID <p>当前默认值为0，跨AZ特性支持后为1</p>
     */
    public Long getVersionID() {
        return this.VersionID;
    }

    /**
     * Set <p>当前默认值为0，跨AZ特性支持后为1</p>
     * @param VersionID <p>当前默认值为0，跨AZ特性支持后为1</p>
     */
    public void setVersionID(Long VersionID) {
        this.VersionID = VersionID;
    }

    /**
     * Get <p>可用区的规格信息</p> 
     * @return MultiZoneSettings <p>可用区的规格信息</p>
     */
    public MultiZoneSetting [] getMultiZoneSettings() {
        return this.MultiZoneSettings;
    }

    /**
     * Set <p>可用区的规格信息</p>
     * @param MultiZoneSettings <p>可用区的规格信息</p>
     */
    public void setMultiZoneSettings(MultiZoneSetting [] MultiZoneSettings) {
        this.MultiZoneSettings = MultiZoneSettings;
    }

    /**
     * Get <p>数据库版本</p> 
     * @return DefaultMetaVersion <p>数据库版本</p>
     */
    public String getDefaultMetaVersion() {
        return this.DefaultMetaVersion;
    }

    /**
     * Set <p>数据库版本</p>
     * @param DefaultMetaVersion <p>数据库版本</p>
     */
    public void setDefaultMetaVersion(String DefaultMetaVersion) {
        this.DefaultMetaVersion = DefaultMetaVersion;
    }

    /**
     * Get <p>0:不开通审计；1:开通审计</p> 
     * @return NeedCdbAudit <p>0:不开通审计；1:开通审计</p>
     */
    public Long getNeedCdbAudit() {
        return this.NeedCdbAudit;
    }

    /**
     * Set <p>0:不开通审计；1:开通审计</p>
     * @param NeedCdbAudit <p>0:不开通审计；1:开通审计</p>
     */
    public void setNeedCdbAudit(Long NeedCdbAudit) {
        this.NeedCdbAudit = NeedCdbAudit;
    }

    /**
     * Get <p>自定义db数据</p> 
     * @return MetaDBGroupInfo <p>自定义db数据</p>
     */
    public CustomMetaDBInfo [] getMetaDBGroupInfo() {
        return this.MetaDBGroupInfo;
    }

    /**
     * Set <p>自定义db数据</p>
     * @param MetaDBGroupInfo <p>自定义db数据</p>
     */
    public void setMetaDBGroupInfo(CustomMetaDBInfo [] MetaDBGroupInfo) {
        this.MetaDBGroupInfo = MetaDBGroupInfo;
    }

    public InquiryPriceCreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateInstanceRequest(InquiryPriceCreateInstanceRequest source) {
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.SupportHA != null) {
            this.SupportHA = new Long(source.SupportHA);
        }
        if (source.Software != null) {
            this.Software = new String[source.Software.length];
            for (int i = 0; i < source.Software.length; i++) {
                this.Software[i] = new String(source.Software[i]);
            }
        }
        if (source.ResourceSpec != null) {
            this.ResourceSpec = new NewResourceSpec(source.ResourceSpec);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.VPCSettings != null) {
            this.VPCSettings = new VPCSettings(source.VPCSettings);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.UnifyMetaInstanceId != null) {
            this.UnifyMetaInstanceId = new String(source.UnifyMetaInstanceId);
        }
        if (source.MetaDBInfo != null) {
            this.MetaDBInfo = new CustomMetaInfo(source.MetaDBInfo);
        }
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.ExternalService != null) {
            this.ExternalService = new ExternalService[source.ExternalService.length];
            for (int i = 0; i < source.ExternalService.length; i++) {
                this.ExternalService[i] = new ExternalService(source.ExternalService[i]);
            }
        }
        if (source.VersionID != null) {
            this.VersionID = new Long(source.VersionID);
        }
        if (source.MultiZoneSettings != null) {
            this.MultiZoneSettings = new MultiZoneSetting[source.MultiZoneSettings.length];
            for (int i = 0; i < source.MultiZoneSettings.length; i++) {
                this.MultiZoneSettings[i] = new MultiZoneSetting(source.MultiZoneSettings[i]);
            }
        }
        if (source.DefaultMetaVersion != null) {
            this.DefaultMetaVersion = new String(source.DefaultMetaVersion);
        }
        if (source.NeedCdbAudit != null) {
            this.NeedCdbAudit = new Long(source.NeedCdbAudit);
        }
        if (source.MetaDBGroupInfo != null) {
            this.MetaDBGroupInfo = new CustomMetaDBInfo[source.MetaDBGroupInfo.length];
            for (int i = 0; i < source.MetaDBGroupInfo.length; i++) {
                this.MetaDBGroupInfo[i] = new CustomMetaDBInfo(source.MetaDBGroupInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "SupportHA", this.SupportHA);
        this.setParamArraySimple(map, prefix + "Software.", this.Software);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "UnifyMetaInstanceId", this.UnifyMetaInstanceId);
        this.setParamObj(map, prefix + "MetaDBInfo.", this.MetaDBInfo);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamArrayObj(map, prefix + "ExternalService.", this.ExternalService);
        this.setParamSimple(map, prefix + "VersionID", this.VersionID);
        this.setParamArrayObj(map, prefix + "MultiZoneSettings.", this.MultiZoneSettings);
        this.setParamSimple(map, prefix + "DefaultMetaVersion", this.DefaultMetaVersion);
        this.setParamSimple(map, prefix + "NeedCdbAudit", this.NeedCdbAudit);
        this.setParamArrayObj(map, prefix + "MetaDBGroupInfo.", this.MetaDBGroupInfo);

    }
}

