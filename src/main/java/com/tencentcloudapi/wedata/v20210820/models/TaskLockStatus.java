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

public class TaskLockStatus extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 持锁者
    */
    @SerializedName("Locker")
    @Expose
    private String Locker;

    /**
    * 当前操作用户是否为持锁者，1表示为持锁者，0表示为不为持锁者
    */
    @SerializedName("IsLocker")
    @Expose
    private Long IsLocker;

    /**
    * 是否可以抢锁，1表示可以抢锁，0表示不可以抢锁
    */
    @SerializedName("IsRob")
    @Expose
    private Long IsRob;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 持锁者 
     * @return Locker 持锁者
     */
    public String getLocker() {
        return this.Locker;
    }

    /**
     * Set 持锁者
     * @param Locker 持锁者
     */
    public void setLocker(String Locker) {
        this.Locker = Locker;
    }

    /**
     * Get 当前操作用户是否为持锁者，1表示为持锁者，0表示为不为持锁者 
     * @return IsLocker 当前操作用户是否为持锁者，1表示为持锁者，0表示为不为持锁者
     */
    public Long getIsLocker() {
        return this.IsLocker;
    }

    /**
     * Set 当前操作用户是否为持锁者，1表示为持锁者，0表示为不为持锁者
     * @param IsLocker 当前操作用户是否为持锁者，1表示为持锁者，0表示为不为持锁者
     */
    public void setIsLocker(Long IsLocker) {
        this.IsLocker = IsLocker;
    }

    /**
     * Get 是否可以抢锁，1表示可以抢锁，0表示不可以抢锁 
     * @return IsRob 是否可以抢锁，1表示可以抢锁，0表示不可以抢锁
     */
    public Long getIsRob() {
        return this.IsRob;
    }

    /**
     * Set 是否可以抢锁，1表示可以抢锁，0表示不可以抢锁
     * @param IsRob 是否可以抢锁，1表示可以抢锁，0表示不可以抢锁
     */
    public void setIsRob(Long IsRob) {
        this.IsRob = IsRob;
    }

    public TaskLockStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskLockStatus(TaskLockStatus source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Locker != null) {
            this.Locker = new String(source.Locker);
        }
        if (source.IsLocker != null) {
            this.IsLocker = new Long(source.IsLocker);
        }
        if (source.IsRob != null) {
            this.IsRob = new Long(source.IsRob);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Locker", this.Locker);
        this.setParamSimple(map, prefix + "IsLocker", this.IsLocker);
        this.setParamSimple(map, prefix + "IsRob", this.IsRob);

    }
}

