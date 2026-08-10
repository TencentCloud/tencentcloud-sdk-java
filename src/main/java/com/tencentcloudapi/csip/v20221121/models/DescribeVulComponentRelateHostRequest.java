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

public class DescribeVulComponentRelateHostRequest extends AbstractModel {

    /**
    * <p>漏洞 ID（vul_vuls.id）</p>
    */
    @SerializedName("VulID")
    @Expose
    private Long VulID;

    /**
    * <p>组件名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>Keyword：关键字模糊搜索（对主机名/IP/InstanceID 模糊匹配）</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
     * Get <p>组件名称</p> 
     * @return Name <p>组件名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>组件名称</p>
     * @param Name <p>组件名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>Keyword：关键字模糊搜索（对主机名/IP/InstanceID 模糊匹配）</p> 
     * @return Filters <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>Keyword：关键字模糊搜索（对主机名/IP/InstanceID 模糊匹配）</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>Keyword：关键字模糊搜索（对主机名/IP/InstanceID 模糊匹配）</p>
     * @param Filters <p>筛选条件数组，多条件之间为 AND 关系<br>支持的 Filter.Name：<br>Keyword：关键字模糊搜索（对主机名/IP/InstanceID 模糊匹配）</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p> 
     * @return Limit <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
     * @param Limit <p>每页返回数量<br>取值范围：[1, 100]<br>默认值：10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p> 
     * @return Offset <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
     * @param Offset <p>分页偏移量<br>取值范围：[0, +∞)<br>默认值：0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeVulComponentRelateHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulComponentRelateHostRequest(DescribeVulComponentRelateHostRequest source) {
        if (source.VulID != null) {
            this.VulID = new Long(source.VulID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulID", this.VulID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

