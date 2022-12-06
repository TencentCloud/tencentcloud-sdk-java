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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuSeiParams extends AbstractModel{

    /**
    * 音量布局SEI
    */
    @SerializedName("LayoutVolume")
    @Expose
    private McuLayoutVolume LayoutVolume;

    /**
    * 透传SEI
    */
    @SerializedName("PassThrough")
    @Expose
    private McuPassThrough PassThrough;

    /**
     * Get 音量布局SEI 
     * @return LayoutVolume 音量布局SEI
     */
    public McuLayoutVolume getLayoutVolume() {
        return this.LayoutVolume;
    }

    /**
     * Set 音量布局SEI
     * @param LayoutVolume 音量布局SEI
     */
    public void setLayoutVolume(McuLayoutVolume LayoutVolume) {
        this.LayoutVolume = LayoutVolume;
    }

    /**
     * Get 透传SEI 
     * @return PassThrough 透传SEI
     */
    public McuPassThrough getPassThrough() {
        return this.PassThrough;
    }

    /**
     * Set 透传SEI
     * @param PassThrough 透传SEI
     */
    public void setPassThrough(McuPassThrough PassThrough) {
        this.PassThrough = PassThrough;
    }

    public McuSeiParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuSeiParams(McuSeiParams source) {
        if (source.LayoutVolume != null) {
            this.LayoutVolume = new McuLayoutVolume(source.LayoutVolume);
        }
        if (source.PassThrough != null) {
            this.PassThrough = new McuPassThrough(source.PassThrough);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LayoutVolume.", this.LayoutVolume);
        this.setParamObj(map, prefix + "PassThrough.", this.PassThrough);

    }
}

