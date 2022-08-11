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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTrainingModelRequest extends AbstractModel{

    /**
    * 模型ID
    */
    @SerializedName("TrainingModelId")
    @Expose
    private String TrainingModelId;

    /**
    * 是否同步清理cos
    */
    @SerializedName("EnableDeleteCos")
    @Expose
    private Boolean EnableDeleteCos;

    /**
    * 删除模型类型，枚举值：NORMAL 普通，ACCELERATE 加速，不传则删除所有
    */
    @SerializedName("ModelVersionType")
    @Expose
    private String ModelVersionType;

    /**
     * Get 模型ID 
     * @return TrainingModelId 模型ID
     */
    public String getTrainingModelId() {
        return this.TrainingModelId;
    }

    /**
     * Set 模型ID
     * @param TrainingModelId 模型ID
     */
    public void setTrainingModelId(String TrainingModelId) {
        this.TrainingModelId = TrainingModelId;
    }

    /**
     * Get 是否同步清理cos 
     * @return EnableDeleteCos 是否同步清理cos
     */
    public Boolean getEnableDeleteCos() {
        return this.EnableDeleteCos;
    }

    /**
     * Set 是否同步清理cos
     * @param EnableDeleteCos 是否同步清理cos
     */
    public void setEnableDeleteCos(Boolean EnableDeleteCos) {
        this.EnableDeleteCos = EnableDeleteCos;
    }

    /**
     * Get 删除模型类型，枚举值：NORMAL 普通，ACCELERATE 加速，不传则删除所有 
     * @return ModelVersionType 删除模型类型，枚举值：NORMAL 普通，ACCELERATE 加速，不传则删除所有
     */
    public String getModelVersionType() {
        return this.ModelVersionType;
    }

    /**
     * Set 删除模型类型，枚举值：NORMAL 普通，ACCELERATE 加速，不传则删除所有
     * @param ModelVersionType 删除模型类型，枚举值：NORMAL 普通，ACCELERATE 加速，不传则删除所有
     */
    public void setModelVersionType(String ModelVersionType) {
        this.ModelVersionType = ModelVersionType;
    }

    public DeleteTrainingModelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTrainingModelRequest(DeleteTrainingModelRequest source) {
        if (source.TrainingModelId != null) {
            this.TrainingModelId = new String(source.TrainingModelId);
        }
        if (source.EnableDeleteCos != null) {
            this.EnableDeleteCos = new Boolean(source.EnableDeleteCos);
        }
        if (source.ModelVersionType != null) {
            this.ModelVersionType = new String(source.ModelVersionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrainingModelId", this.TrainingModelId);
        this.setParamSimple(map, prefix + "EnableDeleteCos", this.EnableDeleteCos);
        this.setParamSimple(map, prefix + "ModelVersionType", this.ModelVersionType);

    }
}

