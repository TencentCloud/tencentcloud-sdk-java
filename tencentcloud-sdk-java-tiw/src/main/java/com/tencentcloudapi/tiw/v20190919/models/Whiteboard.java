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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Whiteboard extends AbstractModel{

    /**
    * 实时录制结果里白板视频宽，默认为1280
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 实时录制结果里白板视频高，默认为960
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 白板初始化参数，透传到白板 SDK
    */
    @SerializedName("InitParam")
    @Expose
    private String InitParam;

    /**
     * Get 实时录制结果里白板视频宽，默认为1280 
     * @return Width 实时录制结果里白板视频宽，默认为1280
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 实时录制结果里白板视频宽，默认为1280
     * @param Width 实时录制结果里白板视频宽，默认为1280
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 实时录制结果里白板视频高，默认为960 
     * @return Height 实时录制结果里白板视频高，默认为960
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 实时录制结果里白板视频高，默认为960
     * @param Height 实时录制结果里白板视频高，默认为960
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 白板初始化参数，透传到白板 SDK 
     * @return InitParam 白板初始化参数，透传到白板 SDK
     */
    public String getInitParam() {
        return this.InitParam;
    }

    /**
     * Set 白板初始化参数，透传到白板 SDK
     * @param InitParam 白板初始化参数，透传到白板 SDK
     */
    public void setInitParam(String InitParam) {
        this.InitParam = InitParam;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "InitParam", this.InitParam);

    }
}

