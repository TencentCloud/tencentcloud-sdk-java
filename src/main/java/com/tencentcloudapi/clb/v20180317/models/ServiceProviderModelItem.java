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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceProviderModelItem extends AbstractModel {

    /**
    * <p>关联的模型路由实例列表</p>
    */
    @SerializedName("AssociatedModelRouters")
    @Expose
    private AssociatedModelRouterItem [] AssociatedModelRouters;

    /**
    * <p>该模型当前支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul><p>默认值：text</p>
    */
    @SerializedName("InputModalities")
    @Expose
    private String [] InputModalities;

    /**
    * <p>模型别名, 可以用于实际访问</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelAlias")
    @Expose
    private String ModelAlias;

    /**
    * <p>模型唯一标识, 原始模型名称</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>该模型经探测最多支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>image： 支持图像输入</li></ul><p>模型不健康时列表为空</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProbedInputModalities")
    @Expose
    private String [] ProbedInputModalities;

    /**
     * Get <p>关联的模型路由实例列表</p> 
     * @return AssociatedModelRouters <p>关联的模型路由实例列表</p>
     */
    public AssociatedModelRouterItem [] getAssociatedModelRouters() {
        return this.AssociatedModelRouters;
    }

    /**
     * Set <p>关联的模型路由实例列表</p>
     * @param AssociatedModelRouters <p>关联的模型路由实例列表</p>
     */
    public void setAssociatedModelRouters(AssociatedModelRouterItem [] AssociatedModelRouters) {
        this.AssociatedModelRouters = AssociatedModelRouters;
    }

    /**
     * Get <p>该模型当前支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul><p>默认值：text</p> 
     * @return InputModalities <p>该模型当前支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul><p>默认值：text</p>
     */
    public String [] getInputModalities() {
        return this.InputModalities;
    }

    /**
     * Set <p>该模型当前支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul><p>默认值：text</p>
     * @param InputModalities <p>该模型当前支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li></ul><p>默认值：text</p>
     */
    public void setInputModalities(String [] InputModalities) {
        this.InputModalities = InputModalities;
    }

    /**
     * Get <p>模型别名, 可以用于实际访问</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelAlias <p>模型别名, 可以用于实际访问</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelAlias() {
        return this.ModelAlias;
    }

    /**
     * Set <p>模型别名, 可以用于实际访问</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelAlias <p>模型别名, 可以用于实际访问</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelAlias(String ModelAlias) {
        this.ModelAlias = ModelAlias;
    }

    /**
     * Get <p>模型唯一标识, 原始模型名称</p> 
     * @return ModelId <p>模型唯一标识, 原始模型名称</p>
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>模型唯一标识, 原始模型名称</p>
     * @param ModelId <p>模型唯一标识, 原始模型名称</p>
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>该模型经探测最多支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>image： 支持图像输入</li></ul><p>模型不健康时列表为空</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProbedInputModalities <p>该模型经探测最多支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>image： 支持图像输入</li></ul><p>模型不健康时列表为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getProbedInputModalities() {
        return this.ProbedInputModalities;
    }

    /**
     * Set <p>该模型经探测最多支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>image： 支持图像输入</li></ul><p>模型不健康时列表为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProbedInputModalities <p>该模型经探测最多支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>image： 支持图像输入</li></ul><p>模型不健康时列表为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProbedInputModalities(String [] ProbedInputModalities) {
        this.ProbedInputModalities = ProbedInputModalities;
    }

    public ServiceProviderModelItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceProviderModelItem(ServiceProviderModelItem source) {
        if (source.AssociatedModelRouters != null) {
            this.AssociatedModelRouters = new AssociatedModelRouterItem[source.AssociatedModelRouters.length];
            for (int i = 0; i < source.AssociatedModelRouters.length; i++) {
                this.AssociatedModelRouters[i] = new AssociatedModelRouterItem(source.AssociatedModelRouters[i]);
            }
        }
        if (source.InputModalities != null) {
            this.InputModalities = new String[source.InputModalities.length];
            for (int i = 0; i < source.InputModalities.length; i++) {
                this.InputModalities[i] = new String(source.InputModalities[i]);
            }
        }
        if (source.ModelAlias != null) {
            this.ModelAlias = new String(source.ModelAlias);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ProbedInputModalities != null) {
            this.ProbedInputModalities = new String[source.ProbedInputModalities.length];
            for (int i = 0; i < source.ProbedInputModalities.length; i++) {
                this.ProbedInputModalities[i] = new String(source.ProbedInputModalities[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AssociatedModelRouters.", this.AssociatedModelRouters);
        this.setParamArraySimple(map, prefix + "InputModalities.", this.InputModalities);
        this.setParamSimple(map, prefix + "ModelAlias", this.ModelAlias);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamArraySimple(map, prefix + "ProbedInputModalities.", this.ProbedInputModalities);

    }
}

