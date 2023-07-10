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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongServicePreview extends AbstractModel{

    /**
    * 服务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 服务名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 后端配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamInfo")
    @Expose
    private KongUpstreamInfo UpstreamInfo;

    /**
    * 后端类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamType")
    @Expose
    private String UpstreamType;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 是否可编辑
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Editable")
    @Expose
    private Boolean Editable;

    /**
     * Get 服务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 服务名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 服务名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 服务名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 后端配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamInfo 后端配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KongUpstreamInfo getUpstreamInfo() {
        return this.UpstreamInfo;
    }

    /**
     * Set 后端配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamInfo 后端配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamInfo(KongUpstreamInfo UpstreamInfo) {
        this.UpstreamInfo = UpstreamInfo;
    }

    /**
     * Get 后端类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamType 后端类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set 后端类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamType 后端类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamType(String UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 是否可编辑
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Editable 是否可编辑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEditable() {
        return this.Editable;
    }

    /**
     * Set 是否可编辑
注意：此字段可能返回 null，表示取不到有效值。
     * @param Editable 是否可编辑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEditable(Boolean Editable) {
        this.Editable = Editable;
    }

    public KongServicePreview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongServicePreview(KongServicePreview source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.UpstreamInfo != null) {
            this.UpstreamInfo = new KongUpstreamInfo(source.UpstreamInfo);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new String(source.UpstreamType);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Editable != null) {
            this.Editable = new Boolean(source.Editable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "UpstreamInfo.", this.UpstreamInfo);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Editable", this.Editable);

    }
}

