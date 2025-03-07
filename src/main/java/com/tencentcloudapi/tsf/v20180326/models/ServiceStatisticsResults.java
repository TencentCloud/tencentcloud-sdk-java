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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceStatisticsResults extends AbstractModel {

    /**
    * 返回结果
    */
    @SerializedName("Content")
    @Expose
    private ServiceStatisticsResult [] Content;

    /**
    * 条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 返回结果 
     * @return Content 返回结果
     */
    public ServiceStatisticsResult [] getContent() {
        return this.Content;
    }

    /**
     * Set 返回结果
     * @param Content 返回结果
     */
    public void setContent(ServiceStatisticsResult [] Content) {
        this.Content = Content;
    }

    /**
     * Get 条数 
     * @return TotalCount 条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 条数
     * @param TotalCount 条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public ServiceStatisticsResults() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceStatisticsResults(ServiceStatisticsResults source) {
        if (source.Content != null) {
            this.Content = new ServiceStatisticsResult[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new ServiceStatisticsResult(source.Content[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

