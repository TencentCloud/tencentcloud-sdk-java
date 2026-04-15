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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddRecordBackupTemplateData extends AbstractModel {

    /**
    * <p>模板ID</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>模板名称</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>上云时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）</p>
    */
    @SerializedName("TimeSections")
    @Expose
    private RecordTemplateTimeSections [] TimeSections;

    /**
    * <p>录像时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）</p>
    */
    @SerializedName("DevTimeSections")
    @Expose
    private RecordTemplateTimeSections [] DevTimeSections;

    /**
    * <p>上云倍速（支持1，2，4倍速）</p>
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateAt")
    @Expose
    private String UpdateAt;

    /**
    * <p>周期偏移量，默认1，表示拉取昨天的设备录像，0表示取去今天的设备录像，3表示拉取前天的设备录像</p><p>默认值：1</p>
    */
    @SerializedName("DayOffset")
    @Expose
    private Long DayOffset;

    /**
     * Get <p>模板ID</p> 
     * @return TemplateId <p>模板ID</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模板ID</p>
     * @param TemplateId <p>模板ID</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>模板名称</p> 
     * @return TemplateName <p>模板名称</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>模板名称</p>
     * @param TemplateName <p>模板名称</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>上云时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）</p> 
     * @return TimeSections <p>上云时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）</p>
     */
    public RecordTemplateTimeSections [] getTimeSections() {
        return this.TimeSections;
    }

    /**
     * Set <p>上云时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）</p>
     * @param TimeSections <p>上云时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）</p>
     */
    public void setTimeSections(RecordTemplateTimeSections [] TimeSections) {
        this.TimeSections = TimeSections;
    }

    /**
     * Get <p>录像时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）</p> 
     * @return DevTimeSections <p>录像时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）</p>
     */
    public RecordTemplateTimeSections [] getDevTimeSections() {
        return this.DevTimeSections;
    }

    /**
     * Set <p>录像时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）</p>
     * @param DevTimeSections <p>录像时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）</p>
     */
    public void setDevTimeSections(RecordTemplateTimeSections [] DevTimeSections) {
        this.DevTimeSections = DevTimeSections;
    }

    /**
     * Get <p>上云倍速（支持1，2，4倍速）</p> 
     * @return Scale <p>上云倍速（支持1，2，4倍速）</p>
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set <p>上云倍速（支持1，2，4倍速）</p>
     * @param Scale <p>上云倍速（支持1，2，4倍速）</p>
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateAt <p>创建时间</p>
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateAt <p>创建时间</p>
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateAt <p>更新时间</p>
     */
    public String getUpdateAt() {
        return this.UpdateAt;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateAt <p>更新时间</p>
     */
    public void setUpdateAt(String UpdateAt) {
        this.UpdateAt = UpdateAt;
    }

    /**
     * Get <p>周期偏移量，默认1，表示拉取昨天的设备录像，0表示取去今天的设备录像，3表示拉取前天的设备录像</p><p>默认值：1</p> 
     * @return DayOffset <p>周期偏移量，默认1，表示拉取昨天的设备录像，0表示取去今天的设备录像，3表示拉取前天的设备录像</p><p>默认值：1</p>
     */
    public Long getDayOffset() {
        return this.DayOffset;
    }

    /**
     * Set <p>周期偏移量，默认1，表示拉取昨天的设备录像，0表示取去今天的设备录像，3表示拉取前天的设备录像</p><p>默认值：1</p>
     * @param DayOffset <p>周期偏移量，默认1，表示拉取昨天的设备录像，0表示取去今天的设备录像，3表示拉取前天的设备录像</p><p>默认值：1</p>
     */
    public void setDayOffset(Long DayOffset) {
        this.DayOffset = DayOffset;
    }

    public AddRecordBackupTemplateData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddRecordBackupTemplateData(AddRecordBackupTemplateData source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TimeSections != null) {
            this.TimeSections = new RecordTemplateTimeSections[source.TimeSections.length];
            for (int i = 0; i < source.TimeSections.length; i++) {
                this.TimeSections[i] = new RecordTemplateTimeSections(source.TimeSections[i]);
            }
        }
        if (source.DevTimeSections != null) {
            this.DevTimeSections = new RecordTemplateTimeSections[source.DevTimeSections.length];
            for (int i = 0; i < source.DevTimeSections.length; i++) {
                this.DevTimeSections[i] = new RecordTemplateTimeSections(source.DevTimeSections[i]);
            }
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.UpdateAt != null) {
            this.UpdateAt = new String(source.UpdateAt);
        }
        if (source.DayOffset != null) {
            this.DayOffset = new Long(source.DayOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamArrayObj(map, prefix + "TimeSections.", this.TimeSections);
        this.setParamArrayObj(map, prefix + "DevTimeSections.", this.DevTimeSections);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "UpdateAt", this.UpdateAt);
        this.setParamSimple(map, prefix + "DayOffset", this.DayOffset);

    }
}

