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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenEmergentMsg extends AbstractModel {

    /**
    * 通知标签/标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 通知内容
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 跳转类型：0=漏洞管理
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 通知标签/标题 
     * @return Title 通知标签/标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 通知标签/标题
     * @param Title 通知标签/标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 通知内容 
     * @return Text 通知内容
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 通知内容
     * @param Text 通知内容
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 跳转类型：0=漏洞管理 
     * @return Type 跳转类型：0=漏洞管理
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 跳转类型：0=漏洞管理
     * @param Type 跳转类型：0=漏洞管理
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ScreenEmergentMsg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenEmergentMsg(ScreenEmergentMsg source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

