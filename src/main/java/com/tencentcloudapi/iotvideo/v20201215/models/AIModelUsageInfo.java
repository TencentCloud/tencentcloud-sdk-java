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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIModelUsageInfo extends AbstractModel{

    /**
    * 开通时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 资源总量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 已使用资源数量
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
     * Get 开通时间 
     * @return CreateTime 开通时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 开通时间
     * @param CreateTime 开通时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 资源总量 
     * @return Total 资源总量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 资源总量
     * @param Total 资源总量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 已使用资源数量 
     * @return Used 已使用资源数量
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set 已使用资源数量
     * @param Used 已使用资源数量
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    public AIModelUsageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIModelUsageInfo(AIModelUsageInfo source) {
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Used", this.Used);

    }
}

