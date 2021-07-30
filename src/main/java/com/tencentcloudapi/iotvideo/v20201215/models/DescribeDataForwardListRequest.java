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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataForwardListRequest extends AbstractModel{

    /**
    * 产品ID列表
    */
    @SerializedName("ProductIds")
    @Expose
    private String ProductIds;

    /**
     * Get 产品ID列表 
     * @return ProductIds 产品ID列表
     */
    public String getProductIds() {
        return this.ProductIds;
    }

    /**
     * Set 产品ID列表
     * @param ProductIds 产品ID列表
     */
    public void setProductIds(String ProductIds) {
        this.ProductIds = ProductIds;
    }

    public DescribeDataForwardListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataForwardListRequest(DescribeDataForwardListRequest source) {
        if (source.ProductIds != null) {
            this.ProductIds = new String(source.ProductIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductIds", this.ProductIds);

    }
}

