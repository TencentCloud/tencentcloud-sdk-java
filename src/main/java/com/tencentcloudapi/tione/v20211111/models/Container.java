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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Container extends AbstractModel{

    /**
    * 名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 容器状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private ContainerStatus Status;

    /**
     * Get 名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerId id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerId id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get 镜像地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Image 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Image 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 容器状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 容器状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContainerStatus getStatus() {
        return this.Status;
    }

    /**
     * Set 容器状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 容器状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(ContainerStatus Status) {
        this.Status = Status;
    }

    public Container() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Container(Container source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Status != null) {
            this.Status = new ContainerStatus(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamObj(map, prefix + "Status.", this.Status);

    }
}

