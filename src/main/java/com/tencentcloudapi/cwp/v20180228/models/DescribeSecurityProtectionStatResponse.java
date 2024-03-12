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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityProtectionStatResponse extends AbstractModel {

    /**
    * 0 ：0付费资产情况， 1：存在未安装agent情况 ，2：部分资产已是专业版/旗舰版， 3：全部资产已是专业版/旗舰版
    */
    @SerializedName("AssetManageStat")
    @Expose
    private Long AssetManageStat;

    /**
    * 0:从未检测过，或0资产付费情况, 1:存在漏洞风险, 2:无风险
    */
    @SerializedName("VulManageStat")
    @Expose
    private Long VulManageStat;

    /**
    * 0:从未检测过，或0资产付费情况, 1:存在基线风险,2:无风险
    */
    @SerializedName("SecureBasicLineStat")
    @Expose
    private Long SecureBasicLineStat;

    /**
    * 0:从未检测过，或0资产付费情况, 1:已检测，存在恶意文件, 2:已检测，未开启隔离防护, 3:已检测且已开启防护且无风险
    */
    @SerializedName("MalwareScanStat")
    @Expose
    private Long MalwareScanStat;

    /**
    * 密码破解是否开启防护 0:未开启防护或0付费资产情况 1:已开启防护 2:存在带处理事件
    */
    @SerializedName("DefenseBruteAttackStat")
    @Expose
    private Long DefenseBruteAttackStat;

    /**
    * 核心文件监控 0:未开启防护（0付费资产情况）,1: 已开通
    */
    @SerializedName("FileTamperStat")
    @Expose
    private Long FileTamperStat;

    /**
    * 网页防篡改  0:未开通, 1:已开通
    */
    @SerializedName("WebPageStat")
    @Expose
    private Long WebPageStat;

    /**
    * 异常登录 0:存在未处理风险,1:无风险，未配置白名单,2:无风险，已配置
    */
    @SerializedName("LoginLogStat")
    @Expose
    private Long LoginLogStat;

    /**
    * 检测--密码破解有无存在风险  0:存在未处理风险, 1：无风险，正常检测
    */
    @SerializedName("DiscoverBruteAttackStat")
    @Expose
    private Long DiscoverBruteAttackStat;

    /**
    * 恶意请求 0 : 0台开通专业版/旗舰版, 1: 恶意请求 存在未处理风险, 2:已有付费资产，无风险
    */
    @SerializedName("MaliciousRequestStat")
    @Expose
    private Long MaliciousRequestStat;

    /**
    * 本地提权 0:0台开通专业版/旗舰版, 1:存在未处理风险 2:已有付费资产，无风险
    */
    @SerializedName("PrivilegeStat")
    @Expose
    private Long PrivilegeStat;

    /**
    * 反弹shell 0:0台开通专业版/旗舰版, 1:存在未处理风险 2:已有付费资产，无风险
    */
    @SerializedName("ReverseShellStat")
    @Expose
    private Long ReverseShellStat;

    /**
    * 专家服务 0:未开通服务, 1:已开通
    */
    @SerializedName("ExpertServiceStat")
    @Expose
    private Long ExpertServiceStat;

    /**
    * 日志分析 0:未开通服务, 1:已开通
    */
    @SerializedName("LogAnalysisStat")
    @Expose
    private Long LogAnalysisStat;

    /**
    * 安全告警 0:未开通设置（全部关闭） 1:已开通（只要开启1个就算）
    */
    @SerializedName("WarningSetStat")
    @Expose
    private Long WarningSetStat;

    /**
    * 高危命令，0：0台开通专业版/旗舰版， 1：存在未处理风险， 2：已有付费资产，无风险
    */
    @SerializedName("EventBashStat")
    @Expose
    private Long EventBashStat;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 0 ：0付费资产情况， 1：存在未安装agent情况 ，2：部分资产已是专业版/旗舰版， 3：全部资产已是专业版/旗舰版 
     * @return AssetManageStat 0 ：0付费资产情况， 1：存在未安装agent情况 ，2：部分资产已是专业版/旗舰版， 3：全部资产已是专业版/旗舰版
     */
    public Long getAssetManageStat() {
        return this.AssetManageStat;
    }

    /**
     * Set 0 ：0付费资产情况， 1：存在未安装agent情况 ，2：部分资产已是专业版/旗舰版， 3：全部资产已是专业版/旗舰版
     * @param AssetManageStat 0 ：0付费资产情况， 1：存在未安装agent情况 ，2：部分资产已是专业版/旗舰版， 3：全部资产已是专业版/旗舰版
     */
    public void setAssetManageStat(Long AssetManageStat) {
        this.AssetManageStat = AssetManageStat;
    }

    /**
     * Get 0:从未检测过，或0资产付费情况, 1:存在漏洞风险, 2:无风险 
     * @return VulManageStat 0:从未检测过，或0资产付费情况, 1:存在漏洞风险, 2:无风险
     */
    public Long getVulManageStat() {
        return this.VulManageStat;
    }

    /**
     * Set 0:从未检测过，或0资产付费情况, 1:存在漏洞风险, 2:无风险
     * @param VulManageStat 0:从未检测过，或0资产付费情况, 1:存在漏洞风险, 2:无风险
     */
    public void setVulManageStat(Long VulManageStat) {
        this.VulManageStat = VulManageStat;
    }

    /**
     * Get 0:从未检测过，或0资产付费情况, 1:存在基线风险,2:无风险 
     * @return SecureBasicLineStat 0:从未检测过，或0资产付费情况, 1:存在基线风险,2:无风险
     */
    public Long getSecureBasicLineStat() {
        return this.SecureBasicLineStat;
    }

    /**
     * Set 0:从未检测过，或0资产付费情况, 1:存在基线风险,2:无风险
     * @param SecureBasicLineStat 0:从未检测过，或0资产付费情况, 1:存在基线风险,2:无风险
     */
    public void setSecureBasicLineStat(Long SecureBasicLineStat) {
        this.SecureBasicLineStat = SecureBasicLineStat;
    }

    /**
     * Get 0:从未检测过，或0资产付费情况, 1:已检测，存在恶意文件, 2:已检测，未开启隔离防护, 3:已检测且已开启防护且无风险 
     * @return MalwareScanStat 0:从未检测过，或0资产付费情况, 1:已检测，存在恶意文件, 2:已检测，未开启隔离防护, 3:已检测且已开启防护且无风险
     */
    public Long getMalwareScanStat() {
        return this.MalwareScanStat;
    }

    /**
     * Set 0:从未检测过，或0资产付费情况, 1:已检测，存在恶意文件, 2:已检测，未开启隔离防护, 3:已检测且已开启防护且无风险
     * @param MalwareScanStat 0:从未检测过，或0资产付费情况, 1:已检测，存在恶意文件, 2:已检测，未开启隔离防护, 3:已检测且已开启防护且无风险
     */
    public void setMalwareScanStat(Long MalwareScanStat) {
        this.MalwareScanStat = MalwareScanStat;
    }

    /**
     * Get 密码破解是否开启防护 0:未开启防护或0付费资产情况 1:已开启防护 2:存在带处理事件 
     * @return DefenseBruteAttackStat 密码破解是否开启防护 0:未开启防护或0付费资产情况 1:已开启防护 2:存在带处理事件
     */
    public Long getDefenseBruteAttackStat() {
        return this.DefenseBruteAttackStat;
    }

    /**
     * Set 密码破解是否开启防护 0:未开启防护或0付费资产情况 1:已开启防护 2:存在带处理事件
     * @param DefenseBruteAttackStat 密码破解是否开启防护 0:未开启防护或0付费资产情况 1:已开启防护 2:存在带处理事件
     */
    public void setDefenseBruteAttackStat(Long DefenseBruteAttackStat) {
        this.DefenseBruteAttackStat = DefenseBruteAttackStat;
    }

    /**
     * Get 核心文件监控 0:未开启防护（0付费资产情况）,1: 已开通 
     * @return FileTamperStat 核心文件监控 0:未开启防护（0付费资产情况）,1: 已开通
     */
    public Long getFileTamperStat() {
        return this.FileTamperStat;
    }

    /**
     * Set 核心文件监控 0:未开启防护（0付费资产情况）,1: 已开通
     * @param FileTamperStat 核心文件监控 0:未开启防护（0付费资产情况）,1: 已开通
     */
    public void setFileTamperStat(Long FileTamperStat) {
        this.FileTamperStat = FileTamperStat;
    }

    /**
     * Get 网页防篡改  0:未开通, 1:已开通 
     * @return WebPageStat 网页防篡改  0:未开通, 1:已开通
     */
    public Long getWebPageStat() {
        return this.WebPageStat;
    }

    /**
     * Set 网页防篡改  0:未开通, 1:已开通
     * @param WebPageStat 网页防篡改  0:未开通, 1:已开通
     */
    public void setWebPageStat(Long WebPageStat) {
        this.WebPageStat = WebPageStat;
    }

    /**
     * Get 异常登录 0:存在未处理风险,1:无风险，未配置白名单,2:无风险，已配置 
     * @return LoginLogStat 异常登录 0:存在未处理风险,1:无风险，未配置白名单,2:无风险，已配置
     */
    public Long getLoginLogStat() {
        return this.LoginLogStat;
    }

    /**
     * Set 异常登录 0:存在未处理风险,1:无风险，未配置白名单,2:无风险，已配置
     * @param LoginLogStat 异常登录 0:存在未处理风险,1:无风险，未配置白名单,2:无风险，已配置
     */
    public void setLoginLogStat(Long LoginLogStat) {
        this.LoginLogStat = LoginLogStat;
    }

    /**
     * Get 检测--密码破解有无存在风险  0:存在未处理风险, 1：无风险，正常检测 
     * @return DiscoverBruteAttackStat 检测--密码破解有无存在风险  0:存在未处理风险, 1：无风险，正常检测
     */
    public Long getDiscoverBruteAttackStat() {
        return this.DiscoverBruteAttackStat;
    }

    /**
     * Set 检测--密码破解有无存在风险  0:存在未处理风险, 1：无风险，正常检测
     * @param DiscoverBruteAttackStat 检测--密码破解有无存在风险  0:存在未处理风险, 1：无风险，正常检测
     */
    public void setDiscoverBruteAttackStat(Long DiscoverBruteAttackStat) {
        this.DiscoverBruteAttackStat = DiscoverBruteAttackStat;
    }

    /**
     * Get 恶意请求 0 : 0台开通专业版/旗舰版, 1: 恶意请求 存在未处理风险, 2:已有付费资产，无风险 
     * @return MaliciousRequestStat 恶意请求 0 : 0台开通专业版/旗舰版, 1: 恶意请求 存在未处理风险, 2:已有付费资产，无风险
     */
    public Long getMaliciousRequestStat() {
        return this.MaliciousRequestStat;
    }

    /**
     * Set 恶意请求 0 : 0台开通专业版/旗舰版, 1: 恶意请求 存在未处理风险, 2:已有付费资产，无风险
     * @param MaliciousRequestStat 恶意请求 0 : 0台开通专业版/旗舰版, 1: 恶意请求 存在未处理风险, 2:已有付费资产，无风险
     */
    public void setMaliciousRequestStat(Long MaliciousRequestStat) {
        this.MaliciousRequestStat = MaliciousRequestStat;
    }

    /**
     * Get 本地提权 0:0台开通专业版/旗舰版, 1:存在未处理风险 2:已有付费资产，无风险 
     * @return PrivilegeStat 本地提权 0:0台开通专业版/旗舰版, 1:存在未处理风险 2:已有付费资产，无风险
     */
    public Long getPrivilegeStat() {
        return this.PrivilegeStat;
    }

    /**
     * Set 本地提权 0:0台开通专业版/旗舰版, 1:存在未处理风险 2:已有付费资产，无风险
     * @param PrivilegeStat 本地提权 0:0台开通专业版/旗舰版, 1:存在未处理风险 2:已有付费资产，无风险
     */
    public void setPrivilegeStat(Long PrivilegeStat) {
        this.PrivilegeStat = PrivilegeStat;
    }

    /**
     * Get 反弹shell 0:0台开通专业版/旗舰版, 1:存在未处理风险 2:已有付费资产，无风险 
     * @return ReverseShellStat 反弹shell 0:0台开通专业版/旗舰版, 1:存在未处理风险 2:已有付费资产，无风险
     */
    public Long getReverseShellStat() {
        return this.ReverseShellStat;
    }

    /**
     * Set 反弹shell 0:0台开通专业版/旗舰版, 1:存在未处理风险 2:已有付费资产，无风险
     * @param ReverseShellStat 反弹shell 0:0台开通专业版/旗舰版, 1:存在未处理风险 2:已有付费资产，无风险
     */
    public void setReverseShellStat(Long ReverseShellStat) {
        this.ReverseShellStat = ReverseShellStat;
    }

    /**
     * Get 专家服务 0:未开通服务, 1:已开通 
     * @return ExpertServiceStat 专家服务 0:未开通服务, 1:已开通
     */
    public Long getExpertServiceStat() {
        return this.ExpertServiceStat;
    }

    /**
     * Set 专家服务 0:未开通服务, 1:已开通
     * @param ExpertServiceStat 专家服务 0:未开通服务, 1:已开通
     */
    public void setExpertServiceStat(Long ExpertServiceStat) {
        this.ExpertServiceStat = ExpertServiceStat;
    }

    /**
     * Get 日志分析 0:未开通服务, 1:已开通 
     * @return LogAnalysisStat 日志分析 0:未开通服务, 1:已开通
     */
    public Long getLogAnalysisStat() {
        return this.LogAnalysisStat;
    }

    /**
     * Set 日志分析 0:未开通服务, 1:已开通
     * @param LogAnalysisStat 日志分析 0:未开通服务, 1:已开通
     */
    public void setLogAnalysisStat(Long LogAnalysisStat) {
        this.LogAnalysisStat = LogAnalysisStat;
    }

    /**
     * Get 安全告警 0:未开通设置（全部关闭） 1:已开通（只要开启1个就算） 
     * @return WarningSetStat 安全告警 0:未开通设置（全部关闭） 1:已开通（只要开启1个就算）
     */
    public Long getWarningSetStat() {
        return this.WarningSetStat;
    }

    /**
     * Set 安全告警 0:未开通设置（全部关闭） 1:已开通（只要开启1个就算）
     * @param WarningSetStat 安全告警 0:未开通设置（全部关闭） 1:已开通（只要开启1个就算）
     */
    public void setWarningSetStat(Long WarningSetStat) {
        this.WarningSetStat = WarningSetStat;
    }

    /**
     * Get 高危命令，0：0台开通专业版/旗舰版， 1：存在未处理风险， 2：已有付费资产，无风险 
     * @return EventBashStat 高危命令，0：0台开通专业版/旗舰版， 1：存在未处理风险， 2：已有付费资产，无风险
     */
    public Long getEventBashStat() {
        return this.EventBashStat;
    }

    /**
     * Set 高危命令，0：0台开通专业版/旗舰版， 1：存在未处理风险， 2：已有付费资产，无风险
     * @param EventBashStat 高危命令，0：0台开通专业版/旗舰版， 1：存在未处理风险， 2：已有付费资产，无风险
     */
    public void setEventBashStat(Long EventBashStat) {
        this.EventBashStat = EventBashStat;
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

    public DescribeSecurityProtectionStatResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityProtectionStatResponse(DescribeSecurityProtectionStatResponse source) {
        if (source.AssetManageStat != null) {
            this.AssetManageStat = new Long(source.AssetManageStat);
        }
        if (source.VulManageStat != null) {
            this.VulManageStat = new Long(source.VulManageStat);
        }
        if (source.SecureBasicLineStat != null) {
            this.SecureBasicLineStat = new Long(source.SecureBasicLineStat);
        }
        if (source.MalwareScanStat != null) {
            this.MalwareScanStat = new Long(source.MalwareScanStat);
        }
        if (source.DefenseBruteAttackStat != null) {
            this.DefenseBruteAttackStat = new Long(source.DefenseBruteAttackStat);
        }
        if (source.FileTamperStat != null) {
            this.FileTamperStat = new Long(source.FileTamperStat);
        }
        if (source.WebPageStat != null) {
            this.WebPageStat = new Long(source.WebPageStat);
        }
        if (source.LoginLogStat != null) {
            this.LoginLogStat = new Long(source.LoginLogStat);
        }
        if (source.DiscoverBruteAttackStat != null) {
            this.DiscoverBruteAttackStat = new Long(source.DiscoverBruteAttackStat);
        }
        if (source.MaliciousRequestStat != null) {
            this.MaliciousRequestStat = new Long(source.MaliciousRequestStat);
        }
        if (source.PrivilegeStat != null) {
            this.PrivilegeStat = new Long(source.PrivilegeStat);
        }
        if (source.ReverseShellStat != null) {
            this.ReverseShellStat = new Long(source.ReverseShellStat);
        }
        if (source.ExpertServiceStat != null) {
            this.ExpertServiceStat = new Long(source.ExpertServiceStat);
        }
        if (source.LogAnalysisStat != null) {
            this.LogAnalysisStat = new Long(source.LogAnalysisStat);
        }
        if (source.WarningSetStat != null) {
            this.WarningSetStat = new Long(source.WarningSetStat);
        }
        if (source.EventBashStat != null) {
            this.EventBashStat = new Long(source.EventBashStat);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetManageStat", this.AssetManageStat);
        this.setParamSimple(map, prefix + "VulManageStat", this.VulManageStat);
        this.setParamSimple(map, prefix + "SecureBasicLineStat", this.SecureBasicLineStat);
        this.setParamSimple(map, prefix + "MalwareScanStat", this.MalwareScanStat);
        this.setParamSimple(map, prefix + "DefenseBruteAttackStat", this.DefenseBruteAttackStat);
        this.setParamSimple(map, prefix + "FileTamperStat", this.FileTamperStat);
        this.setParamSimple(map, prefix + "WebPageStat", this.WebPageStat);
        this.setParamSimple(map, prefix + "LoginLogStat", this.LoginLogStat);
        this.setParamSimple(map, prefix + "DiscoverBruteAttackStat", this.DiscoverBruteAttackStat);
        this.setParamSimple(map, prefix + "MaliciousRequestStat", this.MaliciousRequestStat);
        this.setParamSimple(map, prefix + "PrivilegeStat", this.PrivilegeStat);
        this.setParamSimple(map, prefix + "ReverseShellStat", this.ReverseShellStat);
        this.setParamSimple(map, prefix + "ExpertServiceStat", this.ExpertServiceStat);
        this.setParamSimple(map, prefix + "LogAnalysisStat", this.LogAnalysisStat);
        this.setParamSimple(map, prefix + "WarningSetStat", this.WarningSetStat);
        this.setParamSimple(map, prefix + "EventBashStat", this.EventBashStat);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

