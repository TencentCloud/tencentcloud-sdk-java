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

public class SpanStatusConfig extends AbstractModel {

    /**
    * <p>标记为错误规则组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MarkAsError")
    @Expose
    private ErrorSpanConf MarkAsError;

    /**
    * <p>标记为正常规则组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MarkAsOk")
    @Expose
    private ErrorSpanConf MarkAsOk;

    /**
     * Get <p>标记为错误规则组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MarkAsError <p>标记为错误规则组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorSpanConf getMarkAsError() {
        return this.MarkAsError;
    }

    /**
     * Set <p>标记为错误规则组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MarkAsError <p>标记为错误规则组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMarkAsError(ErrorSpanConf MarkAsError) {
        this.MarkAsError = MarkAsError;
    }

    /**
     * Get <p>标记为正常规则组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MarkAsOk <p>标记为正常规则组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorSpanConf getMarkAsOk() {
        return this.MarkAsOk;
    }

    /**
     * Set <p>标记为正常规则组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MarkAsOk <p>标记为正常规则组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMarkAsOk(ErrorSpanConf MarkAsOk) {
        this.MarkAsOk = MarkAsOk;
    }

    public SpanStatusConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpanStatusConfig(SpanStatusConfig source) {
        if (source.MarkAsError != null) {
            this.MarkAsError = new ErrorSpanConf(source.MarkAsError);
        }
        if (source.MarkAsOk != null) {
            this.MarkAsOk = new ErrorSpanConf(source.MarkAsOk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MarkAsError.", this.MarkAsError);
        this.setParamObj(map, prefix + "MarkAsOk.", this.MarkAsOk);

    }
}

