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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MatchKBPURLListRequest extends AbstractModel{

    /**
    * SHA1。
    */
    @SerializedName("SHA1")
    @Expose
    private String SHA1;

    /**
     * Get SHA1。 
     * @return SHA1 SHA1。
     */
    public String getSHA1() {
        return this.SHA1;
    }

    /**
     * Set SHA1。
     * @param SHA1 SHA1。
     */
    public void setSHA1(String SHA1) {
        this.SHA1 = SHA1;
    }

    public MatchKBPURLListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MatchKBPURLListRequest(MatchKBPURLListRequest source) {
        if (source.SHA1 != null) {
            this.SHA1 = new String(source.SHA1);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SHA1", this.SHA1);

    }
}

