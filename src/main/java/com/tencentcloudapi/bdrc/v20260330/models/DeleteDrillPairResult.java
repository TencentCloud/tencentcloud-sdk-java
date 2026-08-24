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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDrillPairResult extends AbstractModel {

    /**
    * 演练对ID。
    */
    @SerializedName("DrillPairId")
    @Expose
    private String DrillPairId;

    /**
    * 删除结果码。成功为 Success，失败为对应错误码（如 InternalError.ComponentError）。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 删除结果描述信息，成功时为空串。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 演练对ID。 
     * @return DrillPairId 演练对ID。
     */
    public String getDrillPairId() {
        return this.DrillPairId;
    }

    /**
     * Set 演练对ID。
     * @param DrillPairId 演练对ID。
     */
    public void setDrillPairId(String DrillPairId) {
        this.DrillPairId = DrillPairId;
    }

    /**
     * Get 删除结果码。成功为 Success，失败为对应错误码（如 InternalError.ComponentError）。 
     * @return Code 删除结果码。成功为 Success，失败为对应错误码（如 InternalError.ComponentError）。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 删除结果码。成功为 Success，失败为对应错误码（如 InternalError.ComponentError）。
     * @param Code 删除结果码。成功为 Success，失败为对应错误码（如 InternalError.ComponentError）。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 删除结果描述信息，成功时为空串。 
     * @return Message 删除结果描述信息，成功时为空串。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 删除结果描述信息，成功时为空串。
     * @param Message 删除结果描述信息，成功时为空串。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public DeleteDrillPairResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDrillPairResult(DeleteDrillPairResult source) {
        if (source.DrillPairId != null) {
            this.DrillPairId = new String(source.DrillPairId);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrillPairId", this.DrillPairId);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

