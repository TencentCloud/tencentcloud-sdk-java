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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrainingModelVersionsRequest extends AbstractModel {

    /**
    * <p>模型ID</p>
    */
    @SerializedName("TrainingModelId")
    @Expose
    private String TrainingModelId;

    /**
    * <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>过滤条件<br>Filter.Name: 枚举值:<br>    TrainingModelVersionId (模型版本ID)<br>    ModelVersionType (模型版本类型) 其值支持: NORMAL(通用) ACCELERATE (加速)<br>    ModelFormat（模型格式）其值Filter.Values支持：<br>TORCH_SCRIPT/PYTORCH/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/PMML<br>    AlgorithmFramework (算法框架) 其值Filter.Values支持：TENSORFLOW/PYTORCH/DETECTRON2<br>Filter.Values: 当长度为1时，支持模糊查询; 不为1时，精确查询<br>每次请求的Filters的上限为10，Filter.Values的上限为100</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>模型ID</p> 
     * @return TrainingModelId <p>模型ID</p>
     */
    public String getTrainingModelId() {
        return this.TrainingModelId;
    }

    /**
     * Set <p>模型ID</p>
     * @param TrainingModelId <p>模型ID</p>
     */
    public void setTrainingModelId(String TrainingModelId) {
        this.TrainingModelId = TrainingModelId;
    }

    /**
     * Get <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>过滤条件<br>Filter.Name: 枚举值:<br>    TrainingModelVersionId (模型版本ID)<br>    ModelVersionType (模型版本类型) 其值支持: NORMAL(通用) ACCELERATE (加速)<br>    ModelFormat（模型格式）其值Filter.Values支持：<br>TORCH_SCRIPT/PYTORCH/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/PMML<br>    AlgorithmFramework (算法框架) 其值Filter.Values支持：TENSORFLOW/PYTORCH/DETECTRON2<br>Filter.Values: 当长度为1时，支持模糊查询; 不为1时，精确查询<br>每次请求的Filters的上限为10，Filter.Values的上限为100</p> 
     * @return Filters <p>过滤条件<br>Filter.Name: 枚举值:<br>    TrainingModelVersionId (模型版本ID)<br>    ModelVersionType (模型版本类型) 其值支持: NORMAL(通用) ACCELERATE (加速)<br>    ModelFormat（模型格式）其值Filter.Values支持：<br>TORCH_SCRIPT/PYTORCH/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/PMML<br>    AlgorithmFramework (算法框架) 其值Filter.Values支持：TENSORFLOW/PYTORCH/DETECTRON2<br>Filter.Values: 当长度为1时，支持模糊查询; 不为1时，精确查询<br>每次请求的Filters的上限为10，Filter.Values的上限为100</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件<br>Filter.Name: 枚举值:<br>    TrainingModelVersionId (模型版本ID)<br>    ModelVersionType (模型版本类型) 其值支持: NORMAL(通用) ACCELERATE (加速)<br>    ModelFormat（模型格式）其值Filter.Values支持：<br>TORCH_SCRIPT/PYTORCH/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/PMML<br>    AlgorithmFramework (算法框架) 其值Filter.Values支持：TENSORFLOW/PYTORCH/DETECTRON2<br>Filter.Values: 当长度为1时，支持模糊查询; 不为1时，精确查询<br>每次请求的Filters的上限为10，Filter.Values的上限为100</p>
     * @param Filters <p>过滤条件<br>Filter.Name: 枚举值:<br>    TrainingModelVersionId (模型版本ID)<br>    ModelVersionType (模型版本类型) 其值支持: NORMAL(通用) ACCELERATE (加速)<br>    ModelFormat（模型格式）其值Filter.Values支持：<br>TORCH_SCRIPT/PYTORCH/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/PMML<br>    AlgorithmFramework (算法框架) 其值Filter.Values支持：TENSORFLOW/PYTORCH/DETECTRON2<br>Filter.Values: 当长度为1时，支持模糊查询; 不为1时，精确查询<br>每次请求的Filters的上限为10，Filter.Values的上限为100</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTrainingModelVersionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrainingModelVersionsRequest(DescribeTrainingModelVersionsRequest source) {
        if (source.TrainingModelId != null) {
            this.TrainingModelId = new String(source.TrainingModelId);
        }
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrainingModelId", this.TrainingModelId);
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

