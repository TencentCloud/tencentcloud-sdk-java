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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductResourceRequest extends AbstractModel{

    /**
    * 需要查看资源列表的产品 ID
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 需要过滤的资源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 需要查看资源列表的产品 ID 
     * @return ProductID 需要查看资源列表的产品 ID
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 需要查看资源列表的产品 ID
     * @param ProductID 需要查看资源列表的产品 ID
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 需要过滤的资源名称 
     * @return Name 需要过滤的资源名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 需要过滤的资源名称
     * @param Name 需要过滤的资源名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeProductResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProductResourceRequest(DescribeProductResourceRequest source) {
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

