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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulFixedHostDetailResponse extends AbstractModel {

    /**
    * <p>漏洞名称</p>
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * <p>CVE编号</p>
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * <p>漏洞类型<br>枚举值：<br>LINUX：Linux软件漏洞<br>WINDOWS：Windows系统补丁漏洞<br>WEB_CMS：Web-CMS漏洞<br>APPLICATION：应用漏洞</p>
    */
    @SerializedName("VulCategory")
    @Expose
    private String VulCategory;

    /**
    * <p>修复完成时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
    */
    @SerializedName("FixTime")
    @Expose
    private String FixTime;

    /**
    * <p>主机实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>主机名称</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>主机公网IP</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>主机内网IP</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>关联组件&amp;路径详情列表</p>
    */
    @SerializedName("ComponentDetails")
    @Expose
    private ComponentDetailItem [] ComponentDetails;

    /**
    * <p>关联组件&amp;路径总数量</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>漏洞名称</p> 
     * @return VulName <p>漏洞名称</p>
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set <p>漏洞名称</p>
     * @param VulName <p>漏洞名称</p>
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get <p>CVE编号</p> 
     * @return CveId <p>CVE编号</p>
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set <p>CVE编号</p>
     * @param CveId <p>CVE编号</p>
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get <p>漏洞类型<br>枚举值：<br>LINUX：Linux软件漏洞<br>WINDOWS：Windows系统补丁漏洞<br>WEB_CMS：Web-CMS漏洞<br>APPLICATION：应用漏洞</p> 
     * @return VulCategory <p>漏洞类型<br>枚举值：<br>LINUX：Linux软件漏洞<br>WINDOWS：Windows系统补丁漏洞<br>WEB_CMS：Web-CMS漏洞<br>APPLICATION：应用漏洞</p>
     */
    public String getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set <p>漏洞类型<br>枚举值：<br>LINUX：Linux软件漏洞<br>WINDOWS：Windows系统补丁漏洞<br>WEB_CMS：Web-CMS漏洞<br>APPLICATION：应用漏洞</p>
     * @param VulCategory <p>漏洞类型<br>枚举值：<br>LINUX：Linux软件漏洞<br>WINDOWS：Windows系统补丁漏洞<br>WEB_CMS：Web-CMS漏洞<br>APPLICATION：应用漏洞</p>
     */
    public void setVulCategory(String VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get <p>修复完成时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p> 
     * @return FixTime <p>修复完成时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public String getFixTime() {
        return this.FixTime;
    }

    /**
     * Set <p>修复完成时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     * @param FixTime <p>修复完成时间<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）</p>
     */
    public void setFixTime(String FixTime) {
        this.FixTime = FixTime;
    }

    /**
     * Get <p>主机实例ID</p> 
     * @return InstanceId <p>主机实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>主机实例ID</p>
     * @param InstanceId <p>主机实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>主机名称</p> 
     * @return MachineName <p>主机名称</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>主机名称</p>
     * @param MachineName <p>主机名称</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>主机公网IP</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIp <p>主机公网IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>主机公网IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIp <p>主机公网IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>主机内网IP</p> 
     * @return PrivateIp <p>主机内网IP</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>主机内网IP</p>
     * @param PrivateIp <p>主机内网IP</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>关联组件&amp;路径详情列表</p> 
     * @return ComponentDetails <p>关联组件&amp;路径详情列表</p>
     */
    public ComponentDetailItem [] getComponentDetails() {
        return this.ComponentDetails;
    }

    /**
     * Set <p>关联组件&amp;路径详情列表</p>
     * @param ComponentDetails <p>关联组件&amp;路径详情列表</p>
     */
    public void setComponentDetails(ComponentDetailItem [] ComponentDetails) {
        this.ComponentDetails = ComponentDetails;
    }

    /**
     * Get <p>关联组件&amp;路径总数量</p> 
     * @return TotalCount <p>关联组件&amp;路径总数量</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>关联组件&amp;路径总数量</p>
     * @param TotalCount <p>关联组件&amp;路径总数量</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeVulFixedHostDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulFixedHostDetailResponse(DescribeVulFixedHostDetailResponse source) {
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new String(source.VulCategory);
        }
        if (source.FixTime != null) {
            this.FixTime = new String(source.FixTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.ComponentDetails != null) {
            this.ComponentDetails = new ComponentDetailItem[source.ComponentDetails.length];
            for (int i = 0; i < source.ComponentDetails.length; i++) {
                this.ComponentDetails[i] = new ComponentDetailItem(source.ComponentDetails[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);
        this.setParamSimple(map, prefix + "FixTime", this.FixTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamArrayObj(map, prefix + "ComponentDetails.", this.ComponentDetails);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

