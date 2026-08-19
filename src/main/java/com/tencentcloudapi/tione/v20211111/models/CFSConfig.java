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

public class CFSConfig extends AbstractModel {

    /**
    * <p>cfs的实例的ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>存储的路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>cfs的挂载类型，可选值为：STORAGE、SOURCE 分别表示存储拓展模式和数据源模式，默认为 STORAGE</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MountType")
    @Expose
    private String MountType;

    /**
    * <p>协议 1: NFS, 2: TURBO</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>是否平台预置存储</p>
    */
    @SerializedName("IsPresetStorage")
    @Expose
    private Boolean IsPresetStorage;

    /**
     * Get <p>cfs的实例的ID</p> 
     * @return Id <p>cfs的实例的ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>cfs的实例的ID</p>
     * @param Id <p>cfs的实例的ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>存储的路径</p> 
     * @return Path <p>存储的路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>存储的路径</p>
     * @param Path <p>存储的路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>cfs的挂载类型，可选值为：STORAGE、SOURCE 分别表示存储拓展模式和数据源模式，默认为 STORAGE</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MountType <p>cfs的挂载类型，可选值为：STORAGE、SOURCE 分别表示存储拓展模式和数据源模式，默认为 STORAGE</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMountType() {
        return this.MountType;
    }

    /**
     * Set <p>cfs的挂载类型，可选值为：STORAGE、SOURCE 分别表示存储拓展模式和数据源模式，默认为 STORAGE</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MountType <p>cfs的挂载类型，可选值为：STORAGE、SOURCE 分别表示存储拓展模式和数据源模式，默认为 STORAGE</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMountType(String MountType) {
        this.MountType = MountType;
    }

    /**
     * Get <p>协议 1: NFS, 2: TURBO</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol <p>协议 1: NFS, 2: TURBO</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议 1: NFS, 2: TURBO</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol <p>协议 1: NFS, 2: TURBO</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>是否平台预置存储</p> 
     * @return IsPresetStorage <p>是否平台预置存储</p>
     */
    public Boolean getIsPresetStorage() {
        return this.IsPresetStorage;
    }

    /**
     * Set <p>是否平台预置存储</p>
     * @param IsPresetStorage <p>是否平台预置存储</p>
     */
    public void setIsPresetStorage(Boolean IsPresetStorage) {
        this.IsPresetStorage = IsPresetStorage;
    }

    public CFSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CFSConfig(CFSConfig source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.MountType != null) {
            this.MountType = new String(source.MountType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.IsPresetStorage != null) {
            this.IsPresetStorage = new Boolean(source.IsPresetStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "MountType", this.MountType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "IsPresetStorage", this.IsPresetStorage);

    }
}

