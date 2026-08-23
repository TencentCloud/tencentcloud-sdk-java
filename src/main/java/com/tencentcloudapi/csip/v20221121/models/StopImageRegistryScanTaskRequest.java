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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopImageRegistryScanTaskRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>镜像id</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String [] ImageId;

    /**
    * <p>扫描任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>镜像id</p> 
     * @return ImageId <p>镜像id</p>
     */
    public String [] getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像id</p>
     * @param ImageId <p>镜像id</p>
     */
    public void setImageId(String [] ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>扫描任务id</p> 
     * @return TaskId <p>扫描任务id</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>扫描任务id</p>
     * @param TaskId <p>扫描任务id</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public StopImageRegistryScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopImageRegistryScanTaskRequest(StopImageRegistryScanTaskRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.ImageId != null) {
            this.ImageId = new String[source.ImageId.length];
            for (int i = 0; i < source.ImageId.length; i++) {
                this.ImageId[i] = new String(source.ImageId[i]);
            }
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "ImageId.", this.ImageId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

