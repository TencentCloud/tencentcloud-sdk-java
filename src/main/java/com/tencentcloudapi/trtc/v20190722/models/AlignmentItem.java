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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlignmentItem extends AbstractModel {

    /**
    * 字幕对应的时间起点
    */
    @SerializedName("TimeBeginMs")
    @Expose
    private Long TimeBeginMs;

    /**
    * 字幕对应的时间尾点
    */
    @SerializedName("TimeEndMs")
    @Expose
    private Long TimeEndMs;

    /**
    * 字幕对应的文本索引起点
    */
    @SerializedName("TextBegin")
    @Expose
    private Long TextBegin;

    /**
    * 字幕对应的文本索引尾点
    */
    @SerializedName("TextEnd")
    @Expose
    private Long TextEnd;

    /**
     * Get 字幕对应的时间起点 
     * @return TimeBeginMs 字幕对应的时间起点
     */
    public Long getTimeBeginMs() {
        return this.TimeBeginMs;
    }

    /**
     * Set 字幕对应的时间起点
     * @param TimeBeginMs 字幕对应的时间起点
     */
    public void setTimeBeginMs(Long TimeBeginMs) {
        this.TimeBeginMs = TimeBeginMs;
    }

    /**
     * Get 字幕对应的时间尾点 
     * @return TimeEndMs 字幕对应的时间尾点
     */
    public Long getTimeEndMs() {
        return this.TimeEndMs;
    }

    /**
     * Set 字幕对应的时间尾点
     * @param TimeEndMs 字幕对应的时间尾点
     */
    public void setTimeEndMs(Long TimeEndMs) {
        this.TimeEndMs = TimeEndMs;
    }

    /**
     * Get 字幕对应的文本索引起点 
     * @return TextBegin 字幕对应的文本索引起点
     */
    public Long getTextBegin() {
        return this.TextBegin;
    }

    /**
     * Set 字幕对应的文本索引起点
     * @param TextBegin 字幕对应的文本索引起点
     */
    public void setTextBegin(Long TextBegin) {
        this.TextBegin = TextBegin;
    }

    /**
     * Get 字幕对应的文本索引尾点 
     * @return TextEnd 字幕对应的文本索引尾点
     */
    public Long getTextEnd() {
        return this.TextEnd;
    }

    /**
     * Set 字幕对应的文本索引尾点
     * @param TextEnd 字幕对应的文本索引尾点
     */
    public void setTextEnd(Long TextEnd) {
        this.TextEnd = TextEnd;
    }

    public AlignmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlignmentItem(AlignmentItem source) {
        if (source.TimeBeginMs != null) {
            this.TimeBeginMs = new Long(source.TimeBeginMs);
        }
        if (source.TimeEndMs != null) {
            this.TimeEndMs = new Long(source.TimeEndMs);
        }
        if (source.TextBegin != null) {
            this.TextBegin = new Long(source.TextBegin);
        }
        if (source.TextEnd != null) {
            this.TextEnd = new Long(source.TextEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeBeginMs", this.TimeBeginMs);
        this.setParamSimple(map, prefix + "TimeEndMs", this.TimeEndMs);
        this.setParamSimple(map, prefix + "TextBegin", this.TextBegin);
        this.setParamSimple(map, prefix + "TextEnd", this.TextEnd);

    }
}

