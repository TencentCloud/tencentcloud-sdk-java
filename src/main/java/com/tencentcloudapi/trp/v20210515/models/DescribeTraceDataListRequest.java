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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTraceDataListRequest extends AbstractModel{

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 批次ID
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 任务ID 用于外部溯源
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 页数
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 二维码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 溯源阶段 0:商品 1:通用 2:内部溯源 3:外部溯源
    */
    @SerializedName("Phase")
    @Expose
    private Long Phase;

    /**
    * 数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 批次ID 
     * @return BatchId 批次ID
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批次ID
     * @param BatchId 批次ID
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 任务ID 用于外部溯源 
     * @return TaskId 任务ID 用于外部溯源
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID 用于外部溯源
     * @param TaskId 任务ID 用于外部溯源
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 页数 
     * @return PageNumber 页数
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页数
     * @param PageNumber 页数
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 二维码 
     * @return Code 二维码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 二维码
     * @param Code 二维码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 溯源阶段 0:商品 1:通用 2:内部溯源 3:外部溯源 
     * @return Phase 溯源阶段 0:商品 1:通用 2:内部溯源 3:外部溯源
     */
    public Long getPhase() {
        return this.Phase;
    }

    /**
     * Set 溯源阶段 0:商品 1:通用 2:内部溯源 3:外部溯源
     * @param Phase 溯源阶段 0:商品 1:通用 2:内部溯源 3:外部溯源
     */
    public void setPhase(Long Phase) {
        this.Phase = Phase;
    }

    /**
     * Get 数量 
     * @return PageSize 数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 数量
     * @param PageSize 数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeTraceDataListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTraceDataListRequest(DescribeTraceDataListRequest source) {
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Phase != null) {
            this.Phase = new Long(source.Phase);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

