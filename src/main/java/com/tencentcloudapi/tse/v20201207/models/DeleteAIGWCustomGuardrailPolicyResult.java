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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAIGWCustomGuardrailPolicyResult extends AbstractModel {

    /**
    * <p>是否完成插件投影清理并删除策略。false 时策略保留供重试，应检查 FailedResources。</p>
    */
    @SerializedName("Success")
    @Expose
    private Boolean Success;

    /**
    * <p>投影清理失败的业务资源</p>
    */
    @SerializedName("FailedResources")
    @Expose
    private CustomGuardrailSyncFailure [] FailedResources;

    /**
     * Get <p>是否完成插件投影清理并删除策略。false 时策略保留供重试，应检查 FailedResources。</p> 
     * @return Success <p>是否完成插件投影清理并删除策略。false 时策略保留供重试，应检查 FailedResources。</p>
     */
    public Boolean getSuccess() {
        return this.Success;
    }

    /**
     * Set <p>是否完成插件投影清理并删除策略。false 时策略保留供重试，应检查 FailedResources。</p>
     * @param Success <p>是否完成插件投影清理并删除策略。false 时策略保留供重试，应检查 FailedResources。</p>
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    /**
     * Get <p>投影清理失败的业务资源</p> 
     * @return FailedResources <p>投影清理失败的业务资源</p>
     */
    public CustomGuardrailSyncFailure [] getFailedResources() {
        return this.FailedResources;
    }

    /**
     * Set <p>投影清理失败的业务资源</p>
     * @param FailedResources <p>投影清理失败的业务资源</p>
     */
    public void setFailedResources(CustomGuardrailSyncFailure [] FailedResources) {
        this.FailedResources = FailedResources;
    }

    public DeleteAIGWCustomGuardrailPolicyResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAIGWCustomGuardrailPolicyResult(DeleteAIGWCustomGuardrailPolicyResult source) {
        if (source.Success != null) {
            this.Success = new Boolean(source.Success);
        }
        if (source.FailedResources != null) {
            this.FailedResources = new CustomGuardrailSyncFailure[source.FailedResources.length];
            for (int i = 0; i < source.FailedResources.length; i++) {
                this.FailedResources[i] = new CustomGuardrailSyncFailure(source.FailedResources[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamArrayObj(map, prefix + "FailedResources.", this.FailedResources);

    }
}

