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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteEdgeUnitApplicationsRequest extends AbstractModel{

    /**
    * 单元ID
    */
    @SerializedName("EdgeUnitID")
    @Expose
    private Long EdgeUnitID;

    /**
    * 应用ID列表
    */
    @SerializedName("ApplicationIDs")
    @Expose
    private Long [] ApplicationIDs;

    /**
     * Get 单元ID 
     * @return EdgeUnitID 单元ID
     */
    public Long getEdgeUnitID() {
        return this.EdgeUnitID;
    }

    /**
     * Set 单元ID
     * @param EdgeUnitID 单元ID
     */
    public void setEdgeUnitID(Long EdgeUnitID) {
        this.EdgeUnitID = EdgeUnitID;
    }

    /**
     * Get 应用ID列表 
     * @return ApplicationIDs 应用ID列表
     */
    public Long [] getApplicationIDs() {
        return this.ApplicationIDs;
    }

    /**
     * Set 应用ID列表
     * @param ApplicationIDs 应用ID列表
     */
    public void setApplicationIDs(Long [] ApplicationIDs) {
        this.ApplicationIDs = ApplicationIDs;
    }

    public DeleteEdgeUnitApplicationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteEdgeUnitApplicationsRequest(DeleteEdgeUnitApplicationsRequest source) {
        if (source.EdgeUnitID != null) {
            this.EdgeUnitID = new Long(source.EdgeUnitID);
        }
        if (source.ApplicationIDs != null) {
            this.ApplicationIDs = new Long[source.ApplicationIDs.length];
            for (int i = 0; i < source.ApplicationIDs.length; i++) {
                this.ApplicationIDs[i] = new Long(source.ApplicationIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitID", this.EdgeUnitID);
        this.setParamArraySimple(map, prefix + "ApplicationIDs.", this.ApplicationIDs);

    }
}

