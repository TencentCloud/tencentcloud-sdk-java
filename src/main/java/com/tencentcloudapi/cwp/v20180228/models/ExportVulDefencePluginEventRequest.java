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

public class ExportVulDefencePluginEventRequest extends AbstractModel{

    /**
    * Keywords: ip或者主机名模糊匹配，Quuid，Exception、Status精确匹配
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 导出字段，默认全导出
    */
    @SerializedName("Where")
    @Expose
    private String [] Where;

    /**
     * Get Keywords: ip或者主机名模糊匹配，Quuid，Exception、Status精确匹配 
     * @return Filters Keywords: ip或者主机名模糊匹配，Quuid，Exception、Status精确匹配
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Keywords: ip或者主机名模糊匹配，Quuid，Exception、Status精确匹配
     * @param Filters Keywords: ip或者主机名模糊匹配，Quuid，Exception、Status精确匹配
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 导出字段，默认全导出 
     * @return Where 导出字段，默认全导出
     */
    public String [] getWhere() {
        return this.Where;
    }

    /**
     * Set 导出字段，默认全导出
     * @param Where 导出字段，默认全导出
     */
    public void setWhere(String [] Where) {
        this.Where = Where;
    }

    public ExportVulDefencePluginEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportVulDefencePluginEventRequest(ExportVulDefencePluginEventRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Where != null) {
            this.Where = new String[source.Where.length];
            for (int i = 0; i < source.Where.length; i++) {
                this.Where[i] = new String(source.Where[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "Where.", this.Where);

    }
}

