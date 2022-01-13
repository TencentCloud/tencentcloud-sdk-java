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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrgResourcesAuthorizationResponse extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 授权机构ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgNodeId")
    @Expose
    private String OrgNodeId;

    /**
    * 机构名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgNodeName")
    @Expose
    private String OrgNodeName;

    /**
    * 机构目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgNodePath")
    @Expose
    private String OrgNodePath;

    /**
    * 资源列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizationOrgResourceList")
    @Expose
    private AuthorizationResourceEntityInfo [] AuthorizationOrgResourceList;

    /**
    * 资源数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 授权机构ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgNodeId 授权机构ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgNodeId() {
        return this.OrgNodeId;
    }

    /**
     * Set 授权机构ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgNodeId 授权机构ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgNodeId(String OrgNodeId) {
        this.OrgNodeId = OrgNodeId;
    }

    /**
     * Get 机构名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgNodeName 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgNodeName() {
        return this.OrgNodeName;
    }

    /**
     * Set 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgNodeName 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgNodeName(String OrgNodeName) {
        this.OrgNodeName = OrgNodeName;
    }

    /**
     * Get 机构目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgNodePath 机构目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgNodePath() {
        return this.OrgNodePath;
    }

    /**
     * Set 机构目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgNodePath 机构目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgNodePath(String OrgNodePath) {
        this.OrgNodePath = OrgNodePath;
    }

    /**
     * Get 资源列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizationOrgResourceList 资源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuthorizationResourceEntityInfo [] getAuthorizationOrgResourceList() {
        return this.AuthorizationOrgResourceList;
    }

    /**
     * Set 资源列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizationOrgResourceList 资源列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorizationOrgResourceList(AuthorizationResourceEntityInfo [] AuthorizationOrgResourceList) {
        this.AuthorizationOrgResourceList = AuthorizationOrgResourceList;
    }

    /**
     * Get 资源数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 资源数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 资源数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 资源数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeOrgResourcesAuthorizationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrgResourcesAuthorizationResponse(DescribeOrgResourcesAuthorizationResponse source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.OrgNodeId != null) {
            this.OrgNodeId = new String(source.OrgNodeId);
        }
        if (source.OrgNodeName != null) {
            this.OrgNodeName = new String(source.OrgNodeName);
        }
        if (source.OrgNodePath != null) {
            this.OrgNodePath = new String(source.OrgNodePath);
        }
        if (source.AuthorizationOrgResourceList != null) {
            this.AuthorizationOrgResourceList = new AuthorizationResourceEntityInfo[source.AuthorizationOrgResourceList.length];
            for (int i = 0; i < source.AuthorizationOrgResourceList.length; i++) {
                this.AuthorizationOrgResourceList[i] = new AuthorizationResourceEntityInfo(source.AuthorizationOrgResourceList[i]);
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
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "OrgNodeId", this.OrgNodeId);
        this.setParamSimple(map, prefix + "OrgNodeName", this.OrgNodeName);
        this.setParamSimple(map, prefix + "OrgNodePath", this.OrgNodePath);
        this.setParamArrayObj(map, prefix + "AuthorizationOrgResourceList.", this.AuthorizationOrgResourceList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

