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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTagRequest extends AbstractModel {

    /**
    * 标签ID
    */
    @SerializedName("TagID")
    @Expose
    private Long TagID;

    /**
     * Get 标签ID 
     * @return TagID 标签ID
     */
    public Long getTagID() {
        return this.TagID;
    }

    /**
     * Set 标签ID
     * @param TagID 标签ID
     */
    public void setTagID(Long TagID) {
        this.TagID = TagID;
    }

    public DeleteTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTagRequest(DeleteTagRequest source) {
        if (source.TagID != null) {
            this.TagID = new Long(source.TagID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagID", this.TagID);

    }
}

