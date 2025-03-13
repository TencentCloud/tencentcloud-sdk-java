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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddRecordBackupTemplateData extends AbstractModel {

    /**
    * 模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 模板名称
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 上云时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）
    */
    @SerializedName("TimeSections")
    @Expose
    private RecordTemplateTimeSections [] TimeSections;

    /**
    * 录像时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）
    */
    @SerializedName("DevTimeSections")
    @Expose
    private RecordTemplateTimeSections [] DevTimeSections;

    /**
    * 上云倍速（支持1，2，4倍速）
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * 创建时间
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * 更新时间
    */
    @SerializedName("UpdateAt")
    @Expose
    private String UpdateAt;

    /**
     * Get 模板ID 
     * @return TemplateId 模板ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID
     * @param TemplateId 模板ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板名称 
     * @return TemplateName 模板名称
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称
     * @param TemplateName 模板名称
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 上云时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟） 
     * @return TimeSections 上云时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）
     */
    public RecordTemplateTimeSections [] getTimeSections() {
        return this.TimeSections;
    }

    /**
     * Set 上云时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）
     * @param TimeSections 上云时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）
     */
    public void setTimeSections(RecordTemplateTimeSections [] TimeSections) {
        this.TimeSections = TimeSections;
    }

    /**
     * Get 录像时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟） 
     * @return DevTimeSections 录像时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）
     */
    public RecordTemplateTimeSections [] getDevTimeSections() {
        return this.DevTimeSections;
    }

    /**
     * Set 录像时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）
     * @param DevTimeSections 录像时间段（按周进行设置，支持一天设置多个时间段，每个时间段不小于10分钟）
     */
    public void setDevTimeSections(RecordTemplateTimeSections [] DevTimeSections) {
        this.DevTimeSections = DevTimeSections;
    }

    /**
     * Get 上云倍速（支持1，2，4倍速） 
     * @return Scale 上云倍速（支持1，2，4倍速）
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set 上云倍速（支持1，2，4倍速）
     * @param Scale 上云倍速（支持1，2，4倍速）
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get 创建时间 
     * @return CreateAt 创建时间
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set 创建时间
     * @param CreateAt 创建时间
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get 更新时间 
     * @return UpdateAt 更新时间
     */
    public String getUpdateAt() {
        return this.UpdateAt;
    }

    /**
     * Set 更新时间
     * @param UpdateAt 更新时间
     */
    public void setUpdateAt(String UpdateAt) {
        this.UpdateAt = UpdateAt;
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

    }
}

