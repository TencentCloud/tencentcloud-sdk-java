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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLicenseGeneralResponse extends AbstractModel{

    /**
    * 总授权数 (包含隔离,过期等不可用状态)
    */
    @SerializedName("LicenseCnt")
    @Expose
    private Long LicenseCnt;

    /**
    * 可用授权数
    */
    @SerializedName("AvailableLicenseCnt")
    @Expose
    private Long AvailableLicenseCnt;

    /**
    * 可用专业版授权数(包含后付费).
    */
    @SerializedName("AvailableProVersionLicenseCnt")
    @Expose
    private Long AvailableProVersionLicenseCnt;

    /**
    * 可用旗舰版授权数
    */
    @SerializedName("AvailableFlagshipVersionLicenseCnt")
    @Expose
    private Long AvailableFlagshipVersionLicenseCnt;

    /**
    * 即将到期授权数 (15天内到期的)
    */
    @SerializedName("NearExpiryLicenseCnt")
    @Expose
    private Long NearExpiryLicenseCnt;

    /**
    * 已到期授权数(不包含已删除的记录)
    */
    @SerializedName("ExpireLicenseCnt")
    @Expose
    private Long ExpireLicenseCnt;

    /**
    * 自动升级开关状态,默认 false,  true 开启, false 关闭
    */
    @SerializedName("AutoOpenStatus")
    @Expose
    private Boolean AutoOpenStatus;

    /**
    * PROVERSION_POSTPAY 专业版-后付费, PROVERSION_PREPAY 专业版-预付费, FLAGSHIP_PREPAY 旗舰版-预付费
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * 历史是否开通过自动升级开关
    */
    @SerializedName("IsOpenStatusHistory")
    @Expose
    private Boolean IsOpenStatusHistory;

    /**
    * 已使用授权数
    */
    @SerializedName("UsedLicenseCnt")
    @Expose
    private Long UsedLicenseCnt;

    /**
    * 未到期授权数
    */
    @SerializedName("NotExpiredLicenseCnt")
    @Expose
    private Long NotExpiredLicenseCnt;

    /**
    * 旗舰版总授权数(有效订单)
    */
    @SerializedName("FlagshipVersionLicenseCnt")
    @Expose
    private Long FlagshipVersionLicenseCnt;

    /**
    * 专业版总授权数(有效订单)
    */
    @SerializedName("ProVersionLicenseCnt")
    @Expose
    private Long ProVersionLicenseCnt;

    /**
    * 普惠版总授权数(有效订单的授权数)
    */
    @SerializedName("CwpVersionLicenseCnt")
    @Expose
    private Long CwpVersionLicenseCnt;

    /**
    * 可用惠普版授权数
    */
    @SerializedName("AvailableLHLicenseCnt")
    @Expose
    private Long AvailableLHLicenseCnt;

    /**
    * 自动加购开关, true 开启, false 关闭
    */
    @SerializedName("AutoRepurchaseSwitch")
    @Expose
    private Boolean AutoRepurchaseSwitch;

    /**
    * 自动加购订单是否自动续费 ,true 开启, false 关闭
    */
    @SerializedName("AutoRepurchaseRenewSwitch")
    @Expose
    private Boolean AutoRepurchaseRenewSwitch;

    /**
    * 已销毁订单数
    */
    @SerializedName("DestroyOrderNum")
    @Expose
    private Long DestroyOrderNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总授权数 (包含隔离,过期等不可用状态) 
     * @return LicenseCnt 总授权数 (包含隔离,过期等不可用状态)
     */
    public Long getLicenseCnt() {
        return this.LicenseCnt;
    }

    /**
     * Set 总授权数 (包含隔离,过期等不可用状态)
     * @param LicenseCnt 总授权数 (包含隔离,过期等不可用状态)
     */
    public void setLicenseCnt(Long LicenseCnt) {
        this.LicenseCnt = LicenseCnt;
    }

    /**
     * Get 可用授权数 
     * @return AvailableLicenseCnt 可用授权数
     */
    public Long getAvailableLicenseCnt() {
        return this.AvailableLicenseCnt;
    }

    /**
     * Set 可用授权数
     * @param AvailableLicenseCnt 可用授权数
     */
    public void setAvailableLicenseCnt(Long AvailableLicenseCnt) {
        this.AvailableLicenseCnt = AvailableLicenseCnt;
    }

    /**
     * Get 可用专业版授权数(包含后付费). 
     * @return AvailableProVersionLicenseCnt 可用专业版授权数(包含后付费).
     */
    public Long getAvailableProVersionLicenseCnt() {
        return this.AvailableProVersionLicenseCnt;
    }

    /**
     * Set 可用专业版授权数(包含后付费).
     * @param AvailableProVersionLicenseCnt 可用专业版授权数(包含后付费).
     */
    public void setAvailableProVersionLicenseCnt(Long AvailableProVersionLicenseCnt) {
        this.AvailableProVersionLicenseCnt = AvailableProVersionLicenseCnt;
    }

    /**
     * Get 可用旗舰版授权数 
     * @return AvailableFlagshipVersionLicenseCnt 可用旗舰版授权数
     */
    public Long getAvailableFlagshipVersionLicenseCnt() {
        return this.AvailableFlagshipVersionLicenseCnt;
    }

    /**
     * Set 可用旗舰版授权数
     * @param AvailableFlagshipVersionLicenseCnt 可用旗舰版授权数
     */
    public void setAvailableFlagshipVersionLicenseCnt(Long AvailableFlagshipVersionLicenseCnt) {
        this.AvailableFlagshipVersionLicenseCnt = AvailableFlagshipVersionLicenseCnt;
    }

    /**
     * Get 即将到期授权数 (15天内到期的) 
     * @return NearExpiryLicenseCnt 即将到期授权数 (15天内到期的)
     */
    public Long getNearExpiryLicenseCnt() {
        return this.NearExpiryLicenseCnt;
    }

    /**
     * Set 即将到期授权数 (15天内到期的)
     * @param NearExpiryLicenseCnt 即将到期授权数 (15天内到期的)
     */
    public void setNearExpiryLicenseCnt(Long NearExpiryLicenseCnt) {
        this.NearExpiryLicenseCnt = NearExpiryLicenseCnt;
    }

    /**
     * Get 已到期授权数(不包含已删除的记录) 
     * @return ExpireLicenseCnt 已到期授权数(不包含已删除的记录)
     */
    public Long getExpireLicenseCnt() {
        return this.ExpireLicenseCnt;
    }

    /**
     * Set 已到期授权数(不包含已删除的记录)
     * @param ExpireLicenseCnt 已到期授权数(不包含已删除的记录)
     */
    public void setExpireLicenseCnt(Long ExpireLicenseCnt) {
        this.ExpireLicenseCnt = ExpireLicenseCnt;
    }

    /**
     * Get 自动升级开关状态,默认 false,  true 开启, false 关闭 
     * @return AutoOpenStatus 自动升级开关状态,默认 false,  true 开启, false 关闭
     */
    public Boolean getAutoOpenStatus() {
        return this.AutoOpenStatus;
    }

    /**
     * Set 自动升级开关状态,默认 false,  true 开启, false 关闭
     * @param AutoOpenStatus 自动升级开关状态,默认 false,  true 开启, false 关闭
     */
    public void setAutoOpenStatus(Boolean AutoOpenStatus) {
        this.AutoOpenStatus = AutoOpenStatus;
    }

    /**
     * Get PROVERSION_POSTPAY 专业版-后付费, PROVERSION_PREPAY 专业版-预付费, FLAGSHIP_PREPAY 旗舰版-预付费 
     * @return ProtectType PROVERSION_POSTPAY 专业版-后付费, PROVERSION_PREPAY 专业版-预付费, FLAGSHIP_PREPAY 旗舰版-预付费
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set PROVERSION_POSTPAY 专业版-后付费, PROVERSION_PREPAY 专业版-预付费, FLAGSHIP_PREPAY 旗舰版-预付费
     * @param ProtectType PROVERSION_POSTPAY 专业版-后付费, PROVERSION_PREPAY 专业版-预付费, FLAGSHIP_PREPAY 旗舰版-预付费
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get 历史是否开通过自动升级开关 
     * @return IsOpenStatusHistory 历史是否开通过自动升级开关
     */
    public Boolean getIsOpenStatusHistory() {
        return this.IsOpenStatusHistory;
    }

    /**
     * Set 历史是否开通过自动升级开关
     * @param IsOpenStatusHistory 历史是否开通过自动升级开关
     */
    public void setIsOpenStatusHistory(Boolean IsOpenStatusHistory) {
        this.IsOpenStatusHistory = IsOpenStatusHistory;
    }

    /**
     * Get 已使用授权数 
     * @return UsedLicenseCnt 已使用授权数
     */
    public Long getUsedLicenseCnt() {
        return this.UsedLicenseCnt;
    }

    /**
     * Set 已使用授权数
     * @param UsedLicenseCnt 已使用授权数
     */
    public void setUsedLicenseCnt(Long UsedLicenseCnt) {
        this.UsedLicenseCnt = UsedLicenseCnt;
    }

    /**
     * Get 未到期授权数 
     * @return NotExpiredLicenseCnt 未到期授权数
     */
    public Long getNotExpiredLicenseCnt() {
        return this.NotExpiredLicenseCnt;
    }

    /**
     * Set 未到期授权数
     * @param NotExpiredLicenseCnt 未到期授权数
     */
    public void setNotExpiredLicenseCnt(Long NotExpiredLicenseCnt) {
        this.NotExpiredLicenseCnt = NotExpiredLicenseCnt;
    }

    /**
     * Get 旗舰版总授权数(有效订单) 
     * @return FlagshipVersionLicenseCnt 旗舰版总授权数(有效订单)
     */
    public Long getFlagshipVersionLicenseCnt() {
        return this.FlagshipVersionLicenseCnt;
    }

    /**
     * Set 旗舰版总授权数(有效订单)
     * @param FlagshipVersionLicenseCnt 旗舰版总授权数(有效订单)
     */
    public void setFlagshipVersionLicenseCnt(Long FlagshipVersionLicenseCnt) {
        this.FlagshipVersionLicenseCnt = FlagshipVersionLicenseCnt;
    }

    /**
     * Get 专业版总授权数(有效订单) 
     * @return ProVersionLicenseCnt 专业版总授权数(有效订单)
     */
    public Long getProVersionLicenseCnt() {
        return this.ProVersionLicenseCnt;
    }

    /**
     * Set 专业版总授权数(有效订单)
     * @param ProVersionLicenseCnt 专业版总授权数(有效订单)
     */
    public void setProVersionLicenseCnt(Long ProVersionLicenseCnt) {
        this.ProVersionLicenseCnt = ProVersionLicenseCnt;
    }

    /**
     * Get 普惠版总授权数(有效订单的授权数) 
     * @return CwpVersionLicenseCnt 普惠版总授权数(有效订单的授权数)
     */
    public Long getCwpVersionLicenseCnt() {
        return this.CwpVersionLicenseCnt;
    }

    /**
     * Set 普惠版总授权数(有效订单的授权数)
     * @param CwpVersionLicenseCnt 普惠版总授权数(有效订单的授权数)
     */
    public void setCwpVersionLicenseCnt(Long CwpVersionLicenseCnt) {
        this.CwpVersionLicenseCnt = CwpVersionLicenseCnt;
    }

    /**
     * Get 可用惠普版授权数 
     * @return AvailableLHLicenseCnt 可用惠普版授权数
     */
    public Long getAvailableLHLicenseCnt() {
        return this.AvailableLHLicenseCnt;
    }

    /**
     * Set 可用惠普版授权数
     * @param AvailableLHLicenseCnt 可用惠普版授权数
     */
    public void setAvailableLHLicenseCnt(Long AvailableLHLicenseCnt) {
        this.AvailableLHLicenseCnt = AvailableLHLicenseCnt;
    }

    /**
     * Get 自动加购开关, true 开启, false 关闭 
     * @return AutoRepurchaseSwitch 自动加购开关, true 开启, false 关闭
     */
    public Boolean getAutoRepurchaseSwitch() {
        return this.AutoRepurchaseSwitch;
    }

    /**
     * Set 自动加购开关, true 开启, false 关闭
     * @param AutoRepurchaseSwitch 自动加购开关, true 开启, false 关闭
     */
    public void setAutoRepurchaseSwitch(Boolean AutoRepurchaseSwitch) {
        this.AutoRepurchaseSwitch = AutoRepurchaseSwitch;
    }

    /**
     * Get 自动加购订单是否自动续费 ,true 开启, false 关闭 
     * @return AutoRepurchaseRenewSwitch 自动加购订单是否自动续费 ,true 开启, false 关闭
     */
    public Boolean getAutoRepurchaseRenewSwitch() {
        return this.AutoRepurchaseRenewSwitch;
    }

    /**
     * Set 自动加购订单是否自动续费 ,true 开启, false 关闭
     * @param AutoRepurchaseRenewSwitch 自动加购订单是否自动续费 ,true 开启, false 关闭
     */
    public void setAutoRepurchaseRenewSwitch(Boolean AutoRepurchaseRenewSwitch) {
        this.AutoRepurchaseRenewSwitch = AutoRepurchaseRenewSwitch;
    }

    /**
     * Get 已销毁订单数 
     * @return DestroyOrderNum 已销毁订单数
     */
    public Long getDestroyOrderNum() {
        return this.DestroyOrderNum;
    }

    /**
     * Set 已销毁订单数
     * @param DestroyOrderNum 已销毁订单数
     */
    public void setDestroyOrderNum(Long DestroyOrderNum) {
        this.DestroyOrderNum = DestroyOrderNum;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeLicenseGeneralResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLicenseGeneralResponse(DescribeLicenseGeneralResponse source) {
        if (source.LicenseCnt != null) {
            this.LicenseCnt = new Long(source.LicenseCnt);
        }
        if (source.AvailableLicenseCnt != null) {
            this.AvailableLicenseCnt = new Long(source.AvailableLicenseCnt);
        }
        if (source.AvailableProVersionLicenseCnt != null) {
            this.AvailableProVersionLicenseCnt = new Long(source.AvailableProVersionLicenseCnt);
        }
        if (source.AvailableFlagshipVersionLicenseCnt != null) {
            this.AvailableFlagshipVersionLicenseCnt = new Long(source.AvailableFlagshipVersionLicenseCnt);
        }
        if (source.NearExpiryLicenseCnt != null) {
            this.NearExpiryLicenseCnt = new Long(source.NearExpiryLicenseCnt);
        }
        if (source.ExpireLicenseCnt != null) {
            this.ExpireLicenseCnt = new Long(source.ExpireLicenseCnt);
        }
        if (source.AutoOpenStatus != null) {
            this.AutoOpenStatus = new Boolean(source.AutoOpenStatus);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
        if (source.IsOpenStatusHistory != null) {
            this.IsOpenStatusHistory = new Boolean(source.IsOpenStatusHistory);
        }
        if (source.UsedLicenseCnt != null) {
            this.UsedLicenseCnt = new Long(source.UsedLicenseCnt);
        }
        if (source.NotExpiredLicenseCnt != null) {
            this.NotExpiredLicenseCnt = new Long(source.NotExpiredLicenseCnt);
        }
        if (source.FlagshipVersionLicenseCnt != null) {
            this.FlagshipVersionLicenseCnt = new Long(source.FlagshipVersionLicenseCnt);
        }
        if (source.ProVersionLicenseCnt != null) {
            this.ProVersionLicenseCnt = new Long(source.ProVersionLicenseCnt);
        }
        if (source.CwpVersionLicenseCnt != null) {
            this.CwpVersionLicenseCnt = new Long(source.CwpVersionLicenseCnt);
        }
        if (source.AvailableLHLicenseCnt != null) {
            this.AvailableLHLicenseCnt = new Long(source.AvailableLHLicenseCnt);
        }
        if (source.AutoRepurchaseSwitch != null) {
            this.AutoRepurchaseSwitch = new Boolean(source.AutoRepurchaseSwitch);
        }
        if (source.AutoRepurchaseRenewSwitch != null) {
            this.AutoRepurchaseRenewSwitch = new Boolean(source.AutoRepurchaseRenewSwitch);
        }
        if (source.DestroyOrderNum != null) {
            this.DestroyOrderNum = new Long(source.DestroyOrderNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseCnt", this.LicenseCnt);
        this.setParamSimple(map, prefix + "AvailableLicenseCnt", this.AvailableLicenseCnt);
        this.setParamSimple(map, prefix + "AvailableProVersionLicenseCnt", this.AvailableProVersionLicenseCnt);
        this.setParamSimple(map, prefix + "AvailableFlagshipVersionLicenseCnt", this.AvailableFlagshipVersionLicenseCnt);
        this.setParamSimple(map, prefix + "NearExpiryLicenseCnt", this.NearExpiryLicenseCnt);
        this.setParamSimple(map, prefix + "ExpireLicenseCnt", this.ExpireLicenseCnt);
        this.setParamSimple(map, prefix + "AutoOpenStatus", this.AutoOpenStatus);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);
        this.setParamSimple(map, prefix + "IsOpenStatusHistory", this.IsOpenStatusHistory);
        this.setParamSimple(map, prefix + "UsedLicenseCnt", this.UsedLicenseCnt);
        this.setParamSimple(map, prefix + "NotExpiredLicenseCnt", this.NotExpiredLicenseCnt);
        this.setParamSimple(map, prefix + "FlagshipVersionLicenseCnt", this.FlagshipVersionLicenseCnt);
        this.setParamSimple(map, prefix + "ProVersionLicenseCnt", this.ProVersionLicenseCnt);
        this.setParamSimple(map, prefix + "CwpVersionLicenseCnt", this.CwpVersionLicenseCnt);
        this.setParamSimple(map, prefix + "AvailableLHLicenseCnt", this.AvailableLHLicenseCnt);
        this.setParamSimple(map, prefix + "AutoRepurchaseSwitch", this.AutoRepurchaseSwitch);
        this.setParamSimple(map, prefix + "AutoRepurchaseRenewSwitch", this.AutoRepurchaseRenewSwitch);
        this.setParamSimple(map, prefix + "DestroyOrderNum", this.DestroyOrderNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

