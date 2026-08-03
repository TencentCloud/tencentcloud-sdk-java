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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConversationRecordTimeUsage extends AbstractModel {

    /**
    * <p>单次对话总耗时，单位毫秒</p>
    */
    @SerializedName("Elapsed")
    @Expose
    private String Elapsed;

    /**
    * <p>首 token 耗时，单位毫秒</p>
    */
    @SerializedName("FirstTokenCost")
    @Expose
    private String FirstTokenCost;

    /**
    * <p>模型推理总耗时，单位毫秒</p>
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
     * Get <p>单次对话总耗时，单位毫秒</p> 
     * @return Elapsed <p>单次对话总耗时，单位毫秒</p>
     */
    public String getElapsed() {
        return this.Elapsed;
    }

    /**
     * Set <p>单次对话总耗时，单位毫秒</p>
     * @param Elapsed <p>单次对话总耗时，单位毫秒</p>
     */
    public void setElapsed(String Elapsed) {
        this.Elapsed = Elapsed;
    }

    /**
     * Get <p>首 token 耗时，单位毫秒</p> 
     * @return FirstTokenCost <p>首 token 耗时，单位毫秒</p>
     */
    public String getFirstTokenCost() {
        return this.FirstTokenCost;
    }

    /**
     * Set <p>首 token 耗时，单位毫秒</p>
     * @param FirstTokenCost <p>首 token 耗时，单位毫秒</p>
     */
    public void setFirstTokenCost(String FirstTokenCost) {
        this.FirstTokenCost = FirstTokenCost;
    }

    /**
     * Get <p>模型推理总耗时，单位毫秒</p> 
     * @return TotalCost <p>模型推理总耗时，单位毫秒</p>
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set <p>模型推理总耗时，单位毫秒</p>
     * @param TotalCost <p>模型推理总耗时，单位毫秒</p>
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    public ConversationRecordTimeUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationRecordTimeUsage(ConversationRecordTimeUsage source) {
        if (source.Elapsed != null) {
            this.Elapsed = new String(source.Elapsed);
        }
        if (source.FirstTokenCost != null) {
            this.FirstTokenCost = new String(source.FirstTokenCost);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Elapsed", this.Elapsed);
        this.setParamSimple(map, prefix + "FirstTokenCost", this.FirstTokenCost);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);

    }
}

