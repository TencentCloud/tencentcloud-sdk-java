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

public class HighlightsInfomation extends AbstractModel{

    /**
    * 专注的起始与终止时间信息。
    */
    @SerializedName("Concentration")
    @Expose
    private TimeType [] Concentration;

    /**
    * 微笑的起始与终止时间信息。
    */
    @SerializedName("Smile")
    @Expose
    private TimeType [] Smile;

    /**
    * 高光集锦视频地址，保存剪辑好的视频地址。
    */
    @SerializedName("HighlightsUrl")
    @Expose
    private String HighlightsUrl;

    /**
    * 片段中识别出来的人脸ID。
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
     * Get 专注的起始与终止时间信息。 
     * @return Concentration 专注的起始与终止时间信息。
     */
    public TimeType [] getConcentration() {
        return this.Concentration;
    }

    /**
     * Set 专注的起始与终止时间信息。
     * @param Concentration 专注的起始与终止时间信息。
     */
    public void setConcentration(TimeType [] Concentration) {
        this.Concentration = Concentration;
    }

    /**
     * Get 微笑的起始与终止时间信息。 
     * @return Smile 微笑的起始与终止时间信息。
     */
    public TimeType [] getSmile() {
        return this.Smile;
    }

    /**
     * Set 微笑的起始与终止时间信息。
     * @param Smile 微笑的起始与终止时间信息。
     */
    public void setSmile(TimeType [] Smile) {
        this.Smile = Smile;
    }

    /**
     * Get 高光集锦视频地址，保存剪辑好的视频地址。 
     * @return HighlightsUrl 高光集锦视频地址，保存剪辑好的视频地址。
     */
    public String getHighlightsUrl() {
        return this.HighlightsUrl;
    }

    /**
     * Set 高光集锦视频地址，保存剪辑好的视频地址。
     * @param HighlightsUrl 高光集锦视频地址，保存剪辑好的视频地址。
     */
    public void setHighlightsUrl(String HighlightsUrl) {
        this.HighlightsUrl = HighlightsUrl;
    }

    /**
     * Get 片段中识别出来的人脸ID。 
     * @return PersonId 片段中识别出来的人脸ID。
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 片段中识别出来的人脸ID。
     * @param PersonId 片段中识别出来的人脸ID。
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Concentration.", this.Concentration);
        this.setParamArrayObj(map, prefix + "Smile.", this.Smile);
        this.setParamSimple(map, prefix + "HighlightsUrl", this.HighlightsUrl);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);

    }
}

