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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalProcessEventTendencyInfo extends AbstractModel{

    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 待处理代理软件事件数
    */
    @SerializedName("ProxyToolEventCount")
    @Expose
    private Long ProxyToolEventCount;

    /**
    * 待处理横向参透事件数
    */
    @SerializedName("TransferControlEventCount")
    @Expose
    private Long TransferControlEventCount;

    /**
    * 待处理恶意命令事件数
    */
    @SerializedName("AttackCmdEventCount")
    @Expose
    private Long AttackCmdEventCount;

    /**
    * 待处理反弹shell事件数
    */
    @SerializedName("ReverseShellEventCount")
    @Expose
    private Long ReverseShellEventCount;

    /**
    * 待处理无文件程序执行事件数
    */
    @SerializedName("FilelessEventCount")
    @Expose
    private Long FilelessEventCount;

    /**
    * 待处理高危命令事件数
    */
    @SerializedName("RiskCmdEventCount")
    @Expose
    private Long RiskCmdEventCount;

    /**
    * 待处理敏感服务异常子进程启动事件数
    */
    @SerializedName("AbnormalChildProcessEventCount")
    @Expose
    private Long AbnormalChildProcessEventCount;

    /**
    * 待处理自定义规则事件数
    */
    @SerializedName("UserDefinedRuleEventCount")
    @Expose
    private Long UserDefinedRuleEventCount;

    /**
     * Get 日期 
     * @return Date 日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期
     * @param Date 日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 待处理代理软件事件数 
     * @return ProxyToolEventCount 待处理代理软件事件数
     */
    public Long getProxyToolEventCount() {
        return this.ProxyToolEventCount;
    }

    /**
     * Set 待处理代理软件事件数
     * @param ProxyToolEventCount 待处理代理软件事件数
     */
    public void setProxyToolEventCount(Long ProxyToolEventCount) {
        this.ProxyToolEventCount = ProxyToolEventCount;
    }

    /**
     * Get 待处理横向参透事件数 
     * @return TransferControlEventCount 待处理横向参透事件数
     */
    public Long getTransferControlEventCount() {
        return this.TransferControlEventCount;
    }

    /**
     * Set 待处理横向参透事件数
     * @param TransferControlEventCount 待处理横向参透事件数
     */
    public void setTransferControlEventCount(Long TransferControlEventCount) {
        this.TransferControlEventCount = TransferControlEventCount;
    }

    /**
     * Get 待处理恶意命令事件数 
     * @return AttackCmdEventCount 待处理恶意命令事件数
     */
    public Long getAttackCmdEventCount() {
        return this.AttackCmdEventCount;
    }

    /**
     * Set 待处理恶意命令事件数
     * @param AttackCmdEventCount 待处理恶意命令事件数
     */
    public void setAttackCmdEventCount(Long AttackCmdEventCount) {
        this.AttackCmdEventCount = AttackCmdEventCount;
    }

    /**
     * Get 待处理反弹shell事件数 
     * @return ReverseShellEventCount 待处理反弹shell事件数
     */
    public Long getReverseShellEventCount() {
        return this.ReverseShellEventCount;
    }

    /**
     * Set 待处理反弹shell事件数
     * @param ReverseShellEventCount 待处理反弹shell事件数
     */
    public void setReverseShellEventCount(Long ReverseShellEventCount) {
        this.ReverseShellEventCount = ReverseShellEventCount;
    }

    /**
     * Get 待处理无文件程序执行事件数 
     * @return FilelessEventCount 待处理无文件程序执行事件数
     */
    public Long getFilelessEventCount() {
        return this.FilelessEventCount;
    }

    /**
     * Set 待处理无文件程序执行事件数
     * @param FilelessEventCount 待处理无文件程序执行事件数
     */
    public void setFilelessEventCount(Long FilelessEventCount) {
        this.FilelessEventCount = FilelessEventCount;
    }

    /**
     * Get 待处理高危命令事件数 
     * @return RiskCmdEventCount 待处理高危命令事件数
     */
    public Long getRiskCmdEventCount() {
        return this.RiskCmdEventCount;
    }

    /**
     * Set 待处理高危命令事件数
     * @param RiskCmdEventCount 待处理高危命令事件数
     */
    public void setRiskCmdEventCount(Long RiskCmdEventCount) {
        this.RiskCmdEventCount = RiskCmdEventCount;
    }

    /**
     * Get 待处理敏感服务异常子进程启动事件数 
     * @return AbnormalChildProcessEventCount 待处理敏感服务异常子进程启动事件数
     */
    public Long getAbnormalChildProcessEventCount() {
        return this.AbnormalChildProcessEventCount;
    }

    /**
     * Set 待处理敏感服务异常子进程启动事件数
     * @param AbnormalChildProcessEventCount 待处理敏感服务异常子进程启动事件数
     */
    public void setAbnormalChildProcessEventCount(Long AbnormalChildProcessEventCount) {
        this.AbnormalChildProcessEventCount = AbnormalChildProcessEventCount;
    }

    /**
     * Get 待处理自定义规则事件数 
     * @return UserDefinedRuleEventCount 待处理自定义规则事件数
     */
    public Long getUserDefinedRuleEventCount() {
        return this.UserDefinedRuleEventCount;
    }

    /**
     * Set 待处理自定义规则事件数
     * @param UserDefinedRuleEventCount 待处理自定义规则事件数
     */
    public void setUserDefinedRuleEventCount(Long UserDefinedRuleEventCount) {
        this.UserDefinedRuleEventCount = UserDefinedRuleEventCount;
    }

    public AbnormalProcessEventTendencyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalProcessEventTendencyInfo(AbnormalProcessEventTendencyInfo source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.ProxyToolEventCount != null) {
            this.ProxyToolEventCount = new Long(source.ProxyToolEventCount);
        }
        if (source.TransferControlEventCount != null) {
            this.TransferControlEventCount = new Long(source.TransferControlEventCount);
        }
        if (source.AttackCmdEventCount != null) {
            this.AttackCmdEventCount = new Long(source.AttackCmdEventCount);
        }
        if (source.ReverseShellEventCount != null) {
            this.ReverseShellEventCount = new Long(source.ReverseShellEventCount);
        }
        if (source.FilelessEventCount != null) {
            this.FilelessEventCount = new Long(source.FilelessEventCount);
        }
        if (source.RiskCmdEventCount != null) {
            this.RiskCmdEventCount = new Long(source.RiskCmdEventCount);
        }
        if (source.AbnormalChildProcessEventCount != null) {
            this.AbnormalChildProcessEventCount = new Long(source.AbnormalChildProcessEventCount);
        }
        if (source.UserDefinedRuleEventCount != null) {
            this.UserDefinedRuleEventCount = new Long(source.UserDefinedRuleEventCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "ProxyToolEventCount", this.ProxyToolEventCount);
        this.setParamSimple(map, prefix + "TransferControlEventCount", this.TransferControlEventCount);
        this.setParamSimple(map, prefix + "AttackCmdEventCount", this.AttackCmdEventCount);
        this.setParamSimple(map, prefix + "ReverseShellEventCount", this.ReverseShellEventCount);
        this.setParamSimple(map, prefix + "FilelessEventCount", this.FilelessEventCount);
        this.setParamSimple(map, prefix + "RiskCmdEventCount", this.RiskCmdEventCount);
        this.setParamSimple(map, prefix + "AbnormalChildProcessEventCount", this.AbnormalChildProcessEventCount);
        this.setParamSimple(map, prefix + "UserDefinedRuleEventCount", this.UserDefinedRuleEventCount);

    }
}

