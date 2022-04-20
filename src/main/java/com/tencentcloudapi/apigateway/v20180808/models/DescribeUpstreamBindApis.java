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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUpstreamBindApis extends AbstractModel{

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 绑定的API信息
    */
    @SerializedName("BindApiSet")
    @Expose
    private BindApiInfo [] BindApiSet;

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 绑定的API信息 
     * @return BindApiSet 绑定的API信息
     */
    public BindApiInfo [] getBindApiSet() {
        return this.BindApiSet;
    }

    /**
     * Set 绑定的API信息
     * @param BindApiSet 绑定的API信息
     */
    public void setBindApiSet(BindApiInfo [] BindApiSet) {
        this.BindApiSet = BindApiSet;
    }

    public DescribeUpstreamBindApis() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUpstreamBindApis(DescribeUpstreamBindApis source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.BindApiSet != null) {
            this.BindApiSet = new BindApiInfo[source.BindApiSet.length];
            for (int i = 0; i < source.BindApiSet.length; i++) {
                this.BindApiSet[i] = new BindApiInfo(source.BindApiSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "BindApiSet.", this.BindApiSet);

    }
}

