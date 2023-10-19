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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanTaskResult extends AbstractModel {

    /**
    * 任务最新一次运行结果ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 任务扫描结束的时间，格式如：2021-12-12 12:12:12
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务状态，-1待触发 0待扫描 1扫描中 2扫描终止 3扫描成功 4扫描失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 扫描任务结果展示，如果扫描失败，则显示失败原因
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
     * Get 任务最新一次运行结果ID 
     * @return Id 任务最新一次运行结果ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 任务最新一次运行结果ID
     * @param Id 任务最新一次运行结果ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 任务扫描结束的时间，格式如：2021-12-12 12:12:12 
     * @return EndTime 任务扫描结束的时间，格式如：2021-12-12 12:12:12
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务扫描结束的时间，格式如：2021-12-12 12:12:12
     * @param EndTime 任务扫描结束的时间，格式如：2021-12-12 12:12:12
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务状态，-1待触发 0待扫描 1扫描中 2扫描终止 3扫描成功 4扫描失败 
     * @return Status 任务状态，-1待触发 0待扫描 1扫描中 2扫描终止 3扫描成功 4扫描失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，-1待触发 0待扫描 1扫描中 2扫描终止 3扫描成功 4扫描失败
     * @param Status 任务状态，-1待触发 0待扫描 1扫描中 2扫描终止 3扫描成功 4扫描失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 扫描任务结果展示，如果扫描失败，则显示失败原因 
     * @return Result 扫描任务结果展示，如果扫描失败，则显示失败原因
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 扫描任务结果展示，如果扫描失败，则显示失败原因
     * @param Result 扫描任务结果展示，如果扫描失败，则显示失败原因
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    public ScanTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanTaskResult(ScanTaskResult source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

