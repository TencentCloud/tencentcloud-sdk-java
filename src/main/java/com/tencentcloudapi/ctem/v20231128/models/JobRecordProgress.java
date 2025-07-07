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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobRecordProgress extends AbstractModel {

    /**
    * 正在执行的任务数
    */
    @SerializedName("Doing")
    @Expose
    private Long Doing;

    /**
    * 已完成的任务数
    */
    @SerializedName("Done")
    @Expose
    private Long Done;

    /**
    * 发生错误的任务数
    */
    @SerializedName("Error")
    @Expose
    private Long Error;

    /**
    * 超时
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 停止
    */
    @SerializedName("Stop")
    @Expose
    private Long Stop;

    /**
    * 暂停
    */
    @SerializedName("Todo")
    @Expose
    private Long Todo;

    /**
     * Get 正在执行的任务数 
     * @return Doing 正在执行的任务数
     */
    public Long getDoing() {
        return this.Doing;
    }

    /**
     * Set 正在执行的任务数
     * @param Doing 正在执行的任务数
     */
    public void setDoing(Long Doing) {
        this.Doing = Doing;
    }

    /**
     * Get 已完成的任务数 
     * @return Done 已完成的任务数
     */
    public Long getDone() {
        return this.Done;
    }

    /**
     * Set 已完成的任务数
     * @param Done 已完成的任务数
     */
    public void setDone(Long Done) {
        this.Done = Done;
    }

    /**
     * Get 发生错误的任务数 
     * @return Error 发生错误的任务数
     */
    public Long getError() {
        return this.Error;
    }

    /**
     * Set 发生错误的任务数
     * @param Error 发生错误的任务数
     */
    public void setError(Long Error) {
        this.Error = Error;
    }

    /**
     * Get 超时 
     * @return Timeout 超时
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时
     * @param Timeout 超时
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 停止 
     * @return Stop 停止
     */
    public Long getStop() {
        return this.Stop;
    }

    /**
     * Set 停止
     * @param Stop 停止
     */
    public void setStop(Long Stop) {
        this.Stop = Stop;
    }

    /**
     * Get 暂停 
     * @return Todo 暂停
     */
    public Long getTodo() {
        return this.Todo;
    }

    /**
     * Set 暂停
     * @param Todo 暂停
     */
    public void setTodo(Long Todo) {
        this.Todo = Todo;
    }

    public JobRecordProgress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobRecordProgress(JobRecordProgress source) {
        if (source.Doing != null) {
            this.Doing = new Long(source.Doing);
        }
        if (source.Done != null) {
            this.Done = new Long(source.Done);
        }
        if (source.Error != null) {
            this.Error = new Long(source.Error);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Stop != null) {
            this.Stop = new Long(source.Stop);
        }
        if (source.Todo != null) {
            this.Todo = new Long(source.Todo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Doing", this.Doing);
        this.setParamSimple(map, prefix + "Done", this.Done);
        this.setParamSimple(map, prefix + "Error", this.Error);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Stop", this.Stop);
        this.setParamSimple(map, prefix + "Todo", this.Todo);

    }
}

