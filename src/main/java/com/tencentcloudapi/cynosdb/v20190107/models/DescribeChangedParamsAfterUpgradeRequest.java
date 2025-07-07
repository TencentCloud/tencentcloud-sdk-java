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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeChangedParamsAfterUpgradeRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 变配后的CPU
    */
    @SerializedName("DstCpu")
    @Expose
    private Long DstCpu;

    /**
    * 变配后的MEM，单位G
    */
    @SerializedName("DstMem")
    @Expose
    private Long DstMem;

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 变配后的CPU 
     * @return DstCpu 变配后的CPU
     */
    public Long getDstCpu() {
        return this.DstCpu;
    }

    /**
     * Set 变配后的CPU
     * @param DstCpu 变配后的CPU
     */
    public void setDstCpu(Long DstCpu) {
        this.DstCpu = DstCpu;
    }

    /**
     * Get 变配后的MEM，单位G 
     * @return DstMem 变配后的MEM，单位G
     */
    public Long getDstMem() {
        return this.DstMem;
    }

    /**
     * Set 变配后的MEM，单位G
     * @param DstMem 变配后的MEM，单位G
     */
    public void setDstMem(Long DstMem) {
        this.DstMem = DstMem;
    }

    public DescribeChangedParamsAfterUpgradeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChangedParamsAfterUpgradeRequest(DescribeChangedParamsAfterUpgradeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DstCpu != null) {
            this.DstCpu = new Long(source.DstCpu);
        }
        if (source.DstMem != null) {
            this.DstMem = new Long(source.DstMem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DstCpu", this.DstCpu);
        this.setParamSimple(map, prefix + "DstMem", this.DstMem);

    }
}

