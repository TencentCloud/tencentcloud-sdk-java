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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Operator extends AbstractModel{

    /**
    * 运算符标识
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 运算符展示名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 运算符标识 
     * @return Id 运算符标识
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 运算符标识
     * @param Id 运算符标识
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 运算符展示名 
     * @return Name 运算符展示名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 运算符展示名
     * @param Name 运算符展示名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public Operator() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Operator(Operator source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

