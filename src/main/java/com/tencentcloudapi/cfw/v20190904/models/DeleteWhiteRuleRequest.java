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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteWhiteRuleRequest extends AbstractModel {

    /**
    * JSON string 数组，至少一项；元素取自 DescribeWhiteRule.Data[].WhiteId，可批量。
    */
    @SerializedName("WhiteIdList")
    @Expose
    private String [] WhiteIdList;

    /**
     * Get JSON string 数组，至少一项；元素取自 DescribeWhiteRule.Data[].WhiteId，可批量。 
     * @return WhiteIdList JSON string 数组，至少一项；元素取自 DescribeWhiteRule.Data[].WhiteId，可批量。
     */
    public String [] getWhiteIdList() {
        return this.WhiteIdList;
    }

    /**
     * Set JSON string 数组，至少一项；元素取自 DescribeWhiteRule.Data[].WhiteId，可批量。
     * @param WhiteIdList JSON string 数组，至少一项；元素取自 DescribeWhiteRule.Data[].WhiteId，可批量。
     */
    public void setWhiteIdList(String [] WhiteIdList) {
        this.WhiteIdList = WhiteIdList;
    }

    public DeleteWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteWhiteRuleRequest(DeleteWhiteRuleRequest source) {
        if (source.WhiteIdList != null) {
            this.WhiteIdList = new String[source.WhiteIdList.length];
            for (int i = 0; i < source.WhiteIdList.length; i++) {
                this.WhiteIdList[i] = new String(source.WhiteIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WhiteIdList.", this.WhiteIdList);

    }
}

