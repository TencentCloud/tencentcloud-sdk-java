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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeployGroupListResponse  extends AbstractModel{

    /**
    * 返回列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private DeployGroupInfo [] Items;

    /**
    * 符合条件的记录总数
    */
    @SerializedName("Total")
    @Expose
    private Integer Total;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取返回列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Items 返回列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeployGroupInfo [] getItems() {
        return this.Items;
    }

    /**
     * 设置返回列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 返回列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(DeployGroupInfo [] Items) {
        this.Items = Items;
    }

    /**
     * 获取符合条件的记录总数
     * @return Total 符合条件的记录总数
     */
    public Integer getTotal() {
        return this.Total;
    }

    /**
     * 设置符合条件的记录总数
     * @param Total 符合条件的记录总数
     */
    public void setTotal(Integer Total) {
        this.Total = Total;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

