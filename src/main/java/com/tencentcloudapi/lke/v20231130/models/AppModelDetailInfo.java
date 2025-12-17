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
    * 模型名称
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 模型参数
    */
    @SerializedName("ModelParams")
    @Expose
    private ModelParams ModelParams;

    /**
    * 限制
    */
    @SerializedName("HistoryLimit")
    @Expose
    private Long HistoryLimit;

    /**
    * 模型别名
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

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
     * Get 模型参数 
     * @return ModelParams 模型参数
     */
    public ModelParams getModelParams() {
        return this.ModelParams;
    }

    /**
     * Set 模型参数
     * @param ModelParams 模型参数
     */
    public void setModelParams(ModelParams ModelParams) {
        this.ModelParams = ModelParams;
    }

    /**
     * Get 限制 
     * @return HistoryLimit 限制
     */
    public Long getHistoryLimit() {
        return this.HistoryLimit;
    }

    /**
     * Set 限制
     * @param HistoryLimit 限制
     */
    public void setHistoryLimit(Long HistoryLimit) {
        this.HistoryLimit = HistoryLimit;
    }

    /**
     * Get 模型别名 
     * @return AliasName 模型别名
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 模型别名
     * @param AliasName 模型别名
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    public AppModelDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppModelDetailInfo(AppModelDetailInfo source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelParams != null) {
            this.ModelParams = new ModelParams(source.ModelParams);
        }
        if (source.HistoryLimit != null) {
            this.HistoryLimit = new Long(source.HistoryLimit);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamObj(map, prefix + "ModelParams.", this.ModelParams);
        this.setParamSimple(map, prefix + "HistoryLimit", this.HistoryLimit);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);

    }
}

