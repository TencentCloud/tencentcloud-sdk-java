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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KubeJarvisStateResultObjInfo extends AbstractModel {

    /**
    * 对象属性名称
    */
    @SerializedName("PropertyName")
    @Expose
    private String PropertyName;

    /**
    * 对象属性值
    */
    @SerializedName("PropertyValue")
    @Expose
    private String PropertyValue;

    /**
     * Get 对象属性名称 
     * @return PropertyName 对象属性名称
     */
    public String getPropertyName() {
        return this.PropertyName;
    }

    /**
     * Set 对象属性名称
     * @param PropertyName 对象属性名称
     */
    public void setPropertyName(String PropertyName) {
        this.PropertyName = PropertyName;
    }

    /**
     * Get 对象属性值 
     * @return PropertyValue 对象属性值
     */
    public String getPropertyValue() {
        return this.PropertyValue;
    }

    /**
     * Set 对象属性值
     * @param PropertyValue 对象属性值
     */
    public void setPropertyValue(String PropertyValue) {
        this.PropertyValue = PropertyValue;
    }

    public KubeJarvisStateResultObjInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KubeJarvisStateResultObjInfo(KubeJarvisStateResultObjInfo source) {
        if (source.PropertyName != null) {
            this.PropertyName = new String(source.PropertyName);
        }
        if (source.PropertyValue != null) {
            this.PropertyValue = new String(source.PropertyValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PropertyName", this.PropertyName);
        this.setParamSimple(map, prefix + "PropertyValue", this.PropertyValue);

    }
}

