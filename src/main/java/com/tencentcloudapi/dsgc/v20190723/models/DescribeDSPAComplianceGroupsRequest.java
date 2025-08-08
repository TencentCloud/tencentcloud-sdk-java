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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPAComplianceGroupsRequest extends AbstractModel {

    /**
    * DSPA实例ID
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 合规组ID
    */
    @SerializedName("ComplianceGroupId")
    @Expose
    private Long ComplianceGroupId;

    /**
    * 合规组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 偏移量，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回结果集数量，默认值是10000，最大值为10000，根据该资源的个数限制条件，该资源的个数不会超过10000，所以如果不输入该字段，默认获取全量数据
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 合规组类型可选值：0 默认合规组, 1 系统合规组, 2 自定义合规组
    */
    @SerializedName("ComplianceGroupTypeList")
    @Expose
    private Long [] ComplianceGroupTypeList;

    /**
    * 是否仅显示已开启模板
    */
    @SerializedName("IsFilterCloseComplianceGroup")
    @Expose
    private Boolean IsFilterCloseComplianceGroup;

    /**
     * Get DSPA实例ID 
     * @return DspaId DSPA实例ID
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID
     * @param DspaId DSPA实例ID
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 合规组ID 
     * @return ComplianceGroupId 合规组ID
     */
    public Long getComplianceGroupId() {
        return this.ComplianceGroupId;
    }

    /**
     * Set 合规组ID
     * @param ComplianceGroupId 合规组ID
     */
    public void setComplianceGroupId(Long ComplianceGroupId) {
        this.ComplianceGroupId = ComplianceGroupId;
    }

    /**
     * Get 合规组名称 
     * @return Name 合规组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 合规组名称
     * @param Name 合规组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 偏移量，默认值为0 
     * @return Offset 偏移量，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值为0
     * @param Offset 偏移量，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回结果集数量，默认值是10000，最大值为10000，根据该资源的个数限制条件，该资源的个数不会超过10000，所以如果不输入该字段，默认获取全量数据 
     * @return Limit 返回结果集数量，默认值是10000，最大值为10000，根据该资源的个数限制条件，该资源的个数不会超过10000，所以如果不输入该字段，默认获取全量数据
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回结果集数量，默认值是10000，最大值为10000，根据该资源的个数限制条件，该资源的个数不会超过10000，所以如果不输入该字段，默认获取全量数据
     * @param Limit 返回结果集数量，默认值是10000，最大值为10000，根据该资源的个数限制条件，该资源的个数不会超过10000，所以如果不输入该字段，默认获取全量数据
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 合规组类型可选值：0 默认合规组, 1 系统合规组, 2 自定义合规组 
     * @return ComplianceGroupTypeList 合规组类型可选值：0 默认合规组, 1 系统合规组, 2 自定义合规组
     */
    public Long [] getComplianceGroupTypeList() {
        return this.ComplianceGroupTypeList;
    }

    /**
     * Set 合规组类型可选值：0 默认合规组, 1 系统合规组, 2 自定义合规组
     * @param ComplianceGroupTypeList 合规组类型可选值：0 默认合规组, 1 系统合规组, 2 自定义合规组
     */
    public void setComplianceGroupTypeList(Long [] ComplianceGroupTypeList) {
        this.ComplianceGroupTypeList = ComplianceGroupTypeList;
    }

    /**
     * Get 是否仅显示已开启模板 
     * @return IsFilterCloseComplianceGroup 是否仅显示已开启模板
     */
    public Boolean getIsFilterCloseComplianceGroup() {
        return this.IsFilterCloseComplianceGroup;
    }

    /**
     * Set 是否仅显示已开启模板
     * @param IsFilterCloseComplianceGroup 是否仅显示已开启模板
     */
    public void setIsFilterCloseComplianceGroup(Boolean IsFilterCloseComplianceGroup) {
        this.IsFilterCloseComplianceGroup = IsFilterCloseComplianceGroup;
    }

    public DescribeDSPAComplianceGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPAComplianceGroupsRequest(DescribeDSPAComplianceGroupsRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.ComplianceGroupId != null) {
            this.ComplianceGroupId = new Long(source.ComplianceGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ComplianceGroupTypeList != null) {
            this.ComplianceGroupTypeList = new Long[source.ComplianceGroupTypeList.length];
            for (int i = 0; i < source.ComplianceGroupTypeList.length; i++) {
                this.ComplianceGroupTypeList[i] = new Long(source.ComplianceGroupTypeList[i]);
            }
        }
        if (source.IsFilterCloseComplianceGroup != null) {
            this.IsFilterCloseComplianceGroup = new Boolean(source.IsFilterCloseComplianceGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "ComplianceGroupId", this.ComplianceGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ComplianceGroupTypeList.", this.ComplianceGroupTypeList);
        this.setParamSimple(map, prefix + "IsFilterCloseComplianceGroup", this.IsFilterCloseComplianceGroup);

    }
}

