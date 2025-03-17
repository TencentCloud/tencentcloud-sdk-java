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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncTaskBindResourceResult extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 关联云资源结果
    */
    @SerializedName("BindResourceResult")
    @Expose
    private BindResourceResult [] BindResourceResult;

    /**
    * 关联云资源异步查询结果： 0表示查询中， 1表示查询成功。 2表示查询异常； 若状态为1，则查看BindResourceResult结果；若状态为2，则查看Error原因
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 关联云资源错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Error")
    @Expose
    private Error Error;

    /**
    * 当前结果缓存时间
    */
    @SerializedName("CacheTime")
    @Expose
    private String CacheTime;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 关联云资源结果 
     * @return BindResourceResult 关联云资源结果
     */
    public BindResourceResult [] getBindResourceResult() {
        return this.BindResourceResult;
    }

    /**
     * Set 关联云资源结果
     * @param BindResourceResult 关联云资源结果
     */
    public void setBindResourceResult(BindResourceResult [] BindResourceResult) {
        this.BindResourceResult = BindResourceResult;
    }

    /**
     * Get 关联云资源异步查询结果： 0表示查询中， 1表示查询成功。 2表示查询异常； 若状态为1，则查看BindResourceResult结果；若状态为2，则查看Error原因 
     * @return Status 关联云资源异步查询结果： 0表示查询中， 1表示查询成功。 2表示查询异常； 若状态为1，则查看BindResourceResult结果；若状态为2，则查看Error原因
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 关联云资源异步查询结果： 0表示查询中， 1表示查询成功。 2表示查询异常； 若状态为1，则查看BindResourceResult结果；若状态为2，则查看Error原因
     * @param Status 关联云资源异步查询结果： 0表示查询中， 1表示查询成功。 2表示查询异常； 若状态为1，则查看BindResourceResult结果；若状态为2，则查看Error原因
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 关联云资源错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Error 关联云资源错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Error getError() {
        return this.Error;
    }

    /**
     * Set 关联云资源错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Error 关联云资源错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setError(Error Error) {
        this.Error = Error;
    }

    /**
     * Get 当前结果缓存时间 
     * @return CacheTime 当前结果缓存时间
     */
    public String getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set 当前结果缓存时间
     * @param CacheTime 当前结果缓存时间
     */
    public void setCacheTime(String CacheTime) {
        this.CacheTime = CacheTime;
    }

    public SyncTaskBindResourceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncTaskBindResourceResult(SyncTaskBindResourceResult source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.BindResourceResult != null) {
            this.BindResourceResult = new BindResourceResult[source.BindResourceResult.length];
            for (int i = 0; i < source.BindResourceResult.length; i++) {
                this.BindResourceResult[i] = new BindResourceResult(source.BindResourceResult[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Error != null) {
            this.Error = new Error(source.Error);
        }
        if (source.CacheTime != null) {
            this.CacheTime = new String(source.CacheTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "BindResourceResult.", this.BindResourceResult);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Error.", this.Error);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);

    }
}

