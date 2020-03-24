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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditingInfo extends AbstractModel{

    /**
    * 视频标签识别任务参数，不填则不开启。
    */
    @SerializedName("TagEditingInfo")
    @Expose
    private TagEditingInfo TagEditingInfo;

    /**
    * 视频分类识别任务参数，不填则不开启。
    */
    @SerializedName("ClassificationEditingInfo")
    @Expose
    private ClassificationEditingInfo ClassificationEditingInfo;

    /**
    * 智能拆条任务参数，不填则不开启。
    */
    @SerializedName("StripEditingInfo")
    @Expose
    private StripEditingInfo StripEditingInfo;

    /**
    * 智能集锦任务参数，不填则不开启。
    */
    @SerializedName("HighlightsEditingInfo")
    @Expose
    private HighlightsEditingInfo HighlightsEditingInfo;

    /**
    * 智能封面任务参数，不填则不开启。
    */
    @SerializedName("CoverEditingInfo")
    @Expose
    private CoverEditingInfo CoverEditingInfo;

    /**
    * 片头片尾识别任务参数，不填则不开启。
    */
    @SerializedName("OpeningEndingEditingInfo")
    @Expose
    private OpeningEndingEditingInfo OpeningEndingEditingInfo;

    /**
     * Get 视频标签识别任务参数，不填则不开启。 
     * @return TagEditingInfo 视频标签识别任务参数，不填则不开启。
     */
    public TagEditingInfo getTagEditingInfo() {
        return this.TagEditingInfo;
    }

    /**
     * Set 视频标签识别任务参数，不填则不开启。
     * @param TagEditingInfo 视频标签识别任务参数，不填则不开启。
     */
    public void setTagEditingInfo(TagEditingInfo TagEditingInfo) {
        this.TagEditingInfo = TagEditingInfo;
    }

    /**
     * Get 视频分类识别任务参数，不填则不开启。 
     * @return ClassificationEditingInfo 视频分类识别任务参数，不填则不开启。
     */
    public ClassificationEditingInfo getClassificationEditingInfo() {
        return this.ClassificationEditingInfo;
    }

    /**
     * Set 视频分类识别任务参数，不填则不开启。
     * @param ClassificationEditingInfo 视频分类识别任务参数，不填则不开启。
     */
    public void setClassificationEditingInfo(ClassificationEditingInfo ClassificationEditingInfo) {
        this.ClassificationEditingInfo = ClassificationEditingInfo;
    }

    /**
     * Get 智能拆条任务参数，不填则不开启。 
     * @return StripEditingInfo 智能拆条任务参数，不填则不开启。
     */
    public StripEditingInfo getStripEditingInfo() {
        return this.StripEditingInfo;
    }

    /**
     * Set 智能拆条任务参数，不填则不开启。
     * @param StripEditingInfo 智能拆条任务参数，不填则不开启。
     */
    public void setStripEditingInfo(StripEditingInfo StripEditingInfo) {
        this.StripEditingInfo = StripEditingInfo;
    }

    /**
     * Get 智能集锦任务参数，不填则不开启。 
     * @return HighlightsEditingInfo 智能集锦任务参数，不填则不开启。
     */
    public HighlightsEditingInfo getHighlightsEditingInfo() {
        return this.HighlightsEditingInfo;
    }

    /**
     * Set 智能集锦任务参数，不填则不开启。
     * @param HighlightsEditingInfo 智能集锦任务参数，不填则不开启。
     */
    public void setHighlightsEditingInfo(HighlightsEditingInfo HighlightsEditingInfo) {
        this.HighlightsEditingInfo = HighlightsEditingInfo;
    }

    /**
     * Get 智能封面任务参数，不填则不开启。 
     * @return CoverEditingInfo 智能封面任务参数，不填则不开启。
     */
    public CoverEditingInfo getCoverEditingInfo() {
        return this.CoverEditingInfo;
    }

    /**
     * Set 智能封面任务参数，不填则不开启。
     * @param CoverEditingInfo 智能封面任务参数，不填则不开启。
     */
    public void setCoverEditingInfo(CoverEditingInfo CoverEditingInfo) {
        this.CoverEditingInfo = CoverEditingInfo;
    }

    /**
     * Get 片头片尾识别任务参数，不填则不开启。 
     * @return OpeningEndingEditingInfo 片头片尾识别任务参数，不填则不开启。
     */
    public OpeningEndingEditingInfo getOpeningEndingEditingInfo() {
        return this.OpeningEndingEditingInfo;
    }

    /**
     * Set 片头片尾识别任务参数，不填则不开启。
     * @param OpeningEndingEditingInfo 片头片尾识别任务参数，不填则不开启。
     */
    public void setOpeningEndingEditingInfo(OpeningEndingEditingInfo OpeningEndingEditingInfo) {
        this.OpeningEndingEditingInfo = OpeningEndingEditingInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TagEditingInfo.", this.TagEditingInfo);
        this.setParamObj(map, prefix + "ClassificationEditingInfo.", this.ClassificationEditingInfo);
        this.setParamObj(map, prefix + "StripEditingInfo.", this.StripEditingInfo);
        this.setParamObj(map, prefix + "HighlightsEditingInfo.", this.HighlightsEditingInfo);
        this.setParamObj(map, prefix + "CoverEditingInfo.", this.CoverEditingInfo);
        this.setParamObj(map, prefix + "OpeningEndingEditingInfo.", this.OpeningEndingEditingInfo);

    }
}

