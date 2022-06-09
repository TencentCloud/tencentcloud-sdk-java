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

public class DescribeFlySecMiniAppReportUrlRequest extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * 小程序appid
    */
    @SerializedName("MiniAppID")
    @Expose
    private String MiniAppID;

    /**
    * 诊断方式 1:基础诊断，2:深度诊断
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 诊断报告类型 0:基础诊断报告, 1:总裁版诊断报告
    */
    @SerializedName("ReportType")
    @Expose
    private Long ReportType;

    /**
     * Get 任务id 
     * @return TaskID 任务id
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 任务id
     * @param TaskID 任务id
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get 小程序appid 
     * @return MiniAppID 小程序appid
     */
    public String getMiniAppID() {
        return this.MiniAppID;
    }

    /**
     * Set 小程序appid
     * @param MiniAppID 小程序appid
     */
    public void setMiniAppID(String MiniAppID) {
        this.MiniAppID = MiniAppID;
    }

    /**
     * Get 诊断方式 1:基础诊断，2:深度诊断 
     * @return Mode 诊断方式 1:基础诊断，2:深度诊断
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 诊断方式 1:基础诊断，2:深度诊断
     * @param Mode 诊断方式 1:基础诊断，2:深度诊断
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 诊断报告类型 0:基础诊断报告, 1:总裁版诊断报告 
     * @return ReportType 诊断报告类型 0:基础诊断报告, 1:总裁版诊断报告
     */
    public Long getReportType() {
        return this.ReportType;
    }

    /**
     * Set 诊断报告类型 0:基础诊断报告, 1:总裁版诊断报告
     * @param ReportType 诊断报告类型 0:基础诊断报告, 1:总裁版诊断报告
     */
    public void setReportType(Long ReportType) {
        this.ReportType = ReportType;
    }

    public DescribeFlySecMiniAppReportUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlySecMiniAppReportUrlRequest(DescribeFlySecMiniAppReportUrlRequest source) {
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.MiniAppID != null) {
            this.MiniAppID = new String(source.MiniAppID);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.ReportType != null) {
            this.ReportType = new Long(source.ReportType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "MiniAppID", this.MiniAppID);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);

    }
}

