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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateInstanceRequest extends AbstractModel{

    /**
    * 购买实例的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 购买实例的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 询价的节点规格。
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NewResourceSpec ResourceSpec;

    /**
    * 货币种类。取值范围：
<li>CNY：表示人民币。</li>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 是否开启节点高可用。取值范围：
<li>0：表示不开启节点高可用。</li>
<li>1：表示开启节点高可用。</li>
    */
    @SerializedName("SupportHA")
    @Expose
    private Long SupportHA;

    /**
    * 部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）需要选择不同的必选组件：
<li>ProductId为1的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为2的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为4的时候，必选组件包括：hadoop-2.8.4、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为7的时候，必选组件包括：hadoop-3.1.2、knox-1.2.0、zookeeper-3.4.9</li>
    */
    @SerializedName("Software")
    @Expose
    private String [] Software;

    /**
    * 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
    * hive共享元数据库类型。取值范围：
<li>EMR_NEW_META：表示集群默认创建</li>
<li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li>
<li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * EMR-MetaDB实例
    */
    @SerializedName("UnifyMetaInstanceId")
    @Expose
    private String UnifyMetaInstanceId;

    /**
    * 自定义MetaDB信息
    */
    @SerializedName("MetaDBInfo")
    @Expose
    private CustomMetaInfo MetaDBInfo;

    /**
    * 产品ID，不同产品ID表示不同的EMR产品版本。取值范围：
<li>1：表示EMR-V1.3.1。</li>
<li>2：表示EMR-V2.0.1。</li>
<li>4：表示EMR-V2.1.0。</li>
<li>7：表示EMR-V3.0.0。</li>
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
     * Get 购买实例的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li> 
     * @return TimeUnit 购买实例的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 购买实例的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     * @param TimeUnit 购买实例的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 购买实例的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li> 
     * @return TimeSpan 购买实例的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买实例的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     * @param TimeSpan 购买实例的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 询价的节点规格。 
     * @return ResourceSpec 询价的节点规格。
     */
    public NewResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set 询价的节点规格。
     * @param ResourceSpec 询价的节点规格。
     */
    public void setResourceSpec(NewResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get 货币种类。取值范围：
<li>CNY：表示人民币。</li> 
     * @return Currency 货币种类。取值范围：
<li>CNY：表示人民币。</li>
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 货币种类。取值范围：
<li>CNY：表示人民币。</li>
     * @param Currency 货币种类。取值范围：
<li>CNY：表示人民币。</li>
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li> 
     * @return PayMode 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
     * @param PayMode 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 是否开启节点高可用。取值范围：
<li>0：表示不开启节点高可用。</li>
<li>1：表示开启节点高可用。</li> 
     * @return SupportHA 是否开启节点高可用。取值范围：
<li>0：表示不开启节点高可用。</li>
<li>1：表示开启节点高可用。</li>
     */
    public Long getSupportHA() {
        return this.SupportHA;
    }

    /**
     * Set 是否开启节点高可用。取值范围：
<li>0：表示不开启节点高可用。</li>
<li>1：表示开启节点高可用。</li>
     * @param SupportHA 是否开启节点高可用。取值范围：
<li>0：表示不开启节点高可用。</li>
<li>1：表示开启节点高可用。</li>
     */
    public void setSupportHA(Long SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * Get 部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）需要选择不同的必选组件：
<li>ProductId为1的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为2的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为4的时候，必选组件包括：hadoop-2.8.4、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为7的时候，必选组件包括：hadoop-3.1.2、knox-1.2.0、zookeeper-3.4.9</li> 
     * @return Software 部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）需要选择不同的必选组件：
<li>ProductId为1的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为2的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为4的时候，必选组件包括：hadoop-2.8.4、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为7的时候，必选组件包括：hadoop-3.1.2、knox-1.2.0、zookeeper-3.4.9</li>
     */
    public String [] getSoftware() {
        return this.Software;
    }

    /**
     * Set 部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）需要选择不同的必选组件：
<li>ProductId为1的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为2的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为4的时候，必选组件包括：hadoop-2.8.4、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为7的时候，必选组件包括：hadoop-3.1.2、knox-1.2.0、zookeeper-3.4.9</li>
     * @param Software 部署的组件列表。不同的EMR产品ID（ProductId：具体含义参考入参ProductId字段）需要选择不同的必选组件：
<li>ProductId为1的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为2的时候，必选组件包括：hadoop-2.7.3、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为4的时候，必选组件包括：hadoop-2.8.4、knox-1.2.0、zookeeper-3.4.9</li>
<li>ProductId为7的时候，必选组件包括：hadoop-3.1.2、knox-1.2.0、zookeeper-3.4.9</li>
     */
    public void setSoftware(String [] Software) {
        this.Software = Software;
    }

    /**
     * Get 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。 
     * @return Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     * @param Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目等属性。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。 
     * @return VPCSettings 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
     */
    public VPCSettings getVPCSettings() {
        return this.VPCSettings;
    }

    /**
     * Set 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
     * @param VPCSettings 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。
     */
    public void setVPCSettings(VPCSettings VPCSettings) {
        this.VPCSettings = VPCSettings;
    }

    /**
     * Get hive共享元数据库类型。取值范围：
<li>EMR_NEW_META：表示集群默认创建</li>
<li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li>
<li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li> 
     * @return MetaType hive共享元数据库类型。取值范围：
<li>EMR_NEW_META：表示集群默认创建</li>
<li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li>
<li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set hive共享元数据库类型。取值范围：
<li>EMR_NEW_META：表示集群默认创建</li>
<li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li>
<li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     * @param MetaType hive共享元数据库类型。取值范围：
<li>EMR_NEW_META：表示集群默认创建</li>
<li>EMR_EXIT_METE：表示集群使用指定EMR-MetaDB。</li>
<li>USER_CUSTOM_META：表示集群使用自定义MetaDB。</li>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get EMR-MetaDB实例 
     * @return UnifyMetaInstanceId EMR-MetaDB实例
     */
    public String getUnifyMetaInstanceId() {
        return this.UnifyMetaInstanceId;
    }

    /**
     * Set EMR-MetaDB实例
     * @param UnifyMetaInstanceId EMR-MetaDB实例
     */
    public void setUnifyMetaInstanceId(String UnifyMetaInstanceId) {
        this.UnifyMetaInstanceId = UnifyMetaInstanceId;
    }

    /**
     * Get 自定义MetaDB信息 
     * @return MetaDBInfo 自定义MetaDB信息
     */
    public CustomMetaInfo getMetaDBInfo() {
        return this.MetaDBInfo;
    }

    /**
     * Set 自定义MetaDB信息
     * @param MetaDBInfo 自定义MetaDB信息
     */
    public void setMetaDBInfo(CustomMetaInfo MetaDBInfo) {
        this.MetaDBInfo = MetaDBInfo;
    }

    /**
     * Get 产品ID，不同产品ID表示不同的EMR产品版本。取值范围：
<li>1：表示EMR-V1.3.1。</li>
<li>2：表示EMR-V2.0.1。</li>
<li>4：表示EMR-V2.1.0。</li>
<li>7：表示EMR-V3.0.0。</li> 
     * @return ProductId 产品ID，不同产品ID表示不同的EMR产品版本。取值范围：
<li>1：表示EMR-V1.3.1。</li>
<li>2：表示EMR-V2.0.1。</li>
<li>4：表示EMR-V2.1.0。</li>
<li>7：表示EMR-V3.0.0。</li>
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID，不同产品ID表示不同的EMR产品版本。取值范围：
<li>1：表示EMR-V1.3.1。</li>
<li>2：表示EMR-V2.0.1。</li>
<li>4：表示EMR-V2.1.0。</li>
<li>7：表示EMR-V3.0.0。</li>
     * @param ProductId 产品ID，不同产品ID表示不同的EMR产品版本。取值范围：
<li>1：表示EMR-V1.3.1。</li>
<li>2：表示EMR-V2.0.1。</li>
<li>4：表示EMR-V2.1.0。</li>
<li>7：表示EMR-V3.0.0。</li>
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "SupportHA", this.SupportHA);
        this.setParamArraySimple(map, prefix + "Software.", this.Software);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "UnifyMetaInstanceId", this.UnifyMetaInstanceId);
        this.setParamObj(map, prefix + "MetaDBInfo.", this.MetaDBInfo);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);

    }
}

