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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomPersonsResponse extends AbstractModel{

    /**
    * 满足过滤条件的自定义人物数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 自定义人物信息
    */
    @SerializedName("PersonInfoSet")
    @Expose
    private CustomPersonInfo [] PersonInfoSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 满足过滤条件的自定义人物数量 
     * @return TotalCount 满足过滤条件的自定义人物数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 满足过滤条件的自定义人物数量
     * @param TotalCount 满足过滤条件的自定义人物数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 自定义人物信息 
     * @return PersonInfoSet 自定义人物信息
     */
    public CustomPersonInfo [] getPersonInfoSet() {
        return this.PersonInfoSet;
    }

    /**
     * Set 自定义人物信息
     * @param PersonInfoSet 自定义人物信息
     */
    public void setPersonInfoSet(CustomPersonInfo [] PersonInfoSet) {
        this.PersonInfoSet = PersonInfoSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCustomPersonsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomPersonsResponse(DescribeCustomPersonsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PersonInfoSet != null) {
            this.PersonInfoSet = new CustomPersonInfo[source.PersonInfoSet.length];
            for (int i = 0; i < source.PersonInfoSet.length; i++) {
                this.PersonInfoSet[i] = new CustomPersonInfo(source.PersonInfoSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "PersonInfoSet.", this.PersonInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

