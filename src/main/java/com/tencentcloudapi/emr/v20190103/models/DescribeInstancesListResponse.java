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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesListResponse extends AbstractModel{

    /**
    * 符合条件的实例总数。
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * 集群实例列表
    */
    @SerializedName("InstancesList")
    @Expose
    private EmrListInstance [] InstancesList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的实例总数。 
     * @return TotalCnt 符合条件的实例总数。
     */
    public Long getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set 符合条件的实例总数。
     * @param TotalCnt 符合条件的实例总数。
     */
    public void setTotalCnt(Long TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * Get 集群实例列表 
     * @return InstancesList 集群实例列表
     */
    public EmrListInstance [] getInstancesList() {
        return this.InstancesList;
    }

    /**
     * Set 集群实例列表
     * @param InstancesList 集群实例列表
     */
    public void setInstancesList(EmrListInstance [] InstancesList) {
        this.InstancesList = InstancesList;
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

    public DescribeInstancesListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesListResponse(DescribeInstancesListResponse source) {
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.InstancesList != null) {
            this.InstancesList = new EmrListInstance[source.InstancesList.length];
            for (int i = 0; i < source.InstancesList.length; i++) {
                this.InstancesList[i] = new EmrListInstance(source.InstancesList[i]);
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
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamArrayObj(map, prefix + "InstancesList.", this.InstancesList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

