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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoMlConf extends AbstractModel {

    /**
    * 评估指标：acc/auc/f1/mse/mae/rmse
    */
    @SerializedName("EvaluationMetric")
    @Expose
    private String EvaluationMetric;

    /**
    * 搜索空间列表
    */
    @SerializedName("SearchSpace")
    @Expose
    private String [] SearchSpace;

    /**
    * 最大运行时间（分钟），默认60
    */
    @SerializedName("MaxRuntimeMinutes")
    @Expose
    private Long MaxRuntimeMinutes;

    /**
    * 最大运行次数，默认100
    */
    @SerializedName("MaxRunCount")
    @Expose
    private Long MaxRunCount;

    /**
    * 最大运行并发，默认1，最大100
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
     * Get 评估指标：acc/auc/f1/mse/mae/rmse 
     * @return EvaluationMetric 评估指标：acc/auc/f1/mse/mae/rmse
     */
    public String getEvaluationMetric() {
        return this.EvaluationMetric;
    }

    /**
     * Set 评估指标：acc/auc/f1/mse/mae/rmse
     * @param EvaluationMetric 评估指标：acc/auc/f1/mse/mae/rmse
     */
    public void setEvaluationMetric(String EvaluationMetric) {
        this.EvaluationMetric = EvaluationMetric;
    }

    /**
     * Get 搜索空间列表 
     * @return SearchSpace 搜索空间列表
     */
    public String [] getSearchSpace() {
        return this.SearchSpace;
    }

    /**
     * Set 搜索空间列表
     * @param SearchSpace 搜索空间列表
     */
    public void setSearchSpace(String [] SearchSpace) {
        this.SearchSpace = SearchSpace;
    }

    /**
     * Get 最大运行时间（分钟），默认60 
     * @return MaxRuntimeMinutes 最大运行时间（分钟），默认60
     */
    public Long getMaxRuntimeMinutes() {
        return this.MaxRuntimeMinutes;
    }

    /**
     * Set 最大运行时间（分钟），默认60
     * @param MaxRuntimeMinutes 最大运行时间（分钟），默认60
     */
    public void setMaxRuntimeMinutes(Long MaxRuntimeMinutes) {
        this.MaxRuntimeMinutes = MaxRuntimeMinutes;
    }

    /**
     * Get 最大运行次数，默认100 
     * @return MaxRunCount 最大运行次数，默认100
     */
    public Long getMaxRunCount() {
        return this.MaxRunCount;
    }

    /**
     * Set 最大运行次数，默认100
     * @param MaxRunCount 最大运行次数，默认100
     */
    public void setMaxRunCount(Long MaxRunCount) {
        this.MaxRunCount = MaxRunCount;
    }

    /**
     * Get 最大运行并发，默认1，最大100 
     * @return MaxConcurrency 最大运行并发，默认1，最大100
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set 最大运行并发，默认1，最大100
     * @param MaxConcurrency 最大运行并发，默认1，最大100
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    public AutoMlConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoMlConf(AutoMlConf source) {
        if (source.EvaluationMetric != null) {
            this.EvaluationMetric = new String(source.EvaluationMetric);
        }
        if (source.SearchSpace != null) {
            this.SearchSpace = new String[source.SearchSpace.length];
            for (int i = 0; i < source.SearchSpace.length; i++) {
                this.SearchSpace[i] = new String(source.SearchSpace[i]);
            }
        }
        if (source.MaxRuntimeMinutes != null) {
            this.MaxRuntimeMinutes = new Long(source.MaxRuntimeMinutes);
        }
        if (source.MaxRunCount != null) {
            this.MaxRunCount = new Long(source.MaxRunCount);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvaluationMetric", this.EvaluationMetric);
        this.setParamArraySimple(map, prefix + "SearchSpace.", this.SearchSpace);
        this.setParamSimple(map, prefix + "MaxRuntimeMinutes", this.MaxRuntimeMinutes);
        this.setParamSimple(map, prefix + "MaxRunCount", this.MaxRunCount);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);

    }
}

