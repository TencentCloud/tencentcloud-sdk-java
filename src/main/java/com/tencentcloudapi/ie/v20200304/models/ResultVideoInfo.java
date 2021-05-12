/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResultVideoInfo extends AbstractModel{

    /**
    * 流在媒体文件中的流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamId")
    @Expose
    private Long StreamId;

    /**
    * 流的时长，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 画面宽度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 画面高度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 视频帧率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
     * Get 流在媒体文件中的流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamId 流在媒体文件中的流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStreamId() {
        return this.StreamId;
    }

    /**
     * Set 流在媒体文件中的流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamId 流在媒体文件中的流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamId(Long StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get 流的时长，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 流的时长，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 流的时长，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 流的时长，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 画面宽度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 画面宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 画面宽度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 画面宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 画面高度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height 画面高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 画面高度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 画面高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 视频帧率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fps 视频帧率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 视频帧率
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fps 视频帧率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    public ResultVideoInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResultVideoInfo(ResultVideoInfo source) {
        if (source.StreamId != null) {
            this.StreamId = new Long(source.StreamId);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);

    }
}

