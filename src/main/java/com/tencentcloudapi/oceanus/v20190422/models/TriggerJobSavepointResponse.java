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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerJobSavepointResponse extends AbstractModel{

    /**
    * 是否成功
    */
    @SerializedName("SavepointTrigger")
    @Expose
    private Boolean SavepointTrigger;

    /**
    * 错误消息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 快照路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinalSavepointPath")
    @Expose
    private String FinalSavepointPath;

    /**
    * 快照 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SavepointId")
    @Expose
    private String SavepointId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否成功 
     * @return SavepointTrigger 是否成功
     */
    public Boolean getSavepointTrigger() {
        return this.SavepointTrigger;
    }

    /**
     * Set 是否成功
     * @param SavepointTrigger 是否成功
     */
    public void setSavepointTrigger(Boolean SavepointTrigger) {
        this.SavepointTrigger = SavepointTrigger;
    }

    /**
     * Get 错误消息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMsg 错误消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 错误消息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMsg 错误消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 快照路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinalSavepointPath 快照路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinalSavepointPath() {
        return this.FinalSavepointPath;
    }

    /**
     * Set 快照路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinalSavepointPath 快照路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinalSavepointPath(String FinalSavepointPath) {
        this.FinalSavepointPath = FinalSavepointPath;
    }

    /**
     * Get 快照 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SavepointId 快照 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSavepointId() {
        return this.SavepointId;
    }

    /**
     * Set 快照 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SavepointId 快照 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSavepointId(String SavepointId) {
        this.SavepointId = SavepointId;
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

    public TriggerJobSavepointResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerJobSavepointResponse(TriggerJobSavepointResponse source) {
        if (source.SavepointTrigger != null) {
            this.SavepointTrigger = new Boolean(source.SavepointTrigger);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.FinalSavepointPath != null) {
            this.FinalSavepointPath = new String(source.FinalSavepointPath);
        }
        if (source.SavepointId != null) {
            this.SavepointId = new String(source.SavepointId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SavepointTrigger", this.SavepointTrigger);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "FinalSavepointPath", this.FinalSavepointPath);
        this.setParamSimple(map, prefix + "SavepointId", this.SavepointId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

