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

public class SaveWorkflowToolNodeOutputRequest extends AbstractModel {

    /**
    * <p>回调Token</p><p>Request Header X-ADP-Callback-Token</p>
    */
    @SerializedName("CallbackToken")
    @Expose
    private String CallbackToken;

    /**
    * <p>回调结果</p>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
     * Get <p>回调Token</p><p>Request Header X-ADP-Callback-Token</p> 
     * @return CallbackToken <p>回调Token</p><p>Request Header X-ADP-Callback-Token</p>
     */
    public String getCallbackToken() {
        return this.CallbackToken;
    }

    /**
     * Set <p>回调Token</p><p>Request Header X-ADP-Callback-Token</p>
     * @param CallbackToken <p>回调Token</p><p>Request Header X-ADP-Callback-Token</p>
     */
    public void setCallbackToken(String CallbackToken) {
        this.CallbackToken = CallbackToken;
    }

    /**
     * Get <p>回调结果</p> 
     * @return Result <p>回调结果</p>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>回调结果</p>
     * @param Result <p>回调结果</p>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    public SaveWorkflowToolNodeOutputRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaveWorkflowToolNodeOutputRequest(SaveWorkflowToolNodeOutputRequest source) {
        if (source.CallbackToken != null) {
            this.CallbackToken = new String(source.CallbackToken);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackToken", this.CallbackToken);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

