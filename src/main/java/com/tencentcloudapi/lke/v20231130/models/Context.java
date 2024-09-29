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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Context extends AbstractModel {

    /**
    * 消息记录ID信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordBizId")
    @Expose
    private String RecordBizId;

    /**
    * 是否为用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsVisitor")
    @Expose
    private Boolean IsVisitor;

    /**
    * 昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 头像
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * 消息内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 文档信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileInfos")
    @Expose
    private MsgFileInfo [] FileInfos;

    /**
    * 回复方式，15：澄清确认回复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplyMethod")
    @Expose
    private Long ReplyMethod;

    /**
     * Get 消息记录ID信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordBizId 消息记录ID信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordBizId() {
        return this.RecordBizId;
    }

    /**
     * Set 消息记录ID信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordBizId 消息记录ID信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordBizId(String RecordBizId) {
        this.RecordBizId = RecordBizId;
    }

    /**
     * Get 是否为用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsVisitor 是否为用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsVisitor() {
        return this.IsVisitor;
    }

    /**
     * Set 是否为用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsVisitor 是否为用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsVisitor(Boolean IsVisitor) {
        this.IsVisitor = IsVisitor;
    }

    /**
     * Get 昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NickName 昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NickName 昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 头像
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Avatar 头像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set 头像
注意：此字段可能返回 null，表示取不到有效值。
     * @param Avatar 头像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get 消息内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 消息内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 消息内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 消息内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 文档信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileInfos 文档信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MsgFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set 文档信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileInfos 文档信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileInfos(MsgFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get 回复方式，15：澄清确认回复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplyMethod 回复方式，15：澄清确认回复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplyMethod() {
        return this.ReplyMethod;
    }

    /**
     * Set 回复方式，15：澄清确认回复
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplyMethod 回复方式，15：澄清确认回复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplyMethod(Long ReplyMethod) {
        this.ReplyMethod = ReplyMethod;
    }

    public Context() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Context(Context source) {
        if (source.RecordBizId != null) {
            this.RecordBizId = new String(source.RecordBizId);
        }
        if (source.IsVisitor != null) {
            this.IsVisitor = new Boolean(source.IsVisitor);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.FileInfos != null) {
            this.FileInfos = new MsgFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new MsgFileInfo(source.FileInfos[i]);
            }
        }
        if (source.ReplyMethod != null) {
            this.ReplyMethod = new Long(source.ReplyMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordBizId", this.RecordBizId);
        this.setParamSimple(map, prefix + "IsVisitor", this.IsVisitor);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamSimple(map, prefix + "ReplyMethod", this.ReplyMethod);

    }
}

