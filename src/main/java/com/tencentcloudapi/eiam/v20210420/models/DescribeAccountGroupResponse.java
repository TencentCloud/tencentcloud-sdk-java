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

public class DescribeAccountGroupResponse extends AbstractModel{

    /**
    * 返回查询的总记录数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 应用ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 返回符合条件的数据列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupList")
    @Expose
    private AccountGroupInfo [] AccountGroupList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回查询的总记录数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 返回查询的总记录数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 返回查询的总记录数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 返回查询的总记录数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 应用ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 应用ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 返回符合条件的数据列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupList 返回符合条件的数据列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccountGroupInfo [] getAccountGroupList() {
        return this.AccountGroupList;
    }

    /**
     * Set 返回符合条件的数据列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupList 返回符合条件的数据列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupList(AccountGroupInfo [] AccountGroupList) {
        this.AccountGroupList = AccountGroupList;
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

    public DescribeAccountGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountGroupResponse(DescribeAccountGroupResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.AccountGroupList != null) {
            this.AccountGroupList = new AccountGroupInfo[source.AccountGroupList.length];
            for (int i = 0; i < source.AccountGroupList.length; i++) {
                this.AccountGroupList[i] = new AccountGroupInfo(source.AccountGroupList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamArrayObj(map, prefix + "AccountGroupList.", this.AccountGroupList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

