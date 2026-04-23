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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppModelDetailInfo extends AbstractModel {

    /**
    * <p>模型别名</p>
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * <p>限制</p>
    */
    @SerializedName("HistoryLimit")
    @Expose
    private Long HistoryLimit;

    /**
    * <p>模型名称</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>模型参数</p>
    */
    @SerializedName("ModelParams")
    @Expose
    private ModelParams ModelParams;

    /**
     * Get <p>模型别名</p> 
     * @return AliasName <p>模型别名</p>
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set <p>模型别名</p>
     * @param AliasName <p>模型别名</p>
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get <p>限制</p> 
     * @return HistoryLimit <p>限制</p>
     */
    public Long getHistoryLimit() {
        return this.HistoryLimit;
    }

    /**
     * Set <p>限制</p>
     * @param HistoryLimit <p>限制</p>
     */
    public void setHistoryLimit(Long HistoryLimit) {
        this.HistoryLimit = HistoryLimit;
    }

    /**
     * Get <p>模型名称</p> 
     * @return ModelName <p>模型名称</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称</p>
     * @param ModelName <p>模型名称</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>模型参数</p> 
     * @return ModelParams <p>模型参数</p>
     */
    public ModelParams getModelParams() {
        return this.ModelParams;
    }

    /**
     * Set <p>模型参数</p>
     * @param ModelParams <p>模型参数</p>
     */
    public void setModelParams(ModelParams ModelParams) {
        this.ModelParams = ModelParams;
    }

    public AppModelDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppModelDetailInfo(AppModelDetailInfo source) {
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.HistoryLimit != null) {
            this.HistoryLimit = new Long(source.HistoryLimit);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelParams != null) {
            this.ModelParams = new ModelParams(source.ModelParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "HistoryLimit", this.HistoryLimit);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamObj(map, prefix + "ModelParams.", this.ModelParams);

    }
}

