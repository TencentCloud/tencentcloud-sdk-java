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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAIAnalysisTemplateRequest extends AbstractModel{

    /**
    * 视频内容分析模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

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
    private ClassificationConfigureInfoForUpdate ClassificationConfigure;

    /**
    * 智能标签任务控制参数。
    */
    @SerializedName("TagConfigure")
    @Expose
    private TagConfigureInfoForUpdate TagConfigure;

    /**
    * 智能封面任务控制参数。
    */
    @SerializedName("CoverConfigure")
    @Expose
    private CoverConfigureInfoForUpdate CoverConfigure;

    /**
    * 智能按帧标签任务控制参数。
    */
    @SerializedName("FrameTagConfigure")
    @Expose
    private FrameTagConfigureInfoForUpdate FrameTagConfigure;

    /**
     * Get 视频内容分析模板唯一标识。 
     * @return Definition 视频内容分析模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 视频内容分析模板唯一标识。
     * @param Definition 视频内容分析模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

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
    public ClassificationConfigureInfoForUpdate getClassificationConfigure() {
        return this.ClassificationConfigure;
    }

    /**
     * Set 智能分类任务控制参数。
     * @param ClassificationConfigure 智能分类任务控制参数。
     */
    public void setClassificationConfigure(ClassificationConfigureInfoForUpdate ClassificationConfigure) {
        this.ClassificationConfigure = ClassificationConfigure;
    }

    /**
     * Get 智能标签任务控制参数。 
     * @return TagConfigure 智能标签任务控制参数。
     */
    public TagConfigureInfoForUpdate getTagConfigure() {
        return this.TagConfigure;
    }

    /**
     * Set 智能标签任务控制参数。
     * @param TagConfigure 智能标签任务控制参数。
     */
    public void setTagConfigure(TagConfigureInfoForUpdate TagConfigure) {
        this.TagConfigure = TagConfigure;
    }

    /**
     * Get 智能封面任务控制参数。 
     * @return CoverConfigure 智能封面任务控制参数。
     */
    public CoverConfigureInfoForUpdate getCoverConfigure() {
        return this.CoverConfigure;
    }

    /**
     * Set 智能封面任务控制参数。
     * @param CoverConfigure 智能封面任务控制参数。
     */
    public void setCoverConfigure(CoverConfigureInfoForUpdate CoverConfigure) {
        this.CoverConfigure = CoverConfigure;
    }

    /**
     * Get 智能按帧标签任务控制参数。 
     * @return FrameTagConfigure 智能按帧标签任务控制参数。
     */
    public FrameTagConfigureInfoForUpdate getFrameTagConfigure() {
        return this.FrameTagConfigure;
    }

    /**
     * Set 智能按帧标签任务控制参数。
     * @param FrameTagConfigure 智能按帧标签任务控制参数。
     */
    public void setFrameTagConfigure(FrameTagConfigureInfoForUpdate FrameTagConfigure) {
        this.FrameTagConfigure = FrameTagConfigure;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "ClassificationConfigure.", this.ClassificationConfigure);
        this.setParamObj(map, prefix + "TagConfigure.", this.TagConfigure);
        this.setParamObj(map, prefix + "CoverConfigure.", this.CoverConfigure);
        this.setParamObj(map, prefix + "FrameTagConfigure.", this.FrameTagConfigure);

    }
}

