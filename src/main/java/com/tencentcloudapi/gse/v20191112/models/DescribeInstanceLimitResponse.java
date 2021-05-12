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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceLimitResponse extends AbstractModel{

    /**
    * 限额
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 详细信息
    */
    @SerializedName("ExtraInfos")
    @Expose
    private ExtraInfos [] ExtraInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 限额 
     * @return Limit 限额
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限额
     * @param Limit 限额
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 详细信息 
     * @return ExtraInfos 详细信息
     */
    public ExtraInfos [] getExtraInfos() {
        return this.ExtraInfos;
    }

    /**
     * Set 详细信息
     * @param ExtraInfos 详细信息
     */
    public void setExtraInfos(ExtraInfos [] ExtraInfos) {
        this.ExtraInfos = ExtraInfos;
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

    public DescribeInstanceLimitResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceLimitResponse(DescribeInstanceLimitResponse source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ExtraInfos != null) {
            this.ExtraInfos = new ExtraInfos[source.ExtraInfos.length];
            for (int i = 0; i < source.ExtraInfos.length; i++) {
                this.ExtraInfos[i] = new ExtraInfos(source.ExtraInfos[i]);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "ExtraInfos.", this.ExtraInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

