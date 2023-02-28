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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetSyncStatus extends AbstractModel{

    /**
    * 上一次同步完成的时间
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 上一次同步的结果。 0 - 从未进行, 1 - 成功， 2 - 失败
    */
    @SerializedName("LastStatus")
    @Expose
    private Long LastStatus;

    /**
    * 同步任务是否正在进行中
    */
    @SerializedName("InProcess")
    @Expose
    private Boolean InProcess;

    /**
     * Get 上一次同步完成的时间 
     * @return LastTime 上一次同步完成的时间
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 上一次同步完成的时间
     * @param LastTime 上一次同步完成的时间
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 上一次同步的结果。 0 - 从未进行, 1 - 成功， 2 - 失败 
     * @return LastStatus 上一次同步的结果。 0 - 从未进行, 1 - 成功， 2 - 失败
     */
    public Long getLastStatus() {
        return this.LastStatus;
    }

    /**
     * Set 上一次同步的结果。 0 - 从未进行, 1 - 成功， 2 - 失败
     * @param LastStatus 上一次同步的结果。 0 - 从未进行, 1 - 成功， 2 - 失败
     */
    public void setLastStatus(Long LastStatus) {
        this.LastStatus = LastStatus;
    }

    /**
     * Get 同步任务是否正在进行中 
     * @return InProcess 同步任务是否正在进行中
     */
    public Boolean getInProcess() {
        return this.InProcess;
    }

    /**
     * Set 同步任务是否正在进行中
     * @param InProcess 同步任务是否正在进行中
     */
    public void setInProcess(Boolean InProcess) {
        this.InProcess = InProcess;
    }

    public AssetSyncStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetSyncStatus(AssetSyncStatus source) {
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.LastStatus != null) {
            this.LastStatus = new Long(source.LastStatus);
        }
        if (source.InProcess != null) {
            this.InProcess = new Boolean(source.InProcess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "LastStatus", this.LastStatus);
        this.setParamSimple(map, prefix + "InProcess", this.InProcess);

    }
}

