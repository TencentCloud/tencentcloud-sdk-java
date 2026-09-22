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

public class ConnectorRefInput extends AbstractModel {

    /**
    * connector 主表 ID（雪花 ID 数字串）
    */
    @SerializedName("ConnectorId")
    @Expose
    private String ConnectorId;

    /**
     * Get connector 主表 ID（雪花 ID 数字串） 
     * @return ConnectorId connector 主表 ID（雪花 ID 数字串）
     */
    public String getConnectorId() {
        return this.ConnectorId;
    }

    /**
     * Set connector 主表 ID（雪花 ID 数字串）
     * @param ConnectorId connector 主表 ID（雪花 ID 数字串）
     */
    public void setConnectorId(String ConnectorId) {
        this.ConnectorId = ConnectorId;
    }

    public ConnectorRefInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectorRefInput(ConnectorRefInput source) {
        if (source.ConnectorId != null) {
            this.ConnectorId = new String(source.ConnectorId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectorId", this.ConnectorId);

    }
}

