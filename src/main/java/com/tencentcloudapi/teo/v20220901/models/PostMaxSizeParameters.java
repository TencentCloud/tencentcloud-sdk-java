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

public class PostMaxSizeParameters extends AbstractModel {

    /**
    * 是否开启 POST 请求上传文件限制，单位为 Byte，平台默认为限制为 32 * 2<sup>20</sup> Byte，取值有：<li>on：开启限制；</li><li>off：关闭限制。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * POST 请求上传文件流式传输最大限制，该字段仅在 Switch 为 on 时生效，取值在 1MB 和 800MB 之间，单位字节。
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
     * Get 是否开启 POST 请求上传文件限制，单位为 Byte，平台默认为限制为 32 * 2<sup>20</sup> Byte，取值有：<li>on：开启限制；</li><li>off：关闭限制。</li> 
     * @return Switch 是否开启 POST 请求上传文件限制，单位为 Byte，平台默认为限制为 32 * 2<sup>20</sup> Byte，取值有：<li>on：开启限制；</li><li>off：关闭限制。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 是否开启 POST 请求上传文件限制，单位为 Byte，平台默认为限制为 32 * 2<sup>20</sup> Byte，取值有：<li>on：开启限制；</li><li>off：关闭限制。</li>
     * @param Switch 是否开启 POST 请求上传文件限制，单位为 Byte，平台默认为限制为 32 * 2<sup>20</sup> Byte，取值有：<li>on：开启限制；</li><li>off：关闭限制。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get POST 请求上传文件流式传输最大限制，该字段仅在 Switch 为 on 时生效，取值在 1MB 和 800MB 之间，单位字节。 
     * @return MaxSize POST 请求上传文件流式传输最大限制，该字段仅在 Switch 为 on 时生效，取值在 1MB 和 800MB 之间，单位字节。
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set POST 请求上传文件流式传输最大限制，该字段仅在 Switch 为 on 时生效，取值在 1MB 和 800MB 之间，单位字节。
     * @param MaxSize POST 请求上传文件流式传输最大限制，该字段仅在 Switch 为 on 时生效，取值在 1MB 和 800MB 之间，单位字节。
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    public PostMaxSizeParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostMaxSizeParameters(PostMaxSizeParameters source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

