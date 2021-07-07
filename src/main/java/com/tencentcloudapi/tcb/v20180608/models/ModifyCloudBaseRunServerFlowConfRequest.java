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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCloudBaseRunServerFlowConfRequest extends AbstractModel{

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 服务名称
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 流量占比
    */
    @SerializedName("VersionFlowItems")
    @Expose
    private CloudBaseRunVersionFlowItem [] VersionFlowItems;

    /**
    * 流量类型（URL_PARAMS / FLOW / HEADERS)
    */
    @SerializedName("TrafficType")
    @Expose
    private String TrafficType;

    /**
    * 操作备注
    */
    @SerializedName("OperatorRemark")
    @Expose
    private String OperatorRemark;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 服务名称 
     * @return ServerName 服务名称
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名称
     * @param ServerName 服务名称
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 流量占比 
     * @return VersionFlowItems 流量占比
     */
    public CloudBaseRunVersionFlowItem [] getVersionFlowItems() {
        return this.VersionFlowItems;
    }

    /**
     * Set 流量占比
     * @param VersionFlowItems 流量占比
     */
    public void setVersionFlowItems(CloudBaseRunVersionFlowItem [] VersionFlowItems) {
        this.VersionFlowItems = VersionFlowItems;
    }

    /**
     * Get 流量类型（URL_PARAMS / FLOW / HEADERS) 
     * @return TrafficType 流量类型（URL_PARAMS / FLOW / HEADERS)
     */
    public String getTrafficType() {
        return this.TrafficType;
    }

    /**
     * Set 流量类型（URL_PARAMS / FLOW / HEADERS)
     * @param TrafficType 流量类型（URL_PARAMS / FLOW / HEADERS)
     */
    public void setTrafficType(String TrafficType) {
        this.TrafficType = TrafficType;
    }

    /**
     * Get 操作备注 
     * @return OperatorRemark 操作备注
     */
    public String getOperatorRemark() {
        return this.OperatorRemark;
    }

    /**
     * Set 操作备注
     * @param OperatorRemark 操作备注
     */
    public void setOperatorRemark(String OperatorRemark) {
        this.OperatorRemark = OperatorRemark;
    }

    public ModifyCloudBaseRunServerFlowConfRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudBaseRunServerFlowConfRequest(ModifyCloudBaseRunServerFlowConfRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.VersionFlowItems != null) {
            this.VersionFlowItems = new CloudBaseRunVersionFlowItem[source.VersionFlowItems.length];
            for (int i = 0; i < source.VersionFlowItems.length; i++) {
                this.VersionFlowItems[i] = new CloudBaseRunVersionFlowItem(source.VersionFlowItems[i]);
            }
        }
        if (source.TrafficType != null) {
            this.TrafficType = new String(source.TrafficType);
        }
        if (source.OperatorRemark != null) {
            this.OperatorRemark = new String(source.OperatorRemark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamArrayObj(map, prefix + "VersionFlowItems.", this.VersionFlowItems);
        this.setParamSimple(map, prefix + "TrafficType", this.TrafficType);
        this.setParamSimple(map, prefix + "OperatorRemark", this.OperatorRemark);

    }
}

