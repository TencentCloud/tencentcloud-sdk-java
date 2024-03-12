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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBindDBListResponse extends AbstractModel {

    /**
    * 绑定的DB列表（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindDBList")
    @Expose
    private String [] BindDBList;

    /**
    * 绑定信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindList")
    @Expose
    private DBInstanceInfo [] BindList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 绑定的DB列表（已废弃）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindDBList 绑定的DB列表（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBindDBList() {
        return this.BindDBList;
    }

    /**
     * Set 绑定的DB列表（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindDBList 绑定的DB列表（已废弃）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindDBList(String [] BindDBList) {
        this.BindDBList = BindDBList;
    }

    /**
     * Get 绑定信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindList 绑定信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DBInstanceInfo [] getBindList() {
        return this.BindList;
    }

    /**
     * Set 绑定信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindList 绑定信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindList(DBInstanceInfo [] BindList) {
        this.BindList = BindList;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBindDBListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBindDBListResponse(DescribeBindDBListResponse source) {
        if (source.BindDBList != null) {
            this.BindDBList = new String[source.BindDBList.length];
            for (int i = 0; i < source.BindDBList.length; i++) {
                this.BindDBList[i] = new String(source.BindDBList[i]);
            }
        }
        if (source.BindList != null) {
            this.BindList = new DBInstanceInfo[source.BindList.length];
            for (int i = 0; i < source.BindList.length; i++) {
                this.BindList[i] = new DBInstanceInfo(source.BindList[i]);
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
        this.setParamArraySimple(map, prefix + "BindDBList.", this.BindDBList);
        this.setParamArrayObj(map, prefix + "BindList.", this.BindList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

