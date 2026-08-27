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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAddressTemplateListResponse extends AbstractModel {

    /**
    * <p>模板总数</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>模板列表数据</p>
    */
    @SerializedName("Data")
    @Expose
    private TemplateListInfo [] Data;

    /**
    * <p>模板名称列表</p>
    */
    @SerializedName("NameList")
    @Expose
    private String [] NameList;

    /**
    * <p>Ip地址模板数量</p>
    */
    @SerializedName("IpTemplateCount")
    @Expose
    private Long IpTemplateCount;

    /**
    * <p>域名地址模板数量</p>
    */
    @SerializedName("DomainTemplateCount")
    @Expose
    private Long DomainTemplateCount;

    /**
    * <p>协议端口模板数量</p>
    */
    @SerializedName("PortTemplateCount")
    @Expose
    private Long PortTemplateCount;

    /**
    * <p>已使用的地址模板数</p>
    */
    @SerializedName("UsedTemplateCount")
    @Expose
    private Long UsedTemplateCount;

    /**
    * <p>地址模板配额数量</p>
    */
    @SerializedName("TemplateQuotaCount")
    @Expose
    private Long TemplateQuotaCount;

    /**
    * <p>容器服务地址模板数量</p>
    */
    @SerializedName("TkeTemplateCount")
    @Expose
    private Long TkeTemplateCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>模板总数</p> 
     * @return Total <p>模板总数</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>模板总数</p>
     * @param Total <p>模板总数</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>模板列表数据</p> 
     * @return Data <p>模板列表数据</p>
     */
    public TemplateListInfo [] getData() {
        return this.Data;
    }

    /**
     * Set <p>模板列表数据</p>
     * @param Data <p>模板列表数据</p>
     */
    public void setData(TemplateListInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get <p>模板名称列表</p> 
     * @return NameList <p>模板名称列表</p>
     */
    public String [] getNameList() {
        return this.NameList;
    }

    /**
     * Set <p>模板名称列表</p>
     * @param NameList <p>模板名称列表</p>
     */
    public void setNameList(String [] NameList) {
        this.NameList = NameList;
    }

    /**
     * Get <p>Ip地址模板数量</p> 
     * @return IpTemplateCount <p>Ip地址模板数量</p>
     */
    public Long getIpTemplateCount() {
        return this.IpTemplateCount;
    }

    /**
     * Set <p>Ip地址模板数量</p>
     * @param IpTemplateCount <p>Ip地址模板数量</p>
     */
    public void setIpTemplateCount(Long IpTemplateCount) {
        this.IpTemplateCount = IpTemplateCount;
    }

    /**
     * Get <p>域名地址模板数量</p> 
     * @return DomainTemplateCount <p>域名地址模板数量</p>
     */
    public Long getDomainTemplateCount() {
        return this.DomainTemplateCount;
    }

    /**
     * Set <p>域名地址模板数量</p>
     * @param DomainTemplateCount <p>域名地址模板数量</p>
     */
    public void setDomainTemplateCount(Long DomainTemplateCount) {
        this.DomainTemplateCount = DomainTemplateCount;
    }

    /**
     * Get <p>协议端口模板数量</p> 
     * @return PortTemplateCount <p>协议端口模板数量</p>
     */
    public Long getPortTemplateCount() {
        return this.PortTemplateCount;
    }

    /**
     * Set <p>协议端口模板数量</p>
     * @param PortTemplateCount <p>协议端口模板数量</p>
     */
    public void setPortTemplateCount(Long PortTemplateCount) {
        this.PortTemplateCount = PortTemplateCount;
    }

    /**
     * Get <p>已使用的地址模板数</p> 
     * @return UsedTemplateCount <p>已使用的地址模板数</p>
     */
    public Long getUsedTemplateCount() {
        return this.UsedTemplateCount;
    }

    /**
     * Set <p>已使用的地址模板数</p>
     * @param UsedTemplateCount <p>已使用的地址模板数</p>
     */
    public void setUsedTemplateCount(Long UsedTemplateCount) {
        this.UsedTemplateCount = UsedTemplateCount;
    }

    /**
     * Get <p>地址模板配额数量</p> 
     * @return TemplateQuotaCount <p>地址模板配额数量</p>
     */
    public Long getTemplateQuotaCount() {
        return this.TemplateQuotaCount;
    }

    /**
     * Set <p>地址模板配额数量</p>
     * @param TemplateQuotaCount <p>地址模板配额数量</p>
     */
    public void setTemplateQuotaCount(Long TemplateQuotaCount) {
        this.TemplateQuotaCount = TemplateQuotaCount;
    }

    /**
     * Get <p>容器服务地址模板数量</p> 
     * @return TkeTemplateCount <p>容器服务地址模板数量</p>
     */
    public Long getTkeTemplateCount() {
        return this.TkeTemplateCount;
    }

    /**
     * Set <p>容器服务地址模板数量</p>
     * @param TkeTemplateCount <p>容器服务地址模板数量</p>
     */
    public void setTkeTemplateCount(Long TkeTemplateCount) {
        this.TkeTemplateCount = TkeTemplateCount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
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
        if (source.UsedTemplateCount != null) {
            this.UsedTemplateCount = new Long(source.UsedTemplateCount);
        }
        if (source.TemplateQuotaCount != null) {
            this.TemplateQuotaCount = new Long(source.TemplateQuotaCount);
        }
        if (source.TkeTemplateCount != null) {
            this.TkeTemplateCount = new Long(source.TkeTemplateCount);
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
        this.setParamSimple(map, prefix + "UsedTemplateCount", this.UsedTemplateCount);
        this.setParamSimple(map, prefix + "TemplateQuotaCount", this.TemplateQuotaCount);
        this.setParamSimple(map, prefix + "TkeTemplateCount", this.TkeTemplateCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

