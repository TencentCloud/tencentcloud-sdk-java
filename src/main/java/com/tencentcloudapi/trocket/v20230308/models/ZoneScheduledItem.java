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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneScheduledItem extends AbstractModel {

    /**
    * 可用区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 有剔除的调度任务且没有切回的可用区时，该值为true，反之为false
    */
    @SerializedName("NodePermWipeFlag")
    @Expose
    private Boolean NodePermWipeFlag;

    /**
     * Get 可用区ID 
     * @return ZoneId 可用区ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区ID
     * @param ZoneId 可用区ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 有剔除的调度任务且没有切回的可用区时，该值为true，反之为false 
     * @return NodePermWipeFlag 有剔除的调度任务且没有切回的可用区时，该值为true，反之为false
     */
    public Boolean getNodePermWipeFlag() {
        return this.NodePermWipeFlag;
    }

    /**
     * Set 有剔除的调度任务且没有切回的可用区时，该值为true，反之为false
     * @param NodePermWipeFlag 有剔除的调度任务且没有切回的可用区时，该值为true，反之为false
     */
    public void setNodePermWipeFlag(Boolean NodePermWipeFlag) {
        this.NodePermWipeFlag = NodePermWipeFlag;
    }

    public ZoneScheduledItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneScheduledItem(ZoneScheduledItem source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.NodePermWipeFlag != null) {
            this.NodePermWipeFlag = new Boolean(source.NodePermWipeFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "NodePermWipeFlag", this.NodePermWipeFlag);

    }
}

