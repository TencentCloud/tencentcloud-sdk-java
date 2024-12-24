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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartPredictReqData extends AbstractModel {

    /**
    * 病历和处方信息
    */
    @SerializedName("RequestCase")
    @Expose
    private RequestCase RequestCase;

    /**
    * 0--默认值，同时返回**疾病预测**和**用药审查**结果<br>1--仅返回**疾病预测**结果<br>2--仅返回**用药审查**结果<br>已同时激活两个模块时，可按需使用 
    */
    @SerializedName("RequestType")
    @Expose
    private Long RequestType;

    /**
     * Get 病历和处方信息 
     * @return RequestCase 病历和处方信息
     */
    public RequestCase getRequestCase() {
        return this.RequestCase;
    }

    /**
     * Set 病历和处方信息
     * @param RequestCase 病历和处方信息
     */
    public void setRequestCase(RequestCase RequestCase) {
        this.RequestCase = RequestCase;
    }

    /**
     * Get 0--默认值，同时返回**疾病预测**和**用药审查**结果<br>1--仅返回**疾病预测**结果<br>2--仅返回**用药审查**结果<br>已同时激活两个模块时，可按需使用  
     * @return RequestType 0--默认值，同时返回**疾病预测**和**用药审查**结果<br>1--仅返回**疾病预测**结果<br>2--仅返回**用药审查**结果<br>已同时激活两个模块时，可按需使用 
     */
    public Long getRequestType() {
        return this.RequestType;
    }

    /**
     * Set 0--默认值，同时返回**疾病预测**和**用药审查**结果<br>1--仅返回**疾病预测**结果<br>2--仅返回**用药审查**结果<br>已同时激活两个模块时，可按需使用 
     * @param RequestType 0--默认值，同时返回**疾病预测**和**用药审查**结果<br>1--仅返回**疾病预测**结果<br>2--仅返回**用药审查**结果<br>已同时激活两个模块时，可按需使用 
     */
    public void setRequestType(Long RequestType) {
        this.RequestType = RequestType;
    }

    public SmartPredictReqData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartPredictReqData(SmartPredictReqData source) {
        if (source.RequestCase != null) {
            this.RequestCase = new RequestCase(source.RequestCase);
        }
        if (source.RequestType != null) {
            this.RequestType = new Long(source.RequestType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RequestCase.", this.RequestCase);
        this.setParamSimple(map, prefix + "RequestType", this.RequestType);

    }
}

