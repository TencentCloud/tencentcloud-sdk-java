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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EngineSessionImage extends AbstractModel {

    /**
    * Spark镜像唯一id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkImageId")
    @Expose
    private String SparkImageId;

    /**
    * Spark镜像版本名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkImageVersion")
    @Expose
    private String SparkImageVersion;

    /**
    * 小版本镜像类型.1:TensorFlow、2:Pytorch、3:SK-learn

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkImageType")
    @Expose
    private Long SparkImageType;

    /**
    * 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SparkImageTag")
    @Expose
    private String SparkImageTag;

    /**
     * Get Spark镜像唯一id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkImageId Spark镜像唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkImageId() {
        return this.SparkImageId;
    }

    /**
     * Set Spark镜像唯一id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkImageId Spark镜像唯一id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkImageId(String SparkImageId) {
        this.SparkImageId = SparkImageId;
    }

    /**
     * Get Spark镜像版本名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkImageVersion Spark镜像版本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkImageVersion() {
        return this.SparkImageVersion;
    }

    /**
     * Set Spark镜像版本名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkImageVersion Spark镜像版本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkImageVersion(String SparkImageVersion) {
        this.SparkImageVersion = SparkImageVersion;
    }

    /**
     * Get 小版本镜像类型.1:TensorFlow、2:Pytorch、3:SK-learn

注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkImageType 小版本镜像类型.1:TensorFlow、2:Pytorch、3:SK-learn

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSparkImageType() {
        return this.SparkImageType;
    }

    /**
     * Set 小版本镜像类型.1:TensorFlow、2:Pytorch、3:SK-learn

注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkImageType 小版本镜像类型.1:TensorFlow、2:Pytorch、3:SK-learn

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkImageType(Long SparkImageType) {
        this.SparkImageType = SparkImageType;
    }

    /**
     * Get 镜像地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SparkImageTag 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSparkImageTag() {
        return this.SparkImageTag;
    }

    /**
     * Set 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param SparkImageTag 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSparkImageTag(String SparkImageTag) {
        this.SparkImageTag = SparkImageTag;
    }

    public EngineSessionImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EngineSessionImage(EngineSessionImage source) {
        if (source.SparkImageId != null) {
            this.SparkImageId = new String(source.SparkImageId);
        }
        if (source.SparkImageVersion != null) {
            this.SparkImageVersion = new String(source.SparkImageVersion);
        }
        if (source.SparkImageType != null) {
            this.SparkImageType = new Long(source.SparkImageType);
        }
        if (source.SparkImageTag != null) {
            this.SparkImageTag = new String(source.SparkImageTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SparkImageId", this.SparkImageId);
        this.setParamSimple(map, prefix + "SparkImageVersion", this.SparkImageVersion);
        this.setParamSimple(map, prefix + "SparkImageType", this.SparkImageType);
        this.setParamSimple(map, prefix + "SparkImageTag", this.SparkImageTag);

    }
}

