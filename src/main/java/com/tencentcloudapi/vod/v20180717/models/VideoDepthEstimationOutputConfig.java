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

public class VideoDepthEstimationOutputConfig extends AbstractModel {

    /**
    * <p>存储模式。可选值：Temporary（默认，产物临时存储 7 天，不返回 FileId）、Permanent（产物写入当前应用媒资库并返回 FileId）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * <p>输出媒资名称，仅 StorageMode 为 Permanent 时生效，不传默认为 depthVideoGenFile。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * <p>输出媒资过期时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>，仅 StorageMode 为 Permanent 时生效。不传表示永不过期。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get <p>存储模式。可选值：Temporary（默认，产物临时存储 7 天，不返回 FileId）、Permanent（产物写入当前应用媒资库并返回 FileId）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageMode <p>存储模式。可选值：Temporary（默认，产物临时存储 7 天，不返回 FileId）、Permanent（产物写入当前应用媒资库并返回 FileId）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set <p>存储模式。可选值：Temporary（默认，产物临时存储 7 天，不返回 FileId）、Permanent（产物写入当前应用媒资库并返回 FileId）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageMode <p>存储模式。可选值：Temporary（默认，产物临时存储 7 天，不返回 FileId）、Permanent（产物写入当前应用媒资库并返回 FileId）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get <p>输出媒资名称，仅 StorageMode 为 Permanent 时生效，不传默认为 depthVideoGenFile。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaName <p>输出媒资名称，仅 StorageMode 为 Permanent 时生效，不传默认为 depthVideoGenFile。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set <p>输出媒资名称，仅 StorageMode 为 Permanent 时生效，不传默认为 depthVideoGenFile。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaName <p>输出媒资名称，仅 StorageMode 为 Permanent 时生效，不传默认为 depthVideoGenFile。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get <p>输出媒资过期时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>，仅 StorageMode 为 Permanent 时生效。不传表示永不过期。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime <p>输出媒资过期时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>，仅 StorageMode 为 Permanent 时生效。不传表示永不过期。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>输出媒资过期时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>，仅 StorageMode 为 Permanent 时生效。不传表示永不过期。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime <p>输出媒资过期时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>，仅 StorageMode 为 Permanent 时生效。不传表示永不过期。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public VideoDepthEstimationOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoDepthEstimationOutputConfig(VideoDepthEstimationOutputConfig source) {
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

