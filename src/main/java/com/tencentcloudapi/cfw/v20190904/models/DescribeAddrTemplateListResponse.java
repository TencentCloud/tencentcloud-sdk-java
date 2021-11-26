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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAddrTemplateListResponse extends AbstractModel{

    /**
    * 模版总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 模版列表数据
    */
    @SerializedName("Data")
    @Expose
    private TemplateListInfo [] Data;

    /**
    * 模版名称列表
    */
    @SerializedName("NameList")
    @Expose
    private String [] NameList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 模版总数 
     * @return Total 模版总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 模版总数
     * @param Total 模版总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 模版列表数据 
     * @return Data 模版列表数据
     */
    public TemplateListInfo [] getData() {
        return this.Data;
    }

    /**
     * Set 模版列表数据
     * @param Data 模版列表数据
     */
    public void setData(TemplateListInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get 模版名称列表 
     * @return NameList 模版名称列表
     */
    public String [] getNameList() {
        return this.NameList;
    }

    /**
     * Set 模版名称列表
     * @param NameList 模版名称列表
     */
    public void setNameList(String [] NameList) {
        this.NameList = NameList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAddrTemplateListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAddrTemplateListResponse(DescribeAddrTemplateListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new TemplateListInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new TemplateListInfo(source.Data[i]);
            }
        }
        if (source.NameList != null) {
            this.NameList = new String[source.NameList.length];
            for (int i = 0; i < source.NameList.length; i++) {
                this.NameList[i] = new String(source.NameList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArraySimple(map, prefix + "NameList.", this.NameList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

