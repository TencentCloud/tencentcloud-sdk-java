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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubtitlePosition extends AbstractModel {

    /**
    * 居中位置时Y的坐标值
    */
    @SerializedName("CenterY")
    @Expose
    private Long CenterY;

    /**
     * Get 居中位置时Y的坐标值 
     * @return CenterY 居中位置时Y的坐标值
     */
    public Long getCenterY() {
        return this.CenterY;
    }

    /**
     * Set 居中位置时Y的坐标值
     * @param CenterY 居中位置时Y的坐标值
     */
    public void setCenterY(Long CenterY) {
        this.CenterY = CenterY;
    }

    public SubtitlePosition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitlePosition(SubtitlePosition source) {
        if (source.CenterY != null) {
            this.CenterY = new Long(source.CenterY);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CenterY", this.CenterY);

    }
}

