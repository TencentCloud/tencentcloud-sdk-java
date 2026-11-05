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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDataAgentSessionRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>会话ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>批量删除 会话id 列表</p>
    */
    @SerializedName("SessionIds")
    @Expose
    private String [] SessionIds;

    /**
    * <p>上下文</p>
    */
    @SerializedName("SurfaceContext")
    @Expose
    private SurfaceContext SurfaceContext;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>会话ID</p> 
     * @return SessionId <p>会话ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话ID</p>
     * @param SessionId <p>会话ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>批量删除 会话id 列表</p> 
     * @return SessionIds <p>批量删除 会话id 列表</p>
     */
    public String [] getSessionIds() {
        return this.SessionIds;
    }

    /**
     * Set <p>批量删除 会话id 列表</p>
     * @param SessionIds <p>批量删除 会话id 列表</p>
     */
    public void setSessionIds(String [] SessionIds) {
        this.SessionIds = SessionIds;
    }

    /**
     * Get <p>上下文</p> 
     * @return SurfaceContext <p>上下文</p>
     */
    public SurfaceContext getSurfaceContext() {
        return this.SurfaceContext;
    }

    /**
     * Set <p>上下文</p>
     * @param SurfaceContext <p>上下文</p>
     */
    public void setSurfaceContext(SurfaceContext SurfaceContext) {
        this.SurfaceContext = SurfaceContext;
    }

    public DeleteDataAgentSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDataAgentSessionRequest(DeleteDataAgentSessionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionIds != null) {
            this.SessionIds = new String[source.SessionIds.length];
            for (int i = 0; i < source.SessionIds.length; i++) {
                this.SessionIds[i] = new String(source.SessionIds[i]);
            }
        }
        if (source.SurfaceContext != null) {
            this.SurfaceContext = new SurfaceContext(source.SurfaceContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamArraySimple(map, prefix + "SessionIds.", this.SessionIds);
        this.setParamObj(map, prefix + "SurfaceContext.", this.SurfaceContext);

    }
}

