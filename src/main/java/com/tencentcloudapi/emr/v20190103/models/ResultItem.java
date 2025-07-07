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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResultItem extends AbstractModel {

    /**
    * 此处为用户组名
    */
    @SerializedName("Item")
    @Expose
    private String Item;

    /**
    * 创建用户组是否成功
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * 若是创建失败, 提供失败原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 此处为用户组名 
     * @return Item 此处为用户组名
     */
    public String getItem() {
        return this.Item;
    }

    /**
     * Set 此处为用户组名
     * @param Item 此处为用户组名
     */
    public void setItem(String Item) {
        this.Item = Item;
    }

    /**
     * Get 创建用户组是否成功 
     * @return Result 创建用户组是否成功
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set 创建用户组是否成功
     * @param Result 创建用户组是否成功
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get 若是创建失败, 提供失败原因 
     * @return Reason 若是创建失败, 提供失败原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 若是创建失败, 提供失败原因
     * @param Reason 若是创建失败, 提供失败原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public ResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResultItem(ResultItem source) {
        if (source.Item != null) {
            this.Item = new String(source.Item);
        }
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Item", this.Item);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

