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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanVulAgainRequest extends AbstractModel {

    /**
    * 漏洞事件id串，多个用英文逗号分隔
    */
    @SerializedName("EventIds")
    @Expose
    private String EventIds;

    /**
    * 重新检查的机器uuid,多个逗号分隔
    */
    @SerializedName("Uuids")
    @Expose
    private String Uuids;

    /**
    * 0漏洞,1windows 补丁
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
     * Get 漏洞事件id串，多个用英文逗号分隔 
     * @return EventIds 漏洞事件id串，多个用英文逗号分隔
     */
    public String getEventIds() {
        return this.EventIds;
    }

    /**
     * Set 漏洞事件id串，多个用英文逗号分隔
     * @param EventIds 漏洞事件id串，多个用英文逗号分隔
     */
    public void setEventIds(String EventIds) {
        this.EventIds = EventIds;
    }

    /**
     * Get 重新检查的机器uuid,多个逗号分隔 
     * @return Uuids 重新检查的机器uuid,多个逗号分隔
     */
    public String getUuids() {
        return this.Uuids;
    }

    /**
     * Set 重新检查的机器uuid,多个逗号分隔
     * @param Uuids 重新检查的机器uuid,多个逗号分隔
     */
    public void setUuids(String Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get 0漏洞,1windows 补丁 
     * @return EventType 0漏洞,1windows 补丁
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 0漏洞,1windows 补丁
     * @param EventType 0漏洞,1windows 补丁
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    public ScanVulAgainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanVulAgainRequest(ScanVulAgainRequest source) {
        if (source.EventIds != null) {
            this.EventIds = new String(source.EventIds);
        }
        if (source.Uuids != null) {
            this.Uuids = new String(source.Uuids);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventIds", this.EventIds);
        this.setParamSimple(map, prefix + "Uuids", this.Uuids);
        this.setParamSimple(map, prefix + "EventType", this.EventType);

    }
}

