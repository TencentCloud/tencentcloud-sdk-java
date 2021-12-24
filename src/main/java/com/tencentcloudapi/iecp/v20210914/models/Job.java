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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Job extends AbstractModel{

    /**
    * 并发数
    */
    @SerializedName("Parallelism")
    @Expose
    private Long Parallelism;

    /**
    * 完成数
    */
    @SerializedName("Completion")
    @Expose
    private Long Completion;

    /**
    * 最大运行时间
    */
    @SerializedName("ActiveDeadlineSeconds")
    @Expose
    private Long ActiveDeadlineSeconds;

    /**
    * 失败前重试次数
    */
    @SerializedName("BackOffLimit")
    @Expose
    private Long BackOffLimit;

    /**
     * Get 并发数 
     * @return Parallelism 并发数
     */
    public Long getParallelism() {
        return this.Parallelism;
    }

    /**
     * Set 并发数
     * @param Parallelism 并发数
     */
    public void setParallelism(Long Parallelism) {
        this.Parallelism = Parallelism;
    }

    /**
     * Get 完成数 
     * @return Completion 完成数
     */
    public Long getCompletion() {
        return this.Completion;
    }

    /**
     * Set 完成数
     * @param Completion 完成数
     */
    public void setCompletion(Long Completion) {
        this.Completion = Completion;
    }

    /**
     * Get 最大运行时间 
     * @return ActiveDeadlineSeconds 最大运行时间
     */
    public Long getActiveDeadlineSeconds() {
        return this.ActiveDeadlineSeconds;
    }

    /**
     * Set 最大运行时间
     * @param ActiveDeadlineSeconds 最大运行时间
     */
    public void setActiveDeadlineSeconds(Long ActiveDeadlineSeconds) {
        this.ActiveDeadlineSeconds = ActiveDeadlineSeconds;
    }

    /**
     * Get 失败前重试次数 
     * @return BackOffLimit 失败前重试次数
     */
    public Long getBackOffLimit() {
        return this.BackOffLimit;
    }

    /**
     * Set 失败前重试次数
     * @param BackOffLimit 失败前重试次数
     */
    public void setBackOffLimit(Long BackOffLimit) {
        this.BackOffLimit = BackOffLimit;
    }

    public Job() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Job(Job source) {
        if (source.Parallelism != null) {
            this.Parallelism = new Long(source.Parallelism);
        }
        if (source.Completion != null) {
            this.Completion = new Long(source.Completion);
        }
        if (source.ActiveDeadlineSeconds != null) {
            this.ActiveDeadlineSeconds = new Long(source.ActiveDeadlineSeconds);
        }
        if (source.BackOffLimit != null) {
            this.BackOffLimit = new Long(source.BackOffLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Parallelism", this.Parallelism);
        this.setParamSimple(map, prefix + "Completion", this.Completion);
        this.setParamSimple(map, prefix + "ActiveDeadlineSeconds", this.ActiveDeadlineSeconds);
        this.setParamSimple(map, prefix + "BackOffLimit", this.BackOffLimit);

    }
}

