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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Column extends AbstractModel {

    /**
    * 列的名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 列的属性
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 列的名字 
     * @return Name 列的名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 列的名字
     * @param Name 列的名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 列的属性 
     * @return Type 列的属性
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 列的属性
     * @param Type 列的属性
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public Column() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Column(Column source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

