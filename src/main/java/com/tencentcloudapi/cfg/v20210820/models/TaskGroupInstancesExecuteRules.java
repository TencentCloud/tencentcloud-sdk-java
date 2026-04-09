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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskGroupInstancesExecuteRules extends AbstractModel {

    /**
    * <p>实例选取模式</p><p>枚举值：</p><ul><li>1： 全部注入</li><li>2： 随机选取指定比例注入</li><li>3： 随机选取指定数量注入</li></ul>
    */
    @SerializedName("TaskGroupInstancesExecuteMode")
    @Expose
    private Long TaskGroupInstancesExecuteMode;

    /**
    * <p>按比例选取模式下选取比例</p>
    */
    @SerializedName("TaskGroupInstancesExecutePercent")
    @Expose
    private Long TaskGroupInstancesExecutePercent;

    /**
    * <p>按数量选取模式下选取数量</p>
    */
    @SerializedName("TaskGroupInstancesExecuteNum")
    @Expose
    private Long TaskGroupInstancesExecuteNum;

    /**
     * Get <p>实例选取模式</p><p>枚举值：</p><ul><li>1： 全部注入</li><li>2： 随机选取指定比例注入</li><li>3： 随机选取指定数量注入</li></ul> 
     * @return TaskGroupInstancesExecuteMode <p>实例选取模式</p><p>枚举值：</p><ul><li>1： 全部注入</li><li>2： 随机选取指定比例注入</li><li>3： 随机选取指定数量注入</li></ul>
     */
    public Long getTaskGroupInstancesExecuteMode() {
        return this.TaskGroupInstancesExecuteMode;
    }

    /**
     * Set <p>实例选取模式</p><p>枚举值：</p><ul><li>1： 全部注入</li><li>2： 随机选取指定比例注入</li><li>3： 随机选取指定数量注入</li></ul>
     * @param TaskGroupInstancesExecuteMode <p>实例选取模式</p><p>枚举值：</p><ul><li>1： 全部注入</li><li>2： 随机选取指定比例注入</li><li>3： 随机选取指定数量注入</li></ul>
     */
    public void setTaskGroupInstancesExecuteMode(Long TaskGroupInstancesExecuteMode) {
        this.TaskGroupInstancesExecuteMode = TaskGroupInstancesExecuteMode;
    }

    /**
     * Get <p>按比例选取模式下选取比例</p> 
     * @return TaskGroupInstancesExecutePercent <p>按比例选取模式下选取比例</p>
     */
    public Long getTaskGroupInstancesExecutePercent() {
        return this.TaskGroupInstancesExecutePercent;
    }

    /**
     * Set <p>按比例选取模式下选取比例</p>
     * @param TaskGroupInstancesExecutePercent <p>按比例选取模式下选取比例</p>
     */
    public void setTaskGroupInstancesExecutePercent(Long TaskGroupInstancesExecutePercent) {
        this.TaskGroupInstancesExecutePercent = TaskGroupInstancesExecutePercent;
    }

    /**
     * Get <p>按数量选取模式下选取数量</p> 
     * @return TaskGroupInstancesExecuteNum <p>按数量选取模式下选取数量</p>
     */
    public Long getTaskGroupInstancesExecuteNum() {
        return this.TaskGroupInstancesExecuteNum;
    }

    /**
     * Set <p>按数量选取模式下选取数量</p>
     * @param TaskGroupInstancesExecuteNum <p>按数量选取模式下选取数量</p>
     */
    public void setTaskGroupInstancesExecuteNum(Long TaskGroupInstancesExecuteNum) {
        this.TaskGroupInstancesExecuteNum = TaskGroupInstancesExecuteNum;
    }

    public TaskGroupInstancesExecuteRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskGroupInstancesExecuteRules(TaskGroupInstancesExecuteRules source) {
        if (source.TaskGroupInstancesExecuteMode != null) {
            this.TaskGroupInstancesExecuteMode = new Long(source.TaskGroupInstancesExecuteMode);
        }
        if (source.TaskGroupInstancesExecutePercent != null) {
            this.TaskGroupInstancesExecutePercent = new Long(source.TaskGroupInstancesExecutePercent);
        }
        if (source.TaskGroupInstancesExecuteNum != null) {
            this.TaskGroupInstancesExecuteNum = new Long(source.TaskGroupInstancesExecuteNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskGroupInstancesExecuteMode", this.TaskGroupInstancesExecuteMode);
        this.setParamSimple(map, prefix + "TaskGroupInstancesExecutePercent", this.TaskGroupInstancesExecutePercent);
        this.setParamSimple(map, prefix + "TaskGroupInstancesExecuteNum", this.TaskGroupInstancesExecuteNum);

    }
}

