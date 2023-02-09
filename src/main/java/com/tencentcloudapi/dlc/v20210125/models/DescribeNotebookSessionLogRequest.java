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

public class DescribeNotebookSessionLogRequest extends AbstractModel{

    /**
    * Session唯一标识
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 分页参数，默认200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
     * Get 分页参数，默认200 
     * @return Limit 分页参数，默认200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，默认200
     * @param Limit 分页参数，默认200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数，默认0 
     * @return Offset 分页参数，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，默认0
     * @param Offset 分页参数，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeNotebookSessionLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNotebookSessionLogRequest(DescribeNotebookSessionLogRequest source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

