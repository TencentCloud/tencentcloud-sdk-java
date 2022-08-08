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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperateResult extends AbstractModel{

    /**
    * 操作结果；true表示成功；false表示失败
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * 错误编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorId")
    @Expose
    private String ErrorId;

    /**
    * 操作信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorDesc")
    @Expose
    private String ErrorDesc;

    /**
     * Get 操作结果；true表示成功；false表示失败 
     * @return Result 操作结果；true表示成功；false表示失败
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set 操作结果；true表示成功；false表示失败
     * @param Result 操作结果；true表示成功；false表示失败
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get 错误编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorId 错误编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorId() {
        return this.ErrorId;
    }

    /**
     * Set 错误编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorId 错误编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorId(String ErrorId) {
        this.ErrorId = ErrorId;
    }

    /**
     * Get 操作信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorDesc 操作信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorDesc() {
        return this.ErrorDesc;
    }

    /**
     * Set 操作信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorDesc 操作信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorDesc(String ErrorDesc) {
        this.ErrorDesc = ErrorDesc;
    }

    public OperateResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateResult(OperateResult source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.ErrorId != null) {
            this.ErrorId = new String(source.ErrorId);
        }
        if (source.ErrorDesc != null) {
            this.ErrorDesc = new String(source.ErrorDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ErrorId", this.ErrorId);
        this.setParamSimple(map, prefix + "ErrorDesc", this.ErrorDesc);

    }
}

