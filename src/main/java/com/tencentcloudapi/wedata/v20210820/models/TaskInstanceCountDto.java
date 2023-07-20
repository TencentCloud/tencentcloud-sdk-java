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

public class TaskInstanceCountDto extends AbstractModel{

    /**
    * 成功的实例数
    */
    @SerializedName("Success")
    @Expose
    private Long Success;

    /**
    * 执行中实例数
    */
    @SerializedName("Running")
    @Expose
    private Long Running;

    /**
    * 等待中的实例数
    */
    @SerializedName("Waiting")
    @Expose
    private Long Waiting;

    /**
    * 等待上游实例数
    */
    @SerializedName("Depend")
    @Expose
    private Long Depend;

    /**
    * 失败实例数
    */
    @SerializedName("Failed")
    @Expose
    private Long Failed;

    /**
    * 永久终止实例数
    */
    @SerializedName("Stopped")
    @Expose
    private Long Stopped;

    /**
     * Get 成功的实例数 
     * @return Success 成功的实例数
     */
    public Long getSuccess() {
        return this.Success;
    }

    /**
     * Set 成功的实例数
     * @param Success 成功的实例数
     */
    public void setSuccess(Long Success) {
        this.Success = Success;
    }

    /**
     * Get 执行中实例数 
     * @return Running 执行中实例数
     */
    public Long getRunning() {
        return this.Running;
    }

    /**
     * Set 执行中实例数
     * @param Running 执行中实例数
     */
    public void setRunning(Long Running) {
        this.Running = Running;
    }

    /**
     * Get 等待中的实例数 
     * @return Waiting 等待中的实例数
     */
    public Long getWaiting() {
        return this.Waiting;
    }

    /**
     * Set 等待中的实例数
     * @param Waiting 等待中的实例数
     */
    public void setWaiting(Long Waiting) {
        this.Waiting = Waiting;
    }

    /**
     * Get 等待上游实例数 
     * @return Depend 等待上游实例数
     */
    public Long getDepend() {
        return this.Depend;
    }

    /**
     * Set 等待上游实例数
     * @param Depend 等待上游实例数
     */
    public void setDepend(Long Depend) {
        this.Depend = Depend;
    }

    /**
     * Get 失败实例数 
     * @return Failed 失败实例数
     */
    public Long getFailed() {
        return this.Failed;
    }

    /**
     * Set 失败实例数
     * @param Failed 失败实例数
     */
    public void setFailed(Long Failed) {
        this.Failed = Failed;
    }

    /**
     * Get 永久终止实例数 
     * @return Stopped 永久终止实例数
     */
    public Long getStopped() {
        return this.Stopped;
    }

    /**
     * Set 永久终止实例数
     * @param Stopped 永久终止实例数
     */
    public void setStopped(Long Stopped) {
        this.Stopped = Stopped;
    }

    public TaskInstanceCountDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInstanceCountDto(TaskInstanceCountDto source) {
        if (source.Success != null) {
            this.Success = new Long(source.Success);
        }
        if (source.Running != null) {
            this.Running = new Long(source.Running);
        }
        if (source.Waiting != null) {
            this.Waiting = new Long(source.Waiting);
        }
        if (source.Depend != null) {
            this.Depend = new Long(source.Depend);
        }
        if (source.Failed != null) {
            this.Failed = new Long(source.Failed);
        }
        if (source.Stopped != null) {
            this.Stopped = new Long(source.Stopped);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "Running", this.Running);
        this.setParamSimple(map, prefix + "Waiting", this.Waiting);
        this.setParamSimple(map, prefix + "Depend", this.Depend);
        this.setParamSimple(map, prefix + "Failed", this.Failed);
        this.setParamSimple(map, prefix + "Stopped", this.Stopped);

    }
}

