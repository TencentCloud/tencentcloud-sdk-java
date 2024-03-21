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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebRecordVideoParams extends AbstractModel {

    /**
    * 录制画面宽度，默认为1280，取值范围[0, 1920]
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 录制画面高度，默认为720，取值范围[0, 1080]
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 指定输出格式，可选hls,mp4

    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get 录制画面宽度，默认为1280，取值范围[0, 1920] 
     * @return Width 录制画面宽度，默认为1280，取值范围[0, 1920]
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 录制画面宽度，默认为1280，取值范围[0, 1920]
     * @param Width 录制画面宽度，默认为1280，取值范围[0, 1920]
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 录制画面高度，默认为720，取值范围[0, 1080] 
     * @return Height 录制画面高度，默认为720，取值范围[0, 1080]
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 录制画面高度，默认为720，取值范围[0, 1080]
     * @param Height 录制画面高度，默认为720，取值范围[0, 1080]
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 指定输出格式，可选hls,mp4
 
     * @return Format 指定输出格式，可选hls,mp4

     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 指定输出格式，可选hls,mp4

     * @param Format 指定输出格式，可选hls,mp4

     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public WebRecordVideoParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebRecordVideoParams(WebRecordVideoParams source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

