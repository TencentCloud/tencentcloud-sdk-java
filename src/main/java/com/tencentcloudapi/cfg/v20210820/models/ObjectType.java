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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectType extends AbstractModel {

    /**
    * 对象类型ID
    */
    @SerializedName("ObjectTypeId")
    @Expose
    private Long ObjectTypeId;

    /**
    * 对象类型名称
    */
    @SerializedName("ObjectTypeTitle")
    @Expose
    private String ObjectTypeTitle;

    /**
    * 对象类型第一级
    */
    @SerializedName("ObjectTypeLevelOne")
    @Expose
    private String ObjectTypeLevelOne;

    /**
    * 对象类型参数
    */
    @SerializedName("ObjectTypeParams")
    @Expose
    private ObjectTypeConfig ObjectTypeParams;

    /**
    * tke接口json解析规则，null不需要解析
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectTypeJsonParse")
    @Expose
    private ObjectTypeJsonParse ObjectTypeJsonParse;

    /**
    * 是否包含新动作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectHasNewAction")
    @Expose
    private Boolean ObjectHasNewAction;

    /**
    * 对应在平台架构图中的资源类型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectPlatformName")
    @Expose
    private String ObjectPlatformName;

    /**
    * 1：平台支持的对象 2：应用支持的部分对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectSupportType")
    @Expose
    private Long ObjectSupportType;

    /**
    * 1.接入层 2.逻辑层 3. 数据层
    */
    @SerializedName("ArchLayer")
    @Expose
    private Long ArchLayer;

    /**
     * Get 对象类型ID 
     * @return ObjectTypeId 对象类型ID
     */
    public Long getObjectTypeId() {
        return this.ObjectTypeId;
    }

    /**
     * Set 对象类型ID
     * @param ObjectTypeId 对象类型ID
     */
    public void setObjectTypeId(Long ObjectTypeId) {
        this.ObjectTypeId = ObjectTypeId;
    }

    /**
     * Get 对象类型名称 
     * @return ObjectTypeTitle 对象类型名称
     */
    public String getObjectTypeTitle() {
        return this.ObjectTypeTitle;
    }

    /**
     * Set 对象类型名称
     * @param ObjectTypeTitle 对象类型名称
     */
    public void setObjectTypeTitle(String ObjectTypeTitle) {
        this.ObjectTypeTitle = ObjectTypeTitle;
    }

    /**
     * Get 对象类型第一级 
     * @return ObjectTypeLevelOne 对象类型第一级
     */
    public String getObjectTypeLevelOne() {
        return this.ObjectTypeLevelOne;
    }

    /**
     * Set 对象类型第一级
     * @param ObjectTypeLevelOne 对象类型第一级
     */
    public void setObjectTypeLevelOne(String ObjectTypeLevelOne) {
        this.ObjectTypeLevelOne = ObjectTypeLevelOne;
    }

    /**
     * Get 对象类型参数 
     * @return ObjectTypeParams 对象类型参数
     */
    public ObjectTypeConfig getObjectTypeParams() {
        return this.ObjectTypeParams;
    }

    /**
     * Set 对象类型参数
     * @param ObjectTypeParams 对象类型参数
     */
    public void setObjectTypeParams(ObjectTypeConfig ObjectTypeParams) {
        this.ObjectTypeParams = ObjectTypeParams;
    }

    /**
     * Get tke接口json解析规则，null不需要解析
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectTypeJsonParse tke接口json解析规则，null不需要解析
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ObjectTypeJsonParse getObjectTypeJsonParse() {
        return this.ObjectTypeJsonParse;
    }

    /**
     * Set tke接口json解析规则，null不需要解析
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectTypeJsonParse tke接口json解析规则，null不需要解析
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectTypeJsonParse(ObjectTypeJsonParse ObjectTypeJsonParse) {
        this.ObjectTypeJsonParse = ObjectTypeJsonParse;
    }

    /**
     * Get 是否包含新动作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectHasNewAction 是否包含新动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getObjectHasNewAction() {
        return this.ObjectHasNewAction;
    }

    /**
     * Set 是否包含新动作
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectHasNewAction 是否包含新动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectHasNewAction(Boolean ObjectHasNewAction) {
        this.ObjectHasNewAction = ObjectHasNewAction;
    }

    /**
     * Get 对应在平台架构图中的资源类型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectPlatformName 对应在平台架构图中的资源类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getObjectPlatformName() {
        return this.ObjectPlatformName;
    }

    /**
     * Set 对应在平台架构图中的资源类型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectPlatformName 对应在平台架构图中的资源类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectPlatformName(String ObjectPlatformName) {
        this.ObjectPlatformName = ObjectPlatformName;
    }

    /**
     * Get 1：平台支持的对象 2：应用支持的部分对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectSupportType 1：平台支持的对象 2：应用支持的部分对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getObjectSupportType() {
        return this.ObjectSupportType;
    }

    /**
     * Set 1：平台支持的对象 2：应用支持的部分对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectSupportType 1：平台支持的对象 2：应用支持的部分对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectSupportType(Long ObjectSupportType) {
        this.ObjectSupportType = ObjectSupportType;
    }

    /**
     * Get 1.接入层 2.逻辑层 3. 数据层 
     * @return ArchLayer 1.接入层 2.逻辑层 3. 数据层
     */
    public Long getArchLayer() {
        return this.ArchLayer;
    }

    /**
     * Set 1.接入层 2.逻辑层 3. 数据层
     * @param ArchLayer 1.接入层 2.逻辑层 3. 数据层
     */
    public void setArchLayer(Long ArchLayer) {
        this.ArchLayer = ArchLayer;
    }

    public ObjectType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectType(ObjectType source) {
        if (source.ObjectTypeId != null) {
            this.ObjectTypeId = new Long(source.ObjectTypeId);
        }
        if (source.ObjectTypeTitle != null) {
            this.ObjectTypeTitle = new String(source.ObjectTypeTitle);
        }
        if (source.ObjectTypeLevelOne != null) {
            this.ObjectTypeLevelOne = new String(source.ObjectTypeLevelOne);
        }
        if (source.ObjectTypeParams != null) {
            this.ObjectTypeParams = new ObjectTypeConfig(source.ObjectTypeParams);
        }
        if (source.ObjectTypeJsonParse != null) {
            this.ObjectTypeJsonParse = new ObjectTypeJsonParse(source.ObjectTypeJsonParse);
        }
        if (source.ObjectHasNewAction != null) {
            this.ObjectHasNewAction = new Boolean(source.ObjectHasNewAction);
        }
        if (source.ObjectPlatformName != null) {
            this.ObjectPlatformName = new String(source.ObjectPlatformName);
        }
        if (source.ObjectSupportType != null) {
            this.ObjectSupportType = new Long(source.ObjectSupportType);
        }
        if (source.ArchLayer != null) {
            this.ArchLayer = new Long(source.ArchLayer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectTypeId", this.ObjectTypeId);
        this.setParamSimple(map, prefix + "ObjectTypeTitle", this.ObjectTypeTitle);
        this.setParamSimple(map, prefix + "ObjectTypeLevelOne", this.ObjectTypeLevelOne);
        this.setParamObj(map, prefix + "ObjectTypeParams.", this.ObjectTypeParams);
        this.setParamObj(map, prefix + "ObjectTypeJsonParse.", this.ObjectTypeJsonParse);
        this.setParamSimple(map, prefix + "ObjectHasNewAction", this.ObjectHasNewAction);
        this.setParamSimple(map, prefix + "ObjectPlatformName", this.ObjectPlatformName);
        this.setParamSimple(map, prefix + "ObjectSupportType", this.ObjectSupportType);
        this.setParamSimple(map, prefix + "ArchLayer", this.ArchLayer);

    }
}

