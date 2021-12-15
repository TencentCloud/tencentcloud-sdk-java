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

public class DescribeOrgNodeResponse extends AbstractModel{

    /**
    * 机构节点展示名称，长度限制：64个字符。 默认与机构名相同。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 机构节点最后修改时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifiedDate")
    @Expose
    private String LastModifiedDate;

    /**
    * 机构节点外部ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomizedOrgNodeId")
    @Expose
    private String CustomizedOrgNodeId;

    /**
    * 当前机构节点的父节点ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentOrgNodeId")
    @Expose
    private String ParentOrgNodeId;

    /**
    * 机构节点ID，是机构节点的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgNodeId")
    @Expose
    private String OrgNodeId;

    /**
    * 数据来源。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * 机构节点创建时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedDate")
    @Expose
    private String CreatedDate;

    /**
    * 当前机构节点下的子节点列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgNodeChildInfo")
    @Expose
    private OrgNodeChildInfo [] OrgNodeChildInfo;

    /**
    * 机构节点描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 机构节点展示名称，长度限制：64个字符。 默认与机构名相同。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName 机构节点展示名称，长度限制：64个字符。 默认与机构名相同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 机构节点展示名称，长度限制：64个字符。 默认与机构名相同。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName 机构节点展示名称，长度限制：64个字符。 默认与机构名相同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 机构节点最后修改时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifiedDate 机构节点最后修改时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifiedDate() {
        return this.LastModifiedDate;
    }

    /**
     * Set 机构节点最后修改时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifiedDate 机构节点最后修改时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifiedDate(String LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    /**
     * Get 机构节点外部ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomizedOrgNodeId 机构节点外部ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomizedOrgNodeId() {
        return this.CustomizedOrgNodeId;
    }

    /**
     * Set 机构节点外部ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomizedOrgNodeId 机构节点外部ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomizedOrgNodeId(String CustomizedOrgNodeId) {
        this.CustomizedOrgNodeId = CustomizedOrgNodeId;
    }

    /**
     * Get 当前机构节点的父节点ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentOrgNodeId 当前机构节点的父节点ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentOrgNodeId() {
        return this.ParentOrgNodeId;
    }

    /**
     * Set 当前机构节点的父节点ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentOrgNodeId 当前机构节点的父节点ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentOrgNodeId(String ParentOrgNodeId) {
        this.ParentOrgNodeId = ParentOrgNodeId;
    }

    /**
     * Get 机构节点ID，是机构节点的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgNodeId 机构节点ID，是机构节点的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgNodeId() {
        return this.OrgNodeId;
    }

    /**
     * Set 机构节点ID，是机构节点的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgNodeId 机构节点ID，是机构节点的全局唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgNodeId(String OrgNodeId) {
        this.OrgNodeId = OrgNodeId;
    }

    /**
     * Get 数据来源。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSource 数据来源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set 数据来源。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSource 数据来源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get 机构节点创建时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedDate 机构节点创建时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set 机构节点创建时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedDate 机构节点创建时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    /**
     * Get 当前机构节点下的子节点列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgNodeChildInfo 当前机构节点下的子节点列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OrgNodeChildInfo [] getOrgNodeChildInfo() {
        return this.OrgNodeChildInfo;
    }

    /**
     * Set 当前机构节点下的子节点列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgNodeChildInfo 当前机构节点下的子节点列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgNodeChildInfo(OrgNodeChildInfo [] OrgNodeChildInfo) {
        this.OrgNodeChildInfo = OrgNodeChildInfo;
    }

    /**
     * Get 机构节点描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 机构节点描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 机构节点描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 机构节点描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    public DescribeOrgNodeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrgNodeResponse(DescribeOrgNodeResponse source) {
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.LastModifiedDate != null) {
            this.LastModifiedDate = new String(source.LastModifiedDate);
        }
        if (source.CustomizedOrgNodeId != null) {
            this.CustomizedOrgNodeId = new String(source.CustomizedOrgNodeId);
        }
        if (source.ParentOrgNodeId != null) {
            this.ParentOrgNodeId = new String(source.ParentOrgNodeId);
        }
        if (source.OrgNodeId != null) {
            this.OrgNodeId = new String(source.OrgNodeId);
        }
        if (source.DataSource != null) {
            this.DataSource = new String(source.DataSource);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new String(source.CreatedDate);
        }
        if (source.OrgNodeChildInfo != null) {
            this.OrgNodeChildInfo = new OrgNodeChildInfo[source.OrgNodeChildInfo.length];
            for (int i = 0; i < source.OrgNodeChildInfo.length; i++) {
                this.OrgNodeChildInfo[i] = new OrgNodeChildInfo(source.OrgNodeChildInfo[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "LastModifiedDate", this.LastModifiedDate);
        this.setParamSimple(map, prefix + "CustomizedOrgNodeId", this.CustomizedOrgNodeId);
        this.setParamSimple(map, prefix + "ParentOrgNodeId", this.ParentOrgNodeId);
        this.setParamSimple(map, prefix + "OrgNodeId", this.OrgNodeId);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);
        this.setParamArrayObj(map, prefix + "OrgNodeChildInfo.", this.OrgNodeChildInfo);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

