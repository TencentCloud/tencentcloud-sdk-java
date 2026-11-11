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

public class HostVulScanStatus extends AbstractModel {

    /**
    * 是否发起过漏洞扫描
枚举值：
true：已发起过漏洞扫描
false：从未发起过漏洞扫描
    */
    @SerializedName("HasScanned")
    @Expose
    private Boolean HasScanned;

    /**
    * 是否处于首次漏洞扫描判断场景
枚举值：
true：处于首次漏洞扫描判断场景
false：不处于首次漏洞扫描判断场景
    */
    @SerializedName("IsFirstScan")
    @Expose
    private Boolean IsFirstScan;

    /**
    * 最近一次扫描任务状态
枚举值：
SCANNING：扫描中
SUCCESS：扫描成功
PARTIAL_FAILED：部分扫描失败
ALL_FAILED：全部扫描失败
STOPPED：停止扫描
    */
    @SerializedName("ScanTaskStatus")
    @Expose
    private String ScanTaskStatus;

    /**
    * 页面业务状态
枚举值：
NEVER_SCANNED：从未扫描过漏洞
SCANNING：扫描中
FIRST_SCAN_FAILED：首次漏洞扫描失败
FIRST_SCAN_HAS_FIXABLE_VUL：首次扫描完成，存在可修复漏洞
FIRST_SCAN_NO_FIXABLE_VUL：首次扫描完成，有漏洞但无可修复漏洞
FIRST_SCAN_NO_VUL：首次扫描完成，没有漏洞
SCANNED_HAS_FIXABLE_VUL：非首次扫描，存在可修复漏洞
SCANNED_NO_FIXABLE_VUL：非首次扫描，有漏洞但无可修复漏洞
SCANNED_NO_VUL：非首次扫描，没有漏洞
    */
    @SerializedName("ScanScene")
    @Expose
    private String ScanScene;

    /**
    * 最近扫描时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
从未扫描时返回空字符串。
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * 当前待处理漏洞总数
包含普通主机漏洞和最新 Windows KB 待处理风险。
    */
    @SerializedName("TotalVulCount")
    @Expose
    private Long TotalVulCount;

    /**
    * 当前可修复漏洞数
包含支持一键修复的普通主机漏洞和最新 Windows KB 待处理风险。
    */
    @SerializedName("FixableVulCount")
    @Expose
    private Long FixableVulCount;

    /**
    * 当前可修复应急漏洞数
应急漏洞优先归类：应急漏洞仅计入该字段，不再计入 Linux 软件漏洞数。
    */
    @SerializedName("FixableEmergencyCount")
    @Expose
    private Long FixableEmergencyCount;

    /**
    * 当前可修复 Linux 软件漏洞数
仅统计非应急 Linux 软件漏洞。
    */
    @SerializedName("FixableLinuxVulCount")
    @Expose
    private Long FixableLinuxVulCount;

    /**
    * 当前可修复 Windows 系统补丁数
统计最新 Windows KB 待处理风险。
    */
    @SerializedName("FixableWindowVulCount")
    @Expose
    private Long FixableWindowVulCount;

    /**
     * Get 是否发起过漏洞扫描
枚举值：
true：已发起过漏洞扫描
false：从未发起过漏洞扫描 
     * @return HasScanned 是否发起过漏洞扫描
枚举值：
true：已发起过漏洞扫描
false：从未发起过漏洞扫描
     */
    public Boolean getHasScanned() {
        return this.HasScanned;
    }

    /**
     * Set 是否发起过漏洞扫描
枚举值：
true：已发起过漏洞扫描
false：从未发起过漏洞扫描
     * @param HasScanned 是否发起过漏洞扫描
枚举值：
true：已发起过漏洞扫描
false：从未发起过漏洞扫描
     */
    public void setHasScanned(Boolean HasScanned) {
        this.HasScanned = HasScanned;
    }

    /**
     * Get 是否处于首次漏洞扫描判断场景
枚举值：
true：处于首次漏洞扫描判断场景
false：不处于首次漏洞扫描判断场景 
     * @return IsFirstScan 是否处于首次漏洞扫描判断场景
枚举值：
true：处于首次漏洞扫描判断场景
false：不处于首次漏洞扫描判断场景
     */
    public Boolean getIsFirstScan() {
        return this.IsFirstScan;
    }

    /**
     * Set 是否处于首次漏洞扫描判断场景
枚举值：
true：处于首次漏洞扫描判断场景
false：不处于首次漏洞扫描判断场景
     * @param IsFirstScan 是否处于首次漏洞扫描判断场景
枚举值：
true：处于首次漏洞扫描判断场景
false：不处于首次漏洞扫描判断场景
     */
    public void setIsFirstScan(Boolean IsFirstScan) {
        this.IsFirstScan = IsFirstScan;
    }

    /**
     * Get 最近一次扫描任务状态
枚举值：
SCANNING：扫描中
SUCCESS：扫描成功
PARTIAL_FAILED：部分扫描失败
ALL_FAILED：全部扫描失败
STOPPED：停止扫描 
     * @return ScanTaskStatus 最近一次扫描任务状态
枚举值：
SCANNING：扫描中
SUCCESS：扫描成功
PARTIAL_FAILED：部分扫描失败
ALL_FAILED：全部扫描失败
STOPPED：停止扫描
     */
    public String getScanTaskStatus() {
        return this.ScanTaskStatus;
    }

    /**
     * Set 最近一次扫描任务状态
枚举值：
SCANNING：扫描中
SUCCESS：扫描成功
PARTIAL_FAILED：部分扫描失败
ALL_FAILED：全部扫描失败
STOPPED：停止扫描
     * @param ScanTaskStatus 最近一次扫描任务状态
枚举值：
SCANNING：扫描中
SUCCESS：扫描成功
PARTIAL_FAILED：部分扫描失败
ALL_FAILED：全部扫描失败
STOPPED：停止扫描
     */
    public void setScanTaskStatus(String ScanTaskStatus) {
        this.ScanTaskStatus = ScanTaskStatus;
    }

    /**
     * Get 页面业务状态
枚举值：
NEVER_SCANNED：从未扫描过漏洞
SCANNING：扫描中
FIRST_SCAN_FAILED：首次漏洞扫描失败
FIRST_SCAN_HAS_FIXABLE_VUL：首次扫描完成，存在可修复漏洞
FIRST_SCAN_NO_FIXABLE_VUL：首次扫描完成，有漏洞但无可修复漏洞
FIRST_SCAN_NO_VUL：首次扫描完成，没有漏洞
SCANNED_HAS_FIXABLE_VUL：非首次扫描，存在可修复漏洞
SCANNED_NO_FIXABLE_VUL：非首次扫描，有漏洞但无可修复漏洞
SCANNED_NO_VUL：非首次扫描，没有漏洞 
     * @return ScanScene 页面业务状态
枚举值：
NEVER_SCANNED：从未扫描过漏洞
SCANNING：扫描中
FIRST_SCAN_FAILED：首次漏洞扫描失败
FIRST_SCAN_HAS_FIXABLE_VUL：首次扫描完成，存在可修复漏洞
FIRST_SCAN_NO_FIXABLE_VUL：首次扫描完成，有漏洞但无可修复漏洞
FIRST_SCAN_NO_VUL：首次扫描完成，没有漏洞
SCANNED_HAS_FIXABLE_VUL：非首次扫描，存在可修复漏洞
SCANNED_NO_FIXABLE_VUL：非首次扫描，有漏洞但无可修复漏洞
SCANNED_NO_VUL：非首次扫描，没有漏洞
     */
    public String getScanScene() {
        return this.ScanScene;
    }

    /**
     * Set 页面业务状态
枚举值：
NEVER_SCANNED：从未扫描过漏洞
SCANNING：扫描中
FIRST_SCAN_FAILED：首次漏洞扫描失败
FIRST_SCAN_HAS_FIXABLE_VUL：首次扫描完成，存在可修复漏洞
FIRST_SCAN_NO_FIXABLE_VUL：首次扫描完成，有漏洞但无可修复漏洞
FIRST_SCAN_NO_VUL：首次扫描完成，没有漏洞
SCANNED_HAS_FIXABLE_VUL：非首次扫描，存在可修复漏洞
SCANNED_NO_FIXABLE_VUL：非首次扫描，有漏洞但无可修复漏洞
SCANNED_NO_VUL：非首次扫描，没有漏洞
     * @param ScanScene 页面业务状态
枚举值：
NEVER_SCANNED：从未扫描过漏洞
SCANNING：扫描中
FIRST_SCAN_FAILED：首次漏洞扫描失败
FIRST_SCAN_HAS_FIXABLE_VUL：首次扫描完成，存在可修复漏洞
FIRST_SCAN_NO_FIXABLE_VUL：首次扫描完成，有漏洞但无可修复漏洞
FIRST_SCAN_NO_VUL：首次扫描完成，没有漏洞
SCANNED_HAS_FIXABLE_VUL：非首次扫描，存在可修复漏洞
SCANNED_NO_FIXABLE_VUL：非首次扫描，有漏洞但无可修复漏洞
SCANNED_NO_VUL：非首次扫描，没有漏洞
     */
    public void setScanScene(String ScanScene) {
        this.ScanScene = ScanScene;
    }

    /**
     * Get 最近扫描时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
从未扫描时返回空字符串。 
     * @return LatestScanTime 最近扫描时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
从未扫描时返回空字符串。
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set 最近扫描时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
从未扫描时返回空字符串。
     * @param LatestScanTime 最近扫描时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
从未扫描时返回空字符串。
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get 当前待处理漏洞总数
包含普通主机漏洞和最新 Windows KB 待处理风险。 
     * @return TotalVulCount 当前待处理漏洞总数
包含普通主机漏洞和最新 Windows KB 待处理风险。
     */
    public Long getTotalVulCount() {
        return this.TotalVulCount;
    }

    /**
     * Set 当前待处理漏洞总数
包含普通主机漏洞和最新 Windows KB 待处理风险。
     * @param TotalVulCount 当前待处理漏洞总数
包含普通主机漏洞和最新 Windows KB 待处理风险。
     */
    public void setTotalVulCount(Long TotalVulCount) {
        this.TotalVulCount = TotalVulCount;
    }

    /**
     * Get 当前可修复漏洞数
包含支持一键修复的普通主机漏洞和最新 Windows KB 待处理风险。 
     * @return FixableVulCount 当前可修复漏洞数
包含支持一键修复的普通主机漏洞和最新 Windows KB 待处理风险。
     */
    public Long getFixableVulCount() {
        return this.FixableVulCount;
    }

    /**
     * Set 当前可修复漏洞数
包含支持一键修复的普通主机漏洞和最新 Windows KB 待处理风险。
     * @param FixableVulCount 当前可修复漏洞数
包含支持一键修复的普通主机漏洞和最新 Windows KB 待处理风险。
     */
    public void setFixableVulCount(Long FixableVulCount) {
        this.FixableVulCount = FixableVulCount;
    }

    /**
     * Get 当前可修复应急漏洞数
应急漏洞优先归类：应急漏洞仅计入该字段，不再计入 Linux 软件漏洞数。 
     * @return FixableEmergencyCount 当前可修复应急漏洞数
应急漏洞优先归类：应急漏洞仅计入该字段，不再计入 Linux 软件漏洞数。
     */
    public Long getFixableEmergencyCount() {
        return this.FixableEmergencyCount;
    }

    /**
     * Set 当前可修复应急漏洞数
应急漏洞优先归类：应急漏洞仅计入该字段，不再计入 Linux 软件漏洞数。
     * @param FixableEmergencyCount 当前可修复应急漏洞数
应急漏洞优先归类：应急漏洞仅计入该字段，不再计入 Linux 软件漏洞数。
     */
    public void setFixableEmergencyCount(Long FixableEmergencyCount) {
        this.FixableEmergencyCount = FixableEmergencyCount;
    }

    /**
     * Get 当前可修复 Linux 软件漏洞数
仅统计非应急 Linux 软件漏洞。 
     * @return FixableLinuxVulCount 当前可修复 Linux 软件漏洞数
仅统计非应急 Linux 软件漏洞。
     */
    public Long getFixableLinuxVulCount() {
        return this.FixableLinuxVulCount;
    }

    /**
     * Set 当前可修复 Linux 软件漏洞数
仅统计非应急 Linux 软件漏洞。
     * @param FixableLinuxVulCount 当前可修复 Linux 软件漏洞数
仅统计非应急 Linux 软件漏洞。
     */
    public void setFixableLinuxVulCount(Long FixableLinuxVulCount) {
        this.FixableLinuxVulCount = FixableLinuxVulCount;
    }

    /**
     * Get 当前可修复 Windows 系统补丁数
统计最新 Windows KB 待处理风险。 
     * @return FixableWindowVulCount 当前可修复 Windows 系统补丁数
统计最新 Windows KB 待处理风险。
     */
    public Long getFixableWindowVulCount() {
        return this.FixableWindowVulCount;
    }

    /**
     * Set 当前可修复 Windows 系统补丁数
统计最新 Windows KB 待处理风险。
     * @param FixableWindowVulCount 当前可修复 Windows 系统补丁数
统计最新 Windows KB 待处理风险。
     */
    public void setFixableWindowVulCount(Long FixableWindowVulCount) {
        this.FixableWindowVulCount = FixableWindowVulCount;
    }

    public HostVulScanStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostVulScanStatus(HostVulScanStatus source) {
        if (source.HasScanned != null) {
            this.HasScanned = new Boolean(source.HasScanned);
        }
        if (source.IsFirstScan != null) {
            this.IsFirstScan = new Boolean(source.IsFirstScan);
        }
        if (source.ScanTaskStatus != null) {
            this.ScanTaskStatus = new String(source.ScanTaskStatus);
        }
        if (source.ScanScene != null) {
            this.ScanScene = new String(source.ScanScene);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.TotalVulCount != null) {
            this.TotalVulCount = new Long(source.TotalVulCount);
        }
        if (source.FixableVulCount != null) {
            this.FixableVulCount = new Long(source.FixableVulCount);
        }
        if (source.FixableEmergencyCount != null) {
            this.FixableEmergencyCount = new Long(source.FixableEmergencyCount);
        }
        if (source.FixableLinuxVulCount != null) {
            this.FixableLinuxVulCount = new Long(source.FixableLinuxVulCount);
        }
        if (source.FixableWindowVulCount != null) {
            this.FixableWindowVulCount = new Long(source.FixableWindowVulCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HasScanned", this.HasScanned);
        this.setParamSimple(map, prefix + "IsFirstScan", this.IsFirstScan);
        this.setParamSimple(map, prefix + "ScanTaskStatus", this.ScanTaskStatus);
        this.setParamSimple(map, prefix + "ScanScene", this.ScanScene);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "TotalVulCount", this.TotalVulCount);
        this.setParamSimple(map, prefix + "FixableVulCount", this.FixableVulCount);
        this.setParamSimple(map, prefix + "FixableEmergencyCount", this.FixableEmergencyCount);
        this.setParamSimple(map, prefix + "FixableLinuxVulCount", this.FixableLinuxVulCount);
        this.setParamSimple(map, prefix + "FixableWindowVulCount", this.FixableWindowVulCount);

    }
}

