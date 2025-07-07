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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWebHookRuleRequest extends AbstractModel {

    /**
    * 规则内容
    */
    @SerializedName("Data")
    @Expose
    private WebHookRuleDetail Data;

    /**
     * Get 规则内容 
     * @return Data 规则内容
     */
    public WebHookRuleDetail getData() {
        return this.Data;
    }

    /**
     * Set 规则内容
     * @param Data 规则内容
     */
    public void setData(WebHookRuleDetail Data) {
        this.Data = Data;
    }

    public ModifyWebHookRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebHookRuleRequest(ModifyWebHookRuleRequest source) {
        if (source.Data != null) {
            this.Data = new WebHookRuleDetail(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);

    }
}

