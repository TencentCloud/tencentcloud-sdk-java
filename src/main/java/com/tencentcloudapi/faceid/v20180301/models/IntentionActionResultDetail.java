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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntentionActionResultDetail extends AbstractModel{

    /**
    * 视频base64编码（其中包含全程提示文本和点头音频，mp4格式）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Video")
    @Expose
    private String Video;

    /**
    * 屏幕截图base64编码列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScreenShot")
    @Expose
    private String [] ScreenShot;

    /**
     * Get 视频base64编码（其中包含全程提示文本和点头音频，mp4格式）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Video 视频base64编码（其中包含全程提示文本和点头音频，mp4格式）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideo() {
        return this.Video;
    }

    /**
     * Set 视频base64编码（其中包含全程提示文本和点头音频，mp4格式）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Video 视频base64编码（其中包含全程提示文本和点头音频，mp4格式）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideo(String Video) {
        this.Video = Video;
    }

    /**
     * Get 屏幕截图base64编码列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScreenShot 屏幕截图base64编码列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getScreenShot() {
        return this.ScreenShot;
    }

    /**
     * Set 屏幕截图base64编码列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScreenShot 屏幕截图base64编码列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScreenShot(String [] ScreenShot) {
        this.ScreenShot = ScreenShot;
    }

    public IntentionActionResultDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntentionActionResultDetail(IntentionActionResultDetail source) {
        if (source.Video != null) {
            this.Video = new String(source.Video);
        }
        if (source.ScreenShot != null) {
            this.ScreenShot = new String[source.ScreenShot.length];
            for (int i = 0; i < source.ScreenShot.length; i++) {
                this.ScreenShot[i] = new String(source.ScreenShot[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Video", this.Video);
        this.setParamArraySimple(map, prefix + "ScreenShot.", this.ScreenShot);

    }
}

