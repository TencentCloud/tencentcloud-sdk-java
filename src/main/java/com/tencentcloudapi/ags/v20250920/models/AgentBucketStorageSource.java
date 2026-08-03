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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentBucketStorageSource extends AbstractModel {

    /**
    * <p>用于传入 AgentBucket 的 LibraryID</p>
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * <p>用于传入 AgentBucket 的 spaceId</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>用于传入 AgentBucket 的 AccessDomain</p>
    */
    @SerializedName("AccessDomain")
    @Expose
    private String AccessDomain;

    /**
     * Get <p>用于传入 AgentBucket 的 LibraryID</p> 
     * @return LibraryId <p>用于传入 AgentBucket 的 LibraryID</p>
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set <p>用于传入 AgentBucket 的 LibraryID</p>
     * @param LibraryId <p>用于传入 AgentBucket 的 LibraryID</p>
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * Get <p>用于传入 AgentBucket 的 spaceId</p> 
     * @return SpaceId <p>用于传入 AgentBucket 的 spaceId</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>用于传入 AgentBucket 的 spaceId</p>
     * @param SpaceId <p>用于传入 AgentBucket 的 spaceId</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>用于传入 AgentBucket 的 AccessDomain</p> 
     * @return AccessDomain <p>用于传入 AgentBucket 的 AccessDomain</p>
     */
    public String getAccessDomain() {
        return this.AccessDomain;
    }

    /**
     * Set <p>用于传入 AgentBucket 的 AccessDomain</p>
     * @param AccessDomain <p>用于传入 AgentBucket 的 AccessDomain</p>
     */
    public void setAccessDomain(String AccessDomain) {
        this.AccessDomain = AccessDomain;
    }

    public AgentBucketStorageSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentBucketStorageSource(AgentBucketStorageSource source) {
        if (source.LibraryId != null) {
            this.LibraryId = new String(source.LibraryId);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.AccessDomain != null) {
            this.AccessDomain = new String(source.AccessDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "AccessDomain", this.AccessDomain);

    }
}

