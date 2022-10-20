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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyContainerNetStatusRequest extends AbstractModel{

    /**
    * 容器ID
    */
    @SerializedName("ContainerID")
    @Expose
    private String ContainerID;

    /**
    * 状态(
隔离容器: EVENT_ISOLATE_CONTAINER
恢复容器: EVENT_RESOTRE_CONTAINER
)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 容器ID 
     * @return ContainerID 容器ID
     */
    public String getContainerID() {
        return this.ContainerID;
    }

    /**
     * Set 容器ID
     * @param ContainerID 容器ID
     */
    public void setContainerID(String ContainerID) {
        this.ContainerID = ContainerID;
    }

    /**
     * Get 状态(
隔离容器: EVENT_ISOLATE_CONTAINER
恢复容器: EVENT_RESOTRE_CONTAINER
) 
     * @return Status 状态(
隔离容器: EVENT_ISOLATE_CONTAINER
恢复容器: EVENT_RESOTRE_CONTAINER
)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态(
隔离容器: EVENT_ISOLATE_CONTAINER
恢复容器: EVENT_RESOTRE_CONTAINER
)
     * @param Status 状态(
隔离容器: EVENT_ISOLATE_CONTAINER
恢复容器: EVENT_RESOTRE_CONTAINER
)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyContainerNetStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyContainerNetStatusRequest(ModifyContainerNetStatusRequest source) {
        if (source.ContainerID != null) {
            this.ContainerID = new String(source.ContainerID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerID", this.ContainerID);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

