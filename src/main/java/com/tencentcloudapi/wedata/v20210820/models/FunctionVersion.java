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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionVersion extends AbstractModel{

    /**
    * 版本号：V0 V1 V2
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 提交人 ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 变更类型：ADD、MODIFY
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 备注
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 提交时间: UTC 秒数
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 提交人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 版本内容：json string 格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 版本号：V0 V1 V2 
     * @return Tag 版本号：V0 V1 V2
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 版本号：V0 V1 V2
     * @param Tag 版本号：V0 V1 V2
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 提交人 ID 
     * @return UserId 提交人 ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 提交人 ID
     * @param UserId 提交人 ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 变更类型：ADD、MODIFY 
     * @return Type 变更类型：ADD、MODIFY
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 变更类型：ADD、MODIFY
     * @param Type 变更类型：ADD、MODIFY
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 备注 
     * @return Comment 备注
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 备注
     * @param Comment 备注
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 提交时间: UTC 秒数 
     * @return Timestamp 提交时间: UTC 秒数
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 提交时间: UTC 秒数
     * @param Timestamp 提交时间: UTC 秒数
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 提交人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 提交人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 提交人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 提交人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 版本内容：json string 格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 版本内容：json string 格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 版本内容：json string 格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 版本内容：json string 格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public FunctionVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionVersion(FunctionVersion source) {
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

