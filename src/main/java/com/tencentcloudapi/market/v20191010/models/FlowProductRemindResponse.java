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
package com.tencentcloudapi.market.v20191010.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowProductRemindResponse extends AbstractModel{

    /**
    * 是否成功
    */
    @SerializedName("Success")
    @Expose
    private String Success;

    /**
    * 流水号
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 消息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否成功 
     * @return Success 是否成功
     */
    public String getSuccess() {
        return this.Success;
    }

    /**
     * Set 是否成功
     * @param Success 是否成功
     */
    public void setSuccess(String Success) {
        this.Success = Success;
    }

    /**
     * Get 流水号 
     * @return FlowId 流水号
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流水号
     * @param FlowId 流水号
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 消息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Info 消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 消息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Info 消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfo(String Info) {
        this.Info = Info;
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

    public FlowProductRemindResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowProductRemindResponse(FlowProductRemindResponse source) {
        if (source.Success != null) {
            this.Success = new String(source.Success);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Info != null) {
            this.Info = new String(source.Info);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

