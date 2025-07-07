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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerInvokeCondition extends AbstractModel {

    /**
    * 触发方式
    */
    @SerializedName("InvokeMethod")
    @Expose
    private String InvokeMethod;

    /**
    * 触发表达式
    */
    @SerializedName("InvokeExpr")
    @Expose
    private String InvokeExpr;

    /**
     * Get 触发方式 
     * @return InvokeMethod 触发方式
     */
    public String getInvokeMethod() {
        return this.InvokeMethod;
    }

    /**
     * Set 触发方式
     * @param InvokeMethod 触发方式
     */
    public void setInvokeMethod(String InvokeMethod) {
        this.InvokeMethod = InvokeMethod;
    }

    /**
     * Get 触发表达式 
     * @return InvokeExpr 触发表达式
     */
    public String getInvokeExpr() {
        return this.InvokeExpr;
    }

    /**
     * Set 触发表达式
     * @param InvokeExpr 触发表达式
     */
    public void setInvokeExpr(String InvokeExpr) {
        this.InvokeExpr = InvokeExpr;
    }

    public TriggerInvokeCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerInvokeCondition(TriggerInvokeCondition source) {
        if (source.InvokeMethod != null) {
            this.InvokeMethod = new String(source.InvokeMethod);
        }
        if (source.InvokeExpr != null) {
            this.InvokeExpr = new String(source.InvokeExpr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvokeMethod", this.InvokeMethod);
        this.setParamSimple(map, prefix + "InvokeExpr", this.InvokeExpr);

    }
}

