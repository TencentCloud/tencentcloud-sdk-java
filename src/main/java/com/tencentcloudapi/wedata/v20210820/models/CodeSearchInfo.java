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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CodeSearchInfo extends AbstractModel {

    /**
    * 文件或任务ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 文件或任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 文件或任务类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 命中内容，包括行号和文本内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private CodeMatchInfo [] Content;

    /**
    * 责任人名称
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 命中行数
    */
    @SerializedName("MatchRows")
    @Expose
    private Long MatchRows;

    /**
    * 提交调度时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubmitTime")
    @Expose
    private String SubmitTime;

    /**
    * 展示类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayType")
    @Expose
    private String DisplayType;

    /**
    * Cos路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
     * Get 文件或任务ID 
     * @return Id 文件或任务ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 文件或任务ID
     * @param Id 文件或任务ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 文件或任务名称 
     * @return Name 文件或任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 文件或任务名称
     * @param Name 文件或任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 文件或任务类型 
     * @return Type 文件或任务类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 文件或任务类型
     * @param Type 文件或任务类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 命中内容，包括行号和文本内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 命中内容，包括行号和文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CodeMatchInfo [] getContent() {
        return this.Content;
    }

    /**
     * Set 命中内容，包括行号和文本内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 命中内容，包括行号和文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(CodeMatchInfo [] Content) {
        this.Content = Content;
    }

    /**
     * Get 责任人名称 
     * @return OwnerName 责任人名称
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set 责任人名称
     * @param OwnerName 责任人名称
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 命中行数 
     * @return MatchRows 命中行数
     */
    public Long getMatchRows() {
        return this.MatchRows;
    }

    /**
     * Set 命中行数
     * @param MatchRows 命中行数
     */
    public void setMatchRows(Long MatchRows) {
        this.MatchRows = MatchRows;
    }

    /**
     * Get 提交调度时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubmitTime 提交调度时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubmitTime() {
        return this.SubmitTime;
    }

    /**
     * Set 提交调度时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubmitTime 提交调度时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmitTime(String SubmitTime) {
        this.SubmitTime = SubmitTime;
    }

    /**
     * Get 展示类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayType 展示类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayType() {
        return this.DisplayType;
    }

    /**
     * Set 展示类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayType 展示类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayType(String DisplayType) {
        this.DisplayType = DisplayType;
    }

    /**
     * Get Cos路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosPath Cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosPath() {
        return this.CosPath;
    }

    /**
     * Set Cos路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosPath Cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosPath(String CosPath) {
        this.CosPath = CosPath;
    }

    public CodeSearchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CodeSearchInfo(CodeSearchInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Content != null) {
            this.Content = new CodeMatchInfo[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new CodeMatchInfo(source.Content[i]);
            }
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MatchRows != null) {
            this.MatchRows = new Long(source.MatchRows);
        }
        if (source.SubmitTime != null) {
            this.SubmitTime = new String(source.SubmitTime);
        }
        if (source.DisplayType != null) {
            this.DisplayType = new String(source.DisplayType);
        }
        if (source.CosPath != null) {
            this.CosPath = new String(source.CosPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MatchRows", this.MatchRows);
        this.setParamSimple(map, prefix + "SubmitTime", this.SubmitTime);
        this.setParamSimple(map, prefix + "DisplayType", this.DisplayType);
        this.setParamSimple(map, prefix + "CosPath", this.CosPath);

    }
}

