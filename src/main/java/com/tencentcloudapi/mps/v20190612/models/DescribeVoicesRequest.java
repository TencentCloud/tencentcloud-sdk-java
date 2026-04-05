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

public class DescribeVoicesRequest extends AbstractModel {

    /**
    * <p>音色类别</p><p>枚举值：</p><ul><li>system： 系统音色</li></ul>
    */
    @SerializedName("VoiceType")
    @Expose
    private String VoiceType;

    /**
    * <p>扩展参数，json字符串</p><p>其他筛选条件voiceName String 音色名，模糊匹配labels Array of String 标签，匹配包含这些标签的音色</p>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>音色类别</p><p>枚举值：</p><ul><li>system： 系统音色</li></ul> 
     * @return VoiceType <p>音色类别</p><p>枚举值：</p><ul><li>system： 系统音色</li></ul>
     */
    public String getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set <p>音色类别</p><p>枚举值：</p><ul><li>system： 系统音色</li></ul>
     * @param VoiceType <p>音色类别</p><p>枚举值：</p><ul><li>system： 系统音色</li></ul>
     */
    public void setVoiceType(String VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get <p>扩展参数，json字符串</p><p>其他筛选条件voiceName String 音色名，模糊匹配labels Array of String 标签，匹配包含这些标签的音色</p> 
     * @return ExtParam <p>扩展参数，json字符串</p><p>其他筛选条件voiceName String 音色名，模糊匹配labels Array of String 标签，匹配包含这些标签的音色</p>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>扩展参数，json字符串</p><p>其他筛选条件voiceName String 音色名，模糊匹配labels Array of String 标签，匹配包含这些标签的音色</p>
     * @param ExtParam <p>扩展参数，json字符串</p><p>其他筛选条件voiceName String 音色名，模糊匹配labels Array of String 标签，匹配包含这些标签的音色</p>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public DescribeVoicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVoicesRequest(DescribeVoicesRequest source) {
        if (source.VoiceType != null) {
            this.VoiceType = new String(source.VoiceType);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

