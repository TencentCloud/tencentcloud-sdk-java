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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeMediaTaskInput extends AbstractModel{

    /**
    * 输入的媒体轨道列表，包括视频、音频、图片等素材组成的多个轨道信息。
    */
    @SerializedName("Tracks")
    @Expose
    private MediaTrack [] Tracks;

    /**
    * 制作视频文件时使用的画布。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Canvas")
    @Expose
    private Canvas Canvas;

    /**
    * 输出的媒体文件信息。
    */
    @SerializedName("Output")
    @Expose
    private ComposeMediaOutput Output;

    /**
     * Get 输入的媒体轨道列表，包括视频、音频、图片等素材组成的多个轨道信息。 
     * @return Tracks 输入的媒体轨道列表，包括视频、音频、图片等素材组成的多个轨道信息。
     */
    public MediaTrack [] getTracks() {
        return this.Tracks;
    }

    /**
     * Set 输入的媒体轨道列表，包括视频、音频、图片等素材组成的多个轨道信息。
     * @param Tracks 输入的媒体轨道列表，包括视频、音频、图片等素材组成的多个轨道信息。
     */
    public void setTracks(MediaTrack [] Tracks) {
        this.Tracks = Tracks;
    }

    /**
     * Get 制作视频文件时使用的画布。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Canvas 制作视频文件时使用的画布。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Canvas getCanvas() {
        return this.Canvas;
    }

    /**
     * Set 制作视频文件时使用的画布。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Canvas 制作视频文件时使用的画布。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanvas(Canvas Canvas) {
        this.Canvas = Canvas;
    }

    /**
     * Get 输出的媒体文件信息。 
     * @return Output 输出的媒体文件信息。
     */
    public ComposeMediaOutput getOutput() {
        return this.Output;
    }

    /**
     * Set 输出的媒体文件信息。
     * @param Output 输出的媒体文件信息。
     */
    public void setOutput(ComposeMediaOutput Output) {
        this.Output = Output;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tracks.", this.Tracks);
        this.setParamObj(map, prefix + "Canvas.", this.Canvas);
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}

