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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEnvironmentRequest extends AbstractModel {

    /**
    * 环境id
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 环境名称。环境名称不可修改
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 环境描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 私有网络名称
    */
    @SerializedName("Vpc")
    @Expose
    private String Vpc;

    /**
    * 子网网络
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * 环境类型：test、pre、prod
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
     * Get 环境id 
     * @return EnvironmentId 环境id
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境id
     * @param EnvironmentId 环境id
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 环境名称。环境名称不可修改 
     * @return EnvironmentName 环境名称。环境名称不可修改
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 环境名称。环境名称不可修改
     * @param EnvironmentName 环境名称。环境名称不可修改
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 环境描述 
     * @return Description 环境描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 环境描述
     * @param Description 环境描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 私有网络名称 
     * @return Vpc 私有网络名称
     */
    public String getVpc() {
        return this.Vpc;
    }

    /**
     * Set 私有网络名称
     * @param Vpc 私有网络名称
     */
    public void setVpc(String Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get 子网网络 
     * @return SubnetIds 子网网络
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网网络
     * @param SubnetIds 子网网络
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 来源渠道 
     * @return SourceChannel 来源渠道
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源渠道
     * @param SourceChannel 来源渠道
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get 环境类型：test、pre、prod 
     * @return EnvType 环境类型：test、pre、prod
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set 环境类型：test、pre、prod
     * @param EnvType 环境类型：test、pre、prod
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    public ModifyEnvironmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnvironmentRequest(ModifyEnvironmentRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Vpc != null) {
            this.Vpc = new String(source.Vpc);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Vpc", this.Vpc);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);

    }
}

