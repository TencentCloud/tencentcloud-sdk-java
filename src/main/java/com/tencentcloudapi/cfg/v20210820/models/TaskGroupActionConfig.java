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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskGroupActionConfig extends AbstractModel{

    /**
    * 该动作在动作组中的顺序，从1开始，不填或填错将匹配不到经验中要修改参数的动作
    */
    @SerializedName("TaskGroupActionOrder")
    @Expose
    private Long TaskGroupActionOrder;

    /**
    * 动作通用参数，需要json序列化传入，可以从查询经验详情接口获取，不填默认使用经验中动作参数
    */
    @SerializedName("TaskGroupActionGeneralConfiguration")
    @Expose
    private String TaskGroupActionGeneralConfiguration;

    /**
    * 动作自定义参数，需要json序列化传入，可以从查询经验详情接口获取，不填默认使用经验中动作参数
    */
    @SerializedName("TaskGroupActionCustomConfiguration")
    @Expose
    private String TaskGroupActionCustomConfiguration;

    /**
     * Get 该动作在动作组中的顺序，从1开始，不填或填错将匹配不到经验中要修改参数的动作 
     * @return TaskGroupActionOrder 该动作在动作组中的顺序，从1开始，不填或填错将匹配不到经验中要修改参数的动作
     */
    public Long getTaskGroupActionOrder() {
        return this.TaskGroupActionOrder;
    }

    /**
     * Set 该动作在动作组中的顺序，从1开始，不填或填错将匹配不到经验中要修改参数的动作
     * @param TaskGroupActionOrder 该动作在动作组中的顺序，从1开始，不填或填错将匹配不到经验中要修改参数的动作
     */
    public void setTaskGroupActionOrder(Long TaskGroupActionOrder) {
        this.TaskGroupActionOrder = TaskGroupActionOrder;
    }

    /**
     * Get 动作通用参数，需要json序列化传入，可以从查询经验详情接口获取，不填默认使用经验中动作参数 
     * @return TaskGroupActionGeneralConfiguration 动作通用参数，需要json序列化传入，可以从查询经验详情接口获取，不填默认使用经验中动作参数
     */
    public String getTaskGroupActionGeneralConfiguration() {
        return this.TaskGroupActionGeneralConfiguration;
    }

    /**
     * Set 动作通用参数，需要json序列化传入，可以从查询经验详情接口获取，不填默认使用经验中动作参数
     * @param TaskGroupActionGeneralConfiguration 动作通用参数，需要json序列化传入，可以从查询经验详情接口获取，不填默认使用经验中动作参数
     */
    public void setTaskGroupActionGeneralConfiguration(String TaskGroupActionGeneralConfiguration) {
        this.TaskGroupActionGeneralConfiguration = TaskGroupActionGeneralConfiguration;
    }

    /**
     * Get 动作自定义参数，需要json序列化传入，可以从查询经验详情接口获取，不填默认使用经验中动作参数 
     * @return TaskGroupActionCustomConfiguration 动作自定义参数，需要json序列化传入，可以从查询经验详情接口获取，不填默认使用经验中动作参数
     */
    public String getTaskGroupActionCustomConfiguration() {
        return this.TaskGroupActionCustomConfiguration;
    }

    /**
     * Set 动作自定义参数，需要json序列化传入，可以从查询经验详情接口获取，不填默认使用经验中动作参数
     * @param TaskGroupActionCustomConfiguration 动作自定义参数，需要json序列化传入，可以从查询经验详情接口获取，不填默认使用经验中动作参数
     */
    public void setTaskGroupActionCustomConfiguration(String TaskGroupActionCustomConfiguration) {
        this.TaskGroupActionCustomConfiguration = TaskGroupActionCustomConfiguration;
    }

    public TaskGroupActionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskGroupActionConfig(TaskGroupActionConfig source) {
        if (source.TaskGroupActionOrder != null) {
            this.TaskGroupActionOrder = new Long(source.TaskGroupActionOrder);
        }
        if (source.TaskGroupActionGeneralConfiguration != null) {
            this.TaskGroupActionGeneralConfiguration = new String(source.TaskGroupActionGeneralConfiguration);
        }
        if (source.TaskGroupActionCustomConfiguration != null) {
            this.TaskGroupActionCustomConfiguration = new String(source.TaskGroupActionCustomConfiguration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskGroupActionOrder", this.TaskGroupActionOrder);
        this.setParamSimple(map, prefix + "TaskGroupActionGeneralConfiguration", this.TaskGroupActionGeneralConfiguration);
        this.setParamSimple(map, prefix + "TaskGroupActionCustomConfiguration", this.TaskGroupActionCustomConfiguration);

    }
}

