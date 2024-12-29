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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Bucket extends AbstractModel {

    /**
    * 无
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * key值出现的次数。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 无 
     * @return Key 无
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 无
     * @param Key 无
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get key值出现的次数。 
     * @return Count key值出现的次数。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set key值出现的次数。
     * @param Count key值出现的次数。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public Bucket() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Bucket(Bucket source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

