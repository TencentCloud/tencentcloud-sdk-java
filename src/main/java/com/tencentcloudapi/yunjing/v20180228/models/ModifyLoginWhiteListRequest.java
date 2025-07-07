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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoginWhiteListRequest extends AbstractModel {

    /**
    * 白名单规则
    */
    @SerializedName("Rules")
    @Expose
    private LoginWhiteListsRule Rules;

    /**
     * Get 白名单规则 
     * @return Rules 白名单规则
     */
    public LoginWhiteListsRule getRules() {
        return this.Rules;
    }

    /**
     * Set 白名单规则
     * @param Rules 白名单规则
     */
    public void setRules(LoginWhiteListsRule Rules) {
        this.Rules = Rules;
    }

    public ModifyLoginWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoginWhiteListRequest(ModifyLoginWhiteListRequest source) {
        if (source.Rules != null) {
            this.Rules = new LoginWhiteListsRule(source.Rules);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Rules.", this.Rules);

    }
}

