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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreCollection extends AbstractModel {

    /**
    * 待回档的原collection
    */
    @SerializedName("OldCollection")
    @Expose
    private String OldCollection;

    /**
    * 回档后的collection
    */
    @SerializedName("NewCollection")
    @Expose
    private String NewCollection;

    /**
     * Get 待回档的原collection 
     * @return OldCollection 待回档的原collection
     */
    public String getOldCollection() {
        return this.OldCollection;
    }

    /**
     * Set 待回档的原collection
     * @param OldCollection 待回档的原collection
     */
    public void setOldCollection(String OldCollection) {
        this.OldCollection = OldCollection;
    }

    /**
     * Get 回档后的collection 
     * @return NewCollection 回档后的collection
     */
    public String getNewCollection() {
        return this.NewCollection;
    }

    /**
     * Set 回档后的collection
     * @param NewCollection 回档后的collection
     */
    public void setNewCollection(String NewCollection) {
        this.NewCollection = NewCollection;
    }

    public RestoreCollection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreCollection(RestoreCollection source) {
        if (source.OldCollection != null) {
            this.OldCollection = new String(source.OldCollection);
        }
        if (source.NewCollection != null) {
            this.NewCollection = new String(source.NewCollection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldCollection", this.OldCollection);
        this.setParamSimple(map, prefix + "NewCollection", this.NewCollection);

    }
}

