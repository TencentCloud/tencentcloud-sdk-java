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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetryCreateSnapshotRequest extends AbstractModel {

    /**
    * 修复任务id
    */
    @SerializedName("FixId")
    @Expose
    private Long FixId;

    /**
    * 主机quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 任务进度返回的快照唯一Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get 修复任务id 
     * @return FixId 修复任务id
     */
    public Long getFixId() {
        return this.FixId;
    }

    /**
     * Set 修复任务id
     * @param FixId 修复任务id
     */
    public void setFixId(Long FixId) {
        this.FixId = FixId;
    }

    /**
     * Get 主机quuid 
     * @return Quuid 主机quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机quuid
     * @param Quuid 主机quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 任务进度返回的快照唯一Id 
     * @return Id 任务进度返回的快照唯一Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 任务进度返回的快照唯一Id
     * @param Id 任务进度返回的快照唯一Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public RetryCreateSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetryCreateSnapshotRequest(RetryCreateSnapshotRequest source) {
        if (source.FixId != null) {
            this.FixId = new Long(source.FixId);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FixId", this.FixId);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

