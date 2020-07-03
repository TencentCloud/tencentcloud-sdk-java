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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateProductRequest extends AbstractModel{

    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 产品名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 产品描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 数据模版
    */
    @SerializedName("DataTemplate")
    @Expose
    private DataTemplate [] DataTemplate;

    /**
     * Get 产品Id 
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 产品名称 
     * @return Name 产品名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 产品名称
     * @param Name 产品名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 产品描述 
     * @return Description 产品描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 产品描述
     * @param Description 产品描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 数据模版 
     * @return DataTemplate 数据模版
     */
    public DataTemplate [] getDataTemplate() {
        return this.DataTemplate;
    }

    /**
     * Set 数据模版
     * @param DataTemplate 数据模版
     */
    public void setDataTemplate(DataTemplate [] DataTemplate) {
        this.DataTemplate = DataTemplate;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "DataTemplate.", this.DataTemplate);

    }
}

