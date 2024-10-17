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

public class CreateNoticeContentRequest extends AbstractModel {

    /**
    * 模版名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模版内容语言。0：中文1：英文
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 模版详细配置。
    */
    @SerializedName("NoticeContents")
    @Expose
    private NoticeContent [] NoticeContents;

    /**
     * Get 模版名称。 
     * @return Name 模版名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模版名称。
     * @param Name 模版名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模版内容语言。0：中文1：英文 
     * @return Type 模版内容语言。0：中文1：英文
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 模版内容语言。0：中文1：英文
     * @param Type 模版内容语言。0：中文1：英文
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 模版详细配置。 
     * @return NoticeContents 模版详细配置。
     */
    public NoticeContent [] getNoticeContents() {
        return this.NoticeContents;
    }

    /**
     * Set 模版详细配置。
     * @param NoticeContents 模版详细配置。
     */
    public void setNoticeContents(NoticeContent [] NoticeContents) {
        this.NoticeContents = NoticeContents;
    }

    public CreateNoticeContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNoticeContentRequest(CreateNoticeContentRequest source) {
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "NoticeContents.", this.NoticeContents);

    }
}

