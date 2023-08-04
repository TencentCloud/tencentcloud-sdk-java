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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddRecordBackupTemplateRequest extends AbstractModel{

    /**
    * 模板名称（仅支持中文、英文、数字、_、-，长度不超过32个字符，模板名称全局唯一，不能为空，不能重复）
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
     * Get 模板名称（仅支持中文、英文、数字、_、-，长度不超过32个字符，模板名称全局唯一，不能为空，不能重复） 
     * @return TemplateName 模板名称（仅支持中文、英文、数字、_、-，长度不超过32个字符，模板名称全局唯一，不能为空，不能重复）
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称（仅支持中文、英文、数字、_、-，长度不超过32个字符，模板名称全局唯一，不能为空，不能重复）
     * @param TemplateName 模板名称（仅支持中文、英文、数字、_、-，长度不超过32个字符，模板名称全局唯一，不能为空，不能重复）
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

    public AddRecordBackupTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddRecordBackupTemplateRequest(AddRecordBackupTemplateRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamArrayObj(map, prefix + "TimeSections.", this.TimeSections);
        this.setParamArrayObj(map, prefix + "DevTimeSections.", this.DevTimeSections);
        this.setParamSimple(map, prefix + "Scale", this.Scale);

    }
}

