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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyIdlFilesRequest extends AbstractModel{

    /**
    * 待加表的应用实例ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 待加表的大区ID
    */
    @SerializedName("LogicZoneId")
    @Expose
    private String LogicZoneId;

    /**
    * 曾经上传过的IDL文件信息列表，与NewIdlFiles至少有一者
    */
    @SerializedName("ExistingIdlFiles")
    @Expose
    private IdlFileInfo [] ExistingIdlFiles;

    /**
    * 待上传的IDL文件信息列表，与ExistingIdlFiles至少有一者
    */
    @SerializedName("NewIdlFiles")
    @Expose
    private IdlFileInfo [] NewIdlFiles;

    /**
     * Get 待加表的应用实例ID 
     * @return ApplicationId 待加表的应用实例ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 待加表的应用实例ID
     * @param ApplicationId 待加表的应用实例ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 待加表的大区ID 
     * @return LogicZoneId 待加表的大区ID
     */
    public String getLogicZoneId() {
        return this.LogicZoneId;
    }

    /**
     * Set 待加表的大区ID
     * @param LogicZoneId 待加表的大区ID
     */
    public void setLogicZoneId(String LogicZoneId) {
        this.LogicZoneId = LogicZoneId;
    }

    /**
     * Get 曾经上传过的IDL文件信息列表，与NewIdlFiles至少有一者 
     * @return ExistingIdlFiles 曾经上传过的IDL文件信息列表，与NewIdlFiles至少有一者
     */
    public IdlFileInfo [] getExistingIdlFiles() {
        return this.ExistingIdlFiles;
    }

    /**
     * Set 曾经上传过的IDL文件信息列表，与NewIdlFiles至少有一者
     * @param ExistingIdlFiles 曾经上传过的IDL文件信息列表，与NewIdlFiles至少有一者
     */
    public void setExistingIdlFiles(IdlFileInfo [] ExistingIdlFiles) {
        this.ExistingIdlFiles = ExistingIdlFiles;
    }

    /**
     * Get 待上传的IDL文件信息列表，与ExistingIdlFiles至少有一者 
     * @return NewIdlFiles 待上传的IDL文件信息列表，与ExistingIdlFiles至少有一者
     */
    public IdlFileInfo [] getNewIdlFiles() {
        return this.NewIdlFiles;
    }

    /**
     * Set 待上传的IDL文件信息列表，与ExistingIdlFiles至少有一者
     * @param NewIdlFiles 待上传的IDL文件信息列表，与ExistingIdlFiles至少有一者
     */
    public void setNewIdlFiles(IdlFileInfo [] NewIdlFiles) {
        this.NewIdlFiles = NewIdlFiles;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "LogicZoneId", this.LogicZoneId);
        this.setParamArrayObj(map, prefix + "ExistingIdlFiles.", this.ExistingIdlFiles);
        this.setParamArrayObj(map, prefix + "NewIdlFiles.", this.NewIdlFiles);

    }
}

