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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFirmwareUpdateStatusResponse extends AbstractModel {

    /**
    * 升级任务源版本。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriVersion")
    @Expose
    private String OriVersion;

    /**
    * 升级任务目标版本。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstVersion")
    @Expose
    private String DstVersion;

    /**
    * 升级状态：

- 0：设备离线。
- 1：待处理。
- 2：消息下发成功。
- 3：下载中。
- 4：烧录中。
- 5：失败。
- 6：升级完成。
- 7：正在处理中。
- 8：等待用户确认。
- 20：下载完成。

    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 升级任务源版本。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriVersion 升级任务源版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriVersion() {
        return this.OriVersion;
    }

    /**
     * Set 升级任务源版本。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriVersion 升级任务源版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriVersion(String OriVersion) {
        this.OriVersion = OriVersion;
    }

    /**
     * Get 升级任务目标版本。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstVersion 升级任务目标版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstVersion() {
        return this.DstVersion;
    }

    /**
     * Set 升级任务目标版本。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstVersion 升级任务目标版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstVersion(String DstVersion) {
        this.DstVersion = DstVersion;
    }

    /**
     * Get 升级状态：

- 0：设备离线。
- 1：待处理。
- 2：消息下发成功。
- 3：下载中。
- 4：烧录中。
- 5：失败。
- 6：升级完成。
- 7：正在处理中。
- 8：等待用户确认。
- 20：下载完成。
 
     * @return Status 升级状态：

- 0：设备离线。
- 1：待处理。
- 2：消息下发成功。
- 3：下载中。
- 4：烧录中。
- 5：失败。
- 6：升级完成。
- 7：正在处理中。
- 8：等待用户确认。
- 20：下载完成。

     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 升级状态：

- 0：设备离线。
- 1：待处理。
- 2：消息下发成功。
- 3：下载中。
- 4：烧录中。
- 5：失败。
- 6：升级完成。
- 7：正在处理中。
- 8：等待用户确认。
- 20：下载完成。

     * @param Status 升级状态：

- 0：设备离线。
- 1：待处理。
- 2：消息下发成功。
- 3：下载中。
- 4：烧录中。
- 5：失败。
- 6：升级完成。
- 7：正在处理中。
- 8：等待用户确认。
- 20：下载完成。

     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Percent 进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Percent 进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
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

    public DescribeFirmwareUpdateStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFirmwareUpdateStatusResponse(DescribeFirmwareUpdateStatusResponse source) {
        if (source.OriVersion != null) {
            this.OriVersion = new String(source.OriVersion);
        }
        if (source.DstVersion != null) {
            this.DstVersion = new String(source.DstVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriVersion", this.OriVersion);
        this.setParamSimple(map, prefix + "DstVersion", this.DstVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

