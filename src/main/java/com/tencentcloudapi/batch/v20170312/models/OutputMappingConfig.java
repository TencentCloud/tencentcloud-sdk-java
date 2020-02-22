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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputMappingConfig extends AbstractModel{

    /**
    * 存储类型，仅支持COS
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 并行worker数量
    */
    @SerializedName("WorkerNum")
    @Expose
    private Long WorkerNum;

    /**
    * worker分块大小，单位MB
    */
    @SerializedName("WorkerPartSize")
    @Expose
    private Long WorkerPartSize;

    /**
     * Get 存储类型，仅支持COS 
     * @return Scene 存储类型，仅支持COS
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 存储类型，仅支持COS
     * @param Scene 存储类型，仅支持COS
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 并行worker数量 
     * @return WorkerNum 并行worker数量
     */
    public Long getWorkerNum() {
        return this.WorkerNum;
    }

    /**
     * Set 并行worker数量
     * @param WorkerNum 并行worker数量
     */
    public void setWorkerNum(Long WorkerNum) {
        this.WorkerNum = WorkerNum;
    }

    /**
     * Get worker分块大小，单位MB 
     * @return WorkerPartSize worker分块大小，单位MB
     */
    public Long getWorkerPartSize() {
        return this.WorkerPartSize;
    }

    /**
     * Set worker分块大小，单位MB
     * @param WorkerPartSize worker分块大小，单位MB
     */
    public void setWorkerPartSize(Long WorkerPartSize) {
        this.WorkerPartSize = WorkerPartSize;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "WorkerNum", this.WorkerNum);
        this.setParamSimple(map, prefix + "WorkerPartSize", this.WorkerPartSize);

    }
}

