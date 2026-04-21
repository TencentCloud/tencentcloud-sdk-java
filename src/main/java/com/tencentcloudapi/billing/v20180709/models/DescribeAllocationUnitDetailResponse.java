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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllocationUnitDetailResponse extends AbstractModel {

    /**
    * <p>分账单元ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>分账单元所属UIN</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>分账单元名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>分账单元父节点ID</p>
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * <p>源组织名称</p>
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * <p>源组织ID</p>
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * <p>备注说明</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>分账单元标识</p>
    */
    @SerializedName("TreeNodeUniqKey")
    @Expose
    private String TreeNodeUniqKey;

    /**
    * <p>若分账单元设置归集规则，返回归集规则ID，若无分账规则，则不返回</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>分账单元ID</p> 
     * @return Id <p>分账单元ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>分账单元ID</p>
     * @param Id <p>分账单元ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>分账单元所属UIN</p> 
     * @return Uin <p>分账单元所属UIN</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>分账单元所属UIN</p>
     * @param Uin <p>分账单元所属UIN</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>分账单元名称</p> 
     * @return Name <p>分账单元名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分账单元名称</p>
     * @param Name <p>分账单元名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>分账单元父节点ID</p> 
     * @return ParentId <p>分账单元父节点ID</p>
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set <p>分账单元父节点ID</p>
     * @param ParentId <p>分账单元父节点ID</p>
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get <p>源组织名称</p> 
     * @return SourceName <p>源组织名称</p>
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set <p>源组织名称</p>
     * @param SourceName <p>源组织名称</p>
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get <p>源组织ID</p> 
     * @return SourceId <p>源组织ID</p>
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set <p>源组织ID</p>
     * @param SourceId <p>源组织ID</p>
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get <p>备注说明</p> 
     * @return Remark <p>备注说明</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注说明</p>
     * @param Remark <p>备注说明</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>分账单元标识</p> 
     * @return TreeNodeUniqKey <p>分账单元标识</p>
     */
    public String getTreeNodeUniqKey() {
        return this.TreeNodeUniqKey;
    }

    /**
     * Set <p>分账单元标识</p>
     * @param TreeNodeUniqKey <p>分账单元标识</p>
     */
    public void setTreeNodeUniqKey(String TreeNodeUniqKey) {
        this.TreeNodeUniqKey = TreeNodeUniqKey;
    }

    /**
     * Get <p>若分账单元设置归集规则，返回归集规则ID，若无分账规则，则不返回</p> 
     * @return RuleId <p>若分账单元设置归集规则，返回归集规则ID，若无分账规则，则不返回</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>若分账单元设置归集规则，返回归集规则ID，若无分账规则，则不返回</p>
     * @param RuleId <p>若分账单元设置归集规则，返回归集规则ID，若无分账规则，则不返回</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
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

    public DescribeAllocationUnitDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationUnitDetailResponse(DescribeAllocationUnitDetailResponse source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TreeNodeUniqKey != null) {
            this.TreeNodeUniqKey = new String(source.TreeNodeUniqKey);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "TreeNodeUniqKey", this.TreeNodeUniqKey);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

