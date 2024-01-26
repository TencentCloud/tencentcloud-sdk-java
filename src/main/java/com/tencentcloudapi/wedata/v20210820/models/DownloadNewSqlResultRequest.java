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

public class DownloadNewSqlResultRequest extends AbstractModel {

    /**
    * SQL任务Id
    */
    @SerializedName("DetailId")
    @Expose
    private Long DetailId;

    /**
    * 下载文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 字段分隔符
    */
    @SerializedName("SeparatorChar")
    @Expose
    private String SeparatorChar;

    /**
    * 必填，否则报错，项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get SQL任务Id 
     * @return DetailId SQL任务Id
     */
    public Long getDetailId() {
        return this.DetailId;
    }

    /**
     * Set SQL任务Id
     * @param DetailId SQL任务Id
     */
    public void setDetailId(Long DetailId) {
        this.DetailId = DetailId;
    }

    /**
     * Get 下载文件名 
     * @return FileName 下载文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 下载文件名
     * @param FileName 下载文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 字段分隔符 
     * @return SeparatorChar 字段分隔符
     */
    public String getSeparatorChar() {
        return this.SeparatorChar;
    }

    /**
     * Set 字段分隔符
     * @param SeparatorChar 字段分隔符
     */
    public void setSeparatorChar(String SeparatorChar) {
        this.SeparatorChar = SeparatorChar;
    }

    /**
     * Get 必填，否则报错，项目ID 
     * @return ProjectId 必填，否则报错，项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 必填，否则报错，项目ID
     * @param ProjectId 必填，否则报错，项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DownloadNewSqlResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadNewSqlResultRequest(DownloadNewSqlResultRequest source) {
        if (source.DetailId != null) {
            this.DetailId = new Long(source.DetailId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.SeparatorChar != null) {
            this.SeparatorChar = new String(source.SeparatorChar);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DetailId", this.DetailId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "SeparatorChar", this.SeparatorChar);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

