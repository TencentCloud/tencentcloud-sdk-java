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

public class DescribeAIAnalysisRecommendQuestionsRequest extends AbstractModel {

    /**
    * <p>问答的SessionID</p>
    */
    @SerializedName("SessionID")
    @Expose
    private String SessionID;

    /**
     * Get <p>问答的SessionID</p> 
     * @return SessionID <p>问答的SessionID</p>
     */
    public String getSessionID() {
        return this.SessionID;
    }

    /**
     * Set <p>问答的SessionID</p>
     * @param SessionID <p>问答的SessionID</p>
     */
    public void setSessionID(String SessionID) {
        this.SessionID = SessionID;
    }

    public DescribeAIAnalysisRecommendQuestionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIAnalysisRecommendQuestionsRequest(DescribeAIAnalysisRecommendQuestionsRequest source) {
        if (source.SessionID != null) {
            this.SessionID = new String(source.SessionID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionID", this.SessionID);

    }
}

