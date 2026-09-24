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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeeEventIdFilterConfig extends AbstractModel {

    /**
    * <p>包含的云存事件 ID 集合</p>
    */
    @SerializedName("IncludeOnly")
    @Expose
    private String [] IncludeOnly;

    /**
    * <p>排除的云存事件 ID 集合</p>
    */
    @SerializedName("Exclude")
    @Expose
    private String [] Exclude;

    /**
    * <p>触发分析的时机</p><p>枚举值：</p><ul><li>end： 在云存事件结束时触发视频理解</li><li>start： 在云存事件开始时触发视频理解</li><li>image_and_video： 上传云存事件缩略图后触发图片理解，并且在云存事件结束时触发视频理解</li></ul><p>默认值：end</p>
    */
    @SerializedName("TriggerAt")
    @Expose
    private String TriggerAt;

    /**
     * Get <p>包含的云存事件 ID 集合</p> 
     * @return IncludeOnly <p>包含的云存事件 ID 集合</p>
     */
    public String [] getIncludeOnly() {
        return this.IncludeOnly;
    }

    /**
     * Set <p>包含的云存事件 ID 集合</p>
     * @param IncludeOnly <p>包含的云存事件 ID 集合</p>
     */
    public void setIncludeOnly(String [] IncludeOnly) {
        this.IncludeOnly = IncludeOnly;
    }

    /**
     * Get <p>排除的云存事件 ID 集合</p> 
     * @return Exclude <p>排除的云存事件 ID 集合</p>
     */
    public String [] getExclude() {
        return this.Exclude;
    }

    /**
     * Set <p>排除的云存事件 ID 集合</p>
     * @param Exclude <p>排除的云存事件 ID 集合</p>
     */
    public void setExclude(String [] Exclude) {
        this.Exclude = Exclude;
    }

    /**
     * Get <p>触发分析的时机</p><p>枚举值：</p><ul><li>end： 在云存事件结束时触发视频理解</li><li>start： 在云存事件开始时触发视频理解</li><li>image_and_video： 上传云存事件缩略图后触发图片理解，并且在云存事件结束时触发视频理解</li></ul><p>默认值：end</p> 
     * @return TriggerAt <p>触发分析的时机</p><p>枚举值：</p><ul><li>end： 在云存事件结束时触发视频理解</li><li>start： 在云存事件开始时触发视频理解</li><li>image_and_video： 上传云存事件缩略图后触发图片理解，并且在云存事件结束时触发视频理解</li></ul><p>默认值：end</p>
     */
    public String getTriggerAt() {
        return this.TriggerAt;
    }

    /**
     * Set <p>触发分析的时机</p><p>枚举值：</p><ul><li>end： 在云存事件结束时触发视频理解</li><li>start： 在云存事件开始时触发视频理解</li><li>image_and_video： 上传云存事件缩略图后触发图片理解，并且在云存事件结束时触发视频理解</li></ul><p>默认值：end</p>
     * @param TriggerAt <p>触发分析的时机</p><p>枚举值：</p><ul><li>end： 在云存事件结束时触发视频理解</li><li>start： 在云存事件开始时触发视频理解</li><li>image_and_video： 上传云存事件缩略图后触发图片理解，并且在云存事件结束时触发视频理解</li></ul><p>默认值：end</p>
     */
    public void setTriggerAt(String TriggerAt) {
        this.TriggerAt = TriggerAt;
    }

    public SeeEventIdFilterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeEventIdFilterConfig(SeeEventIdFilterConfig source) {
        if (source.IncludeOnly != null) {
            this.IncludeOnly = new String[source.IncludeOnly.length];
            for (int i = 0; i < source.IncludeOnly.length; i++) {
                this.IncludeOnly[i] = new String(source.IncludeOnly[i]);
            }
        }
        if (source.Exclude != null) {
            this.Exclude = new String[source.Exclude.length];
            for (int i = 0; i < source.Exclude.length; i++) {
                this.Exclude[i] = new String(source.Exclude[i]);
            }
        }
        if (source.TriggerAt != null) {
            this.TriggerAt = new String(source.TriggerAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IncludeOnly.", this.IncludeOnly);
        this.setParamArraySimple(map, prefix + "Exclude.", this.Exclude);
        this.setParamSimple(map, prefix + "TriggerAt", this.TriggerAt);

    }
}

