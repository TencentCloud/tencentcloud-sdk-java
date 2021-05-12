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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunCommandResponse extends AbstractModel{

    /**
    * 命令ID。
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * 执行活动ID。
    */
    @SerializedName("InvocationId")
    @Expose
    private String InvocationId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 命令ID。 
     * @return CommandId 命令ID。
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set 命令ID。
     * @param CommandId 命令ID。
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get 执行活动ID。 
     * @return InvocationId 执行活动ID。
     */
    public String getInvocationId() {
        return this.InvocationId;
    }

    /**
     * Set 执行活动ID。
     * @param InvocationId 执行活动ID。
     */
    public void setInvocationId(String InvocationId) {
        this.InvocationId = InvocationId;
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

    public RunCommandResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunCommandResponse(RunCommandResponse source) {
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.InvocationId != null) {
            this.InvocationId = new String(source.InvocationId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "InvocationId", this.InvocationId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

