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

public class CreateHostVulExportJobRequest extends AbstractModel {

    /**
    * <p>导出的action</p><p>枚举值：</p><ul><li>LinuxHostVulRiskList： linux漏洞风险列表</li><li>WebCmsHostVulRiskList： WebCms漏洞风险列表</li><li>AppHostVulRiskList： App漏洞风险列表</li><li>EmergencyHostVulRiskList： 紧急漏洞风险列表</li><li>KBRiskList： Windows kb风险列表</li><li>RelateHostList： 关联主机列表</li><li>WhiteList： 漏洞白名单</li></ul>
    */
    @SerializedName("BusinessAction")
    @Expose
    private String BusinessAction;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>KbID：KB风险关联主机情况下需要额外加入KB风险ID<br>VulID：漏洞风险关联主机情况下需要额外加入vul风险ID</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get <p>导出的action</p><p>枚举值：</p><ul><li>LinuxHostVulRiskList： linux漏洞风险列表</li><li>WebCmsHostVulRiskList： WebCms漏洞风险列表</li><li>AppHostVulRiskList： App漏洞风险列表</li><li>EmergencyHostVulRiskList： 紧急漏洞风险列表</li><li>KBRiskList： Windows kb风险列表</li><li>RelateHostList： 关联主机列表</li><li>WhiteList： 漏洞白名单</li></ul> 
     * @return BusinessAction <p>导出的action</p><p>枚举值：</p><ul><li>LinuxHostVulRiskList： linux漏洞风险列表</li><li>WebCmsHostVulRiskList： WebCms漏洞风险列表</li><li>AppHostVulRiskList： App漏洞风险列表</li><li>EmergencyHostVulRiskList： 紧急漏洞风险列表</li><li>KBRiskList： Windows kb风险列表</li><li>RelateHostList： 关联主机列表</li><li>WhiteList： 漏洞白名单</li></ul>
     */
    public String getBusinessAction() {
        return this.BusinessAction;
    }

    /**
     * Set <p>导出的action</p><p>枚举值：</p><ul><li>LinuxHostVulRiskList： linux漏洞风险列表</li><li>WebCmsHostVulRiskList： WebCms漏洞风险列表</li><li>AppHostVulRiskList： App漏洞风险列表</li><li>EmergencyHostVulRiskList： 紧急漏洞风险列表</li><li>KBRiskList： Windows kb风险列表</li><li>RelateHostList： 关联主机列表</li><li>WhiteList： 漏洞白名单</li></ul>
     * @param BusinessAction <p>导出的action</p><p>枚举值：</p><ul><li>LinuxHostVulRiskList： linux漏洞风险列表</li><li>WebCmsHostVulRiskList： WebCms漏洞风险列表</li><li>AppHostVulRiskList： App漏洞风险列表</li><li>EmergencyHostVulRiskList： 紧急漏洞风险列表</li><li>KBRiskList： Windows kb风险列表</li><li>RelateHostList： 关联主机列表</li><li>WhiteList： 漏洞白名单</li></ul>
     */
    public void setBusinessAction(String BusinessAction) {
        this.BusinessAction = BusinessAction;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>KbID：KB风险关联主机情况下需要额外加入KB风险ID<br>VulID：漏洞风险关联主机情况下需要额外加入vul风险ID</p> 
     * @return Filters <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>KbID：KB风险关联主机情况下需要额外加入KB风险ID<br>VulID：漏洞风险关联主机情况下需要额外加入vul风险ID</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>KbID：KB风险关联主机情况下需要额外加入KB风险ID<br>VulID：漏洞风险关联主机情况下需要额外加入vul风险ID</p>
     * @param Filters <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>KbID：KB风险关联主机情况下需要额外加入KB风险ID<br>VulID：漏洞风险关联主机情况下需要额外加入vul风险ID</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public CreateHostVulExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHostVulExportJobRequest(CreateHostVulExportJobRequest source) {
        if (source.BusinessAction != null) {
            this.BusinessAction = new String(source.BusinessAction);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
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
        this.setParamSimple(map, prefix + "BusinessAction", this.BusinessAction);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

