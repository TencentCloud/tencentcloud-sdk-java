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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomersResponse extends AbstractModel{

    /**
    * 总记录条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 数据列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserList")
    @Expose
    private CustomerInfo [] UserList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总记录条数 
     * @return TotalCount 总记录条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总记录条数
     * @param TotalCount 总记录条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 数据列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserList 数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomerInfo [] getUserList() {
        return this.UserList;
    }

    /**
     * Set 数据列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserList 数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserList(CustomerInfo [] UserList) {
        this.UserList = UserList;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "UserList.", this.UserList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

