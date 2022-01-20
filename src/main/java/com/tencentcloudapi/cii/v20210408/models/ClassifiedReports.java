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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassifiedReports extends AbstractModel{

    /**
    * 报告类型
    */
    @SerializedName("ReportType")
    @Expose
    private String ReportType;

    /**
    * 文件列表
    */
    @SerializedName("FileList")
    @Expose
    private String [] FileList;

    /**
     * Get 报告类型 
     * @return ReportType 报告类型
     */
    public String getReportType() {
        return this.ReportType;
    }

    /**
     * Set 报告类型
     * @param ReportType 报告类型
     */
    public void setReportType(String ReportType) {
        this.ReportType = ReportType;
    }

    /**
     * Get 文件列表 
     * @return FileList 文件列表
     */
    public String [] getFileList() {
        return this.FileList;
    }

    /**
     * Set 文件列表
     * @param FileList 文件列表
     */
    public void setFileList(String [] FileList) {
        this.FileList = FileList;
    }

    public ClassifiedReports() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassifiedReports(ClassifiedReports source) {
        if (source.ReportType != null) {
            this.ReportType = new String(source.ReportType);
        }
        if (source.FileList != null) {
            this.FileList = new String[source.FileList.length];
            for (int i = 0; i < source.FileList.length; i++) {
                this.FileList[i] = new String(source.FileList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReportType", this.ReportType);
        this.setParamArraySimple(map, prefix + "FileList.", this.FileList);

    }
}

