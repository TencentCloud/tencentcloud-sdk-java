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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel{

    /**
    * id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 资源id
    */
    @SerializedName("ResourceIds")
    @Expose
    private String ResourceIds;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 自动续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 弹性计费
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 套餐版本
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 过期时间
    */
    @SerializedName("ValidTime")
    @Expose
    private String ValidTime;

    /**
    * 开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 已用
    */
    @SerializedName("DomainCount")
    @Expose
    private Long DomainCount;

    /**
    * 上限
    */
    @SerializedName("SubDomainLimit")
    @Expose
    private Long SubDomainLimit;

    /**
    * 已用
    */
    @SerializedName("MainDomainCount")
    @Expose
    private Long MainDomainCount;

    /**
    * 上限
    */
    @SerializedName("MainDomainLimit")
    @Expose
    private Long MainDomainLimit;

    /**
    * 峰值
    */
    @SerializedName("MaxQPS")
    @Expose
    private Long MaxQPS;

    /**
    * qps套餐
    */
    @SerializedName("QPS")
    @Expose
    private QPSPackageNew QPS;

    /**
    * 域名套餐
    */
    @SerializedName("DomainPkg")
    @Expose
    private DomainPackageNew DomainPkg;

    /**
    * 用户appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * clb或saas
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 业务安全包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FraudPkg")
    @Expose
    private FraudPkg FraudPkg;

    /**
    * Bot资源包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BotPkg")
    @Expose
    private BotPkg BotPkg;

    /**
     * Get id 
     * @return InstanceId id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set id
     * @param InstanceId id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get name 
     * @return InstanceName name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set name
     * @param InstanceName name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 资源id 
     * @return ResourceIds 资源id
     */
    public String getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源id
     * @param ResourceIds 资源id
     */
    public void setResourceIds(String ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 付费模式 
     * @return PayMode 付费模式
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
     * @param PayMode 付费模式
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 自动续费 
     * @return RenewFlag 自动续费
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费
     * @param RenewFlag 自动续费
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 弹性计费 
     * @return Mode 弹性计费
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 弹性计费
     * @param Mode 弹性计费
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 套餐版本 
     * @return Level 套餐版本
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 套餐版本
     * @param Level 套餐版本
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 过期时间 
     * @return ValidTime 过期时间
     */
    public String getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set 过期时间
     * @param ValidTime 过期时间
     */
    public void setValidTime(String ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get 开始时间 
     * @return BeginTime 开始时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间
     * @param BeginTime 开始时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 已用 
     * @return DomainCount 已用
     */
    public Long getDomainCount() {
        return this.DomainCount;
    }

    /**
     * Set 已用
     * @param DomainCount 已用
     */
    public void setDomainCount(Long DomainCount) {
        this.DomainCount = DomainCount;
    }

    /**
     * Get 上限 
     * @return SubDomainLimit 上限
     */
    public Long getSubDomainLimit() {
        return this.SubDomainLimit;
    }

    /**
     * Set 上限
     * @param SubDomainLimit 上限
     */
    public void setSubDomainLimit(Long SubDomainLimit) {
        this.SubDomainLimit = SubDomainLimit;
    }

    /**
     * Get 已用 
     * @return MainDomainCount 已用
     */
    public Long getMainDomainCount() {
        return this.MainDomainCount;
    }

    /**
     * Set 已用
     * @param MainDomainCount 已用
     */
    public void setMainDomainCount(Long MainDomainCount) {
        this.MainDomainCount = MainDomainCount;
    }

    /**
     * Get 上限 
     * @return MainDomainLimit 上限
     */
    public Long getMainDomainLimit() {
        return this.MainDomainLimit;
    }

    /**
     * Set 上限
     * @param MainDomainLimit 上限
     */
    public void setMainDomainLimit(Long MainDomainLimit) {
        this.MainDomainLimit = MainDomainLimit;
    }

    /**
     * Get 峰值 
     * @return MaxQPS 峰值
     */
    public Long getMaxQPS() {
        return this.MaxQPS;
    }

    /**
     * Set 峰值
     * @param MaxQPS 峰值
     */
    public void setMaxQPS(Long MaxQPS) {
        this.MaxQPS = MaxQPS;
    }

    /**
     * Get qps套餐 
     * @return QPS qps套餐
     */
    public QPSPackageNew getQPS() {
        return this.QPS;
    }

    /**
     * Set qps套餐
     * @param QPS qps套餐
     */
    public void setQPS(QPSPackageNew QPS) {
        this.QPS = QPS;
    }

    /**
     * Get 域名套餐 
     * @return DomainPkg 域名套餐
     */
    public DomainPackageNew getDomainPkg() {
        return this.DomainPkg;
    }

    /**
     * Set 域名套餐
     * @param DomainPkg 域名套餐
     */
    public void setDomainPkg(DomainPackageNew DomainPkg) {
        this.DomainPkg = DomainPkg;
    }

    /**
     * Get 用户appid 
     * @return AppId 用户appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
     * @param AppId 用户appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get clb或saas 
     * @return Edition clb或saas
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set clb或saas
     * @param Edition clb或saas
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 业务安全包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FraudPkg 业务安全包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FraudPkg getFraudPkg() {
        return this.FraudPkg;
    }

    /**
     * Set 业务安全包
注意：此字段可能返回 null，表示取不到有效值。
     * @param FraudPkg 业务安全包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFraudPkg(FraudPkg FraudPkg) {
        this.FraudPkg = FraudPkg;
    }

    /**
     * Get Bot资源包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BotPkg Bot资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BotPkg getBotPkg() {
        return this.BotPkg;
    }

    /**
     * Set Bot资源包
注意：此字段可能返回 null，表示取不到有效值。
     * @param BotPkg Bot资源包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBotPkg(BotPkg BotPkg) {
        this.BotPkg = BotPkg;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String(source.ResourceIds);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new String(source.ValidTime);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.DomainCount != null) {
            this.DomainCount = new Long(source.DomainCount);
        }
        if (source.SubDomainLimit != null) {
            this.SubDomainLimit = new Long(source.SubDomainLimit);
        }
        if (source.MainDomainCount != null) {
            this.MainDomainCount = new Long(source.MainDomainCount);
        }
        if (source.MainDomainLimit != null) {
            this.MainDomainLimit = new Long(source.MainDomainLimit);
        }
        if (source.MaxQPS != null) {
            this.MaxQPS = new Long(source.MaxQPS);
        }
        if (source.QPS != null) {
            this.QPS = new QPSPackageNew(source.QPS);
        }
        if (source.DomainPkg != null) {
            this.DomainPkg = new DomainPackageNew(source.DomainPkg);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.FraudPkg != null) {
            this.FraudPkg = new FraudPkg(source.FraudPkg);
        }
        if (source.BotPkg != null) {
            this.BotPkg = new BotPkg(source.BotPkg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ResourceIds", this.ResourceIds);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "ValidTime", this.ValidTime);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "DomainCount", this.DomainCount);
        this.setParamSimple(map, prefix + "SubDomainLimit", this.SubDomainLimit);
        this.setParamSimple(map, prefix + "MainDomainCount", this.MainDomainCount);
        this.setParamSimple(map, prefix + "MainDomainLimit", this.MainDomainLimit);
        this.setParamSimple(map, prefix + "MaxQPS", this.MaxQPS);
        this.setParamObj(map, prefix + "QPS.", this.QPS);
        this.setParamObj(map, prefix + "DomainPkg.", this.DomainPkg);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamObj(map, prefix + "FraudPkg.", this.FraudPkg);
        this.setParamObj(map, prefix + "BotPkg.", this.BotPkg);

    }
}

