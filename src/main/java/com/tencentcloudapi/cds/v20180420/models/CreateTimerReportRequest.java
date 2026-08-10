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

public class CreateTimerReportRequest extends AbstractModel {

    /**
    * 任务名称 不变更为""
    */
    @SerializedName("TplName")
    @Expose
    private String TplName;

    /**
    * 执行日期 重复周期为天：无意义周：星期几1-7月每月几号 1-31
    */
    @SerializedName("CntTime")
    @Expose
    private Long CntTime;

    /**
    * 重复周期
    */
    @SerializedName("CntCycle")
    @Expose
    private Long CntCycle;

    /**
    * 发送目标
    */
    @SerializedName("Receivers")
    @Expose
    private String Receivers;

    /**
    * 时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0
    */
    @SerializedName("CntDay")
    @Expose
    private Long CntDay;

    /**
    * 执行时间 格式15:04 到分钟
    */
    @SerializedName("CntDate")
    @Expose
    private String CntDate;

    /**
    * 报告说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 模版Id
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 报表类型
    */
    @SerializedName("ReportType")
    @Expose
    private Long ReportType;

    /**
    * 关联的资产数组
    */
    @SerializedName("AssetsId")
    @Expose
    private Long [] AssetsId;

    /**
    * 报表通知 1关闭 2开启 不变更为0
    */
    @SerializedName("Notification")
    @Expose
    private Long Notification;

    /**
    * 任务起停 1:关闭 2:开启 单次报表默认为2
    */
    @SerializedName("MissionStart")
    @Expose
    private Long MissionStart;

    /**
     * Get 任务名称 不变更为"" 
     * @return TplName 任务名称 不变更为""
     */
    public String getTplName() {
        return this.TplName;
    }

    /**
     * Set 任务名称 不变更为""
     * @param TplName 任务名称 不变更为""
     */
    public void setTplName(String TplName) {
        this.TplName = TplName;
    }

    /**
     * Get 执行日期 重复周期为天：无意义周：星期几1-7月每月几号 1-31 
     * @return CntTime 执行日期 重复周期为天：无意义周：星期几1-7月每月几号 1-31
     */
    public Long getCntTime() {
        return this.CntTime;
    }

    /**
     * Set 执行日期 重复周期为天：无意义周：星期几1-7月每月几号 1-31
     * @param CntTime 执行日期 重复周期为天：无意义周：星期几1-7月每月几号 1-31
     */
    public void setCntTime(Long CntTime) {
        this.CntTime = CntTime;
    }

    /**
     * Get 重复周期 
     * @return CntCycle 重复周期
     */
    public Long getCntCycle() {
        return this.CntCycle;
    }

    /**
     * Set 重复周期
     * @param CntCycle 重复周期
     */
    public void setCntCycle(Long CntCycle) {
        this.CntCycle = CntCycle;
    }

    /**
     * Get 发送目标 
     * @return Receivers 发送目标
     */
    public String getReceivers() {
        return this.Receivers;
    }

    /**
     * Set 发送目标
     * @param Receivers 发送目标
     */
    public void setReceivers(String Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get 时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0 
     * @return CntDay 时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0
     */
    public Long getCntDay() {
        return this.CntDay;
    }

    /**
     * Set 时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0
     * @param CntDay 时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0
     */
    public void setCntDay(Long CntDay) {
        this.CntDay = CntDay;
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
     * Get 模版Id 
     * @return TemplateId 模版Id
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模版Id
     * @param TemplateId 模版Id
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 报表类型 
     * @return ReportType 报表类型
     */
    public Long getReportType() {
        return this.ReportType;
    }

    /**
     * Set 报表类型
     * @param ReportType 报表类型
     */
    public void setReportType(Long ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get 关联的资产数组 
     * @return AssetsId 关联的资产数组
     */
    public Long [] getAssetsId() {
        return this.AssetsId;
    }

    /**
     * Set 关联的资产数组
     * @param AssetsId 关联的资产数组
     */
    public void setAssetsId(Long [] AssetsId) {
        this.AssetsId = AssetsId;
    }

    /**
     * Get 报表通知 1关闭 2开启 不变更为0 
     * @return Notification 报表通知 1关闭 2开启 不变更为0
     */
    public Long getNotification() {
        return this.Notification;
    }

    /**
     * Set 报表通知 1关闭 2开启 不变更为0
     * @param Notification 报表通知 1关闭 2开启 不变更为0
     */
    public void setNotification(Long Notification) {
        this.Notification = Notification;
    }

    /**
     * Get 任务起停 1:关闭 2:开启 单次报表默认为2 
     * @return MissionStart 任务起停 1:关闭 2:开启 单次报表默认为2
     */
    public Long getMissionStart() {
        return this.MissionStart;
    }

    /**
     * Set 任务起停 1:关闭 2:开启 单次报表默认为2
     * @param MissionStart 任务起停 1:关闭 2:开启 单次报表默认为2
     */
    public void setMissionStart(Long MissionStart) {
        this.MissionStart = MissionStart;
    }

    public CreateTimerReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTimerReportRequest(CreateTimerReportRequest source) {
        if (source.TplName != null) {
            this.TplName = new String(source.TplName);
        }
        if (source.CntTime != null) {
            this.CntTime = new Long(source.CntTime);
        }
        if (source.CntCycle != null) {
            this.CntCycle = new Long(source.CntCycle);
        }
        if (source.Receivers != null) {
            this.Receivers = new String(source.Receivers);
        }
        if (source.CntDay != null) {
            this.CntDay = new Long(source.CntDay);
        }
        if (source.CntDate != null) {
            this.CntDate = new String(source.CntDate);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.ReportType != null) {
            this.ReportType = new Long(source.ReportType);
        }
        if (source.AssetsId != null) {
            this.AssetsId = new Long[source.AssetsId.length];
            for (int i = 0; i < source.AssetsId.length; i++) {
                this.AssetsId[i] = new Long(source.AssetsId[i]);
            }
        }
        if (source.Notification != null) {
            this.Notification = new Long(source.Notification);
        }
        if (source.MissionStart != null) {
            this.MissionStart = new Long(source.MissionStart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TplName", this.TplName);
        this.setParamSimple(map, prefix + "CntTime", this.CntTime);
        this.setParamSimple(map, prefix + "CntCycle", this.CntCycle);
        this.setParamSimple(map, prefix + "Receivers", this.Receivers);
        this.setParamSimple(map, prefix + "CntDay", this.CntDay);
        this.setParamSimple(map, prefix + "CntDate", this.CntDate);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamArraySimple(map, prefix + "AssetsId.", this.AssetsId);
        this.setParamSimple(map, prefix + "Notification", this.Notification);
        this.setParamSimple(map, prefix + "MissionStart", this.MissionStart);

    }
}

