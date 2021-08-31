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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanStateRequest extends AbstractModel{

    /**
    * 模块类型 当前提供 Malware 木马 , Vul 漏洞 , Baseline 基线
    */
    @SerializedName("ModuleType")
    @Expose
    private String ModuleType;

    /**
    * 过滤参数;
<li>StrategyId 基线策略ID ,仅ModuleType 为 Baseline 时需要<li/>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get 模块类型 当前提供 Malware 木马 , Vul 漏洞 , Baseline 基线 
     * @return ModuleType 模块类型 当前提供 Malware 木马 , Vul 漏洞 , Baseline 基线
     */
    public String getModuleType() {
        return this.ModuleType;
    }

    /**
     * Set 模块类型 当前提供 Malware 木马 , Vul 漏洞 , Baseline 基线
     * @param ModuleType 模块类型 当前提供 Malware 木马 , Vul 漏洞 , Baseline 基线
     */
    public void setModuleType(String ModuleType) {
        this.ModuleType = ModuleType;
    }

    /**
     * Get 过滤参数;
<li>StrategyId 基线策略ID ,仅ModuleType 为 Baseline 时需要<li/> 
     * @return Filters 过滤参数;
<li>StrategyId 基线策略ID ,仅ModuleType 为 Baseline 时需要<li/>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数;
<li>StrategyId 基线策略ID ,仅ModuleType 为 Baseline 时需要<li/>
     * @param Filters 过滤参数;
<li>StrategyId 基线策略ID ,仅ModuleType 为 Baseline 时需要<li/>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeScanStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanStateRequest(DescribeScanStateRequest source) {
        if (source.ModuleType != null) {
            this.ModuleType = new String(source.ModuleType);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleType", this.ModuleType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

