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

public class HostVulRisk extends AbstractModel {

    /**
    * <p>风险记录 ID（host_vul_risk.id）</p>
    */
    @SerializedName("RiskID")
    @Expose
    private Long RiskID;

    /**
    * <p>受影响主机数</p>
    */
    @SerializedName("EffectHostCount")
    @Expose
    private Long EffectHostCount;

    /**
    * <p>最近扫描时间<br>参数格式：YYYY-MM-DD HH:mm:ss</p>
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * <p>所属账号列表</p>
    */
    @SerializedName("Account")
    @Expose
    private AccountBriefInfo [] Account;

    /**
    * <p>漏洞防御状态<br>枚举值：<br>ENABLED：已开启<br>NOT_SUPPORTED：不支持<br>NOT_ENABLED：未开启</p>
    */
    @SerializedName("DefendStatus")
    @Expose
    private String DefendStatus;

    /**
    * <p>修复状态<br>枚举值：<br>PENDING：待修复<br>SCANNING：扫描中<br>FIXED：已修复<br>IGNORED：已加白<br>FIXING：修复中<br>FIX_FAILED：修复失败<br>NOTSCAN：未扫描<br>WITHOUT_RISK：无风险<br>NEED_REBOOT：修复待重启</p>
    */
    @SerializedName("RiskStatus")
    @Expose
    private String RiskStatus;

    /**
    * <p>漏洞详细信息</p>
    */
    @SerializedName("VulDetail")
    @Expose
    private VulDetailInfo VulDetail;

    /**
     * Get <p>风险记录 ID（host_vul_risk.id）</p> 
     * @return RiskID <p>风险记录 ID（host_vul_risk.id）</p>
     */
    public Long getRiskID() {
        return this.RiskID;
    }

    /**
     * Set <p>风险记录 ID（host_vul_risk.id）</p>
     * @param RiskID <p>风险记录 ID（host_vul_risk.id）</p>
     */
    public void setRiskID(Long RiskID) {
        this.RiskID = RiskID;
    }

    /**
     * Get <p>受影响主机数</p> 
     * @return EffectHostCount <p>受影响主机数</p>
     */
    public Long getEffectHostCount() {
        return this.EffectHostCount;
    }

    /**
     * Set <p>受影响主机数</p>
     * @param EffectHostCount <p>受影响主机数</p>
     */
    public void setEffectHostCount(Long EffectHostCount) {
        this.EffectHostCount = EffectHostCount;
    }

    /**
     * Get <p>最近扫描时间<br>参数格式：YYYY-MM-DD HH:mm:ss</p> 
     * @return LatestScanTime <p>最近扫描时间<br>参数格式：YYYY-MM-DD HH:mm:ss</p>
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set <p>最近扫描时间<br>参数格式：YYYY-MM-DD HH:mm:ss</p>
     * @param LatestScanTime <p>最近扫描时间<br>参数格式：YYYY-MM-DD HH:mm:ss</p>
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get <p>所属账号列表</p> 
     * @return Account <p>所属账号列表</p>
     */
    public AccountBriefInfo [] getAccount() {
        return this.Account;
    }

    /**
     * Set <p>所属账号列表</p>
     * @param Account <p>所属账号列表</p>
     */
    public void setAccount(AccountBriefInfo [] Account) {
        this.Account = Account;
    }

    /**
     * Get <p>漏洞防御状态<br>枚举值：<br>ENABLED：已开启<br>NOT_SUPPORTED：不支持<br>NOT_ENABLED：未开启</p> 
     * @return DefendStatus <p>漏洞防御状态<br>枚举值：<br>ENABLED：已开启<br>NOT_SUPPORTED：不支持<br>NOT_ENABLED：未开启</p>
     */
    public String getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set <p>漏洞防御状态<br>枚举值：<br>ENABLED：已开启<br>NOT_SUPPORTED：不支持<br>NOT_ENABLED：未开启</p>
     * @param DefendStatus <p>漏洞防御状态<br>枚举值：<br>ENABLED：已开启<br>NOT_SUPPORTED：不支持<br>NOT_ENABLED：未开启</p>
     */
    public void setDefendStatus(String DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    /**
     * Get <p>修复状态<br>枚举值：<br>PENDING：待修复<br>SCANNING：扫描中<br>FIXED：已修复<br>IGNORED：已加白<br>FIXING：修复中<br>FIX_FAILED：修复失败<br>NOTSCAN：未扫描<br>WITHOUT_RISK：无风险<br>NEED_REBOOT：修复待重启</p> 
     * @return RiskStatus <p>修复状态<br>枚举值：<br>PENDING：待修复<br>SCANNING：扫描中<br>FIXED：已修复<br>IGNORED：已加白<br>FIXING：修复中<br>FIX_FAILED：修复失败<br>NOTSCAN：未扫描<br>WITHOUT_RISK：无风险<br>NEED_REBOOT：修复待重启</p>
     */
    public String getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set <p>修复状态<br>枚举值：<br>PENDING：待修复<br>SCANNING：扫描中<br>FIXED：已修复<br>IGNORED：已加白<br>FIXING：修复中<br>FIX_FAILED：修复失败<br>NOTSCAN：未扫描<br>WITHOUT_RISK：无风险<br>NEED_REBOOT：修复待重启</p>
     * @param RiskStatus <p>修复状态<br>枚举值：<br>PENDING：待修复<br>SCANNING：扫描中<br>FIXED：已修复<br>IGNORED：已加白<br>FIXING：修复中<br>FIX_FAILED：修复失败<br>NOTSCAN：未扫描<br>WITHOUT_RISK：无风险<br>NEED_REBOOT：修复待重启</p>
     */
    public void setRiskStatus(String RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get <p>漏洞详细信息</p> 
     * @return VulDetail <p>漏洞详细信息</p>
     */
    public VulDetailInfo getVulDetail() {
        return this.VulDetail;
    }

    /**
     * Set <p>漏洞详细信息</p>
     * @param VulDetail <p>漏洞详细信息</p>
     */
    public void setVulDetail(VulDetailInfo VulDetail) {
        this.VulDetail = VulDetail;
    }

    public HostVulRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostVulRisk(HostVulRisk source) {
        if (source.RiskID != null) {
            this.RiskID = new Long(source.RiskID);
        }
        if (source.EffectHostCount != null) {
            this.EffectHostCount = new Long(source.EffectHostCount);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.Account != null) {
            this.Account = new AccountBriefInfo[source.Account.length];
            for (int i = 0; i < source.Account.length; i++) {
                this.Account[i] = new AccountBriefInfo(source.Account[i]);
            }
        }
        if (source.DefendStatus != null) {
            this.DefendStatus = new String(source.DefendStatus);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new String(source.RiskStatus);
        }
        if (source.VulDetail != null) {
            this.VulDetail = new VulDetailInfo(source.VulDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskID", this.RiskID);
        this.setParamSimple(map, prefix + "EffectHostCount", this.EffectHostCount);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamArrayObj(map, prefix + "Account.", this.Account);
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamObj(map, prefix + "VulDetail.", this.VulDetail);

    }
}

