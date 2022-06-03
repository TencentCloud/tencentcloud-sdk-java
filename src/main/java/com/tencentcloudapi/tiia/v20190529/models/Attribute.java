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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Attribute extends AbstractModel{

    /**
    * 属性
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 属性详情
    */
    @SerializedName("Details")
    @Expose
    private String Details;

    /**
     * Get 属性 
     * @return Type 属性
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 属性
     * @param Type 属性
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 属性详情 
     * @return Details 属性详情
     */
    public String getDetails() {
        return this.Details;
    }

    /**
     * Set 属性详情
     * @param Details 属性详情
     */
    public void setDetails(String Details) {
        this.Details = Details;
    }

    public Attribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Attribute(Attribute source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Details != null) {
            this.Details = new String(source.Details);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Details", this.Details);

    }
}

