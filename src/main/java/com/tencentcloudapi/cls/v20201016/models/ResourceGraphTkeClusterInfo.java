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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceGraphTkeClusterInfo extends AbstractModel {

    /**
    * <p>tke集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>资源图谱id</p>
    */
    @SerializedName("ResourceGraphId")
    @Expose
    private String ResourceGraphId;

    /**
    * <p>资源图谱名称</p>
    */
    @SerializedName("ResourceGraphName")
    @Expose
    private String ResourceGraphName;

    /**
    * <p>资源图谱接入任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>资源图谱接入任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
     * Get <p>tke集群id</p> 
     * @return ClusterId <p>tke集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>tke集群id</p>
     * @param ClusterId <p>tke集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>资源图谱id</p> 
     * @return ResourceGraphId <p>资源图谱id</p>
     */
    public String getResourceGraphId() {
        return this.ResourceGraphId;
    }

    /**
     * Set <p>资源图谱id</p>
     * @param ResourceGraphId <p>资源图谱id</p>
     */
    public void setResourceGraphId(String ResourceGraphId) {
        this.ResourceGraphId = ResourceGraphId;
    }

    /**
     * Get <p>资源图谱名称</p> 
     * @return ResourceGraphName <p>资源图谱名称</p>
     */
    public String getResourceGraphName() {
        return this.ResourceGraphName;
    }

    /**
     * Set <p>资源图谱名称</p>
     * @param ResourceGraphName <p>资源图谱名称</p>
     */
    public void setResourceGraphName(String ResourceGraphName) {
        this.ResourceGraphName = ResourceGraphName;
    }

    /**
     * Get <p>资源图谱接入任务id</p> 
     * @return TaskId <p>资源图谱接入任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>资源图谱接入任务id</p>
     * @param TaskId <p>资源图谱接入任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>资源图谱接入任务名称</p> 
     * @return TaskName <p>资源图谱接入任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>资源图谱接入任务名称</p>
     * @param TaskName <p>资源图谱接入任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    public ResourceGraphTkeClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceGraphTkeClusterInfo(ResourceGraphTkeClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ResourceGraphId != null) {
            this.ResourceGraphId = new String(source.ResourceGraphId);
        }
        if (source.ResourceGraphName != null) {
            this.ResourceGraphName = new String(source.ResourceGraphName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ResourceGraphId", this.ResourceGraphId);
        this.setParamSimple(map, prefix + "ResourceGraphName", this.ResourceGraphName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);

    }
}

