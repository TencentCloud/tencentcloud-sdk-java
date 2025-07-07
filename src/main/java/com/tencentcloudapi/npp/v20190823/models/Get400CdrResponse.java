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

public class Get400CdrResponse extends AbstractModel {

    /**
    * 错误码
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 错误原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 偏移
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 话单列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cdr")
    @Expose
    private VirturalNumCdr [] Cdr;

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
     * Get 偏移
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Offset 偏移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset 偏移
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 话单列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cdr 话单列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VirturalNumCdr [] getCdr() {
        return this.Cdr;
    }

    /**
     * Set 话单列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cdr 话单列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdr(VirturalNumCdr [] Cdr) {
        this.Cdr = Cdr;
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

    public Get400CdrResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Get400CdrResponse(Get400CdrResponse source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.Cdr != null) {
            this.Cdr = new VirturalNumCdr[source.Cdr.length];
            for (int i = 0; i < source.Cdr.length; i++) {
                this.Cdr[i] = new VirturalNumCdr(source.Cdr[i]);
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
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Cdr.", this.Cdr);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

