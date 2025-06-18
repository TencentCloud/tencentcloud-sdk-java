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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAISearchTaskAsyncRequest extends AbstractModel {

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 自然语言查询
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 搜索结果总结的语言类型，支持的类型有：en-US、zh-CN、id-ID、th-TH
    */
    @SerializedName("SummaryLang")
    @Expose
    private String SummaryLang;

    /**
    * 通道ID
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 自然语言查询 
     * @return Query 自然语言查询
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 自然语言查询
     * @param Query 自然语言查询
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 搜索结果总结的语言类型，支持的类型有：en-US、zh-CN、id-ID、th-TH 
     * @return SummaryLang 搜索结果总结的语言类型，支持的类型有：en-US、zh-CN、id-ID、th-TH
     */
    public String getSummaryLang() {
        return this.SummaryLang;
    }

    /**
     * Set 搜索结果总结的语言类型，支持的类型有：en-US、zh-CN、id-ID、th-TH
     * @param SummaryLang 搜索结果总结的语言类型，支持的类型有：en-US、zh-CN、id-ID、th-TH
     */
    public void setSummaryLang(String SummaryLang) {
        this.SummaryLang = SummaryLang;
    }

    /**
     * Get 通道ID 
     * @return ChannelId 通道ID
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID
     * @param ChannelId 通道ID
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    public CreateAISearchTaskAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAISearchTaskAsyncRequest(CreateAISearchTaskAsyncRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.SummaryLang != null) {
            this.SummaryLang = new String(source.SummaryLang);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "SummaryLang", this.SummaryLang);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);

    }
}

