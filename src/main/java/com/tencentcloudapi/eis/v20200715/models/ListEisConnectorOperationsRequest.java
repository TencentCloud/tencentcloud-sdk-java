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
package com.tencentcloudapi.eis.v20200715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListEisConnectorOperationsRequest extends AbstractModel{

    /**
    * 连接器名称
    */
    @SerializedName("ConnectorName")
    @Expose
    private String ConnectorName;

    /**
    * 连接器版本
    */
    @SerializedName("ConnectorVersion")
    @Expose
    private String ConnectorVersion;

    /**
     * Get 连接器名称 
     * @return ConnectorName 连接器名称
     */
    public String getConnectorName() {
        return this.ConnectorName;
    }

    /**
     * Set 连接器名称
     * @param ConnectorName 连接器名称
     */
    public void setConnectorName(String ConnectorName) {
        this.ConnectorName = ConnectorName;
    }

    /**
     * Get 连接器版本 
     * @return ConnectorVersion 连接器版本
     */
    public String getConnectorVersion() {
        return this.ConnectorVersion;
    }

    /**
     * Set 连接器版本
     * @param ConnectorVersion 连接器版本
     */
    public void setConnectorVersion(String ConnectorVersion) {
        this.ConnectorVersion = ConnectorVersion;
    }

    public ListEisConnectorOperationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListEisConnectorOperationsRequest(ListEisConnectorOperationsRequest source) {
        if (source.ConnectorName != null) {
            this.ConnectorName = new String(source.ConnectorName);
        }
        if (source.ConnectorVersion != null) {
            this.ConnectorVersion = new String(source.ConnectorVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectorName", this.ConnectorName);
        this.setParamSimple(map, prefix + "ConnectorVersion", this.ConnectorVersion);

    }
}

