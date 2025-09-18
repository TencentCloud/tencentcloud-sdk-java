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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Connectors extends AbstractModel {

    /**
    * 连接方式
    */
    @SerializedName("ConnectionMethod")
    @Expose
    private String ConnectionMethod;

    /**
    * 连接器名称
    */
    @SerializedName("Connector")
    @Expose
    private String Connector;

    /**
    * 是否已经被使用
    */
    @SerializedName("Existed")
    @Expose
    private Boolean Existed;

    /**
     * Get 连接方式 
     * @return ConnectionMethod 连接方式
     */
    public String getConnectionMethod() {
        return this.ConnectionMethod;
    }

    /**
     * Set 连接方式
     * @param ConnectionMethod 连接方式
     */
    public void setConnectionMethod(String ConnectionMethod) {
        this.ConnectionMethod = ConnectionMethod;
    }

    /**
     * Get 连接器名称 
     * @return Connector 连接器名称
     */
    public String getConnector() {
        return this.Connector;
    }

    /**
     * Set 连接器名称
     * @param Connector 连接器名称
     */
    public void setConnector(String Connector) {
        this.Connector = Connector;
    }

    /**
     * Get 是否已经被使用 
     * @return Existed 是否已经被使用
     */
    public Boolean getExisted() {
        return this.Existed;
    }

    /**
     * Set 是否已经被使用
     * @param Existed 是否已经被使用
     */
    public void setExisted(Boolean Existed) {
        this.Existed = Existed;
    }

    public Connectors() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Connectors(Connectors source) {
        if (source.ConnectionMethod != null) {
            this.ConnectionMethod = new String(source.ConnectionMethod);
        }
        if (source.Connector != null) {
            this.Connector = new String(source.Connector);
        }
        if (source.Existed != null) {
            this.Existed = new Boolean(source.Existed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectionMethod", this.ConnectionMethod);
        this.setParamSimple(map, prefix + "Connector", this.Connector);
        this.setParamSimple(map, prefix + "Existed", this.Existed);

    }
}

