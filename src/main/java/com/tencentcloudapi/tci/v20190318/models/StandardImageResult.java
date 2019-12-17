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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StandardImageResult extends AbstractModel{

    /**
    * 详细结果
    */
    @SerializedName("ResultSet")
    @Expose
    private ImageTaskResult [] ResultSet;

    /**
    * 分析完成后的统计结果
    */
    @SerializedName("Statistic")
    @Expose
    private ImageTaskStatistic Statistic;

    /**
    * 状态描述
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 结果总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 详细结果 
     * @return ResultSet 详细结果
     */
    public ImageTaskResult [] getResultSet() {
        return this.ResultSet;
    }

    /**
     * Set 详细结果
     * @param ResultSet 详细结果
     */
    public void setResultSet(ImageTaskResult [] ResultSet) {
        this.ResultSet = ResultSet;
    }

    /**
     * Get 分析完成后的统计结果 
     * @return Statistic 分析完成后的统计结果
     */
    public ImageTaskStatistic getStatistic() {
        return this.Statistic;
    }

    /**
     * Set 分析完成后的统计结果
     * @param Statistic 分析完成后的统计结果
     */
    public void setStatistic(ImageTaskStatistic Statistic) {
        this.Statistic = Statistic;
    }

    /**
     * Get 状态描述 
     * @return Message 状态描述
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 状态描述
     * @param Message 状态描述
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 结果总数 
     * @return TotalCount 结果总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 结果总数
     * @param TotalCount 结果总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ResultSet.", this.ResultSet);
        this.setParamObj(map, prefix + "Statistic.", this.Statistic);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

