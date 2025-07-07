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

public class BlindWatermarkConfig extends AbstractModel {

    /**
    * 增加盲水印
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddBlindWatermark")
    @Expose
    private AddBlindWatermarkConfig AddBlindWatermark;

    /**
    * 提取盲水印
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtractBlindWatermark")
    @Expose
    private ExtractBlindWatermarkConfig ExtractBlindWatermark;

    /**
    * 移除盲水印
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoveBlindWatermark")
    @Expose
    private RemoveBlindWatermarkConfig RemoveBlindWatermark;

    /**
     * Get 增加盲水印
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddBlindWatermark 增加盲水印
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AddBlindWatermarkConfig getAddBlindWatermark() {
        return this.AddBlindWatermark;
    }

    /**
     * Set 增加盲水印
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddBlindWatermark 增加盲水印
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddBlindWatermark(AddBlindWatermarkConfig AddBlindWatermark) {
        this.AddBlindWatermark = AddBlindWatermark;
    }

    /**
     * Get 提取盲水印
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtractBlindWatermark 提取盲水印
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtractBlindWatermarkConfig getExtractBlindWatermark() {
        return this.ExtractBlindWatermark;
    }

    /**
     * Set 提取盲水印
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtractBlindWatermark 提取盲水印
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtractBlindWatermark(ExtractBlindWatermarkConfig ExtractBlindWatermark) {
        this.ExtractBlindWatermark = ExtractBlindWatermark;
    }

    /**
     * Get 移除盲水印
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoveBlindWatermark 移除盲水印
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RemoveBlindWatermarkConfig getRemoveBlindWatermark() {
        return this.RemoveBlindWatermark;
    }

    /**
     * Set 移除盲水印
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoveBlindWatermark 移除盲水印
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoveBlindWatermark(RemoveBlindWatermarkConfig RemoveBlindWatermark) {
        this.RemoveBlindWatermark = RemoveBlindWatermark;
    }

    public BlindWatermarkConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlindWatermarkConfig(BlindWatermarkConfig source) {
        if (source.AddBlindWatermark != null) {
            this.AddBlindWatermark = new AddBlindWatermarkConfig(source.AddBlindWatermark);
        }
        if (source.ExtractBlindWatermark != null) {
            this.ExtractBlindWatermark = new ExtractBlindWatermarkConfig(source.ExtractBlindWatermark);
        }
        if (source.RemoveBlindWatermark != null) {
            this.RemoveBlindWatermark = new RemoveBlindWatermarkConfig(source.RemoveBlindWatermark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AddBlindWatermark.", this.AddBlindWatermark);
        this.setParamObj(map, prefix + "ExtractBlindWatermark.", this.ExtractBlindWatermark);
        this.setParamObj(map, prefix + "RemoveBlindWatermark.", this.RemoveBlindWatermark);

    }
}

