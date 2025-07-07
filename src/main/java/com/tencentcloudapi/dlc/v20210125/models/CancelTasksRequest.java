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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CancelTasksRequest extends AbstractModel {

    /**
    * 任务Id数组，全局唯一
    */
    @SerializedName("TaskId")
    @Expose
    private String [] TaskId;

    /**
    * 配置信息，key-value数组，对外不可见。key1：AuthorityRole（鉴权角色，默认传SubUin，base64加密，仅在jdbc提交任务时使用）
    */
    @SerializedName("Config")
    @Expose
    private KVPair [] Config;

    /**
     * Get 任务Id数组，全局唯一 
     * @return TaskId 任务Id数组，全局唯一
     */
    public String [] getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id数组，全局唯一
     * @param TaskId 任务Id数组，全局唯一
     */
    public void setTaskId(String [] TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 配置信息，key-value数组，对外不可见。key1：AuthorityRole（鉴权角色，默认传SubUin，base64加密，仅在jdbc提交任务时使用） 
     * @return Config 配置信息，key-value数组，对外不可见。key1：AuthorityRole（鉴权角色，默认传SubUin，base64加密，仅在jdbc提交任务时使用）
     */
    public KVPair [] getConfig() {
        return this.Config;
    }

    /**
     * Set 配置信息，key-value数组，对外不可见。key1：AuthorityRole（鉴权角色，默认传SubUin，base64加密，仅在jdbc提交任务时使用）
     * @param Config 配置信息，key-value数组，对外不可见。key1：AuthorityRole（鉴权角色，默认传SubUin，base64加密，仅在jdbc提交任务时使用）
     */
    public void setConfig(KVPair [] Config) {
        this.Config = Config;
    }

    public CancelTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CancelTasksRequest(CancelTasksRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String[source.TaskId.length];
            for (int i = 0; i < source.TaskId.length; i++) {
                this.TaskId[i] = new String(source.TaskId[i]);
            }
        }
        if (source.Config != null) {
            this.Config = new KVPair[source.Config.length];
            for (int i = 0; i < source.Config.length; i++) {
                this.Config[i] = new KVPair(source.Config[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskId.", this.TaskId);
        this.setParamArrayObj(map, prefix + "Config.", this.Config);

    }
}

