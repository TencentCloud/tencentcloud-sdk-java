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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReleaseFilesRequest extends AbstractModel {

    /**
    * <p>项目 id</p>
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * <p>文件版本</p>
    */
    @SerializedName("FileVersion")
    @Expose
    private String FileVersion;

    /**
    * <p>查询过滤条件（根据sourcemap的文件名模糊匹配）</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>false/不传=保留「最近 3 个月」约束（旧行为）；true=绕过时间窗口</p>
    */
    @SerializedName("IgnoreDefaultTimeRange")
    @Expose
    private Boolean IgnoreDefaultTimeRange;

    /**
     * Get <p>项目 id</p> 
     * @return ProjectID <p>项目 id</p>
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set <p>项目 id</p>
     * @param ProjectID <p>项目 id</p>
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get <p>文件版本</p> 
     * @return FileVersion <p>文件版本</p>
     */
    public String getFileVersion() {
        return this.FileVersion;
    }

    /**
     * Set <p>文件版本</p>
     * @param FileVersion <p>文件版本</p>
     */
    public void setFileVersion(String FileVersion) {
        this.FileVersion = FileVersion;
    }

    /**
     * Get <p>查询过滤条件（根据sourcemap的文件名模糊匹配）</p> 
     * @return FileName <p>查询过滤条件（根据sourcemap的文件名模糊匹配）</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>查询过滤条件（根据sourcemap的文件名模糊匹配）</p>
     * @param FileName <p>查询过滤条件（根据sourcemap的文件名模糊匹配）</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>false/不传=保留「最近 3 个月」约束（旧行为）；true=绕过时间窗口</p> 
     * @return IgnoreDefaultTimeRange <p>false/不传=保留「最近 3 个月」约束（旧行为）；true=绕过时间窗口</p>
     */
    public Boolean getIgnoreDefaultTimeRange() {
        return this.IgnoreDefaultTimeRange;
    }

    /**
     * Set <p>false/不传=保留「最近 3 个月」约束（旧行为）；true=绕过时间窗口</p>
     * @param IgnoreDefaultTimeRange <p>false/不传=保留「最近 3 个月」约束（旧行为）；true=绕过时间窗口</p>
     */
    public void setIgnoreDefaultTimeRange(Boolean IgnoreDefaultTimeRange) {
        this.IgnoreDefaultTimeRange = IgnoreDefaultTimeRange;
    }

    public DescribeReleaseFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReleaseFilesRequest(DescribeReleaseFilesRequest source) {
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.FileVersion != null) {
            this.FileVersion = new String(source.FileVersion);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.IgnoreDefaultTimeRange != null) {
            this.IgnoreDefaultTimeRange = new Boolean(source.IgnoreDefaultTimeRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "FileVersion", this.FileVersion);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "IgnoreDefaultTimeRange", this.IgnoreDefaultTimeRange);

    }
}

