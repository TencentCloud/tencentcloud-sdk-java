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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePresignedNotebookInstanceUrlRequest extends AbstractModel{

    /**
    * Notebook实例名称
规则：“^\[a-zA-Z0-9\](-\*\[a-zA-Z0-9\])\*$”
    */
    @SerializedName("NotebookInstanceName")
    @Expose
    private String NotebookInstanceName;

    /**
    * session有效时间，秒，取值范围[1800, 43200]
    */
    @SerializedName("SessionExpirationDurationInSeconds")
    @Expose
    private Long SessionExpirationDurationInSeconds;

    /**
     * Get Notebook实例名称
规则：“^\[a-zA-Z0-9\](-\*\[a-zA-Z0-9\])\*$” 
     * @return NotebookInstanceName Notebook实例名称
规则：“^\[a-zA-Z0-9\](-\*\[a-zA-Z0-9\])\*$”
     */
    public String getNotebookInstanceName() {
        return this.NotebookInstanceName;
    }

    /**
     * Set Notebook实例名称
规则：“^\[a-zA-Z0-9\](-\*\[a-zA-Z0-9\])\*$”
     * @param NotebookInstanceName Notebook实例名称
规则：“^\[a-zA-Z0-9\](-\*\[a-zA-Z0-9\])\*$”
     */
    public void setNotebookInstanceName(String NotebookInstanceName) {
        this.NotebookInstanceName = NotebookInstanceName;
    }

    /**
     * Get session有效时间，秒，取值范围[1800, 43200] 
     * @return SessionExpirationDurationInSeconds session有效时间，秒，取值范围[1800, 43200]
     */
    public Long getSessionExpirationDurationInSeconds() {
        return this.SessionExpirationDurationInSeconds;
    }

    /**
     * Set session有效时间，秒，取值范围[1800, 43200]
     * @param SessionExpirationDurationInSeconds session有效时间，秒，取值范围[1800, 43200]
     */
    public void setSessionExpirationDurationInSeconds(Long SessionExpirationDurationInSeconds) {
        this.SessionExpirationDurationInSeconds = SessionExpirationDurationInSeconds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotebookInstanceName", this.NotebookInstanceName);
        this.setParamSimple(map, prefix + "SessionExpirationDurationInSeconds", this.SessionExpirationDurationInSeconds);

    }
}

