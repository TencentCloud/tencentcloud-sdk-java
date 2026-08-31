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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceVideoCardBrief extends AbstractModel {

    /**
    * <p>显卡名称</p>
    */
    @SerializedName("VideoCardName")
    @Expose
    private String VideoCardName;

    /**
     * Get <p>显卡名称</p> 
     * @return VideoCardName <p>显卡名称</p>
     */
    public String getVideoCardName() {
        return this.VideoCardName;
    }

    /**
     * Set <p>显卡名称</p>
     * @param VideoCardName <p>显卡名称</p>
     */
    public void setVideoCardName(String VideoCardName) {
        this.VideoCardName = VideoCardName;
    }

    public DeviceVideoCardBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceVideoCardBrief(DeviceVideoCardBrief source) {
        if (source.VideoCardName != null) {
            this.VideoCardName = new String(source.VideoCardName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoCardName", this.VideoCardName);

    }
}

