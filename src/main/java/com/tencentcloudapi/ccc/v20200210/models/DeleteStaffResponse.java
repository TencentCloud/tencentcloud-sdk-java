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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteStaffResponse extends AbstractModel{

    /**
    * 无法删除的状态为在线的客服列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnlineStaffList")
    @Expose
    private String [] OnlineStaffList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 无法删除的状态为在线的客服列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnlineStaffList 无法删除的状态为在线的客服列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOnlineStaffList() {
        return this.OnlineStaffList;
    }

    /**
     * Set 无法删除的状态为在线的客服列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnlineStaffList 无法删除的状态为在线的客服列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnlineStaffList(String [] OnlineStaffList) {
        this.OnlineStaffList = OnlineStaffList;
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

    public DeleteStaffResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteStaffResponse(DeleteStaffResponse source) {
        if (source.OnlineStaffList != null) {
            this.OnlineStaffList = new String[source.OnlineStaffList.length];
            for (int i = 0; i < source.OnlineStaffList.length; i++) {
                this.OnlineStaffList[i] = new String(source.OnlineStaffList[i]);
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
        this.setParamArraySimple(map, prefix + "OnlineStaffList.", this.OnlineStaffList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

