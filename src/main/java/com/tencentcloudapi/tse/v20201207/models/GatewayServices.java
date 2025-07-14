/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayServices extends AbstractModel {

    /**
    * 服务列表
    */
    @SerializedName("ServiceList")
    @Expose
    private KongServiceLightPreview [] ServiceList;

    /**
    * 结果总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 服务列表 
     * @return ServiceList 服务列表
     */
    public KongServiceLightPreview [] getServiceList() {
        return this.ServiceList;
    }

    /**
     * Set 服务列表
     * @param ServiceList 服务列表
     */
    public void setServiceList(KongServiceLightPreview [] ServiceList) {
        this.ServiceList = ServiceList;
    }

    /**
     * Get 结果总数 
     * @return TotalCount 结果总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 结果总数
     * @param TotalCount 结果总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public GatewayServices() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayServices(GatewayServices source) {
        if (source.ServiceList != null) {
            this.ServiceList = new KongServiceLightPreview[source.ServiceList.length];
            for (int i = 0; i < source.ServiceList.length; i++) {
                this.ServiceList[i] = new KongServiceLightPreview(source.ServiceList[i]);
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
        this.setParamArrayObj(map, prefix + "ServiceList.", this.ServiceList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

