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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvironmentConfig extends AbstractModel{

    /**
    * 私有网络配置。
    */
    @SerializedName("VPCOption")
    @Expose
    private VPCOption VPCOption;

    /**
    * 计算集群配置。
    */
    @SerializedName("ClusterOption")
    @Expose
    private ClusterOption ClusterOption;

    /**
    * 数据库配置。
    */
    @SerializedName("DatabaseOption")
    @Expose
    private DatabaseOption DatabaseOption;

    /**
    * 存储配置。
    */
    @SerializedName("StorageOption")
    @Expose
    private StorageOption StorageOption;

    /**
    * 云服务器配置。
    */
    @SerializedName("CVMOption")
    @Expose
    private CVMOption CVMOption;

    /**
     * Get 私有网络配置。 
     * @return VPCOption 私有网络配置。
     */
    public VPCOption getVPCOption() {
        return this.VPCOption;
    }

    /**
     * Set 私有网络配置。
     * @param VPCOption 私有网络配置。
     */
    public void setVPCOption(VPCOption VPCOption) {
        this.VPCOption = VPCOption;
    }

    /**
     * Get 计算集群配置。 
     * @return ClusterOption 计算集群配置。
     */
    public ClusterOption getClusterOption() {
        return this.ClusterOption;
    }

    /**
     * Set 计算集群配置。
     * @param ClusterOption 计算集群配置。
     */
    public void setClusterOption(ClusterOption ClusterOption) {
        this.ClusterOption = ClusterOption;
    }

    /**
     * Get 数据库配置。 
     * @return DatabaseOption 数据库配置。
     */
    public DatabaseOption getDatabaseOption() {
        return this.DatabaseOption;
    }

    /**
     * Set 数据库配置。
     * @param DatabaseOption 数据库配置。
     */
    public void setDatabaseOption(DatabaseOption DatabaseOption) {
        this.DatabaseOption = DatabaseOption;
    }

    /**
     * Get 存储配置。 
     * @return StorageOption 存储配置。
     */
    public StorageOption getStorageOption() {
        return this.StorageOption;
    }

    /**
     * Set 存储配置。
     * @param StorageOption 存储配置。
     */
    public void setStorageOption(StorageOption StorageOption) {
        this.StorageOption = StorageOption;
    }

    /**
     * Get 云服务器配置。 
     * @return CVMOption 云服务器配置。
     */
    public CVMOption getCVMOption() {
        return this.CVMOption;
    }

    /**
     * Set 云服务器配置。
     * @param CVMOption 云服务器配置。
     */
    public void setCVMOption(CVMOption CVMOption) {
        this.CVMOption = CVMOption;
    }

    public EnvironmentConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvironmentConfig(EnvironmentConfig source) {
        if (source.VPCOption != null) {
            this.VPCOption = new VPCOption(source.VPCOption);
        }
        if (source.ClusterOption != null) {
            this.ClusterOption = new ClusterOption(source.ClusterOption);
        }
        if (source.DatabaseOption != null) {
            this.DatabaseOption = new DatabaseOption(source.DatabaseOption);
        }
        if (source.StorageOption != null) {
            this.StorageOption = new StorageOption(source.StorageOption);
        }
        if (source.CVMOption != null) {
            this.CVMOption = new CVMOption(source.CVMOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "VPCOption.", this.VPCOption);
        this.setParamObj(map, prefix + "ClusterOption.", this.ClusterOption);
        this.setParamObj(map, prefix + "DatabaseOption.", this.DatabaseOption);
        this.setParamObj(map, prefix + "StorageOption.", this.StorageOption);
        this.setParamObj(map, prefix + "CVMOption.", this.CVMOption);

    }
}

