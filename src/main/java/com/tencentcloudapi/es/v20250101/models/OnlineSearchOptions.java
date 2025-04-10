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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OnlineSearchOptions extends AbstractModel {

    /**
    * 搜索引擎。支持 bing 和 sogou。
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
     * Get 搜索引擎。支持 bing 和 sogou。 
     * @return Engine 搜索引擎。支持 bing 和 sogou。
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set 搜索引擎。支持 bing 和 sogou。
     * @param Engine 搜索引擎。支持 bing 和 sogou。
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    public OnlineSearchOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OnlineSearchOptions(OnlineSearchOptions source) {
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Engine", this.Engine);

    }
}

