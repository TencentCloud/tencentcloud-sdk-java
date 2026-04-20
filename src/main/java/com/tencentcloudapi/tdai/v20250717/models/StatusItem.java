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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatusItem extends AbstractModel {

    /**
    * <p>无</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>无</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get <p>无</p> 
     * @return Status <p>无</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>无</p>
     * @param Status <p>无</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>无</p> 
     * @return Count <p>无</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>无</p>
     * @param Count <p>无</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public StatusItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatusItem(StatusItem source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

