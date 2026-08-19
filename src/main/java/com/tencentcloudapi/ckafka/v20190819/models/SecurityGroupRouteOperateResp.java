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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupRouteOperateResp extends AbstractModel {

    /**
    * 操作返回的code，0为正常，非0为错误
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReturnCode")
    @Expose
    private String ReturnCode;

    /**
    * 操作返回的信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReturnMessage")
    @Expose
    private String ReturnMessage;

    /**
     * Get 操作返回的code，0为正常，非0为错误
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReturnCode 操作返回的code，0为正常，非0为错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 操作返回的code，0为正常，非0为错误
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReturnCode 操作返回的code，0为正常，非0为错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 操作返回的信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReturnMessage 操作返回的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReturnMessage() {
        return this.ReturnMessage;
    }

    /**
     * Set 操作返回的信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReturnMessage 操作返回的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReturnMessage(String ReturnMessage) {
        this.ReturnMessage = ReturnMessage;
    }

    public SecurityGroupRouteOperateResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupRouteOperateResp(SecurityGroupRouteOperateResp source) {
        if (source.ReturnCode != null) {
            this.ReturnCode = new String(source.ReturnCode);
        }
        if (source.ReturnMessage != null) {
            this.ReturnMessage = new String(source.ReturnMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMessage", this.ReturnMessage);

    }
}

