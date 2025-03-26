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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIAnalysisTemplateItem extends AbstractModel {

    /**
    * 智能分析模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 智能分析模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 智能分析模板描述信息。
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
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 智能分析模板唯一标识。 
     * @return Definition 智能分析模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 智能分析模板唯一标识。
     * @param Definition 智能分析模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 智能分析模板名称。 
     * @return Name 智能分析模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 智能分析模板名称。
     * @param Name 智能分析模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 智能分析模板描述信息。 
     * @return Comment 智能分析模板描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 智能分析模板描述信息。
     * @param Comment 智能分析模板描述信息。
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
     * Get 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AIAnalysisTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAnalysisTemplateItem(AIAnalysisTemplateItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ClassificationConfigure != null) {
            this.ClassificationConfigure = new ClassificationConfigureInfo(source.ClassificationConfigure);
        }
        if (source.TagConfigure != null) {
            this.TagConfigure = new TagConfigureInfo(source.TagConfigure);
        }
        if (source.CoverConfigure != null) {
            this.CoverConfigure = new CoverConfigureInfo(source.CoverConfigure);
        }
        if (source.FrameTagConfigure != null) {
            this.FrameTagConfigure = new FrameTagConfigureInfo(source.FrameTagConfigure);
        }
        if (source.HighlightConfigure != null) {
            this.HighlightConfigure = new HighlightsConfigureInfo(source.HighlightConfigure);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
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
        this.setParamObj(map, prefix + "HighlightConfigure.", this.HighlightConfigure);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

