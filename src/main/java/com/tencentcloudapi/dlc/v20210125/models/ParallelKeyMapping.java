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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParallelKeyMapping extends AbstractModel {

    /**
    * <p>并行类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>该并行类型对应的参数 key 列表</p>
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
     * Get <p>并行类型</p> 
     * @return Type <p>并行类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>并行类型</p>
     * @param Type <p>并行类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>该并行类型对应的参数 key 列表</p> 
     * @return Keys <p>该并行类型对应的参数 key 列表</p>
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set <p>该并行类型对应的参数 key 列表</p>
     * @param Keys <p>该并行类型对应的参数 key 列表</p>
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    public ParallelKeyMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParallelKeyMapping(ParallelKeyMapping source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Keys != null) {
            this.Keys = new String[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new String(source.Keys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);

    }
}

