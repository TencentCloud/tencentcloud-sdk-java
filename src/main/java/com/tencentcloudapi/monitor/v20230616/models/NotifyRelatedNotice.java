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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotifyRelatedNotice extends AbstractModel {

    /**
    * 通知模板ID
    */
    @SerializedName("NoticeId")
    @Expose
    private String NoticeId;

    /**
    * 通知模板的名称
    */
    @SerializedName("NoticeName")
    @Expose
    private String NoticeName;

    /**
     * Get 通知模板ID 
     * @return NoticeId 通知模板ID
     */
    public String getNoticeId() {
        return this.NoticeId;
    }

    /**
     * Set 通知模板ID
     * @param NoticeId 通知模板ID
     */
    public void setNoticeId(String NoticeId) {
        this.NoticeId = NoticeId;
    }

    /**
     * Get 通知模板的名称 
     * @return NoticeName 通知模板的名称
     */
    public String getNoticeName() {
        return this.NoticeName;
    }

    /**
     * Set 通知模板的名称
     * @param NoticeName 通知模板的名称
     */
    public void setNoticeName(String NoticeName) {
        this.NoticeName = NoticeName;
    }

    public NotifyRelatedNotice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotifyRelatedNotice(NotifyRelatedNotice source) {
        if (source.NoticeId != null) {
            this.NoticeId = new String(source.NoticeId);
        }
        if (source.NoticeName != null) {
            this.NoticeName = new String(source.NoticeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeId", this.NoticeId);
        this.setParamSimple(map, prefix + "NoticeName", this.NoticeName);

    }
}

