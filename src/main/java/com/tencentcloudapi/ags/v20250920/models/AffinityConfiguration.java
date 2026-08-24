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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AffinityConfiguration extends AbstractModel {

    /**
    * <p>Affinity 模式。</p><p>枚举值：</p><ul><li>BEST_EFFORT：优先复用原 Instance，不可用时允许改选。</li><li>STRICT：只复用原 Instance，不可用时失败且不改选。</li><li>EXCLUSIVE：一个 Affinity ID 独占一个 Instance，不能迁移。</li></ul><p>缺失或空字符串表示关闭 Affinity。</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>请求和响应使用的 Affinity Header 名称。必须符合 HTTP field-name token 语法，长度为 1..128 个 ASCII 字节，且不能使用平台保留 Header。</p>
    */
    @SerializedName("HeaderName")
    @Expose
    private String HeaderName;

    /**
     * Get <p>Affinity 模式。</p><p>枚举值：</p><ul><li>BEST_EFFORT：优先复用原 Instance，不可用时允许改选。</li><li>STRICT：只复用原 Instance，不可用时失败且不改选。</li><li>EXCLUSIVE：一个 Affinity ID 独占一个 Instance，不能迁移。</li></ul><p>缺失或空字符串表示关闭 Affinity。</p> 
     * @return Mode <p>Affinity 模式。</p><p>枚举值：</p><ul><li>BEST_EFFORT：优先复用原 Instance，不可用时允许改选。</li><li>STRICT：只复用原 Instance，不可用时失败且不改选。</li><li>EXCLUSIVE：一个 Affinity ID 独占一个 Instance，不能迁移。</li></ul><p>缺失或空字符串表示关闭 Affinity。</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>Affinity 模式。</p><p>枚举值：</p><ul><li>BEST_EFFORT：优先复用原 Instance，不可用时允许改选。</li><li>STRICT：只复用原 Instance，不可用时失败且不改选。</li><li>EXCLUSIVE：一个 Affinity ID 独占一个 Instance，不能迁移。</li></ul><p>缺失或空字符串表示关闭 Affinity。</p>
     * @param Mode <p>Affinity 模式。</p><p>枚举值：</p><ul><li>BEST_EFFORT：优先复用原 Instance，不可用时允许改选。</li><li>STRICT：只复用原 Instance，不可用时失败且不改选。</li><li>EXCLUSIVE：一个 Affinity ID 独占一个 Instance，不能迁移。</li></ul><p>缺失或空字符串表示关闭 Affinity。</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>请求和响应使用的 Affinity Header 名称。必须符合 HTTP field-name token 语法，长度为 1..128 个 ASCII 字节，且不能使用平台保留 Header。</p> 
     * @return HeaderName <p>请求和响应使用的 Affinity Header 名称。必须符合 HTTP field-name token 语法，长度为 1..128 个 ASCII 字节，且不能使用平台保留 Header。</p>
     */
    public String getHeaderName() {
        return this.HeaderName;
    }

    /**
     * Set <p>请求和响应使用的 Affinity Header 名称。必须符合 HTTP field-name token 语法，长度为 1..128 个 ASCII 字节，且不能使用平台保留 Header。</p>
     * @param HeaderName <p>请求和响应使用的 Affinity Header 名称。必须符合 HTTP field-name token 语法，长度为 1..128 个 ASCII 字节，且不能使用平台保留 Header。</p>
     */
    public void setHeaderName(String HeaderName) {
        this.HeaderName = HeaderName;
    }

    public AffinityConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AffinityConfiguration(AffinityConfiguration source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.HeaderName != null) {
            this.HeaderName = new String(source.HeaderName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "HeaderName", this.HeaderName);

    }
}

