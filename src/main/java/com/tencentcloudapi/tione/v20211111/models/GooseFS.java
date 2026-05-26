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

public class GooseFS extends AbstractModel {

    /**
    * <p>goosefs实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>GooseFS类型，包括GooseFS和GooseFSx</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>GooseFSx实例需要挂载的路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>GooseFS命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
    * <p>客户端的挂载参数，逗号分隔的参数名</p>
    */
    @SerializedName("MountOptions")
    @Expose
    private String MountOptions;

    /**
     * Get <p>goosefs实例id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>goosefs实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>goosefs实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>goosefs实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>GooseFS类型，包括GooseFS和GooseFSx</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>GooseFS类型，包括GooseFS和GooseFSx</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>GooseFS类型，包括GooseFS和GooseFSx</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>GooseFS类型，包括GooseFS和GooseFSx</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>GooseFSx实例需要挂载的路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path <p>GooseFSx实例需要挂载的路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>GooseFSx实例需要挂载的路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path <p>GooseFSx实例需要挂载的路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>GooseFS命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameSpace <p>GooseFS命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameSpace() {
        return this.NameSpace;
    }

    /**
     * Set <p>GooseFS命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameSpace <p>GooseFS命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameSpace(String NameSpace) {
        this.NameSpace = NameSpace;
    }

    /**
     * Get <p>客户端的挂载参数，逗号分隔的参数名</p> 
     * @return MountOptions <p>客户端的挂载参数，逗号分隔的参数名</p>
     */
    public String getMountOptions() {
        return this.MountOptions;
    }

    /**
     * Set <p>客户端的挂载参数，逗号分隔的参数名</p>
     * @param MountOptions <p>客户端的挂载参数，逗号分隔的参数名</p>
     */
    public void setMountOptions(String MountOptions) {
        this.MountOptions = MountOptions;
    }

    public GooseFS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GooseFS(GooseFS source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.NameSpace != null) {
            this.NameSpace = new String(source.NameSpace);
        }
        if (source.MountOptions != null) {
            this.MountOptions = new String(source.MountOptions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);
        this.setParamSimple(map, prefix + "MountOptions", this.MountOptions);

    }
}

