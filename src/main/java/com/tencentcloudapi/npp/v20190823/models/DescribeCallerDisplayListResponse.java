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
package com.tencentcloudapi.npp.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCallerDisplayListResponse extends AbstractModel{

    /**
    * appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 主叫显号号码集合，codeList[0...*] 结构体数组，如果业务是主被叫互显，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeList")
    @Expose
    private CallBackPhoneCode [] CodeList;

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
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主叫显号号码集合，codeList[0...*] 结构体数组，如果业务是主被叫互显，该字段为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeList 主叫显号号码集合，codeList[0...*] 结构体数组，如果业务是主被叫互显，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CallBackPhoneCode [] getCodeList() {
        return this.CodeList;
    }

    /**
     * Set 主叫显号号码集合，codeList[0...*] 结构体数组，如果业务是主被叫互显，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeList 主叫显号号码集合，codeList[0...*] 结构体数组，如果业务是主被叫互显，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeList(CallBackPhoneCode [] CodeList) {
        this.CodeList = CodeList;
    }

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

    public DescribeCallerDisplayListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCallerDisplayListResponse(DescribeCallerDisplayListResponse source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.CodeList != null) {
            this.CodeList = new CallBackPhoneCode[source.CodeList.length];
            for (int i = 0; i < source.CodeList.length; i++) {
                this.CodeList[i] = new CallBackPhoneCode(source.CodeList[i]);
            }
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
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
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArrayObj(map, prefix + "CodeList.", this.CodeList);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

