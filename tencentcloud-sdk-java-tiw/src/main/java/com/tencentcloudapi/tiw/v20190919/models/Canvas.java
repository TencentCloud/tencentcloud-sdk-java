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

public class Canvas extends AbstractModel{

    /**
    * 混流画布宽高配置
    */
    @SerializedName("LayoutParams")
    @Expose
    private LayoutParams LayoutParams;

    /**
    * 背景颜色，默认为黑色，格式为RGB格式，如红色为"#FF0000"
    */
    @SerializedName("BackgroundColor")
    @Expose
    private String BackgroundColor;

    /**
     * Get 混流画布宽高配置 
     * @return LayoutParams 混流画布宽高配置
     */
    public LayoutParams getLayoutParams() {
        return this.LayoutParams;
    }

    /**
     * Set 混流画布宽高配置
     * @param LayoutParams 混流画布宽高配置
     */
    public void setLayoutParams(LayoutParams LayoutParams) {
        this.LayoutParams = LayoutParams;
    }

    /**
     * Get 背景颜色，默认为黑色，格式为RGB格式，如红色为"#FF0000" 
     * @return BackgroundColor 背景颜色，默认为黑色，格式为RGB格式，如红色为"#FF0000"
     */
    public String getBackgroundColor() {
        return this.BackgroundColor;
    }

    /**
     * Set 背景颜色，默认为黑色，格式为RGB格式，如红色为"#FF0000"
     * @param BackgroundColor 背景颜色，默认为黑色，格式为RGB格式，如红色为"#FF0000"
     */
    public void setBackgroundColor(String BackgroundColor) {
        this.BackgroundColor = BackgroundColor;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LayoutParams.", this.LayoutParams);
        this.setParamSimple(map, prefix + "BackgroundColor", this.BackgroundColor);

    }
}

