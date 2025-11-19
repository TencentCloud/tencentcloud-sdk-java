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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchInvokeTWeSeeRecognitionTaskRequest extends AbstractModel {

    /**
    * 待执行的 TWeSee 语义理解任务列表
    */
    @SerializedName("Inputs")
    @Expose
    private CreateVisionRecognitionTaskInput [] Inputs;

    /**
     * Get 待执行的 TWeSee 语义理解任务列表 
     * @return Inputs 待执行的 TWeSee 语义理解任务列表
     */
    public CreateVisionRecognitionTaskInput [] getInputs() {
        return this.Inputs;
    }

    /**
     * Set 待执行的 TWeSee 语义理解任务列表
     * @param Inputs 待执行的 TWeSee 语义理解任务列表
     */
    public void setInputs(CreateVisionRecognitionTaskInput [] Inputs) {
        this.Inputs = Inputs;
    }

    public BatchInvokeTWeSeeRecognitionTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchInvokeTWeSeeRecognitionTaskRequest(BatchInvokeTWeSeeRecognitionTaskRequest source) {
        if (source.Inputs != null) {
            this.Inputs = new CreateVisionRecognitionTaskInput[source.Inputs.length];
            for (int i = 0; i < source.Inputs.length; i++) {
                this.Inputs[i] = new CreateVisionRecognitionTaskInput(source.Inputs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Inputs.", this.Inputs);

    }
}

