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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DidAttribute extends AbstractModel {

    /**
    * 键名
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 键值
    */
    @SerializedName("Val")
    @Expose
    private String Val;

    /**
     * Get 键名 
     * @return Key 键名
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 键名
     * @param Key 键名
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 键值 
     * @return Val 键值
     */
    public String getVal() {
        return this.Val;
    }

    /**
     * Set 键值
     * @param Val 键值
     */
    public void setVal(String Val) {
        this.Val = Val;
    }

    public DidAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DidAttribute(DidAttribute source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Val != null) {
            this.Val = new String(source.Val);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Val", this.Val);

    }
}

