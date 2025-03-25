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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationTriggerLogPersonalResp extends AbstractModel {

    /**
    * 返回总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 触发日志列表
    */
    @SerializedName("LogInfo")
    @Expose
    private TriggerLogResp [] LogInfo;

    /**
     * Get 返回总数 
     * @return TotalCount 返回总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 返回总数
     * @param TotalCount 返回总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 触发日志列表 
     * @return LogInfo 触发日志列表
     */
    public TriggerLogResp [] getLogInfo() {
        return this.LogInfo;
    }

    /**
     * Set 触发日志列表
     * @param LogInfo 触发日志列表
     */
    public void setLogInfo(TriggerLogResp [] LogInfo) {
        this.LogInfo = LogInfo;
    }

    public DescribeApplicationTriggerLogPersonalResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationTriggerLogPersonalResp(DescribeApplicationTriggerLogPersonalResp source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.LogInfo != null) {
            this.LogInfo = new TriggerLogResp[source.LogInfo.length];
            for (int i = 0; i < source.LogInfo.length; i++) {
                this.LogInfo[i] = new TriggerLogResp(source.LogInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "LogInfo.", this.LogInfo);

    }
}

