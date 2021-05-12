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

public class FrameTagItem extends AbstractModel{

    /**
    * 标签起始时间戳PTS(ms)
    */
    @SerializedName("StartPts")
    @Expose
    private Long StartPts;

    /**
    * 语句结束时间戳PTS(ms)
    */
    @SerializedName("EndPts")
    @Expose
    private Long EndPts;

    /**
    * 字符串形式的起始结束时间
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * 标签数组
    */
    @SerializedName("TagItems")
    @Expose
    private TagItem [] TagItems;

    /**
     * Get 标签起始时间戳PTS(ms) 
     * @return StartPts 标签起始时间戳PTS(ms)
     */
    public Long getStartPts() {
        return this.StartPts;
    }

    /**
     * Set 标签起始时间戳PTS(ms)
     * @param StartPts 标签起始时间戳PTS(ms)
     */
    public void setStartPts(Long StartPts) {
        this.StartPts = StartPts;
    }

    /**
     * Get 语句结束时间戳PTS(ms) 
     * @return EndPts 语句结束时间戳PTS(ms)
     */
    public Long getEndPts() {
        return this.EndPts;
    }

    /**
     * Set 语句结束时间戳PTS(ms)
     * @param EndPts 语句结束时间戳PTS(ms)
     */
    public void setEndPts(Long EndPts) {
        this.EndPts = EndPts;
    }

    /**
     * Get 字符串形式的起始结束时间 
     * @return Period 字符串形式的起始结束时间
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set 字符串形式的起始结束时间
     * @param Period 字符串形式的起始结束时间
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get 标签数组 
     * @return TagItems 标签数组
     */
    public TagItem [] getTagItems() {
        return this.TagItems;
    }

    /**
     * Set 标签数组
     * @param TagItems 标签数组
     */
    public void setTagItems(TagItem [] TagItems) {
        this.TagItems = TagItems;
    }

    public FrameTagItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrameTagItem(FrameTagItem source) {
        if (source.StartPts != null) {
            this.StartPts = new Long(source.StartPts);
        }
        if (source.EndPts != null) {
            this.EndPts = new Long(source.EndPts);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
        if (source.TagItems != null) {
            this.TagItems = new TagItem[source.TagItems.length];
            for (int i = 0; i < source.TagItems.length; i++) {
                this.TagItems[i] = new TagItem(source.TagItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartPts", this.StartPts);
        this.setParamSimple(map, prefix + "EndPts", this.EndPts);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArrayObj(map, prefix + "TagItems.", this.TagItems);

    }
}

