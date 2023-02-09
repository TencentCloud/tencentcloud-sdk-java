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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNotebookSessionStatementsRequest extends AbstractModel{

    /**
    * Session唯一标识
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 批任务id
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
     * Get Session唯一标识 
     * @return SessionId Session唯一标识
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session唯一标识
     * @param SessionId Session唯一标识
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 批任务id 
     * @return BatchId 批任务id
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批任务id
     * @param BatchId 批任务id
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    public DescribeNotebookSessionStatementsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNotebookSessionStatementsRequest(DescribeNotebookSessionStatementsRequest source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);

    }
}

