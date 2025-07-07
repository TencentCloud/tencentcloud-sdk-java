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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcFwInstance extends AbstractModel {

    /**
    * 防火墙实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 私有网络模式下接入的VpcId列表；仅私有网络模式使用
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * 部署地域信息
    */
    @SerializedName("FwDeploy")
    @Expose
    private FwDeploy FwDeploy;

    /**
    * 防火墙实例ID (编辑场景传)
    */
    @SerializedName("FwInsId")
    @Expose
    private String FwInsId;

    /**
     * Get 防火墙实例名称 
     * @return Name 防火墙实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 防火墙实例名称
     * @param Name 防火墙实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 私有网络模式下接入的VpcId列表；仅私有网络模式使用 
     * @return VpcIds 私有网络模式下接入的VpcId列表；仅私有网络模式使用
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set 私有网络模式下接入的VpcId列表；仅私有网络模式使用
     * @param VpcIds 私有网络模式下接入的VpcId列表；仅私有网络模式使用
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get 部署地域信息 
     * @return FwDeploy 部署地域信息
     */
    public FwDeploy getFwDeploy() {
        return this.FwDeploy;
    }

    /**
     * Set 部署地域信息
     * @param FwDeploy 部署地域信息
     */
    public void setFwDeploy(FwDeploy FwDeploy) {
        this.FwDeploy = FwDeploy;
    }

    /**
     * Get 防火墙实例ID (编辑场景传) 
     * @return FwInsId 防火墙实例ID (编辑场景传)
     */
    public String getFwInsId() {
        return this.FwInsId;
    }

    /**
     * Set 防火墙实例ID (编辑场景传)
     * @param FwInsId 防火墙实例ID (编辑场景传)
     */
    public void setFwInsId(String FwInsId) {
        this.FwInsId = FwInsId;
    }

    public VpcFwInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcFwInstance(VpcFwInstance source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VpcIds != null) {
            this.VpcIds = new String[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new String(source.VpcIds[i]);
            }
        }
        if (source.FwDeploy != null) {
            this.FwDeploy = new FwDeploy(source.FwDeploy);
        }
        if (source.FwInsId != null) {
            this.FwInsId = new String(source.FwInsId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamObj(map, prefix + "FwDeploy.", this.FwDeploy);
        this.setParamSimple(map, prefix + "FwInsId", this.FwInsId);

    }
}

