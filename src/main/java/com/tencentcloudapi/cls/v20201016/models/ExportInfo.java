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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportInfo extends AbstractModel {

    /**
    * <p>日志主题ID</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>日志导出任务ID</p>
    */
    @SerializedName("ExportId")
    @Expose
    private String ExportId;

    /**
    * <p>日志导出查询语句</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>日志导出文件名</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>日志文件大小</p><p>单位：Byte</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * <p>日志导出时间排序</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>日志导出格式</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>日志导出数量</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>日志下载状态。Processing:导出正在进行中，Completed:导出完成，Failed:导出失败，Expired:日志导出已过期(三天有效期), Queuing 排队中</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>日志导出起始时间，毫秒时间戳</p>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>日志导出结束时间，毫秒时间戳</p>
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * <p>日志导出路径,有效期一个小时，请尽快使用该路径下载。</p>
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
    * <p>日志导出创建时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>语法规则。 默认值为0。<br>0：Lucene语法，1：CQL语法。</p>
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
    * <p>导出字段</p>
    */
    @SerializedName("DerivedFields")
    @Expose
    private String [] DerivedFields;

    /**
     * Get <p>日志主题ID</p> 
     * @return TopicId <p>日志主题ID</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题ID</p>
     * @param TopicId <p>日志主题ID</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>日志导出任务ID</p> 
     * @return ExportId <p>日志导出任务ID</p>
     */
    public String getExportId() {
        return this.ExportId;
    }

    /**
     * Set <p>日志导出任务ID</p>
     * @param ExportId <p>日志导出任务ID</p>
     */
    public void setExportId(String ExportId) {
        this.ExportId = ExportId;
    }

    /**
     * Get <p>日志导出查询语句</p> 
     * @return Query <p>日志导出查询语句</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>日志导出查询语句</p>
     * @param Query <p>日志导出查询语句</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>日志导出文件名</p> 
     * @return FileName <p>日志导出文件名</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>日志导出文件名</p>
     * @param FileName <p>日志导出文件名</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>日志文件大小</p><p>单位：Byte</p> 
     * @return FileSize <p>日志文件大小</p><p>单位：Byte</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>日志文件大小</p><p>单位：Byte</p>
     * @param FileSize <p>日志文件大小</p><p>单位：Byte</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>日志导出时间排序</p> 
     * @return Order <p>日志导出时间排序</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>日志导出时间排序</p>
     * @param Order <p>日志导出时间排序</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>日志导出格式</p> 
     * @return Format <p>日志导出格式</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>日志导出格式</p>
     * @param Format <p>日志导出格式</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>日志导出数量</p> 
     * @return Count <p>日志导出数量</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>日志导出数量</p>
     * @param Count <p>日志导出数量</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>日志下载状态。Processing:导出正在进行中，Completed:导出完成，Failed:导出失败，Expired:日志导出已过期(三天有效期), Queuing 排队中</p> 
     * @return Status <p>日志下载状态。Processing:导出正在进行中，Completed:导出完成，Failed:导出失败，Expired:日志导出已过期(三天有效期), Queuing 排队中</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>日志下载状态。Processing:导出正在进行中，Completed:导出完成，Failed:导出失败，Expired:日志导出已过期(三天有效期), Queuing 排队中</p>
     * @param Status <p>日志下载状态。Processing:导出正在进行中，Completed:导出完成，Failed:导出失败，Expired:日志导出已过期(三天有效期), Queuing 排队中</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>日志导出起始时间，毫秒时间戳</p> 
     * @return From <p>日志导出起始时间，毫秒时间戳</p>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>日志导出起始时间，毫秒时间戳</p>
     * @param From <p>日志导出起始时间，毫秒时间戳</p>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>日志导出结束时间，毫秒时间戳</p> 
     * @return To <p>日志导出结束时间，毫秒时间戳</p>
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set <p>日志导出结束时间，毫秒时间戳</p>
     * @param To <p>日志导出结束时间，毫秒时间戳</p>
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get <p>日志导出路径,有效期一个小时，请尽快使用该路径下载。</p> 
     * @return CosPath <p>日志导出路径,有效期一个小时，请尽快使用该路径下载。</p>
     */
    public String getCosPath() {
        return this.CosPath;
    }

    /**
     * Set <p>日志导出路径,有效期一个小时，请尽快使用该路径下载。</p>
     * @param CosPath <p>日志导出路径,有效期一个小时，请尽快使用该路径下载。</p>
     */
    public void setCosPath(String CosPath) {
        this.CosPath = CosPath;
    }

    /**
     * Get <p>日志导出创建时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p> 
     * @return CreateTime <p>日志导出创建时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>日志导出创建时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
     * @param CreateTime <p>日志导出创建时间<br>时间格式：yyyy-MM-dd HH:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>语法规则。 默认值为0。<br>0：Lucene语法，1：CQL语法。</p> 
     * @return SyntaxRule <p>语法规则。 默认值为0。<br>0：Lucene语法，1：CQL语法。</p>
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set <p>语法规则。 默认值为0。<br>0：Lucene语法，1：CQL语法。</p>
     * @param SyntaxRule <p>语法规则。 默认值为0。<br>0：Lucene语法，1：CQL语法。</p>
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    /**
     * Get <p>导出字段</p> 
     * @return DerivedFields <p>导出字段</p>
     */
    public String [] getDerivedFields() {
        return this.DerivedFields;
    }

    /**
     * Set <p>导出字段</p>
     * @param DerivedFields <p>导出字段</p>
     */
    public void setDerivedFields(String [] DerivedFields) {
        this.DerivedFields = DerivedFields;
    }

    public ExportInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportInfo(ExportInfo source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
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
        if (source.SyntaxRule != null) {
            this.SyntaxRule = new Long(source.SyntaxRule);
        }
        if (source.DerivedFields != null) {
            this.DerivedFields = new String[source.DerivedFields.length];
            for (int i = 0; i < source.DerivedFields.length; i++) {
                this.DerivedFields[i] = new String(source.DerivedFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
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
        this.setParamSimple(map, prefix + "SyntaxRule", this.SyntaxRule);
        this.setParamArraySimple(map, prefix + "DerivedFields.", this.DerivedFields);

    }
}

