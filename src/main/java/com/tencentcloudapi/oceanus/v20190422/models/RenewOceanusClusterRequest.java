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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewOceanusClusterRequest extends AbstractModel {

    /**
    * <p>集群ID</p><p>参数格式：cluster-xxx</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>续费的时长，单位为月，只支持包年包月集群</p><p>取值范围：[1, 36]</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get <p>集群ID</p><p>参数格式：cluster-xxx</p> 
     * @return ClusterId <p>集群ID</p><p>参数格式：cluster-xxx</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p><p>参数格式：cluster-xxx</p>
     * @param ClusterId <p>集群ID</p><p>参数格式：cluster-xxx</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>续费的时长，单位为月，只支持包年包月集群</p><p>取值范围：[1, 36]</p> 
     * @return Period <p>续费的时长，单位为月，只支持包年包月集群</p><p>取值范围：[1, 36]</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>续费的时长，单位为月，只支持包年包月集群</p><p>取值范围：[1, 36]</p>
     * @param Period <p>续费的时长，单位为月，只支持包年包月集群</p><p>取值范围：[1, 36]</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public RenewOceanusClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewOceanusClusterRequest(RenewOceanusClusterRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

