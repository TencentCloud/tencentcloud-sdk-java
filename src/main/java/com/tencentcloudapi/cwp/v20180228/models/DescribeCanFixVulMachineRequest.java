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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCanFixVulMachineRequest extends AbstractModel {

    /**
    * 漏洞id 支持多个漏洞
    */
    @SerializedName("VulIds")
    @Expose
    private Long [] VulIds;

    /**
    * 需要修复的主机，和VulIds是and 的关系
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
     * Get 漏洞id 支持多个漏洞 
     * @return VulIds 漏洞id 支持多个漏洞
     */
    public Long [] getVulIds() {
        return this.VulIds;
    }

    /**
     * Set 漏洞id 支持多个漏洞
     * @param VulIds 漏洞id 支持多个漏洞
     */
    public void setVulIds(Long [] VulIds) {
        this.VulIds = VulIds;
    }

    /**
     * Get 需要修复的主机，和VulIds是and 的关系 
     * @return Quuids 需要修复的主机，和VulIds是and 的关系
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 需要修复的主机，和VulIds是and 的关系
     * @param Quuids 需要修复的主机，和VulIds是and 的关系
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    public DescribeCanFixVulMachineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCanFixVulMachineRequest(DescribeCanFixVulMachineRequest source) {
        if (source.VulIds != null) {
            this.VulIds = new Long[source.VulIds.length];
            for (int i = 0; i < source.VulIds.length; i++) {
                this.VulIds[i] = new Long(source.VulIds[i]);
            }
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VulIds.", this.VulIds);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);

    }
}

