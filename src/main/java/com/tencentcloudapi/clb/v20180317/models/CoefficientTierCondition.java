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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CoefficientTierCondition extends AbstractModel {

    /**
    * <p>仅 chat；单位 K Token（1K=1000 Token）；非负整数，最大 2147483647；非空数组首条必须为 0，数组内严格递增、无重复；输入总 Token 严格超过阈值×1000，取满足条件的最大阈值，整单选价</p>
    */
    @SerializedName("InputTokensAbove")
    @Expose
    private Long InputTokensAbove;

    /**
    * <p>video 仅 480p／720p／768p／1024p／1080p／2k／4k，统一小写；只校验全局枚举，不校验模型支持子集；列表内不重复</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get <p>仅 chat；单位 K Token（1K=1000 Token）；非负整数，最大 2147483647；非空数组首条必须为 0，数组内严格递增、无重复；输入总 Token 严格超过阈值×1000，取满足条件的最大阈值，整单选价</p> 
     * @return InputTokensAbove <p>仅 chat；单位 K Token（1K=1000 Token）；非负整数，最大 2147483647；非空数组首条必须为 0，数组内严格递增、无重复；输入总 Token 严格超过阈值×1000，取满足条件的最大阈值，整单选价</p>
     */
    public Long getInputTokensAbove() {
        return this.InputTokensAbove;
    }

    /**
     * Set <p>仅 chat；单位 K Token（1K=1000 Token）；非负整数，最大 2147483647；非空数组首条必须为 0，数组内严格递增、无重复；输入总 Token 严格超过阈值×1000，取满足条件的最大阈值，整单选价</p>
     * @param InputTokensAbove <p>仅 chat；单位 K Token（1K=1000 Token）；非负整数，最大 2147483647；非空数组首条必须为 0，数组内严格递增、无重复；输入总 Token 严格超过阈值×1000，取满足条件的最大阈值，整单选价</p>
     */
    public void setInputTokensAbove(Long InputTokensAbove) {
        this.InputTokensAbove = InputTokensAbove;
    }

    /**
     * Get <p>video 仅 480p／720p／768p／1024p／1080p／2k／4k，统一小写；只校验全局枚举，不校验模型支持子集；列表内不重复</p> 
     * @return Resolution <p>video 仅 480p／720p／768p／1024p／1080p／2k／4k，统一小写；只校验全局枚举，不校验模型支持子集；列表内不重复</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>video 仅 480p／720p／768p／1024p／1080p／2k／4k，统一小写；只校验全局枚举，不校验模型支持子集；列表内不重复</p>
     * @param Resolution <p>video 仅 480p／720p／768p／1024p／1080p／2k／4k，统一小写；只校验全局枚举，不校验模型支持子集；列表内不重复</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    public CoefficientTierCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoefficientTierCondition(CoefficientTierCondition source) {
        if (source.InputTokensAbove != null) {
            this.InputTokensAbove = new Long(source.InputTokensAbove);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputTokensAbove", this.InputTokensAbove);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

