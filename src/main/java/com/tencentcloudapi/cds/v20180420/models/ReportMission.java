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
package com.tencentcloudapi.cds.v20180420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportMission extends AbstractModel {

    /**
    * 报表任务id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 任务名称
    */
    @SerializedName("TplName")
    @Expose
    private String TplName;

    /**
    * 报表类型 1:单次报表 2:周期报表
    */
    @SerializedName("ReportType")
    @Expose
    private Long ReportType;

    /**
    * 报告说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 报表模板 1:综合分析报告 2:等保合规报告
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 包含资产
    */
    @SerializedName("AssetsList")
    @Expose
    private AssetsInfo [] AssetsList;

    /**
    * 下次启动时间
    */
    @SerializedName("NextStartTime")
    @Expose
    private Long NextStartTime;

    /**
    * 任务状态 1:生成中 2:待生成3:已生成4:生成失败5:已暂停
    */
    @SerializedName("MissionStatus")
    @Expose
    private Long MissionStatus;

    /**
    * 任务状态说明 仅生成中和生成失败有效
    */
    @SerializedName("MissionStatusMessage")
    @Expose
    private String MissionStatusMessage;

    /**
    * 已生成报表数
    */
    @SerializedName("ReportCount")
    @Expose
    private Long ReportCount;

    /**
    * 任务起停 1:关闭 2:开启 仅周期报表有效
    */
    @SerializedName("MissionStart")
    @Expose
    private Long MissionStart;

    /**
    * 统计周期 1:24小时 7:近一周 30:近30天 90:近90天 180:
    */
    @SerializedName("CntDay")
    @Expose
    private Long CntDay;

    /**
    * 重复周期 1:每天 2:每周 3:每月
    */
    @SerializedName("CntCycle")
    @Expose
    private Long CntCycle;

    /**
    * 执行日期 重复周期为天：无意义 周：星期几 1-7  月每月
    */
    @SerializedName("CntTime")
    @Expose
    private Long CntTime;

    /**
    * 执行时间 格式15:04 到分钟
    */
    @SerializedName("CntDate")
    @Expose
    private String CntDate;

    /**
    * 创建者 0:内置 其余存放用户(uin)
    */
    @SerializedName("Receivers")
    @Expose
    private String Receivers;

    /**
    * Notification  int  1关闭 2开启 不变更为0
    */
    @SerializedName("Notification")
    @Expose
    private Long Notification;

    /**
     * Get 报表任务id 
     * @return Id 报表任务id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 报表任务id
     * @param Id 报表任务id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 任务名称 
     * @return TplName 任务名称
     */
    public String getTplName() {
        return this.TplName;
    }

    /**
     * Set 任务名称
     * @param TplName 任务名称
     */
    public void setTplName(String TplName) {
        this.TplName = TplName;
    }

    /**
     * Get 报表类型 1:单次报表 2:周期报表 
     * @return ReportType 报表类型 1:单次报表 2:周期报表
     */
    public Long getReportType() {
        return this.ReportType;
    }

    /**
     * Set 报表类型 1:单次报表 2:周期报表
     * @param ReportType 报表类型 1:单次报表 2:周期报表
     */
    public void setReportType(Long ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get 报告说明 
     * @return Remark 报告说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 报告说明
     * @param Remark 报告说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 报表模板 1:综合分析报告 2:等保合规报告 
     * @return TemplateId 报表模板 1:综合分析报告 2:等保合规报告
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 报表模板 1:综合分析报告 2:等保合规报告
     * @param TemplateId 报表模板 1:综合分析报告 2:等保合规报告
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 包含资产 
     * @return AssetsList 包含资产
     */
    public AssetsInfo [] getAssetsList() {
        return this.AssetsList;
    }

    /**
     * Set 包含资产
     * @param AssetsList 包含资产
     */
    public void setAssetsList(AssetsInfo [] AssetsList) {
        this.AssetsList = AssetsList;
    }

    /**
     * Get 下次启动时间 
     * @return NextStartTime 下次启动时间
     */
    public Long getNextStartTime() {
        return this.NextStartTime;
    }

    /**
     * Set 下次启动时间
     * @param NextStartTime 下次启动时间
     */
    public void setNextStartTime(Long NextStartTime) {
        this.NextStartTime = NextStartTime;
    }

    /**
     * Get 任务状态 1:生成中 2:待生成3:已生成4:生成失败5:已暂停 
     * @return MissionStatus 任务状态 1:生成中 2:待生成3:已生成4:生成失败5:已暂停
     */
    public Long getMissionStatus() {
        return this.MissionStatus;
    }

    /**
     * Set 任务状态 1:生成中 2:待生成3:已生成4:生成失败5:已暂停
     * @param MissionStatus 任务状态 1:生成中 2:待生成3:已生成4:生成失败5:已暂停
     */
    public void setMissionStatus(Long MissionStatus) {
        this.MissionStatus = MissionStatus;
    }

    /**
     * Get 任务状态说明 仅生成中和生成失败有效 
     * @return MissionStatusMessage 任务状态说明 仅生成中和生成失败有效
     */
    public String getMissionStatusMessage() {
        return this.MissionStatusMessage;
    }

    /**
     * Set 任务状态说明 仅生成中和生成失败有效
     * @param MissionStatusMessage 任务状态说明 仅生成中和生成失败有效
     */
    public void setMissionStatusMessage(String MissionStatusMessage) {
        this.MissionStatusMessage = MissionStatusMessage;
    }

    /**
     * Get 已生成报表数 
     * @return ReportCount 已生成报表数
     */
    public Long getReportCount() {
        return this.ReportCount;
    }

    /**
     * Set 已生成报表数
     * @param ReportCount 已生成报表数
     */
    public void setReportCount(Long ReportCount) {
        this.ReportCount = ReportCount;
    }

    /**
     * Get 任务起停 1:关闭 2:开启 仅周期报表有效 
     * @return MissionStart 任务起停 1:关闭 2:开启 仅周期报表有效
     */
    public Long getMissionStart() {
        return this.MissionStart;
    }

    /**
     * Set 任务起停 1:关闭 2:开启 仅周期报表有效
     * @param MissionStart 任务起停 1:关闭 2:开启 仅周期报表有效
     */
    public void setMissionStart(Long MissionStart) {
        this.MissionStart = MissionStart;
    }

    /**
     * Get 统计周期 1:24小时 7:近一周 30:近30天 90:近90天 180: 
     * @return CntDay 统计周期 1:24小时 7:近一周 30:近30天 90:近90天 180:
     */
    public Long getCntDay() {
        return this.CntDay;
    }

    /**
     * Set 统计周期 1:24小时 7:近一周 30:近30天 90:近90天 180:
     * @param CntDay 统计周期 1:24小时 7:近一周 30:近30天 90:近90天 180:
     */
    public void setCntDay(Long CntDay) {
        this.CntDay = CntDay;
    }

    /**
     * Get 重复周期 1:每天 2:每周 3:每月 
     * @return CntCycle 重复周期 1:每天 2:每周 3:每月
     */
    public Long getCntCycle() {
        return this.CntCycle;
    }

    /**
     * Set 重复周期 1:每天 2:每周 3:每月
     * @param CntCycle 重复周期 1:每天 2:每周 3:每月
     */
    public void setCntCycle(Long CntCycle) {
        this.CntCycle = CntCycle;
    }

    /**
     * Get 执行日期 重复周期为天：无意义 周：星期几 1-7  月每月 
     * @return CntTime 执行日期 重复周期为天：无意义 周：星期几 1-7  月每月
     */
    public Long getCntTime() {
        return this.CntTime;
    }

    /**
     * Set 执行日期 重复周期为天：无意义 周：星期几 1-7  月每月
     * @param CntTime 执行日期 重复周期为天：无意义 周：星期几 1-7  月每月
     */
    public void setCntTime(Long CntTime) {
        this.CntTime = CntTime;
    }

    /**
     * Get 执行时间 格式15:04 到分钟 
     * @return CntDate 执行时间 格式15:04 到分钟
     */
    public String getCntDate() {
        return this.CntDate;
    }

    /**
     * Set 执行时间 格式15:04 到分钟
     * @param CntDate 执行时间 格式15:04 到分钟
     */
    public void setCntDate(String CntDate) {
        this.CntDate = CntDate;
    }

    /**
     * Get 创建者 0:内置 其余存放用户(uin) 
     * @return Receivers 创建者 0:内置 其余存放用户(uin)
     */
    public String getReceivers() {
        return this.Receivers;
    }

    /**
     * Set 创建者 0:内置 其余存放用户(uin)
     * @param Receivers 创建者 0:内置 其余存放用户(uin)
     */
    public void setReceivers(String Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get Notification  int  1关闭 2开启 不变更为0 
     * @return Notification Notification  int  1关闭 2开启 不变更为0
     */
    public Long getNotification() {
        return this.Notification;
    }

    /**
     * Set Notification  int  1关闭 2开启 不变更为0
     * @param Notification Notification  int  1关闭 2开启 不变更为0
     */
    public void setNotification(Long Notification) {
        this.Notification = Notification;
    }

    public ReportMission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportMission(ReportMission source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TplName != null) {
            this.TplName = new String(source.TplName);
        }
        if (source.ReportType != null) {
            this.ReportType = new Long(source.ReportType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.AssetsList != null) {
            this.AssetsList = new AssetsInfo[source.AssetsList.length];
            for (int i = 0; i < source.AssetsList.length; i++) {
                this.AssetsList[i] = new AssetsInfo(source.AssetsList[i]);
            }
        }
        if (source.NextStartTime != null) {
            this.NextStartTime = new Long(source.NextStartTime);
        }
        if (source.MissionStatus != null) {
            this.MissionStatus = new Long(source.MissionStatus);
        }
        if (source.MissionStatusMessage != null) {
            this.MissionStatusMessage = new String(source.MissionStatusMessage);
        }
        if (source.ReportCount != null) {
            this.ReportCount = new Long(source.ReportCount);
        }
        if (source.MissionStart != null) {
            this.MissionStart = new Long(source.MissionStart);
        }
        if (source.CntDay != null) {
            this.CntDay = new Long(source.CntDay);
        }
        if (source.CntCycle != null) {
            this.CntCycle = new Long(source.CntCycle);
        }
        if (source.CntTime != null) {
            this.CntTime = new Long(source.CntTime);
        }
        if (source.CntDate != null) {
            this.CntDate = new String(source.CntDate);
        }
        if (source.Receivers != null) {
            this.Receivers = new String(source.Receivers);
        }
        if (source.Notification != null) {
            this.Notification = new Long(source.Notification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TplName", this.TplName);
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArrayObj(map, prefix + "AssetsList.", this.AssetsList);
        this.setParamSimple(map, prefix + "NextStartTime", this.NextStartTime);
        this.setParamSimple(map, prefix + "MissionStatus", this.MissionStatus);
        this.setParamSimple(map, prefix + "MissionStatusMessage", this.MissionStatusMessage);
        this.setParamSimple(map, prefix + "ReportCount", this.ReportCount);
        this.setParamSimple(map, prefix + "MissionStart", this.MissionStart);
        this.setParamSimple(map, prefix + "CntDay", this.CntDay);
        this.setParamSimple(map, prefix + "CntCycle", this.CntCycle);
        this.setParamSimple(map, prefix + "CntTime", this.CntTime);
        this.setParamSimple(map, prefix + "CntDate", this.CntDate);
        this.setParamSimple(map, prefix + "Receivers", this.Receivers);
        this.setParamSimple(map, prefix + "Notification", this.Notification);

    }
}

