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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResponseHeader extends AbstractModel {

    /**
    * 自定义响应头配置开关，取值有：
on：开启
off：关闭
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 自定义响应头规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeaderRules")
    @Expose
    private HttpHeaderPathRule [] HeaderRules;

    /**
     * Get 自定义响应头配置开关，取值有：
on：开启
off：关闭 
     * @return Switch 自定义响应头配置开关，取值有：
on：开启
off：关闭
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 自定义响应头配置开关，取值有：
on：开启
off：关闭
     * @param Switch 自定义响应头配置开关，取值有：
on：开启
off：关闭
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 自定义响应头规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeaderRules 自定义响应头规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HttpHeaderPathRule [] getHeaderRules() {
        return this.HeaderRules;
    }

    /**
     * Set 自定义响应头规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeaderRules 自定义响应头规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaderRules(HttpHeaderPathRule [] HeaderRules) {
        this.HeaderRules = HeaderRules;
    }

    public ResponseHeader() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResponseHeader(ResponseHeader source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.HeaderRules != null) {
            this.HeaderRules = new HttpHeaderPathRule[source.HeaderRules.length];
            for (int i = 0; i < source.HeaderRules.length; i++) {
                this.HeaderRules[i] = new HttpHeaderPathRule(source.HeaderRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "HeaderRules.", this.HeaderRules);

    }
}

