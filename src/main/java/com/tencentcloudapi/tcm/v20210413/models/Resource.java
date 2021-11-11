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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resource extends AbstractModel{

    /**
    * 资源类型 cpu/memory
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资源数量
    */
    @SerializedName("Quantity")
    @Expose
    private String Quantity;

    /**
     * Get 资源类型 cpu/memory 
     * @return Name 资源类型 cpu/memory
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源类型 cpu/memory
     * @param Name 资源类型 cpu/memory
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资源数量 
     * @return Quantity 资源数量
     */
    public String getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 资源数量
     * @param Quantity 资源数量
     */
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public Resource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resource(Resource source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Quantity != null) {
            this.Quantity = new String(source.Quantity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);

    }
}

