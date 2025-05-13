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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllocationUnitDetailResponse extends AbstractModel {

    /**
    * 分账单元ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 分账单元所属UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 分账单元名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分账单元父节点ID
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 源组织名称
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 源组织ID
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * 备注说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 分账单元标识
    */
    @SerializedName("TreeNodeUniqKey")
    @Expose
    private String TreeNodeUniqKey;

    /**
    * 若分账单元设置归集规则，返回归集规则ID，若无分账规则，则不返回
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
     * Get 分账单元ID 
     * @return Id 分账单元ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 分账单元ID
     * @param Id 分账单元ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 分账单元所属UIN 
     * @return Uin 分账单元所属UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 分账单元所属UIN
     * @param Uin 分账单元所属UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 分账单元名称 
     * @return Name 分账单元名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分账单元名称
     * @param Name 分账单元名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分账单元父节点ID 
     * @return ParentId 分账单元父节点ID
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 分账单元父节点ID
     * @param ParentId 分账单元父节点ID
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 源组织名称 
     * @return SourceName 源组织名称
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 源组织名称
     * @param SourceName 源组织名称
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 源组织ID 
     * @return SourceId 源组织ID
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 源组织ID
     * @param SourceId 源组织ID
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 备注说明 
     * @return Remark 备注说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注说明
     * @param Remark 备注说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 分账单元标识 
     * @return TreeNodeUniqKey 分账单元标识
     */
    public String getTreeNodeUniqKey() {
        return this.TreeNodeUniqKey;
    }

    /**
     * Set 分账单元标识
     * @param TreeNodeUniqKey 分账单元标识
     */
    public void setTreeNodeUniqKey(String TreeNodeUniqKey) {
        this.TreeNodeUniqKey = TreeNodeUniqKey;
    }

    /**
     * Get 若分账单元设置归集规则，返回归集规则ID，若无分账规则，则不返回 
     * @return RuleId 若分账单元设置归集规则，返回归集规则ID，若无分账规则，则不返回
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 若分账单元设置归集规则，返回归集规则ID，若无分账规则，则不返回
     * @param RuleId 若分账单元设置归集规则，返回归集规则ID，若无分账规则，则不返回
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

