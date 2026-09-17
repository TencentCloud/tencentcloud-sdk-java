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

public class CheckResult extends AbstractModel {

    /**
    * 是否通过校验
    */
    @SerializedName("Passed")
    @Expose
    private Boolean Passed;

    /**
    * 失败原因（passed=false 时填充）
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 是否通过校验 
     * @return Passed 是否通过校验
     */
    public Boolean getPassed() {
        return this.Passed;
    }

    /**
     * Set 是否通过校验
     * @param Passed 是否通过校验
     */
    public void setPassed(Boolean Passed) {
        this.Passed = Passed;
    }

    /**
     * Get 失败原因（passed=false 时填充） 
     * @return Reason 失败原因（passed=false 时填充）
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 失败原因（passed=false 时填充）
     * @param Reason 失败原因（passed=false 时填充）
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public CheckResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckResult(CheckResult source) {
        if (source.Passed != null) {
            this.Passed = new Boolean(source.Passed);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Passed", this.Passed);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

