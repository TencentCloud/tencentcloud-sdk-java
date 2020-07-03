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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerInvokeResult extends AbstractModel{

    /**
    * 请求TKE返回值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * 请求TKE返回信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReturnMsg")
    @Expose
    private String ReturnMsg;

    /**
     * Get 请求TKE返回值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReturnCode 请求TKE返回值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 请求TKE返回值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReturnCode 请求TKE返回值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 请求TKE返回信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReturnMsg 请求TKE返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReturnMsg() {
        return this.ReturnMsg;
    }

    /**
     * Set 请求TKE返回信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReturnMsg 请求TKE返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReturnMsg(String ReturnMsg) {
        this.ReturnMsg = ReturnMsg;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMsg", this.ReturnMsg);

    }
}

