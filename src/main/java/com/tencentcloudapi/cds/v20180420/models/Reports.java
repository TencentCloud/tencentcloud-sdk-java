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

public class Reports extends AbstractModel {

    /**
    * 生成时间
    */
    @SerializedName("AddTime")
    @Expose
    private Long AddTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 报告 ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 审计 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * 是否已删除
    */
    @SerializedName("IsDelete")
    @Expose
    private Long IsDelete;

    /**
    * 发送目标
    */
    @SerializedName("Receivers")
    @Expose
    private String Receivers;

    /**
    * 报告说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 报告文件
    */
    @SerializedName("ReportFile")
    @Expose
    private String ReportFile;

    /**
    * 状态
    */
    @SerializedName("ReportStatus")
    @Expose
    private Long ReportStatus;

    /**
    * 状态
    */
    @SerializedName("ReportTmpStatus")
    @Expose
    private Long ReportTmpStatus;

    /**
    * 报告类型
    */
    @SerializedName("ReportType")
    @Expose
    private Long ReportType;

    /**
    * 发送结果
    */
    @SerializedName("SendResult")
    @Expose
    private String SendResult;

    /**
    * 发送类型
    */
    @SerializedName("SendType")
    @Expose
    private String SendType;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 报告名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 报表模板
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
    * 时间范围 1:24小时 7:近一周 30:近30天 90:近90天 180:近180天 不变更为0
    */
    @SerializedName("CntDay")
    @Expose
    private Long CntDay;

    /**
     * Get 生成时间 
     * @return AddTime 生成时间
     */
    public Long getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 生成时间
     * @param AddTime 生成时间
     */
    public void setAddTime(Long AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 报告 ID 
     * @return Id 报告 ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 报告 ID
     * @param Id 报告 ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 审计 ID 
     * @return InstanceId 审计 ID
     */
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 审计 ID
     * @param InstanceId 审计 ID
     */
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 是否已删除 
     * @return IsDelete 是否已删除
     */
    public Long getIsDelete() {
        return this.IsDelete;
    }

    /**
     * Set 是否已删除
     * @param IsDelete 是否已删除
     */
    public void setIsDelete(Long IsDelete) {
        this.IsDelete = IsDelete;
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
     * Get 报告文件 
     * @return ReportFile 报告文件
     */
    public String getReportFile() {
        return this.ReportFile;
    }

    /**
     * Set 报告文件
     * @param ReportFile 报告文件
     */
    public void setReportFile(String ReportFile) {
        this.ReportFile = ReportFile;
    }

    /**
     * Get 状态 
     * @return ReportStatus 状态
     */
    public Long getReportStatus() {
        return this.ReportStatus;
    }

    /**
     * Set 状态
     * @param ReportStatus 状态
     */
    public void setReportStatus(Long ReportStatus) {
        this.ReportStatus = ReportStatus;
    }

    /**
     * Get 状态 
     * @return ReportTmpStatus 状态
     */
    public Long getReportTmpStatus() {
        return this.ReportTmpStatus;
    }

    /**
     * Set 状态
     * @param ReportTmpStatus 状态
     */
    public void setReportTmpStatus(Long ReportTmpStatus) {
        this.ReportTmpStatus = ReportTmpStatus;
    }

    /**
     * Get 报告类型 
     * @return ReportType 报告类型
     */
    public Long getReportType() {
        return this.ReportType;
    }

    /**
     * Set 报告类型
     * @param ReportType 报告类型
     */
    public void setReportType(Long ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get 发送结果 
     * @return SendResult 发送结果
     */
    public String getSendResult() {
        return this.SendResult;
    }

    /**
     * Set 发送结果
     * @param SendResult 发送结果
     */
    public void setSendResult(String SendResult) {
        this.SendResult = SendResult;
    }

    /**
     * Get 发送类型 
     * @return SendType 发送类型
     */
    public String getSendType() {
        return this.SendType;
    }

    /**
     * Set 发送类型
     * @param SendType 发送类型
     */
    public void setSendType(String SendType) {
        this.SendType = SendType;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 报告名称 
     * @return Title 报告名称
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 报告名称
     * @param Title 报告名称
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 报表模板 
     * @return TemplateId 报表模板
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 报表模板
     * @param TemplateId 报表模板
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

    public Reports() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Reports(Reports source) {
        if (source.AddTime != null) {
            this.AddTime = new Long(source.AddTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.IsDelete != null) {
            this.IsDelete = new Long(source.IsDelete);
        }
        if (source.Receivers != null) {
            this.Receivers = new String(source.Receivers);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ReportFile != null) {
            this.ReportFile = new String(source.ReportFile);
        }
        if (source.ReportStatus != null) {
            this.ReportStatus = new Long(source.ReportStatus);
        }
        if (source.ReportTmpStatus != null) {
            this.ReportTmpStatus = new Long(source.ReportTmpStatus);
        }
        if (source.ReportType != null) {
            this.ReportType = new Long(source.ReportType);
        }
        if (source.SendResult != null) {
            this.SendResult = new String(source.SendResult);
        }
        if (source.SendType != null) {
            this.SendType = new String(source.SendType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
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
        if (source.CntDay != null) {
            this.CntDay = new Long(source.CntDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IsDelete", this.IsDelete);
        this.setParamSimple(map, prefix + "Receivers", this.Receivers);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ReportFile", this.ReportFile);
        this.setParamSimple(map, prefix + "ReportStatus", this.ReportStatus);
        this.setParamSimple(map, prefix + "ReportTmpStatus", this.ReportTmpStatus);
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamSimple(map, prefix + "SendResult", this.SendResult);
        this.setParamSimple(map, prefix + "SendType", this.SendType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArrayObj(map, prefix + "AssetsList.", this.AssetsList);
        this.setParamSimple(map, prefix + "CntDay", this.CntDay);

    }
}

