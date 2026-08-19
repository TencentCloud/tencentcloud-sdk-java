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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomActionParameters extends AbstractModel {

    /**
    * <p>需要配置的定制配置列表。</p>
    */
    @SerializedName("CustomActions")
    @Expose
    private CustomAction [] CustomActions;

    /**
     * Get <p>需要配置的定制配置列表。</p> 
     * @return CustomActions <p>需要配置的定制配置列表。</p>
     */
    public CustomAction [] getCustomActions() {
        return this.CustomActions;
    }

    /**
     * Set <p>需要配置的定制配置列表。</p>
     * @param CustomActions <p>需要配置的定制配置列表。</p>
     */
    public void setCustomActions(CustomAction [] CustomActions) {
        this.CustomActions = CustomActions;
    }

    public CustomActionParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomActionParameters(CustomActionParameters source) {
        if (source.CustomActions != null) {
            this.CustomActions = new CustomAction[source.CustomActions.length];
            for (int i = 0; i < source.CustomActions.length; i++) {
                this.CustomActions[i] = new CustomAction(source.CustomActions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CustomActions.", this.CustomActions);

    }
}

