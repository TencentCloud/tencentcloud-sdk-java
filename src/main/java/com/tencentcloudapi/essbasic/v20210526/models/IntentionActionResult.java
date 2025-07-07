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

public class IntentionActionResult extends AbstractModel {

    /**
    * 意愿核身结果详细数据，与每段点头确认过程一一对应
    */
    @SerializedName("Details")
    @Expose
    private IntentionActionResultDetail [] Details;

    /**
     * Get 意愿核身结果详细数据，与每段点头确认过程一一对应 
     * @return Details 意愿核身结果详细数据，与每段点头确认过程一一对应
     */
    public IntentionActionResultDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 意愿核身结果详细数据，与每段点头确认过程一一对应
     * @param Details 意愿核身结果详细数据，与每段点头确认过程一一对应
     */
    public void setDetails(IntentionActionResultDetail [] Details) {
        this.Details = Details;
    }

    public IntentionActionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntentionActionResult(IntentionActionResult source) {
        if (source.Details != null) {
            this.Details = new IntentionActionResultDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new IntentionActionResultDetail(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

