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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageSceneInfo extends AbstractModel {

    /**
    * <p>截图类型</p><p>枚举值：</p><ul><li>1：实时截帧</li><li>2：低频截帧</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>截帧频率</p><p>Type=1时取值[5, 180]秒，Type=2时取值[30, 36000]秒</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>多张截图模式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiMode")
    @Expose
    private MultiSnapshotMode MultiMode;

    /**
     * Get <p>截图类型</p><p>枚举值：</p><ul><li>1：实时截帧</li><li>2：低频截帧</li></ul> 
     * @return Type <p>截图类型</p><p>枚举值：</p><ul><li>1：实时截帧</li><li>2：低频截帧</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>截图类型</p><p>枚举值：</p><ul><li>1：实时截帧</li><li>2：低频截帧</li></ul>
     * @param Type <p>截图类型</p><p>枚举值：</p><ul><li>1：实时截帧</li><li>2：低频截帧</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>截帧频率</p><p>Type=1时取值[5, 180]秒，Type=2时取值[30, 36000]秒</p> 
     * @return Interval <p>截帧频率</p><p>Type=1时取值[5, 180]秒，Type=2时取值[30, 36000]秒</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>截帧频率</p><p>Type=1时取值[5, 180]秒，Type=2时取值[30, 36000]秒</p>
     * @param Interval <p>截帧频率</p><p>Type=1时取值[5, 180]秒，Type=2时取值[30, 36000]秒</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>多张截图模式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MultiMode <p>多张截图模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiSnapshotMode getMultiMode() {
        return this.MultiMode;
    }

    /**
     * Set <p>多张截图模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiMode <p>多张截图模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiMode(MultiSnapshotMode MultiMode) {
        this.MultiMode = MultiMode;
    }

    public ImageSceneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSceneInfo(ImageSceneInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.MultiMode != null) {
            this.MultiMode = new MultiSnapshotMode(source.MultiMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamObj(map, prefix + "MultiMode.", this.MultiMode);

    }
}

