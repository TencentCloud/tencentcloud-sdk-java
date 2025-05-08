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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * 资源筛选条件
    */
    @SerializedName("ResourceFields")
    @Expose
    private ResourceField [] ResourceFields;

    /**
     * Get 资源筛选条件 
     * @return ResourceFields 资源筛选条件
     */
    public ResourceField [] getResourceFields() {
        return this.ResourceFields;
    }

    /**
     * Set 资源筛选条件
     * @param ResourceFields 资源筛选条件
     */
    public void setResourceFields(ResourceField [] ResourceFields) {
        this.ResourceFields = ResourceFields;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.ResourceFields != null) {
            this.ResourceFields = new ResourceField[source.ResourceFields.length];
            for (int i = 0; i < source.ResourceFields.length; i++) {
                this.ResourceFields[i] = new ResourceField(source.ResourceFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ResourceFields.", this.ResourceFields);

    }
}

