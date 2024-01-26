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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDsEventRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 事件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 存活时间	
    */
    @SerializedName("TimeToLive")
    @Expose
    private String TimeToLive;

    /**
    * 存活时间单位	
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 事件名称 
     * @return Name 事件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 事件名称
     * @param Name 事件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 存活时间	 
     * @return TimeToLive 存活时间	
     */
    public String getTimeToLive() {
        return this.TimeToLive;
    }

    /**
     * Set 存活时间	
     * @param TimeToLive 存活时间	
     */
    public void setTimeToLive(String TimeToLive) {
        this.TimeToLive = TimeToLive;
    }

    /**
     * Get 存活时间单位	 
     * @return TimeUnit 存活时间单位	
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 存活时间单位	
     * @param TimeUnit 存活时间单位	
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public UpdateDsEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDsEventRequest(UpdateDsEventRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TimeToLive != null) {
            this.TimeToLive = new String(source.TimeToLive);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TimeToLive", this.TimeToLive);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

