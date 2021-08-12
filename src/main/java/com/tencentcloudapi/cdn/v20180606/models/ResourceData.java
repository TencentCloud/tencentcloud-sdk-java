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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceData extends AbstractModel{

    /**
    * 资源名称，根据查询条件不同分为以下几类：
单域名：指定单域名查询，表示该域名明细数据，当传入参数 detail 指定为 true 时，显示该域名（ detail 参数默认为 false ）
多域名：指定多个域名查询，表示多域名汇总明细数据，显示 multiDomains
项目 ID：指定项目查询时，表示该项目下的域名汇总明细数据，显示该项目 ID
all：账号维度明细数据，即账号下所有域名的汇总明细数据
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 资源对应的数据明细
    */
    @SerializedName("CdnData")
    @Expose
    private CdnData [] CdnData;

    /**
     * Get 资源名称，根据查询条件不同分为以下几类：
单域名：指定单域名查询，表示该域名明细数据，当传入参数 detail 指定为 true 时，显示该域名（ detail 参数默认为 false ）
多域名：指定多个域名查询，表示多域名汇总明细数据，显示 multiDomains
项目 ID：指定项目查询时，表示该项目下的域名汇总明细数据，显示该项目 ID
all：账号维度明细数据，即账号下所有域名的汇总明细数据 
     * @return Resource 资源名称，根据查询条件不同分为以下几类：
单域名：指定单域名查询，表示该域名明细数据，当传入参数 detail 指定为 true 时，显示该域名（ detail 参数默认为 false ）
多域名：指定多个域名查询，表示多域名汇总明细数据，显示 multiDomains
项目 ID：指定项目查询时，表示该项目下的域名汇总明细数据，显示该项目 ID
all：账号维度明细数据，即账号下所有域名的汇总明细数据
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 资源名称，根据查询条件不同分为以下几类：
单域名：指定单域名查询，表示该域名明细数据，当传入参数 detail 指定为 true 时，显示该域名（ detail 参数默认为 false ）
多域名：指定多个域名查询，表示多域名汇总明细数据，显示 multiDomains
项目 ID：指定项目查询时，表示该项目下的域名汇总明细数据，显示该项目 ID
all：账号维度明细数据，即账号下所有域名的汇总明细数据
     * @param Resource 资源名称，根据查询条件不同分为以下几类：
单域名：指定单域名查询，表示该域名明细数据，当传入参数 detail 指定为 true 时，显示该域名（ detail 参数默认为 false ）
多域名：指定多个域名查询，表示多域名汇总明细数据，显示 multiDomains
项目 ID：指定项目查询时，表示该项目下的域名汇总明细数据，显示该项目 ID
all：账号维度明细数据，即账号下所有域名的汇总明细数据
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 资源对应的数据明细 
     * @return CdnData 资源对应的数据明细
     */
    public CdnData [] getCdnData() {
        return this.CdnData;
    }

    /**
     * Set 资源对应的数据明细
     * @param CdnData 资源对应的数据明细
     */
    public void setCdnData(CdnData [] CdnData) {
        this.CdnData = CdnData;
    }

    public ResourceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceData(ResourceData source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.CdnData != null) {
            this.CdnData = new CdnData[source.CdnData.length];
            for (int i = 0; i < source.CdnData.length; i++) {
                this.CdnData[i] = new CdnData(source.CdnData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamArrayObj(map, prefix + "CdnData.", this.CdnData);

    }
}

