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

public class DeleteNoticeContentTmplsRequest extends AbstractModel {

    /**
    * 要删除的模板id
    */
    @SerializedName("TmplIDs")
    @Expose
    private String [] TmplIDs;

    /**
     * Get 要删除的模板id 
     * @return TmplIDs 要删除的模板id
     */
    public String [] getTmplIDs() {
        return this.TmplIDs;
    }

    /**
     * Set 要删除的模板id
     * @param TmplIDs 要删除的模板id
     */
    public void setTmplIDs(String [] TmplIDs) {
        this.TmplIDs = TmplIDs;
    }

    public DeleteNoticeContentTmplsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteNoticeContentTmplsRequest(DeleteNoticeContentTmplsRequest source) {
        if (source.TmplIDs != null) {
            this.TmplIDs = new String[source.TmplIDs.length];
            for (int i = 0; i < source.TmplIDs.length; i++) {
                this.TmplIDs[i] = new String(source.TmplIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TmplIDs.", this.TmplIDs);

    }
}

