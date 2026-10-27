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

public class LLMComprehendDNA extends AbstractModel {

    /**
    * <p>DNA解析任务开关</p><p>枚举值：</p><ul><li>ON： 开启DNA解析任务</li><li>OFF： 关闭DNA解析任务</li></ul><p>默认值：OFF</p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get <p>DNA解析任务开关</p><p>枚举值：</p><ul><li>ON： 开启DNA解析任务</li><li>OFF： 关闭DNA解析任务</li></ul><p>默认值：OFF</p> 
     * @return Switch <p>DNA解析任务开关</p><p>枚举值：</p><ul><li>ON： 开启DNA解析任务</li><li>OFF： 关闭DNA解析任务</li></ul><p>默认值：OFF</p>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>DNA解析任务开关</p><p>枚举值：</p><ul><li>ON： 开启DNA解析任务</li><li>OFF： 关闭DNA解析任务</li></ul><p>默认值：OFF</p>
     * @param Switch <p>DNA解析任务开关</p><p>枚举值：</p><ul><li>ON： 开启DNA解析任务</li><li>OFF： 关闭DNA解析任务</li></ul><p>默认值：OFF</p>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public LLMComprehendDNA() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMComprehendDNA(LLMComprehendDNA source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

