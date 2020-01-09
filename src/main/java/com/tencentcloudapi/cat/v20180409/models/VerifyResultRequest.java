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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyResultRequest extends AbstractModel{

    /**
    * 要查询的拨测任务的结果id
    */
    @SerializedName("ResultId")
    @Expose
    private Long ResultId;

    /**
     * Get 要查询的拨测任务的结果id 
     * @return ResultId 要查询的拨测任务的结果id
     */
    public Long getResultId() {
        return this.ResultId;
    }

    /**
     * Set 要查询的拨测任务的结果id
     * @param ResultId 要查询的拨测任务的结果id
     */
    public void setResultId(Long ResultId) {
        this.ResultId = ResultId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultId", this.ResultId);

    }
}

