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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiDefinitionDescr extends AbstractModel{

    /**
    * 对象名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 对象属性列表
    */
    @SerializedName("Properties")
    @Expose
    private PropertyField [] Properties;

    /**
     * Get 对象名称 
     * @return Name 对象名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 对象名称
     * @param Name 对象名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 对象属性列表 
     * @return Properties 对象属性列表
     */
    public PropertyField [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 对象属性列表
     * @param Properties 对象属性列表
     */
    public void setProperties(PropertyField [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);

    }
}

