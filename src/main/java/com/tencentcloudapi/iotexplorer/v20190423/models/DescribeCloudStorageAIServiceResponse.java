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

public class DescribeCloudStorageAIServiceResponse extends AbstractModel {

    /**
    * 云存 AI 套餐类型。可能取值：

- `1`：全时套餐
- `2`：事件套餐
- `3`：低功耗套餐
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 云存 AI 套餐生效状态。可能取值：

- `0`：未开通或已过期
- `1`：生效中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 云存 AI 套餐过期时间 UNIX 时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 用户 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 视频分析启用状态
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 视频分析配置参数
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 视频分析识别区域
    */
    @SerializedName("ROI")
    @Expose
    private String ROI;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云存 AI 套餐类型。可能取值：

- `1`：全时套餐
- `2`：事件套餐
- `3`：低功耗套餐
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 云存 AI 套餐类型。可能取值：

- `1`：全时套餐
- `2`：事件套餐
- `3`：低功耗套餐
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 云存 AI 套餐类型。可能取值：

- `1`：全时套餐
- `2`：事件套餐
- `3`：低功耗套餐
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 云存 AI 套餐类型。可能取值：

- `1`：全时套餐
- `2`：事件套餐
- `3`：低功耗套餐
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 云存 AI 套餐生效状态。可能取值：

- `0`：未开通或已过期
- `1`：生效中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 云存 AI 套餐生效状态。可能取值：

- `0`：未开通或已过期
- `1`：生效中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 云存 AI 套餐生效状态。可能取值：

- `0`：未开通或已过期
- `1`：生效中
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 云存 AI 套餐生效状态。可能取值：

- `0`：未开通或已过期
- `1`：生效中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 云存 AI 套餐过期时间 UNIX 时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 云存 AI 套餐过期时间 UNIX 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 云存 AI 套餐过期时间 UNIX 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 云存 AI 套餐过期时间 UNIX 时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 用户 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 视频分析启用状态 
     * @return Enabled 视频分析启用状态
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 视频分析启用状态
     * @param Enabled 视频分析启用状态
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 视频分析配置参数 
     * @return Config 视频分析配置参数
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 视频分析配置参数
     * @param Config 视频分析配置参数
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 视频分析识别区域 
     * @return ROI 视频分析识别区域
     */
    public String getROI() {
        return this.ROI;
    }

    /**
     * Set 视频分析识别区域
     * @param ROI 视频分析识别区域
     */
    public void setROI(String ROI) {
        this.ROI = ROI;
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

    public DescribeCloudStorageAIServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudStorageAIServiceResponse(DescribeCloudStorageAIServiceResponse source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.ROI != null) {
            this.ROI = new String(source.ROI);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "ROI", this.ROI);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

