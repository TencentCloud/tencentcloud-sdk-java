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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReadProductJsonRequest extends AbstractModel {

    /**
    * <p>工作空间ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>沙盒runtimeId</p>
    */
    @SerializedName("RuntimeId")
    @Expose
    private String RuntimeId;

    /**
    * <p>沙盒sessionId</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get <p>工作空间ID</p> 
     * @return WorkspaceId <p>工作空间ID</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID</p>
     * @param WorkspaceId <p>工作空间ID</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>沙盒runtimeId</p> 
     * @return RuntimeId <p>沙盒runtimeId</p>
     */
    public String getRuntimeId() {
        return this.RuntimeId;
    }

    /**
     * Set <p>沙盒runtimeId</p>
     * @param RuntimeId <p>沙盒runtimeId</p>
     */
    public void setRuntimeId(String RuntimeId) {
        this.RuntimeId = RuntimeId;
    }

    /**
     * Get <p>沙盒sessionId</p> 
     * @return SessionId <p>沙盒sessionId</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>沙盒sessionId</p>
     * @param SessionId <p>沙盒sessionId</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public ReadProductJsonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReadProductJsonRequest(ReadProductJsonRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.RuntimeId != null) {
            this.RuntimeId = new String(source.RuntimeId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "RuntimeId", this.RuntimeId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

