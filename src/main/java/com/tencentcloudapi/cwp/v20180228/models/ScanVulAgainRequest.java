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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanVulAgainRequest extends AbstractModel{

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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventIds", this.EventIds);
        this.setParamSimple(map, prefix + "Uuids", this.Uuids);

    }
}

