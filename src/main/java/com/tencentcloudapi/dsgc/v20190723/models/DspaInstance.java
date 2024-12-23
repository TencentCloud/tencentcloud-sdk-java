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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaInstance extends AbstractModel {

    /**
    * DSPA实例ID。
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * DSPA实例名称。
    */
    @SerializedName("DspaName")
    @Expose
    private String DspaName;

    /**
    * DSPA实例描述信息。
    */
    @SerializedName("DspaDescription")
    @Expose
    private String DspaDescription;

    /**
    * DSPA实例已授权的数据库实例数量。
    */
    @SerializedName("DBAuthCount")
    @Expose
    private Long DBAuthCount;

    /**
    * DSPA实例已绑定的cos桶数量。
    */
    @SerializedName("CosBindCount")
    @Expose
    private Long CosBindCount;

    /**
    * DSPA实例版本。
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
    * DSPA实例状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例过期时间戳。
    */
    @SerializedName("ExpiredAt")
    @Expose
    private Long ExpiredAt;

    /**
    * 账户APPID。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 体验版本信息。
    */
    @SerializedName("TrialVersion")
    @Expose
    private String TrialVersion;

    /**
    * 体验版本过期时间戳。
    */
    @SerializedName("TrialEndAt")
    @Expose
    private Long TrialEndAt;

    /**
    * DB已购配额。
    */
    @SerializedName("DbTotalQuota")
    @Expose
    private Long DbTotalQuota;

    /**
    * COS已购配额。
    */
    @SerializedName("CosTotalQuota")
    @Expose
    private Long CosTotalQuota;

    /**
    * COS配额单位，例如:TB。
    */
    @SerializedName("CosQuotaUnit")
    @Expose
    private String CosQuotaUnit;

    /**
    * 0: 默认状态(用户未设置)
1: 开启自动续费
2: 明确不自动续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 实例渠道
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 已授权的实例数量
    */
    @SerializedName("InsAuthCount")
    @Expose
    private Long InsAuthCount;

    /**
    * 已购买的实例数量
    */
    @SerializedName("InsTotalQuota")
    @Expose
    private Long InsTotalQuota;

    /**
     * Get DSPA实例ID。 
     * @return DspaId DSPA实例ID。
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID。
     * @param DspaId DSPA实例ID。
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get DSPA实例名称。 
     * @return DspaName DSPA实例名称。
     */
    public String getDspaName() {
        return this.DspaName;
    }

    /**
     * Set DSPA实例名称。
     * @param DspaName DSPA实例名称。
     */
    public void setDspaName(String DspaName) {
        this.DspaName = DspaName;
    }

    /**
     * Get DSPA实例描述信息。 
     * @return DspaDescription DSPA实例描述信息。
     */
    public String getDspaDescription() {
        return this.DspaDescription;
    }

    /**
     * Set DSPA实例描述信息。
     * @param DspaDescription DSPA实例描述信息。
     */
    public void setDspaDescription(String DspaDescription) {
        this.DspaDescription = DspaDescription;
    }

    /**
     * Get DSPA实例已授权的数据库实例数量。 
     * @return DBAuthCount DSPA实例已授权的数据库实例数量。
     */
    public Long getDBAuthCount() {
        return this.DBAuthCount;
    }

    /**
     * Set DSPA实例已授权的数据库实例数量。
     * @param DBAuthCount DSPA实例已授权的数据库实例数量。
     */
    public void setDBAuthCount(Long DBAuthCount) {
        this.DBAuthCount = DBAuthCount;
    }

    /**
     * Get DSPA实例已绑定的cos桶数量。 
     * @return CosBindCount DSPA实例已绑定的cos桶数量。
     */
    public Long getCosBindCount() {
        return this.CosBindCount;
    }

    /**
     * Set DSPA实例已绑定的cos桶数量。
     * @param CosBindCount DSPA实例已绑定的cos桶数量。
     */
    public void setCosBindCount(Long CosBindCount) {
        this.CosBindCount = CosBindCount;
    }

    /**
     * Get DSPA实例版本。 
     * @return InstanceVersion DSPA实例版本。
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set DSPA实例版本。
     * @param InstanceVersion DSPA实例版本。
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get DSPA实例状态。 
     * @return Status DSPA实例状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set DSPA实例状态。
     * @param Status DSPA实例状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例过期时间戳。 
     * @return ExpiredAt 实例过期时间戳。
     */
    public Long getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set 实例过期时间戳。
     * @param ExpiredAt 实例过期时间戳。
     */
    public void setExpiredAt(Long ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
    }

    /**
     * Get 账户APPID。 
     * @return AppId 账户APPID。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 账户APPID。
     * @param AppId 账户APPID。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 体验版本信息。 
     * @return TrialVersion 体验版本信息。
     */
    public String getTrialVersion() {
        return this.TrialVersion;
    }

    /**
     * Set 体验版本信息。
     * @param TrialVersion 体验版本信息。
     */
    public void setTrialVersion(String TrialVersion) {
        this.TrialVersion = TrialVersion;
    }

    /**
     * Get 体验版本过期时间戳。 
     * @return TrialEndAt 体验版本过期时间戳。
     */
    public Long getTrialEndAt() {
        return this.TrialEndAt;
    }

    /**
     * Set 体验版本过期时间戳。
     * @param TrialEndAt 体验版本过期时间戳。
     */
    public void setTrialEndAt(Long TrialEndAt) {
        this.TrialEndAt = TrialEndAt;
    }

    /**
     * Get DB已购配额。 
     * @return DbTotalQuota DB已购配额。
     */
    public Long getDbTotalQuota() {
        return this.DbTotalQuota;
    }

    /**
     * Set DB已购配额。
     * @param DbTotalQuota DB已购配额。
     */
    public void setDbTotalQuota(Long DbTotalQuota) {
        this.DbTotalQuota = DbTotalQuota;
    }

    /**
     * Get COS已购配额。 
     * @return CosTotalQuota COS已购配额。
     */
    public Long getCosTotalQuota() {
        return this.CosTotalQuota;
    }

    /**
     * Set COS已购配额。
     * @param CosTotalQuota COS已购配额。
     */
    public void setCosTotalQuota(Long CosTotalQuota) {
        this.CosTotalQuota = CosTotalQuota;
    }

    /**
     * Get COS配额单位，例如:TB。 
     * @return CosQuotaUnit COS配额单位，例如:TB。
     */
    public String getCosQuotaUnit() {
        return this.CosQuotaUnit;
    }

    /**
     * Set COS配额单位，例如:TB。
     * @param CosQuotaUnit COS配额单位，例如:TB。
     */
    public void setCosQuotaUnit(String CosQuotaUnit) {
        this.CosQuotaUnit = CosQuotaUnit;
    }

    /**
     * Get 0: 默认状态(用户未设置)
1: 开启自动续费
2: 明确不自动续费 
     * @return RenewFlag 0: 默认状态(用户未设置)
1: 开启自动续费
2: 明确不自动续费
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 0: 默认状态(用户未设置)
1: 开启自动续费
2: 明确不自动续费
     * @param RenewFlag 0: 默认状态(用户未设置)
1: 开启自动续费
2: 明确不自动续费
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 实例渠道 
     * @return Channel 实例渠道
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 实例渠道
     * @param Channel 实例渠道
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 已授权的实例数量 
     * @return InsAuthCount 已授权的实例数量
     */
    public Long getInsAuthCount() {
        return this.InsAuthCount;
    }

    /**
     * Set 已授权的实例数量
     * @param InsAuthCount 已授权的实例数量
     */
    public void setInsAuthCount(Long InsAuthCount) {
        this.InsAuthCount = InsAuthCount;
    }

    /**
     * Get 已购买的实例数量 
     * @return InsTotalQuota 已购买的实例数量
     */
    public Long getInsTotalQuota() {
        return this.InsTotalQuota;
    }

    /**
     * Set 已购买的实例数量
     * @param InsTotalQuota 已购买的实例数量
     */
    public void setInsTotalQuota(Long InsTotalQuota) {
        this.InsTotalQuota = InsTotalQuota;
    }

    public DspaInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaInstance(DspaInstance source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.DspaName != null) {
            this.DspaName = new String(source.DspaName);
        }
        if (source.DspaDescription != null) {
            this.DspaDescription = new String(source.DspaDescription);
        }
        if (source.DBAuthCount != null) {
            this.DBAuthCount = new Long(source.DBAuthCount);
        }
        if (source.CosBindCount != null) {
            this.CosBindCount = new Long(source.CosBindCount);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ExpiredAt != null) {
            this.ExpiredAt = new Long(source.ExpiredAt);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.TrialVersion != null) {
            this.TrialVersion = new String(source.TrialVersion);
        }
        if (source.TrialEndAt != null) {
            this.TrialEndAt = new Long(source.TrialEndAt);
        }
        if (source.DbTotalQuota != null) {
            this.DbTotalQuota = new Long(source.DbTotalQuota);
        }
        if (source.CosTotalQuota != null) {
            this.CosTotalQuota = new Long(source.CosTotalQuota);
        }
        if (source.CosQuotaUnit != null) {
            this.CosQuotaUnit = new String(source.CosQuotaUnit);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.InsAuthCount != null) {
            this.InsAuthCount = new Long(source.InsAuthCount);
        }
        if (source.InsTotalQuota != null) {
            this.InsTotalQuota = new Long(source.InsTotalQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "DspaName", this.DspaName);
        this.setParamSimple(map, prefix + "DspaDescription", this.DspaDescription);
        this.setParamSimple(map, prefix + "DBAuthCount", this.DBAuthCount);
        this.setParamSimple(map, prefix + "CosBindCount", this.CosBindCount);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExpiredAt", this.ExpiredAt);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "TrialVersion", this.TrialVersion);
        this.setParamSimple(map, prefix + "TrialEndAt", this.TrialEndAt);
        this.setParamSimple(map, prefix + "DbTotalQuota", this.DbTotalQuota);
        this.setParamSimple(map, prefix + "CosTotalQuota", this.CosTotalQuota);
        this.setParamSimple(map, prefix + "CosQuotaUnit", this.CosQuotaUnit);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "InsAuthCount", this.InsAuthCount);
        this.setParamSimple(map, prefix + "InsTotalQuota", this.InsTotalQuota);

    }
}

