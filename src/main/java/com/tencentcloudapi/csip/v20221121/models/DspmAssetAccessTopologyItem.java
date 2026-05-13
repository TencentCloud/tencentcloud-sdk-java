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

public class DspmAssetAccessTopologyItem extends AbstractModel {

    /**
    * 资产id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 资产类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 资产名
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 资产账号
    */
    @SerializedName("AssetAccount")
    @Expose
    private String AssetAccount;

    /**
    * 主机地址
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 账号类型
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 资产地址
    */
    @SerializedName("AssetIp")
    @Expose
    private String AssetIp;

    /**
    * 访问来源ip地址
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 访问来源ip类型
    */
    @SerializedName("SourceIpType")
    @Expose
    private String SourceIpType;

    /**
    * 访问频率。次/天
    */
    @SerializedName("AccessFrequency")
    @Expose
    private DspmFrequency AccessFrequency;

    /**
    * 执行SQL频率。条/小时。
    */
    @SerializedName("ExecSQLFrequency")
    @Expose
    private DspmFrequency ExecSQLFrequency;

    /**
    * 访问起始时间
    */
    @SerializedName("AccessBeginTime")
    @Expose
    private String AccessBeginTime;

    /**
    * 访问结束时间
    */
    @SerializedName("AccessEndTime")
    @Expose
    private String AccessEndTime;

    /**
    * 账号风险数
    */
    @SerializedName("AccountRisk")
    @Expose
    private Long AccountRisk;

    /**
    * 资产风险数
    */
    @SerializedName("AssetRisk")
    @Expose
    private Long AssetRisk;

    /**
    * 所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 身份类型。非身份账号为null。0-未定义 2-长期身份 3-临时身份
    */
    @SerializedName("IdentifyType")
    @Expose
    private Long IdentifyType;

    /**
    * 所属云账号uin用户。
    */
    @SerializedName("OwnerUin")
    @Expose
    private DspmUinUser OwnerUin;

    /**
    * 所属个人用户信息。
    */
    @SerializedName("Person")
    @Expose
    private DspmPersonUser Person;

    /**
    * 账号告警数
    */
    @SerializedName("AccountAlarm")
    @Expose
    private Long AccountAlarm;

    /**
    * 资产告警数
    */
    @SerializedName("AssetAlarm")
    @Expose
    private Long AssetAlarm;

    /**
     * Get 资产id 
     * @return AssetId 资产id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产id
     * @param AssetId 资产id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
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
     * Get 资产账号 
     * @return AssetAccount 资产账号
     */
    public String getAssetAccount() {
        return this.AssetAccount;
    }

    /**
     * Set 资产账号
     * @param AssetAccount 资产账号
     */
    public void setAssetAccount(String AssetAccount) {
        this.AssetAccount = AssetAccount;
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
     * Get 资产地址 
     * @return AssetIp 资产地址
     */
    public String getAssetIp() {
        return this.AssetIp;
    }

    /**
     * Set 资产地址
     * @param AssetIp 资产地址
     */
    public void setAssetIp(String AssetIp) {
        this.AssetIp = AssetIp;
    }

    /**
     * Get 访问来源ip地址 
     * @return SourceIp 访问来源ip地址
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 访问来源ip地址
     * @param SourceIp 访问来源ip地址
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 访问来源ip类型 
     * @return SourceIpType 访问来源ip类型
     */
    public String getSourceIpType() {
        return this.SourceIpType;
    }

    /**
     * Set 访问来源ip类型
     * @param SourceIpType 访问来源ip类型
     */
    public void setSourceIpType(String SourceIpType) {
        this.SourceIpType = SourceIpType;
    }

    /**
     * Get 访问频率。次/天 
     * @return AccessFrequency 访问频率。次/天
     */
    public DspmFrequency getAccessFrequency() {
        return this.AccessFrequency;
    }

    /**
     * Set 访问频率。次/天
     * @param AccessFrequency 访问频率。次/天
     */
    public void setAccessFrequency(DspmFrequency AccessFrequency) {
        this.AccessFrequency = AccessFrequency;
    }

    /**
     * Get 执行SQL频率。条/小时。 
     * @return ExecSQLFrequency 执行SQL频率。条/小时。
     */
    public DspmFrequency getExecSQLFrequency() {
        return this.ExecSQLFrequency;
    }

    /**
     * Set 执行SQL频率。条/小时。
     * @param ExecSQLFrequency 执行SQL频率。条/小时。
     */
    public void setExecSQLFrequency(DspmFrequency ExecSQLFrequency) {
        this.ExecSQLFrequency = ExecSQLFrequency;
    }

    /**
     * Get 访问起始时间 
     * @return AccessBeginTime 访问起始时间
     */
    public String getAccessBeginTime() {
        return this.AccessBeginTime;
    }

    /**
     * Set 访问起始时间
     * @param AccessBeginTime 访问起始时间
     */
    public void setAccessBeginTime(String AccessBeginTime) {
        this.AccessBeginTime = AccessBeginTime;
    }

    /**
     * Get 访问结束时间 
     * @return AccessEndTime 访问结束时间
     */
    public String getAccessEndTime() {
        return this.AccessEndTime;
    }

    /**
     * Set 访问结束时间
     * @param AccessEndTime 访问结束时间
     */
    public void setAccessEndTime(String AccessEndTime) {
        this.AccessEndTime = AccessEndTime;
    }

    /**
     * Get 账号风险数 
     * @return AccountRisk 账号风险数
     */
    public Long getAccountRisk() {
        return this.AccountRisk;
    }

    /**
     * Set 账号风险数
     * @param AccountRisk 账号风险数
     */
    public void setAccountRisk(Long AccountRisk) {
        this.AccountRisk = AccountRisk;
    }

    /**
     * Get 资产风险数 
     * @return AssetRisk 资产风险数
     */
    public Long getAssetRisk() {
        return this.AssetRisk;
    }

    /**
     * Set 资产风险数
     * @param AssetRisk 资产风险数
     */
    public void setAssetRisk(Long AssetRisk) {
        this.AssetRisk = AssetRisk;
    }

    /**
     * Get 所属地域 
     * @return Region 所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 所属地域
     * @param Region 所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 身份类型。非身份账号为null。0-未定义 2-长期身份 3-临时身份 
     * @return IdentifyType 身份类型。非身份账号为null。0-未定义 2-长期身份 3-临时身份
     */
    public Long getIdentifyType() {
        return this.IdentifyType;
    }

    /**
     * Set 身份类型。非身份账号为null。0-未定义 2-长期身份 3-临时身份
     * @param IdentifyType 身份类型。非身份账号为null。0-未定义 2-长期身份 3-临时身份
     */
    public void setIdentifyType(Long IdentifyType) {
        this.IdentifyType = IdentifyType;
    }

    /**
     * Get 所属云账号uin用户。 
     * @return OwnerUin 所属云账号uin用户。
     */
    public DspmUinUser getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 所属云账号uin用户。
     * @param OwnerUin 所属云账号uin用户。
     */
    public void setOwnerUin(DspmUinUser OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 所属个人用户信息。 
     * @return Person 所属个人用户信息。
     */
    public DspmPersonUser getPerson() {
        return this.Person;
    }

    /**
     * Set 所属个人用户信息。
     * @param Person 所属个人用户信息。
     */
    public void setPerson(DspmPersonUser Person) {
        this.Person = Person;
    }

    /**
     * Get 账号告警数 
     * @return AccountAlarm 账号告警数
     */
    public Long getAccountAlarm() {
        return this.AccountAlarm;
    }

    /**
     * Set 账号告警数
     * @param AccountAlarm 账号告警数
     */
    public void setAccountAlarm(Long AccountAlarm) {
        this.AccountAlarm = AccountAlarm;
    }

    /**
     * Get 资产告警数 
     * @return AssetAlarm 资产告警数
     */
    public Long getAssetAlarm() {
        return this.AssetAlarm;
    }

    /**
     * Set 资产告警数
     * @param AssetAlarm 资产告警数
     */
    public void setAssetAlarm(Long AssetAlarm) {
        this.AssetAlarm = AssetAlarm;
    }

    public DspmAssetAccessTopologyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetAccessTopologyItem(DspmAssetAccessTopologyItem source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetAccount != null) {
            this.AssetAccount = new String(source.AssetAccount);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.AssetIp != null) {
            this.AssetIp = new String(source.AssetIp);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.SourceIpType != null) {
            this.SourceIpType = new String(source.SourceIpType);
        }
        if (source.AccessFrequency != null) {
            this.AccessFrequency = new DspmFrequency(source.AccessFrequency);
        }
        if (source.ExecSQLFrequency != null) {
            this.ExecSQLFrequency = new DspmFrequency(source.ExecSQLFrequency);
        }
        if (source.AccessBeginTime != null) {
            this.AccessBeginTime = new String(source.AccessBeginTime);
        }
        if (source.AccessEndTime != null) {
            this.AccessEndTime = new String(source.AccessEndTime);
        }
        if (source.AccountRisk != null) {
            this.AccountRisk = new Long(source.AccountRisk);
        }
        if (source.AssetRisk != null) {
            this.AssetRisk = new Long(source.AssetRisk);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.IdentifyType != null) {
            this.IdentifyType = new Long(source.IdentifyType);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new DspmUinUser(source.OwnerUin);
        }
        if (source.Person != null) {
            this.Person = new DspmPersonUser(source.Person);
        }
        if (source.AccountAlarm != null) {
            this.AccountAlarm = new Long(source.AccountAlarm);
        }
        if (source.AssetAlarm != null) {
            this.AssetAlarm = new Long(source.AssetAlarm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetAccount", this.AssetAccount);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "AssetIp", this.AssetIp);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "SourceIpType", this.SourceIpType);
        this.setParamObj(map, prefix + "AccessFrequency.", this.AccessFrequency);
        this.setParamObj(map, prefix + "ExecSQLFrequency.", this.ExecSQLFrequency);
        this.setParamSimple(map, prefix + "AccessBeginTime", this.AccessBeginTime);
        this.setParamSimple(map, prefix + "AccessEndTime", this.AccessEndTime);
        this.setParamSimple(map, prefix + "AccountRisk", this.AccountRisk);
        this.setParamSimple(map, prefix + "AssetRisk", this.AssetRisk);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "IdentifyType", this.IdentifyType);
        this.setParamObj(map, prefix + "OwnerUin.", this.OwnerUin);
        this.setParamObj(map, prefix + "Person.", this.Person);
        this.setParamSimple(map, prefix + "AccountAlarm", this.AccountAlarm);
        this.setParamSimple(map, prefix + "AssetAlarm", this.AssetAlarm);

    }
}

