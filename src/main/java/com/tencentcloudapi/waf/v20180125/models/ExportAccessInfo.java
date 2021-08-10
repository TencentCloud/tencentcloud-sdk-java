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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportAccessInfo extends AbstractModel{

    /**
    * 日志导出任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExportId")
    @Expose
    private String ExportId;

    /**
    * 日志导出查询语句
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 日志导出文件名
注意：此字段可能返回 null，表示取不到有效值。
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
    * 日志导出时间排序
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 日志导出格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 日志导出数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 日志下载状态。Processing:导出正在进行中，Complete:导出完成，Failed:导出失败，Expired:日志导出已过期（三天有效期）
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 日志导出起始时间
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * 日志导出结束时间
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * 日志导出路径
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
    * 日志导出创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 日志导出任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExportId 日志导出任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExportId() {
        return this.ExportId;
    }

    /**
     * Set 日志导出任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExportId 日志导出任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExportId(String ExportId) {
        this.ExportId = ExportId;
    }

    /**
     * Get 日志导出查询语句
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Query 日志导出查询语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 日志导出查询语句
注意：此字段可能返回 null，表示取不到有效值。
     * @param Query 日志导出查询语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 日志导出文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 日志导出文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 日志导出文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 日志导出文件名
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 日志导出时间排序
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Order 日志导出时间排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 日志导出时间排序
注意：此字段可能返回 null，表示取不到有效值。
     * @param Order 日志导出时间排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 日志导出格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Format 日志导出格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 日志导出格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Format 日志导出格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 日志导出数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 日志导出数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 日志导出数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 日志导出数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 日志下载状态。Processing:导出正在进行中，Complete:导出完成，Failed:导出失败，Expired:日志导出已过期（三天有效期） 
     * @return Status 日志下载状态。Processing:导出正在进行中，Complete:导出完成，Failed:导出失败，Expired:日志导出已过期（三天有效期）
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 日志下载状态。Processing:导出正在进行中，Complete:导出完成，Failed:导出失败，Expired:日志导出已过期（三天有效期）
     * @param Status 日志下载状态。Processing:导出正在进行中，Complete:导出完成，Failed:导出失败，Expired:日志导出已过期（三天有效期）
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 日志导出起始时间 
     * @return From 日志导出起始时间
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set 日志导出起始时间
     * @param From 日志导出起始时间
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get 日志导出结束时间 
     * @return To 日志导出结束时间
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set 日志导出结束时间
     * @param To 日志导出结束时间
     */
    public void setTo(Long To) {
        this.To = To;
    }

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
     * Get 日志导出创建时间 
     * @return CreateTime 日志导出创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 日志导出创建时间
     * @param CreateTime 日志导出创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ExportAccessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportAccessInfo(ExportAccessInfo source) {
        if (source.ExportId != null) {
            this.ExportId = new String(source.ExportId);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.CosPath != null) {
            this.CosPath = new String(source.CosPath);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExportId", this.ExportId);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "CosPath", this.CosPath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

