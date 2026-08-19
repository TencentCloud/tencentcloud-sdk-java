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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIAnalysisSession extends AbstractModel {

    /**
    * 标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 会话ID
    */
    @SerializedName("SessionID")
    @Expose
    private String SessionID;

    /**
    * 最后修改的时间戳
    */
    @SerializedName("ModifyTime")
    @Expose
    private Long ModifyTime;

    /**
    * 是否置顶
    */
    @SerializedName("IsPinned")
    @Expose
    private Boolean IsPinned;

    /**
     * Get 标题 
     * @return Title 标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 标题
     * @param Title 标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 会话ID 
     * @return SessionID 会话ID
     */
    public String getSessionID() {
        return this.SessionID;
    }

    /**
     * Set 会话ID
     * @param SessionID 会话ID
     */
    public void setSessionID(String SessionID) {
        this.SessionID = SessionID;
    }

    /**
     * Get 最后修改的时间戳 
     * @return ModifyTime 最后修改的时间戳
     */
    public Long getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最后修改的时间戳
     * @param ModifyTime 最后修改的时间戳
     */
    public void setModifyTime(Long ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 是否置顶 
     * @return IsPinned 是否置顶
     */
    public Boolean getIsPinned() {
        return this.IsPinned;
    }

    /**
     * Set 是否置顶
     * @param IsPinned 是否置顶
     */
    public void setIsPinned(Boolean IsPinned) {
        this.IsPinned = IsPinned;
    }

    public AIAnalysisSession() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAnalysisSession(AIAnalysisSession source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.SessionID != null) {
            this.SessionID = new String(source.SessionID);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new Long(source.ModifyTime);
        }
        if (source.IsPinned != null) {
            this.IsPinned = new Boolean(source.IsPinned);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "SessionID", this.SessionID);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "IsPinned", this.IsPinned);

    }
}

