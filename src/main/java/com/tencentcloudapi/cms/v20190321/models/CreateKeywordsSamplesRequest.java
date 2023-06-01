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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateKeywordsSamplesRequest extends AbstractModel{

    /**
    * 关键词库信息：单次限制写入2000个，词库总容量不可超过10000个。
    */
    @SerializedName("UserKeywords")
    @Expose
    private UserKeyword [] UserKeywords;

    /**
    * 词库ID
    */
    @SerializedName("LibID")
    @Expose
    private String LibID;

    /**
     * Get 关键词库信息：单次限制写入2000个，词库总容量不可超过10000个。 
     * @return UserKeywords 关键词库信息：单次限制写入2000个，词库总容量不可超过10000个。
     */
    public UserKeyword [] getUserKeywords() {
        return this.UserKeywords;
    }

    /**
     * Set 关键词库信息：单次限制写入2000个，词库总容量不可超过10000个。
     * @param UserKeywords 关键词库信息：单次限制写入2000个，词库总容量不可超过10000个。
     */
    public void setUserKeywords(UserKeyword [] UserKeywords) {
        this.UserKeywords = UserKeywords;
    }

    /**
     * Get 词库ID 
     * @return LibID 词库ID
     */
    public String getLibID() {
        return this.LibID;
    }

    /**
     * Set 词库ID
     * @param LibID 词库ID
     */
    public void setLibID(String LibID) {
        this.LibID = LibID;
    }

    public CreateKeywordsSamplesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKeywordsSamplesRequest(CreateKeywordsSamplesRequest source) {
        if (source.UserKeywords != null) {
            this.UserKeywords = new UserKeyword[source.UserKeywords.length];
            for (int i = 0; i < source.UserKeywords.length; i++) {
                this.UserKeywords[i] = new UserKeyword(source.UserKeywords[i]);
            }
        }
        if (source.LibID != null) {
            this.LibID = new String(source.LibID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "UserKeywords.", this.UserKeywords);
        this.setParamSimple(map, prefix + "LibID", this.LibID);

    }
}

