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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindVirtualAccountData extends AbstractModel {

    /**
    * <p>绑定失败明细（含失败原因）</p>
    */
    @SerializedName("FailItems")
    @Expose
    private BindVirtualAccountResultData [] FailItems;

    /**
    * <p>绑定成功明细（含幂等场景：已存在绑定的账号也归入成功）</p>
    */
    @SerializedName("SuccessItems")
    @Expose
    private BindVirtualAccountResultData [] SuccessItems;

    /**
     * Get <p>绑定失败明细（含失败原因）</p> 
     * @return FailItems <p>绑定失败明细（含失败原因）</p>
     */
    public BindVirtualAccountResultData [] getFailItems() {
        return this.FailItems;
    }

    /**
     * Set <p>绑定失败明细（含失败原因）</p>
     * @param FailItems <p>绑定失败明细（含失败原因）</p>
     */
    public void setFailItems(BindVirtualAccountResultData [] FailItems) {
        this.FailItems = FailItems;
    }

    /**
     * Get <p>绑定成功明细（含幂等场景：已存在绑定的账号也归入成功）</p> 
     * @return SuccessItems <p>绑定成功明细（含幂等场景：已存在绑定的账号也归入成功）</p>
     */
    public BindVirtualAccountResultData [] getSuccessItems() {
        return this.SuccessItems;
    }

    /**
     * Set <p>绑定成功明细（含幂等场景：已存在绑定的账号也归入成功）</p>
     * @param SuccessItems <p>绑定成功明细（含幂等场景：已存在绑定的账号也归入成功）</p>
     */
    public void setSuccessItems(BindVirtualAccountResultData [] SuccessItems) {
        this.SuccessItems = SuccessItems;
    }

    public BindVirtualAccountData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindVirtualAccountData(BindVirtualAccountData source) {
        if (source.FailItems != null) {
            this.FailItems = new BindVirtualAccountResultData[source.FailItems.length];
            for (int i = 0; i < source.FailItems.length; i++) {
                this.FailItems[i] = new BindVirtualAccountResultData(source.FailItems[i]);
            }
        }
        if (source.SuccessItems != null) {
            this.SuccessItems = new BindVirtualAccountResultData[source.SuccessItems.length];
            for (int i = 0; i < source.SuccessItems.length; i++) {
                this.SuccessItems[i] = new BindVirtualAccountResultData(source.SuccessItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FailItems.", this.FailItems);
        this.setParamArrayObj(map, prefix + "SuccessItems.", this.SuccessItems);

    }
}

