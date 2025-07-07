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

public class DeleteIdsWhiteRuleRequest extends AbstractModel {

    /**
    * 入侵防御白名单id
参考DescribeIdsWhiteRule接口返回的Id字段
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get 入侵防御白名单id
参考DescribeIdsWhiteRule接口返回的Id字段 
     * @return Id 入侵防御白名单id
参考DescribeIdsWhiteRule接口返回的Id字段
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 入侵防御白名单id
参考DescribeIdsWhiteRule接口返回的Id字段
     * @param Id 入侵防御白名单id
参考DescribeIdsWhiteRule接口返回的Id字段
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public DeleteIdsWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteIdsWhiteRuleRequest(DeleteIdsWhiteRuleRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

