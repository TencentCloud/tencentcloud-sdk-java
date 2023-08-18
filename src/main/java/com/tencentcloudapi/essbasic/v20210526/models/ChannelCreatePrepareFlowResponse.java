/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreatePrepareFlowResponse extends AbstractModel{

    /**
    * 预发起的合同链接， 可以直接点击进入进行合同发起
    */
    @SerializedName("PrepareFlowUrl")
    @Expose
    private String PrepareFlowUrl;

    /**
    * 合同发起后预览链接， 注意此时合同并未发起，仅只是展示效果
    */
    @SerializedName("PreviewFlowUrl")
    @Expose
    private String PreviewFlowUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 预发起的合同链接， 可以直接点击进入进行合同发起 
     * @return PrepareFlowUrl 预发起的合同链接， 可以直接点击进入进行合同发起
     */
    public String getPrepareFlowUrl() {
        return this.PrepareFlowUrl;
    }

    /**
     * Set 预发起的合同链接， 可以直接点击进入进行合同发起
     * @param PrepareFlowUrl 预发起的合同链接， 可以直接点击进入进行合同发起
     */
    public void setPrepareFlowUrl(String PrepareFlowUrl) {
        this.PrepareFlowUrl = PrepareFlowUrl;
    }

    /**
     * Get 合同发起后预览链接， 注意此时合同并未发起，仅只是展示效果 
     * @return PreviewFlowUrl 合同发起后预览链接， 注意此时合同并未发起，仅只是展示效果
     */
    public String getPreviewFlowUrl() {
        return this.PreviewFlowUrl;
    }

    /**
     * Set 合同发起后预览链接， 注意此时合同并未发起，仅只是展示效果
     * @param PreviewFlowUrl 合同发起后预览链接， 注意此时合同并未发起，仅只是展示效果
     */
    public void setPreviewFlowUrl(String PreviewFlowUrl) {
        this.PreviewFlowUrl = PreviewFlowUrl;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ChannelCreatePrepareFlowResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreatePrepareFlowResponse(ChannelCreatePrepareFlowResponse source) {
        if (source.PrepareFlowUrl != null) {
            this.PrepareFlowUrl = new String(source.PrepareFlowUrl);
        }
        if (source.PreviewFlowUrl != null) {
            this.PreviewFlowUrl = new String(source.PreviewFlowUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrepareFlowUrl", this.PrepareFlowUrl);
        this.setParamSimple(map, prefix + "PreviewFlowUrl", this.PreviewFlowUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

