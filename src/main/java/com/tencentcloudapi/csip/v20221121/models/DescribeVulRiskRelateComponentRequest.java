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

public class DescribeVulRiskRelateComponentRequest extends AbstractModel {

    /**
    * <p>漏洞 ID（vul_vuls.id）</p>
    */
    @SerializedName("VulID")
    @Expose
    private Long VulID;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>Keyword：关键字模糊搜索（对组件名称模糊匹配）</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get <p>漏洞 ID（vul_vuls.id）</p> 
     * @return VulID <p>漏洞 ID（vul_vuls.id）</p>
     */
    public Long getVulID() {
        return this.VulID;
    }

    /**
     * Set <p>漏洞 ID（vul_vuls.id）</p>
     * @param VulID <p>漏洞 ID（vul_vuls.id）</p>
     */
    public void setVulID(Long VulID) {
        this.VulID = VulID;
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
     * Get <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>Keyword：关键字模糊搜索（对组件名称模糊匹配）</p> 
     * @return Filters <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>Keyword：关键字模糊搜索（对组件名称模糊匹配）</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>Keyword：关键字模糊搜索（对组件名称模糊匹配）</p>
     * @param Filters <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>Keyword：关键字模糊搜索（对组件名称模糊匹配）</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeVulRiskRelateComponentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulRiskRelateComponentRequest(DescribeVulRiskRelateComponentRequest source) {
        if (source.VulID != null) {
            this.VulID = new Long(source.VulID);
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
        this.setParamSimple(map, prefix + "VulID", this.VulID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

