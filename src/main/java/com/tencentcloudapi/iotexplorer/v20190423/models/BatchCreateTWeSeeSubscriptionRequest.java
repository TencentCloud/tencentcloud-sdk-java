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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchCreateTWeSeeSubscriptionRequest extends AbstractModel {

    /**
    * 待开通的订阅列表
    */
    @SerializedName("Entries")
    @Expose
    private SeeCreateSubscriptionEntry [] Entries;

    /**
     * Get 待开通的订阅列表 
     * @return Entries 待开通的订阅列表
     */
    public SeeCreateSubscriptionEntry [] getEntries() {
        return this.Entries;
    }

    /**
     * Set 待开通的订阅列表
     * @param Entries 待开通的订阅列表
     */
    public void setEntries(SeeCreateSubscriptionEntry [] Entries) {
        this.Entries = Entries;
    }

    public BatchCreateTWeSeeSubscriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCreateTWeSeeSubscriptionRequest(BatchCreateTWeSeeSubscriptionRequest source) {
        if (source.Entries != null) {
            this.Entries = new SeeCreateSubscriptionEntry[source.Entries.length];
            for (int i = 0; i < source.Entries.length; i++) {
                this.Entries[i] = new SeeCreateSubscriptionEntry(source.Entries[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Entries.", this.Entries);

    }
}

