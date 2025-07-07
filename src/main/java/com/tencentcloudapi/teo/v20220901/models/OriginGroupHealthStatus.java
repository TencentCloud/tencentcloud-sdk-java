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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginGroupHealthStatus extends AbstractModel {

    /**
    * 源站组 ID。
    */
    @SerializedName("OriginGroupID")
    @Expose
    private String OriginGroupID;

    /**
    * 源站组名。
    */
    @SerializedName("OriginGroupName")
    @Expose
    private String OriginGroupName;

    /**
    * 源站组类型，取值有：
<li>HTTP：HTTP 专用型；</li>
<li>GENERAL：通用型。</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * 优先级。
    */
    @SerializedName("Priority")
    @Expose
    private String Priority;

    /**
    * 源站组里各源站的健康状态。
    */
    @SerializedName("OriginHealthStatus")
    @Expose
    private OriginHealthStatus [] OriginHealthStatus;

    /**
     * Get 源站组 ID。 
     * @return OriginGroupID 源站组 ID。
     */
    public String getOriginGroupID() {
        return this.OriginGroupID;
    }

    /**
     * Set 源站组 ID。
     * @param OriginGroupID 源站组 ID。
     */
    public void setOriginGroupID(String OriginGroupID) {
        this.OriginGroupID = OriginGroupID;
    }

    /**
     * Get 源站组名。 
     * @return OriginGroupName 源站组名。
     */
    public String getOriginGroupName() {
        return this.OriginGroupName;
    }

    /**
     * Set 源站组名。
     * @param OriginGroupName 源站组名。
     */
    public void setOriginGroupName(String OriginGroupName) {
        this.OriginGroupName = OriginGroupName;
    }

    /**
     * Get 源站组类型，取值有：
<li>HTTP：HTTP 专用型；</li>
<li>GENERAL：通用型。</li> 
     * @return OriginType 源站组类型，取值有：
<li>HTTP：HTTP 专用型；</li>
<li>GENERAL：通用型。</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 源站组类型，取值有：
<li>HTTP：HTTP 专用型；</li>
<li>GENERAL：通用型。</li>
     * @param OriginType 源站组类型，取值有：
<li>HTTP：HTTP 专用型；</li>
<li>GENERAL：通用型。</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get 优先级。 
     * @return Priority 优先级。
     */
    public String getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级。
     * @param Priority 优先级。
     */
    public void setPriority(String Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 源站组里各源站的健康状态。 
     * @return OriginHealthStatus 源站组里各源站的健康状态。
     */
    public OriginHealthStatus [] getOriginHealthStatus() {
        return this.OriginHealthStatus;
    }

    /**
     * Set 源站组里各源站的健康状态。
     * @param OriginHealthStatus 源站组里各源站的健康状态。
     */
    public void setOriginHealthStatus(OriginHealthStatus [] OriginHealthStatus) {
        this.OriginHealthStatus = OriginHealthStatus;
    }

    public OriginGroupHealthStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroupHealthStatus(OriginGroupHealthStatus source) {
        if (source.OriginGroupID != null) {
            this.OriginGroupID = new String(source.OriginGroupID);
        }
        if (source.OriginGroupName != null) {
            this.OriginGroupName = new String(source.OriginGroupName);
        }
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.Priority != null) {
            this.Priority = new String(source.Priority);
        }
        if (source.OriginHealthStatus != null) {
            this.OriginHealthStatus = new OriginHealthStatus[source.OriginHealthStatus.length];
            for (int i = 0; i < source.OriginHealthStatus.length; i++) {
                this.OriginHealthStatus[i] = new OriginHealthStatus(source.OriginHealthStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginGroupID", this.OriginGroupID);
        this.setParamSimple(map, prefix + "OriginGroupName", this.OriginGroupName);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArrayObj(map, prefix + "OriginHealthStatus.", this.OriginHealthStatus);

    }
}

