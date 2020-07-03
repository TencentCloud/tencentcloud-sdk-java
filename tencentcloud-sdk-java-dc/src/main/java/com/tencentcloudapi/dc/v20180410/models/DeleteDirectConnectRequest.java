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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDirectConnectRequest extends AbstractModel{

    /**
    * 物理专线的ID。
    */
    @SerializedName("DirectConnectId")
    @Expose
    private String DirectConnectId;

    /**
     * Get 物理专线的ID。 
     * @return DirectConnectId 物理专线的ID。
     */
    public String getDirectConnectId() {
        return this.DirectConnectId;
    }

    /**
     * Set 物理专线的ID。
     * @param DirectConnectId 物理专线的ID。
     */
    public void setDirectConnectId(String DirectConnectId) {
        this.DirectConnectId = DirectConnectId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectId", this.DirectConnectId);

    }
}

