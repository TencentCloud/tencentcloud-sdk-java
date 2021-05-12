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
package com.tencentcloudapi.vms.v20200902.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendStatus extends AbstractModel{

    /**
    * 标识本次发送 ID，标识一次下发记录。
    */
    @SerializedName("CallId")
    @Expose
    private String CallId;

    /**
    * 用户的 session 内容，腾讯 server 回包中会原样返回。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
     * Get 标识本次发送 ID，标识一次下发记录。 
     * @return CallId 标识本次发送 ID，标识一次下发记录。
     */
    public String getCallId() {
        return this.CallId;
    }

    /**
     * Set 标识本次发送 ID，标识一次下发记录。
     * @param CallId 标识本次发送 ID，标识一次下发记录。
     */
    public void setCallId(String CallId) {
        this.CallId = CallId;
    }

    /**
     * Get 用户的 session 内容，腾讯 server 回包中会原样返回。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionContext 用户的 session 内容，腾讯 server 回包中会原样返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 用户的 session 内容，腾讯 server 回包中会原样返回。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionContext 用户的 session 内容，腾讯 server 回包中会原样返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public SendStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendStatus(SendStatus source) {
        if (source.CallId != null) {
            this.CallId = new String(source.CallId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallId", this.CallId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

