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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAIAnalysisTemplateRequest extends AbstractModel{

    /**
    * 视频内容分析模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 视频内容分析模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 智能分类任务控制参数。
    */
    @SerializedName("ClassificationConfigure")
    @Expose
    private ClassificationConfigureInfo ClassificationConfigure;

    /**
    * 智能标签任务控制参数。
    */
    @SerializedName("TagConfigure")
    @Expose
    private TagConfigureInfo TagConfigure;

    /**
    * 智能封面任务控制参数。
    */
    @SerializedName("CoverConfigure")
    @Expose
    private CoverConfigureInfo CoverConfigure;

    /**
    * 智能按帧标签任务控制参数。
    */
    @SerializedName("FrameTagConfigure")
    @Expose
    private FrameTagConfigureInfo FrameTagConfigure;

    /**
    * 智能精彩集锦任务控制参数。
    */
    @SerializedName("HighlightConfigure")
    @Expose
    private HighlightsConfigureInfo HighlightConfigure;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 视频内容分析模板名称，长度限制：64 个字符。 
     * @return Name 视频内容分析模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 视频内容分析模板名称，长度限制：64 个字符。
     * @param Name 视频内容分析模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 视频内容分析模板描述信息，长度限制：256 个字符。 
     * @return Comment 视频内容分析模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 视频内容分析模板描述信息，长度限制：256 个字符。
     * @param Comment 视频内容分析模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 智能分类任务控制参数。 
     * @return ClassificationConfigure 智能分类任务控制参数。
     */
    public ClassificationConfigureInfo getClassificationConfigure() {
        return this.ClassificationConfigure;
    }

    /**
     * Set 智能分类任务控制参数。
     * @param ClassificationConfigure 智能分类任务控制参数。
     */
    public void setClassificationConfigure(ClassificationConfigureInfo ClassificationConfigure) {
        this.ClassificationConfigure = ClassificationConfigure;
    }

    /**
     * Get 智能标签任务控制参数。 
     * @return TagConfigure 智能标签任务控制参数。
     */
    public TagConfigureInfo getTagConfigure() {
        return this.TagConfigure;
    }

    /**
     * Set 智能标签任务控制参数。
     * @param TagConfigure 智能标签任务控制参数。
     */
    public void setTagConfigure(TagConfigureInfo TagConfigure) {
        this.TagConfigure = TagConfigure;
    }

    /**
     * Get 智能封面任务控制参数。 
     * @return CoverConfigure 智能封面任务控制参数。
     */
    public CoverConfigureInfo getCoverConfigure() {
        return this.CoverConfigure;
    }

    /**
     * Set 智能封面任务控制参数。
     * @param CoverConfigure 智能封面任务控制参数。
     */
    public void setCoverConfigure(CoverConfigureInfo CoverConfigure) {
        this.CoverConfigure = CoverConfigure;
    }

    /**
     * Get 智能按帧标签任务控制参数。 
     * @return FrameTagConfigure 智能按帧标签任务控制参数。
     */
    public FrameTagConfigureInfo getFrameTagConfigure() {
        return this.FrameTagConfigure;
    }

    /**
     * Set 智能按帧标签任务控制参数。
     * @param FrameTagConfigure 智能按帧标签任务控制参数。
     */
    public void setFrameTagConfigure(FrameTagConfigureInfo FrameTagConfigure) {
        this.FrameTagConfigure = FrameTagConfigure;
    }

    /**
     * Get 智能精彩集锦任务控制参数。 
     * @return HighlightConfigure 智能精彩集锦任务控制参数。
     */
    public HighlightsConfigureInfo getHighlightConfigure() {
        return this.HighlightConfigure;
    }

    /**
     * Set 智能精彩集锦任务控制参数。
     * @param HighlightConfigure 智能精彩集锦任务控制参数。
     */
    public void setHighlightConfigure(HighlightsConfigureInfo HighlightConfigure) {
        this.HighlightConfigure = HighlightConfigure;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "ClassificationConfigure.", this.ClassificationConfigure);
        this.setParamObj(map, prefix + "TagConfigure.", this.TagConfigure);
        this.setParamObj(map, prefix + "CoverConfigure.", this.CoverConfigure);
        this.setParamObj(map, prefix + "FrameTagConfigure.", this.FrameTagConfigure);
        this.setParamObj(map, prefix + "HighlightConfigure.", this.HighlightConfigure);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

