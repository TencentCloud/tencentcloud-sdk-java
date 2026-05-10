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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSAIAnalysisTemplate extends AbstractModel {

    /**
    * <p>视频内容分析模板名称，长度限制：64 个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>视频内容分析模板描述信息，长度限制：256 个字符。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>智能分类任务控制参数。</p>
    */
    @SerializedName("ClassificationConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo ClassificationConfigure;

    /**
    * <p>智能标签任务控制参数。</p>
    */
    @SerializedName("TagConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo TagConfigure;

    /**
    * <p>智能封面任务控制参数。</p>
    */
    @SerializedName("CoverConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo CoverConfigure;

    /**
    * <p>智能按帧标签任务控制参数。</p>
    */
    @SerializedName("FrameTagConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo FrameTagConfigure;

    /**
    * <p>智能拆条任务控制参数。</p>
    */
    @SerializedName("SplitConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo SplitConfigure;

    /**
    * <p>智能集锦任务控制参数。</p>
    */
    @SerializedName("HighlightConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo HighlightConfigure;

    /**
    * <p>智能片头片尾任务控制参数。</p>
    */
    @SerializedName("OpeningAndEndingConfigure")
    @Expose
    private MPSAIAnalysisConfigureInfo OpeningAndEndingConfigure;

    /**
     * Get <p>视频内容分析模板名称，长度限制：64 个字符。</p> 
     * @return Name <p>视频内容分析模板名称，长度限制：64 个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>视频内容分析模板名称，长度限制：64 个字符。</p>
     * @param Name <p>视频内容分析模板名称，长度限制：64 个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>视频内容分析模板描述信息，长度限制：256 个字符。</p> 
     * @return Comment <p>视频内容分析模板描述信息，长度限制：256 个字符。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>视频内容分析模板描述信息，长度限制：256 个字符。</p>
     * @param Comment <p>视频内容分析模板描述信息，长度限制：256 个字符。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>智能分类任务控制参数。</p> 
     * @return ClassificationConfigure <p>智能分类任务控制参数。</p>
     */
    public MPSAIAnalysisConfigureInfo getClassificationConfigure() {
        return this.ClassificationConfigure;
    }

    /**
     * Set <p>智能分类任务控制参数。</p>
     * @param ClassificationConfigure <p>智能分类任务控制参数。</p>
     */
    public void setClassificationConfigure(MPSAIAnalysisConfigureInfo ClassificationConfigure) {
        this.ClassificationConfigure = ClassificationConfigure;
    }

    /**
     * Get <p>智能标签任务控制参数。</p> 
     * @return TagConfigure <p>智能标签任务控制参数。</p>
     */
    public MPSAIAnalysisConfigureInfo getTagConfigure() {
        return this.TagConfigure;
    }

    /**
     * Set <p>智能标签任务控制参数。</p>
     * @param TagConfigure <p>智能标签任务控制参数。</p>
     */
    public void setTagConfigure(MPSAIAnalysisConfigureInfo TagConfigure) {
        this.TagConfigure = TagConfigure;
    }

    /**
     * Get <p>智能封面任务控制参数。</p> 
     * @return CoverConfigure <p>智能封面任务控制参数。</p>
     */
    public MPSAIAnalysisConfigureInfo getCoverConfigure() {
        return this.CoverConfigure;
    }

    /**
     * Set <p>智能封面任务控制参数。</p>
     * @param CoverConfigure <p>智能封面任务控制参数。</p>
     */
    public void setCoverConfigure(MPSAIAnalysisConfigureInfo CoverConfigure) {
        this.CoverConfigure = CoverConfigure;
    }

    /**
     * Get <p>智能按帧标签任务控制参数。</p> 
     * @return FrameTagConfigure <p>智能按帧标签任务控制参数。</p>
     */
    public MPSAIAnalysisConfigureInfo getFrameTagConfigure() {
        return this.FrameTagConfigure;
    }

    /**
     * Set <p>智能按帧标签任务控制参数。</p>
     * @param FrameTagConfigure <p>智能按帧标签任务控制参数。</p>
     */
    public void setFrameTagConfigure(MPSAIAnalysisConfigureInfo FrameTagConfigure) {
        this.FrameTagConfigure = FrameTagConfigure;
    }

    /**
     * Get <p>智能拆条任务控制参数。</p> 
     * @return SplitConfigure <p>智能拆条任务控制参数。</p>
     */
    public MPSAIAnalysisConfigureInfo getSplitConfigure() {
        return this.SplitConfigure;
    }

    /**
     * Set <p>智能拆条任务控制参数。</p>
     * @param SplitConfigure <p>智能拆条任务控制参数。</p>
     */
    public void setSplitConfigure(MPSAIAnalysisConfigureInfo SplitConfigure) {
        this.SplitConfigure = SplitConfigure;
    }

    /**
     * Get <p>智能集锦任务控制参数。</p> 
     * @return HighlightConfigure <p>智能集锦任务控制参数。</p>
     */
    public MPSAIAnalysisConfigureInfo getHighlightConfigure() {
        return this.HighlightConfigure;
    }

    /**
     * Set <p>智能集锦任务控制参数。</p>
     * @param HighlightConfigure <p>智能集锦任务控制参数。</p>
     */
    public void setHighlightConfigure(MPSAIAnalysisConfigureInfo HighlightConfigure) {
        this.HighlightConfigure = HighlightConfigure;
    }

    /**
     * Get <p>智能片头片尾任务控制参数。</p> 
     * @return OpeningAndEndingConfigure <p>智能片头片尾任务控制参数。</p>
     */
    public MPSAIAnalysisConfigureInfo getOpeningAndEndingConfigure() {
        return this.OpeningAndEndingConfigure;
    }

    /**
     * Set <p>智能片头片尾任务控制参数。</p>
     * @param OpeningAndEndingConfigure <p>智能片头片尾任务控制参数。</p>
     */
    public void setOpeningAndEndingConfigure(MPSAIAnalysisConfigureInfo OpeningAndEndingConfigure) {
        this.OpeningAndEndingConfigure = OpeningAndEndingConfigure;
    }

    public MPSAIAnalysisTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSAIAnalysisTemplate(MPSAIAnalysisTemplate source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ClassificationConfigure != null) {
            this.ClassificationConfigure = new MPSAIAnalysisConfigureInfo(source.ClassificationConfigure);
        }
        if (source.TagConfigure != null) {
            this.TagConfigure = new MPSAIAnalysisConfigureInfo(source.TagConfigure);
        }
        if (source.CoverConfigure != null) {
            this.CoverConfigure = new MPSAIAnalysisConfigureInfo(source.CoverConfigure);
        }
        if (source.FrameTagConfigure != null) {
            this.FrameTagConfigure = new MPSAIAnalysisConfigureInfo(source.FrameTagConfigure);
        }
        if (source.SplitConfigure != null) {
            this.SplitConfigure = new MPSAIAnalysisConfigureInfo(source.SplitConfigure);
        }
        if (source.HighlightConfigure != null) {
            this.HighlightConfigure = new MPSAIAnalysisConfigureInfo(source.HighlightConfigure);
        }
        if (source.OpeningAndEndingConfigure != null) {
            this.OpeningAndEndingConfigure = new MPSAIAnalysisConfigureInfo(source.OpeningAndEndingConfigure);
        }
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
        this.setParamObj(map, prefix + "SplitConfigure.", this.SplitConfigure);
        this.setParamObj(map, prefix + "HighlightConfigure.", this.HighlightConfigure);
        this.setParamObj(map, prefix + "OpeningAndEndingConfigure.", this.OpeningAndEndingConfigure);

    }
}

