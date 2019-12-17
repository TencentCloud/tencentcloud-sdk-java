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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanResultListRequest extends AbstractModel{

    /**
    * 应用 ID，登录[控制台](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 查询的任务 ID 列表，任务 ID 列表最多支持 100 个。
    */
    @SerializedName("TaskIdList")
    @Expose
    private String [] TaskIdList;

    /**
    * 任务返回结果数量，默认10，上限500。大文件任务忽略此参数，返回全量结果
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 应用 ID，登录[控制台](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID 
     * @return BizId 应用 ID，登录[控制台](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用 ID，登录[控制台](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
     * @param BizId 应用 ID，登录[控制台](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 查询的任务 ID 列表，任务 ID 列表最多支持 100 个。 
     * @return TaskIdList 查询的任务 ID 列表，任务 ID 列表最多支持 100 个。
     */
    public String [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set 查询的任务 ID 列表，任务 ID 列表最多支持 100 个。
     * @param TaskIdList 查询的任务 ID 列表，任务 ID 列表最多支持 100 个。
     */
    public void setTaskIdList(String [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get 任务返回结果数量，默认10，上限500。大文件任务忽略此参数，返回全量结果 
     * @return Limit 任务返回结果数量，默认10，上限500。大文件任务忽略此参数，返回全量结果
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 任务返回结果数量，默认10，上限500。大文件任务忽略此参数，返回全量结果
     * @param Limit 任务返回结果数量，默认10，上限500。大文件任务忽略此参数，返回全量结果
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamArraySimple(map, prefix + "TaskIdList.", this.TaskIdList);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

