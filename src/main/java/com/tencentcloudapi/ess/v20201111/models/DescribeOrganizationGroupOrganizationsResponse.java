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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationGroupOrganizationsResponse extends AbstractModel{

    /**
    * 查询到的符合条件的成员企业总数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 已授权待激活的企业数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JoinedTotal")
    @Expose
    private Long JoinedTotal;

    /**
    * 已加入的企业数量(废弃,请使用ActivatedTotal)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivedTotal")
    @Expose
    private Long ActivedTotal;

    /**
    * 如果入参Export为 true 时使用，表示导出Excel的url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExportUrl")
    @Expose
    private String ExportUrl;

    /**
    * 成员企业信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private GroupOrganization [] List;

    /**
    * 已加入的企业数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivatedTotal")
    @Expose
    private Long ActivatedTotal;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询到的符合条件的成员企业总数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 查询到的符合条件的成员企业总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 查询到的符合条件的成员企业总数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 查询到的符合条件的成员企业总数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 已授权待激活的企业数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JoinedTotal 已授权待激活的企业数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJoinedTotal() {
        return this.JoinedTotal;
    }

    /**
     * Set 已授权待激活的企业数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param JoinedTotal 已授权待激活的企业数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJoinedTotal(Long JoinedTotal) {
        this.JoinedTotal = JoinedTotal;
    }

    /**
     * Get 已加入的企业数量(废弃,请使用ActivatedTotal)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivedTotal 已加入的企业数量(废弃,请使用ActivatedTotal)
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getActivedTotal() {
        return this.ActivedTotal;
    }

    /**
     * Set 已加入的企业数量(废弃,请使用ActivatedTotal)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivedTotal 已加入的企业数量(废弃,请使用ActivatedTotal)
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setActivedTotal(Long ActivedTotal) {
        this.ActivedTotal = ActivedTotal;
    }

    /**
     * Get 如果入参Export为 true 时使用，表示导出Excel的url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExportUrl 如果入参Export为 true 时使用，表示导出Excel的url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExportUrl() {
        return this.ExportUrl;
    }

    /**
     * Set 如果入参Export为 true 时使用，表示导出Excel的url
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExportUrl 如果入参Export为 true 时使用，表示导出Excel的url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExportUrl(String ExportUrl) {
        this.ExportUrl = ExportUrl;
    }

    /**
     * Get 成员企业信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 成员企业信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GroupOrganization [] getList() {
        return this.List;
    }

    /**
     * Set 成员企业信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 成员企业信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(GroupOrganization [] List) {
        this.List = List;
    }

    /**
     * Get 已加入的企业数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivatedTotal 已加入的企业数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActivatedTotal() {
        return this.ActivatedTotal;
    }

    /**
     * Set 已加入的企业数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivatedTotal 已加入的企业数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivatedTotal(Long ActivatedTotal) {
        this.ActivatedTotal = ActivatedTotal;
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

    public DescribeOrganizationGroupOrganizationsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationGroupOrganizationsResponse(DescribeOrganizationGroupOrganizationsResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.JoinedTotal != null) {
            this.JoinedTotal = new Long(source.JoinedTotal);
        }
        if (source.ActivedTotal != null) {
            this.ActivedTotal = new Long(source.ActivedTotal);
        }
        if (source.ExportUrl != null) {
            this.ExportUrl = new String(source.ExportUrl);
        }
        if (source.List != null) {
            this.List = new GroupOrganization[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new GroupOrganization(source.List[i]);
            }
        }
        if (source.ActivatedTotal != null) {
            this.ActivatedTotal = new Long(source.ActivatedTotal);
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
        this.setParamSimple(map, prefix + "JoinedTotal", this.JoinedTotal);
        this.setParamSimple(map, prefix + "ActivedTotal", this.ActivedTotal);
        this.setParamSimple(map, prefix + "ExportUrl", this.ExportUrl);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "ActivatedTotal", this.ActivatedTotal);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

