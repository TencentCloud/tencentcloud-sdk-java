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

public class CreateResourceConfigRequest extends AbstractModel {

    /**
    * 模板名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Head节点配置
    */
    @SerializedName("Head")
    @Expose
    private HeadSpecDTO Head;

    /**
    * Worker节点配置
    */
    @SerializedName("Worker")
    @Expose
    private WorkerSpecDTO [] Worker;

    /**
    * 模板类型，不填默认是Ray
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 模板名称 
     * @return Name 模板名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称
     * @param Name 模板名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Head节点配置 
     * @return Head Head节点配置
     */
    public HeadSpecDTO getHead() {
        return this.Head;
    }

    /**
     * Set Head节点配置
     * @param Head Head节点配置
     */
    public void setHead(HeadSpecDTO Head) {
        this.Head = Head;
    }

    /**
     * Get Worker节点配置 
     * @return Worker Worker节点配置
     */
    public WorkerSpecDTO [] getWorker() {
        return this.Worker;
    }

    /**
     * Set Worker节点配置
     * @param Worker Worker节点配置
     */
    public void setWorker(WorkerSpecDTO [] Worker) {
        this.Worker = Worker;
    }

    /**
     * Get 模板类型，不填默认是Ray 
     * @return Type 模板类型，不填默认是Ray
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 模板类型，不填默认是Ray
     * @param Type 模板类型，不填默认是Ray
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CreateResourceConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResourceConfigRequest(CreateResourceConfigRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Head != null) {
            this.Head = new HeadSpecDTO(source.Head);
        }
        if (source.Worker != null) {
            this.Worker = new WorkerSpecDTO[source.Worker.length];
            for (int i = 0; i < source.Worker.length; i++) {
                this.Worker[i] = new WorkerSpecDTO(source.Worker[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "Head.", this.Head);
        this.setParamArrayObj(map, prefix + "Worker.", this.Worker);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

