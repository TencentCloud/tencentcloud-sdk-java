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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadUpdateCertificateInstanceResponse extends AbstractModel {

    /**
    * 云资源更新任务ID， DeployRecordId为0表示任务进行中， 重复请求这个接口， 当返回DeployRecordId大于0则表示任务创建成功。 未创建成功则会抛出异常
    */
    @SerializedName("DeployRecordId")
    @Expose
    private Long DeployRecordId;

    /**
    * 更新任务创建状态；1表示创建成功； 0表示当前存在更新中的任务，未创建新的更新任务；返回值DeployRecordId为更新中的任务ID
    */
    @SerializedName("DeployStatus")
    @Expose
    private Long DeployStatus;

    /**
    * 更新异步创建任务进度详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateSyncProgress")
    @Expose
    private UpdateSyncProgress [] UpdateSyncProgress;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云资源更新任务ID， DeployRecordId为0表示任务进行中， 重复请求这个接口， 当返回DeployRecordId大于0则表示任务创建成功。 未创建成功则会抛出异常 
     * @return DeployRecordId 云资源更新任务ID， DeployRecordId为0表示任务进行中， 重复请求这个接口， 当返回DeployRecordId大于0则表示任务创建成功。 未创建成功则会抛出异常
     */
    public Long getDeployRecordId() {
        return this.DeployRecordId;
    }

    /**
     * Set 云资源更新任务ID， DeployRecordId为0表示任务进行中， 重复请求这个接口， 当返回DeployRecordId大于0则表示任务创建成功。 未创建成功则会抛出异常
     * @param DeployRecordId 云资源更新任务ID， DeployRecordId为0表示任务进行中， 重复请求这个接口， 当返回DeployRecordId大于0则表示任务创建成功。 未创建成功则会抛出异常
     */
    public void setDeployRecordId(Long DeployRecordId) {
        this.DeployRecordId = DeployRecordId;
    }

    /**
     * Get 更新任务创建状态；1表示创建成功； 0表示当前存在更新中的任务，未创建新的更新任务；返回值DeployRecordId为更新中的任务ID 
     * @return DeployStatus 更新任务创建状态；1表示创建成功； 0表示当前存在更新中的任务，未创建新的更新任务；返回值DeployRecordId为更新中的任务ID
     */
    public Long getDeployStatus() {
        return this.DeployStatus;
    }

    /**
     * Set 更新任务创建状态；1表示创建成功； 0表示当前存在更新中的任务，未创建新的更新任务；返回值DeployRecordId为更新中的任务ID
     * @param DeployStatus 更新任务创建状态；1表示创建成功； 0表示当前存在更新中的任务，未创建新的更新任务；返回值DeployRecordId为更新中的任务ID
     */
    public void setDeployStatus(Long DeployStatus) {
        this.DeployStatus = DeployStatus;
    }

    /**
     * Get 更新异步创建任务进度详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateSyncProgress 更新异步创建任务进度详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpdateSyncProgress [] getUpdateSyncProgress() {
        return this.UpdateSyncProgress;
    }

    /**
     * Set 更新异步创建任务进度详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateSyncProgress 更新异步创建任务进度详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateSyncProgress(UpdateSyncProgress [] UpdateSyncProgress) {
        this.UpdateSyncProgress = UpdateSyncProgress;
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

    public UploadUpdateCertificateInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadUpdateCertificateInstanceResponse(UploadUpdateCertificateInstanceResponse source) {
        if (source.DeployRecordId != null) {
            this.DeployRecordId = new Long(source.DeployRecordId);
        }
        if (source.DeployStatus != null) {
            this.DeployStatus = new Long(source.DeployStatus);
        }
        if (source.UpdateSyncProgress != null) {
            this.UpdateSyncProgress = new UpdateSyncProgress[source.UpdateSyncProgress.length];
            for (int i = 0; i < source.UpdateSyncProgress.length; i++) {
                this.UpdateSyncProgress[i] = new UpdateSyncProgress(source.UpdateSyncProgress[i]);
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
        this.setParamSimple(map, prefix + "DeployRecordId", this.DeployRecordId);
        this.setParamSimple(map, prefix + "DeployStatus", this.DeployStatus);
        this.setParamArrayObj(map, prefix + "UpdateSyncProgress.", this.UpdateSyncProgress);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

