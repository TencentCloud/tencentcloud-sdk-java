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

public class GetServiceLinkedRoleDeletionStatusResponse extends AbstractModel{

    /**
    * 状态：NOT_STARTED，IN_PROGRESS，SUCCEEDED，FAILED
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 失败原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 服务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 服务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 状态：NOT_STARTED，IN_PROGRESS，SUCCEEDED，FAILED 
     * @return Status 状态：NOT_STARTED，IN_PROGRESS，SUCCEEDED，FAILED
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：NOT_STARTED，IN_PROGRESS，SUCCEEDED，FAILED
     * @param Status 状态：NOT_STARTED，IN_PROGRESS，SUCCEEDED，FAILED
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 失败原因 
     * @return Reason 失败原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 失败原因
     * @param Reason 失败原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 服务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceType 服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 服务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceType 服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 服务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName 服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName 服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

