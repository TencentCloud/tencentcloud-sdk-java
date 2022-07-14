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
package com.tencentcloudapi.mmps.v20200710.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAppScanTaskRepeatRequest extends AbstractModel{

    /**
    * 任务类型, 0:基础版, 1:专家版, 2:本地化
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 任务来源, 0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android);
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 小程序AppID
    */
    @SerializedName("AppPackage")
    @Expose
    private String AppPackage;

    /**
    * 应用平台, 0:android, 1:ios, 2:小程序
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
    * 原诊断任务ID
    */
    @SerializedName("OrgTaskID")
    @Expose
    private String OrgTaskID;

    /**
     * Get 任务类型, 0:基础版, 1:专家版, 2:本地化 
     * @return TaskType 任务类型, 0:基础版, 1:专家版, 2:本地化
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型, 0:基础版, 1:专家版, 2:本地化
     * @param TaskType 任务类型, 0:基础版, 1:专家版, 2:本地化
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务来源, 0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android); 
     * @return Source 任务来源, 0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android);
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 任务来源, 0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android);
     * @param Source 任务来源, 0:小程序诊断, 1:预留字段(暂未使用), 2:app诊断(android);
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 小程序AppID 
     * @return AppPackage 小程序AppID
     */
    public String getAppPackage() {
        return this.AppPackage;
    }

    /**
     * Set 小程序AppID
     * @param AppPackage 小程序AppID
     */
    public void setAppPackage(String AppPackage) {
        this.AppPackage = AppPackage;
    }

    /**
     * Get 应用平台, 0:android, 1:ios, 2:小程序 
     * @return Platform 应用平台, 0:android, 1:ios, 2:小程序
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set 应用平台, 0:android, 1:ios, 2:小程序
     * @param Platform 应用平台, 0:android, 1:ios, 2:小程序
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 原诊断任务ID 
     * @return OrgTaskID 原诊断任务ID
     */
    public String getOrgTaskID() {
        return this.OrgTaskID;
    }

    /**
     * Set 原诊断任务ID
     * @param OrgTaskID 原诊断任务ID
     */
    public void setOrgTaskID(String OrgTaskID) {
        this.OrgTaskID = OrgTaskID;
    }

    public CreateAppScanTaskRepeatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAppScanTaskRepeatRequest(CreateAppScanTaskRepeatRequest source) {
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.AppPackage != null) {
            this.AppPackage = new String(source.AppPackage);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
        if (source.OrgTaskID != null) {
            this.OrgTaskID = new String(source.OrgTaskID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "AppPackage", this.AppPackage);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "OrgTaskID", this.OrgTaskID);

    }
}

