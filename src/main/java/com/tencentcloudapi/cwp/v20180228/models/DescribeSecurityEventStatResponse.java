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

public class DescribeSecurityEventStatResponse extends AbstractModel{

    /**
    * 木马事件统计
    */
    @SerializedName("MalwareStat")
    @Expose
    private EventStat MalwareStat;

    /**
    * 异地事件统计
    */
    @SerializedName("HostLoginStat")
    @Expose
    private EventStat HostLoginStat;

    /**
    * 爆破事件统计
    */
    @SerializedName("BruteAttackStat")
    @Expose
    private EventStat BruteAttackStat;

    /**
    * 恶意请求事件统计
    */
    @SerializedName("MaliciousRequestStat")
    @Expose
    private EventStat MaliciousRequestStat;

    /**
    * 本地提权事件统计
    */
    @SerializedName("PrivilegeStat")
    @Expose
    private EventStat PrivilegeStat;

    /**
    * 反弹Shell事件统计
    */
    @SerializedName("ReverseShellStat")
    @Expose
    private EventStat ReverseShellStat;

    /**
    * 高危命令事件统计
    */
    @SerializedName("HighRiskBashStat")
    @Expose
    private EventStat HighRiskBashStat;

    /**
    * 网络攻击事件统计
    */
    @SerializedName("AttackLogsStat")
    @Expose
    private EventStat AttackLogsStat;

    /**
    * 高危漏洞事件统计
    */
    @SerializedName("VulHighStat")
    @Expose
    private EventStat VulHighStat;

    /**
    * 中危漏洞事件统计
    */
    @SerializedName("VulNormalStat")
    @Expose
    private EventStat VulNormalStat;

    /**
    * 低危漏洞事件统计
    */
    @SerializedName("VulLowStat")
    @Expose
    private EventStat VulLowStat;

    /**
    * 高危基线漏洞事件统计
    */
    @SerializedName("BaselineHighStat")
    @Expose
    private EventStat BaselineHighStat;

    /**
    * 中危基线漏事件统计
    */
    @SerializedName("BaselineNormalStat")
    @Expose
    private EventStat BaselineNormalStat;

    /**
    * 低危基线漏事件统计
    */
    @SerializedName("BaselineLowStat")
    @Expose
    private EventStat BaselineLowStat;

    /**
    * 有未处理安全事件的机器总数
    */
    @SerializedName("MachineTotalAffectNum")
    @Expose
    private Long MachineTotalAffectNum;

    /**
    * 有未处理入侵安全事件的机器总数
    */
    @SerializedName("InvasionTotalAffectNum")
    @Expose
    private Long InvasionTotalAffectNum;

    /**
    * 有未处理漏洞安全事件的机器总数
    */
    @SerializedName("VulTotalAffectNum")
    @Expose
    private Long VulTotalAffectNum;

    /**
    * 有未处理基线安全事件的机器总数
    */
    @SerializedName("BaseLineTotalAffectNum")
    @Expose
    private Long BaseLineTotalAffectNum;

    /**
    * 有未处理网络攻击安全事件的机器总数
    */
    @SerializedName("CyberAttackTotalAffectNum")
    @Expose
    private Long CyberAttackTotalAffectNum;

    /**
    * 严重漏洞事件统计
    */
    @SerializedName("VulRiskStat")
    @Expose
    private EventStat VulRiskStat;

    /**
    * 严重基线漏洞事件统计
    */
    @SerializedName("BaselineRiskStat")
    @Expose
    private EventStat BaselineRiskStat;

    /**
    * 漏洞数统计
    */
    @SerializedName("VulStat")
    @Expose
    private EventStat VulStat;

    /**
    * 安全得分
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 木马事件统计 
     * @return MalwareStat 木马事件统计
     */
    public EventStat getMalwareStat() {
        return this.MalwareStat;
    }

    /**
     * Set 木马事件统计
     * @param MalwareStat 木马事件统计
     */
    public void setMalwareStat(EventStat MalwareStat) {
        this.MalwareStat = MalwareStat;
    }

    /**
     * Get 异地事件统计 
     * @return HostLoginStat 异地事件统计
     */
    public EventStat getHostLoginStat() {
        return this.HostLoginStat;
    }

    /**
     * Set 异地事件统计
     * @param HostLoginStat 异地事件统计
     */
    public void setHostLoginStat(EventStat HostLoginStat) {
        this.HostLoginStat = HostLoginStat;
    }

    /**
     * Get 爆破事件统计 
     * @return BruteAttackStat 爆破事件统计
     */
    public EventStat getBruteAttackStat() {
        return this.BruteAttackStat;
    }

    /**
     * Set 爆破事件统计
     * @param BruteAttackStat 爆破事件统计
     */
    public void setBruteAttackStat(EventStat BruteAttackStat) {
        this.BruteAttackStat = BruteAttackStat;
    }

    /**
     * Get 恶意请求事件统计 
     * @return MaliciousRequestStat 恶意请求事件统计
     */
    public EventStat getMaliciousRequestStat() {
        return this.MaliciousRequestStat;
    }

    /**
     * Set 恶意请求事件统计
     * @param MaliciousRequestStat 恶意请求事件统计
     */
    public void setMaliciousRequestStat(EventStat MaliciousRequestStat) {
        this.MaliciousRequestStat = MaliciousRequestStat;
    }

    /**
     * Get 本地提权事件统计 
     * @return PrivilegeStat 本地提权事件统计
     */
    public EventStat getPrivilegeStat() {
        return this.PrivilegeStat;
    }

    /**
     * Set 本地提权事件统计
     * @param PrivilegeStat 本地提权事件统计
     */
    public void setPrivilegeStat(EventStat PrivilegeStat) {
        this.PrivilegeStat = PrivilegeStat;
    }

    /**
     * Get 反弹Shell事件统计 
     * @return ReverseShellStat 反弹Shell事件统计
     */
    public EventStat getReverseShellStat() {
        return this.ReverseShellStat;
    }

    /**
     * Set 反弹Shell事件统计
     * @param ReverseShellStat 反弹Shell事件统计
     */
    public void setReverseShellStat(EventStat ReverseShellStat) {
        this.ReverseShellStat = ReverseShellStat;
    }

    /**
     * Get 高危命令事件统计 
     * @return HighRiskBashStat 高危命令事件统计
     */
    public EventStat getHighRiskBashStat() {
        return this.HighRiskBashStat;
    }

    /**
     * Set 高危命令事件统计
     * @param HighRiskBashStat 高危命令事件统计
     */
    public void setHighRiskBashStat(EventStat HighRiskBashStat) {
        this.HighRiskBashStat = HighRiskBashStat;
    }

    /**
     * Get 网络攻击事件统计 
     * @return AttackLogsStat 网络攻击事件统计
     */
    public EventStat getAttackLogsStat() {
        return this.AttackLogsStat;
    }

    /**
     * Set 网络攻击事件统计
     * @param AttackLogsStat 网络攻击事件统计
     */
    public void setAttackLogsStat(EventStat AttackLogsStat) {
        this.AttackLogsStat = AttackLogsStat;
    }

    /**
     * Get 高危漏洞事件统计 
     * @return VulHighStat 高危漏洞事件统计
     */
    public EventStat getVulHighStat() {
        return this.VulHighStat;
    }

    /**
     * Set 高危漏洞事件统计
     * @param VulHighStat 高危漏洞事件统计
     */
    public void setVulHighStat(EventStat VulHighStat) {
        this.VulHighStat = VulHighStat;
    }

    /**
     * Get 中危漏洞事件统计 
     * @return VulNormalStat 中危漏洞事件统计
     */
    public EventStat getVulNormalStat() {
        return this.VulNormalStat;
    }

    /**
     * Set 中危漏洞事件统计
     * @param VulNormalStat 中危漏洞事件统计
     */
    public void setVulNormalStat(EventStat VulNormalStat) {
        this.VulNormalStat = VulNormalStat;
    }

    /**
     * Get 低危漏洞事件统计 
     * @return VulLowStat 低危漏洞事件统计
     */
    public EventStat getVulLowStat() {
        return this.VulLowStat;
    }

    /**
     * Set 低危漏洞事件统计
     * @param VulLowStat 低危漏洞事件统计
     */
    public void setVulLowStat(EventStat VulLowStat) {
        this.VulLowStat = VulLowStat;
    }

    /**
     * Get 高危基线漏洞事件统计 
     * @return BaselineHighStat 高危基线漏洞事件统计
     */
    public EventStat getBaselineHighStat() {
        return this.BaselineHighStat;
    }

    /**
     * Set 高危基线漏洞事件统计
     * @param BaselineHighStat 高危基线漏洞事件统计
     */
    public void setBaselineHighStat(EventStat BaselineHighStat) {
        this.BaselineHighStat = BaselineHighStat;
    }

    /**
     * Get 中危基线漏事件统计 
     * @return BaselineNormalStat 中危基线漏事件统计
     */
    public EventStat getBaselineNormalStat() {
        return this.BaselineNormalStat;
    }

    /**
     * Set 中危基线漏事件统计
     * @param BaselineNormalStat 中危基线漏事件统计
     */
    public void setBaselineNormalStat(EventStat BaselineNormalStat) {
        this.BaselineNormalStat = BaselineNormalStat;
    }

    /**
     * Get 低危基线漏事件统计 
     * @return BaselineLowStat 低危基线漏事件统计
     */
    public EventStat getBaselineLowStat() {
        return this.BaselineLowStat;
    }

    /**
     * Set 低危基线漏事件统计
     * @param BaselineLowStat 低危基线漏事件统计
     */
    public void setBaselineLowStat(EventStat BaselineLowStat) {
        this.BaselineLowStat = BaselineLowStat;
    }

    /**
     * Get 有未处理安全事件的机器总数 
     * @return MachineTotalAffectNum 有未处理安全事件的机器总数
     */
    public Long getMachineTotalAffectNum() {
        return this.MachineTotalAffectNum;
    }

    /**
     * Set 有未处理安全事件的机器总数
     * @param MachineTotalAffectNum 有未处理安全事件的机器总数
     */
    public void setMachineTotalAffectNum(Long MachineTotalAffectNum) {
        this.MachineTotalAffectNum = MachineTotalAffectNum;
    }

    /**
     * Get 有未处理入侵安全事件的机器总数 
     * @return InvasionTotalAffectNum 有未处理入侵安全事件的机器总数
     */
    public Long getInvasionTotalAffectNum() {
        return this.InvasionTotalAffectNum;
    }

    /**
     * Set 有未处理入侵安全事件的机器总数
     * @param InvasionTotalAffectNum 有未处理入侵安全事件的机器总数
     */
    public void setInvasionTotalAffectNum(Long InvasionTotalAffectNum) {
        this.InvasionTotalAffectNum = InvasionTotalAffectNum;
    }

    /**
     * Get 有未处理漏洞安全事件的机器总数 
     * @return VulTotalAffectNum 有未处理漏洞安全事件的机器总数
     */
    public Long getVulTotalAffectNum() {
        return this.VulTotalAffectNum;
    }

    /**
     * Set 有未处理漏洞安全事件的机器总数
     * @param VulTotalAffectNum 有未处理漏洞安全事件的机器总数
     */
    public void setVulTotalAffectNum(Long VulTotalAffectNum) {
        this.VulTotalAffectNum = VulTotalAffectNum;
    }

    /**
     * Get 有未处理基线安全事件的机器总数 
     * @return BaseLineTotalAffectNum 有未处理基线安全事件的机器总数
     */
    public Long getBaseLineTotalAffectNum() {
        return this.BaseLineTotalAffectNum;
    }

    /**
     * Set 有未处理基线安全事件的机器总数
     * @param BaseLineTotalAffectNum 有未处理基线安全事件的机器总数
     */
    public void setBaseLineTotalAffectNum(Long BaseLineTotalAffectNum) {
        this.BaseLineTotalAffectNum = BaseLineTotalAffectNum;
    }

    /**
     * Get 有未处理网络攻击安全事件的机器总数 
     * @return CyberAttackTotalAffectNum 有未处理网络攻击安全事件的机器总数
     */
    public Long getCyberAttackTotalAffectNum() {
        return this.CyberAttackTotalAffectNum;
    }

    /**
     * Set 有未处理网络攻击安全事件的机器总数
     * @param CyberAttackTotalAffectNum 有未处理网络攻击安全事件的机器总数
     */
    public void setCyberAttackTotalAffectNum(Long CyberAttackTotalAffectNum) {
        this.CyberAttackTotalAffectNum = CyberAttackTotalAffectNum;
    }

    /**
     * Get 严重漏洞事件统计 
     * @return VulRiskStat 严重漏洞事件统计
     */
    public EventStat getVulRiskStat() {
        return this.VulRiskStat;
    }

    /**
     * Set 严重漏洞事件统计
     * @param VulRiskStat 严重漏洞事件统计
     */
    public void setVulRiskStat(EventStat VulRiskStat) {
        this.VulRiskStat = VulRiskStat;
    }

    /**
     * Get 严重基线漏洞事件统计 
     * @return BaselineRiskStat 严重基线漏洞事件统计
     */
    public EventStat getBaselineRiskStat() {
        return this.BaselineRiskStat;
    }

    /**
     * Set 严重基线漏洞事件统计
     * @param BaselineRiskStat 严重基线漏洞事件统计
     */
    public void setBaselineRiskStat(EventStat BaselineRiskStat) {
        this.BaselineRiskStat = BaselineRiskStat;
    }

    /**
     * Get 漏洞数统计 
     * @return VulStat 漏洞数统计
     */
    public EventStat getVulStat() {
        return this.VulStat;
    }

    /**
     * Set 漏洞数统计
     * @param VulStat 漏洞数统计
     */
    public void setVulStat(EventStat VulStat) {
        this.VulStat = VulStat;
    }

    /**
     * Get 安全得分 
     * @return Score 安全得分
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 安全得分
     * @param Score 安全得分
     */
    public void setScore(Long Score) {
        this.Score = Score;
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

    public DescribeSecurityEventStatResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityEventStatResponse(DescribeSecurityEventStatResponse source) {
        if (source.MalwareStat != null) {
            this.MalwareStat = new EventStat(source.MalwareStat);
        }
        if (source.HostLoginStat != null) {
            this.HostLoginStat = new EventStat(source.HostLoginStat);
        }
        if (source.BruteAttackStat != null) {
            this.BruteAttackStat = new EventStat(source.BruteAttackStat);
        }
        if (source.MaliciousRequestStat != null) {
            this.MaliciousRequestStat = new EventStat(source.MaliciousRequestStat);
        }
        if (source.PrivilegeStat != null) {
            this.PrivilegeStat = new EventStat(source.PrivilegeStat);
        }
        if (source.ReverseShellStat != null) {
            this.ReverseShellStat = new EventStat(source.ReverseShellStat);
        }
        if (source.HighRiskBashStat != null) {
            this.HighRiskBashStat = new EventStat(source.HighRiskBashStat);
        }
        if (source.AttackLogsStat != null) {
            this.AttackLogsStat = new EventStat(source.AttackLogsStat);
        }
        if (source.VulHighStat != null) {
            this.VulHighStat = new EventStat(source.VulHighStat);
        }
        if (source.VulNormalStat != null) {
            this.VulNormalStat = new EventStat(source.VulNormalStat);
        }
        if (source.VulLowStat != null) {
            this.VulLowStat = new EventStat(source.VulLowStat);
        }
        if (source.BaselineHighStat != null) {
            this.BaselineHighStat = new EventStat(source.BaselineHighStat);
        }
        if (source.BaselineNormalStat != null) {
            this.BaselineNormalStat = new EventStat(source.BaselineNormalStat);
        }
        if (source.BaselineLowStat != null) {
            this.BaselineLowStat = new EventStat(source.BaselineLowStat);
        }
        if (source.MachineTotalAffectNum != null) {
            this.MachineTotalAffectNum = new Long(source.MachineTotalAffectNum);
        }
        if (source.InvasionTotalAffectNum != null) {
            this.InvasionTotalAffectNum = new Long(source.InvasionTotalAffectNum);
        }
        if (source.VulTotalAffectNum != null) {
            this.VulTotalAffectNum = new Long(source.VulTotalAffectNum);
        }
        if (source.BaseLineTotalAffectNum != null) {
            this.BaseLineTotalAffectNum = new Long(source.BaseLineTotalAffectNum);
        }
        if (source.CyberAttackTotalAffectNum != null) {
            this.CyberAttackTotalAffectNum = new Long(source.CyberAttackTotalAffectNum);
        }
        if (source.VulRiskStat != null) {
            this.VulRiskStat = new EventStat(source.VulRiskStat);
        }
        if (source.BaselineRiskStat != null) {
            this.BaselineRiskStat = new EventStat(source.BaselineRiskStat);
        }
        if (source.VulStat != null) {
            this.VulStat = new EventStat(source.VulStat);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MalwareStat.", this.MalwareStat);
        this.setParamObj(map, prefix + "HostLoginStat.", this.HostLoginStat);
        this.setParamObj(map, prefix + "BruteAttackStat.", this.BruteAttackStat);
        this.setParamObj(map, prefix + "MaliciousRequestStat.", this.MaliciousRequestStat);
        this.setParamObj(map, prefix + "PrivilegeStat.", this.PrivilegeStat);
        this.setParamObj(map, prefix + "ReverseShellStat.", this.ReverseShellStat);
        this.setParamObj(map, prefix + "HighRiskBashStat.", this.HighRiskBashStat);
        this.setParamObj(map, prefix + "AttackLogsStat.", this.AttackLogsStat);
        this.setParamObj(map, prefix + "VulHighStat.", this.VulHighStat);
        this.setParamObj(map, prefix + "VulNormalStat.", this.VulNormalStat);
        this.setParamObj(map, prefix + "VulLowStat.", this.VulLowStat);
        this.setParamObj(map, prefix + "BaselineHighStat.", this.BaselineHighStat);
        this.setParamObj(map, prefix + "BaselineNormalStat.", this.BaselineNormalStat);
        this.setParamObj(map, prefix + "BaselineLowStat.", this.BaselineLowStat);
        this.setParamSimple(map, prefix + "MachineTotalAffectNum", this.MachineTotalAffectNum);
        this.setParamSimple(map, prefix + "InvasionTotalAffectNum", this.InvasionTotalAffectNum);
        this.setParamSimple(map, prefix + "VulTotalAffectNum", this.VulTotalAffectNum);
        this.setParamSimple(map, prefix + "BaseLineTotalAffectNum", this.BaseLineTotalAffectNum);
        this.setParamSimple(map, prefix + "CyberAttackTotalAffectNum", this.CyberAttackTotalAffectNum);
        this.setParamObj(map, prefix + "VulRiskStat.", this.VulRiskStat);
        this.setParamObj(map, prefix + "BaselineRiskStat.", this.BaselineRiskStat);
        this.setParamObj(map, prefix + "VulStat.", this.VulStat);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

