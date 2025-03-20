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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsrHotwordsSet extends AbstractModel {

    /**
    * 热词库 Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HotwordsId")
    @Expose
    private String HotwordsId;

    /**
    * 当前热词库状态，数值表示绑定该热词库的智能字幕模板数量。
Status 为 0 ，表示该热词库没有被智能字幕模版引用可以删除；
Status 不为 0，表示该热词库不能被删除。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 热词库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 热词库中的热词数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WordCount")
    @Expose
    private Long WordCount;

    /**
    * 热词文件上传时的文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 热词库创建时间 ISOUTC 时间格式  2006-01-02T15:04:05Z
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 热词库创建时间 ISOUTC 时间格式  2006-01-02T15:04:05Z
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 0：临时热词库
1：文件热词库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 热词库 Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HotwordsId 热词库 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHotwordsId() {
        return this.HotwordsId;
    }

    /**
     * Set 热词库 Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param HotwordsId 热词库 Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHotwordsId(String HotwordsId) {
        this.HotwordsId = HotwordsId;
    }

    /**
     * Get 当前热词库状态，数值表示绑定该热词库的智能字幕模板数量。
Status 为 0 ，表示该热词库没有被智能字幕模版引用可以删除；
Status 不为 0，表示该热词库不能被删除。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 当前热词库状态，数值表示绑定该热词库的智能字幕模板数量。
Status 为 0 ，表示该热词库没有被智能字幕模版引用可以删除；
Status 不为 0，表示该热词库不能被删除。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 当前热词库状态，数值表示绑定该热词库的智能字幕模板数量。
Status 为 0 ，表示该热词库没有被智能字幕模版引用可以删除；
Status 不为 0，表示该热词库不能被删除。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 当前热词库状态，数值表示绑定该热词库的智能字幕模板数量。
Status 为 0 ，表示该热词库没有被智能字幕模版引用可以删除；
Status 不为 0，表示该热词库不能被删除。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 热词库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 热词库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 热词库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 热词库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 热词库中的热词数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WordCount 热词库中的热词数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWordCount() {
        return this.WordCount;
    }

    /**
     * Set 热词库中的热词数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param WordCount 热词库中的热词数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWordCount(Long WordCount) {
        this.WordCount = WordCount;
    }

    /**
     * Get 热词文件上传时的文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 热词文件上传时的文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 热词文件上传时的文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 热词文件上传时的文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 热词库创建时间 ISOUTC 时间格式  2006-01-02T15:04:05Z
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 热词库创建时间 ISOUTC 时间格式  2006-01-02T15:04:05Z
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 热词库创建时间 ISOUTC 时间格式  2006-01-02T15:04:05Z
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 热词库创建时间 ISOUTC 时间格式  2006-01-02T15:04:05Z
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 热词库创建时间 ISOUTC 时间格式  2006-01-02T15:04:05Z
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 热词库创建时间 ISOUTC 时间格式  2006-01-02T15:04:05Z
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 热词库创建时间 ISOUTC 时间格式  2006-01-02T15:04:05Z
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 热词库创建时间 ISOUTC 时间格式  2006-01-02T15:04:05Z
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 0：临时热词库
1：文件热词库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 0：临时热词库
1：文件热词库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0：临时热词库
1：文件热词库
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 0：临时热词库
1：文件热词库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public AsrHotwordsSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsrHotwordsSet(AsrHotwordsSet source) {
        if (source.HotwordsId != null) {
            this.HotwordsId = new String(source.HotwordsId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.WordCount != null) {
            this.WordCount = new Long(source.WordCount);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HotwordsId", this.HotwordsId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "WordCount", this.WordCount);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

