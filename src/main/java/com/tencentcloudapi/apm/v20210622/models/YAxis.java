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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class YAxis extends AbstractModel {

    /**
    * <p>接口列表</p>
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
    * <p>接口列表</p>
    */
    @SerializedName("Data")
    @Expose
    private String [] Data;

    /**
     * Get <p>接口列表</p> 
     * @return Keys <p>接口列表</p>
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set <p>接口列表</p>
     * @param Keys <p>接口列表</p>
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get <p>接口列表</p> 
     * @return Data <p>接口列表</p>
     */
    public String [] getData() {
        return this.Data;
    }

    /**
     * Set <p>接口列表</p>
     * @param Data <p>接口列表</p>
     */
    public void setData(String [] Data) {
        this.Data = Data;
    }

    public YAxis() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public YAxis(YAxis source) {
        if (source.Keys != null) {
            this.Keys = new String[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new String(source.Keys[i]);
            }
        }
        if (source.Data != null) {
            this.Data = new String[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new String(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);
        this.setParamArraySimple(map, prefix + "Data.", this.Data);

    }
}

