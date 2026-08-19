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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmRisk extends AbstractModel {

    /**
    * <p>风险id</p>
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * <p>风险名称</p>
    */
    @SerializedName("RiskName")
    @Expose
    private String RiskName;

    /**
    * <p>风险英文名称</p>
    */
    @SerializedName("RiskNameEn")
    @Expose
    private String RiskNameEn;

    /**
    * <p>策略类型</p>
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * <p>策略类别</p>
    */
    @SerializedName("StrategyCategory")
    @Expose
    private String StrategyCategory;

    /**
    * <p>风险等级</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>资产实例Id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>资产类型</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>资产名</p>
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * <p>地域</p>
    */
    @SerializedName("AssetRegion")
    @Expose
    private String AssetRegion;

    /**
    * <p>资产账号</p>
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * <p>主机地址</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>账号类型</p>
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * <p>风险检出时间</p>
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
    * <p>处理状态 0-未处理 1-已处置 2-已忽略</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>身份id</p>
    */
    @SerializedName("IdentifyId")
    @Expose
    private String IdentifyId;

    /**
    * <p>所属云账号uin用户</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private DspmUinUser OwnerUin;

    /**
    * <p>所属个人用户信息</p>
    */
    @SerializedName("Person")
    @Expose
    private DspmPersonUser Person;

    /**
    * <p>风险数据。</p>
    */
    @SerializedName("RiskData")
    @Expose
    private String RiskData;

    /**
    * <p>是否资产管理员</p>
    */
    @SerializedName("IsAssetManager")
    @Expose
    private Long IsAssetManager;

    /**
    * <p>数据起始时间</p>
    */
    @SerializedName("DataBeginTime")
    @Expose
    private String DataBeginTime;

    /**
    * <p>数据结束时间</p>
    */
    @SerializedName("DataEndTime")
    @Expose
    private String DataEndTime;

    /**
    * <p>风险类型。risk-风险；alarm-告警。</p>
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * <p>资产所属账号app id</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>账号昵称</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>资产所属账号uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>MongoDb的集群类型，非 MongoDB 资产固定 0</p><p>枚举值：</p><ul><li>0： 副本集</li><li>1： 分片</li></ul><p>默认值：0</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get <p>风险id</p> 
     * @return RiskId <p>风险id</p>
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set <p>风险id</p>
     * @param RiskId <p>风险id</p>
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get <p>风险名称</p> 
     * @return RiskName <p>风险名称</p>
     */
    public String getRiskName() {
        return this.RiskName;
    }

    /**
     * Set <p>风险名称</p>
     * @param RiskName <p>风险名称</p>
     */
    public void setRiskName(String RiskName) {
        this.RiskName = RiskName;
    }

    /**
     * Get <p>风险英文名称</p> 
     * @return RiskNameEn <p>风险英文名称</p>
     */
    public String getRiskNameEn() {
        return this.RiskNameEn;
    }

    /**
     * Set <p>风险英文名称</p>
     * @param RiskNameEn <p>风险英文名称</p>
     */
    public void setRiskNameEn(String RiskNameEn) {
        this.RiskNameEn = RiskNameEn;
    }

    /**
     * Get <p>策略类型</p> 
     * @return StrategyType <p>策略类型</p>
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>策略类型</p>
     * @param StrategyType <p>策略类型</p>
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>策略类别</p> 
     * @return StrategyCategory <p>策略类别</p>
     */
    public String getStrategyCategory() {
        return this.StrategyCategory;
    }

    /**
     * Set <p>策略类别</p>
     * @param StrategyCategory <p>策略类别</p>
     */
    public void setStrategyCategory(String StrategyCategory) {
        this.StrategyCategory = StrategyCategory;
    }

    /**
     * Get <p>风险等级</p> 
     * @return RiskLevel <p>风险等级</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级</p>
     * @param RiskLevel <p>风险等级</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>资产实例Id</p> 
     * @return AssetId <p>资产实例Id</p>
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>资产实例Id</p>
     * @param AssetId <p>资产实例Id</p>
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>资产类型</p> 
     * @return AssetType <p>资产类型</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型</p>
     * @param AssetType <p>资产类型</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>资产名</p> 
     * @return AssetName <p>资产名</p>
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set <p>资产名</p>
     * @param AssetName <p>资产名</p>
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get <p>地域</p> 
     * @return AssetRegion <p>地域</p>
     */
    public String getAssetRegion() {
        return this.AssetRegion;
    }

    /**
     * Set <p>地域</p>
     * @param AssetRegion <p>地域</p>
     */
    public void setAssetRegion(String AssetRegion) {
        this.AssetRegion = AssetRegion;
    }

    /**
     * Get <p>资产账号</p> 
     * @return Account <p>资产账号</p>
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set <p>资产账号</p>
     * @param Account <p>资产账号</p>
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get <p>主机地址</p> 
     * @return Host <p>主机地址</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>主机地址</p>
     * @param Host <p>主机地址</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>账号类型</p> 
     * @return AccountType <p>账号类型</p>
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set <p>账号类型</p>
     * @param AccountType <p>账号类型</p>
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get <p>风险检出时间</p> 
     * @return DetectTime <p>风险检出时间</p>
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set <p>风险检出时间</p>
     * @param DetectTime <p>风险检出时间</p>
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
    }

    /**
     * Get <p>处理状态 0-未处理 1-已处置 2-已忽略</p> 
     * @return Status <p>处理状态 0-未处理 1-已处置 2-已忽略</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>处理状态 0-未处理 1-已处置 2-已忽略</p>
     * @param Status <p>处理状态 0-未处理 1-已处置 2-已忽略</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>身份id</p> 
     * @return IdentifyId <p>身份id</p>
     */
    public String getIdentifyId() {
        return this.IdentifyId;
    }

    /**
     * Set <p>身份id</p>
     * @param IdentifyId <p>身份id</p>
     */
    public void setIdentifyId(String IdentifyId) {
        this.IdentifyId = IdentifyId;
    }

    /**
     * Get <p>所属云账号uin用户</p> 
     * @return OwnerUin <p>所属云账号uin用户</p>
     */
    public DspmUinUser getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>所属云账号uin用户</p>
     * @param OwnerUin <p>所属云账号uin用户</p>
     */
    public void setOwnerUin(DspmUinUser OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>所属个人用户信息</p> 
     * @return Person <p>所属个人用户信息</p>
     */
    public DspmPersonUser getPerson() {
        return this.Person;
    }

    /**
     * Set <p>所属个人用户信息</p>
     * @param Person <p>所属个人用户信息</p>
     */
    public void setPerson(DspmPersonUser Person) {
        this.Person = Person;
    }

    /**
     * Get <p>风险数据。</p> 
     * @return RiskData <p>风险数据。</p>
     */
    public String getRiskData() {
        return this.RiskData;
    }

    /**
     * Set <p>风险数据。</p>
     * @param RiskData <p>风险数据。</p>
     */
    public void setRiskData(String RiskData) {
        this.RiskData = RiskData;
    }

    /**
     * Get <p>是否资产管理员</p> 
     * @return IsAssetManager <p>是否资产管理员</p>
     */
    public Long getIsAssetManager() {
        return this.IsAssetManager;
    }

    /**
     * Set <p>是否资产管理员</p>
     * @param IsAssetManager <p>是否资产管理员</p>
     */
    public void setIsAssetManager(Long IsAssetManager) {
        this.IsAssetManager = IsAssetManager;
    }

    /**
     * Get <p>数据起始时间</p> 
     * @return DataBeginTime <p>数据起始时间</p>
     */
    public String getDataBeginTime() {
        return this.DataBeginTime;
    }

    /**
     * Set <p>数据起始时间</p>
     * @param DataBeginTime <p>数据起始时间</p>
     */
    public void setDataBeginTime(String DataBeginTime) {
        this.DataBeginTime = DataBeginTime;
    }

    /**
     * Get <p>数据结束时间</p> 
     * @return DataEndTime <p>数据结束时间</p>
     */
    public String getDataEndTime() {
        return this.DataEndTime;
    }

    /**
     * Set <p>数据结束时间</p>
     * @param DataEndTime <p>数据结束时间</p>
     */
    public void setDataEndTime(String DataEndTime) {
        this.DataEndTime = DataEndTime;
    }

    /**
     * Get <p>风险类型。risk-风险；alarm-告警。</p> 
     * @return RiskType <p>风险类型。risk-风险；alarm-告警。</p>
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set <p>风险类型。risk-风险；alarm-告警。</p>
     * @param RiskType <p>风险类型。risk-风险；alarm-告警。</p>
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get <p>资产所属账号app id</p> 
     * @return AppId <p>资产所属账号app id</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>资产所属账号app id</p>
     * @param AppId <p>资产所属账号app id</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>账号昵称</p> 
     * @return NickName <p>账号昵称</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>账号昵称</p>
     * @param NickName <p>账号昵称</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>资产所属账号uin</p> 
     * @return Uin <p>资产所属账号uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>资产所属账号uin</p>
     * @param Uin <p>资产所属账号uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>MongoDb的集群类型，非 MongoDB 资产固定 0</p><p>枚举值：</p><ul><li>0： 副本集</li><li>1： 分片</li></ul><p>默认值：0</p> 
     * @return ClusterType <p>MongoDb的集群类型，非 MongoDB 资产固定 0</p><p>枚举值：</p><ul><li>0： 副本集</li><li>1： 分片</li></ul><p>默认值：0</p>
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>MongoDb的集群类型，非 MongoDB 资产固定 0</p><p>枚举值：</p><ul><li>0： 副本集</li><li>1： 分片</li></ul><p>默认值：0</p>
     * @param ClusterType <p>MongoDb的集群类型，非 MongoDB 资产固定 0</p><p>枚举值：</p><ul><li>0： 副本集</li><li>1： 分片</li></ul><p>默认值：0</p>
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName <p>集群名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName <p>集群名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public DspmRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmRisk(DspmRisk source) {
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.RiskName != null) {
            this.RiskName = new String(source.RiskName);
        }
        if (source.RiskNameEn != null) {
            this.RiskNameEn = new String(source.RiskNameEn);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.StrategyCategory != null) {
            this.StrategyCategory = new String(source.StrategyCategory);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetRegion != null) {
            this.AssetRegion = new String(source.AssetRegion);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.DetectTime != null) {
            this.DetectTime = new String(source.DetectTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IdentifyId != null) {
            this.IdentifyId = new String(source.IdentifyId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new DspmUinUser(source.OwnerUin);
        }
        if (source.Person != null) {
            this.Person = new DspmPersonUser(source.Person);
        }
        if (source.RiskData != null) {
            this.RiskData = new String(source.RiskData);
        }
        if (source.IsAssetManager != null) {
            this.IsAssetManager = new Long(source.IsAssetManager);
        }
        if (source.DataBeginTime != null) {
            this.DataBeginTime = new String(source.DataBeginTime);
        }
        if (source.DataEndTime != null) {
            this.DataEndTime = new String(source.DataEndTime);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "RiskName", this.RiskName);
        this.setParamSimple(map, prefix + "RiskNameEn", this.RiskNameEn);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "StrategyCategory", this.StrategyCategory);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetRegion", this.AssetRegion);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IdentifyId", this.IdentifyId);
        this.setParamObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamSimple(map, prefix + "RiskData", this.RiskData);
        this.setParamSimple(map, prefix + "IsAssetManager", this.IsAssetManager);
        this.setParamSimple(map, prefix + "DataBeginTime", this.DataBeginTime);
        this.setParamSimple(map, prefix + "DataEndTime", this.DataEndTime);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

