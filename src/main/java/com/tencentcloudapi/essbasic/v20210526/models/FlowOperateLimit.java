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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowOperateLimit extends AbstractModel {

    /**
    * <p>发起合同流程时，对签署完成后是否能发起对应的解除合同加以限制：<ul><li><b>false（默认值）</b>: 合同流程完成签署后，支持发起对应的解除协议。</li><li><b>true </b>: 合同流程完成签署后，<b>不支持</b>发起对应的解除协议。</li></ul></p>
    */
    @SerializedName("NoRelease")
    @Expose
    private Boolean NoRelease;

    /**
     * Get <p>发起合同流程时，对签署完成后是否能发起对应的解除合同加以限制：<ul><li><b>false（默认值）</b>: 合同流程完成签署后，支持发起对应的解除协议。</li><li><b>true </b>: 合同流程完成签署后，<b>不支持</b>发起对应的解除协议。</li></ul></p> 
     * @return NoRelease <p>发起合同流程时，对签署完成后是否能发起对应的解除合同加以限制：<ul><li><b>false（默认值）</b>: 合同流程完成签署后，支持发起对应的解除协议。</li><li><b>true </b>: 合同流程完成签署后，<b>不支持</b>发起对应的解除协议。</li></ul></p>
     */
    public Boolean getNoRelease() {
        return this.NoRelease;
    }

    /**
     * Set <p>发起合同流程时，对签署完成后是否能发起对应的解除合同加以限制：<ul><li><b>false（默认值）</b>: 合同流程完成签署后，支持发起对应的解除协议。</li><li><b>true </b>: 合同流程完成签署后，<b>不支持</b>发起对应的解除协议。</li></ul></p>
     * @param NoRelease <p>发起合同流程时，对签署完成后是否能发起对应的解除合同加以限制：<ul><li><b>false（默认值）</b>: 合同流程完成签署后，支持发起对应的解除协议。</li><li><b>true </b>: 合同流程完成签署后，<b>不支持</b>发起对应的解除协议。</li></ul></p>
     */
    public void setNoRelease(Boolean NoRelease) {
        this.NoRelease = NoRelease;
    }

    public FlowOperateLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowOperateLimit(FlowOperateLimit source) {
        if (source.NoRelease != null) {
            this.NoRelease = new Boolean(source.NoRelease);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoRelease", this.NoRelease);

    }
}

