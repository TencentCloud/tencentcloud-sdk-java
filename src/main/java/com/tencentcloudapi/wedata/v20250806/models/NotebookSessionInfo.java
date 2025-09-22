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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotebookSessionInfo extends AbstractModel {

    /**
    * 会话ID
    */
    @SerializedName("NotebookSessionId")
    @Expose
    private String NotebookSessionId;

    /**
    * 会话名称
    */
    @SerializedName("NotebookSessionName")
    @Expose
    private String NotebookSessionName;

    /**
     * Get 会话ID 
     * @return NotebookSessionId 会话ID
     */
    public String getNotebookSessionId() {
        return this.NotebookSessionId;
    }

    /**
     * Set 会话ID
     * @param NotebookSessionId 会话ID
     */
    public void setNotebookSessionId(String NotebookSessionId) {
        this.NotebookSessionId = NotebookSessionId;
    }

    /**
     * Get 会话名称 
     * @return NotebookSessionName 会话名称
     */
    public String getNotebookSessionName() {
        return this.NotebookSessionName;
    }

    /**
     * Set 会话名称
     * @param NotebookSessionName 会话名称
     */
    public void setNotebookSessionName(String NotebookSessionName) {
        this.NotebookSessionName = NotebookSessionName;
    }

    public NotebookSessionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotebookSessionInfo(NotebookSessionInfo source) {
        if (source.NotebookSessionId != null) {
            this.NotebookSessionId = new String(source.NotebookSessionId);
        }
        if (source.NotebookSessionName != null) {
            this.NotebookSessionName = new String(source.NotebookSessionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotebookSessionId", this.NotebookSessionId);
        this.setParamSimple(map, prefix + "NotebookSessionName", this.NotebookSessionName);

    }
}

