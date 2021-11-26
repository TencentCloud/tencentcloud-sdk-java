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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateListInfo extends AbstractModel{

    /**
    * 模版ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 模版名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * IP模版
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpString")
    @Expose
    private String IpString;

    /**
    * 插入时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 模版类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 关联规则条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RulesNum")
    @Expose
    private Long RulesNum;

    /**
     * Get 模版ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uuid 模版ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 模版ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uuid 模版ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 模版名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 模版名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模版名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 模版名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Detail 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Detail 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get IP模版
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpString IP模版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpString() {
        return this.IpString;
    }

    /**
     * Set IP模版
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpString IP模版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpString(String IpString) {
        this.IpString = IpString;
    }

    /**
     * Get 插入时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InsertTime 插入时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 插入时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InsertTime 插入时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 模版类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 模版类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 模版类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 模版类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 关联规则条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RulesNum 关联规则条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRulesNum() {
        return this.RulesNum;
    }

    /**
     * Set 关联规则条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RulesNum 关联规则条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRulesNum(Long RulesNum) {
        this.RulesNum = RulesNum;
    }

    public TemplateListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateListInfo(TemplateListInfo source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.IpString != null) {
            this.IpString = new String(source.IpString);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.RulesNum != null) {
            this.RulesNum = new Long(source.RulesNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "IpString", this.IpString);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RulesNum", this.RulesNum);

    }
}

