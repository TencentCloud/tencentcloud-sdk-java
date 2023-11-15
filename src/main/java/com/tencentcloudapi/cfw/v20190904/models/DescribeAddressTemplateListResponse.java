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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAddressTemplateListResponse extends AbstractModel {

    /**
    * 模板总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 模板列表数据
    */
    @SerializedName("Data")
    @Expose
    private TemplateListInfo [] Data;

    /**
    * 模板名称列表
    */
    @SerializedName("NameList")
    @Expose
    private String [] NameList;

    /**
    * Ip地址模板数量
    */
    @SerializedName("IpTemplateCount")
    @Expose
    private Long IpTemplateCount;

    /**
    * 域名地址模板数量
    */
    @SerializedName("DomainTemplateCount")
    @Expose
    private Long DomainTemplateCount;

    /**
    * 协议端口模板数量
    */
    @SerializedName("PortTemplateCount")
    @Expose
    private Long PortTemplateCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 模板总数 
     * @return Total 模板总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 模板总数
     * @param Total 模板总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 模板列表数据 
     * @return Data 模板列表数据
     */
    public TemplateListInfo [] getData() {
        return this.Data;
    }

    /**
     * Set 模板列表数据
     * @param Data 模板列表数据
     */
    public void setData(TemplateListInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get 模板名称列表 
     * @return NameList 模板名称列表
     */
    public String [] getNameList() {
        return this.NameList;
    }

    /**
     * Set 模板名称列表
     * @param NameList 模板名称列表
     */
    public void setNameList(String [] NameList) {
        this.NameList = NameList;
    }

    /**
     * Get Ip地址模板数量 
     * @return IpTemplateCount Ip地址模板数量
     */
    public Long getIpTemplateCount() {
        return this.IpTemplateCount;
    }

    /**
     * Set Ip地址模板数量
     * @param IpTemplateCount Ip地址模板数量
     */
    public void setIpTemplateCount(Long IpTemplateCount) {
        this.IpTemplateCount = IpTemplateCount;
    }

    /**
     * Get 域名地址模板数量 
     * @return DomainTemplateCount 域名地址模板数量
     */
    public Long getDomainTemplateCount() {
        return this.DomainTemplateCount;
    }

    /**
     * Set 域名地址模板数量
     * @param DomainTemplateCount 域名地址模板数量
     */
    public void setDomainTemplateCount(Long DomainTemplateCount) {
        this.DomainTemplateCount = DomainTemplateCount;
    }

    /**
     * Get 协议端口模板数量 
     * @return PortTemplateCount 协议端口模板数量
     */
    public Long getPortTemplateCount() {
        return this.PortTemplateCount;
    }

    /**
     * Set 协议端口模板数量
     * @param PortTemplateCount 协议端口模板数量
     */
    public void setPortTemplateCount(Long PortTemplateCount) {
        this.PortTemplateCount = PortTemplateCount;
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

    public DescribeAddressTemplateListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAddressTemplateListResponse(DescribeAddressTemplateListResponse source) {
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
        if (source.IpTemplateCount != null) {
            this.IpTemplateCount = new Long(source.IpTemplateCount);
        }
        if (source.DomainTemplateCount != null) {
            this.DomainTemplateCount = new Long(source.DomainTemplateCount);
        }
        if (source.PortTemplateCount != null) {
            this.PortTemplateCount = new Long(source.PortTemplateCount);
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
        this.setParamSimple(map, prefix + "IpTemplateCount", this.IpTemplateCount);
        this.setParamSimple(map, prefix + "DomainTemplateCount", this.DomainTemplateCount);
        this.setParamSimple(map, prefix + "PortTemplateCount", this.PortTemplateCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

