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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationTriggerPersonalResp extends AbstractModel {

    /**
    * 返回条目总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 触发器列表
    */
    @SerializedName("TriggerInfo")
    @Expose
    private TriggerResp [] TriggerInfo;

    /**
     * Get 返回条目总数 
     * @return TotalCount 返回条目总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 返回条目总数
     * @param TotalCount 返回条目总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 触发器列表 
     * @return TriggerInfo 触发器列表
     */
    public TriggerResp [] getTriggerInfo() {
        return this.TriggerInfo;
    }

    /**
     * Set 触发器列表
     * @param TriggerInfo 触发器列表
     */
    public void setTriggerInfo(TriggerResp [] TriggerInfo) {
        this.TriggerInfo = TriggerInfo;
    }

    public DescribeApplicationTriggerPersonalResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationTriggerPersonalResp(DescribeApplicationTriggerPersonalResp source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TriggerInfo != null) {
            this.TriggerInfo = new TriggerResp[source.TriggerInfo.length];
            for (int i = 0; i < source.TriggerInfo.length; i++) {
                this.TriggerInfo[i] = new TriggerResp(source.TriggerInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TriggerInfo.", this.TriggerInfo);

    }
}

