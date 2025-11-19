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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VisionCustomDetectQuery extends AbstractModel {

    /**
    * 自定义标签的标识符
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 自定义标签的描述文本
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get 自定义标签的标识符 
     * @return Key 自定义标签的标识符
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 自定义标签的标识符
     * @param Key 自定义标签的标识符
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 自定义标签的描述文本 
     * @return Query 自定义标签的描述文本
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 自定义标签的描述文本
     * @param Query 自定义标签的描述文本
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public VisionCustomDetectQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VisionCustomDetectQuery(VisionCustomDetectQuery source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

