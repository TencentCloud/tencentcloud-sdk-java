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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TCEOCaptchaOption extends AbstractModel {

    /**
    * EdgeOne 人机校验模式，取值有：<li> Invisible：无感验证；</li><li>Adaptive：自适应交互验证。</li>
    */
    @SerializedName("CaptchaMode")
    @Expose
    private String CaptchaMode;

    /**
     * Get EdgeOne 人机校验模式，取值有：<li> Invisible：无感验证；</li><li>Adaptive：自适应交互验证。</li> 
     * @return CaptchaMode EdgeOne 人机校验模式，取值有：<li> Invisible：无感验证；</li><li>Adaptive：自适应交互验证。</li>
     */
    public String getCaptchaMode() {
        return this.CaptchaMode;
    }

    /**
     * Set EdgeOne 人机校验模式，取值有：<li> Invisible：无感验证；</li><li>Adaptive：自适应交互验证。</li>
     * @param CaptchaMode EdgeOne 人机校验模式，取值有：<li> Invisible：无感验证；</li><li>Adaptive：自适应交互验证。</li>
     */
    public void setCaptchaMode(String CaptchaMode) {
        this.CaptchaMode = CaptchaMode;
    }

    public TCEOCaptchaOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCEOCaptchaOption(TCEOCaptchaOption source) {
        if (source.CaptchaMode != null) {
            this.CaptchaMode = new String(source.CaptchaMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaptchaMode", this.CaptchaMode);

    }
}

