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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssemblyUsageInfo extends AbstractModel {

    /**
    * 频道线性组装用量明细
    */
    @SerializedName("AssemblyUsageDetails")
    @Expose
    private AssemblyUsageDetail [] AssemblyUsageDetails;

    /**
    * Basic频道类型总时长
    */
    @SerializedName("SumBasicChannelDuration")
    @Expose
    private Long SumBasicChannelDuration;

    /**
    * Standard频道类型总时长
    */
    @SerializedName("SumStandardChannelDuration")
    @Expose
    private Long SumStandardChannelDuration;

    /**
     * Get 频道线性组装用量明细 
     * @return AssemblyUsageDetails 频道线性组装用量明细
     */
    public AssemblyUsageDetail [] getAssemblyUsageDetails() {
        return this.AssemblyUsageDetails;
    }

    /**
     * Set 频道线性组装用量明细
     * @param AssemblyUsageDetails 频道线性组装用量明细
     */
    public void setAssemblyUsageDetails(AssemblyUsageDetail [] AssemblyUsageDetails) {
        this.AssemblyUsageDetails = AssemblyUsageDetails;
    }

    /**
     * Get Basic频道类型总时长 
     * @return SumBasicChannelDuration Basic频道类型总时长
     */
    public Long getSumBasicChannelDuration() {
        return this.SumBasicChannelDuration;
    }

    /**
     * Set Basic频道类型总时长
     * @param SumBasicChannelDuration Basic频道类型总时长
     */
    public void setSumBasicChannelDuration(Long SumBasicChannelDuration) {
        this.SumBasicChannelDuration = SumBasicChannelDuration;
    }

    /**
     * Get Standard频道类型总时长 
     * @return SumStandardChannelDuration Standard频道类型总时长
     */
    public Long getSumStandardChannelDuration() {
        return this.SumStandardChannelDuration;
    }

    /**
     * Set Standard频道类型总时长
     * @param SumStandardChannelDuration Standard频道类型总时长
     */
    public void setSumStandardChannelDuration(Long SumStandardChannelDuration) {
        this.SumStandardChannelDuration = SumStandardChannelDuration;
    }

    public AssemblyUsageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssemblyUsageInfo(AssemblyUsageInfo source) {
        if (source.AssemblyUsageDetails != null) {
            this.AssemblyUsageDetails = new AssemblyUsageDetail[source.AssemblyUsageDetails.length];
            for (int i = 0; i < source.AssemblyUsageDetails.length; i++) {
                this.AssemblyUsageDetails[i] = new AssemblyUsageDetail(source.AssemblyUsageDetails[i]);
            }
        }
        if (source.SumBasicChannelDuration != null) {
            this.SumBasicChannelDuration = new Long(source.SumBasicChannelDuration);
        }
        if (source.SumStandardChannelDuration != null) {
            this.SumStandardChannelDuration = new Long(source.SumStandardChannelDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AssemblyUsageDetails.", this.AssemblyUsageDetails);
        this.setParamSimple(map, prefix + "SumBasicChannelDuration", this.SumBasicChannelDuration);
        this.setParamSimple(map, prefix + "SumStandardChannelDuration", this.SumStandardChannelDuration);

    }
}

