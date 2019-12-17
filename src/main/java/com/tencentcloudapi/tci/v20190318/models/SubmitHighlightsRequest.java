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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitHighlightsRequest extends AbstractModel{

    /**
    * 表情配置开关项。
    */
    @SerializedName("Functions")
    @Expose
    private HLFunction Functions;

    /**
    * 视频url。
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 视频类型及来源，目前只支持点播类型："vod_url"。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 需要检索的人脸合集库，不在库中的人脸将不参与精彩集锦。
    */
    @SerializedName("LibIds")
    @Expose
    private String [] LibIds;

    /**
    * 视频处理的抽帧间隔，单位毫秒。建议留空。
    */
    @SerializedName("FrameInterval")
    @Expose
    private Long FrameInterval;

    /**
    * 关键词语言类型，0为英文，1为中文。
    */
    @SerializedName("KeywordsLanguage")
    @Expose
    private Long KeywordsLanguage;

    /**
    * 关键词数组，当且仅当Funtions中的EnableKeywordWonderfulTime为true时有意义，匹配相应的关键字。
    */
    @SerializedName("KeywordsStrings")
    @Expose
    private String [] KeywordsStrings;

    /**
    * 处理视频的总时长，单位毫秒。该值为0或未设置时，默认值两小时生效；当该值大于视频实际时长时，视频实际时长生效；当该值小于视频实际时长时，该值生效；当获取视频实际时长失败时，若该值设置则生效，否则默认值生效。建议留空。
    */
    @SerializedName("MaxVideoDuration")
    @Expose
    private Long MaxVideoDuration;

    /**
    * 人脸检索的相似度阈值，默认值0.89。建议留空。
    */
    @SerializedName("SimThreshold")
    @Expose
    private Float SimThreshold;

    /**
     * Get 表情配置开关项。 
     * @return Functions 表情配置开关项。
     */
    public HLFunction getFunctions() {
        return this.Functions;
    }

    /**
     * Set 表情配置开关项。
     * @param Functions 表情配置开关项。
     */
    public void setFunctions(HLFunction Functions) {
        this.Functions = Functions;
    }

    /**
     * Get 视频url。 
     * @return FileContent 视频url。
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 视频url。
     * @param FileContent 视频url。
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get 视频类型及来源，目前只支持点播类型："vod_url"。 
     * @return FileType 视频类型及来源，目前只支持点播类型："vod_url"。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 视频类型及来源，目前只支持点播类型："vod_url"。
     * @param FileType 视频类型及来源，目前只支持点播类型："vod_url"。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 需要检索的人脸合集库，不在库中的人脸将不参与精彩集锦。 
     * @return LibIds 需要检索的人脸合集库，不在库中的人脸将不参与精彩集锦。
     */
    public String [] getLibIds() {
        return this.LibIds;
    }

    /**
     * Set 需要检索的人脸合集库，不在库中的人脸将不参与精彩集锦。
     * @param LibIds 需要检索的人脸合集库，不在库中的人脸将不参与精彩集锦。
     */
    public void setLibIds(String [] LibIds) {
        this.LibIds = LibIds;
    }

    /**
     * Get 视频处理的抽帧间隔，单位毫秒。建议留空。 
     * @return FrameInterval 视频处理的抽帧间隔，单位毫秒。建议留空。
     */
    public Long getFrameInterval() {
        return this.FrameInterval;
    }

    /**
     * Set 视频处理的抽帧间隔，单位毫秒。建议留空。
     * @param FrameInterval 视频处理的抽帧间隔，单位毫秒。建议留空。
     */
    public void setFrameInterval(Long FrameInterval) {
        this.FrameInterval = FrameInterval;
    }

    /**
     * Get 关键词语言类型，0为英文，1为中文。 
     * @return KeywordsLanguage 关键词语言类型，0为英文，1为中文。
     */
    public Long getKeywordsLanguage() {
        return this.KeywordsLanguage;
    }

    /**
     * Set 关键词语言类型，0为英文，1为中文。
     * @param KeywordsLanguage 关键词语言类型，0为英文，1为中文。
     */
    public void setKeywordsLanguage(Long KeywordsLanguage) {
        this.KeywordsLanguage = KeywordsLanguage;
    }

    /**
     * Get 关键词数组，当且仅当Funtions中的EnableKeywordWonderfulTime为true时有意义，匹配相应的关键字。 
     * @return KeywordsStrings 关键词数组，当且仅当Funtions中的EnableKeywordWonderfulTime为true时有意义，匹配相应的关键字。
     */
    public String [] getKeywordsStrings() {
        return this.KeywordsStrings;
    }

    /**
     * Set 关键词数组，当且仅当Funtions中的EnableKeywordWonderfulTime为true时有意义，匹配相应的关键字。
     * @param KeywordsStrings 关键词数组，当且仅当Funtions中的EnableKeywordWonderfulTime为true时有意义，匹配相应的关键字。
     */
    public void setKeywordsStrings(String [] KeywordsStrings) {
        this.KeywordsStrings = KeywordsStrings;
    }

    /**
     * Get 处理视频的总时长，单位毫秒。该值为0或未设置时，默认值两小时生效；当该值大于视频实际时长时，视频实际时长生效；当该值小于视频实际时长时，该值生效；当获取视频实际时长失败时，若该值设置则生效，否则默认值生效。建议留空。 
     * @return MaxVideoDuration 处理视频的总时长，单位毫秒。该值为0或未设置时，默认值两小时生效；当该值大于视频实际时长时，视频实际时长生效；当该值小于视频实际时长时，该值生效；当获取视频实际时长失败时，若该值设置则生效，否则默认值生效。建议留空。
     */
    public Long getMaxVideoDuration() {
        return this.MaxVideoDuration;
    }

    /**
     * Set 处理视频的总时长，单位毫秒。该值为0或未设置时，默认值两小时生效；当该值大于视频实际时长时，视频实际时长生效；当该值小于视频实际时长时，该值生效；当获取视频实际时长失败时，若该值设置则生效，否则默认值生效。建议留空。
     * @param MaxVideoDuration 处理视频的总时长，单位毫秒。该值为0或未设置时，默认值两小时生效；当该值大于视频实际时长时，视频实际时长生效；当该值小于视频实际时长时，该值生效；当获取视频实际时长失败时，若该值设置则生效，否则默认值生效。建议留空。
     */
    public void setMaxVideoDuration(Long MaxVideoDuration) {
        this.MaxVideoDuration = MaxVideoDuration;
    }

    /**
     * Get 人脸检索的相似度阈值，默认值0.89。建议留空。 
     * @return SimThreshold 人脸检索的相似度阈值，默认值0.89。建议留空。
     */
    public Float getSimThreshold() {
        return this.SimThreshold;
    }

    /**
     * Set 人脸检索的相似度阈值，默认值0.89。建议留空。
     * @param SimThreshold 人脸检索的相似度阈值，默认值0.89。建议留空。
     */
    public void setSimThreshold(Float SimThreshold) {
        this.SimThreshold = SimThreshold;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Functions.", this.Functions);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamArraySimple(map, prefix + "LibIds.", this.LibIds);
        this.setParamSimple(map, prefix + "FrameInterval", this.FrameInterval);
        this.setParamSimple(map, prefix + "KeywordsLanguage", this.KeywordsLanguage);
        this.setParamArraySimple(map, prefix + "KeywordsStrings.", this.KeywordsStrings);
        this.setParamSimple(map, prefix + "MaxVideoDuration", this.MaxVideoDuration);
        this.setParamSimple(map, prefix + "SimThreshold", this.SimThreshold);

    }
}

