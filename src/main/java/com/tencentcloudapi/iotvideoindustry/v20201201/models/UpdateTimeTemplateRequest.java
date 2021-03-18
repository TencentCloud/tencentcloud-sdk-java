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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateTimeTemplateRequest extends AbstractModel{

    /**
    * 时间模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 时间模板名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否全时录制，即7*24小时录制
    */
    @SerializedName("IsAllWeek")
    @Expose
    private Long IsAllWeek;

    /**
    * 录制时间片段
    */
    @SerializedName("TimeTemplateSpecs")
    @Expose
    private TimeTemplateSpec [] TimeTemplateSpecs;

    /**
     * Get 时间模板ID 
     * @return TemplateId 时间模板ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 时间模板ID
     * @param TemplateId 时间模板ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 时间模板名称 
     * @return Name 时间模板名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 时间模板名称
     * @param Name 时间模板名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否全时录制，即7*24小时录制 
     * @return IsAllWeek 是否全时录制，即7*24小时录制
     */
    public Long getIsAllWeek() {
        return this.IsAllWeek;
    }

    /**
     * Set 是否全时录制，即7*24小时录制
     * @param IsAllWeek 是否全时录制，即7*24小时录制
     */
    public void setIsAllWeek(Long IsAllWeek) {
        this.IsAllWeek = IsAllWeek;
    }

    /**
     * Get 录制时间片段 
     * @return TimeTemplateSpecs 录制时间片段
     */
    public TimeTemplateSpec [] getTimeTemplateSpecs() {
        return this.TimeTemplateSpecs;
    }

    /**
     * Set 录制时间片段
     * @param TimeTemplateSpecs 录制时间片段
     */
    public void setTimeTemplateSpecs(TimeTemplateSpec [] TimeTemplateSpecs) {
        this.TimeTemplateSpecs = TimeTemplateSpecs;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IsAllWeek", this.IsAllWeek);
        this.setParamArrayObj(map, prefix + "TimeTemplateSpecs.", this.TimeTemplateSpecs);

    }
}

