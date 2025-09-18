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

public class ModifyConnectorRequest extends AbstractModel {

    /**
    * 空间
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * connector ID
    */
    @SerializedName("ConnectorResourceId")
    @Expose
    private String ConnectorResourceId;

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源版本
    */
    @SerializedName("VersionId")
    @Expose
    private Long VersionId;

    /**
    * 连接器名称
    */
    @SerializedName("Connector")
    @Expose
    private String Connector;

    /**
    * 连接方式
    */
    @SerializedName("ConnectionMethod")
    @Expose
    private String ConnectionMethod;

    /**
     * Get 空间 
     * @return WorkSpaceId 空间
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 空间
     * @param WorkSpaceId 空间
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get connector ID 
     * @return ConnectorResourceId connector ID
     */
    public String getConnectorResourceId() {
        return this.ConnectorResourceId;
    }

    /**
     * Set connector ID
     * @param ConnectorResourceId connector ID
     */
    public void setConnectorResourceId(String ConnectorResourceId) {
        this.ConnectorResourceId = ConnectorResourceId;
    }

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源版本 
     * @return VersionId 资源版本
     */
    public Long getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 资源版本
     * @param VersionId 资源版本
     */
    public void setVersionId(Long VersionId) {
        this.VersionId = VersionId;
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

    public ModifyConnectorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConnectorRequest(ModifyConnectorRequest source) {
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
        if (source.ConnectorResourceId != null) {
            this.ConnectorResourceId = new String(source.ConnectorResourceId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.VersionId != null) {
            this.VersionId = new Long(source.VersionId);
        }
        if (source.Connector != null) {
            this.Connector = new String(source.Connector);
        }
        if (source.ConnectionMethod != null) {
            this.ConnectionMethod = new String(source.ConnectionMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamSimple(map, prefix + "ConnectorResourceId", this.ConnectorResourceId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "Connector", this.Connector);
        this.setParamSimple(map, prefix + "ConnectionMethod", this.ConnectionMethod);

    }
}

