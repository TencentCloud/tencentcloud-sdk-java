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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LlmResult extends AbstractModel {

    /**
    * <p>能力名</p>
    */
    @SerializedName("Feature")
    @Expose
    private String Feature;

    /**
    * <p>结果</p>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>这个能力是否成功得到结果</p>
    */
    @SerializedName("Success")
    @Expose
    private Boolean Success;

    /**
     * Get <p>能力名</p> 
     * @return Feature <p>能力名</p>
     */
    public String getFeature() {
        return this.Feature;
    }

    /**
     * Set <p>能力名</p>
     * @param Feature <p>能力名</p>
     */
    public void setFeature(String Feature) {
        this.Feature = Feature;
    }

    /**
     * Get <p>结果</p> 
     * @return Result <p>结果</p>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>结果</p>
     * @param Result <p>结果</p>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>这个能力是否成功得到结果</p> 
     * @return Success <p>这个能力是否成功得到结果</p>
     */
    public Boolean getSuccess() {
        return this.Success;
    }

    /**
     * Set <p>这个能力是否成功得到结果</p>
     * @param Success <p>这个能力是否成功得到结果</p>
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    public LlmResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LlmResult(LlmResult source) {
        if (source.Feature != null) {
            this.Feature = new String(source.Feature);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Success != null) {
            this.Success = new Boolean(source.Success);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Feature", this.Feature);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Success", this.Success);

    }
}

