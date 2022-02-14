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

public class ModifyProjectLimitRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * 项目接口
    */
    @SerializedName("ProjectInterface")
    @Expose
    private String ProjectInterface;

    /**
    * 上报比例   10代表10%
    */
    @SerializedName("ReportRate")
    @Expose
    private Long ReportRate;

    /**
    * 上报类型 1：比例  2：上报量
    */
    @SerializedName("ReportType")
    @Expose
    private Long ReportType;

    /**
    * 主键ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
     * Get 项目ID 
     * @return ProjectID 项目ID
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set 项目ID
     * @param ProjectID 项目ID
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get 项目接口 
     * @return ProjectInterface 项目接口
     */
    public String getProjectInterface() {
        return this.ProjectInterface;
    }

    /**
     * Set 项目接口
     * @param ProjectInterface 项目接口
     */
    public void setProjectInterface(String ProjectInterface) {
        this.ProjectInterface = ProjectInterface;
    }

    /**
     * Get 上报比例   10代表10% 
     * @return ReportRate 上报比例   10代表10%
     */
    public Long getReportRate() {
        return this.ReportRate;
    }

    /**
     * Set 上报比例   10代表10%
     * @param ReportRate 上报比例   10代表10%
     */
    public void setReportRate(Long ReportRate) {
        this.ReportRate = ReportRate;
    }

    /**
     * Get 上报类型 1：比例  2：上报量 
     * @return ReportType 上报类型 1：比例  2：上报量
     */
    public Long getReportType() {
        return this.ReportType;
    }

    /**
     * Set 上报类型 1：比例  2：上报量
     * @param ReportType 上报类型 1：比例  2：上报量
     */
    public void setReportType(Long ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get 主键ID 
     * @return ID 主键ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 主键ID
     * @param ID 主键ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    public ModifyProjectLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProjectLimitRequest(ModifyProjectLimitRequest source) {
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.ProjectInterface != null) {
            this.ProjectInterface = new String(source.ProjectInterface);
        }
        if (source.ReportRate != null) {
            this.ReportRate = new Long(source.ReportRate);
        }
        if (source.ReportType != null) {
            this.ReportType = new Long(source.ReportType);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "ProjectInterface", this.ProjectInterface);
        this.setParamSimple(map, prefix + "ReportRate", this.ReportRate);
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

