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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulListRequest extends AbstractModel{

    /**
    * 查询过滤参数
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
     * Get 查询过滤参数 
     * @return Params 查询过滤参数
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 查询过滤参数
     * @param Params 查询过滤参数
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    public DescribeVulListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulListRequest(DescribeVulListRequest source) {
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Params", this.Params);

    }
}

