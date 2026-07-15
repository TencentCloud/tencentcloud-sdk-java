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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAiDramaTaskRequest extends AbstractModel {

    /**
    * <p>ai漫剧输入</p>
    */
    @SerializedName("Input")
    @Expose
    private AiDramaInput Input;

    /**
    * <p>用户cos信息</p>
    */
    @SerializedName("CosInfo")
    @Expose
    private VideoDramaCosInfo CosInfo;

    /**
     * Get <p>ai漫剧输入</p> 
     * @return Input <p>ai漫剧输入</p>
     */
    public AiDramaInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>ai漫剧输入</p>
     * @param Input <p>ai漫剧输入</p>
     */
    public void setInput(AiDramaInput Input) {
        this.Input = Input;
    }

    /**
     * Get <p>用户cos信息</p> 
     * @return CosInfo <p>用户cos信息</p>
     */
    public VideoDramaCosInfo getCosInfo() {
        return this.CosInfo;
    }

    /**
     * Set <p>用户cos信息</p>
     * @param CosInfo <p>用户cos信息</p>
     */
    public void setCosInfo(VideoDramaCosInfo CosInfo) {
        this.CosInfo = CosInfo;
    }

    public CreateAiDramaTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAiDramaTaskRequest(CreateAiDramaTaskRequest source) {
        if (source.Input != null) {
            this.Input = new AiDramaInput(source.Input);
        }
        if (source.CosInfo != null) {
            this.CosInfo = new VideoDramaCosInfo(source.CosInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "CosInfo.", this.CosInfo);

    }
}

