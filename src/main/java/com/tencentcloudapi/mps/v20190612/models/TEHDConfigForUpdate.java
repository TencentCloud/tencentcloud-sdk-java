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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TEHDConfigForUpdate extends AbstractModel{

    /**
    * 极速高清类型，可选值：
<li>TEHD-100：极速高清-100。</li>
不填代表不修改。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 视频码率上限，不填代表不修改。
    */
    @SerializedName("MaxVideoBitrate")
    @Expose
    private Long MaxVideoBitrate;

    /**
     * Get 极速高清类型，可选值：
<li>TEHD-100：极速高清-100。</li>
不填代表不修改。 
     * @return Type 极速高清类型，可选值：
<li>TEHD-100：极速高清-100。</li>
不填代表不修改。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 极速高清类型，可选值：
<li>TEHD-100：极速高清-100。</li>
不填代表不修改。
     * @param Type 极速高清类型，可选值：
<li>TEHD-100：极速高清-100。</li>
不填代表不修改。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 视频码率上限，不填代表不修改。 
     * @return MaxVideoBitrate 视频码率上限，不填代表不修改。
     */
    public Long getMaxVideoBitrate() {
        return this.MaxVideoBitrate;
    }

    /**
     * Set 视频码率上限，不填代表不修改。
     * @param MaxVideoBitrate 视频码率上限，不填代表不修改。
     */
    public void setMaxVideoBitrate(Long MaxVideoBitrate) {
        this.MaxVideoBitrate = MaxVideoBitrate;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MaxVideoBitrate", this.MaxVideoBitrate);

    }
}

