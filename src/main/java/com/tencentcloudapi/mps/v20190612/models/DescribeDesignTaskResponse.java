/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDesignTaskResponse extends AbstractModel {

    /**
    * <p>错误码，成功时返回0</p>
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * <p>错误信息，成功时返回success</p>
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>fail： 失败</li><li>processing： 处理中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>音色id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>错误码，成功时返回0</p> 
     * @return ErrorCode <p>错误码，成功时返回0</p>
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>错误码，成功时返回0</p>
     * @param ErrorCode <p>错误码，成功时返回0</p>
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>错误信息，成功时返回success</p> 
     * @return Msg <p>错误信息，成功时返回success</p>
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set <p>错误信息，成功时返回success</p>
     * @param Msg <p>错误信息，成功时返回success</p>
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>fail： 失败</li><li>processing： 处理中</li></ul> 
     * @return Status <p>任务状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>fail： 失败</li><li>processing： 处理中</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>fail： 失败</li><li>processing： 处理中</li></ul>
     * @param Status <p>任务状态</p><p>枚举值：</p><ul><li>success： 成功</li><li>fail： 失败</li><li>processing： 处理中</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>音色id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceId <p>音色id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>音色id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceId <p>音色id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtInfo <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtInfo <p>扩展信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
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

    public DescribeDesignTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDesignTaskResponse(DescribeDesignTaskResponse source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

