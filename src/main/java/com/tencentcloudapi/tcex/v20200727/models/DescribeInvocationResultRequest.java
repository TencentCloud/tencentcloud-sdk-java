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
package com.tencentcloudapi.tcex.v20200727.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInvocationResultRequest extends AbstractModel{

    /**
    * 调用id，为调用InvokeService接口返回的RequestId
    */
    @SerializedName("InvokeId")
    @Expose
    private String InvokeId;

    /**
     * Get 调用id，为调用InvokeService接口返回的RequestId 
     * @return InvokeId 调用id，为调用InvokeService接口返回的RequestId
     */
    public String getInvokeId() {
        return this.InvokeId;
    }

    /**
     * Set 调用id，为调用InvokeService接口返回的RequestId
     * @param InvokeId 调用id，为调用InvokeService接口返回的RequestId
     */
    public void setInvokeId(String InvokeId) {
        this.InvokeId = InvokeId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvokeId", this.InvokeId);

    }
}

