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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchResult extends AbstractModel{

    /**
    * 正在运行的任务数
    */
    @SerializedName("Running")
    @Expose
    private Long Running;

    /**
    * 执行成功的任务数
    */
    @SerializedName("Success")
    @Expose
    private Long Success;

    /**
    * 执行失败的任务数
    */
    @SerializedName("Failed")
    @Expose
    private Long Failed;

    /**
    * 总任务数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get 正在运行的任务数 
     * @return Running 正在运行的任务数
     */
    public Long getRunning() {
        return this.Running;
    }

    /**
     * Set 正在运行的任务数
     * @param Running 正在运行的任务数
     */
    public void setRunning(Long Running) {
        this.Running = Running;
    }

    /**
     * Get 执行成功的任务数 
     * @return Success 执行成功的任务数
     */
    public Long getSuccess() {
        return this.Success;
    }

    /**
     * Set 执行成功的任务数
     * @param Success 执行成功的任务数
     */
    public void setSuccess(Long Success) {
        this.Success = Success;
    }

    /**
     * Get 执行失败的任务数 
     * @return Failed 执行失败的任务数
     */
    public Long getFailed() {
        return this.Failed;
    }

    /**
     * Set 执行失败的任务数
     * @param Failed 执行失败的任务数
     */
    public void setFailed(Long Failed) {
        this.Failed = Failed;
    }

    /**
     * Get 总任务数 
     * @return Total 总任务数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总任务数
     * @param Total 总任务数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public BatchResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchResult(BatchResult source) {
        if (source.Running != null) {
            this.Running = new Long(source.Running);
        }
        if (source.Success != null) {
            this.Success = new Long(source.Success);
        }
        if (source.Failed != null) {
            this.Failed = new Long(source.Failed);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Running", this.Running);
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "Failed", this.Failed);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

