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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DMSColumn extends AbstractModel{

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 排序
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * 附加参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Params")
    @Expose
    private KVPair [] Params;

    /**
    * 业务参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizParams")
    @Expose
    private KVPair [] BizParams;

    /**
    * 是否分区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPartition")
    @Expose
    private Boolean IsPartition;

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 排序
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position 排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set 排序
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position 排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get 附加参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Params 附加参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVPair [] getParams() {
        return this.Params;
    }

    /**
     * Set 附加参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Params 附加参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParams(KVPair [] Params) {
        this.Params = Params;
    }

    /**
     * Get 业务参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizParams 业务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KVPair [] getBizParams() {
        return this.BizParams;
    }

    /**
     * Set 业务参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizParams 业务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizParams(KVPair [] BizParams) {
        this.BizParams = BizParams;
    }

    /**
     * Get 是否分区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPartition 是否分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPartition() {
        return this.IsPartition;
    }

    /**
     * Set 是否分区
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPartition 是否分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPartition(Boolean IsPartition) {
        this.IsPartition = IsPartition;
    }

    public DMSColumn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DMSColumn(DMSColumn source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.Params != null) {
            this.Params = new KVPair[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new KVPair(source.Params[i]);
            }
        }
        if (source.BizParams != null) {
            this.BizParams = new KVPair[source.BizParams.length];
            for (int i = 0; i < source.BizParams.length; i++) {
                this.BizParams[i] = new KVPair(source.BizParams[i]);
            }
        }
        if (source.IsPartition != null) {
            this.IsPartition = new Boolean(source.IsPartition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamArrayObj(map, prefix + "BizParams.", this.BizParams);
        this.setParamSimple(map, prefix + "IsPartition", this.IsPartition);

    }
}

