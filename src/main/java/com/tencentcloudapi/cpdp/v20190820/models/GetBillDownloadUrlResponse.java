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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetBillDownloadUrlResponse extends AbstractModel{

    /**
    * 业务系统返回码
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * 业务系统返回消息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMessage")
    @Expose
    private String ErrMessage;

    /**
    * 账单文件下载地址响应对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private BillDownloadUrlResult Result;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 业务系统返回码 
     * @return ErrCode 业务系统返回码
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 业务系统返回码
     * @param ErrCode 业务系统返回码
     */
    public void setErrCode(String ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 业务系统返回消息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrMessage 业务系统返回消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrMessage() {
        return this.ErrMessage;
    }

    /**
     * Set 业务系统返回消息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrMessage 业务系统返回消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrMessage(String ErrMessage) {
        this.ErrMessage = ErrMessage;
    }

    /**
     * Get 账单文件下载地址响应对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 账单文件下载地址响应对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillDownloadUrlResult getResult() {
        return this.Result;
    }

    /**
     * Set 账单文件下载地址响应对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 账单文件下载地址响应对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(BillDownloadUrlResult Result) {
        this.Result = Result;
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

    public GetBillDownloadUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetBillDownloadUrlResponse(GetBillDownloadUrlResponse source) {
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.ErrMessage != null) {
            this.ErrMessage = new String(source.ErrMessage);
        }
        if (source.Result != null) {
            this.Result = new BillDownloadUrlResult(source.Result);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMessage", this.ErrMessage);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

