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

public class ExtractBlindWatermarkTaskConfig extends AbstractModel {

    /**
    * 当提取数字水印类型为blind-abseq时有效，用于指定输入视频的切片时长，单位：毫秒。
如果不填默认切片时长为5秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentDuration")
    @Expose
    private Long SegmentDuration;

    /**
     * Get 当提取数字水印类型为blind-abseq时有效，用于指定输入视频的切片时长，单位：毫秒。
如果不填默认切片时长为5秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentDuration 当提取数字水印类型为blind-abseq时有效，用于指定输入视频的切片时长，单位：毫秒。
如果不填默认切片时长为5秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSegmentDuration() {
        return this.SegmentDuration;
    }

    /**
     * Set 当提取数字水印类型为blind-abseq时有效，用于指定输入视频的切片时长，单位：毫秒。
如果不填默认切片时长为5秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentDuration 当提取数字水印类型为blind-abseq时有效，用于指定输入视频的切片时长，单位：毫秒。
如果不填默认切片时长为5秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentDuration(Long SegmentDuration) {
        this.SegmentDuration = SegmentDuration;
    }

    public ExtractBlindWatermarkTaskConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractBlindWatermarkTaskConfig(ExtractBlindWatermarkTaskConfig source) {
        if (source.SegmentDuration != null) {
            this.SegmentDuration = new Long(source.SegmentDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SegmentDuration", this.SegmentDuration);

    }
}

