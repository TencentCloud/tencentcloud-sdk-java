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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDirectConnectRequest extends AbstractModel {

    /**
    * <p>物理专线的ID。</p>
    */
    @SerializedName("DirectConnectId")
    @Expose
    private String DirectConnectId;

    /**
    * <p>预计裁撤时间</p>
    */
    @SerializedName("PlannedRepealDate")
    @Expose
    private String PlannedRepealDate;

    /**
     * Get <p>物理专线的ID。</p> 
     * @return DirectConnectId <p>物理专线的ID。</p>
     */
    public String getDirectConnectId() {
        return this.DirectConnectId;
    }

    /**
     * Set <p>物理专线的ID。</p>
     * @param DirectConnectId <p>物理专线的ID。</p>
     */
    public void setDirectConnectId(String DirectConnectId) {
        this.DirectConnectId = DirectConnectId;
    }

    /**
     * Get <p>预计裁撤时间</p> 
     * @return PlannedRepealDate <p>预计裁撤时间</p>
     */
    public String getPlannedRepealDate() {
        return this.PlannedRepealDate;
    }

    /**
     * Set <p>预计裁撤时间</p>
     * @param PlannedRepealDate <p>预计裁撤时间</p>
     */
    public void setPlannedRepealDate(String PlannedRepealDate) {
        this.PlannedRepealDate = PlannedRepealDate;
    }

    public DeleteDirectConnectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDirectConnectRequest(DeleteDirectConnectRequest source) {
        if (source.DirectConnectId != null) {
            this.DirectConnectId = new String(source.DirectConnectId);
        }
        if (source.PlannedRepealDate != null) {
            this.PlannedRepealDate = new String(source.PlannedRepealDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectId", this.DirectConnectId);
        this.setParamSimple(map, prefix + "PlannedRepealDate", this.PlannedRepealDate);

    }
}

