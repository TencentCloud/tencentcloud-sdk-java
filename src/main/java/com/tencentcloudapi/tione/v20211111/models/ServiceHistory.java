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

public class ServiceHistory extends AbstractModel{

    /**
    * 版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Revision")
    @Expose
    private String Revision;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 镜像
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 模型文件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelFile")
    @Expose
    private String ModelFile;

    /**
    * 原始数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RawData")
    @Expose
    private String RawData;

    /**
     * Get 版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Revision 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRevision() {
        return this.Revision;
    }

    /**
     * Set 版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Revision 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRevision(String Revision) {
        this.Revision = Revision;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 镜像
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Image 镜像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 镜像
注意：此字段可能返回 null，表示取不到有效值。
     * @param Image 镜像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 模型文件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelFile 模型文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelFile() {
        return this.ModelFile;
    }

    /**
     * Set 模型文件
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelFile 模型文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelFile(String ModelFile) {
        this.ModelFile = ModelFile;
    }

    /**
     * Get 原始数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RawData 原始数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRawData() {
        return this.RawData;
    }

    /**
     * Set 原始数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param RawData 原始数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRawData(String RawData) {
        this.RawData = RawData;
    }

    public ServiceHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceHistory(ServiceHistory source) {
        if (source.Revision != null) {
            this.Revision = new String(source.Revision);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.ModelFile != null) {
            this.ModelFile = new String(source.ModelFile);
        }
        if (source.RawData != null) {
            this.RawData = new String(source.RawData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Revision", this.Revision);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ModelFile", this.ModelFile);
        this.setParamSimple(map, prefix + "RawData", this.RawData);

    }
}

