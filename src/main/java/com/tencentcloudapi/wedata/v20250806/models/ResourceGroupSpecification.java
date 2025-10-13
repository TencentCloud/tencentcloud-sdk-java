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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceGroupSpecification extends AbstractModel {

    /**
    * 资源组规格
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * 数量
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
     * Get 资源组规格 
     * @return Specification 资源组规格
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set 资源组规格
     * @param Specification 资源组规格
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get 数量 
     * @return Number 数量
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 数量
     * @param Number 数量
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    public ResourceGroupSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceGroupSpecification(ResourceGroupSpecification source) {
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "Number", this.Number);

    }
}

