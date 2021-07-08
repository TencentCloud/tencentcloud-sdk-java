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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUnHandleEventTabListResponse extends AbstractModel{

    /**
    * 租户伪攻击链未处置事件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private UnHandleEvent Data;

    /**
    * 错误码，0成功 非0错误
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * 返回信息 success成功
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 租户伪攻击链未处置事件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 租户伪攻击链未处置事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UnHandleEvent getData() {
        return this.Data;
    }

    /**
     * Set 租户伪攻击链未处置事件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 租户伪攻击链未处置事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(UnHandleEvent Data) {
        this.Data = Data;
    }

    /**
     * Get 错误码，0成功 非0错误 
     * @return ReturnCode 错误码，0成功 非0错误
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 错误码，0成功 非0错误
     * @param ReturnCode 错误码，0成功 非0错误
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 返回信息 success成功 
     * @return ReturnMsg 返回信息 success成功
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set 返回信息 success成功
     * @param ReturnMsg 返回信息 success成功
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
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

    public DescribeUnHandleEventTabListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUnHandleEventTabListResponse(DescribeUnHandleEventTabListResponse source) {
        if (source.Data != null) {
            this.Data = new UnHandleEvent(source.Data);
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.ReturnMsg != null) {
            this.ReturnMsg = new String(source.ReturnMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

