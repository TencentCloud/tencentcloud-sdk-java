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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotByTimeOffsetTaskInput extends AbstractModel {

    /**
    * <p>指定时间点截图模板 ID。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>截图时间点列表，时间点支持 s、% 两种格式：</p><li>当字符串以 s 结尾，表示时间点单位为秒，如 3.5s 表示时间点为第3.5秒；</li><li>当字符串以 % 结尾，表示时间点为视频时长的百分比大小，如10%表示时间点为视频前第10%的时间。</li>
    */
    @SerializedName("ExtTimeOffsetSet")
    @Expose
    private String [] ExtTimeOffsetSet;

    /**
    * <p>截图时间点列表，单位为<font color="red">毫秒</font>。此参数已不再建议使用，建议您使用 ExtTimeOffsetSet 参数。</p>
    */
    @SerializedName("TimeOffsetSet")
    @Expose
    private Float [] TimeOffsetSet;

    /**
    * <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p>
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
     * Get <p>指定时间点截图模板 ID。</p> 
     * @return Definition <p>指定时间点截图模板 ID。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>指定时间点截图模板 ID。</p>
     * @param Definition <p>指定时间点截图模板 ID。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>截图时间点列表，时间点支持 s、% 两种格式：</p><li>当字符串以 s 结尾，表示时间点单位为秒，如 3.5s 表示时间点为第3.5秒；</li><li>当字符串以 % 结尾，表示时间点为视频时长的百分比大小，如10%表示时间点为视频前第10%的时间。</li> 
     * @return ExtTimeOffsetSet <p>截图时间点列表，时间点支持 s、% 两种格式：</p><li>当字符串以 s 结尾，表示时间点单位为秒，如 3.5s 表示时间点为第3.5秒；</li><li>当字符串以 % 结尾，表示时间点为视频时长的百分比大小，如10%表示时间点为视频前第10%的时间。</li>
     */
    public String [] getExtTimeOffsetSet() {
        return this.ExtTimeOffsetSet;
    }

    /**
     * Set <p>截图时间点列表，时间点支持 s、% 两种格式：</p><li>当字符串以 s 结尾，表示时间点单位为秒，如 3.5s 表示时间点为第3.5秒；</li><li>当字符串以 % 结尾，表示时间点为视频时长的百分比大小，如10%表示时间点为视频前第10%的时间。</li>
     * @param ExtTimeOffsetSet <p>截图时间点列表，时间点支持 s、% 两种格式：</p><li>当字符串以 s 结尾，表示时间点单位为秒，如 3.5s 表示时间点为第3.5秒；</li><li>当字符串以 % 结尾，表示时间点为视频时长的百分比大小，如10%表示时间点为视频前第10%的时间。</li>
     */
    public void setExtTimeOffsetSet(String [] ExtTimeOffsetSet) {
        this.ExtTimeOffsetSet = ExtTimeOffsetSet;
    }

    /**
     * Get <p>截图时间点列表，单位为<font color="red">毫秒</font>。此参数已不再建议使用，建议您使用 ExtTimeOffsetSet 参数。</p> 
     * @return TimeOffsetSet <p>截图时间点列表，单位为<font color="red">毫秒</font>。此参数已不再建议使用，建议您使用 ExtTimeOffsetSet 参数。</p>
     */
    public Float [] getTimeOffsetSet() {
        return this.TimeOffsetSet;
    }

    /**
     * Set <p>截图时间点列表，单位为<font color="red">毫秒</font>。此参数已不再建议使用，建议您使用 ExtTimeOffsetSet 参数。</p>
     * @param TimeOffsetSet <p>截图时间点列表，单位为<font color="red">毫秒</font>。此参数已不再建议使用，建议您使用 ExtTimeOffsetSet 参数。</p>
     */
    public void setTimeOffsetSet(Float [] TimeOffsetSet) {
        this.TimeOffsetSet = TimeOffsetSet;
    }

    /**
     * Get <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p> 
     * @return WatermarkSet <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p>
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p>
     * @param WatermarkSet <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p>
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    public SnapshotByTimeOffsetTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotByTimeOffsetTaskInput(SnapshotByTimeOffsetTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ExtTimeOffsetSet != null) {
            this.ExtTimeOffsetSet = new String[source.ExtTimeOffsetSet.length];
            for (int i = 0; i < source.ExtTimeOffsetSet.length; i++) {
                this.ExtTimeOffsetSet[i] = new String(source.ExtTimeOffsetSet[i]);
            }
        }
        if (source.TimeOffsetSet != null) {
            this.TimeOffsetSet = new Float[source.TimeOffsetSet.length];
            for (int i = 0; i < source.TimeOffsetSet.length; i++) {
                this.TimeOffsetSet[i] = new Float(source.TimeOffsetSet[i]);
            }
        }
        if (source.WatermarkSet != null) {
            this.WatermarkSet = new WatermarkInput[source.WatermarkSet.length];
            for (int i = 0; i < source.WatermarkSet.length; i++) {
                this.WatermarkSet[i] = new WatermarkInput(source.WatermarkSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArraySimple(map, prefix + "ExtTimeOffsetSet.", this.ExtTimeOffsetSet);
        this.setParamArraySimple(map, prefix + "TimeOffsetSet.", this.TimeOffsetSet);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);

    }
}

