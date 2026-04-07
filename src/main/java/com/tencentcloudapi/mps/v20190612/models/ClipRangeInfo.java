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

public class ClipRangeInfo extends AbstractModel {

    /**
    * vod类型有效，内容有效起始时间，可选Entire和SpecifyTimeRange。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 偏移量,Type为SpecifyTimeRange时有效。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 开始偏移量,Type为SpecifyTimeRange时有效。
    */
    @SerializedName("StartOffset")
    @Expose
    private Long StartOffset;

    /**
    * 结束偏移量,Type为SpecifyTimeRange时有效。
    */
    @SerializedName("EndOffset")
    @Expose
    private Long EndOffset;

    /**
     * Get vod类型有效，内容有效起始时间，可选Entire和SpecifyTimeRange。 
     * @return Type vod类型有效，内容有效起始时间，可选Entire和SpecifyTimeRange。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set vod类型有效，内容有效起始时间，可选Entire和SpecifyTimeRange。
     * @param Type vod类型有效，内容有效起始时间，可选Entire和SpecifyTimeRange。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 偏移量,Type为SpecifyTimeRange时有效。 
     * @return Offset 偏移量,Type为SpecifyTimeRange时有效。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量,Type为SpecifyTimeRange时有效。
     * @param Offset 偏移量,Type为SpecifyTimeRange时有效。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 开始偏移量,Type为SpecifyTimeRange时有效。 
     * @return StartOffset 开始偏移量,Type为SpecifyTimeRange时有效。
     */
    public Long getStartOffset() {
        return this.StartOffset;
    }

    /**
     * Set 开始偏移量,Type为SpecifyTimeRange时有效。
     * @param StartOffset 开始偏移量,Type为SpecifyTimeRange时有效。
     */
    public void setStartOffset(Long StartOffset) {
        this.StartOffset = StartOffset;
    }

    /**
     * Get 结束偏移量,Type为SpecifyTimeRange时有效。 
     * @return EndOffset 结束偏移量,Type为SpecifyTimeRange时有效。
     */
    public Long getEndOffset() {
        return this.EndOffset;
    }

    /**
     * Set 结束偏移量,Type为SpecifyTimeRange时有效。
     * @param EndOffset 结束偏移量,Type为SpecifyTimeRange时有效。
     */
    public void setEndOffset(Long EndOffset) {
        this.EndOffset = EndOffset;
    }

    public ClipRangeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClipRangeInfo(ClipRangeInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.StartOffset != null) {
            this.StartOffset = new Long(source.StartOffset);
        }
        if (source.EndOffset != null) {
            this.EndOffset = new Long(source.EndOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "StartOffset", this.StartOffset);
        this.setParamSimple(map, prefix + "EndOffset", this.EndOffset);

    }
}

