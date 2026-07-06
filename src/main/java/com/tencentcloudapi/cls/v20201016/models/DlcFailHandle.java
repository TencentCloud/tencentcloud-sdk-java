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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DlcFailHandle extends AbstractModel {

    /**
    * <p>是否存储到DLC</p><p>默认值：false</p><p>用于控制是否开启投递失败的日志存储至DLC表</p>
    */
    @SerializedName("StoreToDlc")
    @Expose
    private Boolean StoreToDlc;

    /**
    * <p>DLC表信息</p>
    */
    @SerializedName("DlcFailTableInfo")
    @Expose
    private DlcFailTableInfo DlcFailTableInfo;

    /**
     * Get <p>是否存储到DLC</p><p>默认值：false</p><p>用于控制是否开启投递失败的日志存储至DLC表</p> 
     * @return StoreToDlc <p>是否存储到DLC</p><p>默认值：false</p><p>用于控制是否开启投递失败的日志存储至DLC表</p>
     */
    public Boolean getStoreToDlc() {
        return this.StoreToDlc;
    }

    /**
     * Set <p>是否存储到DLC</p><p>默认值：false</p><p>用于控制是否开启投递失败的日志存储至DLC表</p>
     * @param StoreToDlc <p>是否存储到DLC</p><p>默认值：false</p><p>用于控制是否开启投递失败的日志存储至DLC表</p>
     */
    public void setStoreToDlc(Boolean StoreToDlc) {
        this.StoreToDlc = StoreToDlc;
    }

    /**
     * Get <p>DLC表信息</p> 
     * @return DlcFailTableInfo <p>DLC表信息</p>
     */
    public DlcFailTableInfo getDlcFailTableInfo() {
        return this.DlcFailTableInfo;
    }

    /**
     * Set <p>DLC表信息</p>
     * @param DlcFailTableInfo <p>DLC表信息</p>
     */
    public void setDlcFailTableInfo(DlcFailTableInfo DlcFailTableInfo) {
        this.DlcFailTableInfo = DlcFailTableInfo;
    }

    public DlcFailHandle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcFailHandle(DlcFailHandle source) {
        if (source.StoreToDlc != null) {
            this.StoreToDlc = new Boolean(source.StoreToDlc);
        }
        if (source.DlcFailTableInfo != null) {
            this.DlcFailTableInfo = new DlcFailTableInfo(source.DlcFailTableInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StoreToDlc", this.StoreToDlc);
        this.setParamObj(map, prefix + "DlcFailTableInfo.", this.DlcFailTableInfo);

    }
}

