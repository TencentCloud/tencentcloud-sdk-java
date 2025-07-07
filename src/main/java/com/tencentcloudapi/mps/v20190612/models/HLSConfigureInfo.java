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

public class HLSConfigureInfo extends AbstractModel {

    /**
    * 单个 TS 文件时长，单位：秒，取值范围 5-30 秒。

不填默认为 30 秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemDuration")
    @Expose
    private Long ItemDuration;

    /**
    * 录制周期，单位：秒，取值范围 10 分钟到  12 小时。

不填默认为 10分钟（3600 秒）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 续录等待时间，单位：秒。取值范围为60秒-1800秒。
不填默认为0（不启用续录）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContinueTimeout")
    @Expose
    private Long ContinueTimeout;

    /**
     * Get 单个 TS 文件时长，单位：秒，取值范围 5-30 秒。

不填默认为 30 秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemDuration 单个 TS 文件时长，单位：秒，取值范围 5-30 秒。

不填默认为 30 秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getItemDuration() {
        return this.ItemDuration;
    }

    /**
     * Set 单个 TS 文件时长，单位：秒，取值范围 5-30 秒。

不填默认为 30 秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemDuration 单个 TS 文件时长，单位：秒，取值范围 5-30 秒。

不填默认为 30 秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemDuration(Long ItemDuration) {
        this.ItemDuration = ItemDuration;
    }

    /**
     * Get 录制周期，单位：秒，取值范围 10 分钟到  12 小时。

不填默认为 10分钟（3600 秒）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Interval 录制周期，单位：秒，取值范围 10 分钟到  12 小时。

不填默认为 10分钟（3600 秒）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 录制周期，单位：秒，取值范围 10 分钟到  12 小时。

不填默认为 10分钟（3600 秒）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Interval 录制周期，单位：秒，取值范围 10 分钟到  12 小时。

不填默认为 10分钟（3600 秒）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 续录等待时间，单位：秒。取值范围为60秒-1800秒。
不填默认为0（不启用续录）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContinueTimeout 续录等待时间，单位：秒。取值范围为60秒-1800秒。
不填默认为0（不启用续录）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getContinueTimeout() {
        return this.ContinueTimeout;
    }

    /**
     * Set 续录等待时间，单位：秒。取值范围为60秒-1800秒。
不填默认为0（不启用续录）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContinueTimeout 续录等待时间，单位：秒。取值范围为60秒-1800秒。
不填默认为0（不启用续录）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContinueTimeout(Long ContinueTimeout) {
        this.ContinueTimeout = ContinueTimeout;
    }

    public HLSConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HLSConfigureInfo(HLSConfigureInfo source) {
        if (source.ItemDuration != null) {
            this.ItemDuration = new Long(source.ItemDuration);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.ContinueTimeout != null) {
            this.ContinueTimeout = new Long(source.ContinueTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemDuration", this.ItemDuration);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "ContinueTimeout", this.ContinueTimeout);

    }
}

