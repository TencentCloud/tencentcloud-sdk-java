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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotQPS extends AbstractModel{

    /**
    * 资源id
    */
    @SerializedName("ResourceIds")
    @Expose
    private String ResourceIds;

    /**
    * 有效时间
    */
    @SerializedName("ValidTime")
    @Expose
    private String ValidTime;

    /**
    * 资源数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 资源所在地区
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 使用qps的最大值
    */
    @SerializedName("MaxBotQPS")
    @Expose
    private Long MaxBotQPS;

    /**
     * Get 资源id 
     * @return ResourceIds 资源id
     */
    public String getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源id
     * @param ResourceIds 资源id
     */
    public void setResourceIds(String ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 有效时间 
     * @return ValidTime 有效时间
     */
    public String getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set 有效时间
     * @param ValidTime 有效时间
     */
    public void setValidTime(String ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get 资源数量 
     * @return Count 资源数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 资源数量
     * @param Count 资源数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 资源所在地区 
     * @return Region 资源所在地区
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 资源所在地区
     * @param Region 资源所在地区
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 使用qps的最大值 
     * @return MaxBotQPS 使用qps的最大值
     */
    public Long getMaxBotQPS() {
        return this.MaxBotQPS;
    }

    /**
     * Set 使用qps的最大值
     * @param MaxBotQPS 使用qps的最大值
     */
    public void setMaxBotQPS(Long MaxBotQPS) {
        this.MaxBotQPS = MaxBotQPS;
    }

    public BotQPS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotQPS(BotQPS source) {
        if (source.ResourceIds != null) {
            this.ResourceIds = new String(source.ResourceIds);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new String(source.ValidTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.MaxBotQPS != null) {
            this.MaxBotQPS = new Long(source.MaxBotQPS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceIds", this.ResourceIds);
        this.setParamSimple(map, prefix + "ValidTime", this.ValidTime);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "MaxBotQPS", this.MaxBotQPS);

    }
}

