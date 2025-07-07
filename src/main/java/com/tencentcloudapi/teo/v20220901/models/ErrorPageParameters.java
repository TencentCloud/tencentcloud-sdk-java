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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorPageParameters extends AbstractModel {

    /**
    * 自定义错误页面配置列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorPageParams")
    @Expose
    private ErrorPage [] ErrorPageParams;

    /**
     * Get 自定义错误页面配置列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorPageParams 自定义错误页面配置列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorPage [] getErrorPageParams() {
        return this.ErrorPageParams;
    }

    /**
     * Set 自定义错误页面配置列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorPageParams 自定义错误页面配置列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorPageParams(ErrorPage [] ErrorPageParams) {
        this.ErrorPageParams = ErrorPageParams;
    }

    public ErrorPageParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorPageParameters(ErrorPageParameters source) {
        if (source.ErrorPageParams != null) {
            this.ErrorPageParams = new ErrorPage[source.ErrorPageParams.length];
            for (int i = 0; i < source.ErrorPageParams.length; i++) {
                this.ErrorPageParams[i] = new ErrorPage(source.ErrorPageParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ErrorPageParams.", this.ErrorPageParams);

    }
}

