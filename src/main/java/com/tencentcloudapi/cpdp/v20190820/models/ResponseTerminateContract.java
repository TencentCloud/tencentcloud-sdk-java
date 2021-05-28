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

public class ResponseTerminateContract extends AbstractModel{

    /**
    * 第三方渠道错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnCode")
    @Expose
    private String ExternalReturnCode;

    /**
    * 第三方渠道错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnMessage")
    @Expose
    private String ExternalReturnMessage;

    /**
    * 第三方渠道返回的原始数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalReturnData")
    @Expose
    private String ExternalReturnData;

    /**
     * Get 第三方渠道错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnCode 第三方渠道错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnCode() {
        return this.ExternalReturnCode;
    }

    /**
     * Set 第三方渠道错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnCode 第三方渠道错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnCode(String ExternalReturnCode) {
        this.ExternalReturnCode = ExternalReturnCode;
    }

    /**
     * Get 第三方渠道错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnMessage 第三方渠道错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnMessage() {
        return this.ExternalReturnMessage;
    }

    /**
     * Set 第三方渠道错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnMessage 第三方渠道错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnMessage(String ExternalReturnMessage) {
        this.ExternalReturnMessage = ExternalReturnMessage;
    }

    /**
     * Get 第三方渠道返回的原始数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalReturnData 第三方渠道返回的原始数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalReturnData() {
        return this.ExternalReturnData;
    }

    /**
     * Set 第三方渠道返回的原始数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalReturnData 第三方渠道返回的原始数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalReturnData(String ExternalReturnData) {
        this.ExternalReturnData = ExternalReturnData;
    }

    public ResponseTerminateContract() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResponseTerminateContract(ResponseTerminateContract source) {
        if (source.ExternalReturnCode != null) {
            this.ExternalReturnCode = new String(source.ExternalReturnCode);
        }
        if (source.ExternalReturnMessage != null) {
            this.ExternalReturnMessage = new String(source.ExternalReturnMessage);
        }
        if (source.ExternalReturnData != null) {
            this.ExternalReturnData = new String(source.ExternalReturnData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExternalReturnCode", this.ExternalReturnCode);
        this.setParamSimple(map, prefix + "ExternalReturnMessage", this.ExternalReturnMessage);
        this.setParamSimple(map, prefix + "ExternalReturnData", this.ExternalReturnData);

    }
}

