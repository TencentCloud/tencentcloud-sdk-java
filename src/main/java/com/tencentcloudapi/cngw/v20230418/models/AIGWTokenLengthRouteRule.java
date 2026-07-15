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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWTokenLengthRouteRule extends AbstractModel {

    /**
    * <p>token 长度下界，闭区间；0 合法</p>
    */
    @SerializedName("MinTokenLength")
    @Expose
    private Long MinTokenLength;

    /**
    * <p>token 长度上界，闭区间</p>
    */
    @SerializedName("MaxTokenLength")
    @Expose
    private Long MaxTokenLength;

    /**
    * <p>命中该分段后执行的二级路由</p>
    */
    @SerializedName("Target")
    @Expose
    private AIGWLLMModelServiceSubRoute Target;

    /**
     * Get <p>token 长度下界，闭区间；0 合法</p> 
     * @return MinTokenLength <p>token 长度下界，闭区间；0 合法</p>
     */
    public Long getMinTokenLength() {
        return this.MinTokenLength;
    }

    /**
     * Set <p>token 长度下界，闭区间；0 合法</p>
     * @param MinTokenLength <p>token 长度下界，闭区间；0 合法</p>
     */
    public void setMinTokenLength(Long MinTokenLength) {
        this.MinTokenLength = MinTokenLength;
    }

    /**
     * Get <p>token 长度上界，闭区间</p> 
     * @return MaxTokenLength <p>token 长度上界，闭区间</p>
     */
    public Long getMaxTokenLength() {
        return this.MaxTokenLength;
    }

    /**
     * Set <p>token 长度上界，闭区间</p>
     * @param MaxTokenLength <p>token 长度上界，闭区间</p>
     */
    public void setMaxTokenLength(Long MaxTokenLength) {
        this.MaxTokenLength = MaxTokenLength;
    }

    /**
     * Get <p>命中该分段后执行的二级路由</p> 
     * @return Target <p>命中该分段后执行的二级路由</p>
     */
    public AIGWLLMModelServiceSubRoute getTarget() {
        return this.Target;
    }

    /**
     * Set <p>命中该分段后执行的二级路由</p>
     * @param Target <p>命中该分段后执行的二级路由</p>
     */
    public void setTarget(AIGWLLMModelServiceSubRoute Target) {
        this.Target = Target;
    }

    public AIGWTokenLengthRouteRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWTokenLengthRouteRule(AIGWTokenLengthRouteRule source) {
        if (source.MinTokenLength != null) {
            this.MinTokenLength = new Long(source.MinTokenLength);
        }
        if (source.MaxTokenLength != null) {
            this.MaxTokenLength = new Long(source.MaxTokenLength);
        }
        if (source.Target != null) {
            this.Target = new AIGWLLMModelServiceSubRoute(source.Target);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinTokenLength", this.MinTokenLength);
        this.setParamSimple(map, prefix + "MaxTokenLength", this.MaxTokenLength);
        this.setParamObj(map, prefix + "Target.", this.Target);

    }
}

