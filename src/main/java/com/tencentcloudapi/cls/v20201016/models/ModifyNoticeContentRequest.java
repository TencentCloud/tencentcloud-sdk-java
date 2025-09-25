/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class ModifyNoticeContentRequest extends AbstractModel {

    /**
    * 通知内容模板ID。-通过[获取通知内容模板](https://cloud.tencent.com/document/api/614/111714)获取通知内容模板ID
    */
    @SerializedName("NoticeContentId")
    @Expose
    private String NoticeContentId;

    /**
    * 通知内容模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 通知内容语言。

0：中文 1：英文
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 通知内容模板详细信息。
    */
    @SerializedName("NoticeContents")
    @Expose
    private NoticeContent [] NoticeContents;

    /**
     * Get 通知内容模板ID。-通过[获取通知内容模板](https://cloud.tencent.com/document/api/614/111714)获取通知内容模板ID 
     * @return NoticeContentId 通知内容模板ID。-通过[获取通知内容模板](https://cloud.tencent.com/document/api/614/111714)获取通知内容模板ID
     */
    public String getNoticeContentId() {
        return this.NoticeContentId;
    }

    /**
     * Set 通知内容模板ID。-通过[获取通知内容模板](https://cloud.tencent.com/document/api/614/111714)获取通知内容模板ID
     * @param NoticeContentId 通知内容模板ID。-通过[获取通知内容模板](https://cloud.tencent.com/document/api/614/111714)获取通知内容模板ID
     */
    public void setNoticeContentId(String NoticeContentId) {
        this.NoticeContentId = NoticeContentId;
    }

    /**
     * Get 通知内容模板名称。 
     * @return Name 通知内容模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 通知内容模板名称。
     * @param Name 通知内容模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 通知内容语言。

0：中文 1：英文 
     * @return Type 通知内容语言。

0：中文 1：英文
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 通知内容语言。

0：中文 1：英文
     * @param Type 通知内容语言。

0：中文 1：英文
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 通知内容模板详细信息。 
     * @return NoticeContents 通知内容模板详细信息。
     */
    public NoticeContent [] getNoticeContents() {
        return this.NoticeContents;
    }

    /**
     * Set 通知内容模板详细信息。
     * @param NoticeContents 通知内容模板详细信息。
     */
    public void setNoticeContents(NoticeContent [] NoticeContents) {
        this.NoticeContents = NoticeContents;
    }

    public ModifyNoticeContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNoticeContentRequest(ModifyNoticeContentRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeContentId", this.NoticeContentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "NoticeContents.", this.NoticeContents);

    }
}

