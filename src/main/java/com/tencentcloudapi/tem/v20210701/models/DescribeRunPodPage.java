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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRunPodPage extends AbstractModel{

    /**
    * 分页下标
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 请求id
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * 条目
    */
    @SerializedName("PodList")
    @Expose
    private RunVersionPod [] PodList;

    /**
     * Get 分页下标 
     * @return Offset 分页下标
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页下标
     * @param Offset 分页下标
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单页条数 
     * @return Limit 单页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页条数
     * @param Limit 单页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

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
     * Get 请求id 
     * @return RequestId 请求id
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 请求id
     * @param RequestId 请求id
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get 条目 
     * @return PodList 条目
     */
    public RunVersionPod [] getPodList() {
        return this.PodList;
    }

    /**
     * Set 条目
     * @param PodList 条目
     */
    public void setPodList(RunVersionPod [] PodList) {
        this.PodList = PodList;
    }

    public DescribeRunPodPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRunPodPage(DescribeRunPodPage source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.PodList != null) {
            this.PodList = new RunVersionPod[source.PodList.length];
            for (int i = 0; i < source.PodList.length; i++) {
                this.PodList[i] = new RunVersionPod(source.PodList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamArrayObj(map, prefix + "PodList.", this.PodList);

    }
}

