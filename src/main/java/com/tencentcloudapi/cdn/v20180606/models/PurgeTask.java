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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PurgeTask extends AbstractModel {

    /**
    * 刷新任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 刷新 URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 刷新任务状态
fail：刷新失败
done：刷新成功
process：刷新中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 刷新类型
url：URL 刷新
path：目录刷新
    */
    @SerializedName("PurgeType")
    @Expose
    private String PurgeType;

    /**
    * 刷新方式
flush：刷新更新资源（仅目录刷新时有此类型）
delete：刷新全部资源
    */
    @SerializedName("FlushType")
    @Expose
    private String FlushType;

    /**
    * 刷新任务提交时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 刷新任务 ID 
     * @return TaskId 刷新任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 刷新任务 ID
     * @param TaskId 刷新任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 刷新 URL 
     * @return Url 刷新 URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 刷新 URL
     * @param Url 刷新 URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 刷新任务状态
fail：刷新失败
done：刷新成功
process：刷新中 
     * @return Status 刷新任务状态
fail：刷新失败
done：刷新成功
process：刷新中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 刷新任务状态
fail：刷新失败
done：刷新成功
process：刷新中
     * @param Status 刷新任务状态
fail：刷新失败
done：刷新成功
process：刷新中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 刷新类型
url：URL 刷新
path：目录刷新 
     * @return PurgeType 刷新类型
url：URL 刷新
path：目录刷新
     */
    public String getPurgeType() {
        return this.PurgeType;
    }

    /**
     * Set 刷新类型
url：URL 刷新
path：目录刷新
     * @param PurgeType 刷新类型
url：URL 刷新
path：目录刷新
     */
    public void setPurgeType(String PurgeType) {
        this.PurgeType = PurgeType;
    }

    /**
     * Get 刷新方式
flush：刷新更新资源（仅目录刷新时有此类型）
delete：刷新全部资源 
     * @return FlushType 刷新方式
flush：刷新更新资源（仅目录刷新时有此类型）
delete：刷新全部资源
     */
    public String getFlushType() {
        return this.FlushType;
    }

    /**
     * Set 刷新方式
flush：刷新更新资源（仅目录刷新时有此类型）
delete：刷新全部资源
     * @param FlushType 刷新方式
flush：刷新更新资源（仅目录刷新时有此类型）
delete：刷新全部资源
     */
    public void setFlushType(String FlushType) {
        this.FlushType = FlushType;
    }

    /**
     * Get 刷新任务提交时间 
     * @return CreateTime 刷新任务提交时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 刷新任务提交时间
     * @param CreateTime 刷新任务提交时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public PurgeTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PurgeTask(PurgeTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PurgeType != null) {
            this.PurgeType = new String(source.PurgeType);
        }
        if (source.FlushType != null) {
            this.FlushType = new String(source.FlushType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PurgeType", this.PurgeType);
        this.setParamSimple(map, prefix + "FlushType", this.FlushType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

