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

public class ListAIWorkbenchMessagesRequest extends AbstractModel {

    /**
    * <p>会话 ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>游标分页的定位标记</p>
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * <p>窗口大小</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>拉取顺序</p>
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
     * Get <p>会话 ID</p> 
     * @return SessionId <p>会话 ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话 ID</p>
     * @param SessionId <p>会话 ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>游标分页的定位标记</p> 
     * @return Cursor <p>游标分页的定位标记</p>
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set <p>游标分页的定位标记</p>
     * @param Cursor <p>游标分页的定位标记</p>
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get <p>窗口大小</p> 
     * @return Limit <p>窗口大小</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>窗口大小</p>
     * @param Limit <p>窗口大小</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>拉取顺序</p> 
     * @return Direction <p>拉取顺序</p>
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>拉取顺序</p>
     * @param Direction <p>拉取顺序</p>
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public ListAIWorkbenchMessagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAIWorkbenchMessagesRequest(ListAIWorkbenchMessagesRequest source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

