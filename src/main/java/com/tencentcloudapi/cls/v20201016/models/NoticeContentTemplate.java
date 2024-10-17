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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NoticeContentTemplate extends AbstractModel {

    /**
    * 通知内容模板ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeContentId")
    @Expose
    private String NoticeContentId;

    /**
    * 通知内容模板名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 语言类型。

0： 中文
1： 英文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 通知内容模板信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeContents")
    @Expose
    private NoticeContent [] NoticeContents;

    /**
    * 通知内容模板标记。

0： 用户自定义
1： 系统内置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * 创建者主账号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 创建/修改者子账号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubUin")
    @Expose
    private Long SubUin;

    /**
    * 创建时间 秒级时间戳。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间 秒级时间戳。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 通知内容模板ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeContentId 通知内容模板ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNoticeContentId() {
        return this.NoticeContentId;
    }

    /**
     * Set 通知内容模板ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeContentId 通知内容模板ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeContentId(String NoticeContentId) {
        this.NoticeContentId = NoticeContentId;
    }

    /**
     * Get 通知内容模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 通知内容模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 通知内容模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 通知内容模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 语言类型。

0： 中文
1： 英文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 语言类型。

0： 中文
1： 英文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 语言类型。

0： 中文
1： 英文
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 语言类型。

0： 中文
1： 英文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 通知内容模板信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeContents 通知内容模板信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NoticeContent [] getNoticeContents() {
        return this.NoticeContents;
    }

    /**
     * Set 通知内容模板信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeContents 通知内容模板信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeContents(NoticeContent [] NoticeContents) {
        this.NoticeContents = NoticeContents;
    }

    /**
     * Get 通知内容模板标记。

0： 用户自定义
1： 系统内置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Flag 通知内容模板标记。

0： 用户自定义
1： 系统内置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set 通知内容模板标记。

0： 用户自定义
1： 系统内置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Flag 通知内容模板标记。

0： 用户自定义
1： 系统内置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 创建者主账号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 创建者主账号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 创建者主账号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 创建者主账号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 创建/修改者子账号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubUin 创建/修改者子账号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 创建/修改者子账号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubUin 创建/修改者子账号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubUin(Long SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get 创建时间 秒级时间戳。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间 秒级时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间 秒级时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间 秒级时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 秒级时间戳。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间 秒级时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间 秒级时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间 秒级时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public NoticeContentTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeContentTemplate(NoticeContentTemplate source) {
        if (source.NoticeContentId != null) {
            this.NoticeContentId = new String(source.NoticeContentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.NoticeContents != null) {
            this.NoticeContents = new NoticeContent[source.NoticeContents.length];
            for (int i = 0; i < source.NoticeContents.length; i++) {
                this.NoticeContents[i] = new NoticeContent(source.NoticeContents[i]);
            }
        }
        if (source.Flag != null) {
            this.Flag = new Long(source.Flag);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new Long(source.SubUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeContentId", this.NoticeContentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "NoticeContents.", this.NoticeContents);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

