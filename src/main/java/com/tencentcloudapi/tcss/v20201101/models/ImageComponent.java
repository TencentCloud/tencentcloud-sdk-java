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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageComponent extends AbstractModel{

    /**
    * 组件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 组件版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 组件路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 组件类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 组件漏洞数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
    * 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
     * Get 组件名称 
     * @return Name 组件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 组件名称
     * @param Name 组件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 组件版本 
     * @return Version 组件版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 组件版本
     * @param Version 组件版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 组件路径 
     * @return Path 组件路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 组件路径
     * @param Path 组件路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 组件类型 
     * @return Type 组件类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 组件类型
     * @param Type 组件类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 组件漏洞数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulCount 组件漏洞数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set 组件漏洞数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulCount 组件漏洞数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get 镜像ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageID 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageID 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    public ImageComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageComponent(ImageComponent source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.VulCount != null) {
            this.VulCount = new Long(source.VulCount);
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "VulCount", this.VulCount);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);

    }
}

