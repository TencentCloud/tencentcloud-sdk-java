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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorSpanConf extends AbstractModel {

    /**
    * <p>错误类型匹配规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorObjectPatterns")
    @Expose
    private String [] ErrorObjectPatterns;

    /**
    * <p>错误码匹配规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCodes")
    @Expose
    private String [] ErrorCodes;

    /**
     * Get <p>错误类型匹配规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorObjectPatterns <p>错误类型匹配规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getErrorObjectPatterns() {
        return this.ErrorObjectPatterns;
    }

    /**
     * Set <p>错误类型匹配规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorObjectPatterns <p>错误类型匹配规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorObjectPatterns(String [] ErrorObjectPatterns) {
        this.ErrorObjectPatterns = ErrorObjectPatterns;
    }

    /**
     * Get <p>错误码匹配规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCodes <p>错误码匹配规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getErrorCodes() {
        return this.ErrorCodes;
    }

    /**
     * Set <p>错误码匹配规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCodes <p>错误码匹配规则列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCodes(String [] ErrorCodes) {
        this.ErrorCodes = ErrorCodes;
    }

    public ErrorSpanConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorSpanConf(ErrorSpanConf source) {
        if (source.ErrorObjectPatterns != null) {
            this.ErrorObjectPatterns = new String[source.ErrorObjectPatterns.length];
            for (int i = 0; i < source.ErrorObjectPatterns.length; i++) {
                this.ErrorObjectPatterns[i] = new String(source.ErrorObjectPatterns[i]);
            }
        }
        if (source.ErrorCodes != null) {
            this.ErrorCodes = new String[source.ErrorCodes.length];
            for (int i = 0; i < source.ErrorCodes.length; i++) {
                this.ErrorCodes[i] = new String(source.ErrorCodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ErrorObjectPatterns.", this.ErrorObjectPatterns);
        this.setParamArraySimple(map, prefix + "ErrorCodes.", this.ErrorCodes);

    }
}

