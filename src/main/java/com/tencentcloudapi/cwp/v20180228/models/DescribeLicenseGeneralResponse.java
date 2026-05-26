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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLicenseGeneralResponse extends AbstractModel {

    /**
    * <p>总授权数 (包含隔离,过期等不可用状态)</p>
    */
    @SerializedName("LicenseCnt")
    @Expose
    private Long LicenseCnt;

    /**
    * <p>可用授权数</p>
    */
    @SerializedName("AvailableLicenseCnt")
    @Expose
    private Long AvailableLicenseCnt;

    /**
    * <p>可用专业版授权数(包含后付费).</p>
    */
    @SerializedName("AvailableProVersionLicenseCnt")
    @Expose
    private Long AvailableProVersionLicenseCnt;

    /**
    * <p>可用旗舰版授权数</p>
    */
    @SerializedName("AvailableFlagshipVersionLicenseCnt")
    @Expose
    private Long AvailableFlagshipVersionLicenseCnt;

    /**
    * <p>即将到期授权数 (15天内到期的)</p>
    */
    @SerializedName("NearExpiryLicenseCnt")
    @Expose
    private Long NearExpiryLicenseCnt;

    /**
    * <p>已到期授权数(不包含已删除的记录)</p>
    */
    @SerializedName("ExpireLicenseCnt")
    @Expose
    private Long ExpireLicenseCnt;

    /**
    * <p>自动升级开关状态,默认 false,  true 开启, false 关闭</p>
    */
    @SerializedName("AutoOpenStatus")
    @Expose
    private Boolean AutoOpenStatus;

    /**
    * <p>PROVERSION_POSTPAY 专业版-后付费, PROVERSION_PREPAY 专业版-预付费, FLAGSHIP_PREPAY 旗舰版-预付费</p>
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * <p>历史是否开通过自动升级开关</p>
    */
    @SerializedName("IsOpenStatusHistory")
    @Expose
    private Boolean IsOpenStatusHistory;

    /**
    * <p>已使用授权数</p>
    */
    @SerializedName("UsedLicenseCnt")
    @Expose
    private Long UsedLicenseCnt;

    /**
    * <p>未到期授权数</p>
    */
    @SerializedName("NotExpiredLicenseCnt")
    @Expose
    private Long NotExpiredLicenseCnt;

    /**
    * <p>旗舰版总授权数(有效订单)</p>
    */
    @SerializedName("FlagshipVersionLicenseCnt")
    @Expose
    private Long FlagshipVersionLicenseCnt;

    /**
    * <p>专业版总授权数(有效订单)</p>
    */
    @SerializedName("ProVersionLicenseCnt")
    @Expose
    private Long ProVersionLicenseCnt;

    /**
    * <p>轻量版总授权数(有效订单的授权数)</p>
    */
    @SerializedName("CwpVersionLicenseCnt")
    @Expose
    private Long CwpVersionLicenseCnt;

    /**
    * <p>可用惠普版授权数</p>
    */
    @SerializedName("AvailableLHLicenseCnt")
    @Expose
    private Long AvailableLHLicenseCnt;

    /**
    * <p>自动加购开关, true 开启, false 关闭</p>
    */
    @SerializedName("AutoRepurchaseSwitch")
    @Expose
    private Boolean AutoRepurchaseSwitch;

    /**
    * <p>自动加购订单是否自动续费 ,true 开启, false 关闭</p>
    */
    @SerializedName("AutoRepurchaseRenewSwitch")
    @Expose
    private Boolean AutoRepurchaseRenewSwitch;

    /**
    * <p>已销毁订单数</p>
    */
    @SerializedName("DestroyOrderNum")
    @Expose
    private Long DestroyOrderNum;

    /**
    * <p>自动加购是否自动续费开关,true 开启,false 关闭</p>
    */
    @SerializedName("RepurchaseRenewSwitch")
    @Expose
    private Boolean RepurchaseRenewSwitch;

    /**
    * <p>是否自动新增机器绑定rasp防护,false 关闭 true 开启</p>
    */
    @SerializedName("AutoBindRaspSwitch")
    @Expose
    private Boolean AutoBindRaspSwitch;

    /**
    * <p>是否自动新增机器开启rasp防护,false 关闭 true 开启</p>
    */
    @SerializedName("AutoOpenRaspSwitch")
    @Expose
    private Boolean AutoOpenRaspSwitch;

    /**
    * <p>是否自动缩容开关开启</p>
    */
    @SerializedName("AutoDowngradeSwitch")
    @Expose
    private Boolean AutoDowngradeSwitch;

    /**
    * <p>可使用的AI防护版授权数</p>
    */
    @SerializedName("AvailableAISecurityLicenseCnt")
    @Expose
    private Long AvailableAISecurityLicenseCnt;

    /**
    * <p>AI 防护版总授权数</p>
    */
    @SerializedName("AISecurityVersionLicenseCnt")
    @Expose
    private Long AISecurityVersionLicenseCnt;

    /**
    * <p>应用防护授权数+旗舰版授权数相加后的可使用授权数</p>
    */
    @SerializedName("ApplicationAvailableLicenseCnt")
    @Expose
    private Long ApplicationAvailableLicenseCnt;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>总授权数 (包含隔离,过期等不可用状态)</p> 
     * @return LicenseCnt <p>总授权数 (包含隔离,过期等不可用状态)</p>
     */
    public Long getLicenseCnt() {
        return this.LicenseCnt;
    }

    /**
     * Set <p>总授权数 (包含隔离,过期等不可用状态)</p>
     * @param LicenseCnt <p>总授权数 (包含隔离,过期等不可用状态)</p>
     */
    public void setLicenseCnt(Long LicenseCnt) {
        this.LicenseCnt = LicenseCnt;
    }

    /**
     * Get <p>可用授权数</p> 
     * @return AvailableLicenseCnt <p>可用授权数</p>
     */
    public Long getAvailableLicenseCnt() {
        return this.AvailableLicenseCnt;
    }

    /**
     * Set <p>可用授权数</p>
     * @param AvailableLicenseCnt <p>可用授权数</p>
     */
    public void setAvailableLicenseCnt(Long AvailableLicenseCnt) {
        this.AvailableLicenseCnt = AvailableLicenseCnt;
    }

    /**
     * Get <p>可用专业版授权数(包含后付费).</p> 
     * @return AvailableProVersionLicenseCnt <p>可用专业版授权数(包含后付费).</p>
     */
    public Long getAvailableProVersionLicenseCnt() {
        return this.AvailableProVersionLicenseCnt;
    }

    /**
     * Set <p>可用专业版授权数(包含后付费).</p>
     * @param AvailableProVersionLicenseCnt <p>可用专业版授权数(包含后付费).</p>
     */
    public void setAvailableProVersionLicenseCnt(Long AvailableProVersionLicenseCnt) {
        this.AvailableProVersionLicenseCnt = AvailableProVersionLicenseCnt;
    }

    /**
     * Get <p>可用旗舰版授权数</p> 
     * @return AvailableFlagshipVersionLicenseCnt <p>可用旗舰版授权数</p>
     */
    public Long getAvailableFlagshipVersionLicenseCnt() {
        return this.AvailableFlagshipVersionLicenseCnt;
    }

    /**
     * Set <p>可用旗舰版授权数</p>
     * @param AvailableFlagshipVersionLicenseCnt <p>可用旗舰版授权数</p>
     */
    public void setAvailableFlagshipVersionLicenseCnt(Long AvailableFlagshipVersionLicenseCnt) {
        this.AvailableFlagshipVersionLicenseCnt = AvailableFlagshipVersionLicenseCnt;
    }

    /**
     * Get <p>即将到期授权数 (15天内到期的)</p> 
     * @return NearExpiryLicenseCnt <p>即将到期授权数 (15天内到期的)</p>
     */
    public Long getNearExpiryLicenseCnt() {
        return this.NearExpiryLicenseCnt;
    }

    /**
     * Set <p>即将到期授权数 (15天内到期的)</p>
     * @param NearExpiryLicenseCnt <p>即将到期授权数 (15天内到期的)</p>
     */
    public void setNearExpiryLicenseCnt(Long NearExpiryLicenseCnt) {
        this.NearExpiryLicenseCnt = NearExpiryLicenseCnt;
    }

    /**
     * Get <p>已到期授权数(不包含已删除的记录)</p> 
     * @return ExpireLicenseCnt <p>已到期授权数(不包含已删除的记录)</p>
     */
    public Long getExpireLicenseCnt() {
        return this.ExpireLicenseCnt;
    }

    /**
     * Set <p>已到期授权数(不包含已删除的记录)</p>
     * @param ExpireLicenseCnt <p>已到期授权数(不包含已删除的记录)</p>
     */
    public void setExpireLicenseCnt(Long ExpireLicenseCnt) {
        this.ExpireLicenseCnt = ExpireLicenseCnt;
    }

    /**
     * Get <p>自动升级开关状态,默认 false,  true 开启, false 关闭</p> 
     * @return AutoOpenStatus <p>自动升级开关状态,默认 false,  true 开启, false 关闭</p>
     */
    public Boolean getAutoOpenStatus() {
        return this.AutoOpenStatus;
    }

    /**
     * Set <p>自动升级开关状态,默认 false,  true 开启, false 关闭</p>
     * @param AutoOpenStatus <p>自动升级开关状态,默认 false,  true 开启, false 关闭</p>
     */
    public void setAutoOpenStatus(Boolean AutoOpenStatus) {
        this.AutoOpenStatus = AutoOpenStatus;
    }

    /**
     * Get <p>PROVERSION_POSTPAY 专业版-后付费, PROVERSION_PREPAY 专业版-预付费, FLAGSHIP_PREPAY 旗舰版-预付费</p> 
     * @return ProtectType <p>PROVERSION_POSTPAY 专业版-后付费, PROVERSION_PREPAY 专业版-预付费, FLAGSHIP_PREPAY 旗舰版-预付费</p>
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set <p>PROVERSION_POSTPAY 专业版-后付费, PROVERSION_PREPAY 专业版-预付费, FLAGSHIP_PREPAY 旗舰版-预付费</p>
     * @param ProtectType <p>PROVERSION_POSTPAY 专业版-后付费, PROVERSION_PREPAY 专业版-预付费, FLAGSHIP_PREPAY 旗舰版-预付费</p>
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get <p>历史是否开通过自动升级开关</p> 
     * @return IsOpenStatusHistory <p>历史是否开通过自动升级开关</p>
     */
    public Boolean getIsOpenStatusHistory() {
        return this.IsOpenStatusHistory;
    }

    /**
     * Set <p>历史是否开通过自动升级开关</p>
     * @param IsOpenStatusHistory <p>历史是否开通过自动升级开关</p>
     */
    public void setIsOpenStatusHistory(Boolean IsOpenStatusHistory) {
        this.IsOpenStatusHistory = IsOpenStatusHistory;
    }

    /**
     * Get <p>已使用授权数</p> 
     * @return UsedLicenseCnt <p>已使用授权数</p>
     */
    public Long getUsedLicenseCnt() {
        return this.UsedLicenseCnt;
    }

    /**
     * Set <p>已使用授权数</p>
     * @param UsedLicenseCnt <p>已使用授权数</p>
     */
    public void setUsedLicenseCnt(Long UsedLicenseCnt) {
        this.UsedLicenseCnt = UsedLicenseCnt;
    }

    /**
     * Get <p>未到期授权数</p> 
     * @return NotExpiredLicenseCnt <p>未到期授权数</p>
     */
    public Long getNotExpiredLicenseCnt() {
        return this.NotExpiredLicenseCnt;
    }

    /**
     * Set <p>未到期授权数</p>
     * @param NotExpiredLicenseCnt <p>未到期授权数</p>
     */
    public void setNotExpiredLicenseCnt(Long NotExpiredLicenseCnt) {
        this.NotExpiredLicenseCnt = NotExpiredLicenseCnt;
    }

    /**
     * Get <p>旗舰版总授权数(有效订单)</p> 
     * @return FlagshipVersionLicenseCnt <p>旗舰版总授权数(有效订单)</p>
     */
    public Long getFlagshipVersionLicenseCnt() {
        return this.FlagshipVersionLicenseCnt;
    }

    /**
     * Set <p>旗舰版总授权数(有效订单)</p>
     * @param FlagshipVersionLicenseCnt <p>旗舰版总授权数(有效订单)</p>
     */
    public void setFlagshipVersionLicenseCnt(Long FlagshipVersionLicenseCnt) {
        this.FlagshipVersionLicenseCnt = FlagshipVersionLicenseCnt;
    }

    /**
     * Get <p>专业版总授权数(有效订单)</p> 
     * @return ProVersionLicenseCnt <p>专业版总授权数(有效订单)</p>
     */
    public Long getProVersionLicenseCnt() {
        return this.ProVersionLicenseCnt;
    }

    /**
     * Set <p>专业版总授权数(有效订单)</p>
     * @param ProVersionLicenseCnt <p>专业版总授权数(有效订单)</p>
     */
    public void setProVersionLicenseCnt(Long ProVersionLicenseCnt) {
        this.ProVersionLicenseCnt = ProVersionLicenseCnt;
    }

    /**
     * Get <p>轻量版总授权数(有效订单的授权数)</p> 
     * @return CwpVersionLicenseCnt <p>轻量版总授权数(有效订单的授权数)</p>
     */
    public Long getCwpVersionLicenseCnt() {
        return this.CwpVersionLicenseCnt;
    }

    /**
     * Set <p>轻量版总授权数(有效订单的授权数)</p>
     * @param CwpVersionLicenseCnt <p>轻量版总授权数(有效订单的授权数)</p>
     */
    public void setCwpVersionLicenseCnt(Long CwpVersionLicenseCnt) {
        this.CwpVersionLicenseCnt = CwpVersionLicenseCnt;
    }

    /**
     * Get <p>可用惠普版授权数</p> 
     * @return AvailableLHLicenseCnt <p>可用惠普版授权数</p>
     */
    public Long getAvailableLHLicenseCnt() {
        return this.AvailableLHLicenseCnt;
    }

    /**
     * Set <p>可用惠普版授权数</p>
     * @param AvailableLHLicenseCnt <p>可用惠普版授权数</p>
     */
    public void setAvailableLHLicenseCnt(Long AvailableLHLicenseCnt) {
        this.AvailableLHLicenseCnt = AvailableLHLicenseCnt;
    }

    /**
     * Get <p>自动加购开关, true 开启, false 关闭</p> 
     * @return AutoRepurchaseSwitch <p>自动加购开关, true 开启, false 关闭</p>
     */
    public Boolean getAutoRepurchaseSwitch() {
        return this.AutoRepurchaseSwitch;
    }

    /**
     * Set <p>自动加购开关, true 开启, false 关闭</p>
     * @param AutoRepurchaseSwitch <p>自动加购开关, true 开启, false 关闭</p>
     */
    public void setAutoRepurchaseSwitch(Boolean AutoRepurchaseSwitch) {
        this.AutoRepurchaseSwitch = AutoRepurchaseSwitch;
    }

    /**
     * Get <p>自动加购订单是否自动续费 ,true 开启, false 关闭</p> 
     * @return AutoRepurchaseRenewSwitch <p>自动加购订单是否自动续费 ,true 开启, false 关闭</p>
     */
    public Boolean getAutoRepurchaseRenewSwitch() {
        return this.AutoRepurchaseRenewSwitch;
    }

    /**
     * Set <p>自动加购订单是否自动续费 ,true 开启, false 关闭</p>
     * @param AutoRepurchaseRenewSwitch <p>自动加购订单是否自动续费 ,true 开启, false 关闭</p>
     */
    public void setAutoRepurchaseRenewSwitch(Boolean AutoRepurchaseRenewSwitch) {
        this.AutoRepurchaseRenewSwitch = AutoRepurchaseRenewSwitch;
    }

    /**
     * Get <p>已销毁订单数</p> 
     * @return DestroyOrderNum <p>已销毁订单数</p>
     */
    public Long getDestroyOrderNum() {
        return this.DestroyOrderNum;
    }

    /**
     * Set <p>已销毁订单数</p>
     * @param DestroyOrderNum <p>已销毁订单数</p>
     */
    public void setDestroyOrderNum(Long DestroyOrderNum) {
        this.DestroyOrderNum = DestroyOrderNum;
    }

    /**
     * Get <p>自动加购是否自动续费开关,true 开启,false 关闭</p> 
     * @return RepurchaseRenewSwitch <p>自动加购是否自动续费开关,true 开启,false 关闭</p>
     */
    public Boolean getRepurchaseRenewSwitch() {
        return this.RepurchaseRenewSwitch;
    }

    /**
     * Set <p>自动加购是否自动续费开关,true 开启,false 关闭</p>
     * @param RepurchaseRenewSwitch <p>自动加购是否自动续费开关,true 开启,false 关闭</p>
     */
    public void setRepurchaseRenewSwitch(Boolean RepurchaseRenewSwitch) {
        this.RepurchaseRenewSwitch = RepurchaseRenewSwitch;
    }

    /**
     * Get <p>是否自动新增机器绑定rasp防护,false 关闭 true 开启</p> 
     * @return AutoBindRaspSwitch <p>是否自动新增机器绑定rasp防护,false 关闭 true 开启</p>
     */
    public Boolean getAutoBindRaspSwitch() {
        return this.AutoBindRaspSwitch;
    }

    /**
     * Set <p>是否自动新增机器绑定rasp防护,false 关闭 true 开启</p>
     * @param AutoBindRaspSwitch <p>是否自动新增机器绑定rasp防护,false 关闭 true 开启</p>
     */
    public void setAutoBindRaspSwitch(Boolean AutoBindRaspSwitch) {
        this.AutoBindRaspSwitch = AutoBindRaspSwitch;
    }

    /**
     * Get <p>是否自动新增机器开启rasp防护,false 关闭 true 开启</p> 
     * @return AutoOpenRaspSwitch <p>是否自动新增机器开启rasp防护,false 关闭 true 开启</p>
     */
    public Boolean getAutoOpenRaspSwitch() {
        return this.AutoOpenRaspSwitch;
    }

    /**
     * Set <p>是否自动新增机器开启rasp防护,false 关闭 true 开启</p>
     * @param AutoOpenRaspSwitch <p>是否自动新增机器开启rasp防护,false 关闭 true 开启</p>
     */
    public void setAutoOpenRaspSwitch(Boolean AutoOpenRaspSwitch) {
        this.AutoOpenRaspSwitch = AutoOpenRaspSwitch;
    }

    /**
     * Get <p>是否自动缩容开关开启</p> 
     * @return AutoDowngradeSwitch <p>是否自动缩容开关开启</p>
     */
    public Boolean getAutoDowngradeSwitch() {
        return this.AutoDowngradeSwitch;
    }

    /**
     * Set <p>是否自动缩容开关开启</p>
     * @param AutoDowngradeSwitch <p>是否自动缩容开关开启</p>
     */
    public void setAutoDowngradeSwitch(Boolean AutoDowngradeSwitch) {
        this.AutoDowngradeSwitch = AutoDowngradeSwitch;
    }

    /**
     * Get <p>可使用的AI防护版授权数</p> 
     * @return AvailableAISecurityLicenseCnt <p>可使用的AI防护版授权数</p>
     */
    public Long getAvailableAISecurityLicenseCnt() {
        return this.AvailableAISecurityLicenseCnt;
    }

    /**
     * Set <p>可使用的AI防护版授权数</p>
     * @param AvailableAISecurityLicenseCnt <p>可使用的AI防护版授权数</p>
     */
    public void setAvailableAISecurityLicenseCnt(Long AvailableAISecurityLicenseCnt) {
        this.AvailableAISecurityLicenseCnt = AvailableAISecurityLicenseCnt;
    }

    /**
     * Get <p>AI 防护版总授权数</p> 
     * @return AISecurityVersionLicenseCnt <p>AI 防护版总授权数</p>
     */
    public Long getAISecurityVersionLicenseCnt() {
        return this.AISecurityVersionLicenseCnt;
    }

    /**
     * Set <p>AI 防护版总授权数</p>
     * @param AISecurityVersionLicenseCnt <p>AI 防护版总授权数</p>
     */
    public void setAISecurityVersionLicenseCnt(Long AISecurityVersionLicenseCnt) {
        this.AISecurityVersionLicenseCnt = AISecurityVersionLicenseCnt;
    }

    /**
     * Get <p>应用防护授权数+旗舰版授权数相加后的可使用授权数</p> 
     * @return ApplicationAvailableLicenseCnt <p>应用防护授权数+旗舰版授权数相加后的可使用授权数</p>
     */
    public Long getApplicationAvailableLicenseCnt() {
        return this.ApplicationAvailableLicenseCnt;
    }

    /**
     * Set <p>应用防护授权数+旗舰版授权数相加后的可使用授权数</p>
     * @param ApplicationAvailableLicenseCnt <p>应用防护授权数+旗舰版授权数相加后的可使用授权数</p>
     */
    public void setApplicationAvailableLicenseCnt(Long ApplicationAvailableLicenseCnt) {
        this.ApplicationAvailableLicenseCnt = ApplicationAvailableLicenseCnt;
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
        if (source.RepurchaseRenewSwitch != null) {
            this.RepurchaseRenewSwitch = new Boolean(source.RepurchaseRenewSwitch);
        }
        if (source.AutoBindRaspSwitch != null) {
            this.AutoBindRaspSwitch = new Boolean(source.AutoBindRaspSwitch);
        }
        if (source.AutoOpenRaspSwitch != null) {
            this.AutoOpenRaspSwitch = new Boolean(source.AutoOpenRaspSwitch);
        }
        if (source.AutoDowngradeSwitch != null) {
            this.AutoDowngradeSwitch = new Boolean(source.AutoDowngradeSwitch);
        }
        if (source.AvailableAISecurityLicenseCnt != null) {
            this.AvailableAISecurityLicenseCnt = new Long(source.AvailableAISecurityLicenseCnt);
        }
        if (source.AISecurityVersionLicenseCnt != null) {
            this.AISecurityVersionLicenseCnt = new Long(source.AISecurityVersionLicenseCnt);
        }
        if (source.ApplicationAvailableLicenseCnt != null) {
            this.ApplicationAvailableLicenseCnt = new Long(source.ApplicationAvailableLicenseCnt);
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
        this.setParamSimple(map, prefix + "RepurchaseRenewSwitch", this.RepurchaseRenewSwitch);
        this.setParamSimple(map, prefix + "AutoBindRaspSwitch", this.AutoBindRaspSwitch);
        this.setParamSimple(map, prefix + "AutoOpenRaspSwitch", this.AutoOpenRaspSwitch);
        this.setParamSimple(map, prefix + "AutoDowngradeSwitch", this.AutoDowngradeSwitch);
        this.setParamSimple(map, prefix + "AvailableAISecurityLicenseCnt", this.AvailableAISecurityLicenseCnt);
        this.setParamSimple(map, prefix + "AISecurityVersionLicenseCnt", this.AISecurityVersionLicenseCnt);
        this.setParamSimple(map, prefix + "ApplicationAvailableLicenseCnt", this.ApplicationAvailableLicenseCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

