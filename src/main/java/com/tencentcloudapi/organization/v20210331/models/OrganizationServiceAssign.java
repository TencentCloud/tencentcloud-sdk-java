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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrganizationServiceAssign extends AbstractModel {

    /**
    * 集团服务ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
    * 集团服务产品名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 是否支持委派。取值: 1-是  2-否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAssign")
    @Expose
    private Long IsAssign;

    /**
    * 集团服务描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 当前委派管理员数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberNum")
    @Expose
    private String MemberNum;

    /**
    * 帮助文档。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Document")
    @Expose
    private String Document;

    /**
    * 集团服务产品控制台路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsoleUrl")
    @Expose
    private String ConsoleUrl;

    /**
    * 是否接入使用状态。取值: 1-是 
 2-否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUsageStatus")
    @Expose
    private Long IsUsageStatus;

    /**
    * 委派管理员数量限制。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanAssignCount")
    @Expose
    private Long CanAssignCount;

    /**
    * 集团服务产品标识。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 是否支持集团服务授权。取值 1-是、2-否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceGrant")
    @Expose
    private Long ServiceGrant;

    /**
    * 集团服务授权启用状态。ServiceGrant值为1时该字段有效 ，取值：Enabled-开启  Disabled-关闭 
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrantStatus")
    @Expose
    private String GrantStatus;

    /**
    * 是否支持设置委派管理范围。取值: 1-是  2-否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSetManagementScope")
    @Expose
    private Long IsSetManagementScope;

    /**
     * Get 集团服务ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceId 集团服务ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 集团服务ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceId 集团服务ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 集团服务产品名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 集团服务产品名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 集团服务产品名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 集团服务产品名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 是否支持委派。取值: 1-是  2-否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAssign 是否支持委派。取值: 1-是  2-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAssign() {
        return this.IsAssign;
    }

    /**
     * Set 是否支持委派。取值: 1-是  2-否
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAssign 是否支持委派。取值: 1-是  2-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAssign(Long IsAssign) {
        this.IsAssign = IsAssign;
    }

    /**
     * Get 集团服务描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 集团服务描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 集团服务描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 集团服务描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 当前委派管理员数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberNum 当前委派管理员数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberNum() {
        return this.MemberNum;
    }

    /**
     * Set 当前委派管理员数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberNum 当前委派管理员数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberNum(String MemberNum) {
        this.MemberNum = MemberNum;
    }

    /**
     * Get 帮助文档。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Document 帮助文档。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocument() {
        return this.Document;
    }

    /**
     * Set 帮助文档。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Document 帮助文档。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocument(String Document) {
        this.Document = Document;
    }

    /**
     * Get 集团服务产品控制台路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsoleUrl 集团服务产品控制台路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsoleUrl() {
        return this.ConsoleUrl;
    }

    /**
     * Set 集团服务产品控制台路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsoleUrl 集团服务产品控制台路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsoleUrl(String ConsoleUrl) {
        this.ConsoleUrl = ConsoleUrl;
    }

    /**
     * Get 是否接入使用状态。取值: 1-是 
 2-否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUsageStatus 是否接入使用状态。取值: 1-是 
 2-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsUsageStatus() {
        return this.IsUsageStatus;
    }

    /**
     * Set 是否接入使用状态。取值: 1-是 
 2-否
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUsageStatus 是否接入使用状态。取值: 1-是 
 2-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUsageStatus(Long IsUsageStatus) {
        this.IsUsageStatus = IsUsageStatus;
    }

    /**
     * Get 委派管理员数量限制。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanAssignCount 委派管理员数量限制。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCanAssignCount() {
        return this.CanAssignCount;
    }

    /**
     * Set 委派管理员数量限制。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanAssignCount 委派管理员数量限制。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanAssignCount(Long CanAssignCount) {
        this.CanAssignCount = CanAssignCount;
    }

    /**
     * Get 集团服务产品标识。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Product 集团服务产品标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 集团服务产品标识。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Product 集团服务产品标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 是否支持集团服务授权。取值 1-是、2-否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceGrant 是否支持集团服务授权。取值 1-是、2-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServiceGrant() {
        return this.ServiceGrant;
    }

    /**
     * Set 是否支持集团服务授权。取值 1-是、2-否
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceGrant 是否支持集团服务授权。取值 1-是、2-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceGrant(Long ServiceGrant) {
        this.ServiceGrant = ServiceGrant;
    }

    /**
     * Get 集团服务授权启用状态。ServiceGrant值为1时该字段有效 ，取值：Enabled-开启  Disabled-关闭 
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrantStatus 集团服务授权启用状态。ServiceGrant值为1时该字段有效 ，取值：Enabled-开启  Disabled-关闭 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrantStatus() {
        return this.GrantStatus;
    }

    /**
     * Set 集团服务授权启用状态。ServiceGrant值为1时该字段有效 ，取值：Enabled-开启  Disabled-关闭 
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrantStatus 集团服务授权启用状态。ServiceGrant值为1时该字段有效 ，取值：Enabled-开启  Disabled-关闭 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrantStatus(String GrantStatus) {
        this.GrantStatus = GrantStatus;
    }

    /**
     * Get 是否支持设置委派管理范围。取值: 1-是  2-否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSetManagementScope 是否支持设置委派管理范围。取值: 1-是  2-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsSetManagementScope() {
        return this.IsSetManagementScope;
    }

    /**
     * Set 是否支持设置委派管理范围。取值: 1-是  2-否
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSetManagementScope 是否支持设置委派管理范围。取值: 1-是  2-否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSetManagementScope(Long IsSetManagementScope) {
        this.IsSetManagementScope = IsSetManagementScope;
    }

    public OrganizationServiceAssign() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationServiceAssign(OrganizationServiceAssign source) {
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.IsAssign != null) {
            this.IsAssign = new Long(source.IsAssign);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MemberNum != null) {
            this.MemberNum = new String(source.MemberNum);
        }
        if (source.Document != null) {
            this.Document = new String(source.Document);
        }
        if (source.ConsoleUrl != null) {
            this.ConsoleUrl = new String(source.ConsoleUrl);
        }
        if (source.IsUsageStatus != null) {
            this.IsUsageStatus = new Long(source.IsUsageStatus);
        }
        if (source.CanAssignCount != null) {
            this.CanAssignCount = new Long(source.CanAssignCount);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ServiceGrant != null) {
            this.ServiceGrant = new Long(source.ServiceGrant);
        }
        if (source.GrantStatus != null) {
            this.GrantStatus = new String(source.GrantStatus);
        }
        if (source.IsSetManagementScope != null) {
            this.IsSetManagementScope = new Long(source.IsSetManagementScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "IsAssign", this.IsAssign);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MemberNum", this.MemberNum);
        this.setParamSimple(map, prefix + "Document", this.Document);
        this.setParamSimple(map, prefix + "ConsoleUrl", this.ConsoleUrl);
        this.setParamSimple(map, prefix + "IsUsageStatus", this.IsUsageStatus);
        this.setParamSimple(map, prefix + "CanAssignCount", this.CanAssignCount);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ServiceGrant", this.ServiceGrant);
        this.setParamSimple(map, prefix + "GrantStatus", this.GrantStatus);
        this.setParamSimple(map, prefix + "IsSetManagementScope", this.IsSetManagementScope);

    }
}

