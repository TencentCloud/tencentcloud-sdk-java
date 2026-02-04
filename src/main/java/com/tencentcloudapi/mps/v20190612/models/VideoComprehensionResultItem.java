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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoComprehensionResultItem extends AbstractModel {

    /**
    * 分镜片段起始时间（单位：秒）

    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * 分镜片段结束时间（单位：秒）
    */
    @SerializedName("EndTime")
    @Expose
    private Float EndTime;

    /**
    * 分镜片段标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 分镜片段信息描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 分镜片段关键词
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
     * Get 分镜片段起始时间（单位：秒）
 
     * @return StartTime 分镜片段起始时间（单位：秒）

     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 分镜片段起始时间（单位：秒）

     * @param StartTime 分镜片段起始时间（单位：秒）

     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 分镜片段结束时间（单位：秒） 
     * @return EndTime 分镜片段结束时间（单位：秒）
     */
    public Float getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 分镜片段结束时间（单位：秒）
     * @param EndTime 分镜片段结束时间（单位：秒）
     */
    public void setEndTime(Float EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分镜片段标题 
     * @return Title 分镜片段标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 分镜片段标题
     * @param Title 分镜片段标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 分镜片段信息描述 
     * @return Description 分镜片段信息描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 分镜片段信息描述
     * @param Description 分镜片段信息描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 分镜片段关键词 
     * @return Keywords 分镜片段关键词
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 分镜片段关键词
     * @param Keywords 分镜片段关键词
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    public VideoComprehensionResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoComprehensionResultItem(VideoComprehensionResultItem source) {
        if (source.StartTime != null) {
            this.StartTime = new Float(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Float(source.EndTime);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);

    }
}

