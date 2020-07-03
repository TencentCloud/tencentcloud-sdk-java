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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductModelDefinition extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 模型定义
    */
    @SerializedName("ModelDefine")
    @Expose
    private String ModelDefine;

    /**
    * 更新时间，秒级时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 创建时间，秒级时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 产品所属分类的模型快照（产品创建时刻的）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryModel")
    @Expose
    private String CategoryModel;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 模型定义 
     * @return ModelDefine 模型定义
     */
    public String getModelDefine() {
        return this.ModelDefine;
    }

    /**
     * Set 模型定义
     * @param ModelDefine 模型定义
     */
    public void setModelDefine(String ModelDefine) {
        this.ModelDefine = ModelDefine;
    }

    /**
     * Get 更新时间，秒级时间戳 
     * @return UpdateTime 更新时间，秒级时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，秒级时间戳
     * @param UpdateTime 更新时间，秒级时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建时间，秒级时间戳 
     * @return CreateTime 创建时间，秒级时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，秒级时间戳
     * @param CreateTime 创建时间，秒级时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 产品所属分类的模型快照（产品创建时刻的）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryModel 产品所属分类的模型快照（产品创建时刻的）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategoryModel() {
        return this.CategoryModel;
    }

    /**
     * Set 产品所属分类的模型快照（产品创建时刻的）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryModel 产品所属分类的模型快照（产品创建时刻的）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryModel(String CategoryModel) {
        this.CategoryModel = CategoryModel;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ModelDefine", this.ModelDefine);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CategoryModel", this.CategoryModel);

    }
}

