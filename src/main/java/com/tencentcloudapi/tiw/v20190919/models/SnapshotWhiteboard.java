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

public class SnapshotWhiteboard extends AbstractModel{

    /**
    * 白板宽度大小，默认为1280，有效取值范围[0，2560]
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 白板高度大小，默认为720，有效取值范围[0，2560]
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 白板初始化参数的JSON转义字符串，透传到白板 SDK
    */
    @SerializedName("InitParams")
    @Expose
    private String InitParams;

    /**
     * Get 白板宽度大小，默认为1280，有效取值范围[0，2560] 
     * @return Width 白板宽度大小，默认为1280，有效取值范围[0，2560]
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 白板宽度大小，默认为1280，有效取值范围[0，2560]
     * @param Width 白板宽度大小，默认为1280，有效取值范围[0，2560]
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 白板高度大小，默认为720，有效取值范围[0，2560] 
     * @return Height 白板高度大小，默认为720，有效取值范围[0，2560]
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 白板高度大小，默认为720，有效取值范围[0，2560]
     * @param Height 白板高度大小，默认为720，有效取值范围[0，2560]
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 白板初始化参数的JSON转义字符串，透传到白板 SDK 
     * @return InitParams 白板初始化参数的JSON转义字符串，透传到白板 SDK
     */
    public String getInitParams() {
        return this.InitParams;
    }

    /**
     * Set 白板初始化参数的JSON转义字符串，透传到白板 SDK
     * @param InitParams 白板初始化参数的JSON转义字符串，透传到白板 SDK
     */
    public void setInitParams(String InitParams) {
        this.InitParams = InitParams;
    }

    public SnapshotWhiteboard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotWhiteboard(SnapshotWhiteboard source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.InitParams != null) {
            this.InitParams = new String(source.InitParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "InitParams", this.InitParams);

    }
}

