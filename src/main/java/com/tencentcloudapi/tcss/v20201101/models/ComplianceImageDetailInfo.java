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

public class ComplianceImageDetailInfo extends AbstractModel{

    /**
    * 镜像在主机上的ID。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像的名称。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像的Tag。
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * 镜像所在远程仓库的路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Repository")
    @Expose
    private String Repository;

    /**
     * Get 镜像在主机上的ID。 
     * @return ImageId 镜像在主机上的ID。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像在主机上的ID。
     * @param ImageId 镜像在主机上的ID。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像的名称。 
     * @return ImageName 镜像的名称。
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像的名称。
     * @param ImageName 镜像的名称。
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 镜像的Tag。 
     * @return ImageTag 镜像的Tag。
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set 镜像的Tag。
     * @param ImageTag 镜像的Tag。
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get 镜像所在远程仓库的路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Repository 镜像所在远程仓库的路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepository() {
        return this.Repository;
    }

    /**
     * Set 镜像所在远程仓库的路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Repository 镜像所在远程仓库的路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepository(String Repository) {
        this.Repository = Repository;
    }

    public ComplianceImageDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceImageDetailInfo(ComplianceImageDetailInfo source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.Repository != null) {
            this.Repository = new String(source.Repository);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "Repository", this.Repository);

    }
}

