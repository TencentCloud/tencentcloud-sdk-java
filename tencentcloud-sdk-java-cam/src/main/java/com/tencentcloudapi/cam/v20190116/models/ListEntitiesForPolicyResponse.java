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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListEntitiesForPolicyResponse extends AbstractModel{

    /**
    * 实体总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 实体列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private AttachEntityOfPolicy [] List;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实体总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalNum 实体总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 实体总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalNum 实体总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 实体列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 实体列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AttachEntityOfPolicy [] getList() {
        return this.List;
    }

    /**
     * Set 实体列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 实体列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(AttachEntityOfPolicy [] List) {
        this.List = List;
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
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

