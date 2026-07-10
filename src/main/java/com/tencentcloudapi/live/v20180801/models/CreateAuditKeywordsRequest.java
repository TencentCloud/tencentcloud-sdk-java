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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAuditKeywordsRequest extends AbstractModel {

    /**
    * <p>关键词列表。</p>
    */
    @SerializedName("Keywords")
    @Expose
    private AuditKeyword [] Keywords;

    /**
    * <p>直播审核词库Id。</p>
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
     * Get <p>关键词列表。</p> 
     * @return Keywords <p>关键词列表。</p>
     */
    public AuditKeyword [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set <p>关键词列表。</p>
     * @param Keywords <p>关键词列表。</p>
     */
    public void setKeywords(AuditKeyword [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get <p>直播审核词库Id。</p> 
     * @return LibId <p>直播审核词库Id。</p>
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set <p>直播审核词库Id。</p>
     * @param LibId <p>直播审核词库Id。</p>
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    public CreateAuditKeywordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAuditKeywordsRequest(CreateAuditKeywordsRequest source) {
        if (source.Keywords != null) {
            this.Keywords = new AuditKeyword[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new AuditKeyword(source.Keywords[i]);
            }
        }
        if (source.LibId != null) {
            this.LibId = new String(source.LibId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "LibId", this.LibId);

    }
}

