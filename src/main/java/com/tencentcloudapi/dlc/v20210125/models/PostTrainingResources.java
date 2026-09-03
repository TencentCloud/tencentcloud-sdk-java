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

public class PostTrainingResources extends AbstractModel {

    /**
    * <p>Head 节点资源规格</p>
    */
    @SerializedName("Head")
    @Expose
    private HeadSpecDTO Head;

    /**
    * <p>Worker 节点资源规格</p>
    */
    @SerializedName("Worker")
    @Expose
    private WorkerSpecDTO [] Worker;

    /**
     * Get <p>Head 节点资源规格</p> 
     * @return Head <p>Head 节点资源规格</p>
     */
    public HeadSpecDTO getHead() {
        return this.Head;
    }

    /**
     * Set <p>Head 节点资源规格</p>
     * @param Head <p>Head 节点资源规格</p>
     */
    public void setHead(HeadSpecDTO Head) {
        this.Head = Head;
    }

    /**
     * Get <p>Worker 节点资源规格</p> 
     * @return Worker <p>Worker 节点资源规格</p>
     */
    public WorkerSpecDTO [] getWorker() {
        return this.Worker;
    }

    /**
     * Set <p>Worker 节点资源规格</p>
     * @param Worker <p>Worker 节点资源规格</p>
     */
    public void setWorker(WorkerSpecDTO [] Worker) {
        this.Worker = Worker;
    }

    public PostTrainingResources() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostTrainingResources(PostTrainingResources source) {
        if (source.Head != null) {
            this.Head = new HeadSpecDTO(source.Head);
        }
        if (source.Worker != null) {
            this.Worker = new WorkerSpecDTO[source.Worker.length];
            for (int i = 0; i < source.Worker.length; i++) {
                this.Worker[i] = new WorkerSpecDTO(source.Worker[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Head.", this.Head);
        this.setParamArrayObj(map, prefix + "Worker.", this.Worker);

    }
}

