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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelInfo extends AbstractModel {

    /**
    * 工作空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 模型名称
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 物模型id
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 关联产品信息
    */
    @SerializedName("RelatedProduct")
    @Expose
    private RelatedProduct [] RelatedProduct;

    /**
    * 设备类型名
    */
    @SerializedName("DeviceTypeName")
    @Expose
    private String DeviceTypeName;

    /**
    * 设备类型id
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 物模型类型，产品模型/标准模型
    */
    @SerializedName("ModelType")
    @Expose
    private Long ModelType;

    /**
    * 模型参数内容,有效字段为"x-json:"后的字段
    */
    @SerializedName("ModelParams")
    @Expose
    private String ModelParams;

    /**
     * Get 工作空间id 
     * @return WorkspaceId 工作空间id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间id
     * @param WorkspaceId 工作空间id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 模型名称 
     * @return ModelName 模型名称
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称
     * @param ModelName 模型名称
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 物模型id 
     * @return ModelId 物模型id
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 物模型id
     * @param ModelId 物模型id
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 关联产品信息 
     * @return RelatedProduct 关联产品信息
     */
    public RelatedProduct [] getRelatedProduct() {
        return this.RelatedProduct;
    }

    /**
     * Set 关联产品信息
     * @param RelatedProduct 关联产品信息
     */
    public void setRelatedProduct(RelatedProduct [] RelatedProduct) {
        this.RelatedProduct = RelatedProduct;
    }

    /**
     * Get 设备类型名 
     * @return DeviceTypeName 设备类型名
     */
    public String getDeviceTypeName() {
        return this.DeviceTypeName;
    }

    /**
     * Set 设备类型名
     * @param DeviceTypeName 设备类型名
     */
    public void setDeviceTypeName(String DeviceTypeName) {
        this.DeviceTypeName = DeviceTypeName;
    }

    /**
     * Get 设备类型id 
     * @return DeviceType 设备类型id
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型id
     * @param DeviceType 设备类型id
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 物模型类型，产品模型/标准模型 
     * @return ModelType 物模型类型，产品模型/标准模型
     */
    public Long getModelType() {
        return this.ModelType;
    }

    /**
     * Set 物模型类型，产品模型/标准模型
     * @param ModelType 物模型类型，产品模型/标准模型
     */
    public void setModelType(Long ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get 模型参数内容,有效字段为"x-json:"后的字段 
     * @return ModelParams 模型参数内容,有效字段为"x-json:"后的字段
     */
    public String getModelParams() {
        return this.ModelParams;
    }

    /**
     * Set 模型参数内容,有效字段为"x-json:"后的字段
     * @param ModelParams 模型参数内容,有效字段为"x-json:"后的字段
     */
    public void setModelParams(String ModelParams) {
        this.ModelParams = ModelParams;
    }

    public ModelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelInfo(ModelInfo source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.RelatedProduct != null) {
            this.RelatedProduct = new RelatedProduct[source.RelatedProduct.length];
            for (int i = 0; i < source.RelatedProduct.length; i++) {
                this.RelatedProduct[i] = new RelatedProduct(source.RelatedProduct[i]);
            }
        }
        if (source.DeviceTypeName != null) {
            this.DeviceTypeName = new String(source.DeviceTypeName);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.ModelType != null) {
            this.ModelType = new Long(source.ModelType);
        }
        if (source.ModelParams != null) {
            this.ModelParams = new String(source.ModelParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamArrayObj(map, prefix + "RelatedProduct.", this.RelatedProduct);
        this.setParamSimple(map, prefix + "DeviceTypeName", this.DeviceTypeName);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "ModelParams", this.ModelParams);

    }
}

