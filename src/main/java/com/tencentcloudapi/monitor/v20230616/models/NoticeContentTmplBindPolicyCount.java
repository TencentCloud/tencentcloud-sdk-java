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

public class NoticeContentTmplBindPolicyCount extends AbstractModel {

    /**
    * 通知内容模板ID
    */
    @SerializedName("NoticeContentTmplID")
    @Expose
    private String NoticeContentTmplID;

    /**
    * 绑定告警策略数量
    */
    @SerializedName("BindCount")
    @Expose
    private Long BindCount;

    /**
     * Get 通知内容模板ID 
     * @return NoticeContentTmplID 通知内容模板ID
     */
    public String getNoticeContentTmplID() {
        return this.NoticeContentTmplID;
    }

    /**
     * Set 通知内容模板ID
     * @param NoticeContentTmplID 通知内容模板ID
     */
    public void setNoticeContentTmplID(String NoticeContentTmplID) {
        this.NoticeContentTmplID = NoticeContentTmplID;
    }

    /**
     * Get 绑定告警策略数量 
     * @return BindCount 绑定告警策略数量
     */
    public Long getBindCount() {
        return this.BindCount;
    }

    /**
     * Set 绑定告警策略数量
     * @param BindCount 绑定告警策略数量
     */
    public void setBindCount(Long BindCount) {
        this.BindCount = BindCount;
    }

    public NoticeContentTmplBindPolicyCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeContentTmplBindPolicyCount(NoticeContentTmplBindPolicyCount source) {
        if (source.NoticeContentTmplID != null) {
            this.NoticeContentTmplID = new String(source.NoticeContentTmplID);
        }
        if (source.BindCount != null) {
            this.BindCount = new Long(source.BindCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoticeContentTmplID", this.NoticeContentTmplID);
        this.setParamSimple(map, prefix + "BindCount", this.BindCount);

    }
}

