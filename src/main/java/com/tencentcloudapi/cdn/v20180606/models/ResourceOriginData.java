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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceOriginData extends AbstractModel {

    /**
    * 资源名称，根据查询条件不同分为以下几类：
具体域名：表示该域名明细数据
multiDomains：表示多域名汇总明细数据
项目 ID：指定项目查询时，显示为项目 ID
all：账号维度明细数据
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 回源数据详情
    */
    @SerializedName("OriginData")
    @Expose
    private CdnData [] OriginData;

    /**
     * Get 资源名称，根据查询条件不同分为以下几类：
具体域名：表示该域名明细数据
multiDomains：表示多域名汇总明细数据
项目 ID：指定项目查询时，显示为项目 ID
all：账号维度明细数据 
     * @return Resource 资源名称，根据查询条件不同分为以下几类：
具体域名：表示该域名明细数据
multiDomains：表示多域名汇总明细数据
项目 ID：指定项目查询时，显示为项目 ID
all：账号维度明细数据
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 资源名称，根据查询条件不同分为以下几类：
具体域名：表示该域名明细数据
multiDomains：表示多域名汇总明细数据
项目 ID：指定项目查询时，显示为项目 ID
all：账号维度明细数据
     * @param Resource 资源名称，根据查询条件不同分为以下几类：
具体域名：表示该域名明细数据
multiDomains：表示多域名汇总明细数据
项目 ID：指定项目查询时，显示为项目 ID
all：账号维度明细数据
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 回源数据详情 
     * @return OriginData 回源数据详情
     */
    public CdnData [] getOriginData() {
        return this.OriginData;
    }

    /**
     * Set 回源数据详情
     * @param OriginData 回源数据详情
     */
    public void setOriginData(CdnData [] OriginData) {
        this.OriginData = OriginData;
    }

    public ResourceOriginData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceOriginData(ResourceOriginData source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.OriginData != null) {
            this.OriginData = new CdnData[source.OriginData.length];
            for (int i = 0; i < source.OriginData.length; i++) {
                this.OriginData[i] = new CdnData(source.OriginData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamArrayObj(map, prefix + "OriginData.", this.OriginData);

    }
}

