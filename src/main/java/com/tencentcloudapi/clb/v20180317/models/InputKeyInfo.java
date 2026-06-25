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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputKeyInfo extends AbstractModel {

    /**
    * <p>Key的名称</p>
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * <p>导入的明文Key</p><p>仅允许导入Key模式下输入</p>
    */
    @SerializedName("PlainKey")
    @Expose
    private String PlainKey;

    /**
     * Get <p>Key的名称</p> 
     * @return KeyName <p>Key的名称</p>
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set <p>Key的名称</p>
     * @param KeyName <p>Key的名称</p>
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get <p>导入的明文Key</p><p>仅允许导入Key模式下输入</p> 
     * @return PlainKey <p>导入的明文Key</p><p>仅允许导入Key模式下输入</p>
     */
    public String getPlainKey() {
        return this.PlainKey;
    }

    /**
     * Set <p>导入的明文Key</p><p>仅允许导入Key模式下输入</p>
     * @param PlainKey <p>导入的明文Key</p><p>仅允许导入Key模式下输入</p>
     */
    public void setPlainKey(String PlainKey) {
        this.PlainKey = PlainKey;
    }

    public InputKeyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputKeyInfo(InputKeyInfo source) {
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.PlainKey != null) {
            this.PlainKey = new String(source.PlainKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "PlainKey", this.PlainKey);

    }
}

