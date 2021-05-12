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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Model extends AbstractModel{

    /**
    * 模型名称
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 模型文件名称
    */
    @SerializedName("DictName")
    @Expose
    private String DictName;

    /**
    * 模型Id
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 模型类型，“8k”或者”16k“
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * 服务类型
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 模型状态，-1下线状态，1上线状态, 0训练中, -2 训练失败
    */
    @SerializedName("ModelState")
    @Expose
    private Long ModelState;

    /**
    * 最后更新时间
    */
    @SerializedName("AtUpdated")
    @Expose
    private String AtUpdated;

    /**
    * 标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagInfos")
    @Expose
    private String [] TagInfos;

    /**
     * Get 模型名称 
     * @return ModelName 模型名称
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称
     * @param ModelName 模型名称
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 模型文件名称 
     * @return DictName 模型文件名称
     */
    public String getDictName() {
        return this.DictName;
    }

    /**
     * Set 模型文件名称
     * @param DictName 模型文件名称
     */
    public void setDictName(String DictName) {
        this.DictName = DictName;
    }

    /**
     * Get 模型Id 
     * @return ModelId 模型Id
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型Id
     * @param ModelId 模型Id
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 模型类型，“8k”或者”16k“ 
     * @return ModelType 模型类型，“8k”或者”16k“
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set 模型类型，“8k”或者”16k“
     * @param ModelType 模型类型，“8k”或者”16k“
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get 服务类型 
     * @return ServiceType 服务类型
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 服务类型
     * @param ServiceType 服务类型
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 模型状态，-1下线状态，1上线状态, 0训练中, -2 训练失败 
     * @return ModelState 模型状态，-1下线状态，1上线状态, 0训练中, -2 训练失败
     */
    public Long getModelState() {
        return this.ModelState;
    }

    /**
     * Set 模型状态，-1下线状态，1上线状态, 0训练中, -2 训练失败
     * @param ModelState 模型状态，-1下线状态，1上线状态, 0训练中, -2 训练失败
     */
    public void setModelState(Long ModelState) {
        this.ModelState = ModelState;
    }

    /**
     * Get 最后更新时间 
     * @return AtUpdated 最后更新时间
     */
    public String getAtUpdated() {
        return this.AtUpdated;
    }

    /**
     * Set 最后更新时间
     * @param AtUpdated 最后更新时间
     */
    public void setAtUpdated(String AtUpdated) {
        this.AtUpdated = AtUpdated;
    }

    /**
     * Get 标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagInfos 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTagInfos() {
        return this.TagInfos;
    }

    /**
     * Set 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagInfos 标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagInfos(String [] TagInfos) {
        this.TagInfos = TagInfos;
    }

    public Model() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Model(Model source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.DictName != null) {
            this.DictName = new String(source.DictName);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ModelState != null) {
            this.ModelState = new Long(source.ModelState);
        }
        if (source.AtUpdated != null) {
            this.AtUpdated = new String(source.AtUpdated);
        }
        if (source.TagInfos != null) {
            this.TagInfos = new String[source.TagInfos.length];
            for (int i = 0; i < source.TagInfos.length; i++) {
                this.TagInfos[i] = new String(source.TagInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "DictName", this.DictName);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ModelState", this.ModelState);
        this.setParamSimple(map, prefix + "AtUpdated", this.AtUpdated);
        this.setParamArraySimple(map, prefix + "TagInfos.", this.TagInfos);

    }
}

