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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBotUCBRuleRsp extends AbstractModel {

    /**
    * 规则列表
    */
    @SerializedName("Res")
    @Expose
    private InOutputBotUCBRule [] Res;

    /**
    * 规则总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 规则列表 
     * @return Res 规则列表
     */
    public InOutputBotUCBRule [] getRes() {
        return this.Res;
    }

    /**
     * Set 规则列表
     * @param Res 规则列表
     */
    public void setRes(InOutputBotUCBRule [] Res) {
        this.Res = Res;
    }

    /**
     * Get 规则总数 
     * @return TotalCount 规则总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 规则总数
     * @param TotalCount 规则总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public DescribeBotUCBRuleRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBotUCBRuleRsp(DescribeBotUCBRuleRsp source) {
        if (source.Res != null) {
            this.Res = new InOutputBotUCBRule[source.Res.length];
            for (int i = 0; i < source.Res.length; i++) {
                this.Res[i] = new InOutputBotUCBRule(source.Res[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Res.", this.Res);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

