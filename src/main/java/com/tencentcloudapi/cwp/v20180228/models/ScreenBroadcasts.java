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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenBroadcasts extends AbstractModel {

    /**
    * 播报文章标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 播报文章危险程度  0：无， 1：严重， 2: 高危， 3:中危， 4: 低危
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 发布时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 文章ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get 播报文章标题 
     * @return Title 播报文章标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 播报文章标题
     * @param Title 播报文章标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 播报文章危险程度  0：无， 1：严重， 2: 高危， 3:中危， 4: 低危 
     * @return Level 播报文章危险程度  0：无， 1：严重， 2: 高危， 3:中危， 4: 低危
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 播报文章危险程度  0：无， 1：严重， 2: 高危， 3:中危， 4: 低危
     * @param Level 播报文章危险程度  0：无， 1：严重， 2: 高危， 3:中危， 4: 低危
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 发布时间 
     * @return Time 发布时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 发布时间
     * @param Time 发布时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 文章ID 
     * @return Id 文章ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 文章ID
     * @param Id 文章ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public ScreenBroadcasts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenBroadcasts(ScreenBroadcasts source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

