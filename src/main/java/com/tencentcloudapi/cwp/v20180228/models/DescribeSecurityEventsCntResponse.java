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

public class DescribeSecurityEventsCntResponse extends AbstractModel{

    /**
    * 木马文件相关风险事件
    */
    @SerializedName("Malware")
    @Expose
    private SecurityEventInfo Malware;

    /**
    * 登录审计相关风险事件
    */
    @SerializedName("HostLogin")
    @Expose
    private SecurityEventInfo HostLogin;

    /**
    * 密码破解相关风险事件
    */
    @SerializedName("BruteAttack")
    @Expose
    private SecurityEventInfo BruteAttack;

    /**
    * 恶意请求相关风险事件
    */
    @SerializedName("RiskDns")
    @Expose
    private SecurityEventInfo RiskDns;

    /**
    * 高危命令相关风险事件
    */
    @SerializedName("Bash")
    @Expose
    private SecurityEventInfo Bash;

    /**
    * 本地提权相关风险事件
    */
    @SerializedName("PrivilegeRules")
    @Expose
    private SecurityEventInfo PrivilegeRules;

    /**
    * 反弹Shell相关风险事件
    */
    @SerializedName("ReverseShell")
    @Expose
    private SecurityEventInfo ReverseShell;

    /**
    * 应用漏洞风险事件
    */
    @SerializedName("SysVul")
    @Expose
    private SecurityEventInfo SysVul;

    /**
    * Web应用漏洞相关风险事件
    */
    @SerializedName("WebVul")
    @Expose
    private SecurityEventInfo WebVul;

    /**
    * 应急漏洞相关风险事件
    */
    @SerializedName("EmergencyVul")
    @Expose
    private SecurityEventInfo EmergencyVul;

    /**
    * 安全基线相关风险事件
    */
    @SerializedName("BaseLine")
    @Expose
    private SecurityEventInfo BaseLine;

    /**
    * 攻击检测相关风险事件
    */
    @SerializedName("AttackLogs")
    @Expose
    private SecurityEventInfo AttackLogs;

    /**
    * 受影响机器数
    */
    @SerializedName("EffectMachineCount")
    @Expose
    private Long EffectMachineCount;

    /**
    * 所有事件总数
    */
    @SerializedName("EventsCount")
    @Expose
    private Long EventsCount;

    /**
    * window 系统漏洞事件总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WindowVul")
    @Expose
    private SecurityEventInfo WindowVul;

    /**
    * linux系统漏洞事件总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinuxVul")
    @Expose
    private SecurityEventInfo LinuxVul;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 木马文件相关风险事件 
     * @return Malware 木马文件相关风险事件
     */
    public SecurityEventInfo getMalware() {
        return this.Malware;
    }

    /**
     * Set 木马文件相关风险事件
     * @param Malware 木马文件相关风险事件
     */
    public void setMalware(SecurityEventInfo Malware) {
        this.Malware = Malware;
    }

    /**
     * Get 登录审计相关风险事件 
     * @return HostLogin 登录审计相关风险事件
     */
    public SecurityEventInfo getHostLogin() {
        return this.HostLogin;
    }

    /**
     * Set 登录审计相关风险事件
     * @param HostLogin 登录审计相关风险事件
     */
    public void setHostLogin(SecurityEventInfo HostLogin) {
        this.HostLogin = HostLogin;
    }

    /**
     * Get 密码破解相关风险事件 
     * @return BruteAttack 密码破解相关风险事件
     */
    public SecurityEventInfo getBruteAttack() {
        return this.BruteAttack;
    }

    /**
     * Set 密码破解相关风险事件
     * @param BruteAttack 密码破解相关风险事件
     */
    public void setBruteAttack(SecurityEventInfo BruteAttack) {
        this.BruteAttack = BruteAttack;
    }

    /**
     * Get 恶意请求相关风险事件 
     * @return RiskDns 恶意请求相关风险事件
     */
    public SecurityEventInfo getRiskDns() {
        return this.RiskDns;
    }

    /**
     * Set 恶意请求相关风险事件
     * @param RiskDns 恶意请求相关风险事件
     */
    public void setRiskDns(SecurityEventInfo RiskDns) {
        this.RiskDns = RiskDns;
    }

    /**
     * Get 高危命令相关风险事件 
     * @return Bash 高危命令相关风险事件
     */
    public SecurityEventInfo getBash() {
        return this.Bash;
    }

    /**
     * Set 高危命令相关风险事件
     * @param Bash 高危命令相关风险事件
     */
    public void setBash(SecurityEventInfo Bash) {
        this.Bash = Bash;
    }

    /**
     * Get 本地提权相关风险事件 
     * @return PrivilegeRules 本地提权相关风险事件
     */
    public SecurityEventInfo getPrivilegeRules() {
        return this.PrivilegeRules;
    }

    /**
     * Set 本地提权相关风险事件
     * @param PrivilegeRules 本地提权相关风险事件
     */
    public void setPrivilegeRules(SecurityEventInfo PrivilegeRules) {
        this.PrivilegeRules = PrivilegeRules;
    }

    /**
     * Get 反弹Shell相关风险事件 
     * @return ReverseShell 反弹Shell相关风险事件
     */
    public SecurityEventInfo getReverseShell() {
        return this.ReverseShell;
    }

    /**
     * Set 反弹Shell相关风险事件
     * @param ReverseShell 反弹Shell相关风险事件
     */
    public void setReverseShell(SecurityEventInfo ReverseShell) {
        this.ReverseShell = ReverseShell;
    }

    /**
     * Get 应用漏洞风险事件 
     * @return SysVul 应用漏洞风险事件
     */
    public SecurityEventInfo getSysVul() {
        return this.SysVul;
    }

    /**
     * Set 应用漏洞风险事件
     * @param SysVul 应用漏洞风险事件
     */
    public void setSysVul(SecurityEventInfo SysVul) {
        this.SysVul = SysVul;
    }

    /**
     * Get Web应用漏洞相关风险事件 
     * @return WebVul Web应用漏洞相关风险事件
     */
    public SecurityEventInfo getWebVul() {
        return this.WebVul;
    }

    /**
     * Set Web应用漏洞相关风险事件
     * @param WebVul Web应用漏洞相关风险事件
     */
    public void setWebVul(SecurityEventInfo WebVul) {
        this.WebVul = WebVul;
    }

    /**
     * Get 应急漏洞相关风险事件 
     * @return EmergencyVul 应急漏洞相关风险事件
     */
    public SecurityEventInfo getEmergencyVul() {
        return this.EmergencyVul;
    }

    /**
     * Set 应急漏洞相关风险事件
     * @param EmergencyVul 应急漏洞相关风险事件
     */
    public void setEmergencyVul(SecurityEventInfo EmergencyVul) {
        this.EmergencyVul = EmergencyVul;
    }

    /**
     * Get 安全基线相关风险事件 
     * @return BaseLine 安全基线相关风险事件
     */
    public SecurityEventInfo getBaseLine() {
        return this.BaseLine;
    }

    /**
     * Set 安全基线相关风险事件
     * @param BaseLine 安全基线相关风险事件
     */
    public void setBaseLine(SecurityEventInfo BaseLine) {
        this.BaseLine = BaseLine;
    }

    /**
     * Get 攻击检测相关风险事件 
     * @return AttackLogs 攻击检测相关风险事件
     */
    public SecurityEventInfo getAttackLogs() {
        return this.AttackLogs;
    }

    /**
     * Set 攻击检测相关风险事件
     * @param AttackLogs 攻击检测相关风险事件
     */
    public void setAttackLogs(SecurityEventInfo AttackLogs) {
        this.AttackLogs = AttackLogs;
    }

    /**
     * Get 受影响机器数 
     * @return EffectMachineCount 受影响机器数
     */
    public Long getEffectMachineCount() {
        return this.EffectMachineCount;
    }

    /**
     * Set 受影响机器数
     * @param EffectMachineCount 受影响机器数
     */
    public void setEffectMachineCount(Long EffectMachineCount) {
        this.EffectMachineCount = EffectMachineCount;
    }

    /**
     * Get 所有事件总数 
     * @return EventsCount 所有事件总数
     */
    public Long getEventsCount() {
        return this.EventsCount;
    }

    /**
     * Set 所有事件总数
     * @param EventsCount 所有事件总数
     */
    public void setEventsCount(Long EventsCount) {
        this.EventsCount = EventsCount;
    }

    /**
     * Get window 系统漏洞事件总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WindowVul window 系统漏洞事件总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecurityEventInfo getWindowVul() {
        return this.WindowVul;
    }

    /**
     * Set window 系统漏洞事件总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WindowVul window 系统漏洞事件总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWindowVul(SecurityEventInfo WindowVul) {
        this.WindowVul = WindowVul;
    }

    /**
     * Get linux系统漏洞事件总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinuxVul linux系统漏洞事件总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecurityEventInfo getLinuxVul() {
        return this.LinuxVul;
    }

    /**
     * Set linux系统漏洞事件总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinuxVul linux系统漏洞事件总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinuxVul(SecurityEventInfo LinuxVul) {
        this.LinuxVul = LinuxVul;
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

    public DescribeSecurityEventsCntResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityEventsCntResponse(DescribeSecurityEventsCntResponse source) {
        if (source.Malware != null) {
            this.Malware = new SecurityEventInfo(source.Malware);
        }
        if (source.HostLogin != null) {
            this.HostLogin = new SecurityEventInfo(source.HostLogin);
        }
        if (source.BruteAttack != null) {
            this.BruteAttack = new SecurityEventInfo(source.BruteAttack);
        }
        if (source.RiskDns != null) {
            this.RiskDns = new SecurityEventInfo(source.RiskDns);
        }
        if (source.Bash != null) {
            this.Bash = new SecurityEventInfo(source.Bash);
        }
        if (source.PrivilegeRules != null) {
            this.PrivilegeRules = new SecurityEventInfo(source.PrivilegeRules);
        }
        if (source.ReverseShell != null) {
            this.ReverseShell = new SecurityEventInfo(source.ReverseShell);
        }
        if (source.SysVul != null) {
            this.SysVul = new SecurityEventInfo(source.SysVul);
        }
        if (source.WebVul != null) {
            this.WebVul = new SecurityEventInfo(source.WebVul);
        }
        if (source.EmergencyVul != null) {
            this.EmergencyVul = new SecurityEventInfo(source.EmergencyVul);
        }
        if (source.BaseLine != null) {
            this.BaseLine = new SecurityEventInfo(source.BaseLine);
        }
        if (source.AttackLogs != null) {
            this.AttackLogs = new SecurityEventInfo(source.AttackLogs);
        }
        if (source.EffectMachineCount != null) {
            this.EffectMachineCount = new Long(source.EffectMachineCount);
        }
        if (source.EventsCount != null) {
            this.EventsCount = new Long(source.EventsCount);
        }
        if (source.WindowVul != null) {
            this.WindowVul = new SecurityEventInfo(source.WindowVul);
        }
        if (source.LinuxVul != null) {
            this.LinuxVul = new SecurityEventInfo(source.LinuxVul);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Malware.", this.Malware);
        this.setParamObj(map, prefix + "HostLogin.", this.HostLogin);
        this.setParamObj(map, prefix + "BruteAttack.", this.BruteAttack);
        this.setParamObj(map, prefix + "RiskDns.", this.RiskDns);
        this.setParamObj(map, prefix + "Bash.", this.Bash);
        this.setParamObj(map, prefix + "PrivilegeRules.", this.PrivilegeRules);
        this.setParamObj(map, prefix + "ReverseShell.", this.ReverseShell);
        this.setParamObj(map, prefix + "SysVul.", this.SysVul);
        this.setParamObj(map, prefix + "WebVul.", this.WebVul);
        this.setParamObj(map, prefix + "EmergencyVul.", this.EmergencyVul);
        this.setParamObj(map, prefix + "BaseLine.", this.BaseLine);
        this.setParamObj(map, prefix + "AttackLogs.", this.AttackLogs);
        this.setParamSimple(map, prefix + "EffectMachineCount", this.EffectMachineCount);
        this.setParamSimple(map, prefix + "EventsCount", this.EventsCount);
        this.setParamObj(map, prefix + "WindowVul.", this.WindowVul);
        this.setParamObj(map, prefix + "LinuxVul.", this.LinuxVul);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

