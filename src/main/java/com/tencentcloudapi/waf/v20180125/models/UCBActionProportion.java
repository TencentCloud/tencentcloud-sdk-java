/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UCBActionProportion extends AbstractModel {

    /**
    * 动作
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 比例
    */
    @SerializedName("Proportion")
    @Expose
    private Float Proportion;

    /**
     * Get 动作 
     * @return Action 动作
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 动作
     * @param Action 动作
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 比例 
     * @return Proportion 比例
     */
    public Float getProportion() {
        return this.Proportion;
    }

    /**
     * Set 比例
     * @param Proportion 比例
     */
    public void setProportion(Float Proportion) {
        this.Proportion = Proportion;
    }

    public UCBActionProportion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UCBActionProportion(UCBActionProportion source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Proportion != null) {
            this.Proportion = new Float(source.Proportion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Proportion", this.Proportion);

    }
}

