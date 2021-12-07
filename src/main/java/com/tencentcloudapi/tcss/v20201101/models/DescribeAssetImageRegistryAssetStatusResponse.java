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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetImageRegistryAssetStatusResponse extends AbstractModel{

    /**
    * 更新进度状态,doing更新中，success更新成功，failed失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Err")
    @Expose
    private String Err;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 更新进度状态,doing更新中，success更新成功，failed失败 
     * @return Status 更新进度状态,doing更新中，success更新成功，failed失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 更新进度状态,doing更新中，success更新成功，failed失败
     * @param Status 更新进度状态,doing更新中，success更新成功，failed失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Err 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErr() {
        return this.Err;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Err 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErr(String Err) {
        this.Err = Err;
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

    public DescribeAssetImageRegistryAssetStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageRegistryAssetStatusResponse(DescribeAssetImageRegistryAssetStatusResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Err != null) {
            this.Err = new String(source.Err);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Err", this.Err);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

