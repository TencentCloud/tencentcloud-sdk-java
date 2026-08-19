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

public class DescribeAIAnalysisHistoryRequest extends AbstractModel {

    /**
    * <p>过滤器</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * <p>sessionID，用于游标分页</p>
    */
    @SerializedName("SessionID")
    @Expose
    private String SessionID;

    /**
     * Get <p>过滤器</p> 
     * @return Filter <p>过滤器</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>过滤器</p>
     * @param Filter <p>过滤器</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>sessionID，用于游标分页</p> 
     * @return SessionID <p>sessionID，用于游标分页</p>
     */
    public String getSessionID() {
        return this.SessionID;
    }

    /**
     * Set <p>sessionID，用于游标分页</p>
     * @param SessionID <p>sessionID，用于游标分页</p>
     */
    public void setSessionID(String SessionID) {
        this.SessionID = SessionID;
    }

    public DescribeAIAnalysisHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIAnalysisHistoryRequest(DescribeAIAnalysisHistoryRequest source) {
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.SessionID != null) {
            this.SessionID = new String(source.SessionID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "SessionID", this.SessionID);

    }
}

