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
package com.tencentcloudapi.vm.v20200709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaInfo extends AbstractModel{

    /**
    * 编码格式
    */
    @SerializedName("Codecs")
    @Expose
    private String Codecs;

    /**
    * 流检测时分片时长
注意：此字段可能返回 0，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 宽，单位为像素
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 高，单位为像素
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get 编码格式 
     * @return Codecs 编码格式
     */
    public String getCodecs() {
        return this.Codecs;
    }

    /**
     * Set 编码格式
     * @param Codecs 编码格式
     */
    public void setCodecs(String Codecs) {
        this.Codecs = Codecs;
    }

    /**
     * Get 流检测时分片时长
注意：此字段可能返回 0，表示取不到有效值。 
     * @return Duration 流检测时分片时长
注意：此字段可能返回 0，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 流检测时分片时长
注意：此字段可能返回 0，表示取不到有效值。
     * @param Duration 流检测时分片时长
注意：此字段可能返回 0，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 宽，单位为像素 
     * @return Width 宽，单位为像素
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽，单位为像素
     * @param Width 宽，单位为像素
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 高，单位为像素 
     * @return Height 高，单位为像素
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高，单位为像素
     * @param Height 高，单位为像素
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public MediaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaInfo(MediaInfo source) {
        if (source.Codecs != null) {
            this.Codecs = new String(source.Codecs);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codecs", this.Codecs);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

