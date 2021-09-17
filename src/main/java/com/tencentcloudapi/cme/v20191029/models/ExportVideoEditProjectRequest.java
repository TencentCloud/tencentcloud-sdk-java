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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportVideoEditProjectRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 项目 Id。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 导出模板 Id，目前不支持自定义创建，只支持下面的预置模板 Id。
<li>10：分辨率为 480P，输出视频格式为 MP4；</li>
<li>11：分辨率为 720P，输出视频格式为 MP4；</li>
<li>12：分辨率为 1080P，输出视频格式为 MP4。</li>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 导出目标。
<li>CME：云剪，即导出为云剪媒体；</li>
<li>VOD：云点播，即导出为云点播媒资。</li>
    */
    @SerializedName("ExportDestination")
    @Expose
    private String ExportDestination;

    /**
    * 视频封面图片文件（如 jpeg, png 等）进行 Base64 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式，原图片文件不能超过2 M大 小。
    */
    @SerializedName("CoverData")
    @Expose
    private String CoverData;

    /**
    * 导出的云剪媒体信息。当导出目标为 CME 时必填。
    */
    @SerializedName("CMEExportInfo")
    @Expose
    private CMEExportInfo CMEExportInfo;

    /**
    * 导出的云点播媒资信息。当导出目标为 VOD 时必填。
    */
    @SerializedName("VODExportInfo")
    @Expose
    private VODExportInfo VODExportInfo;

    /**
    * 操作者。填写用户的 Id，用于标识调用者及校验项目导出权限。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 平台名称，指定访问的平台。 
     * @return Platform 平台名称，指定访问的平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台名称，指定访问的平台。
     * @param Platform 平台名称，指定访问的平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 项目 Id。 
     * @return ProjectId 项目 Id。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 Id。
     * @param ProjectId 项目 Id。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 导出模板 Id，目前不支持自定义创建，只支持下面的预置模板 Id。
<li>10：分辨率为 480P，输出视频格式为 MP4；</li>
<li>11：分辨率为 720P，输出视频格式为 MP4；</li>
<li>12：分辨率为 1080P，输出视频格式为 MP4。</li> 
     * @return Definition 导出模板 Id，目前不支持自定义创建，只支持下面的预置模板 Id。
<li>10：分辨率为 480P，输出视频格式为 MP4；</li>
<li>11：分辨率为 720P，输出视频格式为 MP4；</li>
<li>12：分辨率为 1080P，输出视频格式为 MP4。</li>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 导出模板 Id，目前不支持自定义创建，只支持下面的预置模板 Id。
<li>10：分辨率为 480P，输出视频格式为 MP4；</li>
<li>11：分辨率为 720P，输出视频格式为 MP4；</li>
<li>12：分辨率为 1080P，输出视频格式为 MP4。</li>
     * @param Definition 导出模板 Id，目前不支持自定义创建，只支持下面的预置模板 Id。
<li>10：分辨率为 480P，输出视频格式为 MP4；</li>
<li>11：分辨率为 720P，输出视频格式为 MP4；</li>
<li>12：分辨率为 1080P，输出视频格式为 MP4。</li>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 导出目标。
<li>CME：云剪，即导出为云剪媒体；</li>
<li>VOD：云点播，即导出为云点播媒资。</li> 
     * @return ExportDestination 导出目标。
<li>CME：云剪，即导出为云剪媒体；</li>
<li>VOD：云点播，即导出为云点播媒资。</li>
     */
    public String getExportDestination() {
        return this.ExportDestination;
    }

    /**
     * Set 导出目标。
<li>CME：云剪，即导出为云剪媒体；</li>
<li>VOD：云点播，即导出为云点播媒资。</li>
     * @param ExportDestination 导出目标。
<li>CME：云剪，即导出为云剪媒体；</li>
<li>VOD：云点播，即导出为云点播媒资。</li>
     */
    public void setExportDestination(String ExportDestination) {
        this.ExportDestination = ExportDestination;
    }

    /**
     * Get 视频封面图片文件（如 jpeg, png 等）进行 Base64 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式，原图片文件不能超过2 M大 小。 
     * @return CoverData 视频封面图片文件（如 jpeg, png 等）进行 Base64 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式，原图片文件不能超过2 M大 小。
     */
    public String getCoverData() {
        return this.CoverData;
    }

    /**
     * Set 视频封面图片文件（如 jpeg, png 等）进行 Base64 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式，原图片文件不能超过2 M大 小。
     * @param CoverData 视频封面图片文件（如 jpeg, png 等）进行 Base64 编码后的字符串，仅支持 gif、jpeg、png 三种图片格式，原图片文件不能超过2 M大 小。
     */
    public void setCoverData(String CoverData) {
        this.CoverData = CoverData;
    }

    /**
     * Get 导出的云剪媒体信息。当导出目标为 CME 时必填。 
     * @return CMEExportInfo 导出的云剪媒体信息。当导出目标为 CME 时必填。
     */
    public CMEExportInfo getCMEExportInfo() {
        return this.CMEExportInfo;
    }

    /**
     * Set 导出的云剪媒体信息。当导出目标为 CME 时必填。
     * @param CMEExportInfo 导出的云剪媒体信息。当导出目标为 CME 时必填。
     */
    public void setCMEExportInfo(CMEExportInfo CMEExportInfo) {
        this.CMEExportInfo = CMEExportInfo;
    }

    /**
     * Get 导出的云点播媒资信息。当导出目标为 VOD 时必填。 
     * @return VODExportInfo 导出的云点播媒资信息。当导出目标为 VOD 时必填。
     */
    public VODExportInfo getVODExportInfo() {
        return this.VODExportInfo;
    }

    /**
     * Set 导出的云点播媒资信息。当导出目标为 VOD 时必填。
     * @param VODExportInfo 导出的云点播媒资信息。当导出目标为 VOD 时必填。
     */
    public void setVODExportInfo(VODExportInfo VODExportInfo) {
        this.VODExportInfo = VODExportInfo;
    }

    /**
     * Get 操作者。填写用户的 Id，用于标识调用者及校验项目导出权限。 
     * @return Operator 操作者。填写用户的 Id，用于标识调用者及校验项目导出权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。填写用户的 Id，用于标识调用者及校验项目导出权限。
     * @param Operator 操作者。填写用户的 Id，用于标识调用者及校验项目导出权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public ExportVideoEditProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportVideoEditProjectRequest(ExportVideoEditProjectRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ExportDestination != null) {
            this.ExportDestination = new String(source.ExportDestination);
        }
        if (source.CoverData != null) {
            this.CoverData = new String(source.CoverData);
        }
        if (source.CMEExportInfo != null) {
            this.CMEExportInfo = new CMEExportInfo(source.CMEExportInfo);
        }
        if (source.VODExportInfo != null) {
            this.VODExportInfo = new VODExportInfo(source.VODExportInfo);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ExportDestination", this.ExportDestination);
        this.setParamSimple(map, prefix + "CoverData", this.CoverData);
        this.setParamObj(map, prefix + "CMEExportInfo.", this.CMEExportInfo);
        this.setParamObj(map, prefix + "VODExportInfo.", this.VODExportInfo);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

