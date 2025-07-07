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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeObjectTypeListRequest extends AbstractModel {

    /**
    * 所支持的对象
0：全平台产品
1：平台接入的对象
2：应用所支持的部分对象
    */
    @SerializedName("SupportType")
    @Expose
    private Long SupportType;

    /**
     * Get 所支持的对象
0：全平台产品
1：平台接入的对象
2：应用所支持的部分对象 
     * @return SupportType 所支持的对象
0：全平台产品
1：平台接入的对象
2：应用所支持的部分对象
     */
    public Long getSupportType() {
        return this.SupportType;
    }

    /**
     * Set 所支持的对象
0：全平台产品
1：平台接入的对象
2：应用所支持的部分对象
     * @param SupportType 所支持的对象
0：全平台产品
1：平台接入的对象
2：应用所支持的部分对象
     */
    public void setSupportType(Long SupportType) {
        this.SupportType = SupportType;
    }

    public DescribeObjectTypeListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeObjectTypeListRequest(DescribeObjectTypeListRequest source) {
        if (source.SupportType != null) {
            this.SupportType = new Long(source.SupportType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SupportType", this.SupportType);

    }
}

