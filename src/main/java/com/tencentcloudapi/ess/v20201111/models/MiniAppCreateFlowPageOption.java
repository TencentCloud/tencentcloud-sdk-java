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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MiniAppCreateFlowPageOption extends AbstractModel {

    /**
    * 发起后隐藏签署码
    */
    @SerializedName("HideSignCodeAfterStart")
    @Expose
    private Boolean HideSignCodeAfterStart;

    /**
     * Get 发起后隐藏签署码 
     * @return HideSignCodeAfterStart 发起后隐藏签署码
     */
    public Boolean getHideSignCodeAfterStart() {
        return this.HideSignCodeAfterStart;
    }

    /**
     * Set 发起后隐藏签署码
     * @param HideSignCodeAfterStart 发起后隐藏签署码
     */
    public void setHideSignCodeAfterStart(Boolean HideSignCodeAfterStart) {
        this.HideSignCodeAfterStart = HideSignCodeAfterStart;
    }

    public MiniAppCreateFlowPageOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MiniAppCreateFlowPageOption(MiniAppCreateFlowPageOption source) {
        if (source.HideSignCodeAfterStart != null) {
            this.HideSignCodeAfterStart = new Boolean(source.HideSignCodeAfterStart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HideSignCodeAfterStart", this.HideSignCodeAfterStart);

    }
}

