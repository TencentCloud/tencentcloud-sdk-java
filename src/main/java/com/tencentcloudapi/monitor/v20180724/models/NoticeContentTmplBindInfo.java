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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NoticeContentTmplBindInfo extends AbstractModel {

    /**
    * 通知内容模板ID
    */
    @SerializedName("ContentTmplID")
    @Expose
    private String ContentTmplID;

    /**
    * 通知模板ID
    */
    @SerializedName("NoticeID")
    @Expose
    private String NoticeID;

    /**
     * Get 通知内容模板ID 
     * @return ContentTmplID 通知内容模板ID
     */
    public String getContentTmplID() {
        return this.ContentTmplID;
    }

    /**
     * Set 通知内容模板ID
     * @param ContentTmplID 通知内容模板ID
     */
    public void setContentTmplID(String ContentTmplID) {
        this.ContentTmplID = ContentTmplID;
    }

    /**
     * Get 通知模板ID 
     * @return NoticeID 通知模板ID
     */
    public String getNoticeID() {
        return this.NoticeID;
    }

    /**
     * Set 通知模板ID
     * @param NoticeID 通知模板ID
     */
    public void setNoticeID(String NoticeID) {
        this.NoticeID = NoticeID;
    }

    public NoticeContentTmplBindInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeContentTmplBindInfo(NoticeContentTmplBindInfo source) {
        if (source.ContentTmplID != null) {
            this.ContentTmplID = new String(source.ContentTmplID);
        }
        if (source.NoticeID != null) {
            this.NoticeID = new String(source.NoticeID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentTmplID", this.ContentTmplID);
        this.setParamSimple(map, prefix + "NoticeID", this.NoticeID);

    }
}

