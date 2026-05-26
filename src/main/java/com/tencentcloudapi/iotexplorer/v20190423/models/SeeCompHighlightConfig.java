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

public class SeeCompHighlightConfig extends AbstractModel {

    /**
    * 是否禁用视频浓缩
    */
    @SerializedName("DisableHighlight")
    @Expose
    private Boolean DisableHighlight;

    /**
    * 包含在浓缩结果中的目标类别。可选值：

- `person`：人
- `pet`：宠物
- `vehicle`：车辆
    */
    @SerializedName("DetectTypes")
    @Expose
    private String [] DetectTypes;

    /**
    * 指定是否返回浓缩视频的摘要文本
    */
    @SerializedName("EnableSummary")
    @Expose
    private Boolean EnableSummary;

    /**
    * 指定返回的关键帧图像数量
    */
    @SerializedName("KeyFramesNum")
    @Expose
    private Long KeyFramesNum;

    /**
     * Get 是否禁用视频浓缩 
     * @return DisableHighlight 是否禁用视频浓缩
     */
    public Boolean getDisableHighlight() {
        return this.DisableHighlight;
    }

    /**
     * Set 是否禁用视频浓缩
     * @param DisableHighlight 是否禁用视频浓缩
     */
    public void setDisableHighlight(Boolean DisableHighlight) {
        this.DisableHighlight = DisableHighlight;
    }

    /**
     * Get 包含在浓缩结果中的目标类别。可选值：

- `person`：人
- `pet`：宠物
- `vehicle`：车辆 
     * @return DetectTypes 包含在浓缩结果中的目标类别。可选值：

- `person`：人
- `pet`：宠物
- `vehicle`：车辆
     */
    public String [] getDetectTypes() {
        return this.DetectTypes;
    }

    /**
     * Set 包含在浓缩结果中的目标类别。可选值：

- `person`：人
- `pet`：宠物
- `vehicle`：车辆
     * @param DetectTypes 包含在浓缩结果中的目标类别。可选值：

- `person`：人
- `pet`：宠物
- `vehicle`：车辆
     */
    public void setDetectTypes(String [] DetectTypes) {
        this.DetectTypes = DetectTypes;
    }

    /**
     * Get 指定是否返回浓缩视频的摘要文本 
     * @return EnableSummary 指定是否返回浓缩视频的摘要文本
     */
    public Boolean getEnableSummary() {
        return this.EnableSummary;
    }

    /**
     * Set 指定是否返回浓缩视频的摘要文本
     * @param EnableSummary 指定是否返回浓缩视频的摘要文本
     */
    public void setEnableSummary(Boolean EnableSummary) {
        this.EnableSummary = EnableSummary;
    }

    /**
     * Get 指定返回的关键帧图像数量 
     * @return KeyFramesNum 指定返回的关键帧图像数量
     */
    public Long getKeyFramesNum() {
        return this.KeyFramesNum;
    }

    /**
     * Set 指定返回的关键帧图像数量
     * @param KeyFramesNum 指定返回的关键帧图像数量
     */
    public void setKeyFramesNum(Long KeyFramesNum) {
        this.KeyFramesNum = KeyFramesNum;
    }

    public SeeCompHighlightConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeCompHighlightConfig(SeeCompHighlightConfig source) {
        if (source.DisableHighlight != null) {
            this.DisableHighlight = new Boolean(source.DisableHighlight);
        }
        if (source.DetectTypes != null) {
            this.DetectTypes = new String[source.DetectTypes.length];
            for (int i = 0; i < source.DetectTypes.length; i++) {
                this.DetectTypes[i] = new String(source.DetectTypes[i]);
            }
        }
        if (source.EnableSummary != null) {
            this.EnableSummary = new Boolean(source.EnableSummary);
        }
        if (source.KeyFramesNum != null) {
            this.KeyFramesNum = new Long(source.KeyFramesNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisableHighlight", this.DisableHighlight);
        this.setParamArraySimple(map, prefix + "DetectTypes.", this.DetectTypes);
        this.setParamSimple(map, prefix + "EnableSummary", this.EnableSummary);
        this.setParamSimple(map, prefix + "KeyFramesNum", this.KeyFramesNum);

    }
}

