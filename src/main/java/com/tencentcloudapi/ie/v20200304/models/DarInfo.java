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

public class DarInfo extends AbstractModel{

    /**
    * 填充模式，可选值：
1：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。
2：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“。
默认为2。
    */
    @SerializedName("FillMode")
    @Expose
    private Long FillMode;

    /**
     * Get 填充模式，可选值：
1：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。
2：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“。
默认为2。 
     * @return FillMode 填充模式，可选值：
1：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。
2：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“。
默认为2。
     */
    public Long getFillMode() {
        return this.FillMode;
    }

    /**
     * Set 填充模式，可选值：
1：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。
2：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“。
默认为2。
     * @param FillMode 填充模式，可选值：
1：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。
2：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“。
默认为2。
     */
    public void setFillMode(Long FillMode) {
        this.FillMode = FillMode;
    }

    public DarInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DarInfo(DarInfo source) {
        if (source.FillMode != null) {
            this.FillMode = new Long(source.FillMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FillMode", this.FillMode);

    }
}

