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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectConfigureInfo extends AbstractModel {

    /**
    * 物体识别任务开关，可选值：
<li>ON：开启智能物体识别任务；</li>
<li>OFF：关闭智能物体识别任务。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 物体库选择，可选值：
<li>Default：使用默认物体库；</li>
<li>UserDefine：使用用户自定义物体库。</li>
<li>All：同时使用默认物体库和用户自定义物体库。</li>
默认值： All，同时使用默认物体库和用户自定义物体库。
    */
    @SerializedName("ObjectLibrary")
    @Expose
    private String ObjectLibrary;

    /**
     * Get 物体识别任务开关，可选值：
<li>ON：开启智能物体识别任务；</li>
<li>OFF：关闭智能物体识别任务。</li> 
     * @return Switch 物体识别任务开关，可选值：
<li>ON：开启智能物体识别任务；</li>
<li>OFF：关闭智能物体识别任务。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 物体识别任务开关，可选值：
<li>ON：开启智能物体识别任务；</li>
<li>OFF：关闭智能物体识别任务。</li>
     * @param Switch 物体识别任务开关，可选值：
<li>ON：开启智能物体识别任务；</li>
<li>OFF：关闭智能物体识别任务。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 物体库选择，可选值：
<li>Default：使用默认物体库；</li>
<li>UserDefine：使用用户自定义物体库。</li>
<li>All：同时使用默认物体库和用户自定义物体库。</li>
默认值： All，同时使用默认物体库和用户自定义物体库。 
     * @return ObjectLibrary 物体库选择，可选值：
<li>Default：使用默认物体库；</li>
<li>UserDefine：使用用户自定义物体库。</li>
<li>All：同时使用默认物体库和用户自定义物体库。</li>
默认值： All，同时使用默认物体库和用户自定义物体库。
     */
    public String getObjectLibrary() {
        return this.ObjectLibrary;
    }

    /**
     * Set 物体库选择，可选值：
<li>Default：使用默认物体库；</li>
<li>UserDefine：使用用户自定义物体库。</li>
<li>All：同时使用默认物体库和用户自定义物体库。</li>
默认值： All，同时使用默认物体库和用户自定义物体库。
     * @param ObjectLibrary 物体库选择，可选值：
<li>Default：使用默认物体库；</li>
<li>UserDefine：使用用户自定义物体库。</li>
<li>All：同时使用默认物体库和用户自定义物体库。</li>
默认值： All，同时使用默认物体库和用户自定义物体库。
     */
    public void setObjectLibrary(String ObjectLibrary) {
        this.ObjectLibrary = ObjectLibrary;
    }

    public ObjectConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectConfigureInfo(ObjectConfigureInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ObjectLibrary != null) {
            this.ObjectLibrary = new String(source.ObjectLibrary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "ObjectLibrary", this.ObjectLibrary);

    }
}

