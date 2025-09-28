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

public class ContentCompressionParameters extends AbstractModel {

    /**
    * 内容压缩配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
当 Switch 为 on 时，将同时支持 brotli 和 gzip 压缩算法。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get 内容压缩配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
当 Switch 为 on 时，将同时支持 brotli 和 gzip 压缩算法。 
     * @return Switch 内容压缩配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
当 Switch 为 on 时，将同时支持 brotli 和 gzip 压缩算法。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 内容压缩配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
当 Switch 为 on 时，将同时支持 brotli 和 gzip 压缩算法。
     * @param Switch 内容压缩配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
当 Switch 为 on 时，将同时支持 brotli 和 gzip 压缩算法。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public ContentCompressionParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentCompressionParameters(ContentCompressionParameters source) {
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

