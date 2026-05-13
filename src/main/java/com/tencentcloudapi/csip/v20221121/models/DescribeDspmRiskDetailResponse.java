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

public class DescribeDspmRiskDetailResponse extends AbstractModel {

    /**
    * 风险等级
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 风险检出时间
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
    * 资产实例Id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 资产名
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 资产类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 公网访问地址
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 内网访问地址
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 账号
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 主机地址
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 身份id
    */
    @SerializedName("IdentifyId")
    @Expose
    private String IdentifyId;

    /**
    * 所属云账号uin用户
    */
    @SerializedName("OwnerUin")
    @Expose
    private DspmUinUser OwnerUin;

    /**
    * 所属个人用户信息
    */
    @SerializedName("Person")
    @Expose
    private DspmPersonUser Person;

    /**
    * 风险名称
    */
    @SerializedName("RiskName")
    @Expose
    private String RiskName;

    /**
    * 风险英文名称
    */
    @SerializedName("RiskNameEn")
    @Expose
    private String RiskNameEn;

    /**
    * 风险数据
    */
    @SerializedName("RiskData")
    @Expose
    private String RiskData;

    /**
    * 基线数据
    */
    @SerializedName("BaselineData")
    @Expose
    private String BaselineData;

    /**
    * 风险id
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * 策略类型
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * 策略类别
    */
    @SerializedName("StrategyCategory")
    @Expose
    private String StrategyCategory;

    /**
    * 账号类型
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 风险状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否资产管理员
    */
    @SerializedName("IsAssetManager")
    @Expose
    private Long IsAssetManager;

    /**
    * 数据起始时间
    */
    @SerializedName("DataBeginTime")
    @Expose
    private String DataBeginTime;

    /**
    * 数据结束时间
    */
    @SerializedName("DataEndTime")
    @Expose
    private String DataEndTime;

    /**
    * 风险类型。risk-风险；alarm-告警。
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 风险等级 
     * @return RiskLevel 风险等级
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
     * @param RiskLevel 风险等级
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 风险检出时间 
     * @return DetectTime 风险检出时间
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set 风险检出时间
     * @param DetectTime 风险检出时间
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
    }

    /**
     * Get 资产实例Id 
     * @return AssetId 资产实例Id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产实例Id
     * @param AssetId 资产实例Id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 资产名 
     * @return AssetName 资产名
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产名
     * @param AssetName 资产名
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 资产类型 
     * @return AssetType 资产类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
     * @param AssetType 资产类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
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
     * Get 公网访问地址 
     * @return PublicIp 公网访问地址
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网访问地址
     * @param PublicIp 公网访问地址
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 内网访问地址 
     * @return PrivateIp 内网访问地址
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网访问地址
     * @param PrivateIp 内网访问地址
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 账号 
     * @return Account 账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 账号
     * @param Account 账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 主机地址 
     * @return Host 主机地址
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机地址
     * @param Host 主机地址
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 身份id 
     * @return IdentifyId 身份id
     */
    public String getIdentifyId() {
        return this.IdentifyId;
    }

    /**
     * Set 身份id
     * @param IdentifyId 身份id
     */
    public void setIdentifyId(String IdentifyId) {
        this.IdentifyId = IdentifyId;
    }

    /**
     * Get 所属云账号uin用户 
     * @return OwnerUin 所属云账号uin用户
     */
    public DspmUinUser getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 所属云账号uin用户
     * @param OwnerUin 所属云账号uin用户
     */
    public void setOwnerUin(DspmUinUser OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 所属个人用户信息 
     * @return Person 所属个人用户信息
     */
    public DspmPersonUser getPerson() {
        return this.Person;
    }

    /**
     * Set 所属个人用户信息
     * @param Person 所属个人用户信息
     */
    public void setPerson(DspmPersonUser Person) {
        this.Person = Person;
    }

    /**
     * Get 风险名称 
     * @return RiskName 风险名称
     */
    public String getRiskName() {
        return this.RiskName;
    }

    /**
     * Set 风险名称
     * @param RiskName 风险名称
     */
    public void setRiskName(String RiskName) {
        this.RiskName = RiskName;
    }

    /**
     * Get 风险英文名称 
     * @return RiskNameEn 风险英文名称
     */
    public String getRiskNameEn() {
        return this.RiskNameEn;
    }

    /**
     * Set 风险英文名称
     * @param RiskNameEn 风险英文名称
     */
    public void setRiskNameEn(String RiskNameEn) {
        this.RiskNameEn = RiskNameEn;
    }

    /**
     * Get 风险数据 
     * @return RiskData 风险数据
     */
    public String getRiskData() {
        return this.RiskData;
    }

    /**
     * Set 风险数据
     * @param RiskData 风险数据
     */
    public void setRiskData(String RiskData) {
        this.RiskData = RiskData;
    }

    /**
     * Get 基线数据 
     * @return BaselineData 基线数据
     */
    public String getBaselineData() {
        return this.BaselineData;
    }

    /**
     * Set 基线数据
     * @param BaselineData 基线数据
     */
    public void setBaselineData(String BaselineData) {
        this.BaselineData = BaselineData;
    }

    /**
     * Get 风险id 
     * @return RiskId 风险id
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 风险id
     * @param RiskId 风险id
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get 策略类型 
     * @return StrategyType 策略类型
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 策略类型
     * @param StrategyType 策略类型
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 策略类别 
     * @return StrategyCategory 策略类别
     */
    public String getStrategyCategory() {
        return this.StrategyCategory;
    }

    /**
     * Set 策略类别
     * @param StrategyCategory 策略类别
     */
    public void setStrategyCategory(String StrategyCategory) {
        this.StrategyCategory = StrategyCategory;
    }

    /**
     * Get 账号类型 
     * @return AccountType 账号类型
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 账号类型
     * @param AccountType 账号类型
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 风险状态 
     * @return Status 风险状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 风险状态
     * @param Status 风险状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否资产管理员 
     * @return IsAssetManager 是否资产管理员
     */
    public Long getIsAssetManager() {
        return this.IsAssetManager;
    }

    /**
     * Set 是否资产管理员
     * @param IsAssetManager 是否资产管理员
     */
    public void setIsAssetManager(Long IsAssetManager) {
        this.IsAssetManager = IsAssetManager;
    }

    /**
     * Get 数据起始时间 
     * @return DataBeginTime 数据起始时间
     */
    public String getDataBeginTime() {
        return this.DataBeginTime;
    }

    /**
     * Set 数据起始时间
     * @param DataBeginTime 数据起始时间
     */
    public void setDataBeginTime(String DataBeginTime) {
        this.DataBeginTime = DataBeginTime;
    }

    /**
     * Get 数据结束时间 
     * @return DataEndTime 数据结束时间
     */
    public String getDataEndTime() {
        return this.DataEndTime;
    }

    /**
     * Set 数据结束时间
     * @param DataEndTime 数据结束时间
     */
    public void setDataEndTime(String DataEndTime) {
        this.DataEndTime = DataEndTime;
    }

    /**
     * Get 风险类型。risk-风险；alarm-告警。 
     * @return RiskType 风险类型。risk-风险；alarm-告警。
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类型。risk-风险；alarm-告警。
     * @param RiskType 风险类型。risk-风险；alarm-告警。
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDspmRiskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmRiskDetailResponse(DescribeDspmRiskDetailResponse source) {
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.DetectTime != null) {
            this.DetectTime = new String(source.DetectTime);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
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
        if (source.RiskName != null) {
            this.RiskName = new String(source.RiskName);
        }
        if (source.RiskNameEn != null) {
            this.RiskNameEn = new String(source.RiskNameEn);
        }
        if (source.RiskData != null) {
            this.RiskData = new String(source.RiskData);
        }
        if (source.BaselineData != null) {
            this.BaselineData = new String(source.BaselineData);
        }
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.StrategyCategory != null) {
            this.StrategyCategory = new String(source.StrategyCategory);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "IdentifyId", this.IdentifyId);
        this.setParamObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamSimple(map, prefix + "RiskName", this.RiskName);
        this.setParamSimple(map, prefix + "RiskNameEn", this.RiskNameEn);
        this.setParamSimple(map, prefix + "RiskData", this.RiskData);
        this.setParamSimple(map, prefix + "BaselineData", this.BaselineData);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "StrategyCategory", this.StrategyCategory);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsAssetManager", this.IsAssetManager);
        this.setParamSimple(map, prefix + "DataBeginTime", this.DataBeginTime);
        this.setParamSimple(map, prefix + "DataEndTime", this.DataEndTime);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

