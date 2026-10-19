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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchRunSummary extends AbstractModel {

    /**
    * 	失败数量
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
    * 	成功数量
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 总批次
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 失败的下标
    */
    @SerializedName("FailedIndexList")
    @Expose
    private Long [] FailedIndexList;

    /**
    * 	上一轮完成的批次
    */
    @SerializedName("JustCompletedIndexList")
    @Expose
    private Long [] JustCompletedIndexList;

    /**
    * 运行中的下标
    */
    @SerializedName("RunningIndexList")
    @Expose
    private Long [] RunningIndexList;

    /**
    * 成功的下标
    */
    @SerializedName("SuccessIndexList")
    @Expose
    private Long [] SuccessIndexList;

    /**
     * Get 	失败数量 
     * @return FailedCount 	失败数量
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set 	失败数量
     * @param FailedCount 	失败数量
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get 	成功数量 
     * @return SuccessCount 	成功数量
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 	成功数量
     * @param SuccessCount 	成功数量
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 总批次 
     * @return TotalCount 总批次
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总批次
     * @param TotalCount 总批次
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 失败的下标 
     * @return FailedIndexList 失败的下标
     */
    public Long [] getFailedIndexList() {
        return this.FailedIndexList;
    }

    /**
     * Set 失败的下标
     * @param FailedIndexList 失败的下标
     */
    public void setFailedIndexList(Long [] FailedIndexList) {
        this.FailedIndexList = FailedIndexList;
    }

    /**
     * Get 	上一轮完成的批次 
     * @return JustCompletedIndexList 	上一轮完成的批次
     */
    public Long [] getJustCompletedIndexList() {
        return this.JustCompletedIndexList;
    }

    /**
     * Set 	上一轮完成的批次
     * @param JustCompletedIndexList 	上一轮完成的批次
     */
    public void setJustCompletedIndexList(Long [] JustCompletedIndexList) {
        this.JustCompletedIndexList = JustCompletedIndexList;
    }

    /**
     * Get 运行中的下标 
     * @return RunningIndexList 运行中的下标
     */
    public Long [] getRunningIndexList() {
        return this.RunningIndexList;
    }

    /**
     * Set 运行中的下标
     * @param RunningIndexList 运行中的下标
     */
    public void setRunningIndexList(Long [] RunningIndexList) {
        this.RunningIndexList = RunningIndexList;
    }

    /**
     * Get 成功的下标 
     * @return SuccessIndexList 成功的下标
     */
    public Long [] getSuccessIndexList() {
        return this.SuccessIndexList;
    }

    /**
     * Set 成功的下标
     * @param SuccessIndexList 成功的下标
     */
    public void setSuccessIndexList(Long [] SuccessIndexList) {
        this.SuccessIndexList = SuccessIndexList;
    }

    public BatchRunSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchRunSummary(BatchRunSummary source) {
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.FailedIndexList != null) {
            this.FailedIndexList = new Long[source.FailedIndexList.length];
            for (int i = 0; i < source.FailedIndexList.length; i++) {
                this.FailedIndexList[i] = new Long(source.FailedIndexList[i]);
            }
        }
        if (source.JustCompletedIndexList != null) {
            this.JustCompletedIndexList = new Long[source.JustCompletedIndexList.length];
            for (int i = 0; i < source.JustCompletedIndexList.length; i++) {
                this.JustCompletedIndexList[i] = new Long(source.JustCompletedIndexList[i]);
            }
        }
        if (source.RunningIndexList != null) {
            this.RunningIndexList = new Long[source.RunningIndexList.length];
            for (int i = 0; i < source.RunningIndexList.length; i++) {
                this.RunningIndexList[i] = new Long(source.RunningIndexList[i]);
            }
        }
        if (source.SuccessIndexList != null) {
            this.SuccessIndexList = new Long[source.SuccessIndexList.length];
            for (int i = 0; i < source.SuccessIndexList.length; i++) {
                this.SuccessIndexList[i] = new Long(source.SuccessIndexList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "FailedIndexList.", this.FailedIndexList);
        this.setParamArraySimple(map, prefix + "JustCompletedIndexList.", this.JustCompletedIndexList);
        this.setParamArraySimple(map, prefix + "RunningIndexList.", this.RunningIndexList);
        this.setParamArraySimple(map, prefix + "SuccessIndexList.", this.SuccessIndexList);

    }
}

