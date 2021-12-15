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

public class ListAccountInAccountGroupResponse extends AbstractModel{

    /**
    * 查询返回的相关账号列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountList")
    @Expose
    private AppAccountInfo [] AccountList;

    /**
    * 返回查询账号的总数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 账号组ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询返回的相关账号列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountList 查询返回的相关账号列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppAccountInfo [] getAccountList() {
        return this.AccountList;
    }

    /**
     * Set 查询返回的相关账号列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountList 查询返回的相关账号列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountList(AppAccountInfo [] AccountList) {
        this.AccountList = AccountList;
    }

    /**
     * Get 返回查询账号的总数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 返回查询账号的总数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 返回查询账号的总数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 返回查询账号的总数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 账号组ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupId 账号组ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 账号组ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupId 账号组ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
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

    public ListAccountInAccountGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAccountInAccountGroupResponse(ListAccountInAccountGroupResponse source) {
        if (source.AccountList != null) {
            this.AccountList = new AppAccountInfo[source.AccountList.length];
            for (int i = 0; i < source.AccountList.length; i++) {
                this.AccountList[i] = new AppAccountInfo(source.AccountList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AccountList.", this.AccountList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

