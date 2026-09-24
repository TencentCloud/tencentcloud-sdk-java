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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountAccountGroupsData extends AbstractModel {

    /**
    * <p>组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupId")
    @Expose
    private Long AccountGroupId;

    /**
    * <p>组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupName")
    @Expose
    private String AccountGroupName;

    /**
    * <p>主组标识(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterFlag")
    @Expose
    private Long MasterFlag;

    /**
    * <p>组路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupNamePaths")
    @Expose
    private String [] AccountGroupNamePaths;

    /**
    * <p>组路径Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupPathIds")
    @Expose
    private Long [] AccountGroupPathIds;

    /**
     * Get <p>组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupId <p>组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set <p>组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupId <p>组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupId(Long AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get <p>组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupName <p>组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountGroupName() {
        return this.AccountGroupName;
    }

    /**
     * Set <p>组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupName <p>组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupName(String AccountGroupName) {
        this.AccountGroupName = AccountGroupName;
    }

    /**
     * Get <p>主组标识(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterFlag <p>主组标识(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMasterFlag() {
        return this.MasterFlag;
    }

    /**
     * Set <p>主组标识(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterFlag <p>主组标识(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterFlag(Long MasterFlag) {
        this.MasterFlag = MasterFlag;
    }

    /**
     * Get <p>组路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupNamePaths <p>组路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAccountGroupNamePaths() {
        return this.AccountGroupNamePaths;
    }

    /**
     * Set <p>组路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupNamePaths <p>组路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupNamePaths(String [] AccountGroupNamePaths) {
        this.AccountGroupNamePaths = AccountGroupNamePaths;
    }

    /**
     * Get <p>组路径Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupPathIds <p>组路径Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getAccountGroupPathIds() {
        return this.AccountGroupPathIds;
    }

    /**
     * Set <p>组路径Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupPathIds <p>组路径Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupPathIds(Long [] AccountGroupPathIds) {
        this.AccountGroupPathIds = AccountGroupPathIds;
    }

    public DescribeAccountAccountGroupsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountAccountGroupsData(DescribeAccountAccountGroupsData source) {
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new Long(source.AccountGroupId);
        }
        if (source.AccountGroupName != null) {
            this.AccountGroupName = new String(source.AccountGroupName);
        }
        if (source.MasterFlag != null) {
            this.MasterFlag = new Long(source.MasterFlag);
        }
        if (source.AccountGroupNamePaths != null) {
            this.AccountGroupNamePaths = new String[source.AccountGroupNamePaths.length];
            for (int i = 0; i < source.AccountGroupNamePaths.length; i++) {
                this.AccountGroupNamePaths[i] = new String(source.AccountGroupNamePaths[i]);
            }
        }
        if (source.AccountGroupPathIds != null) {
            this.AccountGroupPathIds = new Long[source.AccountGroupPathIds.length];
            for (int i = 0; i < source.AccountGroupPathIds.length; i++) {
                this.AccountGroupPathIds[i] = new Long(source.AccountGroupPathIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "AccountGroupName", this.AccountGroupName);
        this.setParamSimple(map, prefix + "MasterFlag", this.MasterFlag);
        this.setParamArraySimple(map, prefix + "AccountGroupNamePaths.", this.AccountGroupNamePaths);
        this.setParamArraySimple(map, prefix + "AccountGroupPathIds.", this.AccountGroupPathIds);

    }
}

