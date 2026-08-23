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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRegistryExportJobInfo extends AbstractModel {

    /**
    * <p>导出任务id</p>
    */
    @SerializedName("JobID")
    @Expose
    private String JobID;

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>SUCCESS： 任务成功</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>任务所属账号appid</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>导出类型</p>
    */
    @SerializedName("ExportType")
    @Expose
    private String ExportType;

    /**
    * <p>任务名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>导出时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("ExportCreateTime")
    @Expose
    private String ExportCreateTime;

    /**
     * Get <p>导出任务id</p> 
     * @return JobID <p>导出任务id</p>
     */
    public String getJobID() {
        return this.JobID;
    }

    /**
     * Set <p>导出任务id</p>
     * @param JobID <p>导出任务id</p>
     */
    public void setJobID(String JobID) {
        this.JobID = JobID;
    }

    /**
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>SUCCESS： 任务成功</li></ul> 
     * @return Status <p>任务状态</p><p>枚举值：</p><ul><li>SUCCESS： 任务成功</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>SUCCESS： 任务成功</li></ul>
     * @param Status <p>任务状态</p><p>枚举值：</p><ul><li>SUCCESS： 任务成功</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务所属账号appid</p> 
     * @return OwnerAppId <p>任务所属账号appid</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>任务所属账号appid</p>
     * @param OwnerAppId <p>任务所属账号appid</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>导出类型</p> 
     * @return ExportType <p>导出类型</p>
     */
    public String getExportType() {
        return this.ExportType;
    }

    /**
     * Set <p>导出类型</p>
     * @param ExportType <p>导出类型</p>
     */
    public void setExportType(String ExportType) {
        this.ExportType = ExportType;
    }

    /**
     * Get <p>任务名</p> 
     * @return Name <p>任务名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名</p>
     * @param Name <p>任务名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>导出时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return ExportCreateTime <p>导出时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getExportCreateTime() {
        return this.ExportCreateTime;
    }

    /**
     * Set <p>导出时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param ExportCreateTime <p>导出时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setExportCreateTime(String ExportCreateTime) {
        this.ExportCreateTime = ExportCreateTime;
    }

    public ImageRegistryExportJobInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRegistryExportJobInfo(ImageRegistryExportJobInfo source) {
        if (source.JobID != null) {
            this.JobID = new String(source.JobID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.ExportType != null) {
            this.ExportType = new String(source.ExportType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ExportCreateTime != null) {
            this.ExportCreateTime = new String(source.ExportCreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobID", this.JobID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "ExportType", this.ExportType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ExportCreateTime", this.ExportCreateTime);

    }
}

