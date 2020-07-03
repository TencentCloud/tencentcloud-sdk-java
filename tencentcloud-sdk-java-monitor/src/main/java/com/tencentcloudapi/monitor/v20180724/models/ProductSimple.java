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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductSimple extends AbstractModel{

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 产品中文名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品英文名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductEnName")
    @Expose
    private String ProductEnName;

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 产品中文名称 
     * @return ProductName 产品中文名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品中文名称
     * @param ProductName 产品中文名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 产品英文名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductEnName 产品英文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductEnName() {
        return this.ProductEnName;
    }

    /**
     * Set 产品英文名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductEnName 产品英文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductEnName(String ProductEnName) {
        this.ProductEnName = ProductEnName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductEnName", this.ProductEnName);

    }
}

