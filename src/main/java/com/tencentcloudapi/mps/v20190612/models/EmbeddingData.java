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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmbeddingData extends AbstractModel {

    /**
    * <p>数据类型</p><p>枚举值：</p><ul><li>text： 文本</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>数据内容，当Type 为text时，为文本字符串</p>
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get <p>数据类型</p><p>枚举值：</p><ul><li>text： 文本</li></ul> 
     * @return Type <p>数据类型</p><p>枚举值：</p><ul><li>text： 文本</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>数据类型</p><p>枚举值：</p><ul><li>text： 文本</li></ul>
     * @param Type <p>数据类型</p><p>枚举值：</p><ul><li>text： 文本</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>数据内容，当Type 为text时，为文本字符串</p> 
     * @return Data <p>数据内容，当Type 为text时，为文本字符串</p>
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set <p>数据内容，当Type 为text时，为文本字符串</p>
     * @param Data <p>数据内容，当Type 为text时，为文本字符串</p>
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public EmbeddingData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmbeddingData(EmbeddingData source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

