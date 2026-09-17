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
    * <p>任务名称 不变更为&quot;&quot;</p>
    */
    @SerializedName("TplName")
    @Expose
    private String TplName;

    /**
    * <p>执行日期 重复周期为天：无意义周：星期几1-7月每月几号 1-31</p>
    */
    @SerializedName("CntTime")
    @Expose
    private Long CntTime;

    /**
    * <p>重复周期</p>
    */
    @SerializedName("CntCycle")
    @Expose
    private Long CntCycle;

    /**
    * <p>发送目标</p>
    */
    @SerializedName("Receivers")
    @Expose
    private String Receivers;

    /**
    * <p>时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0</p>
    */
    @SerializedName("CntDay")
    @Expose
    private Long CntDay;

    /**
    * <p>执行时间 格式15:04 到分钟</p>
    */
    @SerializedName("CntDate")
    @Expose
    private String CntDate;

    /**
    * <p>报告说明</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>模板Id</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * <p>报表类型</p>
    */
    @SerializedName("ReportType")
    @Expose
    private Long ReportType;

    /**
    * <p>关联的资产数组</p>
    */
    @SerializedName("AssetsId")
    @Expose
    private Long [] AssetsId;

    /**
    * <p>报表通知 1关闭 2开启 不变更为0</p>
    */
    @SerializedName("Notification")
    @Expose
    private Long Notification;

    /**
    * <p>任务起停 1:关闭 2:开启 单次报表默认为2</p>
    */
    @SerializedName("MissionStart")
    @Expose
    private Long MissionStart;

    /**
     * Get <p>任务名称 不变更为&quot;&quot;</p> 
     * @return TplName <p>任务名称 不变更为&quot;&quot;</p>
     */
    public String getTplName() {
        return this.TplName;
    }

    /**
     * Set <p>任务名称 不变更为&quot;&quot;</p>
     * @param TplName <p>任务名称 不变更为&quot;&quot;</p>
     */
    public void setTplName(String TplName) {
        this.TplName = TplName;
    }

    /**
     * Get <p>执行日期 重复周期为天：无意义周：星期几1-7月每月几号 1-31</p> 
     * @return CntTime <p>执行日期 重复周期为天：无意义周：星期几1-7月每月几号 1-31</p>
     */
    public Long getCntTime() {
        return this.CntTime;
    }

    /**
     * Set <p>执行日期 重复周期为天：无意义周：星期几1-7月每月几号 1-31</p>
     * @param CntTime <p>执行日期 重复周期为天：无意义周：星期几1-7月每月几号 1-31</p>
     */
    public void setCntTime(Long CntTime) {
        this.CntTime = CntTime;
    }

    /**
     * Get <p>重复周期</p> 
     * @return CntCycle <p>重复周期</p>
     */
    public Long getCntCycle() {
        return this.CntCycle;
    }

    /**
     * Set <p>重复周期</p>
     * @param CntCycle <p>重复周期</p>
     */
    public void setCntCycle(Long CntCycle) {
        this.CntCycle = CntCycle;
    }

    /**
     * Get <p>发送目标</p> 
     * @return Receivers <p>发送目标</p>
     */
    public String getReceivers() {
        return this.Receivers;
    }

    /**
     * Set <p>发送目标</p>
     * @param Receivers <p>发送目标</p>
     */
    public void setReceivers(String Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get <p>时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0</p> 
     * @return CntDay <p>时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0</p>
     */
    public Long getCntDay() {
        return this.CntDay;
    }

    /**
     * Set <p>时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0</p>
     * @param CntDay <p>时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0</p>
     */
    public void setCntDay(Long CntDay) {
        this.CntDay = CntDay;
    }

    /**
     * Get <p>执行时间 格式15:04 到分钟</p> 
     * @return CntDate <p>执行时间 格式15:04 到分钟</p>
     */
    public String getCntDate() {
        return this.CntDate;
    }

    /**
     * Set <p>执行时间 格式15:04 到分钟</p>
     * @param CntDate <p>执行时间 格式15:04 到分钟</p>
     */
    public void setCntDate(String CntDate) {
        this.CntDate = CntDate;
    }

    /**
     * Get <p>报告说明</p> 
     * @return Remark <p>报告说明</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>报告说明</p>
     * @param Remark <p>报告说明</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>模板Id</p> 
     * @return TemplateId <p>模板Id</p>
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模板Id</p>
     * @param TemplateId <p>模板Id</p>
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>报表类型</p> 
     * @return ReportType <p>报表类型</p>
     */
    public Long getReportType() {
        return this.ReportType;
    }

    /**
     * Set <p>报表类型</p>
     * @param ReportType <p>报表类型</p>
     */
    public void setReportType(Long ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get <p>关联的资产数组</p> 
     * @return AssetsId <p>关联的资产数组</p>
     */
    public Long [] getAssetsId() {
        return this.AssetsId;
    }

    /**
     * Set <p>关联的资产数组</p>
     * @param AssetsId <p>关联的资产数组</p>
     */
    public void setAssetsId(Long [] AssetsId) {
        this.AssetsId = AssetsId;
    }

    /**
     * Get <p>报表通知 1关闭 2开启 不变更为0</p> 
     * @return Notification <p>报表通知 1关闭 2开启 不变更为0</p>
     */
    public Long getNotification() {
        return this.Notification;
    }

    /**
     * Set <p>报表通知 1关闭 2开启 不变更为0</p>
     * @param Notification <p>报表通知 1关闭 2开启 不变更为0</p>
     */
    public void setNotification(Long Notification) {
        this.Notification = Notification;
    }

    /**
     * Get <p>任务起停 1:关闭 2:开启 单次报表默认为2</p> 
     * @return MissionStart <p>任务起停 1:关闭 2:开启 单次报表默认为2</p>
     */
    public Long getMissionStart() {
        return this.MissionStart;
    }

    /**
     * Set <p>任务起停 1:关闭 2:开启 单次报表默认为2</p>
     * @param MissionStart <p>任务起停 1:关闭 2:开启 单次报表默认为2</p>
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

