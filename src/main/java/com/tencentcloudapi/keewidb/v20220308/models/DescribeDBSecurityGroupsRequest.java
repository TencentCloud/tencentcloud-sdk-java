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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSecurityGroupsRequest extends AbstractModel{

    /**
    * 数据库引擎名称：keewidb。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 实例ID，格式如：kee-c1nl9***。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 数据库引擎名称：keewidb。 
     * @return Product 数据库引擎名称：keewidb。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 数据库引擎名称：keewidb。
     * @param Product 数据库引擎名称：keewidb。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 实例ID，格式如：kee-c1nl9***。 
     * @return InstanceId 实例ID，格式如：kee-c1nl9***。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：kee-c1nl9***。
     * @param InstanceId 实例ID，格式如：kee-c1nl9***。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DescribeDBSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSecurityGroupsRequest(DescribeDBSecurityGroupsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

