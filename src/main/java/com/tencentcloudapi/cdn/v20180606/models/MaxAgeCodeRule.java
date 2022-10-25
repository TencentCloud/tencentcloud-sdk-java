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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaxAgeCodeRule extends AbstractModel{

    /**
    * 处理动作
clear：清除 cache-control 头部
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 指定HTTP状态码生效，当前仅支持填写"400-599"
    */
    @SerializedName("StatusCodes")
    @Expose
    private String [] StatusCodes;

    /**
     * Get 处理动作
clear：清除 cache-control 头部 
     * @return Action 处理动作
clear：清除 cache-control 头部
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 处理动作
clear：清除 cache-control 头部
     * @param Action 处理动作
clear：清除 cache-control 头部
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 指定HTTP状态码生效，当前仅支持填写"400-599" 
     * @return StatusCodes 指定HTTP状态码生效，当前仅支持填写"400-599"
     */
    public String [] getStatusCodes() {
        return this.StatusCodes;
    }

    /**
     * Set 指定HTTP状态码生效，当前仅支持填写"400-599"
     * @param StatusCodes 指定HTTP状态码生效，当前仅支持填写"400-599"
     */
    public void setStatusCodes(String [] StatusCodes) {
        this.StatusCodes = StatusCodes;
    }

    public MaxAgeCodeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaxAgeCodeRule(MaxAgeCodeRule source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.StatusCodes != null) {
            this.StatusCodes = new String[source.StatusCodes.length];
            for (int i = 0; i < source.StatusCodes.length; i++) {
                this.StatusCodes[i] = new String(source.StatusCodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArraySimple(map, prefix + "StatusCodes.", this.StatusCodes);

    }
}

