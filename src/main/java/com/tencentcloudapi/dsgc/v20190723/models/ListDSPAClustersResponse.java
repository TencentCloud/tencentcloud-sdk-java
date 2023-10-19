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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListDSPAClustersResponse extends AbstractModel {

    /**
    * 资源总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 资源列表。
    */
    @SerializedName("InstanceList")
    @Expose
    private DspaInstance [] InstanceList;

    /**
    * 是否被拒绝访问所有dspa实例资源。
    */
    @SerializedName("DenyAll")
    @Expose
    private Boolean DenyAll;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资源总数。 
     * @return TotalCount 资源总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 资源总数。
     * @param TotalCount 资源总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 资源列表。 
     * @return InstanceList 资源列表。
     */
    public DspaInstance [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set 资源列表。
     * @param InstanceList 资源列表。
     */
    public void setInstanceList(DspaInstance [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get 是否被拒绝访问所有dspa实例资源。 
     * @return DenyAll 是否被拒绝访问所有dspa实例资源。
     */
    public Boolean getDenyAll() {
        return this.DenyAll;
    }

    /**
     * Set 是否被拒绝访问所有dspa实例资源。
     * @param DenyAll 是否被拒绝访问所有dspa实例资源。
     */
    public void setDenyAll(Boolean DenyAll) {
        this.DenyAll = DenyAll;
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

    public ListDSPAClustersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDSPAClustersResponse(ListDSPAClustersResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InstanceList != null) {
            this.InstanceList = new DspaInstance[source.InstanceList.length];
            for (int i = 0; i < source.InstanceList.length; i++) {
                this.InstanceList[i] = new DspaInstance(source.InstanceList[i]);
            }
        }
        if (source.DenyAll != null) {
            this.DenyAll = new Boolean(source.DenyAll);
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
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);
        this.setParamSimple(map, prefix + "DenyAll", this.DenyAll);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

