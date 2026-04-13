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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeMount extends AbstractModel {

    /**
    * <p>cfs的配置信息</p>
    */
    @SerializedName("CFSConfig")
    @Expose
    private CFSConfig CFSConfig;

    /**
    * <p>挂载源类型，CFS、COS、PUBLIC_DATA_SOURCE，默认为CFS</p>
    */
    @SerializedName("VolumeSourceType")
    @Expose
    private String VolumeSourceType;

    /**
    * <p>自定义容器内挂载路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
    * <p>挂载数据源时的配置信息</p>
    */
    @SerializedName("PublicDataSource")
    @Expose
    private PublicDataSourceFS PublicDataSource;

    /**
     * Get <p>cfs的配置信息</p> 
     * @return CFSConfig <p>cfs的配置信息</p>
     */
    public CFSConfig getCFSConfig() {
        return this.CFSConfig;
    }

    /**
     * Set <p>cfs的配置信息</p>
     * @param CFSConfig <p>cfs的配置信息</p>
     */
    public void setCFSConfig(CFSConfig CFSConfig) {
        this.CFSConfig = CFSConfig;
    }

    /**
     * Get <p>挂载源类型，CFS、COS、PUBLIC_DATA_SOURCE，默认为CFS</p> 
     * @return VolumeSourceType <p>挂载源类型，CFS、COS、PUBLIC_DATA_SOURCE，默认为CFS</p>
     */
    public String getVolumeSourceType() {
        return this.VolumeSourceType;
    }

    /**
     * Set <p>挂载源类型，CFS、COS、PUBLIC_DATA_SOURCE，默认为CFS</p>
     * @param VolumeSourceType <p>挂载源类型，CFS、COS、PUBLIC_DATA_SOURCE，默认为CFS</p>
     */
    public void setVolumeSourceType(String VolumeSourceType) {
        this.VolumeSourceType = VolumeSourceType;
    }

    /**
     * Get <p>自定义容器内挂载路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MountPath <p>自定义容器内挂载路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set <p>自定义容器内挂载路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MountPath <p>自定义容器内挂载路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    /**
     * Get <p>挂载数据源时的配置信息</p> 
     * @return PublicDataSource <p>挂载数据源时的配置信息</p>
     */
    public PublicDataSourceFS getPublicDataSource() {
        return this.PublicDataSource;
    }

    /**
     * Set <p>挂载数据源时的配置信息</p>
     * @param PublicDataSource <p>挂载数据源时的配置信息</p>
     */
    public void setPublicDataSource(PublicDataSourceFS PublicDataSource) {
        this.PublicDataSource = PublicDataSource;
    }

    public VolumeMount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeMount(VolumeMount source) {
        if (source.CFSConfig != null) {
            this.CFSConfig = new CFSConfig(source.CFSConfig);
        }
        if (source.VolumeSourceType != null) {
            this.VolumeSourceType = new String(source.VolumeSourceType);
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
        if (source.PublicDataSource != null) {
            this.PublicDataSource = new PublicDataSourceFS(source.PublicDataSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CFSConfig.", this.CFSConfig);
        this.setParamSimple(map, prefix + "VolumeSourceType", this.VolumeSourceType);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);
        this.setParamObj(map, prefix + "PublicDataSource.", this.PublicDataSource);

    }
}

