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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogExport extends AbstractModel{

    /**
    * 日志导出路径
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
    * 日志导出数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 日志导出任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 日志导出任务ID
    */
    @SerializedName("ExportID")
    @Expose
    private String ExportID;

    /**
    * 日志导出文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 日志文件大小
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 日志导出格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 日志导出时间排序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 日志导出查询语句
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 日志导出起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 日志导出结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 日志下载状态。Queuing:导出正在排队中，Processing:导出正在进行中，Complete:导出完成，Failed:导出失败，Expired:日志导出已过期（三天有效期）。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 日志导出路径 
     * @return CosPath 日志导出路径
     */
    public String getCosPath() {
        return this.CosPath;
    }

    /**
     * Set 日志导出路径
     * @param CosPath 日志导出路径
     */
    public void setCosPath(String CosPath) {
        this.CosPath = CosPath;
    }

    /**
     * Get 日志导出数量 
     * @return Count 日志导出数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 日志导出数量
     * @param Count 日志导出数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 日志导出任务创建时间 
     * @return CreateTime 日志导出任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 日志导出任务创建时间
     * @param CreateTime 日志导出任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 日志导出任务ID 
     * @return ExportID 日志导出任务ID
     */
    public String getExportID() {
        return this.ExportID;
    }

    /**
     * Set 日志导出任务ID
     * @param ExportID 日志导出任务ID
     */
    public void setExportID(String ExportID) {
        this.ExportID = ExportID;
    }

    /**
     * Get 日志导出文件名 
     * @return FileName 日志导出文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 日志导出文件名
     * @param FileName 日志导出文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 日志文件大小 
     * @return FileSize 日志文件大小
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 日志文件大小
     * @param FileSize 日志文件大小
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 日志导出格式 
     * @return Format 日志导出格式
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 日志导出格式
     * @param Format 日志导出格式
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 日志导出时间排序 
     * @return Order 日志导出时间排序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 日志导出时间排序
     * @param Order 日志导出时间排序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 日志导出查询语句 
     * @return Query 日志导出查询语句
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 日志导出查询语句
     * @param Query 日志导出查询语句
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 日志导出起始时间 
     * @return StartTime 日志导出起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 日志导出起始时间
     * @param StartTime 日志导出起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 日志导出结束时间 
     * @return EndTime 日志导出结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 日志导出结束时间
     * @param EndTime 日志导出结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 日志下载状态。Queuing:导出正在排队中，Processing:导出正在进行中，Complete:导出完成，Failed:导出失败，Expired:日志导出已过期（三天有效期）。 
     * @return Status 日志下载状态。Queuing:导出正在排队中，Processing:导出正在进行中，Complete:导出完成，Failed:导出失败，Expired:日志导出已过期（三天有效期）。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 日志下载状态。Queuing:导出正在排队中，Processing:导出正在进行中，Complete:导出完成，Failed:导出失败，Expired:日志导出已过期（三天有效期）。
     * @param Status 日志下载状态。Queuing:导出正在排队中，Processing:导出正在进行中，Complete:导出完成，Failed:导出失败，Expired:日志导出已过期（三天有效期）。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public LogExport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogExport(LogExport source) {
        if (source.CosPath != null) {
            this.CosPath = new String(source.CosPath);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExportID != null) {
            this.ExportID = new String(source.ExportID);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosPath", this.CosPath);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExportID", this.ExportID);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

