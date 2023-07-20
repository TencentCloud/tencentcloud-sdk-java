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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceByCycleReportRequest extends AbstractModel{

    /**
    * 周期类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 开始日期
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束日期
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 周期类型 
     * @return Type 周期类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 周期类型
     * @param Type 周期类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 开始日期 
     * @return StartTime 开始日期
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始日期
     * @param StartTime 开始日期
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束日期 
     * @return EndTime 结束日期
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束日期
     * @param EndTime 结束日期
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeInstanceByCycleReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceByCycleReportRequest(DescribeInstanceByCycleReportRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

