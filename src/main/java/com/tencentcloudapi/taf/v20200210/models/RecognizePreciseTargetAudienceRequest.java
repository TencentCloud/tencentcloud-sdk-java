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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizePreciseTargetAudienceRequest extends AbstractModel {

    /**
    * 业务数据
    */
    @SerializedName("BspData")
    @Expose
    private InputRecognizeTargetAudience BspData;

    /**
     * Get 业务数据 
     * @return BspData 业务数据
     */
    public InputRecognizeTargetAudience getBspData() {
        return this.BspData;
    }

    /**
     * Set 业务数据
     * @param BspData 业务数据
     */
    public void setBspData(InputRecognizeTargetAudience BspData) {
        this.BspData = BspData;
    }

    public RecognizePreciseTargetAudienceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizePreciseTargetAudienceRequest(RecognizePreciseTargetAudienceRequest source) {
        if (source.BspData != null) {
            this.BspData = new InputRecognizeTargetAudience(source.BspData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BspData.", this.BspData);

    }
}

