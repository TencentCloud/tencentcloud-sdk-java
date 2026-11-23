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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSessionArtifactListRequest extends AbstractModel {

    /**
    * <p>会话ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>需要删除的物料ID集合</p>
    */
    @SerializedName("ArtifactIds")
    @Expose
    private String [] ArtifactIds;

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
     * Get <p>需要删除的物料ID集合</p> 
     * @return ArtifactIds <p>需要删除的物料ID集合</p>
     */
    public String [] getArtifactIds() {
        return this.ArtifactIds;
    }

    /**
     * Set <p>需要删除的物料ID集合</p>
     * @param ArtifactIds <p>需要删除的物料ID集合</p>
     */
    public void setArtifactIds(String [] ArtifactIds) {
        this.ArtifactIds = ArtifactIds;
    }

    public DeleteSessionArtifactListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSessionArtifactListRequest(DeleteSessionArtifactListRequest source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ArtifactIds != null) {
            this.ArtifactIds = new String[source.ArtifactIds.length];
            for (int i = 0; i < source.ArtifactIds.length; i++) {
                this.ArtifactIds[i] = new String(source.ArtifactIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamArraySimple(map, prefix + "ArtifactIds.", this.ArtifactIds);

    }
}

