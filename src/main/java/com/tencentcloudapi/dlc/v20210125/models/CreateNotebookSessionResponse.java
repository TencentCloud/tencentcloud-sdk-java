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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNotebookSessionResponse extends AbstractModel{

    /**
    * Session唯一标识
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Spark任务返回的AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkAppId")
    @Expose
    private String SparkAppId;

    /**
    * Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Session唯一标识 
     * @return SessionId Session唯一标识
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session唯一标识
     * @param SessionId Session唯一标识
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Spark任务返回的AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkAppId Spark任务返回的AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkAppId() {
        return this.SparkAppId;
    }

    /**
     * Set Spark任务返回的AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkAppId Spark任务返回的AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkAppId(String SparkAppId) {
        this.SparkAppId = SparkAppId;
    }

    /**
     * Get Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止） 
     * @return State Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
     * @param State Session状态，包含：not_started（未启动）、starting（已启动）、idle（等待输入）、busy(正在运行statement)、shutting_down（停止）、error（异常）、dead（已退出）、killed（被杀死）、success（正常停止）
     */
    public void setState(String State) {
        this.State = State;
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

    public CreateNotebookSessionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNotebookSessionResponse(CreateNotebookSessionResponse source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SparkAppId != null) {
            this.SparkAppId = new String(source.SparkAppId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SparkAppId", this.SparkAppId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

