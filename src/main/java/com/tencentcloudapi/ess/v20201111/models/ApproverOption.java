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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApproverOption extends AbstractModel{

    /**
    * 是否可以拒签 false-可以拒签,默认 true-不可以拒签
    */
    @SerializedName("NoRefuse")
    @Expose
    private Boolean NoRefuse;

    /**
    * 是否可以转发 false-可以转发,默认 true-不可以转发
    */
    @SerializedName("NoTransfer")
    @Expose
    private Boolean NoTransfer;

    /**
     * Get 是否可以拒签 false-可以拒签,默认 true-不可以拒签 
     * @return NoRefuse 是否可以拒签 false-可以拒签,默认 true-不可以拒签
     */
    public Boolean getNoRefuse() {
        return this.NoRefuse;
    }

    /**
     * Set 是否可以拒签 false-可以拒签,默认 true-不可以拒签
     * @param NoRefuse 是否可以拒签 false-可以拒签,默认 true-不可以拒签
     */
    public void setNoRefuse(Boolean NoRefuse) {
        this.NoRefuse = NoRefuse;
    }

    /**
     * Get 是否可以转发 false-可以转发,默认 true-不可以转发 
     * @return NoTransfer 是否可以转发 false-可以转发,默认 true-不可以转发
     */
    public Boolean getNoTransfer() {
        return this.NoTransfer;
    }

    /**
     * Set 是否可以转发 false-可以转发,默认 true-不可以转发
     * @param NoTransfer 是否可以转发 false-可以转发,默认 true-不可以转发
     */
    public void setNoTransfer(Boolean NoTransfer) {
        this.NoTransfer = NoTransfer;
    }

    public ApproverOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApproverOption(ApproverOption source) {
        if (source.NoRefuse != null) {
            this.NoRefuse = new Boolean(source.NoRefuse);
        }
        if (source.NoTransfer != null) {
            this.NoTransfer = new Boolean(source.NoTransfer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoRefuse", this.NoRefuse);
        this.setParamSimple(map, prefix + "NoTransfer", this.NoTransfer);

    }
}

