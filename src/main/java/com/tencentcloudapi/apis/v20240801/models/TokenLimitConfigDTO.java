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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenLimitConfigDTO extends AbstractModel {

    /**
    * 单次请求上限，k
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LimitRequestBody")
    @Expose
    private Long LimitRequestBody;

    /**
    * 累次token总量消耗上限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LimitWindows")
    @Expose
    private LimitWindowsDTO [] LimitWindows;

    /**
     * Get 单次请求上限，k
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LimitRequestBody 单次请求上限，k
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLimitRequestBody() {
        return this.LimitRequestBody;
    }

    /**
     * Set 单次请求上限，k
注意：此字段可能返回 null，表示取不到有效值。
     * @param LimitRequestBody 单次请求上限，k
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimitRequestBody(Long LimitRequestBody) {
        this.LimitRequestBody = LimitRequestBody;
    }

    /**
     * Get 累次token总量消耗上限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LimitWindows 累次token总量消耗上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LimitWindowsDTO [] getLimitWindows() {
        return this.LimitWindows;
    }

    /**
     * Set 累次token总量消耗上限
注意：此字段可能返回 null，表示取不到有效值。
     * @param LimitWindows 累次token总量消耗上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimitWindows(LimitWindowsDTO [] LimitWindows) {
        this.LimitWindows = LimitWindows;
    }

    public TokenLimitConfigDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenLimitConfigDTO(TokenLimitConfigDTO source) {
        if (source.LimitRequestBody != null) {
            this.LimitRequestBody = new Long(source.LimitRequestBody);
        }
        if (source.LimitWindows != null) {
            this.LimitWindows = new LimitWindowsDTO[source.LimitWindows.length];
            for (int i = 0; i < source.LimitWindows.length; i++) {
                this.LimitWindows[i] = new LimitWindowsDTO(source.LimitWindows[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LimitRequestBody", this.LimitRequestBody);
        this.setParamArrayObj(map, prefix + "LimitWindows.", this.LimitWindows);

    }
}

