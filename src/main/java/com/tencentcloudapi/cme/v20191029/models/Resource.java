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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resource extends AbstractModel{

    /**
    * 类型，取值有：
<li>MATERIAL：素材。</li>
<li>CLASS：分类。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 资源 Id，当 Type 为 MATERIAL 时，取值为素材 Id；当 Type 为 CLASS 时，取值为分类路径 ClassPath。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 类型，取值有：
<li>MATERIAL：素材。</li>
<li>CLASS：分类。</li> 
     * @return Type 类型，取值有：
<li>MATERIAL：素材。</li>
<li>CLASS：分类。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，取值有：
<li>MATERIAL：素材。</li>
<li>CLASS：分类。</li>
     * @param Type 类型，取值有：
<li>MATERIAL：素材。</li>
<li>CLASS：分类。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 资源 Id，当 Type 为 MATERIAL 时，取值为素材 Id；当 Type 为 CLASS 时，取值为分类路径 ClassPath。 
     * @return Id 资源 Id，当 Type 为 MATERIAL 时，取值为素材 Id；当 Type 为 CLASS 时，取值为分类路径 ClassPath。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源 Id，当 Type 为 MATERIAL 时，取值为素材 Id；当 Type 为 CLASS 时，取值为分类路径 ClassPath。
     * @param Id 资源 Id，当 Type 为 MATERIAL 时，取值为素材 Id；当 Type 为 CLASS 时，取值为分类路径 ClassPath。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

