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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKBComponentRequest extends AbstractModel {

    /**
    * 组件的PURL
    */
    @SerializedName("PURL")
    @Expose
    private PURL PURL;

    /**
     * Get 组件的PURL 
     * @return PURL 组件的PURL
     */
    public PURL getPURL() {
        return this.PURL;
    }

    /**
     * Set 组件的PURL
     * @param PURL 组件的PURL
     */
    public void setPURL(PURL PURL) {
        this.PURL = PURL;
    }

    public DescribeKBComponentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKBComponentRequest(DescribeKBComponentRequest source) {
        if (source.PURL != null) {
            this.PURL = new PURL(source.PURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PURL.", this.PURL);

    }
}

