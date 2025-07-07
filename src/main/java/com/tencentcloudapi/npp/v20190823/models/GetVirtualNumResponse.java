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
package com.tencentcloudapi.npp.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetVirtualNumResponse extends AbstractModel {

    /**
    * 错误码
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 绑定 ID，该 ID 全局唯一
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindId")
    @Expose
    private String BindId;

    /**
    * 中间号还剩引用计数，如果计数为 0 会解绑
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefNum")
    @Expose
    private String RefNum;

    /**
    * 中间号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualNum")
    @Expose
    private String VirtualNum;

    /**
    * 错误原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 错误码 
     * @return ErrorCode 错误码
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 错误码
     * @param ErrorCode 错误码
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 绑定 ID，该 ID 全局唯一
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindId 绑定 ID，该 ID 全局唯一
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBindId() {
        return this.BindId;
    }

    /**
     * Set 绑定 ID，该 ID 全局唯一
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindId 绑定 ID，该 ID 全局唯一
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindId(String BindId) {
        this.BindId = BindId;
    }

    /**
     * Get 中间号还剩引用计数，如果计数为 0 会解绑
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefNum 中间号还剩引用计数，如果计数为 0 会解绑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefNum() {
        return this.RefNum;
    }

    /**
     * Set 中间号还剩引用计数，如果计数为 0 会解绑
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefNum 中间号还剩引用计数，如果计数为 0 会解绑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefNum(String RefNum) {
        this.RefNum = RefNum;
    }

    /**
     * Get 中间号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualNum 中间号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirtualNum() {
        return this.VirtualNum;
    }

    /**
     * Set 中间号
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualNum 中间号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualNum(String VirtualNum) {
        this.VirtualNum = VirtualNum;
    }

    /**
     * Get 错误原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Msg 错误原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 错误原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msg 错误原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
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

    public GetVirtualNumResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetVirtualNumResponse(GetVirtualNumResponse source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.BindId != null) {
            this.BindId = new String(source.BindId);
        }
        if (source.RefNum != null) {
            this.RefNum = new String(source.RefNum);
        }
        if (source.VirtualNum != null) {
            this.VirtualNum = new String(source.VirtualNum);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
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
        this.setParamSimple(map, prefix + "BindId", this.BindId);
        this.setParamSimple(map, prefix + "RefNum", this.RefNum);
        this.setParamSimple(map, prefix + "VirtualNum", this.VirtualNum);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

