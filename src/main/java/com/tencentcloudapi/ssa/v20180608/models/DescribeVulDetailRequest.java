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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulDetailRequest extends AbstractModel{

    /**
    * 漏洞唯一标识符
    */
    @SerializedName("UniqId")
    @Expose
    private String UniqId;

    /**
    * 查看详情来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
     * Get 漏洞唯一标识符 
     * @return UniqId 漏洞唯一标识符
     */
    public String getUniqId() {
        return this.UniqId;
    }

    /**
     * Set 漏洞唯一标识符
     * @param UniqId 漏洞唯一标识符
     */
    public void setUniqId(String UniqId) {
        this.UniqId = UniqId;
    }

    /**
     * Get 查看详情来源 
     * @return Source 查看详情来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 查看详情来源
     * @param Source 查看详情来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    public DescribeVulDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulDetailRequest(DescribeVulDetailRequest source) {
        if (source.UniqId != null) {
            this.UniqId = new String(source.UniqId);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqId", this.UniqId);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

