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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDownloadRecordRequest extends AbstractModel{

    /**
    * 记录id
    */
    @SerializedName("Flow")
    @Expose
    private String Flow;

    /**
     * Get 记录id 
     * @return Flow 记录id
     */
    public String getFlow() {
        return this.Flow;
    }

    /**
     * Set 记录id
     * @param Flow 记录id
     */
    public void setFlow(String Flow) {
        this.Flow = Flow;
    }

    public DeleteDownloadRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDownloadRecordRequest(DeleteDownloadRecordRequest source) {
        if (source.Flow != null) {
            this.Flow = new String(source.Flow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Flow", this.Flow);

    }
}

