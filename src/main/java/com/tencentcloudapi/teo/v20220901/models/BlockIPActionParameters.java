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

public class BlockIPActionParameters extends AbstractModel {

    /**
    * 封禁 IP 的惩罚时长。支持的单位有：<li>s：秒，取值范围1～120；</li><li>m：分，取值范围1～120；</li><li>h：小时，取值范围1～48。</li>
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
     * Get 封禁 IP 的惩罚时长。支持的单位有：<li>s：秒，取值范围1～120；</li><li>m：分，取值范围1～120；</li><li>h：小时，取值范围1～48。</li> 
     * @return Duration 封禁 IP 的惩罚时长。支持的单位有：<li>s：秒，取值范围1～120；</li><li>m：分，取值范围1～120；</li><li>h：小时，取值范围1～48。</li>
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 封禁 IP 的惩罚时长。支持的单位有：<li>s：秒，取值范围1～120；</li><li>m：分，取值范围1～120；</li><li>h：小时，取值范围1～48。</li>
     * @param Duration 封禁 IP 的惩罚时长。支持的单位有：<li>s：秒，取值范围1～120；</li><li>m：分，取值范围1～120；</li><li>h：小时，取值范围1～48。</li>
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public BlockIPActionParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlockIPActionParameters(BlockIPActionParameters source) {
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

